package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class j9x0 implements r9x0 {
    public final String a;
    public final boolean b;

    public j9x0(String str, boolean z) {
        this.a = str;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j9x0)) {
            return false;
        }
        j9x0 j9x0Var = (j9x0) obj;
        return jl40.l(this.a, j9x0Var.a) && this.b == j9x0Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return xvz.k("OpenWebViewAction(url=", this.a, ", shouldAuthorize=", this.b, Extension.C_BRAKE);
    }
}
