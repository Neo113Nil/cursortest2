package yads;

import java.util.List;

/* loaded from: classes10.dex */
public final class a23 implements l82 {
    public final List a;

    public a23(List list) {
        this.a = list;
    }

    @Override // yads.l82
    public final void a() {
    }

    @Override // yads.l82
    public final void a(m22 m22Var) {
    }

    @Override // yads.l82
    public final void a(m22 m22Var, gv gvVar) {
        List<oi> list = this.a;
        if (list != null) {
            ob obVar = new ob(m22Var, gvVar);
            for (oi oiVar : list) {
                pi a = m22Var.a(oiVar);
                if (a == null) {
                    a = null;
                }
                if (a != null) {
                    a.c(oiVar.c);
                    a.a(oiVar, obVar);
                }
            }
        }
    }
}
