package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class aig implements cig {
    public final double a;
    public final rr51 b;

    public aig(double d, rr51 rr51Var) {
        this.a = d;
        this.b = rr51Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aig)) {
            return false;
        }
        aig aigVar = (aig) obj;
        return Double.compare(this.a, aigVar.a) == 0 && this.b.equals(aigVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Double.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "Divkit(paddingBottom=" + this.a + ", divkitData=" + this.b + Extension.C_BRAKE;
    }
}
