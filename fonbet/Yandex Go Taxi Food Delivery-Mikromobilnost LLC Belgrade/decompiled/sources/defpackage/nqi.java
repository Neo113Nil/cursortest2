package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class nqi {
    public final String a;
    public final String b;
    public final String c;
    public final String d;

    public nqi(String str, String str2, String str3, String str4) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nqi)) {
            return false;
        }
        nqi nqiVar = (nqi) obj;
        return jl40.l(this.a, nqiVar.a) && jl40.l(this.b, nqiVar.b) && jl40.l(this.c, nqiVar.c) && jl40.l(this.d, nqiVar.d);
    }

    public final int hashCode() {
        int b = unr0.b(unr0.b(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        String str = this.d;
        return b + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return g8e.r(b64.v("Header(defaultTitle=", this.a, ", completedTitle=", this.b, ", completedEmoji="), this.c, ", imageTag=", this.d, Extension.C_BRAKE);
    }
}
