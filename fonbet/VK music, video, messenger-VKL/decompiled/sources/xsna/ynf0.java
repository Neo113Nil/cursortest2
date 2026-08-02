package xsna;

import com.unity3d.services.UnityAdsConstants;

/* compiled from: ReefLocationRequestConfig.kt */
/* loaded from: classes5.dex */
public final class ynf0 {
    public final String a;
    public final long b;

    public ynf0() {
        this(null, 15);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ynf0)) {
            return false;
        }
        ynf0 ynf0Var = (ynf0) obj;
        return epx.f(this.a, ynf0Var.a) && Float.compare(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) == 0 && this.b == ynf0Var.b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + io.reactivex.rxjava3.subjects.b.a(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, bh10.a(this.a.hashCode() * 31, 31, 0L), 31);
    }

    public final String toString() {
        StringBuilder d = rqi.d(this.b, "ReefLocationRequestConfig(provider=", this.a, ", minTimeMillis=0, minDistanceMeters=0.0, numUpdates=");
        d.append(")");
        return d.toString();
    }

    public ynf0(String str, int i) {
        this.a = (i & 1) != 0 ? "network" : str;
        this.b = 1L;
    }
}
