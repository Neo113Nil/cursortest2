package xsna;

import com.unity3d.services.UnityAdsConstants;

/* compiled from: MidAdPoint.kt */
/* loaded from: classes3.dex */
public final class ml20 {
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ml20)) {
            return false;
        }
        ((ml20) obj).getClass();
        return Float.compare(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) == 0;
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + (Float.hashCode(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) * 31);
    }

    public final String toString() {
        return "MidAdPoint(positionSec=0.0, isWasShowed=true)";
    }
}
