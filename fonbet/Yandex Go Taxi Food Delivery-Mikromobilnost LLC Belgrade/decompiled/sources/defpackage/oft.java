package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes15.dex */
public final class oft {
    public final String a;
    public final boolean b;

    public oft(String str, boolean z) {
        this.a = str;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oft)) {
            return false;
        }
        oft oftVar = (oft) obj;
        return jl40.l(this.a, oftVar.a) && this.b == oftVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return xvz.k("Params(guid=", this.a, ", reducedInfo=", this.b, Extension.C_BRAKE);
    }
}
