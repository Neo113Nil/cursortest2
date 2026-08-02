package defpackage;

/* loaded from: classes8.dex */
public final class ohc0 {
    public final String a;
    public final ppc0 b;

    public ohc0(String str, ppc0 ppc0Var) {
        this.a = str;
        this.b = ppc0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ohc0)) {
            return false;
        }
        ohc0 ohc0Var = (ohc0) obj;
        return this.a.equals(ohc0Var.a) && this.b.equals(ohc0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Condition(__typename=" + this.a + ", plaquePredicateTree=" + this.b + ')';
    }
}
