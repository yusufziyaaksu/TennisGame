import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;


public class Barrier3 {
	private static final int Y = 300;
	
	private static final int WIDTH = 300;
	private static final int HEIGHT = 20;
	int x = 100;
	int xa = 0;
	
	private Game game;

	public Barrier3(Game game) {
		this.game = game;
	}



	public void paint(Graphics2D g) {
		g.setColor(Color.blue);
		g.fillRect(x, Y, WIDTH, HEIGHT);
	}




	

	

	public Rectangle getBounds() {
		return new Rectangle(x, Y, WIDTH, HEIGHT);
	}

	public int getTopY() {
		return Y;
	}
	public int getBotX() {
		return x;
	}

}
