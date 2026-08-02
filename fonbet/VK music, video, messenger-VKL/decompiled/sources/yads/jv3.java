package yads;

import com.yandex.mobile.ads.common.AdRequestError;
import com.yandex.mobile.ads.rewarded.RewardedAdLoadListener;
import kotlin.jvm.internal.Lambda;
import xsna.gzs;
import xsna.s3q0;

/* loaded from: classes10.dex */
public final class jv3 extends Lambda implements gzs {
    public final /* synthetic */ lv3 b;
    public final /* synthetic */ AdRequestError c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jv3(lv3 lv3Var, AdRequestError adRequestError) {
        super(0);
        this.b = lv3Var;
        this.c = adRequestError;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        RewardedAdLoadListener rewardedAdLoadListener = this.b.a;
        if (rewardedAdLoadListener != null) {
            rewardedAdLoadListener.onAdFailedToLoad(this.c);
        }
        return s3q0.a;
    }
}
