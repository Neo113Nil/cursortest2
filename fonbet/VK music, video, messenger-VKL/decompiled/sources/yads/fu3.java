package yads;

import com.yandex.mobile.ads.interstitial.InterstitialAdLoadListener;
import kotlin.jvm.internal.Lambda;
import xsna.gzs;
import xsna.s3q0;

/* loaded from: classes10.dex */
public final class fu3 extends Lambda implements gzs {
    public final /* synthetic */ gu3 b;
    public final /* synthetic */ xt3 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fu3(gu3 gu3Var, xt3 xt3Var) {
        super(0);
        this.b = gu3Var;
        this.c = xt3Var;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        InterstitialAdLoadListener interstitialAdLoadListener = this.b.a;
        if (interstitialAdLoadListener != null) {
            interstitialAdLoadListener.onAdLoaded(this.c);
        }
        return s3q0.a;
    }
}
