package defpackage;

/* loaded from: classes2.dex */
public final class mld {
    public final String a;
    public final xgx0 b;

    public mld(String str, xgx0 xgx0Var) {
        this.a = str;
        this.b = xgx0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mld)) {
            return false;
        }
        mld mldVar = (mld) obj;
        return this.a.equals(mldVar.a) && this.b.equals(mldVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "TariffOffer(__typename=" + this.a + ", tariffOfferDetails=" + this.b + ')';
    }
}
