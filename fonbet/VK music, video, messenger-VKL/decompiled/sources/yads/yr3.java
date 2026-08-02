package yads;

import kotlin.jvm.internal.Lambda;
import xsna.gzs;
import xsna.s3q0;

/* loaded from: classes10.dex */
public final class yr3 extends Lambda implements gzs {
    public final /* synthetic */ as3 b;
    public final /* synthetic */ String c = "Cannot load bidder token. Token generation failed";

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yr3(as3 as3Var) {
        super(0);
        this.b = as3Var;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        this.b.a.onBidderTokenFailedToLoad(this.c);
        return s3q0.a;
    }
}
