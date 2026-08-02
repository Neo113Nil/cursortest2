package xsna;

import android.net.Uri;
import androidx.appcompat.widget.AppCompatTextView;
import com.vk.clips.sdk.models.ImageUrl;
import com.vk.clips.sdk.shared.item.market_ads.MarketAdsItemAction;
import com.vk.clips.sdk.shared.item.market_ads.MarketAdsItemPatch;
import kotlin.NoWhenBranchMatchedException;
import xsna.a7f0;
import xsna.pq00;
import xsna.wk50;

/* compiled from: MarketAdsBindingActionApplier.kt */
/* loaded from: classes17.dex */
public final class uo00 implements oj50<pq00, MarketAdsItemAction, MarketAdsItemPatch> {
    public final ojh0 a;
    public final su b;
    public final ir00 c;

    public uo00(ojh0 ojh0Var, su suVar, ir00 ir00Var) {
        this.a = ojh0Var;
        this.b = suVar;
        this.c = ir00Var;
    }

    @Override // xsna.oj50
    public final void a(wk50.a aVar, km50 km50Var, kj50 kj50Var) {
        pq00 pq00Var = (pq00) km50Var;
        MarketAdsItemAction marketAdsItemAction = (MarketAdsItemAction) kj50Var;
        if (marketAdsItemAction instanceof MarketAdsItemAction.a) {
            MarketAdsItemAction.a aVar2 = (MarketAdsItemAction.a) marketAdsItemAction;
            if (!(aVar2 instanceof MarketAdsItemAction.a.C0676a)) {
                if (!(aVar2 instanceof MarketAdsItemAction.a.b)) {
                    throw new NoWhenBranchMatchedException();
                }
                aVar.b.e();
                aVar.b(MarketAdsItemPatch.b.C0681b.b);
                return;
            }
            MarketAdsItemAction.a.C0676a c0676a = (MarketAdsItemAction.a.C0676a) marketAdsItemAction;
            if (pq00Var instanceof pq00.b) {
                c(aVar, c0676a);
            } else {
                if (!(pq00Var instanceof pq00.a)) {
                    throw new NoWhenBranchMatchedException();
                }
                if (epx.f(((pq00.a) pq00Var).b.g, c0676a.g)) {
                    aVar.b(new MarketAdsItemPatch.b.a.C0680b(b(c0676a)));
                } else {
                    c(aVar, c0676a);
                }
            }
        }
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, kotlin.Lazy] */
    public final hr00 b(MarketAdsItemAction.a.C0676a c0676a) {
        ir00 ir00Var = this.c;
        CharSequence a = ir00Var.b.a(c0676a.e);
        return new hr00(c0676a.b, c0676a.c, c0676a.d, c0676a.e, a, ((p2m) ir00Var.d.getValue()).a((AppCompatTextView) ir00Var.c.getValue(), pw0.b(ir00Var.a, a)), c0676a.g, c0676a.h, c0676a.i, c0676a.j, true, false);
    }

    public final void c(wk50.a aVar, MarketAdsItemAction.a.C0676a c0676a) {
        String str;
        aVar.b(new MarketAdsItemPatch.b.a.C0679a(b(c0676a), c0676a.f, c0676a.k));
        aVar.b.e();
        ImageUrl imageUrl = c0676a.b;
        if (imageUrl == null || (str = imageUrl.b) == null) {
            return;
        }
        a7f0.a.e(aVar, this.a.c(Uri.parse(str)).U(new pa(new u6k(this, 17), 26)), null, new u3u(aVar, 6), new tcn(aVar, 15), null, 9);
    }

    @Override // xsna.oj50
    public final void onDestroy() {
    }
}
