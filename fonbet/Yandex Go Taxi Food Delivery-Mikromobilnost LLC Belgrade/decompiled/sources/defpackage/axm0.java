package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class axm0 {
    public final String a;
    public final String b;
    public final String c;

    public axm0(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof axm0)) {
            return false;
        }
        axm0 axm0Var = (axm0) obj;
        return this.a.equals(axm0Var.a) && this.b.equals(axm0Var.b) && jl40.l(this.c, axm0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + unr0.b(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return oyr.t(b64.v("ScootersAgreementLinkItemModel(title=", this.a, ", subtitle=", this.b, ", url="), this.c, Extension.C_BRAKE);
    }
}
