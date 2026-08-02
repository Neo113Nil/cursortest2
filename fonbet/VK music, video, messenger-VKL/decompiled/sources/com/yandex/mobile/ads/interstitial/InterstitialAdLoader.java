package com.yandex.mobile.ads.interstitial;

import android.content.Context;
import com.yandex.mobile.ads.common.AdRequestConfiguration;
import yads.dr3;
import yads.gu3;
import yads.mv3;
import yads.x00;

/* loaded from: classes8.dex */
public final class InterstitialAdLoader {
    private final dr3 a;
    private final x00 b;

    public InterstitialAdLoader(Context context) {
        mv3 mv3Var = new mv3(context);
        this.a = new dr3();
        this.b = new x00(context, mv3Var);
    }

    public final void loadAd(AdRequestConfiguration adRequestConfiguration) {
        this.b.a.a(this.a.a(adRequestConfiguration));
    }

    public final void setAdLoadListener(InterstitialAdLoadListener interstitialAdLoadListener) {
        this.b.a.a(interstitialAdLoadListener != null ? new gu3(interstitialAdLoadListener) : null);
    }
}
