package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class m17 {
    public final boolean a;
    public final boolean b;

    public m17(boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m17)) {
            return false;
        }
        m17 m17Var = (m17) obj;
        return this.a == m17Var.a && this.b == m17Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Boolean.hashCode(this.a) * 31);
    }

    public final String toString() {
        return ly3.o("ButtonModel(isEnabled=", ", isVisible=", Extension.C_BRAKE, this.a, this.b);
    }
}
