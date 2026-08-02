package defpackage;

/* loaded from: classes2.dex */
public final class pgx0 {
    public final String a;
    public final ct60 b;

    public pgx0(String str, ct60 ct60Var) {
        this.a = str;
        this.b = ct60Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pgx0)) {
            return false;
        }
        pgx0 pgx0Var = (pgx0) obj;
        return this.a.equals(pgx0Var.a) && this.b.equals(pgx0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "CommonPrice(__typename=" + this.a + ", offerPrice=" + this.b + ')';
    }
}
