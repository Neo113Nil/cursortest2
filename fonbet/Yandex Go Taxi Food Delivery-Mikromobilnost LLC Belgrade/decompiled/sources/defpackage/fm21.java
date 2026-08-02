package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes15.dex */
public final class fm21 {
    public final String a;
    public final boolean b;

    public fm21(String str, boolean z) {
        this.a = str;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fm21)) {
            return false;
        }
        fm21 fm21Var = (fm21) obj;
        return jl40.l(this.a, fm21Var.a) && this.b == fm21Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return xvz.k("UserFilterParams(userId=", this.a, ", isRobot=", this.b, Extension.C_BRAKE);
    }
}
