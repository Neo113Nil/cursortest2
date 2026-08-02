package defpackage;

import java.util.ArrayList;
import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.logistics.sdk.ui.theme.theme_provider.ThemeStyle;

/* loaded from: classes5.dex */
public final class l5s {
    public final sr60 a;
    public final List b;
    public final t3s c;
    public final at0 d;
    public final List e;
    public final List f;
    public final ThemeStyle g;
    public final String h;
    public final Object i;
    public final poq0 j;
    public final l4s k;
    public final List l;

    public l5s(sr60 sr60Var, ArrayList arrayList, t3s t3sVar, at0 at0Var, List list, ArrayList arrayList2, ThemeStyle themeStyle, String str, Object obj, poq0 poq0Var, l4s l4sVar, List list2) {
        this.a = sr60Var;
        this.b = arrayList;
        this.c = t3sVar;
        this.d = at0Var;
        this.e = list;
        this.f = arrayList2;
        this.g = themeStyle;
        this.h = str;
        this.i = obj;
        this.j = poq0Var;
        this.k = l4sVar;
        this.l = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l5s)) {
            return false;
        }
        l5s l5sVar = (l5s) obj;
        return jl40.l(this.a, l5sVar.a) && jl40.l(this.b, l5sVar.b) && jl40.l(this.c, l5sVar.c) && jl40.l(this.d, l5sVar.d) && this.e.equals(l5sVar.e) && jl40.l(this.f, l5sVar.f) && this.g == l5sVar.g && jl40.l(this.h, l5sVar.h) && jl40.l(this.i, l5sVar.i) && jl40.l(this.j, l5sVar.j) && this.k.equals(l5sVar.k) && this.l.equals(l5sVar.l);
    }

    public final int hashCode() {
        sr60 sr60Var = this.a;
        int hashCode = (sr60Var == null ? 0 : sr60Var.hashCode()) * 31;
        List list = this.b;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        t3s t3sVar = this.c;
        int hashCode3 = (hashCode2 + (t3sVar == null ? 0 : t3sVar.hashCode())) * 31;
        at0 at0Var = this.d;
        int c = unr0.c((hashCode3 + (at0Var == null ? 0 : at0Var.hashCode())) * 31, 31, this.e);
        List list2 = this.f;
        int hashCode4 = (this.g.hashCode() + ((c + (list2 == null ? 0 : list2.hashCode())) * 31)) * 31;
        String str = this.h;
        int hashCode5 = (hashCode4 + (str == null ? 0 : str.hashCode())) * 31;
        Object obj = this.i;
        int hashCode6 = (hashCode5 + (obj == null ? 0 : obj.hashCode())) * 31;
        poq0 poq0Var = this.j;
        return this.l.hashCode() + unr0.d((hashCode6 + (poq0Var != null ? poq0Var.hashCode() : 0)) * 31, 31, this.k.a);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FormOverrideInitialModel(offer=");
        sb.append(this.a);
        sb.append(", offers=");
        sb.append(this.b);
        sb.append(", layout=");
        sb.append(this.c);
        sb.append(", addressDetailsLayout=");
        sb.append(this.d);
        sb.append(", modals=");
        nnm.w(sb, this.e, ", partialAddressDetailsLayout=", this.f, ", themeStyle=");
        sb.append(this.g);
        sb.append(", metricaLabel=");
        sb.append(this.h);
        sb.append(", meta=");
        sb.append(this.i);
        sb.append(", sendEventPayload=");
        sb.append(this.j);
        sb.append(", defaults=");
        sb.append(this.k);
        sb.append(", layoutModifiers=");
        sb.append(this.l);
        sb.append(Extension.C_BRAKE);
        return sb.toString();
    }
}
