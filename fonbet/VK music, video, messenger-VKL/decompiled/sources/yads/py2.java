package yads;

/* loaded from: classes10.dex */
public final class py2 extends bt2 {
    public final rr i;
    public final ny2 j;
    public final byte[] k;
    public final bs l;

    public py2(oy2 oy2Var, rr rrVar, ny2 ny2Var, byte[] bArr) {
        this.i = rrVar;
        this.j = ny2Var;
        this.k = bArr;
        this.l = new bs(rrVar, oy2Var.c, bArr, ny2Var);
    }

    @Override // yads.bt2
    public final void a() {
        this.l.j = true;
    }

    @Override // yads.bt2
    public final Object b() {
        float f;
        this.l.a();
        ny2 ny2Var = this.j;
        if (ny2Var == null) {
            return null;
        }
        int i = ny2Var.e + 1;
        ny2Var.e = i;
        rj0 rj0Var = ny2Var.a;
        long j = ny2Var.b;
        long j2 = ny2Var.d;
        if (j == -1 || j == 0) {
            int i2 = ny2Var.c;
            f = i2 != 0 ? (i * 100.0f) / i2 : -1.0f;
        } else {
            f = (j2 * 100.0f) / j;
        }
        ((mj0) rj0Var).a(j, j2, f);
        return null;
    }
}
