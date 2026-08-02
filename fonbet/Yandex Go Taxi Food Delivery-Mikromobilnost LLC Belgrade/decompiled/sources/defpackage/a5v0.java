package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes11.dex */
public final class a5v0 {
    public final long a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;

    public a5v0(String str, String str2, String str3, String str4, long j) {
        this.a = j;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a5v0)) {
            return false;
        }
        a5v0 a5v0Var = (a5v0) obj;
        return this.a == a5v0Var.a && jl40.l(this.b, a5v0Var.b) && jl40.l(this.c, a5v0Var.c) && jl40.l(this.d, a5v0Var.d) && jl40.l(this.e, a5v0Var.e);
    }

    public final int hashCode() {
        int b = unr0.b(Long.hashCode(this.a) * 31, 31, this.b);
        String str = this.c;
        int hashCode = (b + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.e;
        return hashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder k = x4e.k("SuggestEventParams(eventMilliTimestamp=", this.a, ", clientReqid=", this.b);
        g8e.D(k, ", addressSearch=", this.c, ", suggestSerpid=", this.d);
        return unr0.r(k, ", mainScreenVersion=", this.e, Extension.C_BRAKE);
    }
}
