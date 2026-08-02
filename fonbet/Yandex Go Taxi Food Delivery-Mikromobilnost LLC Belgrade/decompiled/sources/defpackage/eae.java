package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes15.dex */
public final class eae {
    public final String a;
    public final String b;
    public final String c;
    public final String d;

    public eae(String str, String str2, String str3, String str4) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eae)) {
            return false;
        }
        eae eaeVar = (eae) obj;
        return jl40.l(this.a, eaeVar.a) && jl40.l(this.b, eaeVar.b) && jl40.l(this.c, eaeVar.c) && jl40.l(this.d, eaeVar.d);
    }

    public final int hashCode() {
        int b = unr0.b(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        int hashCode = (b + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return g8e.r(b64.v("ContactItem(key=", this.a, ", displayName=", this.b, ", userId="), this.c, ", phone=", this.d, Extension.C_BRAKE);
    }
}
