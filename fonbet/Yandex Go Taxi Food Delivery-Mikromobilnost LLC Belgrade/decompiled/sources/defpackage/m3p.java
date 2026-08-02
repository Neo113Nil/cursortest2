package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class m3p implements k3p {
    public final String a;
    public final boolean b;

    public m3p(String str, boolean z) {
        this.a = str;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m3p)) {
            return false;
        }
        m3p m3pVar = (m3p) obj;
        return jl40.l(this.a, m3pVar.a) && this.b == m3pVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return xvz.k("RelativeNavigationAction(relativePath=", this.a, ", shouldUpdateUri=", this.b, Extension.C_BRAKE);
    }
}
