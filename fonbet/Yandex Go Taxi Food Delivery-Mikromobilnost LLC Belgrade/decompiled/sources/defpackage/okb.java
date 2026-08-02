package defpackage;

/* loaded from: classes2.dex */
public final class okb {
    public final String a;
    public final String b;
    public final String c;

    public okb(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof okb)) {
            return false;
        }
        okb okbVar = (okb) obj;
        return jl40.l(this.a, okbVar.a) && jl40.l(this.b, okbVar.b) && jl40.l(this.c, okbVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + unr0.b(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CheckoutInvoiceAdditionalOfferInput(offerName=");
        sb.append(this.a);
        sb.append(", offersBatchId=");
        sb.append(this.b);
        sb.append(", positionId=");
        return b64.p(sb, this.c, ')');
    }
}
