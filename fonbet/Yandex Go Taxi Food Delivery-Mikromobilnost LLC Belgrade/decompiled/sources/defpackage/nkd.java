package defpackage;

/* loaded from: classes2.dex */
public final class nkd {
    public final String a;
    public final pe70 b;

    public nkd(String str, pe70 pe70Var) {
        this.a = str;
        this.b = pe70Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nkd)) {
            return false;
        }
        nkd nkdVar = (nkd) obj;
        return this.a.equals(nkdVar.a) && this.b.equals(nkdVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "OptionOffer(__typename=" + this.a + ", optionOffer=" + this.b + ')';
    }
}
