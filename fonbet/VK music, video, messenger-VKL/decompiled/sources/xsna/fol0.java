package xsna;

import com.vk.api.generated.base.dto.BaseImageDto;
import com.vk.api.generated.market.dto.MarketBadgeDto;
import com.vk.api.generated.market.dto.MarketBadgeTypeDto;
import com.vk.api.generated.market.dto.MarketCustomButtonFullDto;
import com.vk.api.generated.market.dto.MarketGetAlbumsResponseDto;
import com.vk.api.generated.market.dto.MarketGetServicesResponseDto;
import com.vk.api.generated.market.dto.MarketGetServicesSectionResponseDto;
import com.vk.api.generated.market.dto.MarketItemRejectInfoDto;
import com.vk.api.generated.market.dto.MarketMarketAlbumDto;
import com.vk.api.generated.market.dto.MarketMarketItemAvailabilityDto;
import com.vk.api.generated.market.dto.MarketMarketItemDto;
import com.vk.api.generated.market.dto.MarketMarketItemRatingDto;
import com.vk.api.generated.market.dto.MarketMarketServicesSectionDto;
import com.vk.api.generated.market.dto.MarketPriceDto;
import com.vk.api.generated.market.dto.MarketSearchResponseDto;
import com.vk.api.generated.market.dto.MarketServicesViewTypeDto;
import com.vk.api.generated.photos.dto.PhotosPhotoDto;
import com.vk.dto.common.Image;
import com.vk.dto.common.id.UserId;
import com.vk.dto.market.GoodBadge;
import com.vk.ecomm.moderation.api.restrictions.ModerationRestriction;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.collections.EmptyList;
import xsna.vid0;

/* compiled from: StorefrontServicesMapper.kt */
/* loaded from: classes18.dex */
public final class fol0 {
    public final q530 a;

    /* compiled from: StorefrontServicesMapper.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[GoodBadge.BadgeType.values().length];
            try {
                iArr[GoodBadge.BadgeType.DEFAULT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[GoodBadge.BadgeType.OZON.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public fol0(q530 q530Var) {
        this.a = q530Var;
    }

    public static gr1 a(MarketGetAlbumsResponseDto marketGetAlbumsResponseDto, boolean z, int i) {
        List<MarketMarketAlbumDto> d = marketGetAlbumsResponseDto.d();
        ArrayList arrayList = new ArrayList(c5g.u(d, 10));
        for (MarketMarketAlbumDto marketMarketAlbumDto : d) {
            int id = marketMarketAlbumDto.getId();
            UserId q = marketMarketAlbumDto.q();
            String title = marketMarketAlbumDto.getTitle();
            PhotosPhotoDto e = marketMarketAlbumDto.e();
            arrayList.add(new goi0(id, q, title, e != null ? xfa0.a(e) : null));
        }
        return new gr1(arrayList, marketGetAlbumsResponseDto.getCount(), z, i);
    }

    public final wyh0 b(MarketSearchResponseDto marketSearchResponseDto) {
        List<MarketMarketItemDto> d = marketSearchResponseDto.d();
        ArrayList arrayList = new ArrayList(c5g.u(d, 10));
        Iterator<T> it = d.iterator();
        while (it.hasNext()) {
            arrayList.add(e((MarketMarketItemDto) it.next()));
        }
        int e = on00.e(c5g.u(arrayList, 10));
        if (e < 16) {
            e = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(e);
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            Object next = it2.next();
            linkedHashMap.put(Long.valueOf(((uoi0) next).i), next);
        }
        return new wyh0(linkedHashMap.size() == 20, marketSearchResponseDto.e() == MarketServicesViewTypeDto.ROWS, linkedHashMap);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final lsi0 c(MarketGetServicesResponseDto marketGetServicesResponseDto) {
        EmptyList emptyList;
        ArrayList arrayList;
        fsi0 fsi0Var;
        List<MarketMarketItemDto> d = marketGetServicesResponseDto.d();
        if (d != null) {
            List<MarketMarketItemDto> list = d;
            ArrayList arrayList2 = new ArrayList(c5g.u(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList2.add(e((MarketMarketItemDto) it.next()));
            }
            emptyList = arrayList2;
        } else {
            emptyList = EmptyList.b;
        }
        EmptyList emptyList2 = emptyList;
        int e = on00.e(c5g.u(emptyList2, 10));
        if (e < 16) {
            e = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(e);
        for (Object obj : emptyList2) {
            linkedHashMap.put(Long.valueOf(((uoi0) obj).i), obj);
        }
        int e2 = on00.e(c5g.u(emptyList2, 10));
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(e2 >= 16 ? e2 : 16);
        for (Object obj2 : emptyList2) {
            uoi0 uoi0Var = (uoi0) obj2;
            StringBuilder sb = new StringBuilder();
            sb.append(uoi0Var.p);
            sb.append('_');
            sb.append(uoi0Var.i);
            linkedHashMap2.put(sb.toString(), obj2);
        }
        List<MarketMarketServicesSectionDto> e3 = marketGetServicesResponseDto.e();
        if (e3 != null) {
            List<MarketMarketServicesSectionDto> list2 = e3;
            arrayList = new ArrayList(c5g.u(list2, 10));
            for (MarketMarketServicesSectionDto marketMarketServicesSectionDto : list2) {
                List<String> d2 = marketMarketServicesSectionDto.d();
                ArrayList arrayList3 = new ArrayList();
                Iterator<T> it2 = d2.iterator();
                while (it2.hasNext()) {
                    uoi0 uoi0Var2 = (uoi0) linkedHashMap2.get((String) it2.next());
                    if (uoi0Var2 != null) {
                        arrayList3.add(uoi0Var2);
                    }
                }
                ArrayList arrayList4 = new ArrayList(c5g.u(arrayList3, 10));
                Iterator it3 = arrayList3.iterator();
                while (it3.hasNext()) {
                    arrayList4.add(Long.valueOf(((uoi0) it3.next()).i));
                }
                arrayList.add(new fsi0(marketMarketServicesSectionDto.getId(), marketMarketServicesSectionDto.getTitle(), marketMarketServicesSectionDto.getCount(), arrayList4, marketMarketServicesSectionDto.e() == MarketServicesViewTypeDto.ROWS));
            }
        } else {
            arrayList = null;
        }
        ArrayList arrayList5 = arrayList;
        boolean z = (arrayList5 == null || (fsi0Var = (fsi0) j5g.Y(arrayList5)) == null) ? false : fsi0Var.e;
        Integer f = marketGetServicesResponseDto.f();
        return new lsi0(f != null ? f.intValue() : 0, linkedHashMap, arrayList5, z, null);
    }

    public final lsi0 d(MarketGetServicesSectionResponseDto marketGetServicesSectionResponseDto) {
        List<MarketMarketItemDto> e = marketGetServicesSectionResponseDto.e();
        ArrayList arrayList = new ArrayList(c5g.u(e, 10));
        Iterator<T> it = e.iterator();
        while (it.hasNext()) {
            arrayList.add(e((MarketMarketItemDto) it.next()));
        }
        int e2 = on00.e(c5g.u(arrayList, 10));
        if (e2 < 16) {
            e2 = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(e2);
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            Object next = it2.next();
            linkedHashMap.put(Long.valueOf(((uoi0) next).i), next);
        }
        return new lsi0(marketGetServicesSectionResponseDto.getCount(), linkedHashMap, null, marketGetServicesSectionResponseDto.f() == MarketServicesViewTypeDto.ROWS, marketGetServicesSectionResponseDto.d());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final uoi0 e(MarketMarketItemDto marketMarketItemDto) {
        ArrayList arrayList;
        ArrayList arrayList2;
        ModerationRestriction a2 = this.a.a(e530.a(marketMarketItemDto));
        c530 a3 = e530.a(marketMarketItemDto);
        MarketMarketItemRatingDto u = marketMarketItemDto.u();
        EmptyList emptyList = null;
        Float valueOf = u != null ? Float.valueOf(u.d()) : null;
        MarketMarketItemRatingDto u2 = marketMarketItemDto.u();
        String f = u2 != null ? u2.f() : null;
        List<List<BaseImageDto>> a0 = marketMarketItemDto.a0();
        if (a0 != null) {
            List<List<BaseImageDto>> list = a0;
            arrayList = new ArrayList(c5g.u(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(b210.f((List) it.next()));
            }
        } else {
            arrayList = null;
        }
        List<BaseImageDto> W = marketMarketItemDto.W();
        Image f2 = W != null ? b210.f(W) : null;
        List<MarketCustomButtonFullDto> g = marketMarketItemDto.g();
        if (g != null) {
            List<MarketCustomButtonFullDto> list2 = g;
            arrayList2 = new ArrayList(c5g.u(list2, 10));
            Iterator<T> it2 = list2.iterator();
            while (it2.hasNext()) {
                arrayList2.add(b210.b((MarketCustomButtonFullDto) it2.next()));
            }
        } else {
            arrayList2 = null;
        }
        List<MarketBadgeDto> f3 = marketMarketItemDto.f();
        if (f3 != null) {
            ArrayList arrayList3 = new ArrayList();
            for (MarketBadgeDto marketBadgeDto : f3) {
                GoodBadge.BadgeType.a aVar = GoodBadge.BadgeType.Companion;
                MarketBadgeTypeDto k = marketBadgeDto.k();
                Integer valueOf2 = k != null ? Integer.valueOf(k.i()) : null;
                aVar.getClass();
                GoodBadge.BadgeType a4 = GoodBadge.BadgeType.a.a(valueOf2);
                int i = a4 == null ? -1 : a.$EnumSwitchMapping$0[a4.ordinal()];
                vid0 aVar2 = i != 1 ? i != 2 ? null : vid0.c.a : new vid0.a(marketBadgeDto.g());
                if (aVar2 != null) {
                    arrayList3.add(aVar2);
                }
            }
            emptyList = arrayList3;
        }
        if (emptyList == null) {
            emptyList = EmptyList.b;
        }
        Boolean D0 = marketMarketItemDto.D0();
        Boolean bool = Boolean.TRUE;
        boolean f4 = epx.f(D0, bool);
        MarketPriceDto F = marketMarketItemDto.F();
        grd0 grd0Var = new grd0(F.n(), F.l(), F.j());
        long id = marketMarketItemDto.getId();
        String title = marketMarketItemDto.getTitle();
        boolean f5 = epx.f(marketMarketItemDto.y0(), bool);
        MarketItemRejectInfoDto K = marketMarketItemDto.K();
        boolean z = K != null && K.e();
        MarketItemRejectInfoDto K2 = marketMarketItemDto.K();
        boolean z2 = K2 != null && K2.g() == 2;
        boolean z3 = marketMarketItemDto.d() == MarketMarketItemAvailabilityDto.AVAILABLE;
        boolean f6 = epx.f(marketMarketItemDto.w0(), bool);
        String r = marketMarketItemDto.r();
        Integer i2 = marketMarketItemDto.i();
        return new uoi0(valueOf, f, arrayList, f2, arrayList2, emptyList, f4, grd0Var, id, title, Boolean.valueOf(z2), f5, Boolean.valueOf(z), z3, f6, marketMarketItemDto.q(), a3, a2, r, i2 != null ? i2.intValue() : 0, false);
    }
}
