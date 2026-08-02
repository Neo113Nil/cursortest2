package xsna;

import com.unity3d.services.UnityAdsConstants;

/* compiled from: CornerSize.kt */
/* loaded from: classes11.dex */
public final class tv90 implements vuj {
    public final float a;

    public tv90(float f) {
        this.a = f;
        if (f < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || f > 100.0f) {
            xzw.a("The percent should be in the range of [0, 100]");
        }
    }

    @Override // xsna.vuj
    public final float a(long j, azl azlVar) {
        return (this.a / 100.0f) * mxj0.c(j);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof tv90) && Float.compare(this.a, ((tv90) obj).a) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.a);
    }

    public final String toString() {
        return shy.c(this.a, "%)", new StringBuilder("CornerSize(size = "));
    }
}
