package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class lza {
    public static final lza f = new lza(false, "", "", "", "");
    public final boolean a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;

    public lza(boolean z, String str, String str2, String str3, String str4) {
        this.a = z;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lza)) {
            return false;
        }
        lza lzaVar = (lza) obj;
        return this.a == lzaVar.a && jl40.l(this.b, lzaVar.b) && jl40.l(this.c, lzaVar.c) && jl40.l(this.d, lzaVar.d) && jl40.l(this.e, lzaVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + unr0.b(unr0.b(unr0.b(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder v = ly3.v("CharityMenuItemInfo(isAvailable=", ", imageTag=", this.b, ", title=", this.a);
        g8e.D(v, this.c, ", subtitle=", this.d, ", url=");
        return oyr.t(v, this.e, Extension.C_BRAKE);
    }
}
