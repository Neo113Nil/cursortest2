package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class ou3 {
    public final String a;
    public final boolean b;

    public ou3(String str, boolean z) {
        this.a = str;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ou3)) {
            return false;
        }
        ou3 ou3Var = (ou3) obj;
        return jl40.l(this.a, ou3Var.a) && this.b == ou3Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return xvz.k("InputInfo(value=", this.a, ", isValidateError=", this.b, Extension.C_BRAKE);
    }
}
