package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class mcj0 {
    public final String a;
    public final String b;
    public final String c;

    public mcj0(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mcj0)) {
            return false;
        }
        mcj0 mcj0Var = (mcj0) obj;
        return jl40.l(this.a, mcj0Var.a) && jl40.l(this.b, mcj0Var.b) && jl40.l(this.c, mcj0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + unr0.b(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return oyr.t(b64.v("RequirementAddressInputPromoblock(imageTag=", this.a, ", title=", this.b, ", payloadJson="), this.c, Extension.C_BRAKE);
    }
}
