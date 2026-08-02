package xsna;

import com.vk.clips.sdk.shared.item.market_ads.MarketAdsItemAction;
import com.vk.clips.sdk.shared.item.market_ads.MarketAdsItemPatch;
import kotlin.NoWhenBranchMatchedException;
import xsna.lp00;
import xsna.pq00;
import xsna.wk50;

/* compiled from: GestureActionApplier.kt */
/* loaded from: classes17.dex */
public final class aot implements oj50<pq00, MarketAdsItemAction, MarketAdsItemPatch> {
    public final f4z a;

    public aot(f4z f4zVar) {
        this.a = f4zVar;
    }

    @Override // xsna.oj50
    public final void a(wk50.a aVar, km50 km50Var, kj50 kj50Var) {
        pq00 pq00Var = (pq00) km50Var;
        MarketAdsItemAction marketAdsItemAction = (MarketAdsItemAction) kj50Var;
        if ((pq00Var instanceof pq00.a) && (marketAdsItemAction instanceof MarketAdsItemAction.c)) {
            MarketAdsItemAction.c cVar = (MarketAdsItemAction.c) marketAdsItemAction;
            boolean z = cVar instanceof MarketAdsItemAction.c.b;
            f4z f4zVar = this.a;
            if (z) {
                pq00.a aVar2 = (pq00.a) pq00Var;
                if (aVar2.e.b) {
                    f4zVar.b(lp00.a.a);
                    return;
                } else {
                    if (aVar2.c) {
                        aVar.b(MarketAdsItemPatch.c.a.b);
                        return;
                    }
                    return;
                }
            }
            if (!(cVar instanceof MarketAdsItemAction.c.a)) {
                throw new NoWhenBranchMatchedException();
            }
            pq00.a aVar3 = (pq00.a) pq00Var;
            if (aVar3.e.b) {
                f4zVar.b(lp00.a.a);
            } else if (aVar3.c) {
                aVar.b(MarketAdsItemPatch.c.a.b);
            }
        }
    }

    @Override // xsna.oj50
    public final void onDestroy() {
    }
}
