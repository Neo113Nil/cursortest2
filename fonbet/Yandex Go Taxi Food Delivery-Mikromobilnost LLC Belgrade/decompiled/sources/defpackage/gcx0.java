package defpackage;

import com.yandex.go.design.compose.colors.AppColor$Palette;
import com.yandex.go.summary.ui.model.expanded.content.tariffcard.header.AddressesTextStyleUiState;
import com.yandex.go.summary.ui.model.expanded.content.tariffcard.header.TariffDescriptionTextStyleUiState;
import com.yandex.go.summary.ui.model.expanded.content.tariffcard.header.TariffNameTextStyleUiState;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class gcx0 {
    public final boolean a;
    public final wp2 b;
    public final AddressesTextStyleUiState c;
    public final wp2 d;
    public final TariffNameTextStyleUiState e;
    public final wp2 f;
    public final int g;
    public final TariffDescriptionTextStyleUiState h;
    public final wp2 i;
    public final String j;
    public final int k;
    public final boolean l;
    public final int m;
    public final wp2 n;
    public final int o;
    public final wp2 p;
    public final boolean q;
    public final wp2 r;
    public final Float s;

    public gcx0(boolean z, AppColor$Palette appColor$Palette, AddressesTextStyleUiState addressesTextStyleUiState, AppColor$Palette appColor$Palette2, TariffNameTextStyleUiState tariffNameTextStyleUiState, AppColor$Palette appColor$Palette3, int i, TariffDescriptionTextStyleUiState tariffDescriptionTextStyleUiState, AppColor$Palette appColor$Palette4, String str, int i2, boolean z2, int i3, AppColor$Palette appColor$Palette5, int i4, AppColor$Palette appColor$Palette6, boolean z3, AppColor$Palette appColor$Palette7, Float f) {
        this.a = z;
        this.b = appColor$Palette;
        this.c = addressesTextStyleUiState;
        this.d = appColor$Palette2;
        this.e = tariffNameTextStyleUiState;
        this.f = appColor$Palette3;
        this.g = i;
        this.h = tariffDescriptionTextStyleUiState;
        this.i = appColor$Palette4;
        this.j = str;
        this.k = i2;
        this.l = z2;
        this.m = i3;
        this.n = appColor$Palette5;
        this.o = i4;
        this.p = appColor$Palette6;
        this.q = z3;
        this.r = appColor$Palette7;
        this.s = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gcx0)) {
            return false;
        }
        gcx0 gcx0Var = (gcx0) obj;
        return this.a == gcx0Var.a && jl40.l(this.b, gcx0Var.b) && this.c == gcx0Var.c && jl40.l(this.d, gcx0Var.d) && this.e == gcx0Var.e && jl40.l(this.f, gcx0Var.f) && this.g == gcx0Var.g && this.h == gcx0Var.h && jl40.l(this.i, gcx0Var.i) && jl40.l(this.j, gcx0Var.j) && this.k == gcx0Var.k && this.l == gcx0Var.l && this.m == gcx0Var.m && jl40.l(this.n, gcx0Var.n) && this.o == gcx0Var.o && jl40.l(this.p, gcx0Var.p) && this.q == gcx0Var.q && jl40.l(this.r, gcx0Var.r) && jl40.l(this.s, gcx0Var.s);
    }

    public final int hashCode() {
        int b = n.b(this.i, (this.h.hashCode() + oyr.b(this.g, n.b(this.f, (this.e.hashCode() + n.b(this.d, (this.c.hashCode() + n.b(this.b, Boolean.hashCode(this.a) * 31, 31)) * 31, 31)) * 31, 31), 31)) * 31, 31);
        String str = this.j;
        int e = unr0.e(n.b(this.p, oyr.b(this.o, n.b(this.n, oyr.b(this.m, unr0.e(oyr.b(this.k, (b + (str == null ? 0 : str.hashCode())) * 31, 31), 31, this.l), 31), 31), 31), 31), 31, this.q);
        wp2 wp2Var = this.r;
        int hashCode = (e + (wp2Var == null ? 0 : wp2Var.hashCode())) * 31;
        Float f = this.s;
        return hashCode + (f != null ? f.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TariffCardHeaderConfigUiState(isRedesigned=");
        sb.append(this.a);
        sb.append(", tariffDetailsButtonTintAppColor=");
        sb.append(this.b);
        sb.append(", addressesTextStyle=");
        sb.append(this.c);
        sb.append(", addressesTextAppColor=");
        sb.append(this.d);
        sb.append(", nameTextStyle=");
        sb.append(this.e);
        sb.append(", nameAppColor=");
        sb.append(this.f);
        sb.append(", nameBottomPadding=");
        sb.append(this.g);
        sb.append(", descriptionTextStyle=");
        sb.append(this.h);
        sb.append(", descriptionAppColor=");
        sb.append(this.i);
        sb.append(", formattedDescriptionColor=");
        sb.append(this.j);
        sb.append(", descriptionBottomPadding=");
        tse0.z(sb, this.k, ", isDescriptionShimmeringDisabled=", this.l, ", priceInfoBottomPadding=");
        sb.append(this.m);
        sb.append(", priceAppColor=");
        sb.append(this.n);
        sb.append(", priceChevronColorAttr=");
        sb.append(this.o);
        sb.append(", priceDetailsAppColor=");
        sb.append(this.p);
        sb.append(", shouldOverridePriceDetailsColor=");
        sb.append(this.q);
        sb.append(", loadingContentColor=");
        sb.append(this.r);
        sb.append(", loadingContentColorAlpha=");
        sb.append(this.s);
        sb.append(Extension.C_BRAKE);
        return sb.toString();
    }
}
