package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class fij0 implements kij0 {
    public final boolean a;
    public final boolean b;

    public fij0(boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fij0)) {
            return false;
        }
        fij0 fij0Var = (fij0) obj;
        return this.a == fij0Var.a && this.b == fij0Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Boolean.hashCode(this.a) * 31);
    }

    public final String toString() {
        return ly3.o("TestingOptions(isFirst=", ", isLast=", Extension.C_BRAKE, this.a, this.b);
    }

    public fij0() {
        this(false, false);
    }
}
