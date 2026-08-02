package xsna;

import kotlin.NoWhenBranchMatchedException;
import xsna.rcu;

/* compiled from: GraffitiReducer.kt */
/* loaded from: classes15.dex */
public final class xcu extends dm50<edu, rcu, cdu> {
    @Override // xsna.dm50
    public final cdu c(cdu cduVar, rcu rcuVar) {
        cdu cduVar2 = cduVar;
        rcu rcuVar2 = rcuVar;
        if (rcuVar2 instanceof ocu) {
            return cdu.a(cduVar2, 0, null, null, ((ocu) rcuVar2).b, null, null, 55);
        }
        if (rcuVar2 instanceof qcu) {
            return cdu.a(cduVar2, 0, null, null, null, null, ((qcu) rcuVar2).b, 31);
        }
        if (rcuVar2 instanceof pcu) {
            pcu pcuVar = (pcu) rcuVar2;
            return cdu.a(cduVar2, pcuVar.c, pcuVar.b, null, null, null, null, 60);
        }
        if (rcuVar2 instanceof rcu.a) {
            return cdu.a(cduVar2, 0, null, cduVar2.f, null, ((rcu.a) rcuVar2).b, null, 43);
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // xsna.dm50
    public final edu d() {
        return new edu(e(new tcu(0)));
    }

    @Override // xsna.dm50
    public final void h(cdu cduVar, edu eduVar) {
        f(eduVar.a, cduVar);
    }
}
