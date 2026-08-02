package yads;

import com.monetization.ads.core.utils.CallbackStackTraceMarker;
import com.yandex.mobile.ads.common.AdRequestError;
import com.yandex.mobile.ads.interstitial.InterstitialAdLoadListener;

/* loaded from: classes10.dex */
public final class gu3 implements w00 {
    public final InterstitialAdLoadListener a;

    public gu3(InterstitialAdLoadListener interstitialAdLoadListener) {
        this.a = interstitialAdLoadListener;
    }

    @Override // yads.w00
    public final void a(l4 l4Var) {
        new CallbackStackTraceMarker(new eu3(this, new AdRequestError(l4Var.a, l4Var.c, l4Var.d)));
    }

    @Override // yads.w00
    public final void a(md1 md1Var) {
        new CallbackStackTraceMarker(new fu3(this, new xt3(md1Var, new br3(), new lk())));
    }
}
