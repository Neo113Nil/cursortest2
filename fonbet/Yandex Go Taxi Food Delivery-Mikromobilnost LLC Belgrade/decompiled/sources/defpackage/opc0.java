package defpackage;

/* loaded from: classes8.dex */
public final class opc0 {
    public final String a;
    public final fpc0 b;

    public opc0(String str, fpc0 fpc0Var) {
        this.a = str;
        this.b = fpc0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof opc0)) {
            return false;
        }
        opc0 opc0Var = (opc0) obj;
        return this.a.equals(opc0Var.a) && this.b.equals(opc0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Node(__typename=" + this.a + ", plaquePredicate=" + this.b + ')';
    }
}
