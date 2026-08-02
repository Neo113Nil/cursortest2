package yads;

import android.app.Activity;
import com.yandex.mobile.ads.common.AdInfo;
import com.yandex.mobile.ads.interstitial.InterstitialAd;
import com.yandex.mobile.ads.interstitial.InterstitialAdEventListener;
import xsna.epx;

/* loaded from: classes10.dex */
public final class xt3 implements InterstitialAd {
    public final md1 a;
    public final br3 b;
    public final lk c;

    public xt3(md1 md1Var, br3 br3Var, lk lkVar) {
        this.a = md1Var;
        this.b = br3Var;
        this.c = lkVar;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof xt3) && epx.f(((xt3) obj).a, this.a);
    }

    @Override // com.yandex.mobile.ads.interstitial.InterstitialAd
    public final AdInfo getInfo() {
        br3 br3Var = this.b;
        c00 d = this.a.a.d();
        br3Var.getClass();
        return br3.a(d);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // com.yandex.mobile.ads.interstitial.InterstitialAd
    public final void setAdEventListener(InterstitialAdEventListener interstitialAdEventListener) {
        du3 du3Var = new du3(interstitialAdEventListener);
        md1 md1Var = this.a;
        md1Var.c.a();
        md1Var.b.c = du3Var;
    }

    @Override // com.yandex.mobile.ads.interstitial.InterstitialAd
    public final void show(Activity activity) {
        this.a.a(activity);
    }
}
