package defpackage;

/* loaded from: classes2.dex */
public final class pkd {
    public final String a;
    public final ct60 b;

    public pkd(String str, ct60 ct60Var) {
        this.a = str;
        this.b = ct60Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pkd)) {
            return false;
        }
        pkd pkdVar = (pkd) obj;
        return this.a.equals(pkdVar.a) && this.b.equals(pkdVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "TotalPrice(__typename=" + this.a + ", offerPrice=" + this.b + ')';
    }
}
