package yads;

/* loaded from: classes10.dex */
public final class o82 implements by0, r82 {
    public final q82 a;
    public final ms2 b;

    public o82(q82 q82Var, ms2 ms2Var) {
        this.a = q82Var;
        this.b = ms2Var;
    }

    @Override // yads.r82
    public final void a() {
    }

    @Override // yads.by0
    public final void invalidate() {
        this.a.a.remove(this);
    }

    @Override // yads.by0
    public final void start() {
        this.a.a.add(this);
    }

    @Override // yads.r82
    public final void a(boolean z) {
        if (z) {
            return;
        }
        this.b.a();
        this.a.a.remove(this);
    }

    @Override // yads.by0
    public final void pause() {
    }

    @Override // yads.by0
    public final void resume() {
    }
}
