package xsna;

import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyList;
import xsna.ejm0;
import xsna.hjm0;
import xsna.ojm0;

/* compiled from: StoryTemplateReducer.kt */
/* loaded from: classes6.dex */
public final class ljm0 extends dm50<sjm0, hjm0, ojm0> {
    public ljm0(ojm0 ojm0Var) {
        super(ojm0Var);
    }

    @Override // xsna.dm50
    public final ojm0 c(ojm0 ojm0Var, hjm0 hjm0Var) {
        ojm0 ojm0Var2 = ojm0Var;
        hjm0 hjm0Var2 = hjm0Var;
        List<ejm0> list = ojm0Var2.c;
        ojm0.b bVar = ojm0Var2.b;
        if (hjm0Var2.equals(hjm0.d.b)) {
            return ojm0.a(ojm0Var2, ojm0.b.a(bVar, true), null, null, false, 6);
        }
        if (hjm0Var2.equals(hjm0.c.b)) {
            return ojm0.a(ojm0Var2, ojm0.b.a(bVar, false), null, null, true, 6);
        }
        if (hjm0Var2 instanceof hjm0.b) {
            return ojm0.a(ojm0Var2, ojm0.b.a(bVar, false), j5g.u0(((hjm0.b) hjm0Var2).b, e43.m(ojm0Var2.d)), null, false, 4);
        }
        if (hjm0Var2.equals(hjm0.e.b)) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                if (!(((ejm0) obj) instanceof ejm0.b)) {
                    arrayList.add(obj);
                }
            }
            return ojm0.a(ojm0Var2, null, arrayList, null, false, 9);
        }
        if (!(hjm0Var2 instanceof hjm0.a)) {
            throw new NoWhenBranchMatchedException();
        }
        hjm0.a aVar = (hjm0.a) hjm0Var2;
        if (list.isEmpty()) {
            list = null;
        }
        List u0 = list != null ? j5g.u0(list, e43.m(aVar.b)) : null;
        if (u0 == null) {
            u0 = EmptyList.b;
        }
        return ojm0.a(ojm0Var2, null, u0, aVar.b, false, 9);
    }

    @Override // xsna.dm50
    public final sjm0 d() {
        return new sjm0(e(new fyi0(4)));
    }

    @Override // xsna.dm50
    public final void h(ojm0 ojm0Var, sjm0 sjm0Var) {
        f(sjm0Var.a, ojm0Var);
    }
}
