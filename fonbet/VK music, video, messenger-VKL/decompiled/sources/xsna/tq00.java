package xsna;

import com.vk.clips.sdk.shared.item.market_ads.events.MarketAdsItemViewEvent;

/* compiled from: MarketAdsItemViewEvent.kt */
/* loaded from: classes17.dex */
public final class tq00 implements MarketAdsItemViewEvent {
    public final int b;
    public final int c;

    public tq00(int i, int i2) {
        this.b = i;
        this.c = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tq00)) {
            return false;
        }
        tq00 tq00Var = (tq00) obj;
        return this.b == tq00Var.b && this.c == tq00Var.c;
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
