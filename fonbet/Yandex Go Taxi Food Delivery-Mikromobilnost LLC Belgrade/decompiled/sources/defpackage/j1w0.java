package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes.dex */
public final class j1w0 {
    public final mo21 a;
    public final boolean b;

    public j1w0(mo21 mo21Var, boolean z) {
        this.a = mo21Var;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j1w0)) {
            return false;
        }
        j1w0 j1w0Var = (j1w0) obj;
        return jl40.l(this.a, j1w0Var.a) && this.b == j1w0Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "UserLocationWrapper(userLocation=" + this.a + ", isImmediateOnStart=" + this.b + Extension.C_BRAKE;
    }
}
