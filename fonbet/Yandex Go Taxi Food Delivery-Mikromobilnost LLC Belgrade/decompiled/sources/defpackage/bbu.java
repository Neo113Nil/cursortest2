package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class bbu {
    public final String a;
    public final String b;
    public final String c;
    public final String d;

    public bbu(String str, String str2, String str3, String str4) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bbu)) {
            return false;
        }
        bbu bbuVar = (bbu) obj;
        return this.a.equals(bbuVar.a) && jl40.l(this.b, bbuVar.b) && jl40.l(this.c, bbuVar.c) && jl40.l(this.d, bbuVar.d);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.d;
        return hashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        return g8e.r(b64.v("HeaderModel(title=", this.a, ", subtitle=", this.b, ", leadImageTag="), this.c, ", trailButtonText=", this.d, Extension.C_BRAKE);
    }
}
