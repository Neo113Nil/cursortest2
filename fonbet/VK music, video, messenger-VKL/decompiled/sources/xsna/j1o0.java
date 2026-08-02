package xsna;

import kotlin.NoWhenBranchMatchedException;
import xsna.g1o0;
import xsna.h1o0;

/* compiled from: TaggedItemsReducer.kt */
/* loaded from: classes18.dex */
public final class j1o0 extends dm50<z0o0, h1o0, m1o0> {
    @Override // xsna.dm50
    public final m1o0 c(m1o0 m1o0Var, h1o0 h1o0Var) {
        m1o0 m1o0Var2 = m1o0Var;
        h1o0 h1o0Var2 = h1o0Var;
        if (h1o0Var2 instanceof h1o0.b) {
            h1o0.b bVar = (h1o0.b) h1o0Var2;
            if (bVar instanceof h1o0.b.c) {
                return m1o0.a(m1o0Var2, null, true, false, null, 29);
            }
            if (bVar instanceof h1o0.b.C2967b) {
                h1o0.b.C2967b c2967b = (h1o0.b.C2967b) bVar;
                return m1o0.a(m1o0Var2, c2967b.b, false, false, g1o0.a(m1o0Var2.e, c2967b.c, c2967b.d, null, 12), 20);
            }
            if (bVar instanceof h1o0.b.a) {
                return m1o0.a(m1o0Var2, null, false, false, null, 13);
            }
            throw new NoWhenBranchMatchedException();
        }
        if (!(h1o0Var2 instanceof h1o0.c)) {
            if (!(h1o0Var2 instanceof h1o0.a)) {
                throw new NoWhenBranchMatchedException();
            }
            h1o0.a aVar = (h1o0.a) h1o0Var2;
            for (a210 a210Var : m1o0Var2.b) {
                if (a210Var.b == aVar.b.longValue()) {
                    a210Var.k = aVar.c;
                }
            }
            return m1o0.a(m1o0Var2, m1o0Var2.b, false, false, null, 30);
        }
        h1o0.c cVar = (h1o0.c) h1o0Var2;
        if (cVar instanceof h1o0.c.C2968c) {
            return m1o0.a(m1o0Var2, m1o0Var2.b, false, true, g1o0.a(m1o0Var2.e, 0, 0, g1o0.a.c.a, 11), 18);
        }
        if (!(cVar instanceof h1o0.c.b)) {
            if (cVar instanceof h1o0.c.a) {
                return m1o0.a(m1o0Var2, null, false, false, g1o0.a(m1o0Var2.e, 0, 0, new g1o0.a.C2910a(), 11), 19);
            }
            throw new NoWhenBranchMatchedException();
        }
        h1o0.c.b bVar2 = (h1o0.c.b) cVar;
        return m1o0.a(m1o0Var2, bVar2.b, false, false, g1o0.a(m1o0Var2.e, bVar2.c, bVar2.d, g1o0.a.b.a, 8), 18);
    }

    @Override // xsna.dm50
    public final z0o0 d() {
        return new z0o0(e(new d230(17)), e(new wx30(15)), e(new dl70(21)));
    }

    @Override // xsna.dm50
    public final void h(m1o0 m1o0Var, z0o0 z0o0Var) {
        m1o0 m1o0Var2 = m1o0Var;
        z0o0 z0o0Var2 = z0o0Var;
        if (m1o0Var2.c) {
            f(z0o0Var2.b, m1o0Var2);
        } else if (m1o0Var2.f != null) {
            f(z0o0Var2.a, m1o0Var2);
        } else {
            f(z0o0Var2.c, m1o0Var2);
        }
    }
}
