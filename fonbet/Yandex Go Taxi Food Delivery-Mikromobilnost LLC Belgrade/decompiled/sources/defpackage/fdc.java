package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class fdc implements idc {
    public final int a;
    public final int b;

    public fdc(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fdc)) {
            return false;
        }
        fdc fdcVar = (fdc) obj;
        return this.a == fdcVar.a && this.b == fdcVar.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        return unr0.p("MultiHex(light=", cma1.H0(this.a), ", dark=", cma1.H0(this.b), Extension.C_BRAKE);
    }
}
