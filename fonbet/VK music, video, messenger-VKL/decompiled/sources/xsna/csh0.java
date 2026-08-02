package xsna;

import kotlin.NoWhenBranchMatchedException;
import xsna.ksh0;
import xsna.rrh0;

/* compiled from: SearchFeatureReducer.kt */
/* loaded from: classes5.dex */
public final class csh0 extends dm50<nsh0, rrh0, ksh0> {
    public final ksh0 d;
    public final ywz e;

    public csh0(ksh0 ksh0Var, ywz ywzVar) {
        super(ksh0Var);
        this.d = ksh0Var;
        this.e = ywzVar;
    }

    @Override // xsna.dm50
    public final ksh0 c(ksh0 ksh0Var, rrh0 rrh0Var) {
        ksh0 ksh0Var2;
        ksh0 ksh0Var3 = ksh0Var;
        rrh0 rrh0Var2 = rrh0Var;
        ksh0.a aVar = ksh0Var3.e;
        dsh0 dsh0Var = ksh0Var3.c;
        if (!rrh0Var2.equals(rrh0.a.b)) {
            if (rrh0Var2 instanceof rrh0.d) {
                return ksh0.a(ksh0Var3, ((rrh0.d) rrh0Var2).b, null, null, false, 30);
            }
            if (rrh0Var2 instanceof rrh0.f) {
                return ksh0.a(ksh0Var3, null, ((rrh0.f) rrh0Var2).b, null, false, 29);
            }
            if (rrh0Var2 instanceof rrh0.e) {
                rrh0.e eVar = (rrh0.e) rrh0Var2;
                ksh0.a.b bVar = aVar instanceof ksh0.a.b ? (ksh0.a.b) aVar : null;
                if (bVar != null) {
                    return ksh0.a(ksh0Var3, null, null, new ksh0.a.b(bVar.a, eVar.b), false, 23);
                }
            } else {
                if (rrh0Var2 instanceof rrh0.h) {
                    return aVar instanceof ksh0.a.b ? ksh0.a(ksh0Var3, null, dsh0.a(dsh0Var, null, true, 63), null, false, 29) : ksh0.a(ksh0Var3, null, dsh0.a(dsh0Var, null, true, 63), new ksh0.a.b(((rrh0.h) rrh0Var2).b, null), false, 21);
                }
                if (rrh0Var2.equals(rrh0.g.b)) {
                    return ksh0.a(ksh0Var3, null, dsh0.a(dsh0Var, null, false, 63), ksh0.a.C3203a.a, false, 21);
                }
                if (!rrh0Var2.equals(rrh0.c.b)) {
                    if (rrh0Var2 instanceof rrh0.b) {
                        return ksh0.a(ksh0Var3, null, null, null, ((rrh0.b) rrh0Var2).b, 15);
                    }
                    throw new NoWhenBranchMatchedException();
                }
                ksh0.a.b bVar2 = aVar instanceof ksh0.a.b ? (ksh0.a.b) aVar : null;
                if (bVar2 != null && (ksh0Var2 = bVar2.a) != null) {
                    return ksh0Var2;
                }
            }
        }
        return ksh0Var3;
    }

    @Override // xsna.dm50
    public final nsh0 d() {
        return new nsh0(e(new b140(this, 18)), e(new yhu(this, 27)));
    }

    @Override // xsna.dm50
    public final void h(ksh0 ksh0Var, nsh0 nsh0Var) {
        nsh0 nsh0Var2 = nsh0Var;
        fi50 fi50Var = nsh0Var2.a;
        ksh0.b bVar = ksh0Var.b;
        f(fi50Var, bVar);
        f(nsh0Var2.b, bVar);
    }
}
