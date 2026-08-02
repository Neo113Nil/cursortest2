package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class fxo {
    public final String a;
    public final String b;
    public final String c;
    public final String d;

    public fxo(String str, String str2, String str3, String str4) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
    }

    public final String a() {
        return this.b;
    }

    public final String b() {
        return this.a;
    }

    public final String c() {
        return this.d;
    }

    public final String d() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fxo)) {
            return false;
        }
        fxo fxoVar = (fxo) obj;
        return jl40.l(this.a, fxoVar.a) && jl40.l(this.b, fxoVar.b) && jl40.l(this.c, fxoVar.c) && jl40.l(this.d, fxoVar.d);
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
        return g8e.r(b64.v("ImageTags(default=", this.a, ", background=", this.b, ", glossy="), this.c, ", details=", this.d, Extension.C_BRAKE);
    }
}
