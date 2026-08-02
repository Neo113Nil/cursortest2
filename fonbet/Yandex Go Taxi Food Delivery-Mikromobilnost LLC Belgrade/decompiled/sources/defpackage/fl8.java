package defpackage;

import com.yandex.go.payments.payment.CardPayment$VerifyStrategy;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.gopayments.model.PaymentMethod$Type;

/* loaded from: classes8.dex */
public final class fl8 extends lea0 implements f731 {
    public final String a;
    public final String b;
    public final boolean c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final boolean h;
    public final String i;
    public final CardPayment$VerifyStrategy j;
    public final el8 k;
    public final String l;
    public final Boolean m;
    public final tx90 n;

    public fl8(String str, String str2, boolean z, String str3, String str4, String str5, String str6, boolean z2, String str7, CardPayment$VerifyStrategy cardPayment$VerifyStrategy, el8 el8Var, String str8, Boolean bool, tx90 tx90Var) {
        this.a = str;
        this.b = str2;
        this.c = z;
        this.d = str3;
        this.e = str4;
        this.f = str5;
        this.g = str6;
        this.h = z2;
        this.i = str7;
        this.j = cardPayment$VerifyStrategy;
        this.k = el8Var;
        this.l = str8;
        this.m = bool;
        this.n = tx90Var;
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
        return PaymentMethod$Type.CARD;
    }

    public final boolean equals(Object obj) {
        boolean a;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fl8)) {
            return false;
        }
        fl8 fl8Var = (fl8) obj;
        if (!jl40.l(this.a, fl8Var.a)) {
            return false;
        }
        String str = fl8Var.b;
        String str2 = this.b;
        if (str2 == null) {
            if (str == null) {
                a = true;
            }
            a = false;
        } else {
            if (str != null) {
                a = of91.a(str2, str);
            }
            a = false;
        }
        return a && this.c == fl8Var.c && jl40.l(this.d, fl8Var.d) && jl40.l(this.e, fl8Var.e) && jl40.l(this.f, fl8Var.f) && jl40.l(this.g, fl8Var.g) && this.h == fl8Var.h && jl40.l(this.i, fl8Var.i) && this.j == fl8Var.j && jl40.l(this.k, fl8Var.k) && jl40.l(this.l, fl8Var.l) && jl40.l(this.m, fl8Var.m) && jl40.l(this.n, fl8Var.n);
    }

    @Override // defpackage.lea0, defpackage.f731
    public final String getId() {
        return this.a;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int e = unr0.e(unr0.b(unr0.b(unr0.b(unr0.b(unr0.e((hashCode + (str == null ? 0 : of91.b(str))) * 31, 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h);
        String str2 = this.i;
        int hashCode2 = (this.j.hashCode() + ((e + (str2 == null ? 0 : str2.hashCode())) * 31)) * 31;
        el8 el8Var = this.k;
        int hashCode3 = (hashCode2 + (el8Var == null ? 0 : el8Var.hashCode())) * 31;
        String str3 = this.l;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Boolean bool = this.m;
        int hashCode5 = (hashCode4 + (bool == null ? 0 : bool.hashCode())) * 31;
        tx90 tx90Var = this.n;
        return hashCode5 + (tx90Var != null ? tx90Var.a.hashCode() : 0);
    }

    public final String toString() {
        String str = this.b;
        StringBuilder v = b64.v("CardPayment(id=", this.a, ", disabled=", str == null ? "null" : of91.e(str), ", isVerified=");
        unr0.A(", number=", this.d, ", system=", v, this.c);
        g8e.D(v, this.e, ", expYear=", this.f, ", expMonth=");
        tse0.y(this.g, ", isExpired=", ", cardIcon=", v, this.h);
        v.append(this.i);
        v.append(", verifyStrategy=");
        v.append(this.j);
        v.append(", family=");
        v.append(this.k);
        v.append(", description=");
        v.append(this.l);
        v.append(", hasLimits=");
        v.append(this.m);
        v.append(", profile=");
        v.append(this.n);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
