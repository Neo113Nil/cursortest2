package yads;

import com.yandex.mobile.ads.banner.ClosableBannerAdEventListener;
import com.yandex.mobile.ads.common.AdRequestError;
import kotlin.jvm.internal.Lambda;
import xsna.gzs;
import xsna.s3q0;

/* loaded from: classes10.dex */
public final class ds3 extends Lambda implements gzs {
    public final /* synthetic */ is3 b;
    public final /* synthetic */ AdRequestError c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ds3(is3 is3Var, AdRequestError adRequestError) {
        super(0);
        this.b = is3Var;
        this.c = adRequestError;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        ClosableBannerAdEventListener closableBannerAdEventListener = this.b.a;
        if (closableBannerAdEventListener != null) {
            closableBannerAdEventListener.onAdFailedToLoad(this.c);
        }
        return s3q0.a;
    }
}
