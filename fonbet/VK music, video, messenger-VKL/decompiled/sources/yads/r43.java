package yads;

/* loaded from: classes10.dex */
public final class r43 implements zx2 {
    public final /* synthetic */ zx2 a;
    public final /* synthetic */ s43 b;

    public r43(s43 s43Var, zx2 zx2Var) {
        this.b = s43Var;
        this.a = zx2Var;
    }

    @Override // yads.zx2
    public final xx2 b(long j) {
        xx2 b = this.a.b(j);
        by2 by2Var = b.a;
        long j2 = by2Var.a;
        long j3 = by2Var.b;
        long j4 = this.b.b;
        by2 by2Var2 = new by2(j2, j3 + j4);
        by2 by2Var3 = b.b;
        return new xx2(by2Var2, new by2(by2Var3.a, by2Var3.b + j4));
    }

    @Override // yads.zx2
    public final long c() {
        return this.a.c();
    }

    @Override // yads.zx2
    public final boolean b() {
        return this.a.b();
    }
}
