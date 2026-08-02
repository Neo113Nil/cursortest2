package defpackage;

/* loaded from: classes8.dex */
public final class cmc0 {
    public final String a;
    public final jnc0 b;

    public cmc0(String str, jnc0 jnc0Var) {
        this.a = str;
        this.b = jnc0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cmc0)) {
            return false;
        }
        cmc0 cmc0Var = (cmc0) obj;
        return this.a.equals(cmc0Var.a) && this.b.equals(cmc0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "IndentRules(__typename=" + this.a + ", plaqueIndent=" + this.b + ')';
    }
}
