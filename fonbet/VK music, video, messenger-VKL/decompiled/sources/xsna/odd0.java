package xsna;

import kotlin.NoWhenBranchMatchedException;
import xsna.ndd0;

/* compiled from: PrivacyEditDonutLevelsReducer.kt */
/* loaded from: classes18.dex */
public final class odd0 extends dm50<udd0, ndd0, rdd0> {
    @Override // xsna.dm50
    public final rdd0 c(rdd0 rdd0Var, ndd0 ndd0Var) {
        rdd0 rdd0Var2 = rdd0Var;
        ndd0 ndd0Var2 = ndd0Var;
        if (ndd0Var2 instanceof ndd0.a) {
            ndd0.a aVar = (ndd0.a) ndd0Var2;
            return new rdd0(aVar.c, aVar.b);
        }
        if (ndd0Var2 instanceof ndd0.b) {
            return new rdd0(((ndd0.b) ndd0Var2).b, rdd0Var2.b);
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // xsna.dm50
    public final udd0 d() {
        return new udd0(e(new k990(10)));
    }

    @Override // xsna.dm50
    public final void h(rdd0 rdd0Var, udd0 udd0Var) {
        f(udd0Var.a, rdd0Var);
    }
}
