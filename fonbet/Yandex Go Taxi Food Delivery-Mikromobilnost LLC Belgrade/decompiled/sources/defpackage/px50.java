package defpackage;

@gsq0
/* loaded from: classes2.dex */
public final class px50 implements ry50 {
    public static final ox50 Companion = new ox50();
    public final String a;
    public final int b;

    public /* synthetic */ px50(int i, String str, int i2) {
        if (3 != (i & 3)) {
            qje.Z(i, 3, nx50.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof px50)) {
            return false;
        }
        px50 px50Var = (px50) obj;
        return jl40.l(this.a, px50Var.a) && this.b == px50Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NetworkNotPredicateModel(type=");
        sb.append(this.a);
        sb.append(", predicateIndex=");
        return oyr.s(sb, this.b, ')');
    }
}
