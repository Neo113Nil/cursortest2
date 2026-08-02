package yads;

/* loaded from: classes10.dex */
public final class ls2 implements c2 {
    public final /* synthetic */ ns2 a;

    public ls2(ns2 ns2Var) {
        this.a = ns2Var;
    }

    @Override // yads.c2
    public final void a() {
        by0 by0Var = this.a.i;
        if (by0Var != null) {
            by0Var.resume();
        }
    }

    @Override // yads.c2
    public final void b() {
        by0 by0Var = this.a.i;
        if (by0Var != null) {
            by0Var.pause();
        }
    }
}
