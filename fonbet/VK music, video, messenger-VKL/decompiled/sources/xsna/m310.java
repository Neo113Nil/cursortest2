package xsna;

import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.bhg0;

/* compiled from: MarketItemReviewsAdapter.kt */
/* loaded from: classes18.dex */
public final /* synthetic */ class m310 extends FunctionReferenceImpl implements wzs<Integer, b2g0, s3q0> {
    @Override // xsna.wzs
    public final s3q0 invoke(Integer num, b2g0 b2g0Var) {
        Long g;
        int intValue = num.intValue();
        b2g0 b2g0Var2 = b2g0Var;
        n310 n310Var = (n310) this.receiver;
        n310Var.getClass();
        if (b2g0Var2 != null && (g = tni.g(b2g0Var2)) != null) {
            n310Var.j.a(new bhg0.h(intValue, g.longValue()));
        }
        return s3q0.a;
    }
}
