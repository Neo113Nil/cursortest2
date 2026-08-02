package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class j7v {
    public final String a;
    public final String b;
    public final String c;

    public j7v(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j7v)) {
            return false;
        }
        j7v j7vVar = (j7v) obj;
        return jl40.l(this.a, j7vVar.a) && jl40.l(this.b, j7vVar.b) && jl40.l(this.c, j7vVar.c);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.c;
        return hashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        return oyr.t(b64.v("Image(imageTag=", this.a, ", url=", this.b, ", tintColor="), this.c, Extension.C_BRAKE);
    }
}
