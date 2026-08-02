package yads;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;

/* loaded from: classes10.dex */
public final class xj0 implements eq {
    public final pt2 a;
    public final iq b;

    public xj0(pt2 pt2Var, iq iqVar) {
        this.a = pt2Var;
        this.b = iqVar;
    }

    @Override // yads.eq
    public final boolean a(Drawable drawable, Bitmap bitmap) {
        Bitmap createBitmap;
        Bitmap bitmap2;
        if (drawable instanceof BitmapDrawable) {
            BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
            if (bitmapDrawable.getBitmap() != null) {
                bitmap2 = bitmapDrawable.getBitmap();
                this.b.getClass();
                Bitmap createScaledBitmap = Bitmap.createScaledBitmap(bitmap2, 1, 1, true);
                this.b.getClass();
                Bitmap createScaledBitmap2 = Bitmap.createScaledBitmap(bitmap, 1, 1, true);
                int pixel = createScaledBitmap.getPixel(0, 0);
                int alpha = Color.alpha(pixel);
                int red = Color.red(pixel);
                int green = Color.green(pixel);
                int blue = Color.blue(pixel);
                int pixel2 = createScaledBitmap2.getPixel(0, 0);
                return Math.abs(alpha - Color.alpha(pixel2)) <= 20 && Math.abs(red - Color.red(pixel2)) <= 20 && Math.abs(green - Color.green(pixel2)) <= 20 && Math.abs(blue - Color.blue(pixel2)) <= 20;
            }
        }
        pt2 pt2Var = this.a;
        pt2Var.getClass();
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        if (intrinsicWidth <= 0 || intrinsicHeight <= 0) {
            iq iqVar = pt2Var.a;
            Bitmap.Config config = Bitmap.Config.ARGB_8888;
            iqVar.getClass();
            createBitmap = Bitmap.createBitmap(1, 1, config);
        } else {
            iq iqVar2 = pt2Var.a;
            Bitmap.Config config2 = Bitmap.Config.ARGB_8888;
            iqVar2.getClass();
            createBitmap = Bitmap.createBitmap(intrinsicWidth, intrinsicHeight, config2);
        }
        Canvas canvas = new Canvas(createBitmap);
        drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
        drawable.draw(canvas);
        bitmap2 = createBitmap;
        this.b.getClass();
        Bitmap createScaledBitmap3 = Bitmap.createScaledBitmap(bitmap2, 1, 1, true);
        this.b.getClass();
        Bitmap createScaledBitmap22 = Bitmap.createScaledBitmap(bitmap, 1, 1, true);
        int pixel3 = createScaledBitmap3.getPixel(0, 0);
        int alpha2 = Color.alpha(pixel3);
        int red2 = Color.red(pixel3);
        int green2 = Color.green(pixel3);
        int blue2 = Color.blue(pixel3);
        int pixel22 = createScaledBitmap22.getPixel(0, 0);
        if (Math.abs(alpha2 - Color.alpha(pixel22)) <= 20) {
        }
    }
}
