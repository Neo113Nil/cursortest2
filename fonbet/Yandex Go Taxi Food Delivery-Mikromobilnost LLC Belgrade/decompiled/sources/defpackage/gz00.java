package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class gz00 {
    public final String a;
    public final String b;
    public final String c;

    public gz00(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final String a() {
        return this.a;
    }

    public final String b() {
        return this.c;
    }

    public final String c() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gz00)) {
            return false;
        }
        gz00 gz00Var = (gz00) obj;
        return this.a.equals(gz00Var.a) && jl40.l(this.b, gz00Var.b) && jl40.l(this.c, gz00Var.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return oyr.t(b64.v("MassTransitLineDeeplink(lineId=", this.a, ", utmSource=", this.b, ", utmMedium="), this.c, Extension.C_BRAKE);
    }
}
