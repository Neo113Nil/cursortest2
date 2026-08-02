package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class ptv {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;

    public ptv(String str, String str2, String str3, String str4, String str5) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
    }

    public final boolean a() {
        String str;
        String str2;
        String str3 = this.a;
        return (str3 == null || evu0.J(str3) || (str = this.b) == null || evu0.J(str) || evu0.J(this.c) || evu0.J(this.d) || (str2 = this.e) == null || evu0.J(str2)) ? false : true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ptv)) {
            return false;
        }
        ptv ptvVar = (ptv) obj;
        return jl40.l(this.a, ptvVar.a) && jl40.l(this.b, ptvVar.b) && jl40.l(this.c, ptvVar.c) && jl40.l(this.d, ptvVar.d) && jl40.l(this.e, ptvVar.e);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int b = unr0.b(unr0.b((hashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.c), 31, this.d);
        String str3 = this.e;
        return b + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder v = b64.v("InfoScreen(content=", this.a, ", details=", this.b, ", iconTag=");
        g8e.D(v, this.c, ", detailsUrl=", this.d, ", detailsButtonTitle=");
        return oyr.t(v, this.e, Extension.C_BRAKE);
    }

    public ptv() {
        this(null, null, "", "", null);
    }
}
