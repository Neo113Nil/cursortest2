package yads;

/* loaded from: classes10.dex */
public final class s43 implements qq0 {
    public final long b;
    public final qq0 c;

    public s43(long j, qq0 qq0Var) {
        this.b = j;
        this.c = qq0Var;
    }

    @Override // yads.qq0
    public final void a() {
        this.c.a();
    }

    @Override // yads.qq0
    public final void a(zx2 zx2Var) {
        this.c.a(new r43(this, zx2Var));
    }

    @Override // yads.qq0
    public final q83 a(int i, int i2) {
        return this.c.a(i, i2);
    }
}
