package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class oe11 {
    public final boolean a;
    public final b4 b;

    public oe11(boolean z, b4 b4Var) {
        this.a = z;
        this.b = b4Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oe11)) {
            return false;
        }
        oe11 oe11Var = (oe11) obj;
        return this.a == oe11Var.a && jl40.l(this.b, oe11Var.b);
    }

    public final int hashCode() {
        int hashCode = Boolean.hashCode(this.a) * 31;
        b4 b4Var = this.b;
        return hashCode + (b4Var == null ? 0 : b4Var.a.hashCode());
    }

    public final String toString() {
        return "TriggerCommunicationsConfigItem(enabled=" + this.a + ", abandonedCart=" + this.b + Extension.C_BRAKE;
    }

    public oe11() {
        this(false, null);
    }
}
