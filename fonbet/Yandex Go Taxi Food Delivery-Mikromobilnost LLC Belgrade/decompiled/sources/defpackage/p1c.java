package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.gopayments.model.PaymentMethod$Type;

/* loaded from: classes13.dex */
public final class p1c extends lea0 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;

    public p1c(String str, String str2, String str3, String str4, String str5) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
    }

    @Override // defpackage.lea0
    public final String b() {
        return this.b;
    }

    @Override // defpackage.lea0
    public final PaymentMethod$Type c() {
        return PaymentMethod$Type.CLICK_WALLET;
    }

    public final boolean equals(Object obj) {
        boolean l;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p1c)) {
            return false;
        }
        p1c p1cVar = (p1c) obj;
        if (!jl40.l(this.a, p1cVar.a)) {
            return false;
        }
        String str = p1cVar.b;
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
        return l && jl40.l(this.c, p1cVar.c) && jl40.l(this.d, p1cVar.d) && jl40.l(this.e, p1cVar.e);
    }

    public final String f() {
        return this.e;
    }

    public final String g() {
        return this.d;
    }

    @Override // defpackage.lea0, defpackage.f731
    public final String getId() {
        return this.a;
    }

    public final String h() {
        return this.c;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int b = unr0.b((hashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.c);
        String str2 = this.d;
        int hashCode2 = (b + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.e;
        return hashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        String str = this.b;
        StringBuilder v = b64.v("ClickWalletPayment(id=", this.a, ", disabled=", str == null ? "null" : of91.e(str), ", title=");
        g8e.D(v, this.c, ", subtitle=", this.d, ", iconTag=");
        return oyr.t(v, this.e, Extension.C_BRAKE);
    }
}
