package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class nsi {
    public final String a;
    public final String b;
    public final String c;
    public final boolean d;
    public final String e;

    public nsi(String str, String str2, String str3, String str4, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = z;
        this.e = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nsi)) {
            return false;
        }
        nsi nsiVar = (nsi) obj;
        return jl40.l(this.a, nsiVar.a) && jl40.l(this.b, nsiVar.b) && jl40.l(this.c, nsiVar.c) && this.d == nsiVar.d && jl40.l(this.e, nsiVar.e);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.c;
        int e = unr0.e((hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31, 31, this.d);
        String str4 = this.e;
        return e + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder v = b64.v("DeliverySuggestData(currentMode=", this.a, ", selectedClass=", this.b, ", hint=");
        tse0.y(this.c, ", isMapSelectionEnabled=", ", destinationSearchText=", v, this.d);
        return oyr.t(v, this.e, Extension.C_BRAKE);
    }
}
