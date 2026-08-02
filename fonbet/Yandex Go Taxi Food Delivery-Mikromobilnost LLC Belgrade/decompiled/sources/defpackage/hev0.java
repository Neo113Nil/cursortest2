package defpackage;

import com.yandex.go.zone.dto.objects.SummaryCardPromo;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class hev0 {
    public final boolean a;
    public final String b;
    public final int c;
    public final SummaryCardPromo d;

    public hev0(boolean z, String str, int i, SummaryCardPromo summaryCardPromo) {
        this.a = z;
        this.b = str;
        this.c = i;
        this.d = summaryCardPromo;
    }

    public static hev0 a(hev0 hev0Var, int i, SummaryCardPromo summaryCardPromo, int i2) {
        boolean z = (i2 & 1) != 0 ? hev0Var.a : true;
        String str = hev0Var.b;
        if ((i2 & 8) != 0) {
            summaryCardPromo = hev0Var.d;
        }
        hev0Var.getClass();
        return new hev0(z, str, i, summaryCardPromo);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hev0)) {
            return false;
        }
        hev0 hev0Var = (hev0) obj;
        return this.a == hev0Var.a && jl40.l(this.b, hev0Var.b) && this.c == hev0Var.c && jl40.l(this.d, hev0Var.d);
    }

    public final int hashCode() {
        int hashCode = Boolean.hashCode(this.a) * 31;
        String str = this.b;
        int b = oyr.b(this.c, (hashCode + (str == null ? 0 : str.hashCode())) * 31, 31);
        SummaryCardPromo summaryCardPromo = this.d;
        return b + (summaryCardPromo != null ? summaryCardPromo.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder v = ly3.v("SummaryCardPromoStateAppearance(isShownPerSession=", ", tariffName=", this.b, ", showCount=", this.a);
        v.append(this.c);
        v.append(", summaryCardPromo=");
        v.append(this.d);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }

    public hev0() {
        this(false, null, 0, null);
    }
}
