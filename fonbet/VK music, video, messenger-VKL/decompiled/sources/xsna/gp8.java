package xsna;

/* compiled from: Button.kt */
/* loaded from: classes11.dex */
public final class gp8 {
    public final long a;
    public final long b;
    public final long c;
    public final long d;

    public gp8(long j, long j2, long j3, long j4) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof gp8)) {
            return false;
        }
        gp8 gp8Var = (gp8) obj;
        return l5g.d(this.a, gp8Var.a) && l5g.d(this.b, gp8Var.b) && l5g.d(this.c, gp8Var.c) && l5g.d(this.d, gp8Var.d);
    }

    public final int hashCode() {
        int i = l5g.l;
        return Long.hashCode(this.d) + bh10.a(bh10.a(Long.hashCode(this.a) * 31, 31, this.b), 31, this.c);
    }
}
