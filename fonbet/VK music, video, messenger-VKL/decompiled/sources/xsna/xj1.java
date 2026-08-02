package xsna;

import kotlin.NoWhenBranchMatchedException;
import xsna.tj1;

/* compiled from: AlbumPickerReducer.kt */
/* loaded from: classes5.dex */
public final class xj1 extends dm50<ek1, tj1, ak1> {
    @Override // xsna.dm50
    public final ak1 c(ak1 ak1Var, tj1 tj1Var) {
        ak1 ak1Var2 = ak1Var;
        tj1 tj1Var2 = tj1Var;
        if (!(tj1Var2 instanceof tj1.a)) {
            throw new NoWhenBranchMatchedException();
        }
        tj1.a aVar = (tj1.a) tj1Var2;
        if (epx.f(aVar, tj1.a.b.b)) {
            return ak1.a(ak1Var2, null, true, null, 3);
        }
        if (aVar instanceof tj1.a.C3748a) {
            return ak1.a(ak1Var2, null, false, ((tj1.a.C3748a) aVar).b, 3);
        }
        if (aVar instanceof tj1.a.c) {
            return ak1.a(ak1Var2, ((tj1.a.c) aVar).b, false, null, 1);
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // xsna.dm50
    public final ek1 d() {
        return new ek1(e(new xx0(1)));
    }

    @Override // xsna.dm50
    public final void h(ak1 ak1Var, ek1 ek1Var) {
        f(ek1Var.a, ak1Var);
    }
}
