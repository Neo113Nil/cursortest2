package defpackage;

/* loaded from: classes10.dex */
public final class ec8 {
    public final long a;
    public final long b;
    public final long c;
    public final long d;

    public ec8(long j, long j2, long j3, long j4) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof ec8)) {
            return false;
        }
        ec8 ec8Var = (ec8) obj;
        return ldc.c(this.a, ec8Var.a) && ldc.c(this.b, ec8Var.b) && ldc.c(this.c, ec8Var.c) && ldc.c(this.d, ec8Var.d);
    }

    public final int hashCode() {
        int i = ldc.n;
        return Long.hashCode(this.d) + qv10.c(qv10.c(Long.hashCode(this.a) * 31, 31, this.b), 31, this.c);
    }
}
