package xsna;

import com.vk.api.generated.market.dto.MarketProductLinkedContentItemDto;
import com.vk.dto.common.Good;
import com.vk.ecomm.market.good.ui.holder.contentholder.MediaContentItem;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.kjf0;

/* compiled from: UiMediaContentBlockBuilder.kt */
/* loaded from: classes18.dex */
public final class szp0 extends d76 {
    @Override // xsna.d76
    public final void b(ezp0 ezp0Var) {
        cxo cxoVar = ezp0Var.a;
        ArrayList arrayList = cxoVar.U;
        hc10 c = cxoVar.a.c();
        duk dukVar = ezp0Var.b;
        k5u k5uVar = dukVar.b;
        List<MarketProductLinkedContentItemDto> list = k5uVar.r;
        Integer num = k5uVar.s;
        int intValue = num != null ? num.intValue() : 0;
        c.getClass();
        List<MarketProductLinkedContentItemDto> list2 = list;
        if (list2 == null || list2.isEmpty() || 1 > intValue) {
            return;
        }
        Integer num2 = k5uVar.s;
        List<MarketProductLinkedContentItemDto> list3 = k5uVar.r;
        arrayList.clear();
        cxoVar.V = num2 != null ? num2.intValue() : 0;
        int i = (list3 == null || list3.size() != 1) ? 0 : atv0.b;
        if (list3 == null) {
            return;
        }
        List<MarketProductLinkedContentItemDto> list4 = list3;
        ArrayList arrayList2 = new ArrayList(c5g.u(list4, 10));
        Iterator<T> it = list4.iterator();
        while (it.hasNext()) {
            arrayList2.add(new MediaContentItem((MarketProductLinkedContentItemDto) it.next(), false, i));
        }
        arrayList.addAll(arrayList2);
        Good good = dukVar.a;
        a(kjf0.a.a(34, new nq10(good.V ? R.string.product_service_media_content_title : R.string.product_media_content_title, j5g.H0(arrayList, 3), cxoVar.V >= 3)));
    }
}
