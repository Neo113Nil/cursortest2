package xsna;

import kotlin.NoWhenBranchMatchedException;
import xsna.cfc;
import xsna.xec;

/* compiled from: CityParameterReducer.kt */
/* loaded from: classes5.dex */
public final class afc extends dm50<gfc, xec, cfc> {
    @Override // xsna.dm50
    public final cfc c(cfc cfcVar, xec xecVar) {
        cfc cfcVar2 = cfcVar;
        xec xecVar2 = xecVar;
        boolean z = xecVar2 instanceof xec.c;
        cfc.a.b bVar = cfc.a.b.b;
        if (!z) {
            if (xecVar2 instanceof xec.a) {
                return new cfc(cfcVar2.b, new cfc.a.C2663a(((xec.a) xecVar2).b));
            }
            if (xecVar2 instanceof xec.b) {
                return new cfc(cfcVar2.b, bVar);
            }
            throw new NoWhenBranchMatchedException();
        }
        String str = ((xec.c) xecVar2).b;
        cfc.b bVar2 = cfcVar2.b;
        cfc.a aVar = cfcVar2.c;
        cfc.b bVar3 = epx.f(bVar2.b, str) ? bVar2 : null;
        if (bVar3 == null) {
            bVar3 = new cfc.b(str);
        }
        cfc.a aVar2 = epx.f(aVar, bVar) ? null : aVar;
        if (aVar2 == null) {
            aVar2 = cfc.a.c.b;
        }
        return (aVar == aVar2 && bVar2 == bVar3) ? cfcVar2 : new cfc(bVar3, aVar2);
    }

    @Override // xsna.dm50
    public final gfc d() {
        return new gfc(e(new ve0(10)), e(new nj(5)), e(new md(14)), e(new oj(6)), e(new pl2(9)));
    }

    @Override // xsna.dm50
    public final void h(cfc cfcVar, gfc gfcVar) {
        cfc cfcVar2 = cfcVar;
        gfc gfcVar2 = gfcVar;
        f(gfcVar2.a, cfcVar2.b);
        cfc.a aVar = cfcVar2.c;
        if (aVar instanceof cfc.a.c) {
            f(gfcVar2.b, aVar);
            return;
        }
        if (aVar instanceof cfc.a.b) {
            f(gfcVar2.e, aVar);
        } else {
            if (!(aVar instanceof cfc.a.C2663a)) {
                throw new NoWhenBranchMatchedException();
            }
            if (((cfc.a.C2663a) aVar).b.isEmpty()) {
                f(gfcVar2.d, aVar);
            } else {
                f(gfcVar2.c, aVar);
            }
        }
    }
}
