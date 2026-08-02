package xsna;

/* compiled from: WriteColorScheme.kt */
/* loaded from: classes17.dex */
public final class d2y0 {
    public final long a;
    public final long b;
    public final long c;
    public final long d;

    public d2y0(long j, long j2, long j3, long j4) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d2y0)) {
            return false;
        }
        d2y0 d2y0Var = (d2y0) obj;
        return l5g.d(this.a, d2y0Var.a) && l5g.d(this.b, d2y0Var.b) && l5g.d(this.c, d2y0Var.c) && l5g.d(this.d, d2y0Var.d);
    }

    public final int hashCode() {
        int i = l5g.l;
        return Long.hashCode(this.d) + bh10.a(bh10.a(Long.hashCode(this.a) * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("WriteColorScheme(writeBarIcon=");
        dn.h(this.a, ", writeBarInputBackground=", sb);
        dn.h(this.b, ", writeBarInputBorder=", sb);
        dn.h(this.c, ", writeBarInputBorderAlpha=", sb);
        return pm0.d(')', this.d, sb);
    }
}
