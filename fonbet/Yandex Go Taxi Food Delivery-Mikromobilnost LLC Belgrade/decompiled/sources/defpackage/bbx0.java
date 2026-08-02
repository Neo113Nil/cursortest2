package defpackage;

import android.graphics.Rect;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.appdelegates.SummaryUiDelegate$TariffCardStyle;

/* loaded from: classes6.dex */
public final class bbx0 {
    public final SummaryUiDelegate$TariffCardStyle a;
    public final float b;
    public final kdc c;
    public final kdc d;
    public final sls e;
    public final sls f;
    public final sls g;
    public final sls h;
    public final Rect i;
    public final int j;
    public final int k;
    public final int l;

    public bbx0(SummaryUiDelegate$TariffCardStyle summaryUiDelegate$TariffCardStyle, float f, kdc kdcVar, kdc kdcVar2, sls slsVar, sls slsVar2, sls slsVar3, sls slsVar4, Rect rect, int i, int i2, int i3) {
        this.a = summaryUiDelegate$TariffCardStyle;
        this.b = f;
        this.c = kdcVar;
        this.d = kdcVar2;
        this.e = slsVar;
        this.f = slsVar2;
        this.g = slsVar3;
        this.h = slsVar4;
        this.i = rect;
        this.j = i;
        this.k = i2;
        this.l = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bbx0)) {
            return false;
        }
        bbx0 bbx0Var = (bbx0) obj;
        return this.a == bbx0Var.a && Float.compare(this.b, bbx0Var.b) == 0 && jl40.l(this.c, bbx0Var.c) && jl40.l(this.d, bbx0Var.d) && jl40.l(this.e, bbx0Var.e) && jl40.l(this.f, bbx0Var.f) && jl40.l(this.g, bbx0Var.g) && jl40.l(this.h, bbx0Var.h) && jl40.l(this.i, bbx0Var.i) && this.j == bbx0Var.j && this.k == bbx0Var.k && this.l == bbx0Var.l;
    }

    public final int hashCode() {
        return Integer.hashCode(this.l) + oyr.b(this.k, oyr.b(this.j, (this.i.hashCode() + nnm.a(nnm.a(nnm.a(nnm.a(smw0.d(this.d, smw0.d(this.c, g8e.c(this.b, this.a.hashCode() * 31, 31), 31), 31), 31, this.e), 31, this.f), 31, this.g), 31, this.h)) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TariffAppearanceConfig(tariffCardStyle=");
        sb.append(this.a);
        sb.append(", unselectedCarIconAlpha=");
        sb.append(this.b);
        sb.append(", selectedTextColor=");
        sb.append(this.c);
        sb.append(", unselectedTextColor=");
        sb.append(this.d);
        sb.append(", backgroundDrawableProvider=");
        sb.append(this.e);
        sb.append(", alternativeOuterBackgroundProvider=");
        sb.append(this.f);
        sb.append(", alternativeOptionBackgroundProvider=");
        sb.append(this.g);
        sb.append(", priceLineProvider=");
        sb.append(this.h);
        sb.append(", insets=");
        sb.append(this.i);
        sb.append(", minWidth=");
        sb.append(this.j);
        sb.append(", itemMargin=");
        return ly3.k(this.k, this.l, ", edgeItemOffset=", Extension.C_BRAKE, sb);
    }
}
