package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.gopayments.model.PaymentMethod$Type;

/* loaded from: classes13.dex */
public final class a000 extends lea0 implements f731 {
    public final String a;
    public final String b;
    public final boolean c;
    public final String d;
    public final String e;
    public final String f;

    public a000(String str, String str2, String str3, String str4, String str5, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = z;
        this.d = str3;
        this.e = str4;
        this.f = str5;
    }

    @Override // defpackage.f731
    public final boolean a() {
        return this.c;
    }

    @Override // defpackage.lea0
    public final String b() {
        return this.b;
    }

    @Override // defpackage.lea0
    public final PaymentMethod$Type c() {
        return PaymentMethod$Type.MBANK_ACCOUNT;
    }

    public final boolean equals(Object obj) {
        boolean l;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a000)) {
            return false;
        }
        a000 a000Var = (a000) obj;
        if (!jl40.l(this.a, a000Var.a)) {
            return false;
        }
        String str = a000Var.b;
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
        return l && this.c == a000Var.c && jl40.l(this.d, a000Var.d) && jl40.l(this.e, a000Var.e) && jl40.l(this.f, a000Var.f);
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

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int b = unr0.b(unr0.e((hashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.c), 31, this.d);
        String str2 = this.e;
        int hashCode2 = (b + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f;
        return hashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        String str = this.b;
        StringBuilder v = b64.v("MBankAccountPayment(id=", this.a, ", disabled=", str == null ? "null" : of91.e(str), ", isVerified=");
        unr0.A(", title=", this.d, ", subtitle=", v, this.c);
        return g8e.r(v, this.e, ", iconTag=", this.f, Extension.C_BRAKE);
    }
}
