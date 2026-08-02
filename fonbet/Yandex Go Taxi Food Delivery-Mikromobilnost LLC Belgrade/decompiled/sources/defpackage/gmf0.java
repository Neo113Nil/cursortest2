package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class gmf0 implements dmf0 {
    public final String a;
    public final String b;
    public final String c;

    public gmf0(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gmf0)) {
            return false;
        }
        gmf0 gmf0Var = (gmf0) obj;
        return jl40.l(this.a, gmf0Var.a) && jl40.l(this.b, gmf0Var.b) && jl40.l(this.c, gmf0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + unr0.b(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return oyr.t(b64.v("PromoCodeDetailsActionUrl(title=", this.a, ", subtitle=", this.b, ", code="), this.c, Extension.C_BRAKE);
    }
}
