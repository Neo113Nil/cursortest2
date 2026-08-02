package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes15.dex */
public final class jzq {
    public final String a;
    public final long b;
    public final String c;

    public jzq(String str, long j, String str2) {
        this.a = str;
        this.b = j;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jzq)) {
            return false;
        }
        jzq jzqVar = (jzq) obj;
        return this.a.equals(jzqVar.a) && this.b == jzqVar.b && jl40.l(this.c, jzqVar.c);
    }

    public final int hashCode() {
        int c = qv10.c(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        return c + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return unr0.r(x4e.l("ShortFileData(fileName=", this.a, ", fileSize=", this.b), ", mimeType=", this.c, Extension.C_BRAKE);
    }
}
