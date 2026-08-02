package defpackage;

import com.ybsdk.core.common.data.network.dto.Money;
import com.ybsdk.feature.autotopup.api.dto.PaymentMethodInfoDto;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class mw3 {
    public final String a;
    public final String b;
    public final String c;
    public final Boolean d;
    public final y1b1 e;
    public final Money f;
    public final Money g;
    public final String h;
    public final lw3 i;
    public final PaymentMethodInfoDto j;
    public final kw3 k;

    public mw3(String str, String str2, String str3, Boolean bool, y1b1 y1b1Var, Money money, Money money2, String str4, lw3 lw3Var, PaymentMethodInfoDto paymentMethodInfoDto, kw3 kw3Var) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = bool;
        this.e = y1b1Var;
        this.f = money;
        this.g = money2;
        this.h = str4;
        this.i = lw3Var;
        this.j = paymentMethodInfoDto;
        this.k = kw3Var;
    }

    public static mw3 a(mw3 mw3Var, String str, Boolean bool, int i) {
        if ((i & 1) != 0) {
            str = mw3Var.a;
        }
        String str2 = str;
        String str3 = mw3Var.b;
        String str4 = mw3Var.c;
        if ((i & 8) != 0) {
            bool = mw3Var.d;
        }
        y1b1 y1b1Var = mw3Var.e;
        Money money = mw3Var.f;
        Money money2 = mw3Var.g;
        String str5 = mw3Var.h;
        lw3 lw3Var = mw3Var.i;
        PaymentMethodInfoDto paymentMethodInfoDto = mw3Var.j;
        kw3 kw3Var = mw3Var.k;
        mw3Var.getClass();
        return new mw3(str2, str3, str4, bool, y1b1Var, money, money2, str5, lw3Var, paymentMethodInfoDto, kw3Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mw3)) {
            return false;
        }
        mw3 mw3Var = (mw3) obj;
        return jl40.l(this.a, mw3Var.a) && jl40.l(this.b, mw3Var.b) && jl40.l(this.c, mw3Var.c) && jl40.l(this.d, mw3Var.d) && jl40.l(this.e, mw3Var.e) && jl40.l(this.f, mw3Var.f) && jl40.l(this.g, mw3Var.g) && jl40.l(this.h, mw3Var.h) && jl40.l(this.i, mw3Var.i) && jl40.l(this.j, mw3Var.j) && jl40.l(this.k, mw3Var.k);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.c;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Boolean bool = this.d;
        int hashCode4 = (hashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
        y1b1 y1b1Var = this.e;
        int hashCode5 = (hashCode4 + (y1b1Var == null ? 0 : y1b1Var.hashCode())) * 31;
        Money money = this.f;
        int hashCode6 = (hashCode5 + (money == null ? 0 : money.hashCode())) * 31;
        Money money2 = this.g;
        int hashCode7 = (hashCode6 + (money2 == null ? 0 : money2.hashCode())) * 31;
        String str4 = this.h;
        int hashCode8 = (hashCode7 + (str4 == null ? 0 : str4.hashCode())) * 31;
        lw3 lw3Var = this.i;
        int hashCode9 = (hashCode8 + (lw3Var == null ? 0 : lw3Var.hashCode())) * 31;
        PaymentMethodInfoDto paymentMethodInfoDto = this.j;
        int hashCode10 = (hashCode9 + (paymentMethodInfoDto == null ? 0 : paymentMethodInfoDto.hashCode())) * 31;
        kw3 kw3Var = this.k;
        return hashCode10 + (kw3Var != null ? kw3Var.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder v = b64.v("AutoTopupOffer(autoTopUpId=", this.a, ", title=", this.b, ", description=");
        tse0.A(v, this.c, ", enabled=", this.d, ", autoTopup=");
        v.append(this.e);
        v.append(", money=");
        v.append(this.f);
        v.append(", threshold=");
        v.append(this.g);
        v.append(", agreementId=");
        v.append(this.h);
        v.append(", style=");
        v.append(this.i);
        v.append(", paymentMethodInfoDto=");
        v.append(this.j);
        v.append(", button=");
        v.append(this.k);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }

    public mw3() {
        this(null, null, null, null, null, null, null, null, null, null, null);
    }
}
