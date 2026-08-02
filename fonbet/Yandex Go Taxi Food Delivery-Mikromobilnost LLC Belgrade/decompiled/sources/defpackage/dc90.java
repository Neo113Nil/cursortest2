package defpackage;

/* loaded from: classes10.dex */
public final class dc90 {
    public final ib2 a;
    public final int b;
    public final int c;

    public dc90(ib2 ib2Var, int i, int i2) {
        this.a = ib2Var;
        this.b = i;
        this.c = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof dc90) {
            dc90 dc90Var = (dc90) obj;
            if (this.a == dc90Var.a && this.b == dc90Var.b && this.c == dc90Var.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + oyr.b(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ParagraphIntrinsicInfo(intrinsics=");
        sb.append(this.a);
        sb.append(", startIndex=");
        sb.append(this.b);
        sb.append(", endIndex=");
        return oyr.s(sb, this.c, ')');
    }
}
