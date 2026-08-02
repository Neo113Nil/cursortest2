package xsna;

import com.unity3d.services.UnityAdsConstants;

/* compiled from: ShakeConfig.kt */
/* loaded from: classes15.dex */
public final class e5j0 {
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e5j0)) {
            return false;
        }
        ((e5j0) obj).getClass();
        return Float.compare(100000.0f, 100000.0f) == 0 && Float.compare(5.0f, 5.0f) == 0 && Float.compare(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) + io.reactivex.rxjava3.subjects.b.a(5.0f, io.reactivex.rxjava3.subjects.b.a(100000.0f, Integer.hashCode(4) * 31, 31), 31);
    }

    public final String toString() {
        return "ShakeConfig(iterations=4, intensity=100000.0, translateX=5.0, translateY=0.0)";
    }
}
