package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class kb80 {
    public final String a;
    public final String b;
    public final String c;

    public kb80(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kb80)) {
            return false;
        }
        kb80 kb80Var = (kb80) obj;
        return this.a.equals(kb80Var.a) && jl40.l(this.b, kb80Var.b) && jl40.l(this.c, kb80Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + unr0.b(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return oyr.t(b64.v("TariffSuggest(orderId=", this.a, ", tariff=", this.b, ", suggestId="), this.c, Extension.C_BRAKE);
    }
}
