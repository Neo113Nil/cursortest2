package xsna;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import com.facebook.imagepipeline.nativecode.NativeBlurFilter;
import com.unity3d.services.UnityAdsConstants;

/* compiled from: BlurTransform.java */
/* loaded from: classes2.dex */
public final class hh7 extends mk6 {
    public final int c;
    public final int d;

    public hh7(int i, int i2) {
        this(i);
        this.d = i2;
    }

    @Override // xsna.mk6, xsna.ktc0
    public final ww8 a() {
        return new ppj0("BlurTransform");
    }

    @Override // xsna.mk6, xsna.ktc0
    public final uvf<Bitmap> b(Bitmap bitmap, hta0 hta0Var) {
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        hta0Var.getClass();
        uvf<Bitmap> c = hta0Var.c(width, height, Bitmap.Config.ARGB_8888);
        try {
            try {
                Bitmap r = c.r();
                fkw.a(bitmap, r);
                NativeBlurFilter.iterativeBoxBlur(r, 3, this.c);
                Canvas canvas = new Canvas(r);
                Paint paint = new Paint();
                paint.setColor(this.d);
                canvas.drawRect(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, canvas.getWidth(), canvas.getHeight(), paint);
                uvf<Bitmap> n = c.n();
                c.close();
                return n;
            } catch (UnsatisfiedLinkError unused) {
                c.close();
                uvf<Bitmap> a = hta0Var.a(bitmap);
                uvf<Bitmap> n2 = a.n();
                a.close();
                return n2;
            }
        } catch (Throwable th) {
            c.close();
            throw th;
        }
    }

    @Override // xsna.mk6, xsna.ktc0
    public final String getName() {
        return "BlurTransform";
    }

    public hh7(int i) {
        this.d = -1275068416;
        this.c = i;
    }
}
