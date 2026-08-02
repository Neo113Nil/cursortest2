package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes15.dex */
public final class jjs0 {
    public final hdb1 a;

    public jjs0(hdb1 hdb1Var) {
        this.a = hdb1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jjs0) && jl40.l(this.a, ((jjs0) obj).a);
    }

    public final int hashCode() {
        hdb1 hdb1Var = this.a;
        if (hdb1Var == null) {
            return 0;
        }
        return hdb1Var.hashCode();
    }

    public final String toString() {
        return "SizeHolder(height=" + this.a + Extension.C_BRAKE;
    }
}
