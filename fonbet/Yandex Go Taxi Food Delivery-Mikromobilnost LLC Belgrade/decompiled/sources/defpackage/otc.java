package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class otc {
    public final ntc a;
    public final mtc b;

    public otc(ntc ntcVar, mtc mtcVar) {
        this.a = ntcVar;
        this.b = mtcVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof otc)) {
            return false;
        }
        otc otcVar = (otc) obj;
        return this.a.equals(otcVar.a) && jl40.l(this.b, otcVar.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        mtc mtcVar = this.b;
        return hashCode + (mtcVar == null ? 0 : mtcVar.hashCode());
    }

    public final String toString() {
        return "CommunicationsFontProperties(title=" + this.a + ", subtitle=" + this.b + Extension.C_BRAKE;
    }
}
