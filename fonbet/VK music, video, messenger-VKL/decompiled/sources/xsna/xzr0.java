package xsna;

import android.animation.ValueAnimator;
import com.unity3d.services.UnityAdsConstants;
import one.video.ad.ux.AdRedirectView;

/* compiled from: VideoAdViewExt.kt */
/* loaded from: classes18.dex */
public final class xzr0 {
    public static final xzr0 a = new xzr0();

    public static void a(xzr0 xzr0Var, AdRedirectView adRedirectView, int i, int i2) {
        ValueAnimator ofInt = ValueAnimator.ofInt(i, i2);
        ofInt.addUpdateListener(new ve6(adRedirectView, 2));
        ofInt.setDuration(300L);
        ofInt.start();
    }

    public final void b(AdRedirectView adRedirectView) {
        if (!bwt0.K(adRedirectView)) {
            f4m.j(adRedirectView);
        } else {
            d3m.e(adRedirectView, (r15 & 1) != 0 ? 300L : 0L, (r15 & 2) != 0 ? 0L : 0L, (r15 & 4) != 0 ? null : null, (r15 & 8) == 0 ? null : null, (r15 & 16) != 0 ? false : false);
            a(this, adRedirectView, adRedirectView.getHeight(), 0);
        }
    }

    public final void c(AdRedirectView adRedirectView, int i) {
        if (!f4m.f(adRedirectView)) {
            adRedirectView.setVisibility(0);
        } else {
            d3m.c(adRedirectView, (r15 & 1) != 0 ? 300L : 0L, (r15 & 2) != 0 ? 0L : 0L, (r15 & 4) != 0 ? null : null, (r15 & 8) == 0 ? null : null, (r15 & 16) != 0 ? 1.0f : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            a(this, adRedirectView, 0, i);
        }
    }
}
