package yads;

import com.yandex.mobile.ads.banner.BannerAdEventListener;
import kotlin.jvm.internal.Lambda;
import xsna.gzs;
import xsna.s3q0;

/* loaded from: classes10.dex */
public final class ur3 extends Lambda implements gzs {
    public final /* synthetic */ xr3 b;
    public final /* synthetic */ ps3 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ur3(xr3 xr3Var, ps3 ps3Var) {
        super(0);
        this.b = xr3Var;
        this.c = ps3Var;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        BannerAdEventListener bannerAdEventListener = this.b.a;
        if (bannerAdEventListener != null) {
            bannerAdEventListener.onImpression(this.c);
        }
        return s3q0.a;
    }
}
