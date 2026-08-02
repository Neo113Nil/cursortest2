package defpackage;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public final class gdg {
    public final String a;
    public final edg b;
    public final jdg c;
    public final jdg d;
    public final sls e;
    public final jdg f;
    public final List g;
    public final hdg h;
    public final String i;
    public final String j;

    public gdg(String str, edg edgVar, jdg jdgVar, jdg jdgVar2, pdg pdgVar, jdg jdgVar3, ArrayList arrayList, hdg hdgVar, String str2, String str3) {
        this.a = str;
        this.b = edgVar;
        this.c = jdgVar;
        this.d = jdgVar2;
        this.e = pdgVar;
        this.f = jdgVar3;
        this.g = arrayList;
        this.h = hdgVar;
        this.i = str2;
        this.j = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gdg)) {
            return false;
        }
        gdg gdgVar = (gdg) obj;
        return jl40.l(this.a, gdgVar.a) && this.b.equals(gdgVar.b) && this.c.equals(gdgVar.c) && jl40.l(this.d, gdgVar.d) && jl40.l(this.e, gdgVar.e) && jl40.l(this.f, gdgVar.f) && jl40.l(this.g, gdgVar.g) && jl40.l(this.h, gdgVar.h) && jl40.l(this.i, gdgVar.i) && jl40.l(this.j, gdgVar.j);
    }

    public final int hashCode() {
        int hashCode = (this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31;
        jdg jdgVar = this.d;
        int hashCode2 = (hashCode + (jdgVar == null ? 0 : jdgVar.hashCode())) * 31;
        sls slsVar = this.e;
        int hashCode3 = (hashCode2 + (slsVar == null ? 0 : slsVar.hashCode())) * 31;
        jdg jdgVar2 = this.f;
        int hashCode4 = (hashCode3 + (jdgVar2 == null ? 0 : jdgVar2.hashCode())) * 31;
        List list = this.g;
        int hashCode5 = (hashCode4 + (list == null ? 0 : list.hashCode())) * 31;
        hdg hdgVar = this.h;
        int hashCode6 = (hashCode5 + (hdgVar == null ? 0 : hdgVar.hashCode())) * 31;
        String str = this.i;
        int hashCode7 = (hashCode6 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.j;
        return hashCode7 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BottomPartProperties(id=");
        sb.append(this.a);
        sb.append(", background=");
        sb.append(this.b);
        sb.append(", title=");
        sb.append(this.c);
        sb.append(", subtitle=");
        sb.append(this.d);
        sb.append(", rootClickListener=");
        sb.append(this.e);
        sb.append(", description=");
        sb.append(this.f);
        sb.append(", serviceUrls=");
        sb.append(this.g);
        sb.append(", button=");
        sb.append(this.h);
        sb.append(", leftConfettiUrl=");
        sb.append(this.i);
        sb.append(", rightConfettiUrl=");
        return b64.p(sb, this.j, ')');
    }
}
