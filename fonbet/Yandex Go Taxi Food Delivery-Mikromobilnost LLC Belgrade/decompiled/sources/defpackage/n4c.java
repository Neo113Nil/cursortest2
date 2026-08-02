package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes4.dex */
public final class n4c implements q4c {
    public final String a;
    public final boolean b;

    public n4c(String str, boolean z) {
        this.a = str;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n4c)) {
            return false;
        }
        n4c n4cVar = (n4c) obj;
        return jl40.l(this.a, n4cVar.a) && this.b == n4cVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return xvz.k("FailedShowCamera(id=", this.a, ", isDenied=", this.b, Extension.C_BRAKE);
    }
}
