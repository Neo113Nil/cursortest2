package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class i0f0 implements l0f0 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final d0f0 g;
    public final d0f0 h;

    public i0f0(String str, String str2, String str3, String str4, String str5, String str6, d0f0 d0f0Var, d0f0 d0f0Var2) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
        this.g = d0f0Var;
        this.h = d0f0Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof i0f0) {
            i0f0 i0f0Var = (i0f0) obj;
            return jl40.l(this.a, i0f0Var.a) && jl40.l(this.b, i0f0Var.b) && jl40.l(this.c, i0f0Var.c) && jl40.l(this.d, i0f0Var.d) && this.e.equals(i0f0Var.e) && jl40.l(this.f, i0f0Var.f) && this.g == i0f0Var.g && this.h == i0f0Var.h;
        }
        return false;
    }

    public final int hashCode() {
        return this.h.hashCode() + ((this.g.hashCode() + unr0.b(unr0.b(unr0.b(unr0.b(unr0.b(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f)) * 31);
    }

    public final String toString() {
        StringBuilder v = b64.v("PriceLoadError(headerText=", this.a, ", descriptionText=", this.b, ", buttonAcceptText=");
        g8e.D(v, this.c, ", buttonCancelText=", this.d, ", addressName=");
        g8e.D(v, this.e, ", priceText=", this.f, ", onConfirmButtonClick=");
        v.append(this.g);
        v.append(", onCancelButtonClick=");
        v.append(this.h);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
