package defpackage;

import java.util.List;
import java.util.Map;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.tariffs.model.PriceUpdate$PriceLoadingState;

/* loaded from: classes14.dex */
public final class lrx0 {
    public final List a;
    public final PriceUpdate$PriceLoadingState b;
    public final int c;
    public final int d;
    public final boolean e;
    public final Map f;

    public lrx0(List list, PriceUpdate$PriceLoadingState priceUpdate$PriceLoadingState, int i, int i2, boolean z, Map map) {
        this.a = list;
        this.b = priceUpdate$PriceLoadingState;
        this.c = i;
        this.d = i2;
        this.e = z;
        this.f = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lrx0)) {
            return false;
        }
        lrx0 lrx0Var = (lrx0) obj;
        return jl40.l(this.a, lrx0Var.a) && this.b == lrx0Var.b && this.c == lrx0Var.c && this.d == lrx0Var.d && this.e == lrx0Var.e && jl40.l(this.f, lrx0Var.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + unr0.e(oyr.b(this.d, oyr.b(this.c, (this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31), 31), 31, this.e);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TariffsInfo(tariffs=");
        sb.append(this.a);
        sb.append(", priceLoadingState=");
        sb.append(this.b);
        sb.append(", selectedTariff=");
        vfc.u(this.c, this.d, ", compoundTariff=", ", isScheduledOrder=", sb);
        sb.append(this.e);
        sb.append(", backendFormats=");
        sb.append(this.f);
        sb.append(Extension.C_BRAKE);
        return sb.toString();
    }
}
