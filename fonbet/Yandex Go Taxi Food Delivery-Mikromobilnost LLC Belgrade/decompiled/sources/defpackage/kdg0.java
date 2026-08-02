package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class kdg0 {
    public final boolean a;
    public final String b;
    public final ndg0 c;
    public final String d;
    public final String e;
    public final String f;

    public kdg0(boolean z, String str, ndg0 ndg0Var, String str2, String str3, String str4) {
        this.a = z;
        this.b = str;
        this.c = ndg0Var;
        this.d = str2;
        this.e = str3;
        this.f = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kdg0)) {
            return false;
        }
        kdg0 kdg0Var = (kdg0) obj;
        return this.a == kdg0Var.a && jl40.l(this.b, kdg0Var.b) && jl40.l(this.c, kdg0Var.c) && jl40.l(this.d, kdg0Var.d) && jl40.l(this.e, kdg0Var.e) && jl40.l(this.f, kdg0Var.f);
    }

    public final int hashCode() {
        int b = unr0.b(Boolean.hashCode(this.a) * 31, 31, this.b);
        ndg0 ndg0Var = this.c;
        int hashCode = (b + (ndg0Var == null ? 0 : ndg0Var.hashCode())) * 31;
        String str = this.d;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.e;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f;
        return hashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder v = ly3.v("QrResolutionResult(handled=", ", category=", this.b, ", target=", this.a);
        v.append(this.c);
        v.append(", qrType=");
        v.append(this.d);
        v.append(", qrcId=");
        return g8e.r(v, this.e, ", deeplinkForLogging=", this.f, Extension.C_BRAKE);
    }
}
