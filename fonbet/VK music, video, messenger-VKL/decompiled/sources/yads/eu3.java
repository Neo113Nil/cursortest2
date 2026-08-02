package yads;

import com.yandex.mobile.ads.common.AdRequestError;
import com.yandex.mobile.ads.interstitial.InterstitialAdLoadListener;
import kotlin.jvm.internal.Lambda;
import xsna.gzs;
import xsna.s3q0;

/* loaded from: classes10.dex */
public final class eu3 extends Lambda implements gzs {
    public final /* synthetic */ gu3 b;
    public final /* synthetic */ AdRequestError c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eu3(gu3 gu3Var, AdRequestError adRequestError) {
        super(0);
        this.b = gu3Var;
        this.c = adRequestError;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        InterstitialAdLoadListener interstitialAdLoadListener = this.b.a;
        if (interstitialAdLoadListener != null) {
            interstitialAdLoadListener.onAdFailedToLoad(this.c);
        }
        return s3q0.a;
    }
}
