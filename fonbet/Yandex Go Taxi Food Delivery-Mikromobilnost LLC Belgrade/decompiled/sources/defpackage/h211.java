package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.gopayments.model.PaymentMethod$Type;

/* loaded from: classes13.dex */
public final class h211 extends lea0 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;

    public h211(String str, String str2, String str3, String str4, String str5, String str6) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
    }

    @Override // defpackage.lea0
    public final String b() {
        return this.b;
    }

    @Override // defpackage.lea0
    public final PaymentMethod$Type c() {
        return PaymentMethod$Type.TRANSPORT_EXTERNAL;
    }

    public final boolean equals(Object obj) {
        boolean l;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h211)) {
            return false;
        }
        h211 h211Var = (h211) obj;
        if (!jl40.l(this.a, h211Var.a)) {
            return false;
        }
        String str = h211Var.b;
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
        return l && jl40.l(this.c, h211Var.c) && jl40.l(this.d, h211Var.d) && jl40.l(this.e, h211Var.e) && jl40.l(this.f, h211Var.f);
    }

    public final String f() {
        return this.f;
    }

    public final String g() {
        return this.e;
    }

    @Override // defpackage.lea0, defpackage.f731
    public final String getId() {
        return this.a;
    }

    public final String h() {
        return this.d;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        return this.f.hashCode() + unr0.b(unr0.b(unr0.b((hashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.c), 31, this.d), 31, this.e);
    }

    public final String toString() {
        String str = this.b;
        StringBuilder v = b64.v("TransportExternalPayment(id=", this.a, ", disabled=", str == null ? "null" : of91.e(str), ", shortName=");
        g8e.D(v, this.c, ", title=", this.d, ", subtitle=");
        return g8e.r(v, this.e, ", iconTag=", this.f, Extension.C_BRAKE);
    }
}
