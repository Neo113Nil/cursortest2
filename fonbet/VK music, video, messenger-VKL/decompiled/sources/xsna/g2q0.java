package xsna;

/* compiled from: UmpError.kt */
/* loaded from: classes2.dex */
public final class g2q0 {
    public static final g2q0 c = new g2q0(-1, "Consent info request canceled");
    public final int a;
    public final String b;

    public g2q0(int i, String str) {
        this.a = i;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g2q0)) {
            return false;
        }
        g2q0 g2q0Var = (g2q0) obj;
        return this.a == g2q0Var.a && epx.f(this.b, g2q0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("UmpError(code=");
        sb.append(this.a);
        sb.append(", message=");
        return ho8.a(sb, this.b, ')');
    }
}
