package defpackage;

/* loaded from: classes2.dex */
public final class fmd {
    public final String a;
    public final emd b;
    public final rmd c;
    public final pld d;

    public fmd(String str, emd emdVar, rmd rmdVar, pld pldVar) {
        this.a = str;
        this.b = emdVar;
        this.c = rmdVar;
        this.d = pldVar;
    }

    public final pld a() {
        return this.d;
    }

    public final rmd b() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fmd)) {
            return false;
        }
        fmd fmdVar = (fmd) obj;
        return this.a.equals(fmdVar.a) && this.b.equals(fmdVar.b) && jl40.l(this.c, fmdVar.c) && this.d.equals(fmdVar.d);
    }

    public final int hashCode() {
        int hashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        rmd rmdVar = this.c;
        return this.d.hashCode() + ((hashCode + (rmdVar == null ? 0 : rmdVar.hashCode())) * 31);
    }

    public final String toString() {
        return "CompositeOfferCheckoutInfo(__typename=" + this.a + ", checkoutAdditionalOffers=" + this.b + ", paymentMethods=" + this.c + ", compositeOfferDetails=" + this.d + ')';
    }
}
