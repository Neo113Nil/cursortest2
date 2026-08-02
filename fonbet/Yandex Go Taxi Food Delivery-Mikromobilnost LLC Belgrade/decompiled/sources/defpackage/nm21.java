package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes9.dex */
public final class nm21 {
    public final boolean a;
    public final boolean b;

    public nm21(boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nm21)) {
            return false;
        }
        nm21 nm21Var = (nm21) obj;
        return this.a == nm21Var.a && this.b == nm21Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Boolean.hashCode(this.a) * 31);
    }

    public final String toString() {
        return ly3.o("UserFingerprintCollectionConfig(enabled=", ", trackActivity=", Extension.C_BRAKE, this.a, this.b);
    }
}
