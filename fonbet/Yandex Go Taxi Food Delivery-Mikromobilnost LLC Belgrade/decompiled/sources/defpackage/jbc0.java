package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class jbc0 {
    public final String a;
    public final String b;
    public final String c;

    public jbc0(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jbc0)) {
            return false;
        }
        jbc0 jbc0Var = (jbc0) obj;
        return jl40.l(this.a, jbc0Var.a) && jl40.l(this.b, jbc0Var.b) && jl40.l(this.c, jbc0Var.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        return this.c.hashCode() + ((hashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        return oyr.t(b64.v("PlacesMapScreenCategoryFilterAction(screenTitle=", this.a, ", suggestReqId=", this.b, ", geosearchContext="), this.c, Extension.C_BRAKE);
    }
}
