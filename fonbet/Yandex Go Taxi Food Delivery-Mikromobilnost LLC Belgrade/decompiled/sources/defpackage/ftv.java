package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class ftv {
    public final String a;
    public final String b;
    public final String c;

    public ftv(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ftv)) {
            return false;
        }
        ftv ftvVar = (ftv) obj;
        return jl40.l(this.a, ftvVar.a) && jl40.l(this.b, ftvVar.b) && jl40.l(this.c, ftvVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + unr0.b(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return oyr.t(b64.v("InfoItemData(title=", this.a, ", subtitle=", this.b, ", iconTag="), this.c, Extension.C_BRAKE);
    }
}
