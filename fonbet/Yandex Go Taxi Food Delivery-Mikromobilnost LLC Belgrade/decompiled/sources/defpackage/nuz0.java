package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class nuz0 implements puz0 {
    public final String a;
    public final String b;
    public final int c;
    public final int d;

    public nuz0(String str, String str2, int i, int i2) {
        this.a = str;
        this.b = str2;
        this.c = i;
        this.d = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nuz0)) {
            return false;
        }
        nuz0 nuz0Var = (nuz0) obj;
        return jl40.l(this.a, nuz0Var.a) && jl40.l(this.b, nuz0Var.b) && this.c == nuz0Var.c && this.d == nuz0Var.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + oyr.b(this.c, unr0.b(this.a.hashCode() * 31, 31, this.b), 31);
    }

    public final String toString() {
        return ly3.k(this.c, this.d, ", maxShowCountPerSession=", Extension.C_BRAKE, b64.v("TariffTooltipContentDismissed(tariffClass=", this.a, ", tooltipId=", this.b, ", maxShowCount="));
    }
}
