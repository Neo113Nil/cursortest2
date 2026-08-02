package defpackage;

/* loaded from: classes2.dex */
public final class ns60 {
    public final String a;
    public final ct60 b;

    public ns60(String str, ct60 ct60Var) {
        this.a = str;
        this.b = ct60Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ns60)) {
            return false;
        }
        ns60 ns60Var = (ns60) obj;
        return this.a.equals(ns60Var.a) && this.b.equals(ns60Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Price(__typename=" + this.a + ", offerPrice=" + this.b + ')';
    }
}
