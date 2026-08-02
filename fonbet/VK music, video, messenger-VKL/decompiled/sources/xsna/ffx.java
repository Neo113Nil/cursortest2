package xsna;

import android.view.animation.PathInterpolator;
import com.unity3d.services.UnityAdsConstants;

/* compiled from: interpolators.kt */
/* loaded from: classes16.dex */
public final class ffx extends PathInterpolator {
    public ffx() {
        super(0.7f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0.3f, 1.0f);
    }
}
