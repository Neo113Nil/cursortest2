package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes11.dex */
public final class hpn0 {
    public final String a;
    public final String b;
    public final String c;

    public hpn0(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hpn0)) {
            return false;
        }
        hpn0 hpn0Var = (hpn0) obj;
        return jl40.l(this.a, hpn0Var.a) && jl40.l(this.b, hpn0Var.b) && jl40.l(this.c, hpn0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + unr0.b(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return oyr.t(b64.v("ScootersIgnitionControllingDisablingConfirmationUiState(title=", this.a, ", subtitle=", this.b, ", buttonText="), this.c, Extension.C_BRAKE);
    }
}
