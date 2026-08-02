package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class pv90 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;

    public pv90(String str, String str2, String str3, String str4) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pv90)) {
            return false;
        }
        pv90 pv90Var = (pv90) obj;
        return jl40.l(this.a, pv90Var.a) && jl40.l(this.b, pv90Var.b) && jl40.l(this.c, pv90Var.c) && jl40.l(this.d, pv90Var.d);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int b = unr0.b((hashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.c);
        String str2 = this.d;
        return b + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return g8e.r(b64.v("PaymentAlert(title=", this.a, ", message=", this.b, ", primaryButtonText="), this.c, ", secondaryButtonText=", this.d, Extension.C_BRAKE);
    }
}
