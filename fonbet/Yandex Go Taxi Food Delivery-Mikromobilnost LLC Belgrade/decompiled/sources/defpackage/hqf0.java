package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class hqf0 extends n351 {
    public final wsy0 c;
    public final wsy0 d;
    public final ldc e;
    public final ldc f;
    public final ky g;
    public final v4v h;
    public final w3b1 i;
    public final ome j;
    public final boolean k;
    public final String l;
    public final Object m;
    public final boolean n;

    public hqf0(wsy0 wsy0Var, wsy0 wsy0Var2, ldc ldcVar, ldc ldcVar2, ky kyVar, ra90 ra90Var, w3b1 w3b1Var, ome omeVar, boolean z, String str, Object obj, boolean z2) {
        super("promo", false, 14);
        this.c = wsy0Var;
        this.d = wsy0Var2;
        this.e = ldcVar;
        this.f = ldcVar2;
        this.g = kyVar;
        this.h = ra90Var;
        this.i = w3b1Var;
        this.j = omeVar;
        this.k = z;
        this.l = str;
        this.m = obj;
        this.n = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hqf0)) {
            return false;
        }
        hqf0 hqf0Var = (hqf0) obj;
        return this.c.equals(hqf0Var.c) && jl40.l(this.d, hqf0Var.d) && jl40.l(this.e, hqf0Var.e) && jl40.l(this.f, hqf0Var.f) && this.g.equals(hqf0Var.g) && jl40.l(this.h, hqf0Var.h) && jl40.l(this.i, hqf0Var.i) && jl40.l(this.j, hqf0Var.j) && this.k == hqf0Var.k && jl40.l(this.l, hqf0Var.l) && jl40.l(this.m, hqf0Var.m) && this.n == hqf0Var.n;
    }

    public final int hashCode() {
        int hashCode = this.c.hashCode() * 31;
        wsy0 wsy0Var = this.d;
        int hashCode2 = (hashCode + (wsy0Var == null ? 0 : wsy0Var.hashCode())) * 31;
        ldc ldcVar = this.e;
        int hashCode3 = (hashCode2 + (ldcVar == null ? 0 : Long.hashCode(ldcVar.a))) * 31;
        ldc ldcVar2 = this.f;
        int hashCode4 = (this.g.hashCode() + ((hashCode3 + (ldcVar2 == null ? 0 : Long.hashCode(ldcVar2.a))) * 31)) * 31;
        v4v v4vVar = this.h;
        int hashCode5 = (hashCode4 + (v4vVar == null ? 0 : v4vVar.hashCode())) * 31;
        w3b1 w3b1Var = this.i;
        int hashCode6 = (hashCode5 + (w3b1Var == null ? 0 : w3b1Var.hashCode())) * 31;
        ome omeVar = this.j;
        int e = unr0.e((hashCode6 + (omeVar == null ? 0 : omeVar.hashCode())) * 31, 31, this.k);
        String str = this.l;
        int hashCode7 = (e + (str == null ? 0 : str.hashCode())) * 31;
        Object obj = this.m;
        return Boolean.hashCode(this.n) + ((hashCode7 + (obj != null ? obj.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PromoState(title=");
        sb.append(this.c);
        sb.append(", subtitle=");
        sb.append(this.d);
        sb.append(", titleColor=");
        sb.append(this.e);
        sb.append(", subtitleColor=");
        sb.append(this.f);
        sb.append(", action=");
        sb.append(this.g);
        sb.append(", leadIcon=");
        sb.append(this.h);
        sb.append(", backgroundState=");
        sb.append(this.i);
        sb.append(", trailElement=");
        sb.append(this.j);
        sb.append(", showWhenSectionCollapsed=");
        unr0.A(", metricaLabel=", this.l, ", meta=", sb, this.k);
        sb.append(this.m);
        sb.append(", isCollapsed=");
        sb.append(this.n);
        sb.append(Extension.C_BRAKE);
        return sb.toString();
    }
}
