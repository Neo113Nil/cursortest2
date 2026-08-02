package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class m7k0 {
    public final String a;
    public final boolean b;

    public m7k0(String str, boolean z) {
        this.a = str;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m7k0)) {
            return false;
        }
        m7k0 m7k0Var = (m7k0) obj;
        return jl40.l(this.a, m7k0Var.a) && this.b == m7k0Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return xvz.k("AutoAcceptSwitchUiState(title=", this.a, ", isChecked=", this.b, Extension.C_BRAKE);
    }
}
