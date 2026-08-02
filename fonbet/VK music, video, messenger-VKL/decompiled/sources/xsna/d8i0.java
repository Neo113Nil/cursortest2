package xsna;

import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import xsna.c8i0;
import xsna.rmu;
import xsna.tlo0;
import xsna.x7i0;

/* compiled from: SelectGroupVerificationReducer.kt */
/* loaded from: classes18.dex */
public final class d8i0 extends dm50<p8i0, c8i0, x7i0> {
    @Override // xsna.dm50
    public final x7i0 c(x7i0 x7i0Var, c8i0 c8i0Var) {
        c8i0 c8i0Var2 = c8i0Var;
        if (c8i0Var2 instanceof c8i0.a) {
            return new x7i0.a(((c8i0.a) c8i0Var2).b);
        }
        if (!(c8i0Var2 instanceof c8i0.b)) {
            throw new NoWhenBranchMatchedException();
        }
        rmu rmuVar = ((c8i0.b) c8i0Var2).b;
        List<rmu.a> list = rmuVar.a;
        ArrayList arrayList = new ArrayList(c5g.u(list, 10));
        for (rmu.a aVar : list) {
            arrayList.add(new h8i0(aVar.a, oq.d(tlo0.Companion, aVar.b), new tlo0.h(aVar.c), aVar.d, aVar.e, aVar.f, aVar.g));
        }
        return new x7i0.b(new k7i0(arrayList, rmuVar.b, rmuVar.c));
    }

    @Override // xsna.dm50
    public final p8i0 d() {
        return new p8i0(e(new y510(22)));
    }

    @Override // xsna.dm50
    public final void h(x7i0 x7i0Var, p8i0 p8i0Var) {
        f(p8i0Var.a, x7i0Var);
    }
}
