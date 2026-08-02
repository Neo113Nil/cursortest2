package defpackage;

/* loaded from: classes6.dex */
public final class cnx0 {
    public final String a;
    public final int b;

    public cnx0(String str, int i) {
        this.a = str;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cnx0)) {
            return false;
        }
        cnx0 cnx0Var = (cnx0) obj;
        return jl40.l(this.a, cnx0Var.a) && this.b == cnx0Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
