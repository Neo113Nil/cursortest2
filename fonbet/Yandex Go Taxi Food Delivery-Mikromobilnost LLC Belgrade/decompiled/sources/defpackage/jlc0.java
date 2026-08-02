package defpackage;

/* loaded from: classes8.dex */
public final class jlc0 {
    public final String a;
    public final juc0 b;

    public jlc0(String str, juc0 juc0Var) {
        this.a = str;
        this.b = juc0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jlc0)) {
            return false;
        }
        jlc0 jlc0Var = (jlc0) obj;
        return this.a.equals(jlc0Var.a) && this.b.equals(jlc0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "WidgetsLevel(__typename=" + this.a + ", plaqueWidgetsLevel=" + this.b + ')';
    }
}
