package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.gopayments.model.PaymentMethod$Type;

/* loaded from: classes13.dex */
public final class bjm0 extends lea0 implements f731 {
    public final String a;
    public final String b;
    public final boolean c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;

    public bjm0(String str, boolean z, String str2, String str3, String str4, String str5, String str6) {
        this.a = str;
        this.b = str2;
        this.c = z;
        this.d = str3;
        this.e = str4;
        this.f = str5;
        this.g = str6;
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
        return PaymentMethod$Type.SBP_TOKEN;
    }

    public final boolean equals(Object obj) {
        boolean l;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bjm0)) {
            return false;
        }
        bjm0 bjm0Var = (bjm0) obj;
        if (!jl40.l(this.a, bjm0Var.a)) {
            return false;
        }
        String str = bjm0Var.b;
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
        return l && this.c == bjm0Var.c && jl40.l(this.d, bjm0Var.d) && jl40.l(this.e, bjm0Var.e) && jl40.l(this.f, bjm0Var.f) && jl40.l(this.g, bjm0Var.g);
    }

    public final String f() {
        return this.e;
    }

    public final String g() {
        return this.g;
    }

    @Override // defpackage.lea0, defpackage.f731
    public final String getId() {
        return this.a;
    }

    public final String h() {
        return this.f;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int b = unr0.b(unr0.b(unr0.b(unr0.e((hashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.c), 31, this.d), 31, this.e), 31, this.f);
        String str2 = this.g;
        return b + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        String str = this.b;
        StringBuilder v = b64.v("SbpTokenPayment(id=", this.a, ", disabled=", str == null ? "null" : of91.e(str), ", isVerified=");
        unr0.A(", bankId=", this.d, ", bankName=", v, this.c);
        g8e.D(v, this.e, ", title=", this.f, ", subtitle=");
        return oyr.t(v, this.g, Extension.C_BRAKE);
    }
}
