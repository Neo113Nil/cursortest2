package defpackage;

import java.math.RoundingMode;

/* loaded from: classes10.dex */
public final class p941 implements f7q0 {
    public final lhc0 a;
    public final int b;
    public final long c;
    public final long d;
    public final long e;

    public p941(lhc0 lhc0Var, int i, long j, long j2) {
        this.a = lhc0Var;
        this.b = i;
        this.c = j;
        long j3 = (j2 - j) / lhc0Var.d;
        this.d = j3;
        this.e = a(j3);
    }

    public final long a(long j) {
        long j2 = j * this.b;
        long j3 = this.a.c;
        int i = tw21.a;
        return tw21.e0(j2, 1000000L, j3, RoundingMode.DOWN);
    }

    @Override // defpackage.f7q0
    public final e7q0 b(long j) {
        lhc0 lhc0Var = this.a;
        long j2 = this.d - 1;
        long j3 = tw21.j((lhc0Var.c * j) / (this.b * 1000000), 0L, j2);
        int i = lhc0Var.d;
        long j4 = this.c;
        long a = a(j3);
        h7q0 h7q0Var = new h7q0(a, (i * j3) + j4);
        if (a >= j || j3 == j2) {
            return new e7q0(h7q0Var, h7q0Var);
        }
        long j5 = j3 + 1;
        return new e7q0(h7q0Var, new h7q0(a(j5), (i * j5) + j4));
    }

    @Override // defpackage.f7q0
    public final boolean c() {
        return true;
    }

    @Override // defpackage.f7q0
    public final long k() {
        return this.e;
    }
}
