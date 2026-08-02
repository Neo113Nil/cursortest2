package xsna;

/* compiled from: TransparentColorScheme.kt */
/* loaded from: classes17.dex */
public final class kop0 {
    public final long a;
    public final long b;
    public final long c;

    public kop0(long j, long j2, long j3) {
        this.a = j;
        this.b = j2;
        this.c = j3;
    }

    public final long a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kop0)) {
            return false;
        }
        kop0 kop0Var = (kop0) obj;
        return l5g.d(this.a, kop0Var.a) && l5g.d(this.b, kop0Var.b) && l5g.d(this.c, kop0Var.c);
    }

    public final int hashCode() {
        int i = l5g.l;
        return Long.hashCode(this.c) + bh10.a(Long.hashCode(this.a) * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TransparentColorScheme(transparent=");
        dn.h(this.a, ", transparentActive=", sb);
        dn.h(this.b, ", transparentHover=", sb);
        return pm0.d(')', this.c, sb);
    }
}
