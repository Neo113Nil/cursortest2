package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class psi {
    public final yi70 a;
    public final r880 b;

    public psi(yi70 yi70Var, r880 r880Var) {
        this.a = yi70Var;
        this.b = r880Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof psi)) {
            return false;
        }
        psi psiVar = (psi) obj;
        return jl40.l(this.a, psiVar.a) && jl40.l(this.b, psiVar.b);
    }

    public final int hashCode() {
        yi70 yi70Var = this.a;
        int hashCode = (yi70Var == null ? 0 : yi70Var.hashCode()) * 31;
        r880 r880Var = this.b;
        return hashCode + (r880Var != null ? r880Var.hashCode() : 0);
    }

    public final String toString() {
        return "DeliverySummaryPropertiesStep(orderButtonOverride=" + this.a + ", orderStepModal=" + this.b + Extension.C_BRAKE;
    }

    public psi() {
        this(null, null);
    }
}
