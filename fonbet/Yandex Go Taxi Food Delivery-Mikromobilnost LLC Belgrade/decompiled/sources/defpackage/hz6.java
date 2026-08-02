package defpackage;

/* loaded from: classes10.dex */
public final class hz6 {
    public final long a;
    public final long b;
    public final long c;
    public final long d;

    public hz6(long j, long j2, long j3, long j4) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
    }

    public final hz6 a(long j, long j2, long j3, long j4) {
        return new hz6(j != 16 ? j : this.a, j2 != 16 ? j2 : this.b, j3 != 16 ? j3 : this.c, j4 != 16 ? j4 : this.d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof hz6)) {
            return false;
        }
        hz6 hz6Var = (hz6) obj;
        return ldc.c(this.a, hz6Var.a) && ldc.c(this.b, hz6Var.b) && ldc.c(this.c, hz6Var.c) && ldc.c(this.d, hz6Var.d);
    }

    public final int hashCode() {
        int i = ldc.n;
        return Long.hashCode(this.d) + qv10.c(qv10.c(Long.hashCode(this.a) * 31, 31, this.b), 31, this.c);
    }
}
