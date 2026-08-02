package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.common_models.net.FormattedText;

/* loaded from: classes6.dex */
public final class ppi {
    public final int a;
    public final FormattedText b;
    public final FormattedText c;
    public final FormattedText d;
    public final String e;
    public final String f;
    public final boolean g;

    public ppi(int i, FormattedText formattedText, FormattedText formattedText2, FormattedText formattedText3, String str, String str2, boolean z) {
        this.a = i;
        this.b = formattedText;
        this.c = formattedText2;
        this.d = formattedText3;
        this.e = str;
        this.f = str2;
        this.g = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ppi)) {
            return false;
        }
        ppi ppiVar = (ppi) obj;
        return this.a == ppiVar.a && jl40.l(this.b, ppiVar.b) && jl40.l(this.c, ppiVar.c) && jl40.l(this.d, ppiVar.d) && jl40.l(this.e, ppiVar.e) && jl40.l(this.f, ppiVar.f) && this.g == ppiVar.g;
    }

    public final int hashCode() {
        int c = unr0.c(unr0.c(unr0.c(Integer.hashCode(this.a) * 31, 31, this.b.a), 31, this.c.a), 31, this.d.a);
        String str = this.e;
        int hashCode = (c + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f;
        return Boolean.hashCode(this.g) + ((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DeliverySlotListItem(orderPriority=");
        sb.append(this.a);
        sb.append(", pickupText=");
        sb.append(this.b);
        sb.append(", deliveryText=");
        n.C(sb, this.c, ", priceText=", this.d, ", selectedSummaryTrailTitle=");
        g8e.D(sb, this.e, ", selectedSummarySubtitle=", this.f, ", hasChevron=");
        return x4e.i(sb, this.g, Extension.C_BRAKE);
    }
}
