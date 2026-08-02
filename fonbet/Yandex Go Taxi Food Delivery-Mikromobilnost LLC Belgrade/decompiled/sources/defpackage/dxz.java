package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class dxz {
    public final String a;
    public final boolean b;

    public dxz(String str, boolean z) {
        this.a = str;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dxz)) {
            return false;
        }
        dxz dxzVar = (dxz) obj;
        return jl40.l(this.a, dxzVar.a) && this.b == dxzVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return xvz.k("ButtonState(text=", this.a, ", isLoading=", this.b, Extension.C_BRAKE);
    }
}
