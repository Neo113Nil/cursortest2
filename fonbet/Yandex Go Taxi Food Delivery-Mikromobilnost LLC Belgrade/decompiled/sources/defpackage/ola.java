package defpackage;

import com.yandex.go.chargers.passes.domain.ChargersPassType;
import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class ola implements qla {
    public final ChargersPassType a;
    public final String b;
    public final CharSequence c;
    public final CharSequence d;
    public final wp2 e;
    public final List f;
    public final nla g;
    public final List h;
    public final mla i;
    public final hfa0 j;

    public ola(ChargersPassType chargersPassType, String str, CharSequence charSequence, CharSequence charSequence2, wp2 wp2Var, List list, nla nlaVar, List list2, mla mlaVar, hfa0 hfa0Var) {
        this.a = chargersPassType;
        this.b = str;
        this.c = charSequence;
        this.d = charSequence2;
        this.e = wp2Var;
        this.f = list;
        this.g = nlaVar;
        this.h = list2;
        this.i = mlaVar;
        this.j = hfa0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ola)) {
            return false;
        }
        ola olaVar = (ola) obj;
        return this.a == olaVar.a && jl40.l(this.b, olaVar.b) && jl40.l(this.c, olaVar.c) && jl40.l(this.d, olaVar.d) && jl40.l(this.e, olaVar.e) && jl40.l(this.f, olaVar.f) && jl40.l(this.g, olaVar.g) && jl40.l(this.h, olaVar.h) && jl40.l(this.i, olaVar.i) && jl40.l(this.j, olaVar.j);
    }

    public final int hashCode() {
        int b = smw0.b(unr0.b(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        CharSequence charSequence = this.d;
        int hashCode = (b + (charSequence == null ? 0 : charSequence.hashCode())) * 31;
        wp2 wp2Var = this.e;
        return this.j.hashCode() + ((this.i.hashCode() + unr0.c((this.g.hashCode() + unr0.c((hashCode + (wp2Var != null ? wp2Var.hashCode() : 0)) * 31, 31, this.f)) * 31, 31, this.h)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Offer(passType=");
        sb.append(this.a);
        sb.append(", offerId=");
        sb.append(this.b);
        sb.append(", title=");
        vfc.A(sb, this.c, ", subtitle=", this.d, ", topGradientColor=");
        sb.append(this.e);
        sb.append(", benefits=");
        sb.append(this.f);
        sb.append(", howItWorks=");
        sb.append(this.g);
        sb.append(", packages=");
        sb.append(this.h);
        sb.append(", bottom=");
        sb.append(this.i);
        sb.append(", paymentOptions=");
        sb.append(this.j);
        sb.append(Extension.C_BRAKE);
        return sb.toString();
    }
}
