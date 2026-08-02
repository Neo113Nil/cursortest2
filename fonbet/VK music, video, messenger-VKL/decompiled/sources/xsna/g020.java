package xsna;

import android.graphics.Matrix;
import android.graphics.RectF;
import com.unity3d.services.UnityAdsConstants;

/* compiled from: MediaTransformations.kt */
/* loaded from: classes4.dex */
public final class g020 {
    public final Matrix a;
    public final Matrix b;
    public final boolean c;
    public final RectF d;

    public g020() {
        this(false, 15);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g020)) {
            return false;
        }
        g020 g020Var = (g020) obj;
        return epx.f(this.a, g020Var.a) && epx.f(this.b, g020Var.b) && this.c == g020Var.c && epx.f(this.d, g020Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + qoy.b((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c);
    }

    public final String toString() {
        return "MediaTransformations(mediaMatrix=" + this.a + ", viewMatrix=" + this.b + ", isMirrored=" + this.c + ", viewVisibleRect=" + this.d + ")";
    }

    public g020(boolean z, int i) {
        Matrix matrix = new Matrix();
        Matrix matrix2 = new Matrix();
        z = (i & 4) != 0 ? false : z;
        RectF rectF = new RectF(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        this.a = matrix;
        this.b = matrix2;
        this.c = z;
        this.d = rectF;
    }
}
