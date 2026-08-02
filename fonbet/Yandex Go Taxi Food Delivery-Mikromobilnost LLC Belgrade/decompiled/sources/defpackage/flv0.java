package defpackage;

import java.util.List;
import java.util.Map;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class flv0 implements ilv0 {
    public final String a;
    public final ht1 b;
    public final ht1 c;
    public final ht1 d;
    public final String e;
    public final String f;
    public final cmv0 g;
    public final List h;
    public final glv0 i;
    public final Map j;

    public flv0(String str, ht1 ht1Var, ht1 ht1Var2, ht1 ht1Var3, String str2, String str3, cmv0 cmv0Var, List list, glv0 glv0Var, Map map) {
        this.a = str;
        this.b = ht1Var;
        this.c = ht1Var2;
        this.d = ht1Var3;
        this.e = str2;
        this.f = str3;
        this.g = cmv0Var;
        this.h = list;
        this.i = glv0Var;
        this.j = map;
    }

    @Override // defpackage.ilv0
    public final glv0 a() {
        return this.i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof flv0)) {
            return false;
        }
        flv0 flv0Var = (flv0) obj;
        return jl40.l(this.a, flv0Var.a) && jl40.l(this.b, flv0Var.b) && jl40.l(this.c, flv0Var.c) && jl40.l(this.d, flv0Var.d) && jl40.l(this.e, flv0Var.e) && jl40.l(this.f, flv0Var.f) && this.g.equals(flv0Var.g) && jl40.l(this.h, flv0Var.h) && jl40.l(this.i, flv0Var.i) && jl40.l(this.j, flv0Var.j);
    }

    @Override // defpackage.ilv0
    public final String getId() {
        return this.a;
    }

    public final int hashCode() {
        int hashCode = (this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31)) * 31;
        String str = this.e;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f;
        int hashCode3 = (this.g.hashCode() + ((hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31)) * 31;
        List list = this.h;
        int hashCode4 = (hashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        glv0 glv0Var = this.i;
        int hashCode5 = (hashCode4 + (glv0Var == null ? 0 : glv0Var.hashCode())) * 31;
        Map map = this.j;
        return hashCode5 + (map != null ? map.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DefaultSummaryPromotionModalWindow(id=");
        sb.append(this.a);
        sb.append(", title=");
        sb.append(this.b);
        sb.append(", text=");
        sb.append(this.c);
        sb.append(", footer=");
        sb.append(this.d);
        sb.append(", imageUrl=");
        g8e.D(sb, this.e, ", iconUrl=", this.f, ", widget=");
        sb.append(this.g);
        sb.append(", bullets=");
        sb.append(this.h);
        sb.append(", orderButton=");
        sb.append(this.i);
        sb.append(", headerPayload=");
        sb.append(this.j);
        sb.append(Extension.C_BRAKE);
        return sb.toString();
    }
}
