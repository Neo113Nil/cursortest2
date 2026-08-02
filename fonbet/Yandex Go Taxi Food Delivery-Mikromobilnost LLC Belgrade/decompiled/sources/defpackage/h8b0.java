package defpackage;

import kotlin.collections.a;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.gopayments.model.PaymentMethod$Type;

/* loaded from: classes8.dex */
public final class h8b0 extends lea0 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final fef g;
    public final vxc h;
    public final String i;
    public final g8b0 j;

    public h8b0(String str, String str2, String str3, String str4, String str5, String str6, fef fefVar, vxc vxcVar, String str7, f8b0 f8b0Var) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
        this.g = fefVar;
        this.h = vxcVar;
        this.i = str7;
        this.j = f8b0Var;
    }

    @Override // defpackage.lea0
    public final String b() {
        return this.b;
    }

    @Override // defpackage.lea0
    public final PaymentMethod$Type c() {
        return PaymentMethod$Type.PERSONAL_WALLET;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0030  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean equals(Object obj) {
        boolean a;
        if (this != obj) {
            if (obj instanceof h8b0) {
                h8b0 h8b0Var = (h8b0) obj;
                if (jl40.l(this.a, h8b0Var.a)) {
                    String str = h8b0Var.b;
                    String str2 = this.b;
                    if (str2 == null) {
                        if (str == null) {
                            a = true;
                            if (a && jl40.l(this.c, h8b0Var.c) && jl40.l(this.d, h8b0Var.d) && jl40.l(this.e, h8b0Var.e) && jl40.l(this.f, h8b0Var.f) && jl40.l(this.g, h8b0Var.g) && this.h.equals(h8b0Var.h) && jl40.l(this.i, h8b0Var.i) && jl40.l(this.j, h8b0Var.j)) {
                            }
                        }
                        a = false;
                        if (a) {
                        }
                    } else {
                        if (str != null) {
                            a = of91.a(str2, str);
                            if (a) {
                            }
                        }
                        a = false;
                        if (a) {
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final boolean f() {
        String str = this.f;
        if (str == null) {
            return false;
        }
        try {
            return Float.parseFloat(str) > 0.0f;
        } catch (Exception e) {
            jst.e.k(e, "failed to parse wallet balance as Float");
            return false;
        }
    }

    public final boolean g(PaymentMethod$Type paymentMethod$Type) {
        if (paymentMethod$Type == null) {
            return false;
        }
        return a.G(this.h.c, paymentMethod$Type);
    }

    @Override // defpackage.lea0, defpackage.f731
    public final String getId() {
        return this.a;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int b = unr0.b(unr0.b(unr0.b((hashCode + (str == null ? 0 : of91.b(str))) * 31, 31, this.c), 31, this.d), 31, this.e);
        String str2 = this.f;
        int hashCode2 = (b + (str2 == null ? 0 : str2.hashCode())) * 31;
        fef fefVar = this.g;
        int hashCode3 = (this.h.hashCode() + ((hashCode2 + (fefVar == null ? 0 : fefVar.hashCode())) * 31)) * 31;
        String str3 = this.i;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        g8b0 g8b0Var = this.j;
        return hashCode4 + (g8b0Var != null ? g8b0Var.hashCode() : 0);
    }

    public final String toString() {
        String str = this.b;
        StringBuilder v = b64.v("PersonalWalletPayment(id=", this.a, ", disabled=", str == null ? "null" : of91.e(str), ", name=");
        g8e.D(v, this.c, ", subtitle=", this.d, ", moneyLeftAsStr=");
        g8e.D(v, this.e, ", moneyLeftAsDecimal=", this.f, ", currencyRules=");
        v.append(this.g);
        v.append(", complementAttributes=");
        v.append(this.h);
        v.append(", nameMenu=");
        v.append(this.i);
        v.append(", action=");
        v.append(this.j);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
