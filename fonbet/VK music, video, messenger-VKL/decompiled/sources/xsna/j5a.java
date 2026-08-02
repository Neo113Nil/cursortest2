package xsna;

import android.graphics.Color;
import com.vk.api.generated.apps.dto.AppsAppDto;
import com.vk.api.generated.audio.dto.AudioArtistDto;
import com.vk.api.generated.audio.dto.AudioAudioContentCardDto;
import com.vk.api.generated.audio.dto.AudioAudioDto;
import com.vk.api.generated.audio.dto.AudioConcertCityDto;
import com.vk.api.generated.audio.dto.AudioConcertDto;
import com.vk.api.generated.audio.dto.AudioCuratorDto;
import com.vk.api.generated.audio.dto.AudioFollowingsUpdateInfoDto;
import com.vk.api.generated.audio.dto.AudioFollowingsUpdateItemDto;
import com.vk.api.generated.audio.dto.AudioPhotoDto;
import com.vk.api.generated.audio.dto.AudioPlaylistDto;
import com.vk.api.generated.audio.dto.AudioRadioStationDto;
import com.vk.api.generated.audio.dto.AudioRecommendedPlaylistDto;
import com.vk.api.generated.audio.dto.AudioSearchSuggestionDto;
import com.vk.api.generated.audio.dto.AudioSignalCommonInfoDto;
import com.vk.api.generated.audio.dto.AudioStreamMixCatalogItemDto;
import com.vk.api.generated.audio.dto.AudioStreamMixDto;
import com.vk.api.generated.audio.dto.AudioStreamMixSettingsDto;
import com.vk.api.generated.audio.dto.AudioStreamMixTitlesDto;
import com.vk.api.generated.audioBooks.dto.AudioBooksAudioBookDto;
import com.vk.api.generated.base.dto.BaseBoolIntDto;
import com.vk.api.generated.base.dto.BaseImageDto;
import com.vk.api.generated.base.dto.BaseLinkButtonDto;
import com.vk.api.generated.catalog.dto.CatalogBannerDto;
import com.vk.api.generated.catalog.dto.CatalogButtonDto;
import com.vk.api.generated.catalog.dto.CatalogCatalogLinkDto;
import com.vk.api.generated.catalog.dto.CatalogConcertItemDto;
import com.vk.api.generated.catalog.dto.CatalogGroupCategoryItemDto;
import com.vk.api.generated.catalog.dto.CatalogHintDto;
import com.vk.api.generated.catalog.dto.CatalogUserItemDto;
import com.vk.api.generated.channels.dto.ChannelsChannelDto;
import com.vk.api.generated.channels.dto.ChannelsChannelTypeDto;
import com.vk.api.generated.groups.dto.GroupsGroupFullDto;
import com.vk.api.generated.market.dto.MarketCatalogCategoryContextDto;
import com.vk.api.generated.market.dto.MarketCatalogDistanceOptionDto;
import com.vk.api.generated.market.dto.MarketCatalogFilterDto;
import com.vk.api.generated.market.dto.MarketCatalogSortingDto;
import com.vk.api.generated.market.dto.MarketCatalogStatusOptionDto;
import com.vk.api.generated.market.dto.MarketCurrencyDto;
import com.vk.api.generated.market.dto.MarketDeliveryTypeDto;
import com.vk.api.generated.market.dto.MarketMarketSortingOptionDto;
import com.vk.api.generated.market.dto.MarketMarketSortingOptionIdDto;
import com.vk.api.generated.market.dto.MarketNavigationTabDto;
import com.vk.api.generated.media.dto.MediaPopupDto;
import com.vk.api.generated.music.dto.MusicOwnerDto;
import com.vk.api.generated.podcast.dto.PodcastEpisodeWithLikedFriendsDto;
import com.vk.api.generated.podcast.dto.PodcastExtendedPodcastDto;
import com.vk.api.generated.podcast.dto.PodcastPodcastDto;
import com.vk.api.generated.podcast.dto.PodcastSliderItemDto;
import com.vk.api.generated.search.dto.SearchSpellcheckerDto;
import com.vk.api.generated.search.dto.SearchSpellcheckerSearchActionDto;
import com.vk.api.generated.search.dto.SearchSuggestionItemDto;
import com.vk.api.generated.shortVideo.dto.ShortVideoAudioDto;
import com.vk.api.generated.users.dto.UsersUserDescriptionDto;
import com.vk.api.generated.users.dto.UsersUserFullDto;
import com.vk.catalog2.common.dto.api.CatalogButton;
import com.vk.catalog2.common.dto.api.CatalogButtonOpenUrl;
import com.vk.catalog2.common.dto.api.CatalogStateInfo;
import com.vk.catalog2.common.dto.api.CatalogUserMeta;
import com.vk.catalog2.common.dto.api.banner.BannerStyle;
import com.vk.catalog2.common.dto.api.banner.CatalogBannerImageMode;
import com.vk.catalog2.common.dto.api.channel.CatalogChannel;
import com.vk.catalog2.common.dto.api.market.CatalogNavigationTab;
import com.vk.catalog2.common.dto.api.music.AudioStreamMix;
import com.vk.catalog2.common.dto.api.music.AudioStreamMixTitles;
import com.vk.catalog2.common.dto.api.music.CatalogAudioContentCard;
import com.vk.catalog2.common.dto.api.music.CatalogAudioStreamMix;
import com.vk.catalog2.common.dto.api.music.CatalogConcertItem;
import com.vk.catalog2.common.dto.api.music.MusicOwner;
import com.vk.catalog2.common.dto.api.music.MusicSignalInfo;
import com.vk.catalog2.common.dto.api.music.RadioStation;
import com.vk.catalog2.common.dto.api.search.CatalogSearchSpellcheckResult;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.Currency;
import com.vk.dto.common.Image;
import com.vk.dto.common.ImageSize;
import com.vk.dto.common.VerifyInfo;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.id.UserId;
import com.vk.dto.group.Group;
import com.vk.dto.group.GroupCollection;
import com.vk.dto.group.GroupsCategory;
import com.vk.dto.market.catalog.CatalogMarketCategoryContext;
import com.vk.dto.market.catalog.CatalogMarketDeliveryTypeDto;
import com.vk.dto.market.catalog.CatalogMarketDistanceOption;
import com.vk.dto.market.catalog.CatalogMarketFilter;
import com.vk.dto.market.catalog.CatalogMarketSorting;
import com.vk.dto.market.catalog.CatalogMarketStatusOption;
import com.vk.dto.music.AudioFollowingsUpdateInfo;
import com.vk.dto.music.AudioFollowingsUpdateItem;
import com.vk.dto.music.Concert;
import com.vk.dto.music.ConcertCity;
import com.vk.dto.music.Curator;
import com.vk.dto.music.MusicTrack;
import com.vk.dto.music.Playlist;
import com.vk.dto.music.RecommendedPlaylist;
import com.vk.dto.music.SearchSuggestion;
import com.vk.dto.music.Thumb;
import com.vk.dto.podcast.ExtendedPodcast;
import com.vk.dto.podcast.FriendsLikedEpisode;
import com.vk.dto.podcast.PodcastSliderItem;
import com.vk.music.mixsettings.MixSettingsEntity;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import xsna.z8a;

/* compiled from: CatalogExtendedDataMapper.kt */
/* loaded from: classes16.dex */
public final class j5a {
    public final ne6 a;
    public final z6a b;
    public final Object c;
    public final qw0 d;
    public final Object e;
    public final Object f;
    public final Object g;

    public j5a() {
        ne6 ne6Var = new ne6();
        this.a = ne6Var;
        this.b = new z6a();
        ic icVar = new ic(this, 15);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.c = msy.a(lazyThreadSafetyMode, icVar);
        this.d = new qw0(ne6Var);
        this.e = msy.a(lazyThreadSafetyMode, new uz(3));
        this.f = msy.a(lazyThreadSafetyMode, new pr1(4));
        this.g = msy.a(lazyThreadSafetyMode, new i9(8));
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0061  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static LinkedHashMap A(List list) {
        Integer num;
        String g;
        String r;
        boolean z;
        boolean z2;
        String str;
        if (list == null) {
            list = EmptyList.b;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (AudioRadioStationDto audioRadioStationDto : list) {
            String valueOf = String.valueOf(audioRadioStationDto.getId());
            int id = audioRadioStationDto.getId();
            Thumb a = RadioStation.a.a(audioRadioStationDto.e());
            String d = audioRadioStationDto.d();
            if (d != null && !drm0.N(d)) {
                try {
                    num = Integer.valueOf(Color.parseColor(d));
                } catch (Exception unused) {
                }
                String f = audioRadioStationDto.f();
                g = audioRadioStationDto.g();
                if (g == null) {
                    g = "";
                }
                Boolean j = audioRadioStationDto.j();
                boolean booleanValue = j == null ? j.booleanValue() : false;
                Boolean i = audioRadioStationDto.i();
                boolean booleanValue2 = i != null ? i.booleanValue() : false;
                r = audioRadioStationDto.r();
                if (r != null) {
                    boolean z3 = booleanValue2;
                    str = "";
                    z = booleanValue;
                    z2 = z3;
                } else {
                    z = booleanValue;
                    z2 = booleanValue2;
                    str = r;
                }
                linkedHashMap.put(valueOf, new RadioStation(id, a, num, f, g, z, z2, str));
            }
            num = null;
            String f2 = audioRadioStationDto.f();
            g = audioRadioStationDto.g();
            if (g == null) {
            }
            Boolean j2 = audioRadioStationDto.j();
            if (j2 == null) {
            }
            Boolean i2 = audioRadioStationDto.i();
            if (i2 != null) {
            }
            r = audioRadioStationDto.r();
            if (r != null) {
            }
            linkedHashMap.put(valueOf, new RadioStation(id, a, num, f2, g, z, z2, str));
        }
        return linkedHashMap;
    }

    public static LinkedHashMap B(List list) {
        List<AudioRecommendedPlaylistDto> list2 = list == null ? EmptyList.b : list;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (AudioRecommendedPlaylistDto audioRecommendedPlaylistDto : list2) {
            StringBuilder sb = new StringBuilder();
            sb.append(audioRecommendedPlaylistDto.q());
            sb.append('_');
            sb.append(audioRecommendedPlaylistDto.g());
            String sb2 = sb.toString();
            Integer g = audioRecommendedPlaylistDto.g();
            int intValue = g != null ? g.intValue() : 0;
            UserId q = audioRecommendedPlaylistDto.q();
            if (q == null) {
                q = UserId.d;
            }
            UserId userId = q;
            Float i = audioRecommendedPlaylistDto.i();
            String j = audioRecommendedPlaylistDto.j();
            if (j == null) {
                j = "";
            }
            String str = j;
            Boolean n = audioRecommendedPlaylistDto.n();
            boolean booleanValue = n != null ? n.booleanValue() : false;
            List<String> d = audioRecommendedPlaylistDto.d();
            if (d == null) {
                d = EmptyList.b;
            }
            List<String> list3 = d;
            String e = audioRecommendedPlaylistDto.e();
            String f = audioRecommendedPlaylistDto.f();
            Boolean l = audioRecommendedPlaylistDto.l();
            boolean booleanValue2 = l != null ? l.booleanValue() : true;
            AudioPhotoDto k = audioRecommendedPlaylistDto.k();
            linkedHashMap.put(sb2, new RecommendedPlaylist(intValue, userId, i, str, booleanValue, list3, e, f, booleanValue2, k != null ? sdy.r(k) : null));
        }
        return linkedHashMap;
    }

    public static LinkedHashMap C(List list) {
        if (list == null) {
            list = EmptyList.b;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (SearchSpellcheckerDto searchSpellcheckerDto : list) {
            String id = searchSpellcheckerDto.getId();
            String id2 = searchSpellcheckerDto.getId();
            String r = searchSpellcheckerDto.r();
            String g = searchSpellcheckerDto.g();
            CatalogSearchSpellcheckResult.SearchableVariable searchableVariable = new CatalogSearchSpellcheckResult.SearchableVariable(searchSpellcheckerDto.d().d(), null);
            SearchSpellcheckerSearchActionDto e = searchSpellcheckerDto.e();
            linkedHashMap.put(id, new CatalogSearchSpellcheckResult(id2, r, g, searchableVariable, new CatalogSearchSpellcheckResult.SearchableVariable(e.e(), e.d()), searchSpellcheckerDto.getTitle(), searchSpellcheckerDto.f()));
        }
        return linkedHashMap;
    }

    public static LinkedHashMap D(List list) {
        if (list == null) {
            list = EmptyList.b;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (AudioSignalCommonInfoDto audioSignalCommonInfoDto : list) {
            String id = audioSignalCommonInfoDto.getId();
            if (id == null) {
                id = "";
            }
            String id2 = audioSignalCommonInfoDto.getId();
            if (id2 == null) {
                id2 = "";
            }
            String e = audioSignalCommonInfoDto.e();
            if (e == null) {
                e = "";
            }
            String title = audioSignalCommonInfoDto.getTitle();
            if (title == null) {
                title = "";
            }
            String g = audioSignalCommonInfoDto.g();
            if (g == null) {
                g = "";
            }
            String f = audioSignalCommonInfoDto.f();
            if (f == null) {
                f = "";
            }
            List<String> d = audioSignalCommonInfoDto.d();
            if (d == null) {
                d = EmptyList.b;
            }
            linkedHashMap.put(id, new MusicSignalInfo(id2, e, title, g, f, d));
        }
        return linkedHashMap;
    }

    public static LinkedHashMap E(List list, List list2) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                AudioSearchSuggestionDto audioSearchSuggestionDto = (AudioSearchSuggestionDto) it.next();
                String id = audioSearchSuggestionDto.getId();
                if (id == null) {
                    id = "";
                }
                String id2 = audioSearchSuggestionDto.getId();
                if (id2 == null) {
                    id2 = "";
                }
                String title = audioSearchSuggestionDto.getTitle();
                if (title == null) {
                    title = "";
                }
                String e = audioSearchSuggestionDto.e();
                String str = e == null ? "" : e;
                String d = audioSearchSuggestionDto.d();
                String str2 = d == null ? "" : d;
                SearchSuggestion.Type.a aVar = SearchSuggestion.Type.Companion;
                String type = audioSearchSuggestionDto.getType();
                if (type == null) {
                    type = "";
                }
                aVar.getClass();
                SearchSuggestion.Type a = SearchSuggestion.Type.a.a(type);
                if (a == null) {
                    a = SearchSuggestion.Type.Popular;
                }
                SearchSuggestion.Type type2 = a;
                String r = audioSearchSuggestionDto.r();
                linkedHashMap.put(id, new SearchSuggestion(id2, title, "", str, str2, type2, null, null, null, r == null ? "" : r, 448, null));
            }
        }
        if (list2 != null) {
            Iterator it2 = list2.iterator();
            while (it2.hasNext()) {
                SearchSuggestionItemDto searchSuggestionItemDto = (SearchSuggestionItemDto) it2.next();
                String id3 = searchSuggestionItemDto.getId();
                if (id3 == null) {
                    id3 = "";
                }
                String id4 = searchSuggestionItemDto.getId();
                if (id4 == null) {
                    id4 = "";
                }
                String title2 = searchSuggestionItemDto.getTitle();
                if (title2 == null) {
                    title2 = "";
                }
                String d2 = searchSuggestionItemDto.d();
                if (d2 == null) {
                    d2 = "";
                }
                SearchSuggestion.Type.a aVar2 = SearchSuggestion.Type.Companion;
                String type3 = searchSuggestionItemDto.getType();
                if (type3 == null) {
                    type3 = "";
                }
                aVar2.getClass();
                SearchSuggestion.Type a2 = SearchSuggestion.Type.a.a(type3);
                if (a2 == null) {
                    a2 = SearchSuggestion.Type.Popular;
                }
                SearchSuggestion.Type type4 = a2;
                String r2 = searchSuggestionItemDto.r();
                linkedHashMap.put(id3, new SearchSuggestion(id4, title2, d2, "", "", type4, null, null, null, r2 == null ? "" : r2, 448, null));
            }
        }
        return linkedHashMap;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v3, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r16v2 */
    /* JADX WARN: Type inference failed for: r16v3 */
    /* JADX WARN: Type inference failed for: r16v5, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r16v6 */
    /* JADX WARN: Type inference failed for: r16v9 */
    public static LinkedHashMap F(List list) {
        ?? r10;
        String str;
        String str2;
        Iterator it;
        List list2;
        bpn0 bpn0Var = new bpn0(new f4(5));
        List list3 = list == null ? EmptyList.b : list;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it2 = list3.iterator();
        while (it2.hasNext()) {
            CatalogUserItemDto catalogUserItemDto = (CatalogUserItemDto) it2.next();
            String k = catalogUserItemDto.k();
            String k2 = catalogUserItemDto.k();
            UserId userId = catalogUserItemDto.getUserId();
            String r = catalogUserItemDto.r();
            if (r == null) {
                r = "";
            }
            List<CatalogButtonDto> d = catalogUserItemDto.d();
            if (d != null) {
                r10 = new ArrayList();
                Iterator it3 = d.iterator();
                while (it3.hasNext()) {
                    CatalogButton c = ((t2a) bpn0Var.getValue()).c((CatalogButtonDto) it3.next());
                    if (c != null) {
                        r10.add(c);
                    }
                }
            } else {
                r10 = EmptyList.b;
            }
            List list4 = r10;
            List<UserId> f = catalogUserItemDto.f();
            Integer g = catalogUserItemDto.g();
            int intValue = g != null ? g.intValue() : 0;
            UsersUserDescriptionDto i = catalogUserItemDto.i();
            String e = i != null ? i.e() : null;
            CatalogUserItemDto.BirthdayDto e2 = catalogUserItemDto.e();
            if (e2 != null) {
                str = e2.i();
                str2 = null;
            } else {
                str = null;
                str2 = null;
            }
            String l = catalogUserItemDto.l();
            CatalogUserItemDto.StateDto n = catalogUserItemDto.n();
            String i2 = n != null ? n.i() : str2;
            List<UsersUserDescriptionDto> j = catalogUserItemDto.j();
            if (j != null) {
                List<UsersUserDescriptionDto> list5 = j;
                it = it2;
                ArrayList arrayList = new ArrayList(c5g.u(list5, 10));
                Iterator it4 = list5.iterator();
                while (it4.hasNext()) {
                    UsersUserDescriptionDto usersUserDescriptionDto = (UsersUserDescriptionDto) it4.next();
                    Iterator it5 = it4;
                    String e3 = usersUserDescriptionDto.e();
                    bpn0 bpn0Var2 = bpn0Var;
                    String str3 = e3 == null ? "" : e3;
                    String message = usersUserDescriptionDto.getMessage();
                    String str4 = message == null ? "" : message;
                    String str5 = r;
                    String str6 = k2;
                    arrayList.add(new CatalogUserMeta.Description(str3, str4, usersUserDescriptionDto.d() == BaseBoolIntDto.YES));
                    it4 = it5;
                    r = str5;
                    bpn0Var = bpn0Var2;
                    k2 = str6;
                }
                list2 = arrayList;
            } else {
                it = it2;
                list2 = str2;
            }
            bpn0 bpn0Var3 = bpn0Var;
            String str7 = r;
            String str8 = k2;
            if (list2 == 0) {
                list2 = EmptyList.b;
            }
            linkedHashMap.put(k, new CatalogUserMeta(str8, userId, str7, list4, f, intValue, e, str, l, i2, true, list2));
            it2 = it;
            bpn0Var = bpn0Var3;
        }
        return linkedHashMap;
    }

    public static LinkedHashMap G(List list, List list2, List list3, List list4) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            g5g.y(list, arrayList);
        }
        if (list4 != null) {
            g5g.y(list4, arrayList);
        }
        if (!arrayList.isEmpty()) {
            for (Object obj : ums0.e(ums0.a, arrayList, list2, list3, false, 52)) {
                VideoFile videoFile = (VideoFile) obj;
                StringBuilder sb = new StringBuilder();
                sb.append(videoFile.I0());
                sb.append('_');
                sb.append(videoFile.o0());
                linkedHashMap.put(sb.toString(), obj);
            }
        }
        return linkedHashMap;
    }

    public static LinkedHashMap a(List list) {
        if (list == null) {
            list = EmptyList.b;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (AudioArtistDto audioArtistDto : list) {
            String id = audioArtistDto.getId();
            if (id == null) {
                id = "";
            }
            linkedHashMap.put(id, sp.n(audioArtistDto, true));
        }
        return linkedHashMap;
    }

    public static LinkedHashMap b(List list) {
        if (list == null) {
            list = EmptyList.b;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (AudioBooksAudioBookDto audioBooksAudioBookDto : list) {
            linkedHashMap.put(String.valueOf(audioBooksAudioBookDto.getId()), eg4.a(audioBooksAudioBookDto));
        }
        return linkedHashMap;
    }

    public static LinkedHashMap c(List list) {
        Concert concert;
        List<CatalogConcertItemDto> list2 = list == null ? EmptyList.b : list;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (CatalogConcertItemDto catalogConcertItemDto : list2) {
            String id = catalogConcertItemDto.d().getId();
            AudioConcertDto d = catalogConcertItemDto.d();
            if (d != null) {
                String id2 = d.getId();
                String title = d.getTitle();
                String k = d.k();
                String d2 = d.d();
                AudioConcertCityDto f = d.f();
                ConcertCity concertCity = new ConcertCity(f.getId(), f.getTitle());
                int i = d.i();
                String l = d.l();
                String j = d.j();
                List<String> e = d.e();
                List<BaseImageDto> g = d.g();
                ArrayList arrayList = new ArrayList(c5g.u(g, 10));
                for (BaseImageDto baseImageDto : g) {
                    arrayList.add(new ImageSize(baseImageDto.getUrl(), baseImageDto.getWidth(), baseImageDto.getHeight(), baseImageDto.e(), (char) 0, false, 48, null));
                }
                concert = new Concert(id2, title, k, d2, concertCity, i, l, j, e, new Image(arrayList));
            } else {
                concert = Concert.l;
            }
            CatalogButton c = new t2a().c(catalogConcertItemDto.e());
            linkedHashMap.put(id, new CatalogConcertItem(concert, c instanceof CatalogButtonOpenUrl ? (CatalogButtonOpenUrl) c : null, catalogConcertItemDto.r()));
        }
        return linkedHashMap;
    }

    public static LinkedHashMap d(List list) {
        CatalogAudioContentCard.EntityType entityType;
        if (list == null) {
            list = EmptyList.b;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (AudioAudioContentCardDto audioAudioContentCardDto : list) {
            String str = audioAudioContentCardDto.i() + '_' + audioAudioContentCardDto.g();
            new ne6();
            int i = a1a.$EnumSwitchMapping$0[audioAudioContentCardDto.j().ordinal()];
            if (i == 1) {
                entityType = CatalogAudioContentCard.EntityType.PODCASTS;
            } else {
                if (i != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                entityType = CatalogAudioContentCard.EntityType.AUDIOBOOKS;
            }
            CatalogAudioContentCard.EntityType entityType2 = entityType;
            String g = audioAudioContentCardDto.g();
            String i2 = audioAudioContentCardDto.i();
            String str2 = i2 == null ? "" : i2;
            String d = audioAudioContentCardDto.d();
            String str3 = d == null ? "" : d;
            String f = audioAudioContentCardDto.f();
            String str4 = f == null ? "" : f;
            List<BaseImageDto> e = audioAudioContentCardDto.e();
            Image a = e != null ? ne6.a(e) : Image.d;
            List<BaseImageDto> e2 = audioAudioContentCardDto.e();
            linkedHashMap.put(str, new CatalogAudioContentCard(entityType2, g, str2, str3, str4, a, e2 != null ? ne6.a(e2) : Image.d));
        }
        return linkedHashMap;
    }

    public static LinkedHashMap e(List list) {
        ArrayList arrayList;
        if (list == null) {
            list = EmptyList.b;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (AudioFollowingsUpdateInfoDto audioFollowingsUpdateInfoDto : list) {
            String id = audioFollowingsUpdateInfoDto.getId();
            if (id == null) {
                id = "";
            }
            String id2 = audioFollowingsUpdateInfoDto.getId();
            String str = id2 != null ? id2 : "";
            String title = audioFollowingsUpdateInfoDto.getTitle();
            List<AudioPhotoDto> d = audioFollowingsUpdateInfoDto.d();
            if (d != null) {
                List<AudioPhotoDto> list2 = d;
                arrayList = new ArrayList(c5g.u(list2, 10));
                Iterator<T> it = list2.iterator();
                while (it.hasNext()) {
                    arrayList.add(sdy.r((AudioPhotoDto) it.next()));
                }
            } else {
                arrayList = null;
            }
            linkedHashMap.put(id, new AudioFollowingsUpdateInfo(title, str, arrayList));
        }
        return linkedHashMap;
    }

    public static LinkedHashMap f(List list) {
        if (list == null) {
            list = EmptyList.b;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (AudioFollowingsUpdateItemDto audioFollowingsUpdateItemDto : list) {
            String id = audioFollowingsUpdateItemDto.getId();
            String id2 = audioFollowingsUpdateItemDto.getId();
            String title = audioFollowingsUpdateItemDto.getTitle();
            String e = audioFollowingsUpdateItemDto.e();
            if (e == null) {
                e = "";
            }
            String description = audioFollowingsUpdateItemDto.getDescription();
            if (description == null) {
                description = "";
            }
            String url = audioFollowingsUpdateItemDto.getUrl();
            if (url == null) {
                url = "";
            }
            AudioPhotoDto d = audioFollowingsUpdateItemDto.d();
            linkedHashMap.put(id, new AudioFollowingsUpdateItem(id2, title, e, description, url, d != null ? sdy.r(d) : null));
        }
        return linkedHashMap;
    }

    public static LinkedHashMap g(List list) {
        if (list == null) {
            list = EmptyList.b;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (AudioStreamMixCatalogItemDto audioStreamMixCatalogItemDto : list) {
            String id = audioStreamMixCatalogItemDto.getId();
            String id2 = audioStreamMixCatalogItemDto.getId();
            String d = audioStreamMixCatalogItemDto.d();
            if (d == null) {
                d = "";
            }
            String e = audioStreamMixCatalogItemDto.e();
            if (e == null) {
                e = "";
            }
            AudioStreamMixTitlesDto i = audioStreamMixCatalogItemDto.i();
            AudioStreamMix audioStreamMix = null;
            AudioStreamMixTitles audioStreamMixTitles = i != null ? new AudioStreamMixTitles(i.d(), i.e()) : null;
            AudioStreamMixSettingsDto f = audioStreamMixCatalogItemDto.f();
            MixSettingsEntity a = f != null ? p4v0.a(f) : null;
            String description = audioStreamMixCatalogItemDto.getDescription();
            Boolean j = audioStreamMixCatalogItemDto.j();
            boolean booleanValue = j != null ? j.booleanValue() : false;
            AudioStreamMixDto g = audioStreamMixCatalogItemDto.g();
            if (g != null) {
                audioStreamMix = new AudioStreamMix(g.getId(), g.getTitle());
            }
            linkedHashMap.put(id, new CatalogAudioStreamMix(id2, d, e, a, audioStreamMixTitles, description, booleanValue, audioStreamMix));
        }
        return linkedHashMap;
    }

    public static HashMap h(List list, List list2, List list3) {
        HashMap hashMap = new HashMap();
        if (list == null) {
            list = EmptyList.b;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (AudioAudioDto audioAudioDto : list) {
            Serializer.c<MusicTrack> cVar = MusicTrack.CREATOR;
            linkedHashMap.put(MusicTrack.a.a(audioAudioDto.getId(), audioAudioDto.q()), oc4.d(audioAudioDto));
        }
        hashMap.putAll(linkedHashMap);
        if (list2 == null) {
            list2 = EmptyList.b;
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (AudioAudioDto audioAudioDto2 : list2) {
            Serializer.c<MusicTrack> cVar2 = MusicTrack.CREATOR;
            linkedHashMap2.put(MusicTrack.a.a(audioAudioDto2.getId(), audioAudioDto2.q()), oc4.d(audioAudioDto2));
        }
        hashMap.putAll(linkedHashMap2);
        if (list3 == null) {
            list3 = EmptyList.b;
        }
        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
        for (ShortVideoAudioDto shortVideoAudioDto : list3) {
            Serializer.c<MusicTrack> cVar3 = MusicTrack.CREATOR;
            linkedHashMap3.put(MusicTrack.a.a(shortVideoAudioDto.getId(), shortVideoAudioDto.q()), sfj0.c(shortVideoAudioDto));
        }
        hashMap.putAll(linkedHashMap3);
        return hashMap;
    }

    public static LinkedHashMap i(List list, List list2) {
        Pair pair;
        VerifyInfo verifyInfo;
        LinkedHashMap p = p(list2);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ChannelsChannelDto channelsChannelDto = (ChannelsChannelDto) it.next();
            String valueOf = String.valueOf(channelsChannelDto.d().b);
            if (channelsChannelDto.e() == ChannelsChannelTypeDto.COMMUNITY_CHANNEL) {
                UserId f = channelsChannelDto.f();
                Group group = f != null ? (Group) p.get(String.valueOf(-f.b)) : null;
                pair = new Pair((group == null || (verifyInfo = group.y) == null) ? null : Boolean.valueOf(verifyInfo.b), group != null ? Boolean.valueOf(group.n()) : null);
            } else {
                pair = new Pair(null, null);
            }
            Boolean bool = (Boolean) pair.d();
            Boolean bool2 = (Boolean) pair.g();
            long j = channelsChannelDto.d().b;
            String g = channelsChannelDto.g();
            if (g == null) {
                g = "";
            }
            String title = channelsChannelDto.getTitle();
            String str = title != null ? title : "";
            boolean z = false;
            boolean booleanValue = bool != null ? bool.booleanValue() : false;
            if (bool2 != null) {
                z = bool2.booleanValue();
            }
            linkedHashMap.put(valueOf, new CatalogChannel(j, g, str, booleanValue, z, channelsChannelDto.i().d(), false, 64, null));
        }
        return linkedHashMap;
    }

    public static LinkedHashMap j(List list) {
        Image image;
        List<AudioCuratorDto> list2 = list == null ? EmptyList.b : list;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (AudioCuratorDto audioCuratorDto : list2) {
            Integer e = audioCuratorDto.e();
            String num = e != null ? e.toString() : null;
            if (num == null) {
                num = "";
            }
            Integer e2 = audioCuratorDto.e();
            String num2 = e2 != null ? e2.toString() : null;
            String str = num2 == null ? "" : num2;
            String f = audioCuratorDto.f();
            String description = audioCuratorDto.getDescription();
            List<BaseImageDto> g = audioCuratorDto.g();
            if (g != null) {
                List<BaseImageDto> list3 = g;
                ArrayList arrayList = new ArrayList(c5g.u(list3, 10));
                for (BaseImageDto baseImageDto : list3) {
                    arrayList.add(new ImageSize(baseImageDto.getUrl(), baseImageDto.getWidth(), baseImageDto.getHeight(), baseImageDto.e(), (char) 0, false, 48, null));
                }
                image = new Image(arrayList);
            } else {
                image = null;
            }
            String url = audioCuratorDto.getUrl();
            String str2 = url == null ? "" : url;
            Boolean i = audioCuratorDto.i();
            boolean booleanValue = i != null ? i.booleanValue() : false;
            Boolean d = audioCuratorDto.d();
            boolean booleanValue2 = d != null ? d.booleanValue() : false;
            String r = audioCuratorDto.r();
            linkedHashMap.put(num, new Curator(str, f, description, image, str2, booleanValue, booleanValue2, r == null ? "" : r));
        }
        return linkedHashMap;
    }

    public static LinkedHashMap k(List list) {
        if (list == null) {
            list = EmptyList.b;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (PodcastExtendedPodcastDto podcastExtendedPodcastDto : list) {
            StringBuilder sb = new StringBuilder();
            PodcastPodcastDto i = podcastExtendedPodcastDto.i();
            Integer num = null;
            sb.append(i != null ? i.q() : null);
            sb.append('_');
            PodcastPodcastDto i2 = podcastExtendedPodcastDto.i();
            if (i2 != null) {
                num = Integer.valueOf(i2.getId());
            }
            sb.append(num);
            String sb2 = sb.toString();
            ne6 ne6Var = hhb0.a;
            String d = podcastExtendedPodcastDto.d();
            String g = podcastExtendedPodcastDto.g();
            ne6 ne6Var2 = hhb0.a;
            List<BaseImageDto> e = podcastExtendedPodcastDto.e();
            ne6Var2.getClass();
            Image a = ne6.a(e);
            Image a2 = ne6.a(podcastExtendedPodcastDto.f());
            rte0 rte0Var = hhb0.b;
            PodcastPodcastDto i3 = podcastExtendedPodcastDto.i();
            rte0Var.getClass();
            linkedHashMap.put(sb2, new ExtendedPodcast(d, g, a, a2, rte0.u(i3)));
        }
        return linkedHashMap;
    }

    public static LinkedHashMap l(List list) {
        if (list == null) {
            list = EmptyList.b;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (PodcastEpisodeWithLikedFriendsDto podcastEpisodeWithLikedFriendsDto : list) {
            StringBuilder sb = new StringBuilder();
            AudioAudioDto d = podcastEpisodeWithLikedFriendsDto.d();
            sb.append(d != null ? d.q() : null);
            sb.append('_');
            AudioAudioDto d2 = podcastEpisodeWithLikedFriendsDto.d();
            sb.append(d2 != null ? Integer.valueOf(d2.getId()) : null);
            String sb2 = sb.toString();
            List<Integer> e = podcastEpisodeWithLikedFriendsDto.e();
            if (e == null) {
                e = EmptyList.b;
            }
            linkedHashMap.put(sb2, new FriendsLikedEpisode(e, null, oc4.d(podcastEpisodeWithLikedFriendsDto.d())));
        }
        return linkedHashMap;
    }

    public static LinkedHashMap m(List list) {
        new re3();
        if (list == null) {
            list = EmptyList.b;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (AppsAppDto appsAppDto : list) {
            linkedHashMap.put(String.valueOf(appsAppDto.getId()), re3.b(appsAppDto));
        }
        return linkedHashMap;
    }

    public static LinkedHashMap n(List list) {
        his0 his0Var = new his0();
        if (list == null) {
            return new LinkedHashMap();
        }
        List list2 = list;
        j9 j9Var = new j9(his0Var, list);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            Object invoke = j9Var.invoke(it.next());
            linkedHashMap.put(((GroupCollection) invoke).b, invoke);
        }
        return linkedHashMap;
    }

    public static LinkedHashMap o(List list) {
        new ne6();
        if (list == null) {
            list = EmptyList.b;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (CatalogGroupCategoryItemDto catalogGroupCategoryItemDto : list) {
            String id = catalogGroupCategoryItemDto.getId();
            String id2 = catalogGroupCategoryItemDto.getId();
            String str = id2 == null ? "" : id2;
            String i = catalogGroupCategoryItemDto.i();
            String str2 = i == null ? "" : i;
            String j = catalogGroupCategoryItemDto.j();
            String str3 = j == null ? "" : j;
            String g = catalogGroupCategoryItemDto.g();
            String str4 = g == null ? "" : g;
            Integer d = catalogGroupCategoryItemDto.d();
            int intValue = d != null ? d.intValue() : 0;
            List<BaseImageDto> f = catalogGroupCategoryItemDto.f();
            Image a = f != null ? ne6.a(f) : null;
            String e = catalogGroupCategoryItemDto.e();
            linkedHashMap.put(id, new GroupsCategory(str, str2, str3, str4, intValue, a, e == null ? "" : e));
        }
        return linkedHashMap;
    }

    public static LinkedHashMap p(List list) {
        new dqu();
        if (list == null) {
            list = EmptyList.b;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (GroupsGroupFullDto groupsGroupFullDto : list) {
            linkedHashMap.put(String.valueOf(groupsGroupFullDto.P0().b), dqu.a(groupsGroupFullDto));
        }
        return linkedHashMap;
    }

    public static LinkedHashMap r(List list) {
        if (list == null) {
            list = EmptyList.b;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (CatalogCatalogLinkDto catalogCatalogLinkDto : list) {
            String id = catalogCatalogLinkDto.getId();
            if (id == null) {
                id = "";
            }
            linkedHashMap.put(id, q8a.a(catalogCatalogLinkDto));
        }
        return linkedHashMap;
    }

    public static LinkedHashMap s(List list) {
        new re3();
        if (list == null) {
            list = EmptyList.b;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (AppsAppDto appsAppDto : list) {
            linkedHashMap.put(String.valueOf(appsAppDto.getId()), re3.b(appsAppDto));
        }
        return linkedHashMap;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v4, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r8v5, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX WARN: Type inference failed for: r8v8, types: [java.util.ArrayList] */
    public static LinkedHashMap v(List list, List list2) {
        ?? m;
        CatalogBannerImageMode catalogBannerImageMode;
        BannerStyle bannerStyle;
        String i;
        ?? m2;
        CatalogBannerImageMode catalogBannerImageMode2;
        String i2;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                MediaPopupDto mediaPopupDto = (MediaPopupDto) it.next();
                String valueOf = String.valueOf(mediaPopupDto.getId());
                new t2a();
                String id = mediaPopupDto.getId();
                String str = id == null ? "" : id;
                String title = mediaPopupDto.getTitle();
                new ne6();
                Image a = ne6.a(mediaPopupDto.f());
                String i3 = mediaPopupDto.i();
                List<BaseLinkButtonDto> e = mediaPopupDto.e();
                if (e != null) {
                    m2 = new ArrayList();
                    Iterator it2 = e.iterator();
                    while (it2.hasNext()) {
                        CatalogButton b = t2a.b((BaseLinkButtonDto) it2.next());
                        if (b != null) {
                            m2.add(b);
                        }
                    }
                } else {
                    m2 = e43.m(t2a.b(mediaPopupDto.d()));
                }
                List list3 = m2;
                MediaPopupDto.ImageModeDto g = mediaPopupDto.g();
                if (g == null || (i2 = g.i()) == null) {
                    catalogBannerImageMode2 = null;
                } else {
                    CatalogBannerImageMode.Companion.getClass();
                    catalogBannerImageMode2 = CatalogBannerImageMode.a.b(i2);
                }
                linkedHashMap.put(valueOf, new CatalogStateInfo(str, title, a, null, i3, list3, null, catalogBannerImageMode2, dhr0.t.c(R.attr.vk_ui_field_background), null, null, null, null, null, null, null, null, 126976, null));
            }
        }
        if (list2 != null) {
            Iterator it3 = list2.iterator();
            while (it3.hasNext()) {
                CatalogBannerDto catalogBannerDto = (CatalogBannerDto) it3.next();
                String valueOf2 = String.valueOf(catalogBannerDto.getId());
                new t2a();
                new ne6();
                String valueOf3 = String.valueOf(catalogBannerDto.getId());
                String title2 = catalogBannerDto.getTitle();
                String str2 = title2 == null ? "" : title2;
                Image a2 = ne6.a(catalogBannerDto.i());
                String l = catalogBannerDto.l();
                List<BaseLinkButtonDto> d = catalogBannerDto.d();
                if (d != null) {
                    m = new ArrayList();
                    Iterator it4 = d.iterator();
                    while (it4.hasNext()) {
                        CatalogButton b2 = t2a.b((BaseLinkButtonDto) it4.next());
                        if (b2 != null) {
                            m.add(b2);
                        }
                    }
                } else {
                    m = e43.m(t2a.b(catalogBannerDto.e()));
                }
                List list4 = m;
                CatalogButton b3 = t2a.b(catalogBannerDto.e());
                CatalogBannerDto.ImageModeDto g2 = catalogBannerDto.g();
                if (g2 == null || (i = g2.i()) == null) {
                    catalogBannerImageMode = null;
                } else {
                    CatalogBannerImageMode.Companion.getClass();
                    catalogBannerImageMode = CatalogBannerImageMode.a.b(i);
                }
                int c = dhr0.t.c(R.attr.vk_ui_field_background);
                String r = catalogBannerDto.r();
                String k = catalogBannerDto.k();
                List<BaseImageDto> f = catalogBannerDto.f();
                Image a3 = f != null ? ne6.a(f) : null;
                CatalogBannerDto.StyleDto j = catalogBannerDto.j();
                if (j != null) {
                    int i4 = h1a.$EnumSwitchMapping$0[j.ordinal()];
                    bannerStyle = i4 != 1 ? i4 != 2 ? i4 != 3 ? i4 != 4 ? i4 != 5 ? BannerStyle.WITHOUT_IMAGE : BannerStyle.WITHOUT_IMAGE : BannerStyle.IMAGE_CROPPED_RIGHT : BannerStyle.IMAGE_CENTER : BannerStyle.IMAGE_LEFT : BannerStyle.IMAGE_RIGHT;
                } else {
                    bannerStyle = null;
                }
                linkedHashMap.put(valueOf2, new CatalogStateInfo(valueOf3, str2, a2, null, l, list4, b3, catalogBannerImageMode, c, null, r, k, null, a3, bannerStyle, null, null, 98304, null));
            }
        }
        return linkedHashMap;
    }

    public static LinkedHashMap w(List list) {
        jt4 jt4Var = jt4.a;
        if (list == null) {
            list = EmptyList.b;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (AudioPlaylistDto audioPlaylistDto : list) {
            Set<Integer> set = Playlist.P;
            String a = Playlist.a.a(audioPlaylistDto.getId(), audioPlaylistDto.q());
            jt4Var.getClass();
            linkedHashMap.put(a, jt4.a(audioPlaylistDto));
        }
        return linkedHashMap;
    }

    public static LinkedHashMap x(List list) {
        if (list == null) {
            list = EmptyList.b;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (PodcastSliderItemDto podcastSliderItemDto : list) {
            String e = podcastSliderItemDto.e();
            if (e == null) {
                e = "";
            }
            String e2 = podcastSliderItemDto.e();
            if (e2 == null) {
                e2 = "";
            }
            PodcastSliderItem.Type.a aVar = PodcastSliderItem.Type.Companion;
            String f = podcastSliderItemDto.f();
            String str = f != null ? f : "";
            aVar.getClass();
            PodcastSliderItem.Type type = PodcastSliderItem.Type.RANDOM_BUTTON;
            if (!str.equals(type.h())) {
                type = PodcastSliderItem.Type.EPISODE;
            }
            AudioAudioDto d = podcastSliderItemDto.d();
            linkedHashMap.put(e, new PodcastSliderItem(e2, type, d != null ? oc4.d(d) : null));
        }
        return linkedHashMap;
    }

    public static LinkedHashMap y(List list) {
        if (list == null) {
            list = EmptyList.b;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (PodcastPodcastDto podcastPodcastDto : list) {
            StringBuilder sb = new StringBuilder();
            sb.append(podcastPodcastDto.q());
            sb.append('_');
            sb.append(podcastPodcastDto.getId());
            linkedHashMap.put(sb.toString(), rte0.u(podcastPodcastDto));
        }
        return linkedHashMap;
    }

    public static LinkedHashMap z(List list) {
        new j2r0();
        if (list == null) {
            list = EmptyList.b;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (UsersUserFullDto usersUserFullDto : list) {
            linkedHashMap.put(String.valueOf(usersUserFullDto.s1().b), j2r0.a(usersUserFullDto));
        }
        return linkedHashMap;
    }

    public final LinkedHashMap q(List list) {
        if (list == null) {
            list = EmptyList.b;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (CatalogHintDto catalogHintDto : list) {
            String id = catalogHintDto.getId();
            if (id == null) {
                id = "";
            }
            this.b.getClass();
            linkedHashMap.put(id, z6a.a(catalogHintDto));
        }
        return linkedHashMap;
    }

    public final LinkedHashMap t(List list) {
        Image image;
        if (list == null) {
            list = EmptyList.b;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (MusicOwnerDto musicOwnerDto : list) {
            String id = musicOwnerDto.getId();
            if (id == null) {
                id = "";
            }
            String id2 = musicOwnerDto.getId();
            String str = id2 == null ? "" : id2;
            String title = musicOwnerDto.getTitle();
            String str2 = title == null ? "" : title;
            String f = musicOwnerDto.f();
            String str3 = f == null ? "" : f;
            String url = musicOwnerDto.getUrl();
            String str4 = url == null ? "" : url;
            List<BaseImageDto> e = musicOwnerDto.e();
            if (e != null) {
                this.a.getClass();
                image = ne6.a(e);
            } else {
                image = Image.d;
            }
            linkedHashMap.put(id, new MusicOwner(str, str2, str3, str4, image, musicOwnerDto.d() != null ? r1.intValue() : 0L));
        }
        return linkedHashMap;
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kotlin.Lazy] */
    public final LinkedHashMap u(List list) {
        MarketNavigationTabDto marketNavigationTabDto;
        String str;
        String str2;
        CatalogMarketFilter catalogMarketFilter;
        CatalogMarketSorting catalogMarketSorting;
        MarketCatalogFilterDto marketCatalogFilterDto;
        Long l;
        ArrayList arrayList;
        ArrayList arrayList2;
        CatalogMarketDeliveryTypeDto catalogMarketDeliveryTypeDto;
        CatalogMarketDeliveryTypeDto catalogMarketDeliveryTypeDto2;
        List list2 = list == null ? EmptyList.b : list;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        kba kbaVar = (kba) this.c.getValue();
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            MarketNavigationTabDto marketNavigationTabDto2 = (MarketNavigationTabDto) it.next();
            String id = marketNavigationTabDto2.getId();
            kbaVar.getClass();
            String id2 = marketNavigationTabDto2.getId();
            String title = marketNavigationTabDto2.getTitle();
            String i = marketNavigationTabDto2.l().i();
            String k = marketNavigationTabDto2.k();
            String j = marketNavigationTabDto2.j();
            ne6 ne6Var = kbaVar.a;
            List<BaseImageDto> f = marketNavigationTabDto2.f();
            if (f == null) {
                f = EmptyList.b;
            }
            ne6Var.getClass();
            Image a = ne6.a(f);
            Boolean n = marketNavigationTabDto2.n();
            boolean booleanValue = n != null ? n.booleanValue() : false;
            Integer d = marketNavigationTabDto2.d();
            Integer g = marketNavigationTabDto2.g();
            MarketCatalogFilterDto e = marketNavigationTabDto2.e();
            Iterator it2 = it;
            if (e != null) {
                kbaVar.b.getClass();
                String d2 = e.d();
                CatalogMarketCategoryContext.Context.Companion.getClass();
                CatalogMarketCategoryContext.Context a2 = CatalogMarketCategoryContext.Context.a.a(d2);
                if (e.F() != null) {
                    marketCatalogFilterDto = e;
                    str = id2;
                    l = Long.valueOf(r0.intValue());
                } else {
                    marketCatalogFilterDto = e;
                    str = id2;
                    l = null;
                }
                Long valueOf = marketCatalogFilterDto.D() != null ? Long.valueOf(r0.intValue()) : null;
                MarketCurrencyDto C = marketCatalogFilterDto.C();
                if (C == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                Currency currency = new Currency(C.getId(), C.d(), C.getTitle());
                String i2 = marketCatalogFilterDto.i();
                List<MarketCatalogCategoryContextDto> e2 = marketCatalogFilterDto.e();
                if (e2 == null) {
                    e2 = EmptyList.b;
                }
                List<MarketCatalogCategoryContextDto> list3 = e2;
                marketNavigationTabDto = marketNavigationTabDto2;
                ArrayList arrayList3 = new ArrayList(c5g.u(list3, 10));
                Iterator it3 = list3.iterator();
                while (it3.hasNext()) {
                    MarketCatalogCategoryContextDto marketCatalogCategoryContextDto = (MarketCatalogCategoryContextDto) it3.next();
                    String d3 = marketCatalogCategoryContextDto.d();
                    CatalogMarketCategoryContext.Context.Companion.getClass();
                    arrayList3.add(new CatalogMarketCategoryContext(CatalogMarketCategoryContext.Context.a.a(d3), marketCatalogCategoryContextDto.f(), marketCatalogCategoryContextDto.g(), marketCatalogCategoryContextDto.e()));
                    it3 = it3;
                    currency = currency;
                    title = title;
                }
                Currency currency2 = currency;
                str2 = title;
                Integer l2 = marketCatalogFilterDto.l();
                Integer n2 = marketCatalogFilterDto.n();
                List<MarketCatalogDistanceOptionDto> o = marketCatalogFilterDto.o();
                if (o != null) {
                    List<MarketCatalogDistanceOptionDto> list4 = o;
                    ArrayList arrayList4 = new ArrayList(c5g.u(list4, 10));
                    for (MarketCatalogDistanceOptionDto marketCatalogDistanceOptionDto : list4) {
                        arrayList4.add(new CatalogMarketDistanceOption(marketCatalogDistanceOptionDto.getTitle(), marketCatalogDistanceOptionDto.d()));
                        l2 = l2;
                    }
                    arrayList = arrayList4;
                } else {
                    arrayList = null;
                }
                Integer num = l2;
                String M = marketCatalogFilterDto.M();
                List<MarketCatalogStatusOptionDto> R = marketCatalogFilterDto.R();
                if (R != null) {
                    List<MarketCatalogStatusOptionDto> list5 = R;
                    ArrayList arrayList5 = new ArrayList(c5g.u(list5, 10));
                    for (MarketCatalogStatusOptionDto marketCatalogStatusOptionDto : list5) {
                        arrayList5.add(new CatalogMarketStatusOption(marketCatalogStatusOptionDto.getTitle(), marketCatalogStatusOptionDto.d().i()));
                    }
                    arrayList2 = arrayList5;
                } else {
                    arrayList2 = null;
                }
                Boolean B = marketCatalogFilterDto.B();
                Boolean k2 = marketCatalogFilterDto.k();
                Boolean K = marketCatalogFilterDto.K();
                Boolean p = marketCatalogFilterDto.p();
                Boolean u = marketCatalogFilterDto.u();
                MarketDeliveryTypeDto j2 = marketCatalogFilterDto.j();
                int i3 = j2 == null ? -1 : z8a.a.$EnumSwitchMapping$0[j2.ordinal()];
                if (i3 == 1) {
                    catalogMarketDeliveryTypeDto = CatalogMarketDeliveryTypeDto.ANY;
                } else if (i3 == 2) {
                    catalogMarketDeliveryTypeDto = CatalogMarketDeliveryTypeDto.COURIER;
                } else if (i3 != 3) {
                    catalogMarketDeliveryTypeDto2 = null;
                    catalogMarketFilter = new CatalogMarketFilter(a2, l, valueOf, currency2, i2, arrayList3, num, n2, arrayList, M, arrayList2, B, k2, K, p, u, catalogMarketDeliveryTypeDto2);
                } else {
                    catalogMarketDeliveryTypeDto = CatalogMarketDeliveryTypeDto.PICKUP;
                }
                catalogMarketDeliveryTypeDto2 = catalogMarketDeliveryTypeDto;
                catalogMarketFilter = new CatalogMarketFilter(a2, l, valueOf, currency2, i2, arrayList3, num, n2, arrayList, M, arrayList2, B, k2, K, p, u, catalogMarketDeliveryTypeDto2);
            } else {
                marketNavigationTabDto = marketNavigationTabDto2;
                str = id2;
                str2 = title;
                catalogMarketFilter = null;
            }
            MarketCatalogSortingDto i4 = marketNavigationTabDto.i();
            if (i4 != null) {
                kbaVar.c.getClass();
                List<MarketMarketSortingOptionDto> e3 = i4.e();
                if (e3 == null) {
                    e3 = EmptyList.b;
                }
                List<MarketMarketSortingOptionDto> list6 = e3;
                ArrayList arrayList6 = new ArrayList(c5g.u(list6, 10));
                for (MarketMarketSortingOptionDto marketMarketSortingOptionDto : list6) {
                    arrayList6.add(new CatalogMarketSorting.SortOption(marketMarketSortingOptionDto.d().i(), marketMarketSortingOptionDto.getTitle()));
                    i4 = i4;
                }
                MarketMarketSortingOptionIdDto d4 = i4.d();
                catalogMarketSorting = new CatalogMarketSorting(arrayList6, d4 != null ? d4.i() : null);
            } else {
                catalogMarketSorting = null;
            }
            linkedHashMap.put(id, new CatalogNavigationTab(str, str2, i, k, j, a, booleanValue, d, g, catalogMarketFilter, catalogMarketSorting));
            it = it2;
        }
        return linkedHashMap;
    }
}
