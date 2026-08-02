package xsna;

import android.app.Activity;
import com.vk.dto.fave.MarketFavable;
import com.vk.stat.scheme.CommonMarketStat$TypeRefSource;

/* compiled from: CommunityPriorityBlockItemFaveDelegate.kt */
/* loaded from: classes5.dex */
public final class qdh {
    public final isq a;
    public final lt00 b;

    public qdh(isq isqVar, lt00 lt00Var) {
        this.a = isqVar;
        this.b = lt00Var;
    }

    public final void a(final MarketFavable marketFavable, final Integer num, final String str, final CommonMarketStat$TypeRefSource commonMarketStat$TypeRefSource, final izs<? super Boolean, s3q0> izsVar) {
        c63 c63Var = c63.a;
        Activity b = c63.b();
        if (b == null) {
            return;
        }
        isq.b(this.a, b, marketFavable, new wzs() { // from class: xsna.pdh
            @Override // xsna.wzs
            public final Object invoke(Object obj, Object obj2) {
                Boolean bool = (Boolean) obj;
                boolean booleanValue = bool.booleanValue();
                izs.this.invoke(bool);
                lt00 lt00Var = this.b;
                MarketFavable marketFavable2 = marketFavable;
                marketFavable2.f = booleanValue;
                lt00Var.d(marketFavable2, commonMarketStat$TypeRefSource, num, str);
                return s3q0.a;
            }
        }, new npd(izsVar, 1, (byte) 0), new oz7(izsVar, 1), false, null, null, 480);
    }
}
