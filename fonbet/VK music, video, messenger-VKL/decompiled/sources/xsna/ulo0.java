package xsna;

import com.unity3d.services.UnityAdsConstants;

/* compiled from: TextSpacing.kt */
/* loaded from: classes4.dex */
public final class ulo0 {
    public final float a;

    public ulo0() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ulo0) && Float.compare(this.a, ((ulo0) obj).a) == 0 && Float.compare(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) + (Float.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "TextSpacing(multiplier=" + this.a + ", add=0.0)";
    }

    public ulo0(int i) {
        this.a = 1.0f;
    }
}
