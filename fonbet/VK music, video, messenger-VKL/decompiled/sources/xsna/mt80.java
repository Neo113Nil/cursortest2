package xsna;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import com.facebook.imagepipeline.nativecode.NativeBlurFilter;
import com.unity3d.services.UnityAdsConstants;

/* compiled from: OptionalBlurPostprocessor.kt */
/* loaded from: classes15.dex */
public final class mt80 extends mk6 {
    public final boolean c;

    public mt80(boolean z) {
        this.c = z;
    }

    @Override // xsna.mk6, xsna.ktc0
    public final ww8 a() {
        return new ppj0("OptionalBlurPostprocessor-" + this.c);
    }

    @Override // xsna.mk6, xsna.ktc0
    public final uvf<Bitmap> b(Bitmap bitmap, hta0 hta0Var) {
        uvf<Bitmap> c = hta0Var.c(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888);
        try {
            Bitmap r = c.r();
            new Canvas(r).drawBitmap(bitmap, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, (Paint) null);
            if (this.c) {
                NativeBlurFilter.iterativeBoxBlur(r, 5, 60);
            }
            uvf<Bitmap> n = c.n();
            c.close();
            return n;
        } catch (Throwable th) {
            c.close();
            throw th;
        }
    }

    public final String toString() {
        return defpackage.q0.a(new StringBuilder("OptionalBlurPostprocessor(drawBlur="), this.c, ')');
    }
}
