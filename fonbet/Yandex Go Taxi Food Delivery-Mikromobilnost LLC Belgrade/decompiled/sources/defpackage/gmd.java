package defpackage;

/* loaded from: classes2.dex */
public final class gmd implements za70 {
    public final fmd a;

    public gmd(fmd fmdVar) {
        this.a = fmdVar;
    }

    public final fmd a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gmd) && this.a.equals(((gmd) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Data(compositeOfferCheckoutInfo=" + this.a + ')';
    }
}
