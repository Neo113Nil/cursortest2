package yads;

import com.yandex.mobile.ads.common.AdRequestError;
import kotlin.jvm.internal.Lambda;
import xsna.gzs;
import xsna.s3q0;

/* loaded from: classes10.dex */
public final class ru3 extends Lambda implements gzs {
    public final /* synthetic */ tu3 b;
    public final /* synthetic */ AdRequestError c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ru3(tu3 tu3Var, AdRequestError adRequestError) {
        super(0);
        this.b = tu3Var;
        this.c = adRequestError;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        this.b.a.onAdFailedToLoad(this.c);
        return s3q0.a;
    }
}
