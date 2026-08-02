package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class e47 {
    public final String a;
    public final boolean b;

    public e47(String str, boolean z) {
        this.a = str;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e47)) {
            return false;
        }
        e47 e47Var = (e47) obj;
        return jl40.l(this.a, e47Var.a) && this.b == e47Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return xvz.k("ButtonUiState(text=", this.a, ", isEnabled=", this.b, Extension.C_BRAKE);
    }
}
