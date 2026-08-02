package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class f3q0 {
    public final boolean a;
    public final boolean b;

    public f3q0(boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f3q0)) {
            return false;
        }
        f3q0 f3q0Var = (f3q0) obj;
        return this.a == f3q0Var.a && this.b == f3q0Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Boolean.hashCode(this.a) * 31);
    }

    public final String toString() {
        return ly3.o("SectionPositionInfo(isFirst=", ", isLast=", Extension.C_BRAKE, this.a, this.b);
    }
}
