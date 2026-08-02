package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class nbi {
    public final ex70 a;
    public final yi70 b;

    public nbi(ex70 ex70Var, yi70 yi70Var) {
        this.a = ex70Var;
        this.b = yi70Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nbi)) {
            return false;
        }
        nbi nbiVar = (nbi) obj;
        return jl40.l(this.a, nbiVar.a) && jl40.l(this.b, nbiVar.b);
    }

    public final int hashCode() {
        ex70 ex70Var = this.a;
        int hashCode = (ex70Var == null ? 0 : ex70Var.hashCode()) * 31;
        yi70 yi70Var = this.b;
        return hashCode + (yi70Var != null ? yi70Var.hashCode() : 0);
    }

    public final String toString() {
        return "DeliveryFormStep(header=" + this.a + ", orderButtonOverride=" + this.b + Extension.C_BRAKE;
    }

    public nbi() {
        this(null, null);
    }
}
