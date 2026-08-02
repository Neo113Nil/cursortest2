package xsna;

import com.vk.dto.common.Good;
import com.vk.dto.fave.MarketFavable;
import com.vk.stat.scheme.CommonMarketStat$TypeRefSource;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class va5 implements wzs {
    public final /* synthetic */ int b = 2;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    public /* synthetic */ va5(MarketFavable marketFavable, ot00 ot00Var, CommonMarketStat$TypeRefSource commonMarketStat$TypeRefSource, Integer num, Good good) {
        this.d = marketFavable;
        this.e = ot00Var;
        this.f = commonMarketStat$TypeRefSource;
        this.g = num;
        this.c = good;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        switch (this.b) {
            case 0:
                ((Integer) obj2).getClass();
                xa5.d((d85) this.d, (izs) this.e, (lg90) this.g, (izs) this.f, (q630) this.c, (androidx.compose.runtime.a) obj, ne7.I(513));
                break;
            case 1:
                ((Integer) obj2).getClass();
                khf.a((gzs) this.d, (gzs) this.e, (gzs) this.f, (gze) this.g, (q630) this.c, (androidx.compose.runtime.a) obj, ne7.I(1));
                break;
            default:
                MarketFavable marketFavable = (MarketFavable) this.d;
                ot00 ot00Var = (ot00) this.e;
                CommonMarketStat$TypeRefSource commonMarketStat$TypeRefSource = (CommonMarketStat$TypeRefSource) this.f;
                Integer num = (Integer) this.g;
                Good good = (Good) this.c;
                boolean booleanValue = ((Boolean) obj).booleanValue();
                if (((gmq) obj2).equals(marketFavable)) {
                    lt00 lt00Var = ot00Var.e;
                    marketFavable.f = booleanValue;
                    lt00Var.d(marketFavable, commonMarketStat$TypeRefSource, num, good.d0);
                    ot00Var.c.b(new hy00(good.b, good.c, booleanValue));
                }
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ va5(d85 d85Var, izs izsVar, lg90 lg90Var, izs izsVar2, q630 q630Var, int i) {
        this.d = d85Var;
        this.e = izsVar;
        this.g = lg90Var;
        this.f = izsVar2;
        this.c = q630Var;
    }

    public /* synthetic */ va5(gzs gzsVar, gzs gzsVar2, gzs gzsVar3, gze gzeVar, q630 q630Var, int i) {
        this.d = gzsVar;
        this.e = gzsVar2;
        this.f = gzsVar3;
        this.g = gzeVar;
        this.c = q630Var;
    }
}
