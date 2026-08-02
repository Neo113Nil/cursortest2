package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class cav {
    public final String a;
    public final String b;

    public cav(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cav)) {
            return false;
        }
        cav cavVar = (cav) obj;
        return jl40.l(this.a, cavVar.a) && jl40.l(this.b, cavVar.b);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return unr0.p("ImageInfo(url=", this.a, ", tag=", this.b, Extension.C_BRAKE);
    }

    public cav() {
        this("", "");
    }
}
