package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class fmf0 implements dmf0 {
    public final String a;
    public final String b;
    public final String c;

    public fmf0(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fmf0)) {
            return false;
        }
        fmf0 fmf0Var = (fmf0) obj;
        return jl40.l(this.a, fmf0Var.a) && jl40.l(this.b, fmf0Var.b) && jl40.l(this.c, fmf0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + unr0.b(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return oyr.t(b64.v("PromoCodeDetailsActionDeeplink(title=", this.a, ", subtitle=", this.b, ", deeplink="), this.c, Extension.C_BRAKE);
    }
}
