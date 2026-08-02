package yads;

import android.view.Surface;
import com.unity3d.services.UnityAdsConstants;

/* loaded from: classes10.dex */
public abstract class si3 {
    public static void a(Surface surface, float f) {
        try {
            surface.setFrameRate(f, f == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : 1);
        } catch (IllegalStateException e) {
            ji1.b("VideoFrameReleaseHelper", ji1.a("Failed to call Surface.setFrameRate", e));
        }
    }
}
