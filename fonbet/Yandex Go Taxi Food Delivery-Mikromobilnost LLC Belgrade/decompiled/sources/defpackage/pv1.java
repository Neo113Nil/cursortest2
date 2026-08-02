package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class pv1 {
    public final String a;
    public final String b;
    public final String c;

    public pv1(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pv1)) {
            return false;
        }
        pv1 pv1Var = (pv1) obj;
        return jl40.l(this.a, pv1Var.a) && jl40.l(this.b, pv1Var.b) && jl40.l(this.c, pv1Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + unr0.b(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return oyr.t(b64.v("ErrorContent(title=", this.a, ", subtitle=", this.b, ", buttonTitle="), this.c, Extension.C_BRAKE);
    }
}
