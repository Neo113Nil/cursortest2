package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class bky {
    public final String a;
    public final String b;
    public final String c;

    public bky(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bky)) {
            return false;
        }
        bky bkyVar = (bky) obj;
        return jl40.l(this.a, bkyVar.a) && jl40.l(this.b, bkyVar.b) && jl40.l(this.c, bkyVar.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return oyr.t(b64.v("LinkAccountsPresentationModel(linkAccountName=", this.a, ", linkAccountAvatar=", this.b, ", linkAccountEmail="), this.c, Extension.C_BRAKE);
    }
}
