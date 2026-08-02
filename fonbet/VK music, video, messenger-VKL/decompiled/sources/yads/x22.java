package yads;

import android.view.View;

/* loaded from: classes10.dex */
public final class x22 implements yb {
    public final k62 a;

    public x22(k62 k62Var) {
        this.a = k62Var;
    }

    @Override // yads.yb
    public final boolean a() {
        View a;
        m22 m22Var = ((l22) this.a).d;
        return (m22Var == null || (a = m22Var.c.a()) == null || om3.a.a(a).a < 1) ? false : true;
    }
}
