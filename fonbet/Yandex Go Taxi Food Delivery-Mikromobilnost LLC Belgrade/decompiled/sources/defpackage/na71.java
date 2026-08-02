package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;
import yads.fk1;

/* loaded from: classes7.dex */
public final class na71 {
    public final String a;
    public final String b;
    public final fk1 c;
    public final String d;
    public final String e;
    public final Float f;
    public final int g;
    public final int h;
    public final int i;
    public final String j;

    public na71(String str, String str2, fk1 fk1Var, String str3, String str4, Float f, int i, int i2, int i3, String str5) {
        this.a = str;
        this.b = str2;
        this.c = fk1Var;
        this.d = str3;
        this.e = str4;
        this.f = f;
        this.g = i;
        this.h = i2;
        this.i = i3;
        this.j = str5;
        jl40.l(str5, "VPAID");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof na71)) {
            return false;
        }
        na71 na71Var = (na71) obj;
        return jl40.l(this.a, na71Var.a) && jl40.l(this.b, na71Var.b) && this.c == na71Var.c && jl40.l(this.d, na71Var.d) && jl40.l(this.e, na71Var.e) && jl40.l(this.f, na71Var.f) && this.g == na71Var.g && this.h == na71Var.h && this.i == na71Var.i && jl40.l(this.j, na71Var.j);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        fk1 fk1Var = this.c;
        int hashCode3 = (hashCode2 + (fk1Var == null ? 0 : fk1Var.hashCode())) * 31;
        String str2 = this.d;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.e;
        int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Float f = this.f;
        int b = fia1.b(this.i, fia1.b(this.h, fia1.b(this.g, (hashCode5 + (f == null ? 0 : f.hashCode())) * 31)));
        String str4 = this.j;
        return b + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder v = b64.v("MediaFile(uri=", this.a, ", id=", this.b, ", deliveryMethod=");
        v.append(this.c);
        v.append(", mimeType=");
        v.append(this.d);
        v.append(", codec=");
        v.append(this.e);
        v.append(", vmafMetric=");
        v.append(this.f);
        v.append(", height=");
        vfc.u(this.g, this.h, ", width=", ", bitrate=", v);
        return xvz.h(this.i, ", apiFramework=", this.j, Extension.C_BRAKE, v);
    }
}
