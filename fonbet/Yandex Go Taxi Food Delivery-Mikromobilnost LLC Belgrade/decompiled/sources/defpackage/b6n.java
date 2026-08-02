package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class b6n extends n351 {
    public final v4v c;
    public final cyu0 d;
    public final cyu0 e;
    public final gv90 f;
    public final cyu0 g;
    public final cyu0 h;
    public final v4v i;
    public final gv90 j;
    public final boolean k;
    public final String l;

    public b6n(v4v v4vVar, cyu0 cyu0Var, cyu0 cyu0Var2, gv90 gv90Var, cyu0 cyu0Var3, cyu0 cyu0Var4, lvi0 lvi0Var, gv90 gv90Var2, boolean z, String str) {
        super("dynamic-content-list-item-key", false, 14);
        this.c = v4vVar;
        this.d = cyu0Var;
        this.e = cyu0Var2;
        this.f = gv90Var;
        this.g = cyu0Var3;
        this.h = cyu0Var4;
        this.i = lvi0Var;
        this.j = gv90Var2;
        this.k = z;
        this.l = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b6n)) {
            return false;
        }
        b6n b6nVar = (b6n) obj;
        return jl40.l(this.c, b6nVar.c) && jl40.l(this.d, b6nVar.d) && jl40.l(this.e, b6nVar.e) && jl40.l(this.f, b6nVar.f) && jl40.l(this.g, b6nVar.g) && jl40.l(this.h, b6nVar.h) && jl40.l(this.i, b6nVar.i) && jl40.l(this.j, b6nVar.j) && this.k == b6nVar.k && jl40.l(this.l, b6nVar.l);
    }

    public final int hashCode() {
        v4v v4vVar = this.c;
        int hashCode = (this.d.hashCode() + ((v4vVar == null ? 0 : v4vVar.hashCode()) * 31)) * 31;
        cyu0 cyu0Var = this.e;
        int hashCode2 = (hashCode + (cyu0Var == null ? 0 : cyu0Var.hashCode())) * 31;
        gv90 gv90Var = this.f;
        int hashCode3 = (hashCode2 + (gv90Var == null ? 0 : gv90Var.hashCode())) * 31;
        cyu0 cyu0Var2 = this.g;
        int hashCode4 = (hashCode3 + (cyu0Var2 == null ? 0 : cyu0Var2.hashCode())) * 31;
        cyu0 cyu0Var3 = this.h;
        int hashCode5 = (hashCode4 + (cyu0Var3 == null ? 0 : cyu0Var3.hashCode())) * 31;
        v4v v4vVar2 = this.i;
        int hashCode6 = (hashCode5 + (v4vVar2 == null ? 0 : v4vVar2.hashCode())) * 31;
        gv90 gv90Var2 = this.j;
        int e = unr0.e((hashCode6 + (gv90Var2 == null ? 0 : gv90Var2.hashCode())) * 31, 31, this.k);
        String str = this.l;
        return e + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DynamicContentListItemModel(leadIcon=");
        sb.append(this.c);
        sb.append(", title=");
        sb.append(this.d);
        sb.append(", subtitle=");
        sb.append(this.e);
        sb.append(", generalPayload=");
        sb.append(this.f);
        sb.append(", trailTitle=");
        sb.append(this.g);
        sb.append(", trailSubtitle=");
        sb.append(this.h);
        sb.append(", trailIcon=");
        sb.append(this.i);
        sb.append(", trailPayload=");
        sb.append(this.j);
        sb.append(", isShimmering=");
        return n.m(", metricaLabel=", this.l, Extension.C_BRAKE, sb, this.k);
    }
}
