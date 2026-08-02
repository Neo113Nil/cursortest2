package defpackage;

import com.yandex.go.taxi.order.promotions.model.TaxiOrderPopupModalBehaviourType;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class a4y0 {
    public final String a;
    public final String b;
    public final TaxiOrderPopupModalBehaviourType c;

    public a4y0(String str, String str2, TaxiOrderPopupModalBehaviourType taxiOrderPopupModalBehaviourType) {
        this.a = str;
        this.b = str2;
        this.c = taxiOrderPopupModalBehaviourType;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a4y0)) {
            return false;
        }
        a4y0 a4y0Var = (a4y0) obj;
        return jl40.l(this.a, a4y0Var.a) && jl40.l(this.b, a4y0Var.b) && this.c == a4y0Var.c;
    }

    public final int hashCode() {
        return this.c.hashCode() + unr0.b(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder v = b64.v("TaxiOrderPopupInfo(orderId=", this.a, ", promotionId=", this.b, ", type=");
        v.append(this.c);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
