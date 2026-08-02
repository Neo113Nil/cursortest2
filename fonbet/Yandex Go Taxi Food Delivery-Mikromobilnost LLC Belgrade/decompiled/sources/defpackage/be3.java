package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class be3 implements de3 {
    public final sd3 a;
    public final ae3 b;
    public final ae3 c;
    public final String d;
    public final String e;
    public final zd3 f;
    public final boolean g;

    public be3(sd3 sd3Var, ae3 ae3Var, ae3 ae3Var2, String str, String str2, h0w h0wVar, boolean z) {
        this.a = sd3Var;
        this.b = ae3Var;
        this.c = ae3Var2;
        this.d = str;
        this.e = str2;
        this.f = h0wVar;
        this.g = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof be3)) {
            return false;
        }
        be3 be3Var = (be3) obj;
        return this.a.equals(be3Var.a) && this.b.equals(be3Var.b) && this.c.equals(be3Var.c) && jl40.l(this.d, be3Var.d) && jl40.l(this.e, be3Var.e) && jl40.l(this.f, be3Var.f) && this.g == be3Var.g;
    }

    public final int hashCode() {
        int b = unr0.b(unr0.b(unr0.e(unr0.e(this.a.hashCode() * 31, 31, this.b.a), 31, this.c.a), 31, this.d), 31, this.e);
        zd3 zd3Var = this.f;
        return Boolean.hashCode(this.g) + ((b + (zd3Var == null ? 0 : zd3Var.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Active(background=");
        sb.append(this.a);
        sb.append(", controlStart=");
        sb.append(this.b);
        sb.append(", controlEnd=");
        sb.append(this.c);
        sb.append(", title=");
        sb.append(this.d);
        sb.append(", subtitle=");
        sb.append(this.e);
        sb.append(", clickListener=");
        sb.append(this.f);
        sb.append(", isLoading=");
        return x4e.i(sb, this.g, Extension.C_BRAKE);
    }
}
