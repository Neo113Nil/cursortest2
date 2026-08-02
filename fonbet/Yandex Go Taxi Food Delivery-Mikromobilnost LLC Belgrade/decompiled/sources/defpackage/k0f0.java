package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class k0f0 implements l0f0 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;

    public k0f0(String str, String str2, String str3, String str4, String str5) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k0f0)) {
            return false;
        }
        k0f0 k0f0Var = (k0f0) obj;
        return jl40.l(this.a, k0f0Var.a) && jl40.l(this.b, k0f0Var.b) && jl40.l(this.c, k0f0Var.c) && jl40.l(this.d, k0f0Var.d) && this.e.equals(k0f0Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + unr0.b(unr0.b(unr0.b(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder v = b64.v("PriceLoading(headerText=", this.a, ", descriptionText=", this.b, ", buttonAcceptText=");
        g8e.D(v, this.c, ", buttonCancelText=", this.d, ", addressName=");
        return oyr.t(v, this.e, Extension.C_BRAKE);
    }
}
