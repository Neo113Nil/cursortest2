package yads;

import com.monetization.ads.core.utils.CallbackStackTraceMarker;
import com.yandex.mobile.ads.common.AdRequestError;
import com.yandex.mobile.ads.rewarded.RewardedAdLoadListener;

/* loaded from: classes10.dex */
public final class lv3 implements q10 {
    public final RewardedAdLoadListener a;

    public lv3(RewardedAdLoadListener rewardedAdLoadListener) {
        this.a = rewardedAdLoadListener;
    }

    @Override // yads.q10
    public final void a(l4 l4Var) {
        new CallbackStackTraceMarker(new jv3(this, new AdRequestError(l4Var.a, l4Var.c, l4Var.d)));
    }

    @Override // yads.q10
    public final void a(es2 es2Var) {
        new CallbackStackTraceMarker(new kv3(this, new bv3(es2Var, new br3(), new lk())));
    }
}
