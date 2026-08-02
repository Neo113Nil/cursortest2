package defpackage;

import java.util.ArrayList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.common_models.net.FormattedText;

/* loaded from: classes12.dex */
public final class pmb {
    public final String a;
    public final int b;
    public final Integer c;
    public final ArrayList d;
    public final cg60 e;
    public final amb f;
    public final hlb g;
    public final FormattedText h;
    public final String i;
    public final String j;
    public final bba0 k;
    public final String l;

    public pmb(String str, int i, Integer num, ArrayList arrayList, cg60 cg60Var, amb ambVar, hlb hlbVar, FormattedText formattedText, String str2, String str3, bba0 bba0Var, String str4) {
        this.a = str;
        this.b = i;
        this.c = num;
        this.d = arrayList;
        this.e = cg60Var;
        this.f = ambVar;
        this.g = hlbVar;
        this.h = formattedText;
        this.i = str2;
        this.j = str3;
        this.k = bba0Var;
        this.l = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pmb)) {
            return false;
        }
        pmb pmbVar = (pmb) obj;
        return jl40.l(this.a, pmbVar.a) && this.b == pmbVar.b && jl40.l(this.c, pmbVar.c) && this.d.equals(pmbVar.d) && jl40.l(this.e, pmbVar.e) && jl40.l(this.f, pmbVar.f) && jl40.l(this.g, pmbVar.g) && jl40.l(this.h, pmbVar.h) && jl40.l(this.i, pmbVar.i) && jl40.l(this.j, pmbVar.j) && this.k.equals(pmbVar.k) && jl40.l(this.l, pmbVar.l);
    }

    public final int hashCode() {
        int b = oyr.b(this.b, this.a.hashCode() * 31, 31);
        Integer num = this.c;
        int b2 = ly3.b((b + (num == null ? 0 : num.hashCode())) * 31, 31, this.d);
        cg60 cg60Var = this.e;
        int hashCode = (b2 + (cg60Var == null ? 0 : cg60Var.hashCode())) * 31;
        amb ambVar = this.f;
        int hashCode2 = (hashCode + (ambVar == null ? 0 : ambVar.hashCode())) * 31;
        hlb hlbVar = this.g;
        int hashCode3 = (hashCode2 + (hlbVar == null ? 0 : hlbVar.hashCode())) * 31;
        FormattedText formattedText = this.h;
        int hashCode4 = (hashCode3 + (formattedText == null ? 0 : formattedText.a.hashCode())) * 31;
        String str = this.i;
        int hashCode5 = (hashCode4 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.j;
        int hashCode6 = (this.k.hashCode() + ((hashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31)) * 31;
        String str3 = this.l;
        return hashCode6 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder u = b64.u(this.b, "CheckoutScreenState(tripId=", this.a, ", updateSequence=", ", debounceMillis=");
        u.append(this.c);
        u.append(", elements=");
        u.append(this.d);
        u.append(", notification=");
        u.append(this.e);
        u.append(", routeInfo=");
        u.append(this.f);
        u.append(", priceInfo=");
        u.append(this.g);
        u.append(", userAgreement=");
        u.append(this.h);
        u.append(", footerButtonTitle=");
        g8e.D(u, this.i, ", lockedUntil=", this.j, ", paymentMethodsInfo=");
        u.append(this.k);
        u.append(", requestId=");
        u.append(this.l);
        u.append(Extension.C_BRAKE);
        return u.toString();
    }
}
