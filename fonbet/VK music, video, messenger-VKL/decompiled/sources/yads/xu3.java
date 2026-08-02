package yads;

import com.yandex.mobile.ads.common.AdRequestError;
import kotlin.jvm.internal.Lambda;
import xsna.gzs;
import xsna.s3q0;

/* loaded from: classes10.dex */
public final class xu3 extends Lambda implements gzs {
    public final /* synthetic */ zu3 b;
    public final /* synthetic */ AdRequestError c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xu3(zu3 zu3Var, AdRequestError adRequestError) {
        super(0);
        this.b = zu3Var;
        this.c = adRequestError;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        this.b.a.onAdsFailedToLoad(this.c);
        return s3q0.a;
    }
}
