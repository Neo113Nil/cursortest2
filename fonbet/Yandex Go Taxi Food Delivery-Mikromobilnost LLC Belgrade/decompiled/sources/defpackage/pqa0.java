package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class pqa0 {
    public final String a;
    public final String b;
    public final String c;

    public pqa0(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pqa0)) {
            return false;
        }
        pqa0 pqa0Var = (pqa0) obj;
        return jl40.l(this.a, pqa0Var.a) && jl40.l(this.b, pqa0Var.b) && jl40.l(this.c, pqa0Var.c);
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
        return oyr.t(b64.v("HttpError(message=", this.a, ", code=", this.b, ", requestId="), this.c, Extension.C_BRAKE);
    }
}
