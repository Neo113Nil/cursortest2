package defpackage;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;

/* loaded from: classes7.dex */
public final class ip81 implements cd81 {
    public final nj81 a;
    public final xp81 b;

    public ip81() {
        nj81 nj81Var = new nj81();
        xp81 xp81Var = new xp81();
        this.a = nj81Var;
        this.b = xp81Var;
    }

    @Override // defpackage.cd81
    public final boolean a(Drawable drawable, Bitmap bitmap) {
        Bitmap bitmap2;
        if (drawable instanceof BitmapDrawable) {
            BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
            if (bitmapDrawable.getBitmap() != null) {
                bitmap2 = bitmapDrawable.getBitmap();
                this.b.getClass();
                Bitmap createScaledBitmap = Bitmap.createScaledBitmap(bitmap2, 1, 1, true);
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
        this.a.getClass();
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        Bitmap createBitmap = (intrinsicWidth <= 0 || intrinsicHeight <= 0) ? Bitmap.createBitmap(1, 1, Bitmap.Config.ARGB_8888) : Bitmap.createBitmap(intrinsicWidth, intrinsicHeight, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
        drawable.draw(canvas);
        bitmap2 = createBitmap;
        this.b.getClass();
        Bitmap createScaledBitmap3 = Bitmap.createScaledBitmap(bitmap2, 1, 1, true);
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
