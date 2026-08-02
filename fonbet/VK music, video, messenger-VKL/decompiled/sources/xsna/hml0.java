package xsna;

import com.vk.api.generated.market.dto.MarketDeliveryTypeDto;
import com.vk.api.generated.market.dto.MarketMarketCategoryTreeDto;
import com.vk.dto.common.Image;
import com.vk.ecomm.categories.api.MarketBridgeCategory;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;

/* compiled from: StorefrontFilterMapper.kt */
/* loaded from: classes18.dex */
public final class hml0 {

    /* compiled from: StorefrontFilterMapper.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[MarketDeliveryTypeDto.values().length];
            try {
                iArr[MarketDeliveryTypeDto.ANY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[MarketDeliveryTypeDto.PICKUP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[MarketDeliveryTypeDto.COURIER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.util.ArrayList] */
    public static MarketBridgeCategory a(MarketMarketCategoryTreeDto marketMarketCategoryTreeDto) {
        List list;
        int id = marketMarketCategoryTreeDto.getId();
        String f = marketMarketCategoryTreeDto.f();
        new ne6();
        Image a2 = ne6.a(marketMarketCategoryTreeDto.e());
        List<MarketMarketCategoryTreeDto> d = marketMarketCategoryTreeDto.d();
        if (d != null) {
            List<MarketMarketCategoryTreeDto> list2 = d;
            list = new ArrayList(c5g.u(list2, 10));
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                list.add(a((MarketMarketCategoryTreeDto) it.next()));
            }
        } else {
            list = EmptyList.b;
        }
        return new MarketBridgeCategory(id, f, a2, list, null);
    }
}
