package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes4.dex */
public final class gzd {
    public final String a;
    public final String b;
    public final String c;
    public final String d;

    public gzd(String str, String str2, String str3, String str4) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gzd)) {
            return false;
        }
        gzd gzdVar = (gzd) obj;
        return jl40.l(this.a, gzdVar.a) && jl40.l(this.b, gzdVar.b) && jl40.l(this.c, gzdVar.c) && jl40.l(this.d, gzdVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + unr0.b(unr0.b(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        return g8e.r(b64.v("CloseDialogsTexts(title=", this.a, ", subtitle=", this.b, ", acceptText="), this.c, ", rejectText=", this.d, Extension.C_BRAKE);
    }
}
