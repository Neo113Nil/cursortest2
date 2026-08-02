package defpackage;

@gsq0
/* loaded from: classes2.dex */
public final class ov50 {
    public static final nv50 Companion = new nv50();
    public final int a;
    public final int b;
    public final int c;
    public final int d;

    public /* synthetic */ ov50(int i, int i2, int i3, int i4, int i5) {
        if (15 != (i & 15)) {
            qje.Z(i, 15, mv50.a.getDescriptor());
            throw null;
        }
        this.a = i2;
        this.b = i3;
        this.c = i4;
        this.d = i5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ov50)) {
            return false;
        }
        ov50 ov50Var = (ov50) obj;
        return this.a == ov50Var.a && this.b == ov50Var.b && this.c == ov50Var.c && this.d == ov50Var.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + oyr.b(this.c, oyr.b(this.b, Integer.hashCode(this.a) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NetworkIndentsModel(left=");
        sb.append(this.a);
        sb.append(", top=");
        sb.append(this.b);
        sb.append(", right=");
        sb.append(this.c);
        sb.append(", bottom=");
        return oyr.s(sb, this.d, ')');
    }
}
