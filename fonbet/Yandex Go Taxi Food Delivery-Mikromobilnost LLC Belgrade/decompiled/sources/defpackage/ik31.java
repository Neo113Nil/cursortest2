package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.tariffs.model.PriceUpdate$PriceLoadingState;

/* loaded from: classes6.dex */
public final class ik31 {
    public final dk31 a;
    public final mi31 b;
    public final PriceUpdate$PriceLoadingState c;
    public final boolean d;

    public ik31(dk31 dk31Var, mi31 mi31Var, PriceUpdate$PriceLoadingState priceUpdate$PriceLoadingState, boolean z) {
        this.a = dk31Var;
        this.b = mi31Var;
        this.c = priceUpdate$PriceLoadingState;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ik31)) {
            return false;
        }
        ik31 ik31Var = (ik31) obj;
        return jl40.l(this.a, ik31Var.a) && jl40.l(this.b, ik31Var.b) && this.c == ik31Var.c && this.d == ik31Var.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "VerticalsSnapshot(verticalsInfo=" + this.a + ", selectedVerticalTariff=" + this.b + ", priceLoadingState=" + this.c + ", isSingleVerticalResult=" + this.d + Extension.C_BRAKE;
    }
}
