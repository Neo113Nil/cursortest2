package xsna;

import com.vk.api.generated.market.dto.MarketItemPropertyValueDto;
import com.vk.api.generated.market.dto.MarketMarketItemAvailabilityDto;
import com.vk.api.generated.market.dto.MarketMarketItemDto;
import com.vk.api.generated.market.dto.MarketPriceDto;
import com.vk.dto.common.id.UserId;
import com.vk.ecomm.cart.impl.cart.feature.state.a;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;

/* compiled from: DtoMapper.kt */
/* loaded from: classes18.dex */
public final class eno {

    /* compiled from: Comparisons.kt */
    public static final class a<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return jw5.b(Boolean.valueOf(((com.vk.ecomm.cart.impl.cart.feature.state.a) t2).f), Boolean.valueOf(((com.vk.ecomm.cart.impl.cart.feature.state.a) t).f));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v7, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r1v8, types: [java.util.ArrayList] */
    public static final com.vk.ecomm.cart.impl.cart.feature.state.a a(MarketMarketItemDto marketMarketItemDto, UserId userId) {
        ?? r1;
        boolean z = marketMarketItemDto.d().i() == MarketMarketItemAvailabilityDto.AVAILABLE.i();
        Integer e = marketMarketItemDto.e();
        long intValue = e != null ? e.intValue() : marketMarketItemDto.getId();
        List<MarketItemPropertyValueDto> G = marketMarketItemDto.G();
        if (G != null) {
            List<MarketItemPropertyValueDto> list = G;
            r1 = new ArrayList(c5g.u(list, 10));
            for (MarketItemPropertyValueDto marketItemPropertyValueDto : list) {
                r1.add(new a.b(marketItemPropertyValueDto.e(), marketItemPropertyValueDto.d()));
            }
        } else {
            r1 = 0;
        }
        if (r1 == 0) {
            r1 = EmptyList.b;
        }
        List list2 = r1;
        a.C0919a c0919a = new a.C0919a(marketMarketItemDto.getId(), userId, fkq0.e(marketMarketItemDto.q()));
        String title = marketMarketItemDto.getTitle();
        m6d0 b = b(marketMarketItemDto.F());
        Integer T = marketMarketItemDto.T();
        int intValue2 = T != null ? T.intValue() : 0;
        Integer i = marketMarketItemDto.i();
        int intValue3 = i != null ? i.intValue() : 0;
        String Z = marketMarketItemDto.Z();
        if (Z == null) {
            Z = "";
        }
        return new com.vk.ecomm.cart.impl.cart.feature.state.a(c0919a, title, b, intValue2, intValue3, z, Z, list2, epx.f(marketMarketItemDto.w0(), Boolean.TRUE), false, intValue3, intValue);
    }

    public static final m6d0 b(MarketPriceDto marketPriceDto) {
        Integer f = marketPriceDto.f();
        int intValue = f != null ? f.intValue() : 0;
        String l = marketPriceDto.l();
        String j = marketPriceDto.j();
        if (j == null) {
            j = marketPriceDto.n();
        }
        return new m6d0(intValue, l, j);
    }

    public static final List c(UserId userId, List list) {
        List list2 = list;
        ArrayList arrayList = new ArrayList(c5g.u(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(a((MarketMarketItemDto) it.next(), userId));
        }
        return j5g.D0(new a(), arrayList);
    }
}
