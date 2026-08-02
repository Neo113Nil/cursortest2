package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class bzh {
    public final jw8 a;
    public final zi8 b;

    public bzh(md6 md6Var, zi8 zi8Var) {
        this.a = md6Var;
        this.b = zi8Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bzh)) {
            return false;
        }
        bzh bzhVar = (bzh) obj;
        return jl40.l(this.a, bzhVar.a) && jl40.l(this.b, bzhVar.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        zi8 zi8Var = this.b;
        return hashCode + (zi8Var == null ? 0 : zi8Var.hashCode());
    }

    public final String toString() {
        return "DeliveryCargoModalPayload(cargoFormViewWrapper=" + this.a + ", cardMode=" + this.b + Extension.C_BRAKE;
    }
}
