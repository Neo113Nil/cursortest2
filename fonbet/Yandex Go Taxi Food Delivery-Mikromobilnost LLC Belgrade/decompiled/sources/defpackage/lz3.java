package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class lz3 {
    public final boolean a;
    public final String b;
    public final String c;
    public final c22 d;
    public final String e;
    public final iky0 f;

    public lz3(boolean z, String str, String str2, c22 c22Var, String str3, iky0 iky0Var) {
        this.a = z;
        this.b = str;
        this.c = str2;
        this.d = c22Var;
        this.e = str3;
        this.f = iky0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lz3)) {
            return false;
        }
        lz3 lz3Var = (lz3) obj;
        return this.a == lz3Var.a && jl40.l(this.b, lz3Var.b) && jl40.l(this.c, lz3Var.c) && jl40.l(this.d, lz3Var.d) && jl40.l(this.e, lz3Var.e) && jl40.l(this.f, lz3Var.f);
    }

    public final int hashCode() {
        int b = unr0.b(Boolean.hashCode(this.a) * 31, 31, this.b);
        String str = this.c;
        int hashCode = (b + (str == null ? 0 : str.hashCode())) * 31;
        c22 c22Var = this.d;
        int hashCode2 = (hashCode + (c22Var == null ? 0 : c22Var.hashCode())) * 31;
        String str2 = this.e;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        iky0 iky0Var = this.f;
        return hashCode3 + (iky0Var != null ? iky0Var.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder v = ly3.v("AutoFundData(enabled=", ", title=", this.b, ", description=", this.a);
        v.append(this.c);
        v.append(", amount=");
        v.append(this.d);
        v.append(", info=");
        v.append(this.e);
        v.append(", titleEndBadge=");
        v.append(this.f);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
