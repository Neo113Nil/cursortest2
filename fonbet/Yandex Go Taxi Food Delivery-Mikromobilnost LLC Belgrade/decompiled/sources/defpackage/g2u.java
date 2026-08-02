package defpackage;

/* loaded from: classes2.dex */
public final class g2u {
    public final String a;
    public final jnc0 b;

    public g2u(String str, jnc0 jnc0Var) {
        this.a = str;
        this.b = jnc0Var;
    }

    public final jnc0 a() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g2u)) {
            return false;
        }
        g2u g2uVar = (g2u) obj;
        return this.a.equals(g2uVar.a) && this.b.equals(g2uVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "IndentRules(__typename=" + this.a + ", plaqueIndent=" + this.b + ')';
    }
}
