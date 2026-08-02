package yads;

/* loaded from: classes10.dex */
public final class vs2 implements c2 {
    public final z52 a;

    public vs2(z52 z52Var) {
        this.a = z52Var;
    }

    @Override // yads.c2
    public final void a() {
        by0 by0Var = this.a.b;
        if (by0Var != null) {
            by0Var.resume();
        }
    }

    @Override // yads.c2
    public final void b() {
        by0 by0Var = this.a.b;
        if (by0Var != null) {
            by0Var.pause();
        }
    }
}
