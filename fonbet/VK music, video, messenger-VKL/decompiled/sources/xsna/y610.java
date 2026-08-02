package xsna;

import com.vk.dto.common.id.UserId;
import com.vk.ecomm.market.good.linkedcontent.mvi2.MarketLinkedContentState;
import com.vk.ecomm.market.good.ui.holder.contentholder.MediaContentItem;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.EmptyList;
import xsna.u610;

/* compiled from: MarketLinkedContentReducer.kt */
/* loaded from: classes18.dex */
public final class y610 implements bm50<MarketLinkedContentState, u610> {
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0047, code lost:
    
        if (r11 == null) goto L17;
     */
    @Override // xsna.bm50
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final MarketLinkedContentState a(MarketLinkedContentState marketLinkedContentState, u610 u610Var) {
        ArrayList arrayList;
        List list;
        MarketLinkedContentState marketLinkedContentState2 = marketLinkedContentState;
        u610 u610Var2 = u610Var;
        List<MediaContentItem> list2 = marketLinkedContentState2.g;
        if (u610Var2 instanceof x610) {
            x610 x610Var = (x610) u610Var2;
            if (!x610Var.d) {
                return MarketLinkedContentState.a(marketLinkedContentState2, x610Var.a, x610Var.b, true, null, null, null, 0, 1008);
            }
            long j = x610Var.a;
            UserId userId = x610Var.b;
            EmptyList emptyList = EmptyList.b;
            return MarketLinkedContentState.a(marketLinkedContentState2, j, userId, true, null, emptyList, emptyList, 0, 896);
        }
        if (u610Var2 instanceof v610) {
            if (list2 != null) {
                list = j5g.R(j5g.u0(((v610) u610Var2).a, list2));
            }
            list = ((v610) u610Var2).a;
            return MarketLinkedContentState.a(marketLinkedContentState2, 0L, null, false, null, list, null, ((v610) u610Var2).b, 851);
        }
        if (u610Var2 instanceof w610) {
            return MarketLinkedContentState.a(marketLinkedContentState2, 0L, null, false, ((w610) u610Var2).a, null, null, 0, 995);
        }
        if (u610Var2 instanceof u610.a) {
            List<MediaContentItem> list3 = marketLinkedContentState2.h;
            return MarketLinkedContentState.a(marketLinkedContentState2, 0L, null, false, null, null, list3 != null ? j5g.u0(((u610.a) u610Var2).a, list3) : ((u610.a) u610Var2).a, 0, 959);
        }
        if (u610Var2 instanceof u610.b) {
            return MarketLinkedContentState.a(marketLinkedContentState2, 0L, null, false, null, null, null, 0, 255);
        }
        if (!(u610Var2 instanceof u610.c)) {
            return marketLinkedContentState2;
        }
        if (list2 != null) {
            List<MediaContentItem> list4 = list2;
            arrayList = new ArrayList(c5g.u(list4, 10));
            for (MediaContentItem mediaContentItem : list4) {
                if (epx.f(mediaContentItem, ((u610.c) u610Var2).a)) {
                    mediaContentItem = MediaContentItem.a(mediaContentItem);
                }
                arrayList.add(mediaContentItem);
            }
        } else {
            arrayList = null;
        }
        return MarketLinkedContentState.a(marketLinkedContentState2, 0L, null, false, null, arrayList, null, 0, 991);
    }

    @Override // xsna.bm50
    public final /* bridge */ /* synthetic */ boolean b(u610 u610Var) {
        return true;
    }
}
