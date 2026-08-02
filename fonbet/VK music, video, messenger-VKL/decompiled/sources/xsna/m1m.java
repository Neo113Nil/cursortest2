package xsna;

import com.vk.clips.sdk.shared.item.market_ads.MarketAdsItemAction;
import com.vk.clips.sdk.shared.item.market_ads.MarketAdsItemPatch;
import kotlin.NoWhenBranchMatchedException;
import xsna.pq00;
import xsna.wk50;
import xsna.xp00;
import xsna.yt0;

/* compiled from: DescriptionActionApplier.kt */
/* loaded from: classes17.dex */
public final class m1m implements oj50<pq00, MarketAdsItemAction, MarketAdsItemPatch> {
    public final f4z a;
    public final izs<yt0, s3q0> b;

    public m1m(f4z f4zVar, izs izsVar) {
        this.a = f4zVar;
        this.b = izsVar;
    }

    @Override // xsna.oj50
    public final void a(wk50.a aVar, km50 km50Var, kj50 kj50Var) {
        pq00 pq00Var = (pq00) km50Var;
        MarketAdsItemAction marketAdsItemAction = (MarketAdsItemAction) kj50Var;
        if ((pq00Var instanceof pq00.a) && (marketAdsItemAction instanceof MarketAdsItemAction.b)) {
            MarketAdsItemAction.b bVar = (MarketAdsItemAction.b) marketAdsItemAction;
            if (bVar instanceof MarketAdsItemAction.b.C0677b) {
                this.b.invoke(new yt0.f(new zt0(((pq00.a) pq00Var).b.h, null)));
                aVar.b(MarketAdsItemPatch.c.b.b);
            } else if (bVar instanceof MarketAdsItemAction.b.a) {
                aVar.b(MarketAdsItemPatch.c.a.b);
            } else {
                if (!(bVar instanceof MarketAdsItemAction.b.c)) {
                    throw new NoWhenBranchMatchedException();
                }
                this.a.b(new xp00.b(((MarketAdsItemAction.b.c) marketAdsItemAction).b));
            }
        }
    }

    @Override // xsna.oj50
    public final void onDestroy() {
    }
}
