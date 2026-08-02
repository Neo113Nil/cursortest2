package yads;

/* loaded from: classes10.dex */
public final class e72 implements by0, o72 {
    public final f72 a;
    public final Long b;
    public z3 c;
    public uk2 d;

    public e72(f72 f72Var, z3 z3Var, uk2 uk2Var, Long l) {
        this.a = f72Var;
        this.b = l;
        this.c = z3Var;
        this.d = uk2Var;
    }

    @Override // yads.o72
    public final void a(long j, long j2) {
        uk2 uk2Var = this.d;
        if (uk2Var != null) {
            uk2Var.a(j, j2);
        }
        Long l = this.b;
        if (l == null || j2 <= l.longValue()) {
            return;
        }
        uk2 uk2Var2 = this.d;
        if (uk2Var2 != null) {
            uk2Var2.a();
        }
        z3 z3Var = this.c;
        if (z3Var != null) {
            z3Var.b();
        }
        this.a.a.remove(this);
        this.c = null;
        this.d = null;
    }

    @Override // yads.o72
    public final void b() {
        uk2 uk2Var = this.d;
        if (uk2Var != null) {
            uk2Var.a();
        }
        z3 z3Var = this.c;
        if (z3Var != null) {
            z3Var.b();
        }
        this.a.a.remove(this);
        this.c = null;
        this.d = null;
    }

    @Override // yads.by0
    public final void invalidate() {
        this.a.a.remove(this);
        this.c = null;
        this.d = null;
    }

    @Override // yads.by0
    public final void start() {
        this.a.a.add(this);
    }

    @Override // yads.o72
    public final void a() {
        z3 z3Var = this.c;
        if (z3Var != null) {
            z3Var.a();
        }
        this.c = null;
    }

    @Override // yads.by0
    public final void pause() {
    }

    @Override // yads.by0
    public final void resume() {
    }
}
