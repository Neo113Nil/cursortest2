package defpackage;

/* loaded from: classes7.dex */
public final class cq81 implements dg81 {
    public final dg81 a;
    public final long b;

    public cq81(dg81 dg81Var, long j) {
        this.a = dg81Var;
        this.b = j;
    }

    @Override // defpackage.dg81
    public final void a() {
        this.a.a();
    }

    @Override // defpackage.dg81
    public final int b(og81 og81Var, yh81 yh81Var, int i) {
        int b = this.a.b(og81Var, yh81Var, i);
        if (b == -4) {
            yh81Var.x = Math.max(0L, yh81Var.x + this.b);
        }
        return b;
    }

    @Override // defpackage.dg81
    public final boolean c() {
        return this.a.c();
    }

    @Override // defpackage.dg81
    public final int d(long j) {
        return this.a.d(j - this.b);
    }
}
