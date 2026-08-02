package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class fp9 {
    public final hl3 a;
    public final hfa0 b;
    public final zy11 c;

    public fp9(hl3 hl3Var, hfa0 hfa0Var, zy11 zy11Var) {
        this.a = hl3Var;
        this.b = hfa0Var;
        this.c = zy11Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fp9)) {
            return false;
        }
        fp9 fp9Var = (fp9) obj;
        return jl40.l(this.a, fp9Var.a) && jl40.l(this.b, fp9Var.b) && jl40.l(this.c, fp9Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "OfferParams(authStatus=" + this.a + ", paymentOptions=" + this.b + ", trigger=" + this.c + Extension.C_BRAKE;
    }
}
