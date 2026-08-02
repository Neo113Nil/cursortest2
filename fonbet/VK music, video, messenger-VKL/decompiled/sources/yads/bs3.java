package yads;

import com.yandex.mobile.ads.banner.ClosableBannerAdEventListener;
import kotlin.jvm.internal.Lambda;
import xsna.gzs;
import xsna.s3q0;

/* loaded from: classes10.dex */
public final class bs3 extends Lambda implements gzs {
    public final /* synthetic */ is3 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bs3(is3 is3Var) {
        super(0);
        this.b = is3Var;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        ClosableBannerAdEventListener closableBannerAdEventListener = this.b.a;
        if (closableBannerAdEventListener != null) {
            closableBannerAdEventListener.closeBannerAd();
        }
        return s3q0.a;
    }
}
