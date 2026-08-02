package xsna;

import com.vk.api.generated.groups.dto.GroupsGroupFullDto;
import com.vk.api.generated.market.dto.MarketCustomButtonFullDto;
import com.vk.api.generated.market.dto.MarketGetButtonsResponseDto;
import com.vk.api.generated.market.dto.MarketGetRecommendsResponseDto;
import com.vk.api.generated.market.dto.MarketItemPropertyValueDto;
import com.vk.api.generated.market.dto.MarketMarketItemDto;
import com.vk.dto.common.Good;
import com.vk.dto.common.data.CallProducerButton;
import com.vk.toggle.features.SmbFeatures;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class j6u implements zzs {
    public final /* synthetic */ int b;

    public /* synthetic */ j6u(k6u k6uVar, int i) {
        this.b = i;
    }

    @Override // xsna.zzs
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        ArrayList arrayList;
        Object obj5;
        o5u o5uVar;
        Object obj6;
        Object obj7;
        Object obj8;
        MarketMarketItemDto marketMarketItemDto = (MarketMarketItemDto) obj;
        MarketGetRecommendsResponseDto marketGetRecommendsResponseDto = (MarketGetRecommendsResponseDto) obj2;
        GroupsGroupFullDto groupsGroupFullDto = (GroupsGroupFullDto) obj3;
        MarketGetButtonsResponseDto marketGetButtonsResponseDto = (MarketGetButtonsResponseDto) obj4;
        Good c = b210.c(marketMarketItemDto);
        List<MarketItemPropertyValueDto> G = marketMarketItemDto.G();
        if (G != null) {
            List<MarketItemPropertyValueDto> list = G;
            arrayList = new ArrayList(c5g.u(list, 10));
            for (MarketItemPropertyValueDto marketItemPropertyValueDto : list) {
                q2z.a(marketItemPropertyValueDto.f(), marketItemPropertyValueDto.g(), arrayList);
            }
        } else {
            arrayList = null;
        }
        k7u k7uVar = new k7u(c, arrayList);
        SmbFeatures smbFeatures = SmbFeatures.PRODUCT_BUTTONS_REFACH;
        smbFeatures.getClass();
        if (com.vk.toggle.b.A.a(smbFeatures)) {
            List<MarketCustomButtonFullDto> d = marketGetButtonsResponseDto.d();
            ArrayList arrayList2 = new ArrayList(c5g.u(d, 10));
            Iterator<T> it = d.iterator();
            while (it.hasNext()) {
                arrayList2.add(b210.b((MarketCustomButtonFullDto) it.next()));
            }
            Iterator it2 = arrayList2.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    obj6 = null;
                    break;
                }
                obj6 = it2.next();
                int i = ((CallProducerButton) obj6).b;
                if (i == 4 || i == 3) {
                    break;
                }
            }
            CallProducerButton callProducerButton = (CallProducerButton) obj6;
            Iterator it3 = arrayList2.iterator();
            while (true) {
                if (!it3.hasNext()) {
                    obj7 = null;
                    break;
                }
                obj7 = it3.next();
                if (!epx.f((CallProducerButton) obj7, callProducerButton)) {
                    break;
                }
            }
            CallProducerButton callProducerButton2 = (CallProducerButton) obj7;
            Iterator it4 = arrayList2.iterator();
            while (true) {
                if (!it4.hasNext()) {
                    obj8 = null;
                    break;
                }
                obj8 = it4.next();
                CallProducerButton callProducerButton3 = (CallProducerButton) obj8;
                if (!epx.f(callProducerButton3, callProducerButton) && !epx.f(callProducerButton3, callProducerButton2)) {
                    break;
                }
            }
            o5uVar = new o5u(false, null, callProducerButton2, (CallProducerButton) obj8, callProducerButton);
        } else {
            Iterator<T> it5 = marketGetButtonsResponseDto.d().iterator();
            while (true) {
                if (!it5.hasNext()) {
                    obj5 = null;
                    break;
                }
                obj5 = it5.next();
                if (((MarketCustomButtonFullDto) obj5).j().i() == MarketCustomButtonFullDto.TypeDto.OPEN_PARTNER_SITE.i()) {
                    break;
                }
            }
            MarketCustomButtonFullDto marketCustomButtonFullDto = (MarketCustomButtonFullDto) obj5;
            if (marketCustomButtonFullDto != null) {
                String title = marketCustomButtonFullDto.getTitle();
                if (title == null) {
                    title = "";
                }
                o5uVar = new o5u(new CallProducerButton(6, title, marketCustomButtonFullDto.g(), marketCustomButtonFullDto.i(), marketCustomButtonFullDto.l(), null, marketCustomButtonFullDto.k(), marketCustomButtonFullDto.getUserId(), null, marketCustomButtonFullDto.getUrl(), marketCustomButtonFullDto.e(), false, 2048, null), false);
            } else {
                o5uVar = new o5u(null, groupsGroupFullDto != null ? epx.f(groupsGroupFullDto.z3(), Boolean.TRUE) : false);
            }
        }
        List<MarketMarketItemDto> f = marketGetRecommendsResponseDto.f();
        ArrayList arrayList3 = new ArrayList(c5g.u(f, 10));
        Iterator<T> it6 = f.iterator();
        while (it6.hasNext()) {
            arrayList3.add(new k7u(b210.c((MarketMarketItemDto) it6.next()), null));
        }
        int i2 = this.b + 1;
        f7u f7uVar = new f7u(0, 0);
        Integer i3 = marketMarketItemDto.i();
        return new e6u(k7uVar, o5uVar, arrayList3, i2, (i3 != null ? i3.intValue() : 0) > 0, false, false, f7uVar);
    }
}
