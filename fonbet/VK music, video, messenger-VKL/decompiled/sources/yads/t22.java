package yads;

import java.util.Iterator;
import java.util.List;
import xsna.qcy;

/* loaded from: classes10.dex */
public final class t22 implements l82 {
    public final gz1 a;
    public m22 b;

    public t22(gz1 gz1Var) {
        this.a = gz1Var;
    }

    @Override // yads.l82
    public final void a(m22 m22Var) {
        m22Var.a();
    }

    @Override // yads.l82
    public final void a(m22 m22Var, gv gvVar) {
        this.b = m22Var;
        gz1 gz1Var = this.a;
        vb vbVar = new vb(m22Var, gvVar, gz1Var.e, new lm3());
        for (oi oiVar : gz1Var.b) {
            pi a = m22Var.a(oiVar);
            if (a == null) {
                a = null;
            }
            if (a != null) {
                a.c(oiVar.c);
                a.a(oiVar, vbVar);
            }
        }
        mn2 mn2Var = m22Var.c.e;
        qcy qcyVar = z22.g[4];
        List list = (List) mn2Var.a.get();
        if (list != null) {
            Iterator it = list.iterator();
            if (it.hasNext()) {
                it.next().getClass();
                throw new ClassCastException();
            }
        }
    }

    @Override // yads.l82
    public final void a() {
        m22 m22Var = this.b;
        if (m22Var != null) {
            for (oi oiVar : this.a.b) {
                pi a = m22Var.a(oiVar);
                if (a instanceof pf0) {
                    ((pf0) a).b(oiVar.c);
                }
            }
        }
    }
}
