package xsna;

import com.vk.clips.sdk.shared.item.market_ads.MarketAdsItemAction;

/* compiled from: MarketAdsItemAction.kt */
/* loaded from: classes17.dex */
public final class cp00 implements MarketAdsItemAction {
    public final int b;
    public final int c;

    public cp00(int i, int i2) {
        this.b = i;
        this.c = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cp00)) {
            return false;
        }
        cp00 cp00Var = (cp00) obj;
        return this.b == cp00Var.b && this.c == cp00Var.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + (Integer.hashCode(this.b) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CardShown(cardPosition=");
        sb.append(this.b);
        sb.append(", rowIndex=");
        return vu5.b(sb, this.c, ')');
    }
}
