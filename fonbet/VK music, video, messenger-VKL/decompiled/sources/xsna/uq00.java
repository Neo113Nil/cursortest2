package xsna;

import android.view.ViewGroup;
import com.vk.clips.sdk.shared.item.market_ads.events.MarketAdsItemViewEvent;

/* compiled from: MarketAdsItemViewEvent.kt */
/* loaded from: classes17.dex */
public final class uq00 implements MarketAdsItemViewEvent {
    public final String b;
    public final ViewGroup c;

    public uq00(ViewGroup viewGroup, String str) {
        this.b = str;
        this.c = viewGroup;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uq00)) {
            return false;
        }
        uq00 uq00Var = (uq00) obj;
        return epx.f(this.b, uq00Var.b) && epx.f(this.c, uq00Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + (this.b.hashCode() * 31);
    }

    public final String toString() {
        return "OnCardAttachedToWindow(cardId=" + this.b + ", cardView=" + this.c + ')';
    }
}
