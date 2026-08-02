package defpackage;

import com.yandex.go.design.compose.colors.AppColor$Palette;
import ru.yandex.taxi.tooltips.SummaryTooltipAlignment;

/* loaded from: classes14.dex */
public final class mr31 {
    public final String a;
    public final String b;
    public final boolean c;
    public final boolean d;
    public final Integer e;
    public final int f;
    public final kdc g;
    public final wp2 h;
    public final SummaryTooltipAlignment i;
    public final pvz0 j;
    public final wp2 k;

    public mr31(String str, String str2, boolean z, Integer num, int i, bdc bdcVar, SummaryTooltipAlignment summaryTooltipAlignment, pvz0 pvz0Var, int i2) {
        str2 = (i2 & 2) != 0 ? "" : str2;
        z = (i2 & 4) != 0 ? false : z;
        boolean z2 = (i2 & 8) != 0;
        num = (i2 & 16) != 0 ? null : num;
        i = (i2 & 32) != 0 ? 8388611 : i;
        bdcVar = (i2 & 64) != 0 ? null : bdcVar;
        AppColor$Palette appColor$Palette = AppColor$Palette.BgInvert;
        summaryTooltipAlignment = (i2 & 256) != 0 ? SummaryTooltipAlignment.START : summaryTooltipAlignment;
        pvz0Var = (i2 & 512) != 0 ? null : pvz0Var;
        AppColor$Palette appColor$Palette2 = AppColor$Palette.TextInvert;
        this.a = str;
        this.b = str2;
        this.c = z;
        this.d = z2;
        this.e = num;
        this.f = i;
        this.g = bdcVar;
        this.h = appColor$Palette;
        this.i = summaryTooltipAlignment;
        this.j = pvz0Var;
        this.k = appColor$Palette2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mr31)) {
            return false;
        }
        mr31 mr31Var = (mr31) obj;
        return jl40.l(this.a, mr31Var.a) && jl40.l(this.b, mr31Var.b) && this.c == mr31Var.c && this.d == mr31Var.d && jl40.l(this.e, mr31Var.e) && this.f == mr31Var.f && jl40.l(this.g, mr31Var.g) && jl40.l(this.h, mr31Var.h) && this.i == mr31Var.i && jl40.l(this.j, mr31Var.j) && jl40.l(this.k, mr31Var.k);
    }

    public final int hashCode() {
        int e = unr0.e(unr0.e(unr0.b(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
        Integer num = this.e;
        int b = oyr.b(this.f, (e + (num == null ? 0 : num.hashCode())) * 31, 31);
        kdc kdcVar = this.g;
        int hashCode = (this.i.hashCode() + n.b(this.h, (b + (kdcVar == null ? 0 : kdcVar.hashCode())) * 31, 31)) * 31;
        pvz0 pvz0Var = this.j;
        return n.b(this.k, (hashCode + (pvz0Var != null ? pvz0Var.hashCode() : 0)) * 961, 31);
    }

    public final String toString() {
        StringBuilder v = b64.v("ViewGroupTooltip(text=", this.a, ", analyticsName=", this.b, ", isClickable=");
        nnm.v(", isShowActionImage=", ", textMaxLines=", v, this.c, this.d);
        v.append(this.e);
        v.append(", textGravity=");
        v.append(this.f);
        v.append(", bubbleColor=");
        v.append(this.g);
        v.append(", bubbleAppColor=");
        v.append(this.h);
        v.append(", bubbleAlignment=");
        v.append(this.i);
        v.append(", showPolicy=");
        v.append(this.j);
        v.append(", textColor=null, textAppColor=");
        v.append(this.k);
        v.append(", disableAccessibility=null)");
        return v.toString();
    }
}
