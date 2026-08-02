package xsna;

import com.vk.api.generated.base.dto.BaseImageDto;
import com.vk.api.generated.base.dto.BaseLinkButtonActionDto;
import com.vk.api.generated.market.dto.MarketBadgeDto;
import com.vk.api.generated.market.dto.MarketBadgeTypeDto;
import com.vk.api.generated.market.dto.MarketCurrencyDto;
import com.vk.api.generated.market.dto.MarketCustomButtonAvailableDayDto;
import com.vk.api.generated.market.dto.MarketCustomButtonFullDto;
import com.vk.api.generated.market.dto.MarketCustomButtonInaccessibilityMessageDto;
import com.vk.api.generated.market.dto.MarketDeliveryInfoDto;
import com.vk.api.generated.market.dto.MarketItemRejectInfoDto;
import com.vk.api.generated.market.dto.MarketMarketCategoryDto;
import com.vk.api.generated.market.dto.MarketMarketItemDto;
import com.vk.api.generated.market.dto.MarketMarketItemIntegrationInfoDto;
import com.vk.api.generated.market.dto.MarketMarketItemRatingDto;
import com.vk.api.generated.market.dto.MarketMarketItemTypeDto;
import com.vk.api.generated.market.dto.MarketPriceDto;
import com.vk.api.generated.market.dto.MarketServicesDurationDto;
import com.vk.dto.common.Currency;
import com.vk.dto.common.DeliveryInfo;
import com.vk.dto.common.Good;
import com.vk.dto.common.Image;
import com.vk.dto.common.ImageSize;
import com.vk.dto.common.IntegrationInfo;
import com.vk.dto.common.MarketItemRating;
import com.vk.dto.common.MarketRejectInfo;
import com.vk.dto.common.MarketRejectInfoButtons;
import com.vk.dto.common.MarketRejectInfoButtonsType;
import com.vk.dto.common.Price;
import com.vk.dto.common.data.AvailablePeriod;
import com.vk.dto.common.data.CallProducerButton;
import com.vk.dto.common.data.InaccessibilityMessage;
import com.vk.dto.common.id.UserId;
import com.vk.dto.market.GoodBadge;
import com.vk.dto.market.MarketItemType;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: MarketItemMapper.kt */
/* loaded from: classes3.dex */
public final class b210 {
    public static final boolean a(Good good, boolean z) {
        if (good == null) {
            return false;
        }
        return z ? good.r != null : good.f == MarketItemType.OZON;
    }

    public static final CallProducerButton b(MarketCustomButtonFullDto marketCustomButtonFullDto) {
        ArrayList arrayList;
        int i = marketCustomButtonFullDto.j().i();
        String title = marketCustomButtonFullDto.getTitle();
        String str = title == null ? "" : title;
        String g = marketCustomButtonFullDto.g();
        Integer i2 = marketCustomButtonFullDto.i();
        Boolean l = marketCustomButtonFullDto.l();
        List<MarketCustomButtonAvailableDayDto> d = marketCustomButtonFullDto.d();
        if (d != null) {
            List<MarketCustomButtonAvailableDayDto> list = d;
            arrayList = new ArrayList(c5g.u(list, 10));
            for (MarketCustomButtonAvailableDayDto marketCustomButtonAvailableDayDto : list) {
                boolean f = marketCustomButtonAvailableDayDto.f();
                String d2 = marketCustomButtonAvailableDayDto.d();
                if (d2 == null) {
                    d2 = "";
                }
                String e = marketCustomButtonAvailableDayDto.e();
                if (e == null) {
                    e = "";
                }
                arrayList.add(new AvailablePeriod(f, d2, e));
            }
        } else {
            arrayList = null;
        }
        String k = marketCustomButtonFullDto.k();
        UserId userId = marketCustomButtonFullDto.getUserId();
        MarketCustomButtonInaccessibilityMessageDto f2 = marketCustomButtonFullDto.f();
        return new CallProducerButton(i, str, g, i2, l, arrayList, k, userId, f2 != null ? new InaccessibilityMessage(f2.getTitle(), f2.d()) : null, marketCustomButtonFullDto.getUrl(), marketCustomButtonFullDto.e(), false, 2048, null);
    }

    public static final Good c(MarketMarketItemDto marketMarketItemDto) {
        ArrayList arrayList;
        ArrayList arrayList2;
        t3u zb = Good.zb();
        zb.f = i(marketMarketItemDto.F());
        zb.a = marketMarketItemDto.getId();
        zb.b = marketMarketItemDto.q();
        zb.l = marketMarketItemDto.d().i();
        MarketMarketCategoryDto j = marketMarketItemDto.j();
        if (j != null) {
            zb.g = j.getId();
            zb.h = j.d();
        }
        zb.d = marketMarketItemDto.getDescription();
        zb.c = marketMarketItemDto.getTitle();
        Integer k = marketMarketItemDto.k();
        zb.k = k != null ? k.intValue() : 0;
        zb.e = marketMarketItemDto.n();
        zb.L = marketMarketItemDto.o();
        Boolean w0 = marketMarketItemDto.w0();
        Boolean bool = Boolean.TRUE;
        zb.y = epx.f(w0, bool);
        zb.F = epx.f(marketMarketItemDto.F0(), bool);
        MarketServicesDurationDto M = marketMarketItemDto.M();
        zb.J = M != null ? M.d() : 0;
        MarketServicesDurationDto M2 = marketMarketItemDto.M();
        MarketItemType marketItemType = null;
        zb.K = M2 != null ? M2.e() : null;
        zb.q = marketMarketItemDto.l0();
        Integer i = marketMarketItemDto.i();
        zb.r = i != null ? i.intValue() : 0;
        MarketDeliveryInfoDto l = marketMarketItemDto.l();
        zb.m = l != null ? new DeliveryInfo(l.d()) : null;
        MarketMarketItemIntegrationInfoDto p = marketMarketItemDto.p();
        zb.n = p != null ? new IntegrationInfo(p.getTitle()) : null;
        zb.E = marketMarketItemDto.R();
        List<BaseImageDto> W = marketMarketItemDto.W();
        zb.j = W != null ? f(W) : null;
        List<MarketBadgeDto> f = marketMarketItemDto.f();
        zb.D = f != null ? d(f) : null;
        zb.M = marketMarketItemDto.r();
        MarketItemRejectInfoDto K = marketMarketItemDto.K();
        zb.N = K != null ? h(K) : null;
        Boolean v0 = marketMarketItemDto.v0();
        zb.P = v0 != null ? v0.booleanValue() : false;
        Boolean D0 = marketMarketItemDto.D0();
        zb.O = D0 != null ? D0.booleanValue() : false;
        Boolean y0 = marketMarketItemDto.y0();
        zb.Q = y0 != null ? y0.booleanValue() : false;
        zb.R = marketMarketItemDto.D();
        zb.S = marketMarketItemDto.C();
        MarketMarketItemRatingDto u = marketMarketItemDto.u();
        zb.o = u == null ? null : new MarketItemRating(Float.valueOf(u.d()), Integer.valueOf(u.e()), u.f());
        zb.T = "base";
        String url = marketMarketItemDto.getUrl();
        if (url == null) {
            url = "";
        }
        zb.z = url;
        List<List<BaseImageDto>> a0 = marketMarketItemDto.a0();
        if (a0 != null) {
            List<List<BaseImageDto>> list = a0;
            arrayList = new ArrayList(c5g.u(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(f((List) it.next()));
            }
        } else {
            arrayList = null;
        }
        zb.U = arrayList;
        List<MarketCustomButtonFullDto> g = marketMarketItemDto.g();
        if (g != null) {
            List<MarketCustomButtonFullDto> list2 = g;
            arrayList2 = new ArrayList(c5g.u(list2, 10));
            Iterator<T> it2 = list2.iterator();
            while (it2.hasNext()) {
                arrayList2.add(b((MarketCustomButtonFullDto) it2.next()));
            }
        } else {
            arrayList2 = null;
        }
        zb.V = arrayList2;
        MarketMarketItemTypeDto B = marketMarketItemDto.B();
        if (B != null) {
            MarketItemType.a aVar = MarketItemType.Companion;
            Integer valueOf = Integer.valueOf(B.i());
            aVar.getClass();
            marketItemType = MarketItemType.a.a(valueOf);
        }
        zb.X = marketItemType;
        return zb.a();
    }

    public static final ArrayList d(List list) {
        List<MarketBadgeDto> list2 = list;
        ArrayList arrayList = new ArrayList(c5g.u(list2, 10));
        for (MarketBadgeDto marketBadgeDto : list2) {
            String g = marketBadgeDto.g();
            GoodBadge.BadgeType.a aVar = GoodBadge.BadgeType.Companion;
            MarketBadgeTypeDto k = marketBadgeDto.k();
            Integer valueOf = k != null ? Integer.valueOf(k.i()) : null;
            aVar.getClass();
            arrayList.add(new GoodBadge(g, GoodBadge.BadgeType.a.a(valueOf), marketBadgeDto.i(), marketBadgeDto.j(), marketBadgeDto.d(), marketBadgeDto.e(), marketBadgeDto.f()));
        }
        return arrayList;
    }

    public static final ArrayList e(List list) {
        List list2 = list;
        ArrayList arrayList = new ArrayList(c5g.u(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(c((MarketMarketItemDto) it.next()));
        }
        return arrayList;
    }

    public static final Image f(List<BaseImageDto> list) {
        return new Image(g(list));
    }

    public static final ArrayList g(List list) {
        List<BaseImageDto> list2 = list;
        ArrayList arrayList = new ArrayList(c5g.u(list2, 10));
        for (BaseImageDto baseImageDto : list2) {
            arrayList.add(new ImageSize(baseImageDto.getUrl(), baseImageDto.getWidth(), baseImageDto.getHeight(), baseImageDto.e(), (char) 0, false, 48, null));
        }
        return arrayList;
    }

    public static final MarketRejectInfo h(MarketItemRejectInfoDto marketItemRejectInfoDto) {
        ArrayList arrayList;
        String title = marketItemRejectInfoDto.getTitle();
        String description = marketItemRejectInfoDto.getDescription();
        String f = marketItemRejectInfoDto.f();
        String i = marketItemRejectInfoDto.i();
        int g = marketItemRejectInfoDto.g();
        boolean e = marketItemRejectInfoDto.e();
        List<BaseLinkButtonActionDto> d = marketItemRejectInfoDto.d();
        if (d != null) {
            List<BaseLinkButtonActionDto> list = d;
            arrayList = new ArrayList(c5g.u(list, 10));
            for (BaseLinkButtonActionDto baseLinkButtonActionDto : list) {
                MarketRejectInfoButtonsType.a aVar = MarketRejectInfoButtonsType.Companion;
                String j = baseLinkButtonActionDto.C().j();
                aVar.getClass();
                arrayList.add(new MarketRejectInfoButtons(MarketRejectInfoButtonsType.a.a(j), baseLinkButtonActionDto.getUrl()));
            }
        } else {
            arrayList = null;
        }
        return new MarketRejectInfo(title, description, f, i, g, e, arrayList);
    }

    public static final Price i(MarketPriceDto marketPriceDto) {
        Long n;
        Long n2 = arm0.n(marketPriceDto.d());
        long j = 0;
        long longValue = n2 != null ? n2.longValue() : 0L;
        String k = marketPriceDto.k();
        if (k != null && (n = arm0.n(k)) != null) {
            j = n.longValue();
        }
        MarketCurrencyDto e = marketPriceDto.e();
        long j2 = longValue;
        long j3 = j;
        Currency currency = new Currency(e.getId(), e.d(), e.getTitle());
        String n3 = marketPriceDto.n();
        String l = marketPriceDto.l();
        Integer f = marketPriceDto.f();
        return new Price(j2, j3, currency, n3, l, f != null ? f.intValue() : 0, marketPriceDto.g(), marketPriceDto.j(), marketPriceDto.i());
    }
}
