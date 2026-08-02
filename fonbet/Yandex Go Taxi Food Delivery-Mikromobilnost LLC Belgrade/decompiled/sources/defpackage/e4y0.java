package defpackage;

import com.yandex.go.taxi.order.promotions.model.TaxiOrderPopupModalBehaviourType;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class e4y0 extends g4y0 {
    public final String a;
    public final String b;
    public final o8s0 c;
    public final TaxiOrderPopupModalBehaviourType d;
    public final f480 e;

    public e4y0(String str, String str2, o8s0 o8s0Var, TaxiOrderPopupModalBehaviourType taxiOrderPopupModalBehaviourType, f480 f480Var) {
        this.a = str;
        this.b = str2;
        this.c = o8s0Var;
        this.d = taxiOrderPopupModalBehaviourType;
        this.e = f480Var;
    }

    @Override // defpackage.g4y0
    public final String a() {
        return this.a;
    }

    @Override // defpackage.g4y0
    public final String b() {
        return this.b;
    }

    @Override // defpackage.g4y0
    public final o8s0 c() {
        return this.c;
    }

    @Override // defpackage.g4y0
    public final TaxiOrderPopupModalBehaviourType d() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e4y0)) {
            return false;
        }
        e4y0 e4y0Var = (e4y0) obj;
        return jl40.l(this.a, e4y0Var.a) && jl40.l(this.b, e4y0Var.b) && jl40.l(this.c, e4y0Var.c) && this.d == e4y0Var.d && this.e.equals(e4y0Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + unr0.b(this.a.hashCode() * 31, 31, this.b)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder v = b64.v("PromotionModalShareOrder(orderId=", this.a, ", promotionId=", this.b, ", showPolicy=");
        v.append(this.c);
        v.append(", type=");
        v.append(this.d);
        v.append(", modal=");
        v.append(this.e);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
