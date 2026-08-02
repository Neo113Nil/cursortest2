package yads;

import com.yandex.mobile.ads.banner.BannerAdEventListener;
import com.yandex.mobile.ads.common.AdRequestError;
import kotlin.jvm.internal.Lambda;
import xsna.gzs;
import xsna.s3q0;

/* loaded from: classes10.dex */
public final class sr3 extends Lambda implements gzs {
    public final /* synthetic */ xr3 b;
    public final /* synthetic */ AdRequestError c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sr3(xr3 xr3Var, AdRequestError adRequestError) {
        super(0);
        this.b = xr3Var;
        this.c = adRequestError;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        BannerAdEventListener bannerAdEventListener = this.b.a;
        if (bannerAdEventListener != null) {
            bannerAdEventListener.onAdFailedToLoad(this.c);
        }
        return s3q0.a;
    }
}
