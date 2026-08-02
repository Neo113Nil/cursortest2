package xsna;

import com.vk.clips.sdk.shared.item.market_ads.MarketAdsItemAction;

/* compiled from: MarketAdsItemAction.kt */
/* loaded from: classes17.dex */
public final class ap00 implements MarketAdsItemAction {
    public final cle b;

    public ap00(cle cleVar) {
        this.b = cleVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ap00) && epx.f(this.b, ((ap00) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return "CardButtonClicked(card=" + this.b + ')';
    }
}
