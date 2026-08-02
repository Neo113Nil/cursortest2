package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class cqs0 {
    public final hts0 a;
    public final fqs0 b;
    public final fqs0 c;
    public final fqs0 d;
    public final jvs0 e;
    public final jvs0 f;
    public final b151 g;
    public final x2s h;
    public final yg i;
    public final pus0 j;
    public final float k;
    public final hus0 l;
    public final boolean m;

    public cqs0(hts0 hts0Var, fqs0 fqs0Var, fqs0 fqs0Var2, fqs0 fqs0Var3, jvs0 jvs0Var, jvs0 jvs0Var2, b151 b151Var, x2s x2sVar, yg ygVar, pus0 pus0Var, float f, hus0 hus0Var, boolean z) {
        this.a = hts0Var;
        this.b = fqs0Var;
        this.c = fqs0Var2;
        this.d = fqs0Var3;
        this.e = jvs0Var;
        this.f = jvs0Var2;
        this.g = b151Var;
        this.h = x2sVar;
        this.i = ygVar;
        this.j = pus0Var;
        this.k = f;
        this.l = hus0Var;
        this.m = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cqs0)) {
            return false;
        }
        cqs0 cqs0Var = (cqs0) obj;
        return jl40.l(this.a, cqs0Var.a) && jl40.l(this.b, cqs0Var.b) && jl40.l(this.c, cqs0Var.c) && jl40.l(this.d, cqs0Var.d) && jl40.l(this.e, cqs0Var.e) && jl40.l(this.f, cqs0Var.f) && jl40.l(this.g, cqs0Var.g) && jl40.l(this.h, cqs0Var.h) && jl40.l(this.i, cqs0Var.i) && this.j.equals(cqs0Var.j) && y7m.b(this.k, cqs0Var.k) && jl40.l(this.l, cqs0Var.l) && this.m == cqs0Var.m;
    }

    public final int hashCode() {
        hts0 hts0Var = this.a;
        int hashCode = (this.b.hashCode() + ((hts0Var == null ? 0 : hts0Var.hashCode()) * 31)) * 31;
        fqs0 fqs0Var = this.c;
        int hashCode2 = (hashCode + (fqs0Var == null ? 0 : fqs0Var.hashCode())) * 31;
        fqs0 fqs0Var2 = this.d;
        int hashCode3 = (hashCode2 + (fqs0Var2 == null ? 0 : fqs0Var2.hashCode())) * 31;
        jvs0 jvs0Var = this.e;
        int hashCode4 = (hashCode3 + (jvs0Var == null ? 0 : jvs0Var.hashCode())) * 31;
        jvs0 jvs0Var2 = this.f;
        int hashCode5 = (hashCode4 + (jvs0Var2 == null ? 0 : jvs0Var2.hashCode())) * 31;
        b151 b151Var = this.g;
        int hashCode6 = (hashCode5 + (b151Var == null ? 0 : b151Var.hashCode())) * 31;
        x2s x2sVar = this.h;
        int hashCode7 = (hashCode6 + (x2sVar == null ? 0 : x2sVar.hashCode())) * 31;
        yg ygVar = this.i;
        return Boolean.hashCode(this.m) + ((this.l.hashCode() + g8e.c(this.k, (this.j.hashCode() + ((hashCode7 + (ygVar != null ? ygVar.hashCode() : 0)) * 31)) * 31, 31)) * 31);
    }

    public final String toString() {
        String c = y7m.c(this.k);
        StringBuilder sb = new StringBuilder("Slot(lead=");
        sb.append(this.a);
        sb.append(", body1=");
        sb.append(this.b);
        sb.append(", body2=");
        sb.append(this.c);
        sb.append(", body3=");
        sb.append(this.d);
        sb.append(", trail1=");
        sb.append(this.e);
        sb.append(", trail2=");
        sb.append(this.f);
        sb.append(", widgetAction=");
        sb.append(this.g);
        sb.append(", onShownAnalyticsData=");
        sb.append(this.h);
        sb.append(", accessibilityInfo=");
        sb.append(this.i);
        sb.append(", style=");
        sb.append(this.j);
        sb.append(", size=");
        sb.append(c);
        sb.append(", semantics=");
        sb.append(this.l);
        sb.append(", enabled=");
        return x4e.i(sb, this.m, Extension.C_BRAKE);
    }
}
