package yads;

import com.yandex.mobile.ads.rewarded.RewardedAdEventListener;
import kotlin.jvm.internal.Lambda;
import xsna.gzs;
import xsna.s3q0;

/* loaded from: classes10.dex */
public final class fv3 extends Lambda implements gzs {
    public final /* synthetic */ iv3 b;
    public final /* synthetic */ ps3 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fv3(iv3 iv3Var, ps3 ps3Var) {
        super(0);
        this.b = iv3Var;
        this.c = ps3Var;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        RewardedAdEventListener rewardedAdEventListener = this.b.a;
        if (rewardedAdEventListener != null) {
            rewardedAdEventListener.onAdImpression(this.c);
        }
        return s3q0.a;
    }
}
