package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class jh9 {
    public final String a;
    public final String b;
    public final String c;

    public jh9(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final String a() {
        return this.c;
    }

    public final String b() {
        return this.a;
    }

    public final String c() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jh9)) {
            return false;
        }
        jh9 jh9Var = (jh9) obj;
        return jl40.l(this.a, jh9Var.a) && jl40.l(this.b, jh9Var.b) && jl40.l(this.c, jh9Var.c);
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
        return oyr.t(b64.v("ChangeTovarischHostDeeplink(mode=", this.a, ", tovarischUrl=", this.b, ", forPath="), this.c, Extension.C_BRAKE);
    }

    public jh9() {
        this(null, null, null);
    }
}
