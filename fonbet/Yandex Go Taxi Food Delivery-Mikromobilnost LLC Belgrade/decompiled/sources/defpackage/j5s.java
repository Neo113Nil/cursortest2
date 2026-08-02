package defpackage;

import java.util.ArrayList;
import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.logistics.sdk.ui.theme.theme_provider.ThemeStyle;

/* loaded from: classes5.dex */
public final class j5s {
    public final sr60 a;
    public final List b;
    public final t3s c;
    public final at0 d;
    public final ArrayList e;
    public final List f;
    public final ThemeStyle g;
    public final String h;
    public final Object i;
    public final poq0 j;
    public final l4s k;

    public j5s(sr60 sr60Var, List list, t3s t3sVar, at0 at0Var, ArrayList arrayList, ArrayList arrayList2, ThemeStyle themeStyle, String str, Object obj, poq0 poq0Var, l4s l4sVar) {
        this.a = sr60Var;
        this.b = list;
        this.c = t3sVar;
        this.d = at0Var;
        this.e = arrayList;
        this.f = arrayList2;
        this.g = themeStyle;
        this.h = str;
        this.i = obj;
        this.j = poq0Var;
        this.k = l4sVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j5s)) {
            return false;
        }
        j5s j5sVar = (j5s) obj;
        return jl40.l(this.a, j5sVar.a) && jl40.l(this.b, j5sVar.b) && jl40.l(this.c, j5sVar.c) && jl40.l(this.d, j5sVar.d) && this.e.equals(j5sVar.e) && jl40.l(this.f, j5sVar.f) && this.g == j5sVar.g && jl40.l(this.h, j5sVar.h) && jl40.l(this.i, j5sVar.i) && jl40.l(this.j, j5sVar.j) && this.k.equals(j5sVar.k);
    }

    public final int hashCode() {
        sr60 sr60Var = this.a;
        int hashCode = (sr60Var == null ? 0 : sr60Var.hashCode()) * 31;
        List list = this.b;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        t3s t3sVar = this.c;
        int hashCode3 = (hashCode2 + (t3sVar == null ? 0 : t3sVar.hashCode())) * 31;
        at0 at0Var = this.d;
        int b = ly3.b((hashCode3 + (at0Var == null ? 0 : at0Var.hashCode())) * 31, 31, this.e);
        List list2 = this.f;
        int hashCode4 = (this.g.hashCode() + ((b + (list2 == null ? 0 : list2.hashCode())) * 31)) * 31;
        String str = this.h;
        int hashCode5 = (hashCode4 + (str == null ? 0 : str.hashCode())) * 31;
        Object obj = this.i;
        int hashCode6 = (hashCode5 + (obj == null ? 0 : obj.hashCode())) * 31;
        poq0 poq0Var = this.j;
        return this.k.a.hashCode() + ((hashCode6 + (poq0Var != null ? poq0Var.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "FormOverride(offer=" + this.a + ", offers=" + this.b + ", layout=" + this.c + ", addressDetailsLayout=" + this.d + ", modals=" + this.e + ", partialAddressDetailsLayout=" + this.f + ", themeStyle=" + this.g + ", metricaLabel=" + this.h + ", meta=" + this.i + ", sendEventPayload=" + this.j + ", defaults=" + this.k + Extension.C_BRAKE;
    }
}
