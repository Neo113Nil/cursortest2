package xsna;

import kotlin.NoWhenBranchMatchedException;
import xsna.f5h0;
import xsna.qhv0;

/* compiled from: VkScaleTypeExt.kt */
/* loaded from: classes.dex */
public final class rhv0 {
    public static final f5h0.c a(qhv0.l lVar) {
        f5h0.c cVar = new f5h0.c(b(lVar.e()), b(lVar.g()), lVar.a(), lVar.b(), lVar.c(), lVar.d());
        cVar.i(lVar.f());
        return cVar;
    }

    public static final f5h0.d b(qhv0 qhv0Var) {
        if (qhv0Var.equals(qhv0.i.a)) {
            return f5h0.m.a;
        }
        if (qhv0Var.equals(qhv0.h.a)) {
            return f5h0.l.a;
        }
        if (qhv0Var.equals(qhv0.j.a)) {
            return f5h0.n.a;
        }
        if (qhv0Var.equals(qhv0.g.a)) {
            return f5h0.k.a;
        }
        if (qhv0Var.equals(qhv0.e.a)) {
            return f5h0.i.a;
        }
        if (qhv0Var.equals(qhv0.f.a)) {
            return f5h0.j.a;
        }
        if (qhv0Var.equals(qhv0.a.a)) {
            return f5h0.e.a;
        }
        if (qhv0Var.equals(qhv0.c.a)) {
            return f5h0.g.a;
        }
        if (qhv0Var.equals(qhv0.b.a)) {
            return f5h0.f.a;
        }
        if (qhv0Var.equals(qhv0.k.a)) {
            return f5h0.o.a;
        }
        if (qhv0Var.equals(qhv0.d.a)) {
            return f5h0.h.a;
        }
        if (qhv0Var instanceof qhv0.l) {
            return a((qhv0.l) qhv0Var);
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final qhv0 c(f5h0.d dVar) {
        if (dVar.equals(f5h0.m.a)) {
            return qhv0.i.a;
        }
        if (dVar.equals(f5h0.l.a)) {
            return qhv0.h.a;
        }
        if (dVar.equals(f5h0.n.a)) {
            return qhv0.j.a;
        }
        if (dVar.equals(f5h0.k.a)) {
            return qhv0.g.a;
        }
        if (dVar.equals(f5h0.i.a)) {
            return qhv0.e.a;
        }
        if (dVar.equals(f5h0.j.a)) {
            return qhv0.f.a;
        }
        if (dVar.equals(f5h0.e.a)) {
            return qhv0.a.a;
        }
        if (dVar.equals(f5h0.g.a)) {
            return qhv0.c.a;
        }
        if (dVar.equals(f5h0.f.a)) {
            return qhv0.b.a;
        }
        if (dVar.equals(f5h0.o.a)) {
            return qhv0.k.a;
        }
        if (dVar.equals(f5h0.h.a)) {
            return qhv0.d.a;
        }
        if (!(dVar instanceof f5h0.c)) {
            return qhv0.b.a;
        }
        f5h0.c cVar = (f5h0.c) dVar;
        qhv0.l lVar = new qhv0.l(c(cVar.f()), c(cVar.g()), cVar.b(), cVar.c(), cVar.d(), cVar.e(), 64);
        lVar.h(cVar.h());
        return lVar;
    }
}
