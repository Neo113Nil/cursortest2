package yads;

import com.yandex.mobile.ads.banner.ClosableBannerAdEventListener;
import kotlin.jvm.internal.Lambda;
import xsna.gzs;
import xsna.s3q0;

/* loaded from: classes10.dex */
public final class fs3 extends Lambda implements gzs {
    public final /* synthetic */ is3 b;
    public final /* synthetic */ ps3 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fs3(is3 is3Var, ps3 ps3Var) {
        super(0);
        this.b = is3Var;
        this.c = ps3Var;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        ClosableBannerAdEventListener closableBannerAdEventListener = this.b.a;
        if (closableBannerAdEventListener != null) {
            closableBannerAdEventListener.onImpression(this.c);
        }
        return s3q0.a;
    }
}
