package defpackage;

import com.yandex.go.payments.paymentlist.experiments.MainMenuPaymentMethodsSelectorExperiment;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class k9a0 {
    public final String a;
    public final String b;
    public final String c;
    public final boolean d;
    public final String e;
    public final MainMenuPaymentMethodsSelectorExperiment.ShowPolicy f;
    public final kdc g;
    public final kdc h;

    public k9a0(String str, String str2, String str3, boolean z, String str4, MainMenuPaymentMethodsSelectorExperiment.ShowPolicy showPolicy, kdc kdcVar, kdc kdcVar2) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = z;
        this.e = str4;
        this.f = showPolicy;
        this.g = kdcVar;
        this.h = kdcVar2;
    }

    public final String a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k9a0)) {
            return false;
        }
        k9a0 k9a0Var = (k9a0) obj;
        return jl40.l(this.a, k9a0Var.a) && jl40.l(this.b, k9a0Var.b) && jl40.l(this.c, k9a0Var.c) && this.d == k9a0Var.d && jl40.l(this.e, k9a0Var.e) && this.f.equals(k9a0Var.f) && jl40.l(this.g, k9a0Var.g) && jl40.l(this.h, k9a0Var.h);
    }

    public final int hashCode() {
        int e = unr0.e(unr0.b(unr0.b(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
        String str = this.e;
        int b = oyr.b(this.f.a, (e + (str == null ? 0 : str.hashCode())) * 31, 31);
        kdc kdcVar = this.g;
        int hashCode = (b + (kdcVar == null ? 0 : kdcVar.hashCode())) * 31;
        kdc kdcVar2 = this.h;
        return hashCode + (kdcVar2 != null ? kdcVar2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder v = b64.v("PaymentMethodsBanner(bannerId=", this.a, ", title=", this.b, ", content=");
        tse0.y(this.c, ", isClosable=", ", iconUrl=", v, this.d);
        v.append(this.e);
        v.append(", showPolicy=");
        v.append(this.f);
        v.append(", textColor=");
        v.append(this.g);
        v.append(", backgroundColor=");
        v.append(this.h);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
