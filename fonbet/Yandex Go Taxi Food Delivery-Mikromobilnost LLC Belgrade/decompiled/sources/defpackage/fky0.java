package defpackage;

/* loaded from: classes11.dex */
public final class fky0 {
    public final int a;
    public final int b;

    public fky0(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fky0)) {
            return false;
        }
        fky0 fky0Var = (fky0) obj;
        return this.a == fky0Var.a && this.b == fky0Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TextAppearances(title=");
        sb.append(this.a);
        sb.append(", subtitle=");
        return oyr.s(sb, this.b, ')');
    }
}
