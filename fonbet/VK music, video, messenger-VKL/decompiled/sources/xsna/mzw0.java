package xsna;

import java.util.ArrayList;
import kotlin.NoWhenBranchMatchedException;
import xsna.a990;
import xsna.kzw0;
import xsna.nzw0;

/* compiled from: VoipSelectMovieReducer.kt */
/* loaded from: classes7.dex */
public final class mzw0 extends dm50<pzw0, kzw0, nzw0> {
    public final ozw0 d;
    public final icx0 e;

    public mzw0(ozw0 ozw0Var, icx0 icx0Var, set0 set0Var) {
        super(new nzw0.b(icx0Var.b(), icx0Var.n(), set0Var));
        this.d = ozw0Var;
        this.e = icx0Var;
    }

    @Override // xsna.dm50
    public final nzw0 c(nzw0 nzw0Var, kzw0 kzw0Var) {
        nzw0 nzw0Var2 = nzw0Var;
        kzw0 kzw0Var2 = kzw0Var;
        boolean z = kzw0Var2 instanceof kzw0.c;
        icx0 icx0Var = this.e;
        if (z) {
            kzw0.c cVar = (kzw0.c) kzw0Var2;
            if (cVar instanceof kzw0.c.C3221c) {
                kzw0.c.C3221c c3221c = (kzw0.c.C3221c) cVar;
                return new nzw0.a.c(c3221c.b, nzw0Var2.a(), icx0Var.n(), c3221c.c);
            }
            if (!(cVar instanceof kzw0.c.b)) {
                if (!(cVar instanceof kzw0.c.a)) {
                    throw new NoWhenBranchMatchedException();
                }
                kzw0.c.a aVar = (kzw0.c.a) cVar;
                return new nzw0.a.b(aVar.b, nzw0Var2.a(), icx0Var.n(), aVar.c, aVar.d);
            }
            kzw0.c.b bVar = (kzw0.c.b) cVar;
            ArrayList arrayList = bVar.d;
            boolean n = icx0Var.n();
            p3x0 a = nzw0Var2.a();
            CharSequence charSequence = bVar.b;
            set0 set0Var = bVar.c;
            int size = arrayList.size();
            return new nzw0.a.C3429a(charSequence, a, n, set0Var, arrayList, new a990(Integer.valueOf(size), size < bVar.e, a990.a.b.a, a990.b.a.a));
        }
        if (kzw0Var2 instanceof kzw0.d) {
            kzw0.d dVar = (kzw0.d) kzw0Var2;
            if (!(nzw0Var2 instanceof nzw0.a.C3429a)) {
                return nzw0Var2;
            }
            if (dVar instanceof kzw0.d.c) {
                nzw0.a.C3429a c3429a = (nzw0.a.C3429a) nzw0Var2;
                return nzw0.a.C3429a.m(c3429a, null, icx0Var.n(), null, null, a990.a(c3429a.g, null, false, a990.a.c.a, null, 11), 27);
            }
            if (dVar instanceof kzw0.d.a) {
                nzw0.a.C3429a c3429a2 = (nzw0.a.C3429a) nzw0Var2;
                return nzw0.a.C3429a.m(c3429a2, null, icx0Var.n(), null, null, a990.a(c3429a2.g, null, false, new a990.a.C2530a(((kzw0.d.a) dVar).b), null, 11), 27);
            }
            if (!(dVar instanceof kzw0.d.b)) {
                throw new NoWhenBranchMatchedException();
            }
            nzw0.a.C3429a c3429a3 = (nzw0.a.C3429a) nzw0Var2;
            kzw0.d.b bVar2 = (kzw0.d.b) dVar;
            ArrayList u0 = j5g.u0(bVar2.b, c3429a3.f);
            boolean n2 = icx0Var.n();
            int size2 = u0.size();
            return nzw0.a.C3429a.m(c3429a3, null, n2, null, u0, new a990(Integer.valueOf(size2), size2 < bVar2.c, a990.a.b.a, a990.b.a.a), 11);
        }
        if (kzw0Var2 instanceof kzw0.a) {
            return new nzw0.b(nzw0Var2.a(), icx0Var.n(), nzw0Var2.c());
        }
        if (kzw0Var2 instanceof kzw0.e) {
            kzw0.e eVar = (kzw0.e) kzw0Var2;
            if (nzw0Var2 instanceof nzw0.a.c) {
                return nzw0.a.c.m((nzw0.a.c) nzw0Var2, eVar.b, icx0Var.n(), null, 9);
            }
            if (nzw0Var2 instanceof nzw0.a.C3429a) {
                return nzw0.a.C3429a.m((nzw0.a.C3429a) nzw0Var2, eVar.b, icx0Var.n(), null, null, null, 57);
            }
            if (nzw0Var2 instanceof nzw0.a.b) {
                return nzw0.a.b.m((nzw0.a.b) nzw0Var2, eVar.b, icx0Var.n(), null, 25);
            }
            if (nzw0Var2 instanceof nzw0.b) {
                return new nzw0.b(eVar.b, icx0Var.n(), ((nzw0.b) nzw0Var2).d);
            }
            throw new NoWhenBranchMatchedException();
        }
        if (!(kzw0Var2 instanceof kzw0.b)) {
            throw new NoWhenBranchMatchedException();
        }
        kzw0.b bVar3 = (kzw0.b) kzw0Var2;
        if (nzw0Var2 instanceof nzw0.a.c) {
            return nzw0.a.c.m((nzw0.a.c) nzw0Var2, null, false, bVar3.b, 7);
        }
        if (nzw0Var2 instanceof nzw0.a.C3429a) {
            return nzw0.a.C3429a.m((nzw0.a.C3429a) nzw0Var2, null, false, bVar3.b, null, null, 55);
        }
        if (nzw0Var2 instanceof nzw0.a.b) {
            return nzw0.a.b.m((nzw0.a.b) nzw0Var2, null, false, bVar3.b, 23);
        }
        if (nzw0Var2 instanceof nzw0.b) {
            return nzw0Var2;
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // xsna.dm50
    public final pzw0 d() {
        return new pzw0(e(new m2l0(this, 27)));
    }

    @Override // xsna.dm50
    public final void h(nzw0 nzw0Var, pzw0 pzw0Var) {
        f(pzw0Var.a, nzw0Var);
    }
}
