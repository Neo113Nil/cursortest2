package yads;

/* loaded from: classes10.dex */
public final class y72 implements by0, o72 {
    public final f72 a;
    public final uk2 b;
    public final tk2 c;
    public final u2 d;

    public y72(f72 f72Var, y52 y52Var, tk2 tk2Var, u2 u2Var) {
        this.a = f72Var;
        this.b = y52Var;
        this.c = tk2Var;
        this.d = u2Var;
    }

    @Override // yads.o72
    public final void a(long j, long j2) {
        long j3 = j2 + this.c.a;
        long a = this.d.a(j);
        if (j3 < a) {
            this.b.a(a, j3);
        } else {
            invalidate();
            this.b.a();
        }
    }

    @Override // yads.o72
    public final void b() {
        this.b.a();
        invalidate();
    }

    @Override // yads.by0
    public final void invalidate() {
        this.a.a.remove(this);
    }

    @Override // yads.by0
    public final void start() {
        this.a.a.add(this);
    }

    @Override // yads.o72
    public final void a() {
        this.b.a();
        invalidate();
    }

    @Override // yads.by0
    public final void pause() {
    }

    @Override // yads.by0
    public final void resume() {
    }
}
