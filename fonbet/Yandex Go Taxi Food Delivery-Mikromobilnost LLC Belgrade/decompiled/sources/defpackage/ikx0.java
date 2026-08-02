package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* loaded from: classes6.dex */
public final class ikx0 {
    public final int a;
    public final kb5 b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final c1f0 g;
    public final int h;
    public final List i;
    public final ArrayList j;
    public final jn40 k;
    public final mct0 l;
    public final String m;
    public final String n;
    public final String o;
    public final String p;
    public final m1a0 q;
    public final Map r;
    public final Map s;
    public final Map t;
    public final boolean u;
    public final boolean v;
    public final boolean w;
    public final boolean x;

    public ikx0(int i, kb5 kb5Var, String str, String str2, String str3, String str4, c1f0 c1f0Var, int i2, List list, ArrayList arrayList, jn40 jn40Var, mct0 mct0Var, String str5, String str6, String str7, String str8, m1a0 m1a0Var, Map map, Map map2, Map map3, boolean z, boolean z2, boolean z3, boolean z4) {
        this.a = i;
        this.b = kb5Var;
        this.c = str;
        this.d = str2;
        this.e = str3;
        this.f = str4;
        this.g = c1f0Var;
        this.h = i2;
        this.i = list;
        this.j = arrayList;
        this.k = jn40Var;
        this.l = mct0Var;
        this.m = str5;
        this.n = str6;
        this.o = str7;
        this.p = str8;
        this.q = m1a0Var;
        this.r = map;
        this.s = map2;
        this.t = map3;
        this.u = z;
        this.v = z2;
        this.w = z3;
        this.x = z4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ikx0)) {
            return false;
        }
        ikx0 ikx0Var = (ikx0) obj;
        if (this.a == ikx0Var.a && jl40.l(this.b, ikx0Var.b) && this.h == ikx0Var.h && jl40.l(this.g, ikx0Var.g) && this.c.equals(ikx0Var.c) && jl40.l(this.d, ikx0Var.d) && this.e.equals(ikx0Var.e) && this.f.equals(ikx0Var.f) && jl40.l(this.o, ikx0Var.o) && jl40.l(this.i, ikx0Var.i) && jl40.l(this.l, ikx0Var.l) && jl40.l(this.p, ikx0Var.p) && this.u == ikx0Var.u && this.v == ikx0Var.v && this.w == ikx0Var.w && this.x == ikx0Var.x) {
            return jl40.l(this.q, ikx0Var.q);
        }
        return false;
    }

    public final int hashCode() {
        int b = unr0.b((this.b.hashCode() + (this.a * 31)) * 31, 31, this.c);
        String str = this.d;
        int c = unr0.c((((this.g.hashCode() + unr0.b(unr0.b((b + (str != null ? str.hashCode() : 0)) * 31, 31, this.e), 31, this.f)) * 31) + this.h) * 31, 31, this.i);
        mct0 mct0Var = this.l;
        int hashCode = (c + (mct0Var != null ? mct0Var.hashCode() : 0)) * 31;
        String str2 = this.o;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.p;
        return ((((((((this.q.hashCode() + ((hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31)) * 31) + (this.u ? 1 : 0)) * 31) + (this.v ? 1 : 0)) * 31) + (this.w ? 1 : 0)) * 31) + (this.x ? 1 : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TariffCardPresentationModel{id=");
        sb.append(this.a);
        sb.append(", tariffInfo='");
        sb.append(this.b);
        sb.append("', title='");
        g8e.D(sb, this.c, "', imageUrl='", this.d, "', description='");
        g8e.D(sb, this.e, "', subtitle='", this.f, "', priceUiState='");
        sb.append(this.g);
        sb.append("', viewType=");
        sb.append(this.h);
        sb.append(", gluedRequirements=");
        sb.append(this.i);
        sb.append(", sourceDestinationModel=");
        sb.append(this.l);
        sb.append(", verticalSubtitle=");
        sb.append(this.p);
        sb.append(", selectedPayment=");
        sb.append(this.q);
        sb.append(", isEtaHighlightingAvailable=");
        nnm.v(", hasAltChoice=", ", hasSpecialRequirements=", sb, this.u, this.v);
        return smw0.k(", shouldOpenTariffDetailsOnCarClick=", "}", sb, this.w, this.x);
    }
}
