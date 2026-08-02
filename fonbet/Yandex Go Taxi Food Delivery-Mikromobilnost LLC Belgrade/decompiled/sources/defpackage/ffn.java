package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class ffn {
    public final String a;
    public final String b;
    public final String c;
    public final String d;

    public ffn(String str, String str2, String str3, String str4) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
    }

    public final String a() {
        return this.d;
    }

    public final String b() {
        return this.c;
    }

    public final String c() {
        return this.a;
    }

    public final String d() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ffn)) {
            return false;
        }
        ffn ffnVar = (ffn) obj;
        return jl40.l(this.a, ffnVar.a) && jl40.l(this.b, ffnVar.b) && jl40.l(this.c, ffnVar.c) && jl40.l(this.d, ffnVar.d);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        return this.d.hashCode() + ((hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return g8e.r(b64.v("EatsOrderHeader(text=", this.a, ", textColor=", this.b, ", iconTag="), this.c, ", backgroundColor=", this.d, Extension.C_BRAKE);
    }
}
