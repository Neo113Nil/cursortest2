package xsna;

import com.vk.clips.sdk.shared.item.market_ads.MarketAdsItemAction;

/* compiled from: MarketAdsItemAction.kt */
/* loaded from: classes17.dex */
public final class bp00 implements MarketAdsItemAction {
    public final cle b;

    public bp00(cle cleVar) {
        this.b = cleVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bp00) && epx.f(this.b, ((bp00) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return "CardClicked(card=" + this.b + ')';
    }
}
