package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class j0f0 implements l0f0 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final sls g;
    public final d0f0 h;

    public j0f0(String str, String str2, String str3, String str4, String str5, String str6, sls slsVar, d0f0 d0f0Var) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
        this.g = slsVar;
        this.h = d0f0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof j0f0) {
            j0f0 j0f0Var = (j0f0) obj;
            return jl40.l(this.a, j0f0Var.a) && jl40.l(this.b, j0f0Var.b) && jl40.l(this.c, j0f0Var.c) && jl40.l(this.d, j0f0Var.d) && this.e.equals(j0f0Var.e) && jl40.l(this.f, j0f0Var.f) && this.g.equals(j0f0Var.g) && this.h == j0f0Var.h;
        }
        return false;
    }

    public final int hashCode() {
        return this.h.hashCode() + nnm.a(unr0.b(unr0.b(unr0.b(unr0.b(unr0.b(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g);
    }

    public final String toString() {
        StringBuilder v = b64.v("PriceLoadedSuccess(headerText=", this.a, ", descriptionText=", this.b, ", buttonAcceptText=");
        g8e.D(v, this.c, ", buttonCancelText=", this.d, ", addressName=");
        g8e.D(v, this.e, ", priceText=", this.f, ", onConfirmButtonClick=");
        v.append(this.g);
        v.append(", onCancelButtonClick=");
        v.append(this.h);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
