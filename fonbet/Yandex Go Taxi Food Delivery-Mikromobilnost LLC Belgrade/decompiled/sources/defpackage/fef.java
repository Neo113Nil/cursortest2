package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes9.dex */
public final class fef {
    public static final fef e = new fef(null, null, null, null);
    public final String a;
    public final String b;
    public final String c;
    public final String d;

    public fef(String str, String str2, String str3, String str4) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fef)) {
            return false;
        }
        fef fefVar = (fef) obj;
        return jl40.l(this.a, fefVar.a) && jl40.l(this.b, fefVar.b) && jl40.l(this.c, fefVar.c) && jl40.l(this.d, fefVar.d);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.c;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.d;
        return hashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        return g8e.r(b64.v("CurrencyRules(text=", this.a, ", code=", this.b, ", template="), this.c, ", sign=", this.d, Extension.C_BRAKE);
    }
}
