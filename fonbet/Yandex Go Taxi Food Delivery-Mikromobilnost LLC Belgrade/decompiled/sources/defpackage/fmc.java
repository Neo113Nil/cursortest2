package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class fmc {
    public final String a;
    public final String b;
    public final String c;

    public fmc(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fmc)) {
            return false;
        }
        fmc fmcVar = (fmc) obj;
        return jl40.l(this.a, fmcVar.a) && jl40.l(this.b, fmcVar.b) && jl40.l(this.c, fmcVar.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        return this.c.hashCode() + ((hashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        return oyr.t(b64.v("CommentFieldUiState(hint=", this.a, ", value=", this.b, ", backgroundColor="), this.c, Extension.C_BRAKE);
    }
}
