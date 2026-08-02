package defpackage;

@gsq0
/* loaded from: classes2.dex */
public final class cs50 implements xy50 {
    public static final bs50 Companion = new bs50();
    public final String a;
    public final double b;

    public /* synthetic */ cs50(double d, int i, String str) {
        if (3 != (i & 3)) {
            qje.Z(i, 3, as50.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cs50)) {
            return false;
        }
        cs50 cs50Var = (cs50) obj;
        return jl40.l(this.a, cs50Var.a) && Double.compare(this.b, cs50Var.b) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NetworkDoubleArgumentModel(type=");
        sb.append(this.a);
        sb.append(", argValue=");
        return unr0.q(sb, this.b, ')');
    }
}
