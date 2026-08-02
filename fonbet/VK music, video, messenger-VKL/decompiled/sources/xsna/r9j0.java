package xsna;

/* compiled from: ShareViewState.kt */
/* loaded from: classes7.dex */
public final class r9j0 {
    public final int a;
    public final int b;

    public r9j0(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r9j0)) {
            return false;
        }
        r9j0 r9j0Var = (r9j0) obj;
        return this.a == r9j0Var.a && this.b == r9j0Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ShareVariantVs(titleId=");
        sb.append(this.a);
        sb.append(", iconId=");
        return vu5.b(sb, this.b, ')');
    }
}
