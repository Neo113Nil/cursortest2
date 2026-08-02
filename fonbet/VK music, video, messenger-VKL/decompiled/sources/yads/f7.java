package yads;

import xsna.j5g;

/* loaded from: classes10.dex */
public final class f7 implements z3 {
    public final /* synthetic */ g7 a;

    public f7(g7 g7Var) {
        this.a = g7Var;
    }

    @Override // yads.z3
    public final void a() {
        this.a.b();
    }

    @Override // yads.z3
    public final void b() {
        g7 g7Var = this.a;
        int i = g7Var.m - 1;
        if (i == g7Var.d.c && !g7Var.n) {
            g7Var.n = true;
            g7Var.b.b();
        }
        j7 j7Var = (j7) j5g.b0(i, this.a.k);
        if ((j7Var != null ? j7Var.c : null) != l7.c || j7Var.b == null) {
            this.a.b();
        }
    }
}
