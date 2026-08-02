package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class cjv {
    public final String a;
    public final String b;
    public final String c;

    public cjv(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cjv)) {
            return false;
        }
        cjv cjvVar = (cjv) obj;
        return jl40.l(this.a, cjvVar.a) && this.b.equals(cjvVar.b) && jl40.l(this.c, cjvVar.c);
    }

    public final int hashCode() {
        int b = unr0.b(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        return b + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return oyr.t(b64.v("Forwarding(id=", this.a, ", name=", this.b, ", avatarUrl="), this.c, Extension.C_BRAKE);
    }
}
