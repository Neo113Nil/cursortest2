package defpackage;

import android.view.View;

/* loaded from: classes13.dex */
public abstract class kx31 extends wys {
    public final t4s0 R;
    public String S;

    public kx31(View view, t4s0 t4s0Var) {
        super(view);
        this.R = t4s0Var;
    }

    @Override // defpackage.wys
    public void Y() {
        super.Y();
        String str = this.S;
        if (str != null) {
            ((u4s0) this.R).c(str);
        }
        this.S = null;
    }

    public final void c0(hx31 hx31Var) {
        boolean l = jl40.l(this.S, hx31Var.c());
        t4s0 t4s0Var = this.R;
        if (!l) {
            String str = this.S;
            if (str != null) {
                ((u4s0) t4s0Var).c(str);
            }
            this.S = hx31Var.c();
        }
        u4s0 u4s0Var = (u4s0) t4s0Var;
        u4s0Var.d(this.a, hx31Var.c());
    }
}
