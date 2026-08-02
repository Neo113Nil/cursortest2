package xsna;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.Shader;
import com.facebook.imagepipeline.nativecode.NativeBlurFilter;

/* compiled from: PlaylistHeaderBlurPostProcessor.kt */
/* loaded from: classes3.dex */
public final class e9b0 extends mk6 {
    public final Paint c = new Paint(1);
    public final Rect d = new Rect();
    public final Rect e = new Rect();
    public final ppj0 f = new ppj0("PlaylistHeaderBlurPostProcessor");

    @Override // xsna.mk6, xsna.ktc0
    public final ww8 a() {
        return this.f;
    }

    @Override // xsna.mk6, xsna.ktc0
    public final uvf<Bitmap> b(Bitmap bitmap, hta0 hta0Var) {
        Rect rect = this.e;
        Rect rect2 = this.d;
        Paint paint = this.c;
        paint.reset();
        paint.setAntiAlias(true);
        paint.setFilterBitmap(true);
        Paint.Style style = Paint.Style.FILL;
        paint.setStyle(style);
        paint.setShader(null);
        paint.setXfermode(null);
        uvf<Bitmap> a = hta0Var.a(bitmap);
        uvf<Bitmap> c = hta0Var.c(500, 500, Bitmap.Config.ARGB_8888);
        try {
            Bitmap r = a.r();
            NativeBlurFilter.iterativeBoxBlur(r, 2, 200);
            Bitmap r2 = c.r();
            Canvas canvas = new Canvas(r2);
            rect2.set(0, 0, r2.getWidth(), r2.getHeight());
            paint.setShader(new RadialGradient(250.0f, 250.0f, 400.0f, -16777216, n8g.l(-16777216, 128), Shader.TileMode.CLAMP));
            canvas.drawRect(rect2, paint);
            paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
            double d = 2;
            int a2 = an10.a((r.getWidth() - (r.getWidth() / 2.0d)) / d);
            int a3 = an10.a((r.getHeight() - (r.getHeight() / 2.0d)) / d);
            rect.set(a2, a3, r.getWidth() - a2, r.getHeight() - a3);
            canvas.drawBitmap(r, rect, rect2, paint);
            paint.reset();
            paint.setAntiAlias(true);
            paint.setFilterBitmap(true);
            paint.setStyle(style);
            paint.setShader(null);
            paint.setXfermode(null);
            paint.setColor(n8g.l(-16777216, 48));
            canvas.drawRect(rect2, paint);
            return c.n();
        } finally {
            a.close();
            c.close();
        }
    }

    @Override // xsna.mk6, xsna.ktc0
    public final String getName() {
        return "PlaylistHeaderBlurPostProcessor";
    }

    public final String toString() {
        return "PlaylistHeaderBlurPostProcessor";
    }
}
