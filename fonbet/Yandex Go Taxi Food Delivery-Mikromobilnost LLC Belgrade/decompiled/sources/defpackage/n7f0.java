package defpackage;

import com.ybsdk.core.utils.ColorModel;
import com.ybsdk.core.utils.text.Text;
import com.ybsdk.feature.main.internal.domain.entities.ProductType;
import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class n7f0 {
    public final String a;
    public final String b;
    public final ProductType c;
    public final Text d;
    public final ColorModel e;
    public final Text f;
    public final List g;
    public final ColorModel h;
    public final rbv i;
    public final qzt j;
    public final String k;
    public final k7f0 l;
    public final y760 m;
    public final rbv n;
    public final j7f0 o;
    public final m7f0 p;
    public final m7f0 q;
    public final l7f0 r;
    public final String s;
    public final rr51 t;

    public n7f0(String str, String str2, ProductType productType, Text text, ColorModel colorModel, Text text2, List list, ColorModel colorModel2, rbv rbvVar, qzt qztVar, String str3, k7f0 k7f0Var, y760 y760Var, rbv rbvVar2, j7f0 j7f0Var, m7f0 m7f0Var, m7f0 m7f0Var2, l7f0 l7f0Var, String str4, rr51 rr51Var) {
        this.a = str;
        this.b = str2;
        this.c = productType;
        this.d = text;
        this.e = colorModel;
        this.f = text2;
        this.g = list;
        this.h = colorModel2;
        this.i = rbvVar;
        this.j = qztVar;
        this.k = str3;
        this.l = k7f0Var;
        this.m = y760Var;
        this.n = rbvVar2;
        this.o = j7f0Var;
        this.p = m7f0Var;
        this.q = m7f0Var2;
        this.r = l7f0Var;
        this.s = str4;
        this.t = rr51Var;
    }

    public static n7f0 a(n7f0 n7f0Var, y760 y760Var, m7f0 m7f0Var, int i) {
        String str = n7f0Var.a;
        String str2 = n7f0Var.b;
        ProductType productType = n7f0Var.c;
        Text text = n7f0Var.d;
        ColorModel colorModel = n7f0Var.e;
        Text text2 = n7f0Var.f;
        List list = n7f0Var.g;
        ColorModel colorModel2 = n7f0Var.h;
        rbv rbvVar = n7f0Var.i;
        qzt qztVar = n7f0Var.j;
        String str3 = n7f0Var.k;
        k7f0 k7f0Var = n7f0Var.l;
        y760 y760Var2 = (i & 4096) != 0 ? n7f0Var.m : y760Var;
        rbv rbvVar2 = n7f0Var.n;
        y760 y760Var3 = y760Var2;
        j7f0 j7f0Var = n7f0Var.o;
        m7f0 m7f0Var2 = (i & 32768) != 0 ? n7f0Var.p : m7f0Var;
        m7f0 m7f0Var3 = n7f0Var.q;
        l7f0 l7f0Var = n7f0Var.r;
        n7f0Var.getClass();
        String str4 = n7f0Var.s;
        rr51 rr51Var = n7f0Var.t;
        n7f0Var.getClass();
        return new n7f0(str, str2, productType, text, colorModel, text2, list, colorModel2, rbvVar, qztVar, str3, k7f0Var, y760Var3, rbvVar2, j7f0Var, m7f0Var2, m7f0Var3, l7f0Var, str4, rr51Var);
    }

    public final String b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n7f0)) {
            return false;
        }
        n7f0 n7f0Var = (n7f0) obj;
        return jl40.l(this.a, n7f0Var.a) && jl40.l(this.b, n7f0Var.b) && this.c == n7f0Var.c && jl40.l(this.d, n7f0Var.d) && jl40.l(this.e, n7f0Var.e) && jl40.l(this.f, n7f0Var.f) && jl40.l(this.g, n7f0Var.g) && this.h.equals(n7f0Var.h) && jl40.l(this.i, n7f0Var.i) && jl40.l(this.j, n7f0Var.j) && jl40.l(this.k, n7f0Var.k) && this.l.equals(n7f0Var.l) && jl40.l(this.m, n7f0Var.m) && jl40.l(this.n, n7f0Var.n) && jl40.l(this.o, n7f0Var.o) && jl40.l(this.p, n7f0Var.p) && jl40.l(this.q, n7f0Var.q) && jl40.l(this.r, n7f0Var.r) && jl40.l(this.s, n7f0Var.s) && jl40.l(this.t, n7f0Var.t);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int d = vfc.d(this.e, n.c(this.d, (this.c.hashCode() + ((hashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31, 31), 31);
        Text text = this.f;
        int d2 = vfc.d(this.h, unr0.c((d + (text == null ? 0 : text.hashCode())) * 31, 31, this.g), 31);
        rbv rbvVar = this.i;
        int hashCode2 = (d2 + (rbvVar == null ? 0 : rbvVar.hashCode())) * 31;
        qzt qztVar = this.j;
        int hashCode3 = (this.l.hashCode() + unr0.b((hashCode2 + (qztVar == null ? 0 : qztVar.hashCode())) * 31, 31, this.k)) * 31;
        y760 y760Var = this.m;
        int hashCode4 = (hashCode3 + (y760Var == null ? 0 : y760Var.hashCode())) * 31;
        rbv rbvVar2 = this.n;
        int hashCode5 = (hashCode4 + (rbvVar2 == null ? 0 : rbvVar2.hashCode())) * 31;
        j7f0 j7f0Var = this.o;
        int hashCode6 = (hashCode5 + (j7f0Var == null ? 0 : j7f0Var.hashCode())) * 31;
        m7f0 m7f0Var = this.p;
        int hashCode7 = (hashCode6 + (m7f0Var == null ? 0 : m7f0Var.hashCode())) * 31;
        m7f0 m7f0Var2 = this.q;
        int hashCode8 = (hashCode7 + (m7f0Var2 == null ? 0 : m7f0Var2.hashCode())) * 31;
        l7f0 l7f0Var = this.r;
        int e = unr0.e((hashCode8 + (l7f0Var == null ? 0 : l7f0Var.hashCode())) * 31, 31, false);
        String str2 = this.s;
        int hashCode9 = (e + (str2 == null ? 0 : str2.hashCode())) * 31;
        rr51 rr51Var = this.t;
        return hashCode9 + (rr51Var != null ? rr51Var.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder v = b64.v("State(id=", this.a, ", viewId=", this.b, ", type=");
        v.append(this.c);
        v.append(", title=");
        v.append(this.d);
        v.append(", titleColor=");
        v.append(this.e);
        v.append(", contentDescription=");
        v.append(this.f);
        v.append(", icons=");
        v.append(this.g);
        v.append(", backgroundColor=");
        v.append(this.h);
        v.append(", backgroundImageNewStack=");
        v.append(this.i);
        v.append(", backgroundGradient=");
        v.append(this.j);
        v.append(", productDeeplink=");
        v.append(this.k);
        v.append(", spoiler=");
        v.append(this.l);
        v.append(", nfcBadgeState=");
        v.append(this.m);
        v.append(", iconAfterTitle=");
        v.append(this.n);
        v.append(", a11y=");
        v.append(this.o);
        v.append(", productRightPartSubtitleText=");
        v.append(this.p);
        v.append(", productRightPartSubtitleMiniText=");
        v.append(this.q);
        v.append(", productRightPartSubtitleDivBlock=");
        v.append(this.r);
        v.append(", hasShimmerAnimationBeenShown=false, skinId=");
        v.append(this.s);
        v.append(", productCaption=");
        v.append(this.t);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
