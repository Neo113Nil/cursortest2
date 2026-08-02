package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class iby {
    public double a;
    public double b;

    public iby(double d, double d2) {
        this.a = d;
        this.b = d2;
    }

    public final void a(iby ibyVar) {
        this.a += ibyVar.a;
        this.b += ibyVar.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iby)) {
            return false;
        }
        iby ibyVar = (iby) obj;
        return Double.compare(this.a, ibyVar.a) == 0 && Double.compare(this.b, ibyVar.b) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.b) + (Double.hashCode(this.a) * 31);
    }

    public final String toString() {
        double d = this.a;
        return nzs.c(oyr.u(d, "Length(time=", ", distance="), this.b, Extension.C_BRAKE);
    }

    public iby() {
        this(0);
    }

    public /* synthetic */ iby(int i) {
        this(0.0d, 0.0d);
    }
}
