package defpackage;

import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class c8a {
    public final CharSequence a;
    public final b8a b;
    public final v7a c;
    public final w7a d;
    public final y7a e;
    public final vr60 f;
    public final List g;
    public final List h;
    public final swa i;
    public final List j;
    public final a8a k;
    public final vva l;
    public final x7a m;

    public c8a(CharSequence charSequence, b8a b8aVar, v7a v7aVar, w7a w7aVar, y7a y7aVar, vr60 vr60Var, List list, List list2, swa swaVar, List list3, a8a a8aVar, vva vvaVar, x7a x7aVar) {
        this.a = charSequence;
        this.b = b8aVar;
        this.c = v7aVar;
        this.d = w7aVar;
        this.e = y7aVar;
        this.f = vr60Var;
        this.g = list;
        this.h = list2;
        this.i = swaVar;
        this.j = list3;
        this.k = a8aVar;
        this.l = vvaVar;
        this.m = x7aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c8a)) {
            return false;
        }
        c8a c8aVar = (c8a) obj;
        return jl40.l(this.a, c8aVar.a) && jl40.l(this.b, c8aVar.b) && jl40.l(this.c, c8aVar.c) && jl40.l(this.d, c8aVar.d) && jl40.l(this.e, c8aVar.e) && jl40.l(this.f, c8aVar.f) && jl40.l(this.g, c8aVar.g) && jl40.l(this.h, c8aVar.h) && jl40.l(this.i, c8aVar.i) && jl40.l(this.j, c8aVar.j) && jl40.l(this.k, c8aVar.k) && jl40.l(this.l, c8aVar.l) && jl40.l(this.m, c8aVar.m);
    }

    public final int hashCode() {
        CharSequence charSequence = this.a;
        int hashCode = (charSequence == null ? 0 : charSequence.hashCode()) * 31;
        b8a b8aVar = this.b;
        int hashCode2 = (hashCode + (b8aVar == null ? 0 : b8aVar.hashCode())) * 31;
        v7a v7aVar = this.c;
        int hashCode3 = (hashCode2 + (v7aVar == null ? 0 : v7aVar.hashCode())) * 31;
        w7a w7aVar = this.d;
        int hashCode4 = (hashCode3 + (w7aVar == null ? 0 : w7aVar.hashCode())) * 31;
        y7a y7aVar = this.e;
        int hashCode5 = (hashCode4 + (y7aVar == null ? 0 : y7aVar.hashCode())) * 31;
        vr60 vr60Var = this.f;
        int c = unr0.c(unr0.c((hashCode5 + (vr60Var == null ? 0 : vr60Var.hashCode())) * 31, 31, this.g), 31, this.h);
        swa swaVar = this.i;
        int hashCode6 = (c + (swaVar == null ? 0 : swaVar.hashCode())) * 31;
        List list = this.j;
        int hashCode7 = (hashCode6 + (list == null ? 0 : list.hashCode())) * 31;
        a8a a8aVar = this.k;
        int hashCode8 = (hashCode7 + (a8aVar == null ? 0 : a8aVar.hashCode())) * 31;
        vva vvaVar = this.l;
        int hashCode9 = (hashCode8 + (vvaVar == null ? 0 : vvaVar.hashCode())) * 31;
        x7a x7aVar = this.m;
        return hashCode9 + (x7aVar != null ? x7aVar.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ChargersOfferContent(title=");
        sb.append((Object) this.a);
        sb.append(", station=");
        sb.append(this.b);
        sb.append(", address=");
        sb.append(this.c);
        sb.append(", banner=");
        sb.append(this.d);
        sb.append(", header=");
        sb.append(this.e);
        sb.append(", attentionHeader=");
        sb.append(this.f);
        sb.append(", pricing=");
        nnm.w(sb, this.g, ", button=", this.h, ", tariff=");
        sb.append(this.i);
        sb.append(", badges=");
        sb.append(this.j);
        sb.append(", promoPlate=");
        sb.append(this.k);
        sb.append(", surge=");
        sb.append(this.l);
        sb.append(", discountsEntryPoint=");
        sb.append(this.m);
        sb.append(Extension.C_BRAKE);
        return sb.toString();
    }
}
