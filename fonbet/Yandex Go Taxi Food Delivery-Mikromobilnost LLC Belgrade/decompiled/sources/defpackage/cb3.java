package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes4.dex */
public final class cb3 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;

    public cb3(String str, String str2, String str3, String str4, String str5) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
    }

    public final String a() {
        return this.e;
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

    public final String e() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cb3)) {
            return false;
        }
        cb3 cb3Var = (cb3) obj;
        return this.a.equals(cb3Var.a) && jl40.l(this.b, cb3Var.b) && jl40.l(this.c, cb3Var.c) && jl40.l(this.d, cb3Var.d) && jl40.l(this.e, cb3Var.e);
    }

    public final int hashCode() {
        int b = unr0.b(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        int hashCode = (b + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.e;
        return hashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder v = b64.v("InfoDialog(id=", this.a, ", title=", this.b, ", message=");
        g8e.D(v, this.c, ", imageTag=", this.d, ", buttonText=");
        return oyr.t(v, this.e, Extension.C_BRAKE);
    }
}
