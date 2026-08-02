package yads;

import com.yandex.mobile.ads.interstitial.InterstitialAdEventListener;
import kotlin.jvm.internal.Lambda;
import xsna.gzs;
import xsna.s3q0;

/* loaded from: classes10.dex */
public final class cu3 extends Lambda implements gzs {
    public final /* synthetic */ du3 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cu3(du3 du3Var) {
        super(0);
        this.b = du3Var;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        InterstitialAdEventListener interstitialAdEventListener = this.b.a;
        if (interstitialAdEventListener != null) {
            interstitialAdEventListener.onAdShown();
        }
        return s3q0.a;
    }
}
