package xsna;

/* compiled from: ShareVariant.kt */
/* loaded from: classes7.dex */
public final class n9j0 {
    public final int a;
    public final int b;
    public final String c;

    public n9j0(int i, int i2, String str) {
        this.a = i;
        this.b = i2;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n9j0)) {
            return false;
        }
        n9j0 n9j0Var = (n9j0) obj;
        return this.a == n9j0Var.a && this.b == n9j0Var.b && this.c.equals(n9j0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + shy.a(this.b, Integer.hashCode(this.a) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ShareVariant(titleId=");
        sb.append(this.a);
        sb.append(", iconId=");
        sb.append(this.b);
        sb.append(", packageName=");
        return ho8.a(sb, this.c, ')');
    }
}
