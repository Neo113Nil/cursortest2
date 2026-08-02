package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class fa6 {
    public final boolean a;
    public final boolean b;

    public fa6(boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fa6)) {
            return false;
        }
        fa6 fa6Var = (fa6) obj;
        return this.a == fa6Var.a && this.b == fa6Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Boolean.hashCode(this.a) * 31);
    }

    public final String toString() {
        return ly3.o("BooleanState(isChecked=", ", isEnabled=", Extension.C_BRAKE, this.a, this.b);
    }
}
