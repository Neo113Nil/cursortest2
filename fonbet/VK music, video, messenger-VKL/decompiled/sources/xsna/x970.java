package xsna;

import com.vk.api.generated.apps.dto.AppsAppDto;
import com.vk.api.generated.audio.dto.AudioAudioDto;
import com.vk.api.generated.groups.dto.GroupsGroupDto;
import com.vk.api.generated.market.dto.MarketMarketItemDto;
import com.vk.api.generated.photos.dto.PhotosPhotoDto;
import com.vk.api.generated.polls.dto.PollsPollDto;
import com.vk.api.generated.stories.dto.StoriesStoryDto;
import com.vk.api.generated.users.dto.UsersUserDto;
import com.vk.api.generated.video.dto.VideoVideoDto;
import com.vk.api.generated.wall.dto.WallWallpostDto;
import com.vk.dto.common.id.UserId;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;

/* compiled from: NotificationEntityContainer.kt */
/* loaded from: classes4.dex */
public final class x970 {
    public final Object a;
    public final Object b;
    public final Map<Pair<Integer, UserId>, WallWallpostDto> c;
    public final Map<Pair<Integer, UserId>, PhotosPhotoDto> d;
    public final Map<Pair<Integer, UserId>, VideoVideoDto> e;
    public final Object f;
    public final Object g;
    public final Object h;
    public final Map<Pair<Integer, UserId>, MarketMarketItemDto> i;
    public final Map<Pair<Integer, UserId>, AudioAudioDto> j;

    public x970(List<UsersUserDto> list, List<GroupsGroupDto> list2, List<WallWallpostDto> list3, List<PhotosPhotoDto> list4, List<VideoVideoDto> list5, List<StoriesStoryDto> list6, List<AppsAppDto> list7, List<PollsPollDto> list8, List<MarketMarketItemDto> list9, List<AudioAudioDto> list10) {
        Map map;
        Map map2;
        Map map3;
        Map map4;
        Map map5;
        Map map6;
        Map map7;
        Map map8;
        Map map9;
        Map map10 = jgp.b;
        if (list != null) {
            List<UsersUserDto> list11 = list;
            int e = on00.e(c5g.u(list11, 10));
            map = new LinkedHashMap(e < 16 ? 16 : e);
            for (Object obj : list11) {
                map.put(((UsersUserDto) obj).j(), obj);
            }
        } else {
            map = map10;
        }
        this.a = map;
        if (list2 != null) {
            List<GroupsGroupDto> list12 = list2;
            int e2 = on00.e(c5g.u(list12, 10));
            map2 = new LinkedHashMap(e2 < 16 ? 16 : e2);
            for (Object obj2 : list12) {
                map2.put(((GroupsGroupDto) obj2).g(), obj2);
            }
        } else {
            map2 = map10;
        }
        this.b = map2;
        if (list3 != null) {
            ArrayList arrayList = new ArrayList();
            for (WallWallpostDto wallWallpostDto : list3) {
                Integer e3 = wallWallpostDto.e();
                UserId q = wallWallpostDto.q();
                Pair pair = (e3 == null || q == null) ? null : new Pair(new Pair(e3, q), wallWallpostDto);
                if (pair != null) {
                    arrayList.add(pair);
                }
            }
            map3 = pn00.s(arrayList);
        } else {
            map3 = map10;
        }
        this.c = map3;
        if (list4 != null) {
            List<PhotosPhotoDto> list13 = list4;
            int e4 = on00.e(c5g.u(list13, 10));
            LinkedHashMap linkedHashMap = new LinkedHashMap(e4 < 16 ? 16 : e4);
            for (Object obj3 : list13) {
                PhotosPhotoDto photosPhotoDto = (PhotosPhotoDto) obj3;
                linkedHashMap.put(new Pair(Integer.valueOf(photosPhotoDto.getId()), photosPhotoDto.q()), obj3);
            }
            map4 = pn00.t(linkedHashMap);
        } else {
            map4 = map10;
        }
        this.d = map4;
        if (list5 != null) {
            ArrayList arrayList2 = new ArrayList();
            for (VideoVideoDto videoVideoDto : list5) {
                Integer w0 = videoVideoDto.w0();
                UserId q2 = videoVideoDto.q();
                Pair pair2 = (w0 == null || q2 == null) ? null : new Pair(new Pair(w0, q2), videoVideoDto);
                if (pair2 != null) {
                    arrayList2.add(pair2);
                }
            }
            map5 = pn00.s(arrayList2);
        } else {
            map5 = map10;
        }
        this.e = map5;
        if (list6 != null) {
            List<StoriesStoryDto> list14 = list6;
            int e5 = on00.e(c5g.u(list14, 10));
            map6 = new LinkedHashMap(e5 < 16 ? 16 : e5);
            for (StoriesStoryDto storiesStoryDto : list14) {
                Pair pair3 = new Pair(new Pair(Integer.valueOf(storiesStoryDto.getId()), storiesStoryDto.q()), storiesStoryDto);
                map6.put(pair3.i(), pair3.j());
            }
        } else {
            map6 = map10;
        }
        this.f = map6;
        if (list7 != null) {
            List<AppsAppDto> list15 = list7;
            int e6 = on00.e(c5g.u(list15, 10));
            map7 = new LinkedHashMap(e6 < 16 ? 16 : e6);
            for (Object obj4 : list15) {
                map7.put(Integer.valueOf(((AppsAppDto) obj4).getId()), obj4);
            }
        } else {
            map7 = map10;
        }
        this.g = map7;
        if (list8 != null) {
            List<PollsPollDto> list16 = list8;
            int e7 = on00.e(c5g.u(list16, 10));
            map8 = new LinkedHashMap(e7 < 16 ? 16 : e7);
            for (Object obj5 : list16) {
                map8.put(Integer.valueOf(((PollsPollDto) obj5).getId()), obj5);
            }
        } else {
            map8 = map10;
        }
        this.h = map8;
        if (list9 != null) {
            List<MarketMarketItemDto> list17 = list9;
            int e8 = on00.e(c5g.u(list17, 10));
            LinkedHashMap linkedHashMap2 = new LinkedHashMap(e8 < 16 ? 16 : e8);
            for (Object obj6 : list17) {
                MarketMarketItemDto marketMarketItemDto = (MarketMarketItemDto) obj6;
                linkedHashMap2.put(new Pair(Integer.valueOf(marketMarketItemDto.getId()), marketMarketItemDto.q()), obj6);
            }
            map9 = pn00.t(linkedHashMap2);
        } else {
            map9 = map10;
        }
        this.i = map9;
        if (list10 != null) {
            List<AudioAudioDto> list18 = list10;
            int e9 = on00.e(c5g.u(list18, 10));
            LinkedHashMap linkedHashMap3 = new LinkedHashMap(e9 >= 16 ? e9 : 16);
            for (Object obj7 : list18) {
                AudioAudioDto audioAudioDto = (AudioAudioDto) obj7;
                linkedHashMap3.put(new Pair(Integer.valueOf(audioAudioDto.getId()), audioAudioDto.q()), obj7);
            }
            map10 = pn00.t(linkedHashMap3);
        }
        this.j = map10;
    }
}
