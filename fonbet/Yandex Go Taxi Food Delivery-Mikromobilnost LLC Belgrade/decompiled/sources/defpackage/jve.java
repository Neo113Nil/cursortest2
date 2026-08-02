package defpackage;

import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.gopayments.model.PaymentMethod$Type;

/* loaded from: classes13.dex */
public final class jve extends lea0 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final List e;
    public final double f;
    public final double g;
    public final double h;
    public final String i;
    public final String j;

    public jve(String str, String str2, String str3, String str4, List list, double d, double d2, double d3, String str5, String str6) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = list;
        this.f = d;
        this.g = d2;
        this.h = d3;
        this.i = str5;
        this.j = str6;
    }

    @Override // defpackage.lea0
    public final String b() {
        return this.b;
    }

    @Override // defpackage.lea0
    public final PaymentMethod$Type c() {
        return PaymentMethod$Type.CORP;
    }

    public final boolean equals(Object obj) {
        boolean l;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jve)) {
            return false;
        }
        jve jveVar = (jve) obj;
        if (!jl40.l(this.a, jveVar.a)) {
            return false;
        }
        String str = jveVar.b;
        String str2 = this.b;
        if (str2 == null) {
            if (str == null) {
                l = true;
            }
            l = false;
        } else {
            if (str != null) {
                l = jl40.l(str2, str);
            }
            l = false;
        }
        return l && jl40.l(this.c, jveVar.c) && jl40.l(this.d, jveVar.d) && jl40.l(this.e, jveVar.e) && Double.compare(this.f, jveVar.f) == 0 && Double.compare(this.g, jveVar.g) == 0 && Double.compare(this.h, jveVar.h) == 0 && jl40.l(this.i, jveVar.i) && jl40.l(this.j, jveVar.j);
    }

    public final String f() {
        return this.d;
    }

    public final String g() {
        return this.c;
    }

    @Override // defpackage.lea0, defpackage.f731
    public final String getId() {
        return this.a;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int b = unr0.b((hashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.c);
        String str2 = this.d;
        int a = unr0.a(unr0.a(unr0.a(unr0.c((b + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.e), 31, this.f), 31, this.g), 31, this.h);
        String str3 = this.i;
        int hashCode2 = (a + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.j;
        return hashCode2 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        String str = this.b;
        StringBuilder v = b64.v("CorpPayment(id=", this.a, ", disabled=", str == null ? "null" : of91.e(str), ", name=");
        g8e.D(v, this.c, ", description=", this.d, ", costCenterFields=");
        v.append(this.e);
        v.append(", moneySpent=");
        v.append(this.f);
        nzs.o(v, ", moneyLimit=", this.g, ", moneyLeft=");
        v.append(this.h);
        v.append(", currency=");
        v.append(this.i);
        return unr0.r(v, ", costCenter=", this.j, Extension.C_BRAKE);
    }
}
