package defpackage;

/* loaded from: classes2.dex */
public final class hha0 {
    public final bha0 a;
    public final zga0 b;
    public final eha0 c;
    public final aha0 d;
    public final String e;

    public hha0(bha0 bha0Var, zga0 zga0Var, eha0 eha0Var, aha0 aha0Var, String str) {
        this.a = bha0Var;
        this.b = zga0Var;
        this.c = eha0Var;
        this.d = aha0Var;
        this.e = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hha0)) {
            return false;
        }
        hha0 hha0Var = (hha0) obj;
        return this.a.equals(hha0Var.a) && jl40.l(this.b, hha0Var.b) && jl40.l(this.c, hha0Var.c) && this.d.equals(hha0Var.d) && jl40.l(this.e, hha0Var.e);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        zga0 zga0Var = this.b;
        int hashCode2 = (hashCode + (zga0Var == null ? 0 : zga0Var.hashCode())) * 31;
        eha0 eha0Var = this.c;
        int hashCode3 = (this.d.hashCode() + ((hashCode2 + (eha0Var == null ? 0 : eha0Var.hashCode())) * 31)) * 31;
        String str = this.e;
        return hashCode3 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PaymentPromoBadge(benefitTitle=");
        sb.append(this.a);
        sb.append(", additionalTitle=");
        sb.append(this.b);
        sb.append(", iconImage=");
        sb.append(this.c);
        sb.append(", backgroundColor=");
        sb.append(this.d);
        sb.append(", paymentMethodId=");
        return b64.p(sb, this.e, ')');
    }
}
