package yads;

import android.view.View;

/* loaded from: classes10.dex */
public final class yo2 implements View.OnClickListener {
    public final hl3 a;
    public final t72 b;
    public final wo2 c;

    public yo2(hl3 hl3Var, t72 t72Var, wo2 wo2Var) {
        this.a = hl3Var;
        this.b = t72Var;
        this.c = wo2Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        g82 g82Var = (g82) this.a.b();
        if (g82Var != null) {
            vo2 vo2Var = g82Var.c.a;
            this.c.getClass();
            wo2.a(vo2Var);
            u72 u72Var = this.b.a;
            u72Var.a(u72Var.g);
        }
    }
}
