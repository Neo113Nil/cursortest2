package xsna;

import com.vk.ecomm.market.good.linkedcontent.mvi2.MarketLinkedContentState;
import com.vk.ecomm.market.good.ui.holder.contentholder.MediaContentItem;
import java.util.List;
import xsna.u710;

/* compiled from: MarketLinkedContentStateToViewStateMapper.kt */
/* loaded from: classes18.dex */
public final class l710 implements izs<MarketLinkedContentState, u710> {
    public static u710 a(MarketLinkedContentState marketLinkedContentState) {
        u710.a aVar;
        List<MediaContentItem> list;
        List<MediaContentItem> list2 = marketLinkedContentState.g;
        boolean z = marketLinkedContentState.d;
        if (z && ((list = list2) == null || list.isEmpty())) {
            aVar = u710.a.d.b;
        } else {
            Throwable th = marketLinkedContentState.f;
            if (th != null) {
                aVar = new u710.a.c(th);
            } else if (list2 == null || !(!list2.isEmpty())) {
                aVar = u710.a.b.b;
            } else {
                aVar = new u710.a.C3787a(marketLinkedContentState.i, z, marketLinkedContentState.g, marketLinkedContentState.e);
            }
        }
        return new u710(aVar, marketLinkedContentState.b, marketLinkedContentState.c, marketLinkedContentState.j);
    }
}
