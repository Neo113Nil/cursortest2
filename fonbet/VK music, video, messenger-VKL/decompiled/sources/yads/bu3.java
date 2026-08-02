package yads;

import com.yandex.mobile.ads.interstitial.InterstitialAdEventListener;
import kotlin.jvm.internal.Lambda;
import xsna.gzs;
import xsna.s3q0;

/* loaded from: classes10.dex */
public final class bu3 extends Lambda implements gzs {
    public final /* synthetic */ du3 b;
    public final /* synthetic */ ps3 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bu3(du3 du3Var, ps3 ps3Var) {
        super(0);
        this.b = du3Var;
        this.c = ps3Var;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        InterstitialAdEventListener interstitialAdEventListener = this.b.a;
        if (interstitialAdEventListener != null) {
            interstitialAdEventListener.onAdImpression(this.c);
        }
        return s3q0.a;
    }
}
