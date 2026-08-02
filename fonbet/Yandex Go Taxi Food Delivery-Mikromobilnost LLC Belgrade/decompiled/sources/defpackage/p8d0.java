package defpackage;

@gsq0
/* loaded from: classes2.dex */
public final class p8d0 {
    public static final o8d0 Companion = new o8d0();
    public final String a;
    public final String b;
    public final String c;

    public /* synthetic */ p8d0(int i, String str, String str2, String str3) {
        if (7 != (i & 7)) {
            qje.Z(i, 7, n8d0.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p8d0)) {
            return false;
        }
        p8d0 p8d0Var = (p8d0) obj;
        return jl40.l(this.a, p8d0Var.a) && jl40.l(this.b, p8d0Var.b) && jl40.l(this.c, p8d0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + unr0.b(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PlusPayAcquisitionOfferAssetsDto(purchaseButtonText=");
        sb.append(this.a);
        sb.append(", purchaseButtonAdditionalText=");
        sb.append(this.b);
        sb.append(", subscriptionName=");
        return b64.p(sb, this.c, ')');
    }
}
