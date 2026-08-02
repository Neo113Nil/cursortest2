package xsna;

import kotlin.NoWhenBranchMatchedException;
import xsna.nv00;

/* compiled from: MarketCategoriesFilterReducer.kt */
/* loaded from: classes18.dex */
public final class qv00 extends dm50<sv00, nv00, rv00> {
    @Override // xsna.dm50
    public final rv00 c(rv00 rv00Var, nv00 nv00Var) {
        rv00 rv00Var2 = rv00Var;
        nv00 nv00Var2 = nv00Var;
        if (nv00Var2 instanceof nv00.b) {
            return rv00.a(rv00Var2, ((nv00.b) nv00Var2).b, null, false, 6);
        }
        if (!(nv00Var2 instanceof nv00.a)) {
            throw new NoWhenBranchMatchedException();
        }
        nv00.a aVar = (nv00.a) nv00Var2;
        return rv00.a(rv00Var2, null, aVar.b, aVar.c, 1);
    }

    @Override // xsna.dm50
    public final sv00 d() {
        return new sv00(e(new s6x(4)), e(new z13(26)));
    }

    @Override // xsna.dm50
    public final void h(rv00 rv00Var, sv00 sv00Var) {
        rv00 rv00Var2 = rv00Var;
        sv00 sv00Var2 = sv00Var;
        f(sv00Var2.a, rv00Var2);
        f(sv00Var2.b, rv00Var2);
    }
}
