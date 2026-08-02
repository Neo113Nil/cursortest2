package yads;

/* loaded from: classes10.dex */
public final class lz implements c2 {
    public final /* synthetic */ mz a;

    public lz(mz mzVar) {
        this.a = mzVar;
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
