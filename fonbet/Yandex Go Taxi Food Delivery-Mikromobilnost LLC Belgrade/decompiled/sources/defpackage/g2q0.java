package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.logistics.sdk.dashboard.core.SectionStyle;

/* loaded from: classes5.dex */
public final class g2q0 {
    public final List a;
    public final String b;
    public final Object c;
    public final String d;
    public final boolean e;
    public final String f;
    public final SectionStyle g;
    public final zh4 h;
    public final boolean i;
    public final g3q0 j;

    public g2q0(List list, String str, Object obj, String str2, boolean z, String str3, SectionStyle sectionStyle, zh4 zh4Var, g3q0 g3q0Var, int i) {
        str = (i & 2) != 0 ? null : str;
        obj = (i & 4) != 0 ? null : obj;
        str2 = (i & 8) != 0 ? null : str2;
        boolean z2 = false;
        z = (i & 16) != 0 ? false : z;
        str3 = (i & 32) != 0 ? null : str3;
        sectionStyle = (i & 64) != 0 ? SectionStyle.DEFAULT : sectionStyle;
        zh4Var = (i & 128) != 0 ? null : zh4Var;
        List list2 = list;
        if (!(list2 instanceof Collection) || !list2.isEmpty()) {
            Iterator it = list2.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                } else if (((n351) it.next()).b()) {
                    z2 = true;
                    break;
                }
            }
        }
        g3q0Var = (i & 512) != 0 ? null : g3q0Var;
        this.a = list;
        this.b = str;
        this.c = obj;
        this.d = str2;
        this.e = z;
        this.f = str3;
        this.g = sectionStyle;
        this.h = zh4Var;
        this.i = z2;
        this.j = g3q0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g2q0)) {
            return false;
        }
        g2q0 g2q0Var = (g2q0) obj;
        return jl40.l(this.a, g2q0Var.a) && jl40.l(this.b, g2q0Var.b) && jl40.l(this.c, g2q0Var.c) && jl40.l(this.d, g2q0Var.d) && this.e == g2q0Var.e && jl40.l(this.f, g2q0Var.f) && this.g == g2q0Var.g && jl40.l(this.h, g2q0Var.h) && this.i == g2q0Var.i && jl40.l(this.j, g2q0Var.j);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Object obj = this.c;
        int hashCode3 = (hashCode2 + (obj == null ? 0 : obj.hashCode())) * 31;
        String str2 = this.d;
        int e = unr0.e((hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.e);
        String str3 = this.f;
        int hashCode4 = (this.g.hashCode() + ((e + (str3 == null ? 0 : str3.hashCode())) * 31)) * 31;
        zh4 zh4Var = this.h;
        int e2 = unr0.e((hashCode4 + (zh4Var == null ? 0 : zh4Var.hashCode())) * 31, 31, this.i);
        g3q0 g3q0Var = this.j;
        return e2 + (g3q0Var != null ? g3q0Var.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder s = xvz.s("SectionModel(widgets=", this.a, ", title=", this.b, ", meta=");
        s.append(this.c);
        s.append(", id=");
        s.append(this.d);
        s.append(", collapsed=");
        unr0.A(", metricaLabel=", this.f, ", style=", s, this.e);
        s.append(this.g);
        s.append(", background=");
        s.append(this.h);
        s.append(", isFlexible=");
        s.append(this.i);
        s.append(", promo=");
        s.append(this.j);
        s.append(Extension.C_BRAKE);
        return s.toString();
    }
}
