package defpackage;

/* loaded from: classes10.dex */
public final class jl10 {
    public final long a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;
    public final long f;
    public final long g;
    public final long h;
    public final long i;
    public final long j;
    public final long k;
    public final long l;

    public jl10(long j, long j2, long j3, long j4, long j5, long j6) {
        long j7 = ldc.m;
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
        this.e = j5;
        this.f = j6;
        this.g = j7;
        this.h = j7;
        this.i = j7;
        this.j = j7;
        this.k = j7;
        this.l = j7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof jl10)) {
            return false;
        }
        jl10 jl10Var = (jl10) obj;
        return ldc.c(this.a, jl10Var.a) && ldc.c(this.g, jl10Var.g) && ldc.c(this.b, jl10Var.b) && ldc.c(this.c, jl10Var.c) && ldc.c(this.d, jl10Var.d) && ldc.c(this.e, jl10Var.e) && ldc.c(this.f, jl10Var.f) && ldc.c(this.h, jl10Var.h) && ldc.c(this.i, jl10Var.i) && ldc.c(this.j, jl10Var.j) && ldc.c(this.k, jl10Var.k) && ldc.c(this.l, jl10Var.l);
    }

    public final int hashCode() {
        int i = ldc.n;
        return Long.hashCode(this.l) + qv10.c(qv10.c(qv10.c(qv10.c(qv10.c(qv10.c(qv10.c(qv10.c(qv10.c(qv10.c(Long.hashCode(this.a) * 31, 31, this.g), 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.h), 31, this.i), 31, this.j), 31, this.k);
    }
}
