package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class pct0 extends qct0 {
    public final mct0 a;
    public final boolean b;

    public pct0(mct0 mct0Var, boolean z) {
        this.a = mct0Var;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pct0)) {
            return false;
        }
        pct0 pct0Var = (pct0) obj;
        return jl40.l(this.a, pct0Var.a) && this.b == pct0Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Old(model=" + this.a + ", isLoading=" + this.b + Extension.C_BRAKE;
    }
}
