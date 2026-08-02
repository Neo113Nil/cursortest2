package xsna;

import kotlin.NoWhenBranchMatchedException;
import xsna.obz;
import xsna.qbz;

/* compiled from: LinkVKBidReducer.kt */
/* loaded from: classes18.dex */
public final class rbz extends dm50<dcz, qbz, obz> {
    @Override // xsna.dm50
    public final obz c(obz obzVar, qbz qbzVar) {
        obz obzVar2 = obzVar;
        qbz qbzVar2 = qbzVar;
        if (qbzVar2 instanceof qbz.e) {
            return new obz.b(((qbz.e) qbzVar2).b);
        }
        if (qbzVar2 instanceof qbz.f) {
            qbz.f fVar = (qbz.f) qbzVar2;
            return new obz.a(fVar.b, false, fVar.c, false);
        }
        if (qbzVar2 instanceof qbz.c) {
            return obz.c.b;
        }
        if (qbzVar2 instanceof qbz.g) {
            if (!(obzVar2 instanceof obz.a)) {
                return obzVar2;
            }
            obz.a aVar = (obz.a) obzVar2;
            return new obz.a(aVar.b, false, aVar.d, true);
        }
        if (qbzVar2 instanceof qbz.a) {
            return obzVar2 instanceof obz.a ? obz.a.a((obz.a) obzVar2, null, 13) : obzVar2;
        }
        if (qbzVar2 instanceof qbz.b) {
            return obzVar2 instanceof obz.a ? obz.a.a((obz.a) obzVar2, null, 11) : obzVar2;
        }
        if (!(qbzVar2 instanceof qbz.d)) {
            throw new NoWhenBranchMatchedException();
        }
        qbz.d dVar = (qbz.d) qbzVar2;
        if (!(obzVar2 instanceof obz.a)) {
            return obzVar2;
        }
        obz.a aVar2 = (obz.a) obzVar2;
        return obz.a.a(aVar2, new afu0(dVar.b, aVar2.b.b), 14);
    }

    @Override // xsna.dm50
    public final dcz d() {
        return new dcz(e(new fgh(this, 23)));
    }

    @Override // xsna.dm50
    public final void h(obz obzVar, dcz dczVar) {
        f(dczVar.a, obzVar);
    }
}
