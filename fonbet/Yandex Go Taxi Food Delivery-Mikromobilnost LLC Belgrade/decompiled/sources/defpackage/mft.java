package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes15.dex */
public final class mft {
    public final String a;
    public final boolean b;

    public mft(String str, boolean z) {
        this.a = str;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mft)) {
            return false;
        }
        mft mftVar = (mft) obj;
        return jl40.l(this.a, mftVar.a) && this.b == mftVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return xvz.k("Params(guid=", this.a, ", reducedInfo=", this.b, Extension.C_BRAKE);
    }
}
