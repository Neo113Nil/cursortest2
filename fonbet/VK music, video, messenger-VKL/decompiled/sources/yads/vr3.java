package yads;

import com.yandex.mobile.ads.banner.BannerAdEventListener;
import kotlin.jvm.internal.Lambda;
import xsna.gzs;
import xsna.s3q0;

/* loaded from: classes10.dex */
public final class vr3 extends Lambda implements gzs {
    public final /* synthetic */ xr3 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vr3(xr3 xr3Var) {
        super(0);
        this.b = xr3Var;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        BannerAdEventListener bannerAdEventListener = this.b.a;
        if (bannerAdEventListener != null) {
            bannerAdEventListener.onLeftApplication();
        }
        return s3q0.a;
    }
}
