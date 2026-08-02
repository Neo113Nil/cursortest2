package xsna;

import android.view.View;
import android.view.ViewPropertyAnimator;
import com.unity3d.services.UnityAdsConstants;

/* compiled from: ViewExt.kt */
/* loaded from: classes4.dex */
public final class bxt0 {
    public static ViewPropertyAnimator a(View view, long j) {
        if (view == null) {
            return null;
        }
        view.setVisibility(0);
        view.setAlpha(1.0f);
        ViewPropertyAnimator animate = view.animate();
        animate.cancel();
        animate.setListener(new hwt0(view));
        animate.alpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT).setDuration(j).setStartDelay(0L);
        return animate;
    }
}
