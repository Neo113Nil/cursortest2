package defpackage;

/* loaded from: classes2.dex */
public final class kdg {
    public final String a;
    public final jdg b;
    public final jdg c;
    public final jdg d;
    public final edg e;
    public final pdg f;
    public final hdg g;
    public final idg h;
    public final fdg i;
    public final String j;
    public final String k;
    public final String l;
    public final boolean m;

    public kdg(String str, jdg jdgVar, jdg jdgVar2, jdg jdgVar3, edg edgVar, pdg pdgVar, hdg hdgVar, idg idgVar, fdg fdgVar, String str2, String str3, String str4, boolean z) {
        this.a = str;
        this.b = jdgVar;
        this.c = jdgVar2;
        this.d = jdgVar3;
        this.e = edgVar;
        this.f = pdgVar;
        this.g = hdgVar;
        this.h = idgVar;
        this.i = fdgVar;
        this.j = str2;
        this.k = str3;
        this.l = str4;
        this.m = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kdg)) {
            return false;
        }
        kdg kdgVar = (kdg) obj;
        return jl40.l(this.a, kdgVar.a) && this.b.equals(kdgVar.b) && this.c.equals(kdgVar.c) && this.d.equals(kdgVar.d) && this.e.equals(kdgVar.e) && jl40.l(this.f, kdgVar.f) && jl40.l(this.g, kdgVar.g) && jl40.l(this.h, kdgVar.h) && jl40.l(this.i, kdgVar.i) && jl40.l(this.j, kdgVar.j) && jl40.l(this.k, kdgVar.k) && jl40.l(this.l, kdgVar.l) && this.m == kdgVar.m;
    }

    public final int hashCode() {
        int hashCode = (this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31;
        pdg pdgVar = this.f;
        int hashCode2 = (hashCode + (pdgVar == null ? 0 : pdgVar.hashCode())) * 31;
        hdg hdgVar = this.g;
        int hashCode3 = (hashCode2 + (hdgVar == null ? 0 : hdgVar.hashCode())) * 31;
        idg idgVar = this.h;
        int hashCode4 = (hashCode3 + (idgVar == null ? 0 : idgVar.hashCode())) * 31;
        fdg fdgVar = this.i;
        int hashCode5 = (hashCode4 + (fdgVar == null ? 0 : fdgVar.hashCode())) * 31;
        String str = this.j;
        int hashCode6 = (hashCode5 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.k;
        int hashCode7 = (hashCode6 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.l;
        return Boolean.hashCode(this.m) + ((hashCode7 + (str3 != null ? str3.hashCode() : 0)) * 961);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TopPartProperties(id=");
        sb.append(this.a);
        sb.append(", title=");
        sb.append(this.b);
        sb.append(", subtitle=");
        sb.append(this.c);
        sb.append(", description=");
        sb.append(this.d);
        sb.append(", background=");
        sb.append(this.e);
        sb.append(", rootClickListener=");
        sb.append(this.f);
        sb.append(", button=");
        sb.append(this.g);
        sb.append(", giftProgressProperties=");
        sb.append(this.h);
        sb.append(", badgeContent=");
        sb.append(this.i);
        sb.append(", giftUrl=");
        sb.append(this.j);
        sb.append(", confettiFirstLayerUrl=");
        sb.append(this.k);
        sb.append(", confettiSecondLayerUrl=");
        sb.append(this.l);
        sb.append(", analyticsParams=null, isBig=");
        return unr0.u(sb, this.m, ')');
    }
}
