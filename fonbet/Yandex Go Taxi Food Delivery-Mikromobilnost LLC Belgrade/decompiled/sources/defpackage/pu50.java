package defpackage;

@gsq0
/* loaded from: classes2.dex */
public final class pu50 {
    public static final ou50 Companion = new ou50();
    public final String a;
    public final double b;

    public /* synthetic */ pu50(double d, int i, String str) {
        if (3 != (i & 3)) {
            qje.Z(i, 3, nu50.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pu50)) {
            return false;
        }
        pu50 pu50Var = (pu50) obj;
        return jl40.l(this.a, pu50Var.a) && Double.compare(this.b, pu50Var.b) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NetworkGradientColorModel(color=");
        sb.append(this.a);
        sb.append(", position=");
        return unr0.q(sb, this.b, ')');
    }
}
