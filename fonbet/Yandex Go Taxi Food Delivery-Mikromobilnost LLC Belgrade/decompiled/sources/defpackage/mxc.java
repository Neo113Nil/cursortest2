package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class mxc {
    public final long a;
    public final String b;
    public final ye0 c;

    public mxc(long j, String str, ye0 ye0Var) {
        this.a = j;
        this.b = str;
        this.c = ye0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mxc)) {
            return false;
        }
        mxc mxcVar = (mxc) obj;
        return this.a == mxcVar.a && jl40.l(this.b, mxcVar.b) && this.c.equals(mxcVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + unr0.b(Long.hashCode(this.a) * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder k = x4e.k("ComplaintPayload(companyId=", this.a, ", mediaId=", this.b);
        k.append(", mediaType=");
        k.append(this.c);
        k.append(Extension.C_BRAKE);
        return k.toString();
    }
}
