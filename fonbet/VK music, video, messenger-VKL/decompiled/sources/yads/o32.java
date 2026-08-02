package yads;

import android.view.ViewGroup;

/* loaded from: classes10.dex */
public final class o32 implements zf0 {
    public final q32 a;

    public o32(p32 p32Var) {
        this.a = p32Var.a();
    }

    @Override // yads.zf0
    public final void a(ViewGroup viewGroup) {
        q32 q32Var = this.a;
        if (q32Var != null) {
            q32Var.a.a.add(q32Var);
        }
    }

    @Override // yads.zf0
    public final void c() {
        q32 q32Var = this.a;
        if (q32Var != null) {
            q32Var.a.a.remove(q32Var);
            q32Var.b = null;
        }
    }

    public /* synthetic */ o32(e52 e52Var, pi3 pi3Var) {
        this(new p32(pi3Var, e52Var));
    }
}
