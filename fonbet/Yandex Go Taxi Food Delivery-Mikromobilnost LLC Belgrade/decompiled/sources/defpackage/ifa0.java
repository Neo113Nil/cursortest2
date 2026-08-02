package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class ifa0 {
    public final String a;
    public final String b;
    public final pv90 c;

    public ifa0(String str, String str2, pv90 pv90Var) {
        this.a = str;
        this.b = str2;
        this.c = pv90Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ifa0)) {
            return false;
        }
        ifa0 ifa0Var = (ifa0) obj;
        return jl40.l(this.a, ifa0Var.a) && jl40.l(this.b, ifa0Var.b) && jl40.l(this.c, ifa0Var.c);
    }

    public final int hashCode() {
        int b = unr0.b(this.a.hashCode() * 31, 31, this.b);
        pv90 pv90Var = this.c;
        return b + (pv90Var == null ? 0 : pv90Var.hashCode());
    }

    public final String toString() {
        StringBuilder v = b64.v("PaymentOptions(type=", this.a, ", id=", this.b, ", alert=");
        v.append(this.c);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
