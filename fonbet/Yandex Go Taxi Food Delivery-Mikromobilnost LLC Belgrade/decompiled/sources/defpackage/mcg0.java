package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class mcg0 {
    public final fcg0 a;
    public final boolean b;
    public final boolean c;
    public final int d;
    public final boolean e;
    public final lcg0 f;

    public mcg0(fcg0 fcg0Var, boolean z, boolean z2, int i, boolean z3, lcg0 lcg0Var) {
        this.a = fcg0Var;
        this.b = z;
        this.c = z2;
        this.d = i;
        this.e = z3;
        this.f = lcg0Var;
    }

    public static mcg0 a(mcg0 mcg0Var, boolean z, boolean z2, int i, boolean z3, lcg0 lcg0Var, int i2) {
        boolean z4 = z;
        fcg0 fcg0Var = mcg0Var.a;
        if ((i2 & 2) != 0) {
            z4 = mcg0Var.b;
        }
        if ((i2 & 4) != 0) {
            z2 = mcg0Var.c;
        }
        if ((i2 & 8) != 0) {
            i = mcg0Var.d;
        }
        if ((i2 & 16) != 0) {
            z3 = mcg0Var.e;
        }
        if ((i2 & 32) != 0) {
            lcg0Var = mcg0Var.f;
        }
        lcg0 lcg0Var2 = lcg0Var;
        mcg0Var.getClass();
        boolean z5 = z3;
        int i3 = i;
        return new mcg0(fcg0Var, z4, z2, i3, z5, lcg0Var2);
    }

    public final fcg0 b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mcg0)) {
            return false;
        }
        mcg0 mcg0Var = (mcg0) obj;
        return jl40.l(this.a, mcg0Var.a) && this.b == mcg0Var.b && this.c == mcg0Var.c && this.d == mcg0Var.d && this.e == mcg0Var.e && jl40.l(this.f, mcg0Var.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + unr0.e(oyr.b(this.d, unr0.e(unr0.e(Integer.hashCode(this.a.a) * 31, 31, this.b), 31, this.c), 31), 31, this.e);
    }

    public final String toString() {
        return "QrReaderState(scanningConfig=" + this.a + ", isFlashlightOn=" + this.b + ", bottomSheetShowing=" + this.c + ", processingQrCount=" + this.d + ", isRecognizeFromFileInProgress=" + this.e + ", qrResolvingRules=" + this.f + Extension.C_BRAKE;
    }
}
