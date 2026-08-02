package yads;

import android.app.Activity;
import com.yandex.mobile.ads.common.AdInfo;
import com.yandex.mobile.ads.rewarded.RewardedAd;
import com.yandex.mobile.ads.rewarded.RewardedAdEventListener;
import xsna.epx;

/* loaded from: classes10.dex */
public final class bv3 implements RewardedAd {
    public final es2 a;
    public final br3 b;
    public final lk c;

    public bv3(es2 es2Var, br3 br3Var, lk lkVar) {
        this.a = es2Var;
        this.b = br3Var;
        this.c = lkVar;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof bv3) && epx.f(((bv3) obj).a, this.a);
    }

    @Override // com.yandex.mobile.ads.rewarded.RewardedAd
    public final AdInfo getInfo() {
        br3 br3Var = this.b;
        c00 c00Var = this.a.f;
        br3Var.getClass();
        return br3.a(c00Var);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // com.yandex.mobile.ads.rewarded.RewardedAd
    public final void setAdEventListener(RewardedAdEventListener rewardedAdEventListener) {
        iv3 iv3Var = new iv3(rewardedAdEventListener);
        es2 es2Var = this.a;
        es2Var.c.a();
        es2Var.b.c = iv3Var;
    }

    @Override // com.yandex.mobile.ads.rewarded.RewardedAd
    public final void show(Activity activity) {
        this.a.a(activity);
    }
}
