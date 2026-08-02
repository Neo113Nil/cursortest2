package xsna;

/* compiled from: SeparatorColorScheme.kt */
/* loaded from: classes17.dex */
public final class jki0 {
    public final long a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;

    public jki0(long j, long j2, long j3, long j4, long j5) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
        this.e = j5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jki0)) {
            return false;
        }
        jki0 jki0Var = (jki0) obj;
        return l5g.d(this.a, jki0Var.a) && l5g.d(this.b, jki0Var.b) && l5g.d(this.c, jki0Var.c) && l5g.d(this.d, jki0Var.d) && l5g.d(this.e, jki0Var.e);
    }

    public final int hashCode() {
        int i = l5g.l;
        return Long.hashCode(this.e) + bh10.a(bh10.a(bh10.a(Long.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SeparatorColorScheme(separatorPrimary=");
        dn.h(this.a, ", separatorPrimary2x=", sb);
        dn.h(this.b, ", separatorPrimary3x=", sb);
        dn.h(this.c, ", separatorPrimaryAlpha=", sb);
        dn.h(this.d, ", separatorSecondary=", sb);
        return pm0.d(')', this.e, sb);
    }
}
