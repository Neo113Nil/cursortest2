package defpackage;

@gsq0
/* loaded from: classes2.dex */
public final class ju50 implements k260 {
    public static final iu50 Companion = new iu50();
    public final String a;
    public final int b;

    public /* synthetic */ ju50(int i, String str, int i2) {
        if (3 != (i & 3)) {
            qje.Z(i, 3, hu50.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ju50)) {
            return false;
        }
        ju50 ju50Var = (ju50) obj;
        return jl40.l(this.a, ju50Var.a) && this.b == ju50Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NetworkFixWidthTypeModel(type=");
        sb.append(this.a);
        sb.append(", widthFix=");
        return oyr.s(sb, this.b, ')');
    }
}
