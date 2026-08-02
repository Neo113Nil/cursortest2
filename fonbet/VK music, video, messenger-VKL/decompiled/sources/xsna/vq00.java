package xsna;

import com.vk.clips.sdk.shared.item.market_ads.events.MarketAdsItemViewEvent;

/* compiled from: MarketAdsItemViewEvent.kt */
/* loaded from: classes17.dex */
public final class vq00 implements MarketAdsItemViewEvent {
    public final String b;

    public vq00(String str) {
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vq00) && epx.f(this.b, ((vq00) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return ho8.a(new StringBuilder("OnCardDetachedFromWindow(cardId="), this.b, ')');
    }
}
