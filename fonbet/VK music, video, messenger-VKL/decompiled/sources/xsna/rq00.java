package xsna;

import android.view.View;
import com.vk.clips.sdk.shared.item.market_ads.events.MarketAdsItemViewEvent;

/* compiled from: MarketAdsItemViewEvent.kt */
/* loaded from: classes17.dex */
public final class rq00 implements MarketAdsItemViewEvent {
    public final cle b;
    public final View c;

    public rq00(cle cleVar, View view) {
        this.b = cleVar;
        this.c = view;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rq00)) {
            return false;
        }
        rq00 rq00Var = (rq00) obj;
        return epx.f(this.b, rq00Var.b) && epx.f(this.c, rq00Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + (this.b.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CardButtonClicked(card=");
        sb.append(this.b);
        sb.append(", cardView=");
        return br.b(sb, this.c, ')');
    }
}
