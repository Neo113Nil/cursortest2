package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class n7k0 {
    public final au2 a;
    public final String b;

    public n7k0(au2 au2Var, String str) {
        this.a = au2Var;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof n7k0) {
            n7k0 n7k0Var = (n7k0) obj;
            if (this.a == n7k0Var.a && jl40.l(this.b, n7k0Var.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "MapActionButtonUiState(icon=" + this.a + ", contentDescription=" + this.b + Extension.C_BRAKE;
    }
}
