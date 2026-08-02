package xsna;

import android.graphics.RenderEffect;
import com.unity3d.services.UnityAdsConstants;

/* compiled from: AndroidRenderEffect.android.kt */
/* loaded from: classes11.dex */
public final class qg7 extends gyf0 {
    public final float b;
    public final float c;
    public final int d;

    public qg7(float f, float f2, int i) {
        this.b = f;
        this.c = f2;
        this.d = i;
    }

    @Override // xsna.gyf0
    public final RenderEffect b() {
        RenderEffect createBlurEffect;
        RenderEffect createOffsetEffect;
        float f = this.b;
        float f2 = this.c;
        if (f == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && f2 == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            createOffsetEffect = RenderEffect.createOffsetEffect(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            return createOffsetEffect;
        }
        createBlurEffect = RenderEffect.createBlurEffect(f, f2, kd2.a(this.d));
        return createBlurEffect;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qg7)) {
            return false;
        }
        qg7 qg7Var = (qg7) obj;
        return this.b == qg7Var.b && this.c == qg7Var.c && this.d == qg7Var.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + io.reactivex.rxjava3.subjects.b.a(this.c, Float.hashCode(this.b) * 31, 31);
    }

    public final String toString() {
        return "BlurEffect(renderEffect=null, radiusX=" + this.b + ", radiusY=" + this.c + ", edgeTreatment=" + ((Object) fto0.v(this.d)) + ')';
    }
}
