package xsna;

/* compiled from: IconButton.kt */
/* loaded from: classes11.dex */
public final class lpv {
    public final long a;
    public final long b;
    public final long c;
    public final long d;

    public lpv(long j, long j2, long j3, long j4) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof lpv)) {
            return false;
        }
        lpv lpvVar = (lpv) obj;
        return l5g.d(this.a, lpvVar.a) && l5g.d(this.b, lpvVar.b) && l5g.d(this.c, lpvVar.c) && l5g.d(this.d, lpvVar.d);
    }

    public final int hashCode() {
        int i = l5g.l;
        return Long.hashCode(this.d) + bh10.a(bh10.a(Long.hashCode(this.a) * 31, 31, this.b), 31, this.c);
    }
}
