package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class bnb implements cnb {
    public final mkb a;
    public final String b;
    public final akb c;

    public bnb(mkb mkbVar, String str, akb akbVar) {
        this.a = mkbVar;
        this.b = str;
        this.c = akbVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bnb)) {
            return false;
        }
        bnb bnbVar = (bnb) obj;
        return jl40.l(this.a, bnbVar.a) && jl40.l(this.b, bnbVar.b) && this.c.equals(bnbVar.c);
    }

    @Override // defpackage.cnb
    public final snb getAnalytics() {
        return this.c;
    }

    public final int hashCode() {
        int hashCode = this.a.a.hashCode() * 31;
        String str = this.b;
        return this.c.hashCode() + ((hashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        return "VehicleSearchError(parameter=" + this.a + ", requestId=" + this.b + ", analytics=" + this.c + Extension.C_BRAKE;
    }
}
