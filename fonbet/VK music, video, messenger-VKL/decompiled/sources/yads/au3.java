package yads;

import com.yandex.mobile.ads.interstitial.InterstitialAdEventListener;
import kotlin.jvm.internal.Lambda;
import xsna.gzs;
import xsna.s3q0;

/* loaded from: classes10.dex */
public final class au3 extends Lambda implements gzs {
    public final /* synthetic */ du3 b;
    public final /* synthetic */ ar3 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public au3(du3 du3Var, ar3 ar3Var) {
        super(0);
        this.b = du3Var;
        this.c = ar3Var;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        InterstitialAdEventListener interstitialAdEventListener = this.b.a;
        if (interstitialAdEventListener != null) {
            interstitialAdEventListener.onAdFailedToShow(this.c);
        }
        return s3q0.a;
    }
}
