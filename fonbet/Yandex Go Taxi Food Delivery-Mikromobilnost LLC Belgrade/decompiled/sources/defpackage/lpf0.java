package defpackage;

import com.yandex.go.taxi.order.api.mapper.PromoPlaqueItemsMapper$ItemType;
import com.yandex.go.taxi.order.api.models.PromoPlaqueItem$DisplayOnType;
import com.yandex.go.taxi.order.api.models.PromoPlaqueItem$DividerType;
import java.util.ArrayList;
import java.util.List;
import ru.yandex.taxi.communications.model.CommunicationItem;

/* loaded from: classes14.dex */
public final class lpf0 {
    public static ArrayList a(List list, PromoPlaqueItem$DisplayOnType promoPlaqueItem$DisplayOnType) {
        PromoPlaqueItem$DividerType promoPlaqueItem$DividerType;
        List list2 = list;
        ArrayList arrayList = new ArrayList(tcc.n(list2, 10));
        int i = 0;
        for (Object obj : list2) {
            int i2 = i + 1;
            if (i < 0) {
                scc.m();
                throw null;
            }
            CommunicationItem communicationItem = (CommunicationItem) obj;
            PromoPlaqueItemsMapper$ItemType promoPlaqueItemsMapper$ItemType = i2 < list.size() ? ((CommunicationItem) list.get(i2)).d.a() ? PromoPlaqueItemsMapper$ItemType.ICON : PromoPlaqueItemsMapper$ItemType.NO_ICON : PromoPlaqueItemsMapper$ItemType.NONE;
            int i3 = i - 1;
            PromoPlaqueItemsMapper$ItemType promoPlaqueItemsMapper$ItemType2 = -1 < i3 ? ((CommunicationItem) list.get(i3)).d.a() ? PromoPlaqueItemsMapper$ItemType.ICON : PromoPlaqueItemsMapper$ItemType.NO_ICON : PromoPlaqueItemsMapper$ItemType.NONE;
            PromoPlaqueItem$DisplayOnType promoPlaqueItem$DisplayOnType2 = PromoPlaqueItem$DisplayOnType.MULTI_ORDER;
            if (promoPlaqueItem$DisplayOnType == promoPlaqueItem$DisplayOnType2 && i == 0) {
                promoPlaqueItem$DividerType = PromoPlaqueItem$DividerType.NORMAL_TOP;
            } else if (promoPlaqueItem$DisplayOnType == promoPlaqueItem$DisplayOnType2 && communicationItem.d.a()) {
                promoPlaqueItem$DividerType = PromoPlaqueItem$DividerType.ICON_MARGIN_TOP;
            } else if (promoPlaqueItem$DisplayOnType == promoPlaqueItem$DisplayOnType2 && !communicationItem.d.a() && promoPlaqueItemsMapper$ItemType2 == PromoPlaqueItemsMapper$ItemType.ICON) {
                promoPlaqueItem$DividerType = PromoPlaqueItem$DividerType.ICON_MARGIN_TOP;
            } else if (promoPlaqueItem$DisplayOnType == promoPlaqueItem$DisplayOnType2 && !communicationItem.d.a() && promoPlaqueItemsMapper$ItemType2 == PromoPlaqueItemsMapper$ItemType.NO_ICON) {
                promoPlaqueItem$DividerType = PromoPlaqueItem$DividerType.MARGIN_TOP;
            } else {
                PromoPlaqueItem$DisplayOnType promoPlaqueItem$DisplayOnType3 = PromoPlaqueItem$DisplayOnType.DETAILS;
                promoPlaqueItem$DividerType = (promoPlaqueItem$DisplayOnType == promoPlaqueItem$DisplayOnType3 && i == scc.f(list)) ? PromoPlaqueItem$DividerType.NONE : (promoPlaqueItem$DisplayOnType == promoPlaqueItem$DisplayOnType3 && communicationItem.d.a()) ? PromoPlaqueItem$DividerType.ICON_MARGIN_BOTTOM : (promoPlaqueItem$DisplayOnType == promoPlaqueItem$DisplayOnType3 && !communicationItem.d.a() && promoPlaqueItemsMapper$ItemType == PromoPlaqueItemsMapper$ItemType.ICON) ? PromoPlaqueItem$DividerType.ICON_MARGIN_BOTTOM : (promoPlaqueItem$DisplayOnType == promoPlaqueItem$DisplayOnType3 && !communicationItem.d.a() && promoPlaqueItemsMapper$ItemType == PromoPlaqueItemsMapper$ItemType.NO_ICON) ? PromoPlaqueItem$DividerType.MARGIN_BOTTOM : PromoPlaqueItem$DividerType.NONE;
            }
            arrayList.add(new kpf0(communicationItem, promoPlaqueItem$DividerType, promoPlaqueItem$DisplayOnType));
            i = i2;
        }
        return arrayList;
    }
}
