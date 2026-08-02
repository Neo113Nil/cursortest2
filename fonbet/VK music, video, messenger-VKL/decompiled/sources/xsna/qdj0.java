package xsna;

import android.view.animation.Interpolator;
import com.unity3d.services.UnityAdsConstants;

/* compiled from: ShimmerInterpolator.kt */
/* loaded from: classes16.dex */
public final class qdj0 implements Interpolator {
    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f) {
        float f2 = 9000L;
        float f3 = 2500L;
        if (f <= (f2 - f3) / f2) {
            return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        }
        float f4 = f2 / f3;
        float f5 = 1;
        return u11.b(f, f5, f4, f5);
    }
}
