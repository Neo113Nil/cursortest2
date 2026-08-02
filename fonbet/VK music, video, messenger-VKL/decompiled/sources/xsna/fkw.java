package xsna;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;

/* compiled from: ImageLoaderUtils.java */
/* loaded from: classes2.dex */
public final class fkw {
    public static final Paint a;
    public static final a b;
    public static final b c;

    /* compiled from: ImageLoaderUtils.java */
    public class a extends ThreadLocal<Rect> {
        @Override // java.lang.ThreadLocal
        public final Rect get() {
            Rect rect = (Rect) super.get();
            rect.set(0, 0, 0, 0);
            return rect;
        }

        @Override // java.lang.ThreadLocal
        public final Rect initialValue() {
            return new Rect();
        }
    }

    /* compiled from: ImageLoaderUtils.java */
    public class b extends ThreadLocal<Rect> {
        @Override // java.lang.ThreadLocal
        public final Rect get() {
            Rect rect = (Rect) super.get();
            rect.set(0, 0, 0, 0);
            return rect;
        }

        @Override // java.lang.ThreadLocal
        public final Rect initialValue() {
            return new Rect();
        }
    }

    static {
        Paint paint = new Paint();
        a = paint;
        paint.setAntiAlias(true);
        paint.setDither(true);
        paint.setFilterBitmap(true);
        b = new a();
        c = new b();
    }

    public static void a(Bitmap bitmap, Bitmap bitmap2) {
        Rect rect = (Rect) b.get();
        rect.set(0, 0, bitmap.getWidth(), bitmap.getHeight());
        Rect rect2 = (Rect) c.get();
        rect2.set(0, 0, bitmap2.getWidth(), bitmap2.getHeight());
        new Canvas(bitmap2).drawBitmap(bitmap, rect, rect2, a);
    }

    public static Bitmap b(Bitmap bitmap) {
        if (bitmap == null) {
            return null;
        }
        int min = Math.min(bitmap.getWidth(), bitmap.getHeight());
        if (bitmap.getWidth() == bitmap.getHeight()) {
            Bitmap createBitmap = Bitmap.createBitmap(min, min, bitmap.getConfig());
            Canvas canvas = new Canvas(createBitmap);
            Paint paint = new Paint();
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            paint.setShader(new BitmapShader(bitmap, tileMode, tileMode));
            paint.setAntiAlias(true);
            float f = min / 2.0f;
            canvas.drawCircle(f, f, f, paint);
            return createBitmap;
        }
        Bitmap createBitmap2 = Bitmap.createBitmap(bitmap, (bitmap.getWidth() - min) / 2, (bitmap.getHeight() - min) / 2, min, min);
        Bitmap createBitmap3 = Bitmap.createBitmap(min, min, bitmap.getConfig());
        Canvas canvas2 = new Canvas(createBitmap3);
        Paint paint2 = new Paint();
        Shader.TileMode tileMode2 = Shader.TileMode.CLAMP;
        paint2.setShader(new BitmapShader(createBitmap2, tileMode2, tileMode2));
        paint2.setAntiAlias(true);
        float f2 = min / 2.0f;
        canvas2.drawCircle(f2, f2, f2, paint2);
        createBitmap2.recycle();
        return createBitmap3;
    }

    public static Bitmap c(int i, Bitmap bitmap) {
        if (bitmap == null) {
            return null;
        }
        Bitmap createBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), bitmap.getConfig());
        Canvas canvas = new Canvas(createBitmap);
        Paint paint = new Paint(1);
        Rect rect = new Rect(0, 0, bitmap.getWidth(), bitmap.getHeight());
        RectF rectF = new RectF(rect);
        paint.setColor(-1);
        paint.setStyle(Paint.Style.FILL);
        canvas.drawARGB(0, 0, 0, 0);
        float f = i;
        canvas.drawRoundRect(rectF, f, f, paint);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        canvas.drawBitmap(bitmap, rect, rect, paint);
        return createBitmap;
    }
}
