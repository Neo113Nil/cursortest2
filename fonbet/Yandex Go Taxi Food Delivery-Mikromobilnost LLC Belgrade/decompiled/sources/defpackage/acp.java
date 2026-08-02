package defpackage;

import com.yandex.plus.core.data.common.PlusColor;
import java.util.Map;

/* loaded from: classes2.dex */
public final class acp {
    public final String a;
    public final String b;
    public final h2d0 c;
    public final h2d0 d;
    public final PlusColor e;
    public final PlusColor f;
    public final int g;
    public final af0 h;
    public final Map i;

    public acp(String str, String str2, h2d0 h2d0Var, h2d0 h2d0Var2, PlusColor plusColor, PlusColor plusColor2, int i, af0 af0Var, Map map) {
        this.a = str;
        this.b = str2;
        this.c = h2d0Var;
        this.d = h2d0Var2;
        this.e = plusColor;
        this.f = plusColor2;
        this.g = i;
        this.h = af0Var;
        this.i = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof acp)) {
            return false;
        }
        acp acpVar = (acp) obj;
        return jl40.l(this.a, acpVar.a) && jl40.l(this.b, acpVar.b) && this.c.equals(acpVar.c) && this.d.equals(acpVar.d) && jl40.l(this.e, acpVar.e) && jl40.l(this.f, acpVar.f) && this.g == acpVar.g && jl40.l(this.h, acpVar.h) && jl40.l(this.i, acpVar.i);
    }

    public final int hashCode() {
        int hashCode = (this.d.hashCode() + ((this.c.hashCode() + unr0.b(this.a.hashCode() * 31, 31, this.b)) * 31)) * 31;
        PlusColor plusColor = this.e;
        int hashCode2 = (hashCode + (plusColor == null ? 0 : plusColor.hashCode())) * 31;
        PlusColor plusColor2 = this.f;
        int b = oyr.b(this.g, (hashCode2 + (plusColor2 == null ? 0 : plusColor2.hashCode())) * 31, 31);
        af0 af0Var = this.h;
        int hashCode3 = (b + (af0Var == null ? 0 : af0Var.hashCode())) * 31;
        Map map = this.i;
        return hashCode3 + (map != null ? map.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FamilyViewContent(title=");
        sb.append(this.a);
        sb.append(", subtitle=");
        sb.append(this.b);
        sb.append(", titleDrawableHolder=");
        sb.append(this.c);
        sb.append(", subtitleDrawableHolder=");
        sb.append(this.d);
        sb.append(", arrowIconColor=");
        sb.append(this.e);
        sb.append(", backgroundPlusColor=");
        sb.append(this.f);
        sb.append(", defaultBackgroundColor=");
        sb.append(this.g);
        sb.append(", addInFamilyViewContent=");
        sb.append(this.h);
        sb.append(", subtitlePluralForms=");
        return smw0.n(sb, this.i, ')');
    }
}
