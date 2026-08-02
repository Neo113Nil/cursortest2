package xsna;

/* compiled from: ButtonColorScheme.kt */
/* loaded from: classes17.dex */
public final class fp8 {
    public final long a;
    public final long b;
    public final long c;

    public fp8(long j, long j2, long j3) {
        this.a = j;
        this.b = j2;
        this.c = j3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fp8)) {
            return false;
        }
        fp8 fp8Var = (fp8) obj;
        return l5g.d(this.a, fp8Var.a) && l5g.d(this.b, fp8Var.b) && l5g.d(this.c, fp8Var.c);
    }

    public final int hashCode() {
        int i = l5g.l;
        return Long.hashCode(this.c) + bh10.a(Long.hashCode(this.a) * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ButtonColorScheme(buttonIcon=");
        dn.h(this.a, ", buttonStroke=", sb);
        dn.h(this.b, ", buttonText=", sb);
        return pm0.d(')', this.c, sb);
    }
}
