package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class gws0 {
    public final mu90 a;
    public final mu90 b;
    public final boolean c;
    public final String d;
    public final boolean e;

    public gws0(mu90 mu90Var, mu90 mu90Var2, boolean z, String str, boolean z2) {
        this.a = mu90Var;
        this.b = mu90Var2;
        this.c = z;
        this.d = str;
        this.e = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gws0)) {
            return false;
        }
        gws0 gws0Var = (gws0) obj;
        return jl40.l(this.a, gws0Var.a) && jl40.l(this.b, gws0Var.b) && this.c == gws0Var.c && jl40.l(this.d, gws0Var.d) && this.e == gws0Var.e;
    }

    public final int hashCode() {
        mu90 mu90Var = this.a;
        int hashCode = (mu90Var == null ? 0 : mu90Var.hashCode()) * 31;
        mu90 mu90Var2 = this.b;
        int e = unr0.e((hashCode + (mu90Var2 == null ? 0 : mu90Var2.hashCode())) * 31, 31, this.c);
        String str = this.d;
        return Boolean.hashCode(this.e) + ((e + (str != null ? str.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Switch(payloadOn=");
        sb.append(this.a);
        sb.append(", payloadOff=");
        sb.append(this.b);
        sb.append(", checked=");
        unr0.A(", metricaLabel=", this.d, ", enabled=", sb, this.c);
        return x4e.i(sb, this.e, Extension.C_BRAKE);
    }
}
