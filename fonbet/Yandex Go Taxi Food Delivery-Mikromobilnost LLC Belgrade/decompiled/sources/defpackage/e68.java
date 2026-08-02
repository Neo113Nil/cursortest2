package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class e68 {
    public final boolean a;
    public final boolean b;

    public e68(boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e68)) {
            return false;
        }
        e68 e68Var = (e68) obj;
        return this.a == e68Var.a && this.b == e68Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Boolean.hashCode(this.a) * 31);
    }

    public final String toString() {
        return ly3.o("CarParksState(isEnabled=", ", isVisible=", Extension.C_BRAKE, this.a, this.b);
    }
}
