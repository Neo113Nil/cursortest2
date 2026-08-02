package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class pbz {
    public final String a;
    public final kdc b;
    public final kdc c;

    public pbz(kdc kdcVar, kdc kdcVar2, String str) {
        this.a = str;
        this.b = kdcVar;
        this.c = kdcVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pbz)) {
            return false;
        }
        pbz pbzVar = (pbz) obj;
        return jl40.l(this.a, pbzVar.a) && jl40.l(this.b, pbzVar.b) && jl40.l(this.c, pbzVar.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        kdc kdcVar = this.b;
        int hashCode2 = (hashCode + (kdcVar == null ? 0 : kdcVar.hashCode())) * 31;
        kdc kdcVar2 = this.c;
        return hashCode2 + (kdcVar2 != null ? kdcVar2.hashCode() : 0);
    }

    public final String toString() {
        return "LocationIcon(iconUrl=" + this.a + ", backgroundColor=" + this.b + ", iconColor=" + this.c + Extension.C_BRAKE;
    }
}
