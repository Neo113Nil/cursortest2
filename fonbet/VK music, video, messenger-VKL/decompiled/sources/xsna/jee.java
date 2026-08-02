package xsna;

import com.vk.api.generated.groups.dto.GroupsGroupFullDto;
import com.vk.api.generated.market.dto.MarketMarketItemDto;
import com.vk.api.generated.masks.dto.MasksEffectDto;
import com.vk.api.generated.masks.dto.MasksMaskDto;
import com.vk.api.generated.places.dto.PlacesPlaceDto;
import com.vk.api.generated.shortVideo.dto.ShortVideoAudioDto;
import com.vk.api.generated.shortVideo.dto.ShortVideoCompilationInfoDto;
import com.vk.api.generated.shortVideo.dto.ShortVideoGetGridShortVideosFeedItemDto;
import com.vk.api.generated.shortVideo.dto.ShortVideoGetGridShortVideosResponseDto;
import com.vk.api.generated.users.dto.UsersUserFullDto;
import com.vk.clips.sdk.shared.paging.PaginationKey;
import com.vk.clips.viewer.impl.adapters.ClipVideoFileAdapter;
import com.vk.dto.common.ClipVideoFile;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import xsna.wih0;

/* compiled from: ClipsGridShortVideosResponseAdapter.kt */
/* loaded from: classes17.dex */
public final class jee {
    public static final k2r0 a = new k2r0();
    public static final j2r0 b = new j2r0();
    public static final equ c = new equ();
    public static final dqu d = new dqu();

    public static final qih0 a(ShortVideoGetGridShortVideosResponseDto shortVideoGetGridShortVideosResponseDto) {
        LinkedHashMap linkedHashMap;
        LinkedHashMap linkedHashMap2;
        LinkedHashMap linkedHashMap3;
        LinkedHashMap linkedHashMap4;
        LinkedHashMap linkedHashMap5;
        LinkedHashMap linkedHashMap6;
        List<UsersUserFullDto> k = shortVideoGetGridShortVideosResponseDto.k();
        b.getClass();
        LinkedHashMap b2 = j2r0.b(k);
        List<GroupsGroupFullDto> g = shortVideoGetGridShortVideosResponseDto.g();
        d.getClass();
        LinkedHashMap b3 = dqu.b(g);
        List<UsersUserFullDto> k2 = shortVideoGetGridShortVideosResponseDto.k();
        Map map = jgp.b;
        Map b4 = k2 != null ? a.b(k2) : map;
        List<GroupsGroupFullDto> g2 = shortVideoGetGridShortVideosResponseDto.g();
        if (g2 != null) {
            c.getClass();
            map = equ.b(g2);
        }
        LinkedHashMap n = pn00.n(b4, map);
        List<ShortVideoAudioDto> d2 = shortVideoGetGridShortVideosResponseDto.d();
        if (d2 != null) {
            List<ShortVideoAudioDto> list = d2;
            int e = on00.e(c5g.u(list, 10));
            if (e < 16) {
                e = 16;
            }
            LinkedHashMap linkedHashMap7 = new LinkedHashMap(e);
            for (Object obj : list) {
                ShortVideoAudioDto shortVideoAudioDto = (ShortVideoAudioDto) obj;
                linkedHashMap7.put(new c14(shortVideoAudioDto.q(), shortVideoAudioDto.getId()), obj);
            }
            linkedHashMap = linkedHashMap7;
        } else {
            linkedHashMap = null;
        }
        List<MarketMarketItemDto> i = shortVideoGetGridShortVideosResponseDto.i();
        if (i != null) {
            List<MarketMarketItemDto> list2 = i;
            int e2 = on00.e(c5g.u(list2, 10));
            if (e2 < 16) {
                e2 = 16;
            }
            LinkedHashMap linkedHashMap8 = new LinkedHashMap(e2);
            for (Object obj2 : list2) {
                MarketMarketItemDto marketMarketItemDto = (MarketMarketItemDto) obj2;
                linkedHashMap8.put(new c14(marketMarketItemDto.q(), marketMarketItemDto.getId()), obj2);
            }
            linkedHashMap2 = linkedHashMap8;
        } else {
            linkedHashMap2 = null;
        }
        List<PlacesPlaceDto> j = shortVideoGetGridShortVideosResponseDto.j();
        if (j != null) {
            List<PlacesPlaceDto> list3 = j;
            int e3 = on00.e(c5g.u(list3, 10));
            if (e3 < 16) {
                e3 = 16;
            }
            LinkedHashMap linkedHashMap9 = new LinkedHashMap(e3);
            for (Object obj3 : list3) {
                linkedHashMap9.put(Integer.valueOf(((PlacesPlaceDto) obj3).getId()), obj3);
            }
            linkedHashMap3 = linkedHashMap9;
        } else {
            linkedHashMap3 = null;
        }
        List<MasksMaskDto> H2 = shortVideoGetGridShortVideosResponseDto.H2();
        if (H2 != null) {
            List<MasksMaskDto> list4 = H2;
            int e4 = on00.e(c5g.u(list4, 10));
            if (e4 < 16) {
                e4 = 16;
            }
            linkedHashMap4 = new LinkedHashMap(e4);
            for (Object obj4 : list4) {
                MasksMaskDto masksMaskDto = (MasksMaskDto) obj4;
                linkedHashMap4.put(new c14(masksMaskDto.q(), masksMaskDto.getId()), obj4);
            }
        } else {
            linkedHashMap4 = null;
        }
        List<MasksEffectDto> e5 = shortVideoGetGridShortVideosResponseDto.e();
        if (e5 != null) {
            List<MasksEffectDto> list5 = e5;
            int e6 = on00.e(c5g.u(list5, 10));
            if (e6 < 16) {
                e6 = 16;
            }
            LinkedHashMap linkedHashMap10 = new LinkedHashMap(e6);
            for (Object obj5 : list5) {
                MasksEffectDto masksEffectDto = (MasksEffectDto) obj5;
                linkedHashMap10.put(new c14(masksEffectDto.q(), masksEffectDto.getId()), obj5);
            }
            linkedHashMap5 = linkedHashMap10;
        } else {
            linkedHashMap5 = null;
        }
        List<ShortVideoCompilationInfoDto> H4 = shortVideoGetGridShortVideosResponseDto.H4();
        if (H4 != null) {
            List<ShortVideoCompilationInfoDto> list6 = H4;
            int e7 = on00.e(c5g.u(list6, 10));
            LinkedHashMap linkedHashMap11 = new LinkedHashMap(e7 >= 16 ? e7 : 16);
            for (Object obj6 : list6) {
                Integer e8 = ((ShortVideoCompilationInfoDto) obj6).e();
                linkedHashMap11.put(Integer.valueOf(e8 != null ? e8.intValue() : 0), obj6);
            }
            linkedHashMap6 = linkedHashMap11;
        } else {
            linkedHashMap6 = null;
        }
        List<ShortVideoGetGridShortVideosFeedItemDto> d3 = shortVideoGetGridShortVideosResponseDto.f().d();
        ArrayList arrayList = new ArrayList();
        for (Object obj7 : d3) {
            if (obj7 instanceof ShortVideoGetGridShortVideosFeedItemDto.ShortVideoFeedItemShortVideoFullDto) {
                arrayList.add(obj7);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ShortVideoGetGridShortVideosFeedItemDto.ShortVideoFeedItemShortVideoFullDto shortVideoFeedItemShortVideoFullDto = (ShortVideoGetGridShortVideosFeedItemDto.ShortVideoFeedItemShortVideoFullDto) it.next();
            j2r0 j2r0Var = qgj0.a;
            ClipVideoFile b5 = qgj0.b(shortVideoFeedItemShortVideoFullDto.d(), n, b2, b3, linkedHashMap, linkedHashMap5, linkedHashMap4, linkedHashMap2, linkedHashMap6, linkedHashMap3, null);
            wih0.a aVar = b5.c != 0 ? new wih0.a(new ClipVideoFileAdapter(b5), null) : null;
            if (aVar != null) {
                arrayList2.add(aVar);
            }
        }
        String e9 = shortVideoGetGridShortVideosResponseDto.f().e();
        return new qih0(arrayList2, PaginationKey.LoadedFull.b, (e9 == null || e9.length() == 0 || e9.equals("null")) ? PaginationKey.LoadedFull.b : new PaginationKey.Next(e9), null, null);
    }
}
