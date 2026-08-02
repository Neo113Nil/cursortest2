package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class oby0 {
    public static final oby0 e = new oby0(13000, new nby0(mby0.a, 80000), new iby0(false), hby0.b);
    public final long a;
    public final nby0 b;
    public final kl3 c;
    public final dlb1 d;

    public oby0(long j, nby0 nby0Var, kl3 kl3Var, dlb1 dlb1Var) {
        this.a = j;
        this.b = nby0Var;
        this.c = kl3Var;
        this.d = dlb1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oby0)) {
            return false;
        }
        oby0 oby0Var = (oby0) obj;
        return this.a == oby0Var.a && this.b.equals(oby0Var.b) && this.c.equals(oby0Var.c) && this.d.equals(oby0Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (Long.hashCode(this.a) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "TaxiTravelerMovementConfig(defaultRequiredLagMs=" + this.a + ", turboMode=" + this.b + ", teleporting=" + this.c + ", batchProcessingStrategy=" + this.d + Extension.C_BRAKE;
    }
}
