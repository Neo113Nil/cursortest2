package defpackage;

import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class gra {
    public final CharSequence a;
    public final List b;
    public final CharSequence c;
    public final ara d;
    public final swa e;
    public final nya f;
    public final fra g;
    public final List h;
    public final String i;
    public final cra j;
    public final rxa k;
    public final vva l;
    public final List m;
    public final bra n;
    public final Integer o;

    public gra(CharSequence charSequence, List list, CharSequence charSequence2, ara araVar, swa swaVar, nya nyaVar, fra fraVar, List list2, String str, cra craVar, rxa rxaVar, vva vvaVar, List list3, bra braVar, Integer num) {
        this.a = charSequence;
        this.b = list;
        this.c = charSequence2;
        this.d = araVar;
        this.e = swaVar;
        this.f = nyaVar;
        this.g = fraVar;
        this.h = list2;
        this.i = str;
        this.j = craVar;
        this.k = rxaVar;
        this.l = vvaVar;
        this.m = list3;
        this.n = braVar;
        this.o = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gra)) {
            return false;
        }
        gra graVar = (gra) obj;
        return jl40.l(this.a, graVar.a) && jl40.l(this.b, graVar.b) && jl40.l(this.c, graVar.c) && jl40.l(this.d, graVar.d) && jl40.l(this.e, graVar.e) && jl40.l(this.f, graVar.f) && jl40.l(this.g, graVar.g) && jl40.l(this.h, graVar.h) && jl40.l(this.i, graVar.i) && jl40.l(this.j, graVar.j) && jl40.l(this.k, graVar.k) && jl40.l(this.l, graVar.l) && this.m.equals(graVar.m) && jl40.l(this.n, graVar.n) && this.o.equals(graVar.o);
    }

    public final int hashCode() {
        int b = smw0.b(unr0.c(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        ara araVar = this.d;
        int hashCode = (b + (araVar == null ? 0 : araVar.hashCode())) * 31;
        swa swaVar = this.e;
        int hashCode2 = (hashCode + (swaVar == null ? 0 : swaVar.hashCode())) * 31;
        nya nyaVar = this.f;
        int hashCode3 = (hashCode2 + (nyaVar == null ? 0 : nyaVar.hashCode())) * 31;
        fra fraVar = this.g;
        int c = unr0.c((hashCode3 + (fraVar == null ? 0 : fraVar.hashCode())) * 31, 31, this.h);
        String str = this.i;
        int hashCode4 = (c + (str == null ? 0 : str.hashCode())) * 31;
        cra craVar = this.j;
        int hashCode5 = (hashCode4 + (craVar == null ? 0 : craVar.hashCode())) * 31;
        rxa rxaVar = this.k;
        int hashCode6 = (hashCode5 + (rxaVar == null ? 0 : rxaVar.hashCode())) * 31;
        vva vvaVar = this.l;
        int c2 = unr0.c((hashCode6 + (vvaVar == null ? 0 : vvaVar.hashCode())) * 31, 31, this.m);
        bra braVar = this.n;
        return this.o.hashCode() + ((c2 + (braVar != null ? braVar.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ChargersStationDetails(title=");
        sb.append((Object) this.a);
        sb.append(", buttons=");
        sb.append(this.b);
        sb.append(", subtitle=");
        sb.append((Object) this.c);
        sb.append(", aboutLocation=");
        sb.append(this.d);
        sb.append(", tariff=");
        sb.append(this.e);
        sb.append(", termsPlate=");
        sb.append(this.f);
        sb.append(", usageInstruction=");
        sb.append(this.g);
        sb.append(", badges=");
        sb.append(this.h);
        sb.append(", traceId=");
        sb.append(this.i);
        sb.append(", partnerInformation=");
        sb.append(this.j);
        sb.append(", tariffModal=");
        sb.append(this.k);
        sb.append(", surge=");
        sb.append(this.l);
        sb.append(", popupsShowPolicy=");
        sb.append(this.m);
        sb.append(", orderDetails=");
        sb.append(this.n);
        sb.append(", indexOfButtonWithTimer=");
        return oo31.j(sb, this.o, Extension.C_BRAKE);
    }
}
