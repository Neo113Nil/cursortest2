package xsna;

import android.view.View;
import com.vk.clips.sdk.shared.item.market_ads.events.MarketAdsItemViewEvent;

/* compiled from: MarketAdsItemViewEvent.kt */
/* loaded from: classes17.dex */
public final class sq00 implements MarketAdsItemViewEvent {
    public final cle b;
    public final View c;

    public sq00(cle cleVar, View view) {
        this.b = cleVar;
        this.c = view;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sq00)) {
            return false;
        }
        sq00 sq00Var = (sq00) obj;
        return epx.f(this.b, sq00Var.b) && epx.f(this.c, sq00Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + (this.b.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CardClicked(card=");
        sb.append(this.b);
        sb.append(", cardView=");
        return br.b(sb, this.c, ')');
    }
}
