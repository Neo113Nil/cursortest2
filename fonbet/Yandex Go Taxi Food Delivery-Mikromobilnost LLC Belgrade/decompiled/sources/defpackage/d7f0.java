package defpackage;

import com.ybsdk.core.utils.ColorModel;
import com.ybsdk.core.utils.text.Text;
import com.ybsdk.feature.main.internal.domain.entities.ProductType;
import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class d7f0 {
    public final String a;
    public final String b;
    public final ProductType c;
    public final String d;
    public final List e;
    public final Text f;
    public final ColorModel g;
    public final eh4 h;
    public final rvt0 i;
    public final d2v0 j;
    public final d2v0 k;
    public final rbv l;
    public final z6f0 m;
    public final rr51 n;
    public final a9f0 o;
    public final rr51 p;

    public d7f0(String str, String str2, ProductType productType, String str3, List list, Text.Constant constant, ColorModel colorModel, eh4 eh4Var, rvt0 rvt0Var, d2v0 d2v0Var, d2v0 d2v0Var2, rbv rbvVar, z6f0 z6f0Var, rr51 rr51Var, a9f0 a9f0Var, rr51 rr51Var2) {
        this.a = str;
        this.b = str2;
        this.c = productType;
        this.d = str3;
        this.e = list;
        this.f = constant;
        this.g = colorModel;
        this.h = eh4Var;
        this.i = rvt0Var;
        this.j = d2v0Var;
        this.k = d2v0Var2;
        this.l = rbvVar;
        this.m = z6f0Var;
        this.n = rr51Var;
        this.o = a9f0Var;
        this.p = rr51Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d7f0)) {
            return false;
        }
        d7f0 d7f0Var = (d7f0) obj;
        return jl40.l(this.a, d7f0Var.a) && jl40.l(this.b, d7f0Var.b) && this.c == d7f0Var.c && jl40.l(this.d, d7f0Var.d) && jl40.l(this.e, d7f0Var.e) && jl40.l(this.f, d7f0Var.f) && jl40.l(this.g, d7f0Var.g) && jl40.l(this.h, d7f0Var.h) && jl40.l(this.i, d7f0Var.i) && jl40.l(this.j, d7f0Var.j) && jl40.l(this.k, d7f0Var.k) && jl40.l(this.l, d7f0Var.l) && jl40.l(this.m, d7f0Var.m) && jl40.l(this.n, d7f0Var.n) && jl40.l(this.o, d7f0Var.o) && jl40.l(this.p, d7f0Var.p);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int c = unr0.c(unr0.b((this.c.hashCode() + ((hashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31, 31, this.d), 31, this.e);
        Text text = this.f;
        int hashCode2 = (this.i.hashCode() + ((this.h.hashCode() + vfc.d(this.g, (c + (text == null ? 0 : text.hashCode())) * 31, 31)) * 31)) * 31;
        d2v0 d2v0Var = this.j;
        int hashCode3 = (hashCode2 + (d2v0Var == null ? 0 : d2v0Var.hashCode())) * 31;
        d2v0 d2v0Var2 = this.k;
        int hashCode4 = (hashCode3 + (d2v0Var2 == null ? 0 : d2v0Var2.hashCode())) * 31;
        rbv rbvVar = this.l;
        int hashCode5 = (hashCode4 + (rbvVar == null ? 0 : rbvVar.hashCode())) * 31;
        z6f0 z6f0Var = this.m;
        int hashCode6 = (hashCode5 + (z6f0Var == null ? 0 : z6f0Var.hashCode())) * 31;
        rr51 rr51Var = this.n;
        int hashCode7 = (hashCode6 + (rr51Var == null ? 0 : rr51Var.hashCode())) * 31;
        a9f0 a9f0Var = this.o;
        int hashCode8 = (hashCode7 + (a9f0Var == null ? 0 : a9f0Var.hashCode())) * 31;
        rr51 rr51Var2 = this.p;
        return hashCode8 + (rr51Var2 != null ? rr51Var2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder v = b64.v("ProductCardEntity(id=", this.a, ", viewId=", this.b, ", type=");
        v.append(this.c);
        v.append(", action=");
        v.append(this.d);
        v.append(", icons=");
        v.append(this.e);
        v.append(", title=");
        v.append(this.f);
        v.append(", titleColor=");
        v.append(this.g);
        v.append(", backgroundEntity=");
        v.append(this.h);
        v.append(", spoiler=");
        v.append(this.i);
        v.append(", subtitle=");
        v.append(this.j);
        v.append(", subtitleMini=");
        v.append(this.k);
        v.append(", iconAfterTitle=");
        v.append(this.l);
        v.append(", a11y=");
        v.append(this.m);
        v.append(", divRightPart=");
        v.append(this.n);
        v.append(", skin=");
        v.append(this.o);
        v.append(", productCaption=");
        v.append(this.p);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
