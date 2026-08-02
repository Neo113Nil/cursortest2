package defpackage;

import androidx.media3.exoplayer.source.BehindLiveWindowException;

/* loaded from: classes10.dex */
public final class i9h {
    public final /* synthetic */ int a;
    public final osb b;
    public final s4j0 c;
    public final ic5 d;
    public final pgg e;
    public final long f;
    public final long g;

    public /* synthetic */ i9h(long j, s4j0 s4j0Var, ic5 ic5Var, osb osbVar, long j2, pgg pggVar, int i) {
        this.a = i;
        this.f = j;
        this.c = s4j0Var;
        this.d = ic5Var;
        this.g = j2;
        this.b = osbVar;
        this.e = pggVar;
    }

    public i9h a(long j, s4j0 s4j0Var) {
        long t;
        long t2;
        pgg b = this.c.b();
        pgg b2 = s4j0Var.b();
        if (b == null) {
            return new i9h(j, s4j0Var, this.d, this.b, this.g, b, 0);
        }
        if (!b.P()) {
            return new i9h(j, s4j0Var, this.d, this.b, this.g, b2, 0);
        }
        long x = b.x(j);
        if (x == 0) {
            return new i9h(j, s4j0Var, this.d, this.b, this.g, b2, 0);
        }
        d6z.z(b2);
        long C = b.C();
        long f = b.f(C);
        long j2 = x + C;
        long j3 = j2 - 1;
        long h = b.h(j3, j) + b.f(j3);
        long C2 = b2.C();
        long f2 = b2.f(C2);
        long j4 = this.g;
        if (h == f2) {
            t = j2 - C2;
        } else {
            if (h < f2) {
                throw new BehindLiveWindowException();
            }
            if (f2 < f) {
                t2 = j4 - (b2.t(f, j) - C);
                long j5 = t2;
                return new i9h(j, s4j0Var, this.d, this.b, j5, b2, 0);
            }
            t = b.t(f2, j) - C2;
        }
        t2 = t + j4;
        long j52 = t2;
        return new i9h(j, s4j0Var, this.d, this.b, j52, b2, 0);
    }

    public i9h b(long j, s4j0 s4j0Var) {
        long t;
        long t2;
        pgg b = this.c.b();
        pgg b2 = s4j0Var.b();
        if (b == null) {
            return new i9h(j, s4j0Var, this.d, this.b, this.g, b, 1);
        }
        if (!b.P()) {
            return new i9h(j, s4j0Var, this.d, this.b, this.g, b2, 1);
        }
        long x = b.x(j);
        if (x == 0) {
            return new i9h(j, s4j0Var, this.d, this.b, this.g, b2, 1);
        }
        d6z.z(b2);
        long C = b.C();
        long f = b.f(C);
        long j2 = x + C;
        long j3 = j2 - 1;
        long h = b.h(j3, j) + b.f(j3);
        long C2 = b2.C();
        long f2 = b2.f(C2);
        long j4 = this.g;
        if (h == f2) {
            t = j2 - C2;
        } else {
            if (h < f2) {
                throw new BehindLiveWindowException();
            }
            if (f2 < f) {
                t2 = j4 - (b2.t(f, j) - C);
                long j5 = t2;
                return new i9h(j, s4j0Var, this.d, this.b, j5, b2, 1);
            }
            t = b.t(f2, j) - C2;
        }
        t2 = t + j4;
        long j52 = t2;
        return new i9h(j, s4j0Var, this.d, this.b, j52, b2, 1);
    }

    public final long c(long j) {
        long i;
        int i2 = this.a;
        long j2 = this.g;
        long j3 = this.f;
        pgg pggVar = this.e;
        switch (i2) {
            case 0:
                d6z.z(pggVar);
                i = pggVar.i(j3, j);
                break;
            default:
                d6z.z(pggVar);
                i = pggVar.i(j3, j);
                break;
        }
        return i + j2;
    }

    public final long d(long j) {
        long c;
        long R;
        int i = this.a;
        long j2 = this.f;
        pgg pggVar = this.e;
        switch (i) {
            case 0:
                c = c(j);
                d6z.z(pggVar);
                R = pggVar.R(j2, j);
                break;
            default:
                c = c(j);
                d6z.z(pggVar);
                R = pggVar.R(j2, j);
                break;
        }
        return (R + c) - 1;
    }

    public final long e() {
        int i = this.a;
        long j = this.f;
        pgg pggVar = this.e;
        switch (i) {
            case 0:
                d6z.z(pggVar);
                break;
            default:
                d6z.z(pggVar);
                break;
        }
        return pggVar.x(j);
    }

    public final long f(long j) {
        long g;
        long h;
        int i = this.a;
        long j2 = this.f;
        long j3 = this.g;
        pgg pggVar = this.e;
        switch (i) {
            case 0:
                g = g(j);
                d6z.z(pggVar);
                h = pggVar.h(j - j3, j2);
                break;
            default:
                g = g(j);
                d6z.z(pggVar);
                h = pggVar.h(j - j3, j2);
                break;
        }
        return h + g;
    }

    public final long g(long j) {
        int i = this.a;
        long j2 = this.g;
        pgg pggVar = this.e;
        switch (i) {
            case 0:
                d6z.z(pggVar);
                break;
            default:
                d6z.z(pggVar);
                break;
        }
        return pggVar.f(j - j2);
    }

    public final boolean h(long j, long j2) {
        int i = this.a;
        pgg pggVar = this.e;
        switch (i) {
            case 0:
                d6z.z(pggVar);
                if (pggVar.P() || j2 == -9223372036854775807L || f(j) <= j2) {
                    break;
                }
                break;
            default:
                d6z.z(pggVar);
                if (pggVar.P() || j2 == -9223372036854775807L || f(j) <= j2) {
                    break;
                }
                break;
        }
        return true;
    }
}
