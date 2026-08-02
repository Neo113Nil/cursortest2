package yads;

/* loaded from: classes10.dex */
public final class lc0 {
    public final fu a;
    public final mp2 b;
    public final uo c;
    public final i30 d;
    public final long e;
    public final long f;

    public lc0(long j, mp2 mp2Var, uo uoVar, fu fuVar, long j2, i30 i30Var) {
        this.e = j;
        this.b = mp2Var;
        this.c = uoVar;
        this.f = j2;
        this.a = fuVar;
        this.d = i30Var;
    }

    public final lc0 a(long j, mp2 mp2Var) {
        long a;
        long a2;
        i30 d = this.b.d();
        i30 d2 = mp2Var.d();
        if (d == null) {
            return new lc0(j, mp2Var, this.c, this.a, this.f, d);
        }
        if (!d.a()) {
            return new lc0(j, mp2Var, this.c, this.a, this.f, d2);
        }
        long c = d.c(j);
        if (c == 0) {
            return new lc0(j, mp2Var, this.c, this.a, this.f, d2);
        }
        long b = d.b();
        long a3 = d.a(b);
        long j2 = c + b;
        long j3 = j2 - 1;
        long b2 = d.b(j3, j) + d.a(j3);
        long b3 = d2.b();
        long a4 = d2.a(b3);
        long j4 = this.f;
        if (b2 == a4) {
            a = j2 - b3;
        } else {
            if (b2 < a4) {
                throw new zo();
            }
            if (a4 < a3) {
                a2 = j4 - (d2.a(a3, j) - b);
                return new lc0(j, mp2Var, this.c, this.a, a2, d2);
            }
            a = d.a(a4, j) - b3;
        }
        a2 = a + j4;
        return new lc0(j, mp2Var, this.c, this.a, a2, d2);
    }

    public final long a(long j) {
        return this.d.b(j - this.f, this.e) + this.d.a(j - this.f);
    }
}
