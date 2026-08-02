package xsna;

import com.vk.ecomm.reviews.impl.pinnedreview.domain.CardType;
import com.vk.ecomm.reviews.impl.pinnedreview.domain.SubscriptionAction;

/* compiled from: PinReviewManageServiceViewState.kt */
/* loaded from: classes18.dex */
public final class rxm0 {
    public final String a;
    public final CardType b;
    public final SubscriptionAction c;

    public rxm0(String str, CardType cardType, SubscriptionAction subscriptionAction) {
        this.a = str;
        this.b = cardType;
        this.c = subscriptionAction;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rxm0)) {
            return false;
        }
        rxm0 rxm0Var = (rxm0) obj;
        return epx.f(this.a, rxm0Var.a) && this.b == rxm0Var.b && this.c == rxm0Var.c;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        CardType cardType = this.b;
        return this.c.hashCode() + ((hashCode + (cardType == null ? 0 : cardType.hashCode())) * 31);
    }

    public final String toString() {
        return "SubscriptionBuyerInfo(card=" + this.a + ", cardType=" + this.b + ", buttonAction=" + this.c + ')';
    }
}
