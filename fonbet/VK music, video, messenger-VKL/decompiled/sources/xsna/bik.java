package xsna;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import com.unity3d.services.UnityAdsConstants;

/* compiled from: CropRectPostProcessor.kt */
/* loaded from: classes4.dex */
public final class bik extends mk6 {
    public final wpa c = new wpa();
    public final Paint d = new Paint();
    public final Matrix e = new Matrix();
    public final Rect f = new Rect();

    @Override // xsna.mk6, xsna.ktc0
    public final ww8 a() {
        return new ppj0(this.c + " - " + this.f);
    }

    @Override // xsna.mk6, xsna.ktc0
    public final uvf<Bitmap> b(Bitmap bitmap, hta0 hta0Var) {
        Rect rect = this.f;
        uvf<Bitmap> c = hta0Var.c(rect.width(), rect.height(), Bitmap.Config.ARGB_8888);
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        wpa wpaVar = this.c;
        Matrix matrix = this.e;
        wpaVar.a(matrix, this.f, width, height, 0.5f, 0.5f);
        try {
            new Canvas(c.r()).drawBitmap(bitmap, matrix, this.d);
            return c.n();
        } finally {
            c.close();
        }
    }

    public final void f(int i, int i2) {
        this.f.set(0, 0, i, i2);
    }

    public final void g(float f, float f2, float f3, float f4) {
        wpa wpaVar = this.c;
        wpaVar.getClass();
        wpaVar.a = swe0.f(f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 100.0f);
        wpaVar.b = swe0.f(f2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 100.0f);
        wpaVar.c = swe0.f(f3, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 100.0f);
        wpaVar.d = swe0.f(f4, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 100.0f);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CropRectPostProcessor(scaleType = ");
        sb.append(this.c);
        sb.append(", bounds = ");
        return yq.c(sb, this.f, ')');
    }
}
