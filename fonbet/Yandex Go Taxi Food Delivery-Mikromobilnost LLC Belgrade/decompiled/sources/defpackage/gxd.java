package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes.dex */
public final class gxd {
    public final ety0 a;
    public final ety0 b;
    public final ety0 c;
    public final ety0 d;
    public final ety0 e;
    public final ety0 f;
    public final ety0 g;
    public final ety0 h;
    public final ety0 i;
    public final ety0 j;
    public final ety0 k;
    public final ety0 l;

    public gxd(ety0 ety0Var, ety0 ety0Var2, ety0 ety0Var3, ety0 ety0Var4, ety0 ety0Var5, ety0 ety0Var6, ety0 ety0Var7, ety0 ety0Var8, ety0 ety0Var9, ety0 ety0Var10, ety0 ety0Var11, ety0 ety0Var12) {
        this.a = ety0Var;
        this.b = ety0Var2;
        this.c = ety0Var3;
        this.d = ety0Var4;
        this.e = ety0Var5;
        this.f = ety0Var6;
        this.g = ety0Var7;
        this.h = ety0Var8;
        this.i = ety0Var9;
        this.j = ety0Var10;
        this.k = ety0Var11;
        this.l = ety0Var12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gxd)) {
            return false;
        }
        gxd gxdVar = (gxd) obj;
        return this.a.equals(gxdVar.a) && this.b.equals(gxdVar.b) && this.c.equals(gxdVar.c) && this.d.equals(gxdVar.d) && this.e.equals(gxdVar.e) && this.f.equals(gxdVar.f) && this.g.equals(gxdVar.g) && this.h.equals(gxdVar.h) && this.i.equals(gxdVar.i) && this.j.equals(gxdVar.j) && this.k.equals(gxdVar.k) && this.l.equals(gxdVar.l);
    }

    public final int hashCode() {
        return this.l.hashCode() + tse0.b(this.k, tse0.b(this.j, tse0.b(this.i, tse0.b(this.h, tse0.b(this.g, tse0.b(this.f, tse0.b(this.e, tse0.b(this.d, tse0.b(this.c, tse0.b(this.b, this.a.hashCode() * 31, 31), 31), 31), 31), 31), 31), 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CondensedTypography(header=");
        sb.append(this.a);
        sb.append(", title1Heavy=");
        sb.append(this.b);
        sb.append(", title2Heavy=");
        vfc.z(sb, this.c, ", title3Heavy=", this.d, ", title4Heavy=");
        vfc.z(sb, this.e, ", title5Heavy=", this.f, ", title5Bold=");
        vfc.z(sb, this.g, ", title5Regular=", this.h, ", title5TextBold=");
        vfc.z(sb, this.i, ", title6Heavy=", this.j, ", body2Regular=");
        sb.append(this.k);
        sb.append(", caption2Regular=");
        sb.append(this.l);
        sb.append(Extension.C_BRAKE);
        return sb.toString();
    }
}
