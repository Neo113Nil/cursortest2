package defpackage;

/* loaded from: classes2.dex */
public final class cld {
    public final String a;
    public final se70 b;

    public cld(String str, se70 se70Var) {
        this.a = str;
        this.b = se70Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cld)) {
            return false;
        }
        cld cldVar = (cld) obj;
        return this.a.equals(cldVar.a) && this.b.equals(cldVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "OptionOffer(__typename=" + this.a + ", optionOfferDetails=" + this.b + ')';
    }
}
