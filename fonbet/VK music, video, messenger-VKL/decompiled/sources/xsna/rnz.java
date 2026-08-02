package xsna;

import com.unity3d.services.UnityAdsConstants;

/* compiled from: LiveVideoStateBase.kt */
/* loaded from: classes3.dex */
public interface rnz {
    default long a() {
        return 0L;
    }

    default boolean c() {
        return false;
    }

    default float getVolume() {
        return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    }

    default void D() {
    }

    default void b() {
    }

    default void d() {
    }

    default void setVolume(float f) {
    }
}
