package yads;

/* loaded from: classes10.dex */
public final class p82 implements by0, r82 {
    public final q82 a;
    public z3 b;

    public p82(q82 q82Var, z3 z3Var) {
        this.a = q82Var;
        this.b = z3Var;
    }

    @Override // yads.r82
    public final void a(boolean z) {
    }

    @Override // yads.by0
    public final void invalidate() {
        this.a.a.remove(this);
        this.b = null;
    }

    @Override // yads.by0
    public final void start() {
        this.a.a.add(this);
    }

    @Override // yads.r82
    public final void a() {
        z3 z3Var = this.b;
        if (z3Var != null) {
            z3Var.b();
        }
        this.a.a.remove(this);
        this.b = null;
    }

    @Override // yads.by0
    public final void pause() {
    }

    @Override // yads.by0
    public final void resume() {
    }
}
