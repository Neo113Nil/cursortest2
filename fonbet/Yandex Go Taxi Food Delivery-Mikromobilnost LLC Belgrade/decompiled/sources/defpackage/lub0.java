package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class lub0 {
    public static final lub0 d = new lub0(null, null, null);
    public final String a;
    public final String b;
    public final String c;

    public lub0(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lub0)) {
            return false;
        }
        lub0 lub0Var = (lub0) obj;
        return jl40.l(this.a, lub0Var.a) && jl40.l(this.b, lub0Var.b) && jl40.l(this.c, lub0Var.c);
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
        return oyr.t(b64.v("PinAppearance(iconTag=", this.a, ", backgroundColor=", this.b, ", textColor="), this.c, Extension.C_BRAKE);
    }
}
