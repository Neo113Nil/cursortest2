package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class f7a implements g7a {
    public final String a;
    public final boolean b;

    public f7a(String str, boolean z) {
        this.a = str;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f7a)) {
            return false;
        }
        f7a f7aVar = (f7a) obj;
        return jl40.l(this.a, f7aVar.a) && this.b == f7aVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return xvz.k("SwitchToggle(id=", this.a, ", newStateEnabled=", this.b, Extension.C_BRAKE);
    }
}
