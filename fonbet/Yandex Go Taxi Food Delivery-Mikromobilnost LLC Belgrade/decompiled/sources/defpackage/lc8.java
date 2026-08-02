package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class lc8 {
    public final String a;
    public final String b;
    public final d6w c;

    public lc8(String str, String str2, d6w d6wVar) {
        this.a = str;
        this.b = str2;
        this.c = d6wVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lc8)) {
            return false;
        }
        lc8 lc8Var = (lc8) obj;
        return jl40.l(this.a, lc8Var.a) && jl40.l(this.b, lc8Var.b) && jl40.l(this.c, lc8Var.c);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        d6w d6wVar = this.c;
        return hashCode2 + (d6wVar != null ? d6wVar.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder v = b64.v("CardCvvValidationInfo(errorMessageEmpty=", this.a, ", errorMessageLength=", this.b, ", expectedNumberLengthRange=");
        v.append(this.c);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
