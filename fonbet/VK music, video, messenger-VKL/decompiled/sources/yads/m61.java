package yads;

/* loaded from: classes10.dex */
public final class m61 implements dy2 {
    public final long a;
    public final li1 b;
    public final li1 c;
    public long d;

    public m61(long j, long j2, long j3) {
        this.d = j;
        this.a = j3;
        li1 li1Var = new li1();
        this.b = li1Var;
        li1 li1Var2 = new li1();
        this.c = li1Var2;
        li1Var.a(0L);
        li1Var2.a(j2);
    }

    @Override // yads.dy2
    public final long a() {
        return this.a;
    }

    @Override // yads.zx2
    public final boolean b() {
        return true;
    }

    @Override // yads.zx2
    public final long c() {
        return this.d;
    }

    @Override // yads.dy2
    public final long a(long j) {
        return this.b.a(mc3.a(this.c, j));
    }

    @Override // yads.zx2
    public final xx2 b(long j) {
        int a = mc3.a(this.b, j);
        long a2 = this.b.a(a);
        by2 by2Var = new by2(a2, this.c.a(a));
        if (a2 != j) {
            li1 li1Var = this.b;
            if (a != li1Var.a - 1) {
                int i = a + 1;
                return new xx2(by2Var, new by2(li1Var.a(i), this.c.a(i)));
            }
        }
        return new xx2(by2Var, by2Var);
    }

    public final boolean c(long j) {
        li1 li1Var = this.b;
        return j - li1Var.a(li1Var.a - 1) < 100000;
    }
}
