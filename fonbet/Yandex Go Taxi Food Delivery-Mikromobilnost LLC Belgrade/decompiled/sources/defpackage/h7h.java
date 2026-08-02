package defpackage;

/* loaded from: classes10.dex */
public final class h7h {
    public final long a;
    public final long b;
    public final long c;
    public final long d;

    public h7h(long j, long j2, long j3, long j4) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || h7h.class != obj.getClass()) {
            return false;
        }
        h7h h7hVar = (h7h) obj;
        return ldc.c(this.a, h7hVar.a) && ldc.c(this.b, h7hVar.b) && ldc.c(this.c, h7hVar.c) && ldc.c(this.d, h7hVar.d);
    }

    public final int hashCode() {
        int i = ldc.n;
        return Long.hashCode(this.d) + qv10.c(qv10.c(Long.hashCode(this.a) * 31, 31, this.b), 31, this.c);
    }
}
