package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class lyx0 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;

    public lyx0(String str, String str2, String str3, String str4, String str5) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lyx0)) {
            return false;
        }
        lyx0 lyx0Var = (lyx0) obj;
        return jl40.l(this.a, lyx0Var.a) && jl40.l(this.b, lyx0Var.b) && jl40.l(this.c, lyx0Var.c) && jl40.l(this.d, lyx0Var.d) && jl40.l(this.e, lyx0Var.e);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.c;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.d;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.e;
        return hashCode4 + (str5 != null ? str5.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder v = b64.v("CallDriverData(avatarUrl=", this.a, ", carModel=", this.b, ", carPlate=");
        g8e.D(v, this.c, ", carColor=", this.d, ", carImageBase64=");
        return oyr.t(v, this.e, Extension.C_BRAKE);
    }
}
