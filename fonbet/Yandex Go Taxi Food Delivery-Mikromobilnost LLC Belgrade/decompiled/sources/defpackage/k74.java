package defpackage;

/* loaded from: classes10.dex */
public final class k74 {
    public final i94 a;
    public final n34 b;
    public final int c;

    public k74(i94 i94Var, n34 n34Var, int i) {
        this.a = i94Var;
        this.b = n34Var;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof k74) {
            k74 k74Var = (k74) obj;
            if (this.a.equals(k74Var.a) && this.b.equals(k74Var.b) && this.c == k74Var.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.c ^ ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MediaSpec{videoSpec=");
        sb.append(this.a);
        sb.append(", audioSpec=");
        sb.append(this.b);
        sb.append(", outputFormat=");
        return oyr.m(this.c, "}", sb);
    }
}
