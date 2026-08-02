package defpackage;

@gsq0
/* loaded from: classes2.dex */
public final class ixt {
    public static final hxt Companion = new hxt();
    public final String a;
    public final double b;
    public final double c;

    public /* synthetic */ ixt(double d, double d2, int i, String str) {
        if (7 != (i & 7)) {
            qje.Z(i, 7, gxt.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = d;
        this.c = d2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ixt)) {
            return false;
        }
        ixt ixtVar = (ixt) obj;
        return jl40.l(this.a, ixtVar.a) && Double.compare(this.b, ixtVar.b) == 0 && Double.compare(this.c, ixtVar.c) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.c) + unr0.a(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GradientColorResponse(hex=");
        sb.append(this.a);
        sb.append(", alpha=");
        sb.append(this.b);
        sb.append(", location=");
        return unr0.q(sb, this.c, ')');
    }
}
