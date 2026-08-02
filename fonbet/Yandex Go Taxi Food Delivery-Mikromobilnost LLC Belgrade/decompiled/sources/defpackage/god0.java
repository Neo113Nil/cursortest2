package defpackage;

import com.yandex.plus.pay.api.model.PlusPayCompositeOffers;
import com.yandex.plus.pay.api.model.PlusPayInAppReplacementParams;

/* loaded from: classes2.dex */
public final class god0 {
    public final PlusPayCompositeOffers.Offer a;
    public final PlusPayInAppReplacementParams b;

    public god0(PlusPayCompositeOffers.Offer offer, PlusPayInAppReplacementParams plusPayInAppReplacementParams) {
        this.a = offer;
        this.b = plusPayInAppReplacementParams;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof god0)) {
            return false;
        }
        god0 god0Var = (god0) obj;
        return jl40.l(this.a, god0Var.a) && jl40.l(this.b, god0Var.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        PlusPayInAppReplacementParams plusPayInAppReplacementParams = this.b;
        return hashCode + (plusPayInAppReplacementParams == null ? 0 : plusPayInAppReplacementParams.hashCode());
    }

    public final String toString() {
        return "GooglePlay(offer=" + this.a + ", replacementParams=" + this.b + ')';
    }
}
