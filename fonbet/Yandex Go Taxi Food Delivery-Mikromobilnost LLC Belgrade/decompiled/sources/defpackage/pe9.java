package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class pe9 implements qe9 {
    public final String a;
    public final boolean b;

    public pe9(String str, boolean z) {
        this.a = str;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pe9)) {
            return false;
        }
        pe9 pe9Var = (pe9) obj;
        return jl40.l(this.a, pe9Var.a) && this.b == pe9Var.b;
    }

    public final int hashCode() {
        String str = this.a;
        return Boolean.hashCode(this.b) + ((str == null ? 0 : str.hashCode()) * 31);
    }

    public final String toString() {
        return xvz.k("LongPolling(supportUrl=", this.a, ", showLogoutButton=", this.b, Extension.C_BRAKE);
    }
}
