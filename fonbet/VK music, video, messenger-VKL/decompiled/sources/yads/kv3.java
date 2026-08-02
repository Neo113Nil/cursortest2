package yads;

import com.yandex.mobile.ads.rewarded.RewardedAdLoadListener;
import kotlin.jvm.internal.Lambda;
import xsna.gzs;
import xsna.s3q0;

/* loaded from: classes10.dex */
public final class kv3 extends Lambda implements gzs {
    public final /* synthetic */ lv3 b;
    public final /* synthetic */ bv3 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kv3(lv3 lv3Var, bv3 bv3Var) {
        super(0);
        this.b = lv3Var;
        this.c = bv3Var;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        RewardedAdLoadListener rewardedAdLoadListener = this.b.a;
        if (rewardedAdLoadListener != null) {
            rewardedAdLoadListener.onAdLoaded(this.c);
        }
        return s3q0.a;
    }
}
