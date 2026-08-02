package defpackage;

/* loaded from: classes2.dex */
public final class nld {
    public final String a;
    public final ct60 b;

    public nld(String str, ct60 ct60Var) {
        this.a = str;
        this.b = ct60Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nld)) {
            return false;
        }
        nld nldVar = (nld) obj;
        return this.a.equals(nldVar.a) && this.b.equals(nldVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "TotalPrice(__typename=" + this.a + ", offerPrice=" + this.b + ')';
    }
}
