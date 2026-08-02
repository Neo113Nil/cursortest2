package yads;

/* loaded from: classes10.dex */
public final class nt1 implements ot2 {
    public final ot2 b;
    public final long c;

    public nt1(ot2 ot2Var, long j) {
        this.b = ot2Var;
        this.c = j;
    }

    @Override // yads.ot2
    public final void a() {
        this.b.a();
    }

    @Override // yads.ot2
    public final boolean isReady() {
        return this.b.isReady();
    }

    @Override // yads.ot2
    public final int a(ox0 ox0Var, sa0 sa0Var, int i) {
        int a = this.b.a(ox0Var, sa0Var, i);
        if (a == -4) {
            sa0Var.f = Math.max(0L, sa0Var.f + this.c);
        }
        return a;
    }

    @Override // yads.ot2
    public final int a(long j) {
        return this.b.a(j - this.c);
    }
}
