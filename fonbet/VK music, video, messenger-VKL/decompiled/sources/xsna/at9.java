package xsna;

import com.vk.ecomm.reviews.impl.pinnedreview.domain.CardType;

/* compiled from: PinReviewManageServiceState.kt */
/* loaded from: classes18.dex */
public final class at9 {
    public final String a;
    public final CardType b;

    public at9(String str, CardType cardType) {
        this.a = str;
        this.b = cardType;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof at9)) {
            return false;
        }
        at9 at9Var = (at9) obj;
        return epx.f(this.a, at9Var.a) && this.b == at9Var.b;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        CardType cardType = this.b;
        return hashCode + (cardType == null ? 0 : cardType.hashCode());
    }

    public final String toString() {
        return "CardData(number=" + this.a + ", type=" + this.b + ')';
    }
}
