package xsna;

import android.os.Bundle;
import androidx.car.app.hardware.common.CarZone;
import com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.mbridge.msdk.out.MBSupportMuteAdType;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.TsExtractor;
import com.unity3d.ads.BuildConfig;
import com.vk.api.generated.catalog.dto.CatalogArtistInfoItemDto;
import com.vk.api.generated.catalog.dto.CatalogBadgeDto;
import com.vk.api.generated.catalog.dto.CatalogBlockDataTypeDto;
import com.vk.api.generated.catalog.dto.CatalogBlockDto;
import com.vk.api.generated.catalog.dto.CatalogBlockMetaDto;
import com.vk.api.generated.catalog.dto.CatalogButtonDto;
import com.vk.api.generated.catalog.dto.CatalogChannelsItemDto;
import com.vk.api.generated.catalog.dto.CatalogEntityGroupsItemDto;
import com.vk.api.generated.catalog.dto.CatalogGameItemDto;
import com.vk.api.generated.catalog.dto.CatalogGroupCategoryMetaItemDto;
import com.vk.api.generated.catalog.dto.CatalogGroupsItemDto;
import com.vk.api.generated.catalog.dto.CatalogItemBadgeDto;
import com.vk.api.generated.catalog.dto.CatalogLayoutDto;
import com.vk.api.generated.catalog.dto.CatalogLayoutTopTitleDto;
import com.vk.api.generated.catalog.dto.CatalogMiniAppContentItemDto;
import com.vk.api.generated.catalog.dto.CatalogOnboardingInfoDto;
import com.vk.api.generated.catalog.dto.CatalogPinnedVideosItemDto;
import com.vk.api.generated.catalog.dto.CatalogRecomPlaylistRelationDto;
import com.vk.api.generated.catalog.dto.CatalogSearchAuthorItemDto;
import com.vk.api.generated.catalog.dto.CatalogSearchRecentDto;
import com.vk.api.generated.catalog.dto.CatalogShowAllInfoDto;
import com.vk.catalog2.common.dto.api.CatalogButton;
import com.vk.catalog2.common.dto.api.CatalogCustomAttributes$Keys;
import com.vk.catalog2.common.dto.api.CatalogDataType;
import com.vk.catalog2.common.dto.api.CatalogGroupCategoryItem;
import com.vk.catalog2.common.dto.api.CatalogOnboardingInfo;
import com.vk.catalog2.common.dto.api.CatalogViewType;
import com.vk.catalog2.common.dto.api.Meta;
import com.vk.catalog2.common.dto.api.ShowAllInfo;
import com.vk.catalog2.common.dto.api.app.AppContent;
import com.vk.catalog2.common.dto.api.badge.CatalogBadge;
import com.vk.catalog2.common.dto.api.block.CatalogArtistChip;
import com.vk.catalog2.common.dto.api.block.CatalogArtistInfo;
import com.vk.catalog2.common.dto.api.block.CatalogBlock;
import com.vk.catalog2.common.dto.api.block.CatalogBlockItemsData;
import com.vk.catalog2.common.dto.api.layout.CatalogLayout;
import com.vk.catalog2.common.dto.api.layout.LayoutSize;
import com.vk.catalog2.common.dto.api.layout.TopTitle;
import com.vk.catalog2.common.dto.api.video.CatalogPinnedVideoInfo;
import com.vk.dto.common.id.UserId;
import com.vk.dto.games.CatalogMiniAppItem;
import com.vk.dto.group.GroupCatalogItem;
import com.vk.dto.group.GroupsEntityCatalogItem;
import com.vk.dto.search.SearchAuthorItem;
import com.vk.log.L;
import com.vk.music.search.history.SearchHistoryModel;
import io.jsonwebtoken.JwtParser;
import io.requery.android.database.sqlite.SQLiteStatementType;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyList;
import ru.ok.android.api.core.ApiInvocationException;
import ru.ok.android.api.json.JsonToken;

/* compiled from: CatalogBlockMapper.kt */
/* loaded from: classes16.dex */
public final class z1a {

    /* compiled from: CatalogBlockMapper.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;

        static {
            int[] iArr = new int[CatalogBlockDataTypeDto.values().length];
            try {
                iArr[CatalogBlockDataTypeDto.PLACEHOLDER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CatalogBlockDataTypeDto.CATALOG_USERS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CatalogBlockDataTypeDto.MUSIC_AUDIOS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[CatalogBlockDataTypeDto.MUSIC_PLAYLISTS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[CatalogBlockDataTypeDto.NAVIGATION_TABS.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[CatalogBlockDataTypeDto.LINKS.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[CatalogBlockDataTypeDto.CATALOG_BANNERS.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[CatalogBlockDataTypeDto.GROUPS.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[CatalogBlockDataTypeDto.MARKET_ITEMS.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[CatalogBlockDataTypeDto.GROUPS_ALL_GROUPS_OR_RECOMMENDATIONS.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[CatalogBlockDataTypeDto.GROUPS_ITEMS.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[CatalogBlockDataTypeDto.GROUPS_BANNER_ITEMS.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[CatalogBlockDataTypeDto.PODCAST_BANNERS_SLIDER.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[CatalogBlockDataTypeDto.GROUPS_INVITES.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[CatalogBlockDataTypeDto.GROUPS_COLLECTION.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr[CatalogBlockDataTypeDto.GROUPS_INFO_ITEMS.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr[CatalogBlockDataTypeDto.MINI_APPS.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr[CatalogBlockDataTypeDto.MUSIC_RECOMMENDED_PLAYLISTS.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr[CatalogBlockDataTypeDto.AUDIO_FOLLOWINGS_UPDATE_INFO.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr[CatalogBlockDataTypeDto.MUSIC_OWNERS.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr[CatalogBlockDataTypeDto.ARTIST.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                iArr[CatalogBlockDataTypeDto.CURATOR.ordinal()] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                iArr[CatalogBlockDataTypeDto.PODCASTS.ordinal()] = 23;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                iArr[CatalogBlockDataTypeDto.PODCAST_EPISODES.ordinal()] = 24;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                iArr[CatalogBlockDataTypeDto.PODCAST_SLIDER_ITEMS.ordinal()] = 25;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                iArr[CatalogBlockDataTypeDto.AUDIO_BOOKS.ordinal()] = 26;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                iArr[CatalogBlockDataTypeDto.AUDIO_BOOKS_PERSONS.ordinal()] = 27;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                iArr[CatalogBlockDataTypeDto.AUDIO_STREAM_MIXES.ordinal()] = 28;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                iArr[CatalogBlockDataTypeDto.FRIENDS_LIKED_EPISODES.ordinal()] = 29;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                iArr[CatalogBlockDataTypeDto.RADIOSTATIONS.ordinal()] = 30;
            } catch (NoSuchFieldError unused30) {
            }
            try {
                iArr[CatalogBlockDataTypeDto.AUDIO_FOLLOWINGS_UPDATE_ITEM.ordinal()] = 31;
            } catch (NoSuchFieldError unused31) {
            }
            try {
                iArr[CatalogBlockDataTypeDto.AUDIO_SIGNAL_COMMON_INFO.ordinal()] = 32;
            } catch (NoSuchFieldError unused32) {
            }
            try {
                iArr[CatalogBlockDataTypeDto.GAMES.ordinal()] = 33;
            } catch (NoSuchFieldError unused33) {
            }
            try {
                iArr[CatalogBlockDataTypeDto.GROUPS_CATEGORY_ITEMS.ordinal()] = 34;
            } catch (NoSuchFieldError unused34) {
            }
            try {
                iArr[CatalogBlockDataTypeDto.AUDIO_SEARCH_RECENTS.ordinal()] = 35;
            } catch (NoSuchFieldError unused35) {
            }
            try {
                iArr[CatalogBlockDataTypeDto.SEARCH_SUGGESTIONS.ordinal()] = 36;
            } catch (NoSuchFieldError unused36) {
            }
            try {
                iArr[CatalogBlockDataTypeDto.CATALOG_SEARCH_SUGGESTION.ordinal()] = 37;
            } catch (NoSuchFieldError unused37) {
            }
            try {
                iArr[CatalogBlockDataTypeDto.SEARCH_AUTHORS.ordinal()] = 38;
            } catch (NoSuchFieldError unused38) {
            }
            try {
                iArr[CatalogBlockDataTypeDto.SEARCH_WALL_ITEMS.ordinal()] = 39;
            } catch (NoSuchFieldError unused39) {
            }
            try {
                iArr[CatalogBlockDataTypeDto.VIDEOS.ordinal()] = 40;
            } catch (NoSuchFieldError unused40) {
            }
            try {
                iArr[CatalogBlockDataTypeDto.SEARCH_SPELLCHECKER.ordinal()] = 41;
            } catch (NoSuchFieldError unused41) {
            }
            try {
                iArr[CatalogBlockDataTypeDto.MINI_APPS_CONTENT.ordinal()] = 42;
            } catch (NoSuchFieldError unused42) {
            }
            try {
                iArr[CatalogBlockDataTypeDto.STICKERS_PACKS.ordinal()] = 43;
            } catch (NoSuchFieldError unused43) {
            }
            try {
                iArr[CatalogBlockDataTypeDto.SHORT_VIDEO_AUDIOS.ordinal()] = 44;
            } catch (NoSuchFieldError unused44) {
            }
            try {
                iArr[CatalogBlockDataTypeDto.NEWSFEED_ITEMS.ordinal()] = 45;
            } catch (NoSuchFieldError unused45) {
            }
            try {
                iArr[CatalogBlockDataTypeDto.MARKET_INFO.ordinal()] = 46;
            } catch (NoSuchFieldError unused46) {
            }
            try {
                iArr[CatalogBlockDataTypeDto.CONCERTS.ordinal()] = 47;
            } catch (NoSuchFieldError unused47) {
            }
            try {
                iArr[CatalogBlockDataTypeDto.ARTIST_VIDEOS.ordinal()] = 48;
            } catch (NoSuchFieldError unused48) {
            }
            try {
                iArr[CatalogBlockDataTypeDto.ALBUMS.ordinal()] = 49;
            } catch (NoSuchFieldError unused49) {
            }
            try {
                iArr[CatalogBlockDataTypeDto.MARKET_SUBCATEGORIES_MENU.ordinal()] = 50;
            } catch (NoSuchFieldError unused50) {
            }
            try {
                iArr[CatalogBlockDataTypeDto.ACTION.ordinal()] = 51;
            } catch (NoSuchFieldError unused51) {
            }
            try {
                iArr[CatalogBlockDataTypeDto.EMPTY.ordinal()] = 52;
            } catch (NoSuchFieldError unused52) {
            }
            try {
                iArr[CatalogBlockDataTypeDto.VIDEO_SHOWCASE_VKLIVE_CATEGORIES_ITEMS.ordinal()] = 53;
            } catch (NoSuchFieldError unused53) {
            }
            try {
                iArr[CatalogBlockDataTypeDto.COMMUNITY_CHANNELS.ordinal()] = 54;
            } catch (NoSuchFieldError unused54) {
            }
            try {
                iArr[CatalogBlockDataTypeDto.AUDIO_CONTENT_CARDS.ordinal()] = 55;
            } catch (NoSuchFieldError unused55) {
            }
            try {
                iArr[CatalogBlockDataTypeDto.TV_CHANNELS.ordinal()] = 56;
            } catch (NoSuchFieldError unused56) {
            }
            try {
                iArr[CatalogBlockDataTypeDto.TEXTS.ordinal()] = 57;
            } catch (NoSuchFieldError unused57) {
            }
            try {
                iArr[CatalogBlockDataTypeDto.SEARCH_FILTER.ordinal()] = 58;
            } catch (NoSuchFieldError unused58) {
            }
            try {
                iArr[CatalogBlockDataTypeDto.SEARCH_SEO_PAGE.ordinal()] = 59;
            } catch (NoSuchFieldError unused59) {
            }
            try {
                iArr[CatalogBlockDataTypeDto.BASE_LINKS.ordinal()] = 60;
            } catch (NoSuchFieldError unused60) {
            }
            try {
                iArr[CatalogBlockDataTypeDto.MARKET_ORDERS.ordinal()] = 61;
            } catch (NoSuchFieldError unused61) {
            }
            try {
                iArr[CatalogBlockDataTypeDto.CLASSIFIEDS_CITIES.ordinal()] = 62;
            } catch (NoSuchFieldError unused62) {
            }
            try {
                iArr[CatalogBlockDataTypeDto.LONGREADS.ordinal()] = 63;
            } catch (NoSuchFieldError unused63) {
            }
            try {
                iArr[CatalogBlockDataTypeDto.AUDIO_SEARCH_SUGGESTIONS.ordinal()] = 64;
            } catch (NoSuchFieldError unused64) {
            }
            try {
                iArr[CatalogBlockDataTypeDto.PODCASTS_SLIDER_ITEMS.ordinal()] = 65;
            } catch (NoSuchFieldError unused65) {
            }
            try {
                iArr[CatalogBlockDataTypeDto.EXTENDED_PODCASTS.ordinal()] = 66;
            } catch (NoSuchFieldError unused66) {
            }
            try {
                iArr[CatalogBlockDataTypeDto.OWNERS.ordinal()] = 67;
            } catch (NoSuchFieldError unused67) {
            }
            try {
                iArr[CatalogBlockDataTypeDto.CATALOG_AD_BLOCKS.ordinal()] = 68;
            } catch (NoSuchFieldError unused68) {
            }
            try {
                iArr[CatalogBlockDataTypeDto.FEEDBACKS.ordinal()] = 69;
            } catch (NoSuchFieldError unused69) {
            }
            try {
                iArr[CatalogBlockDataTypeDto.VIDEO_SHOWCASE_GALLERIES.ordinal()] = 70;
            } catch (NoSuchFieldError unused70) {
            }
            try {
                iArr[CatalogBlockDataTypeDto.SHORT_VIDEOS.ordinal()] = 71;
            } catch (NoSuchFieldError unused71) {
            }
            try {
                iArr[CatalogBlockDataTypeDto.VIDEO_MUSIC_STREAM_MIXES.ordinal()] = 72;
            } catch (NoSuchFieldError unused72) {
            }
            try {
                iArr[CatalogBlockDataTypeDto.NONE.ordinal()] = 73;
            } catch (NoSuchFieldError unused73) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[CatalogSearchRecentDto.EntityTypeDto.values().length];
            try {
                iArr2[CatalogSearchRecentDto.EntityTypeDto.AUDIO.ordinal()] = 1;
            } catch (NoSuchFieldError unused74) {
            }
            try {
                iArr2[CatalogSearchRecentDto.EntityTypeDto.ALBUM.ordinal()] = 2;
            } catch (NoSuchFieldError unused75) {
            }
            try {
                iArr2[CatalogSearchRecentDto.EntityTypeDto.PLAYLIST.ordinal()] = 3;
            } catch (NoSuchFieldError unused76) {
            }
            try {
                iArr2[CatalogSearchRecentDto.EntityTypeDto.FOUND_BY_LYRICS.ordinal()] = 4;
            } catch (NoSuchFieldError unused77) {
            }
            try {
                iArr2[CatalogSearchRecentDto.EntityTypeDto.ARTIST.ordinal()] = 5;
            } catch (NoSuchFieldError unused78) {
            }
            try {
                iArr2[CatalogSearchRecentDto.EntityTypeDto.PODCAST.ordinal()] = 6;
            } catch (NoSuchFieldError unused79) {
            }
            try {
                iArr2[CatalogSearchRecentDto.EntityTypeDto.RADIO.ordinal()] = 7;
            } catch (NoSuchFieldError unused80) {
            }
            try {
                iArr2[CatalogSearchRecentDto.EntityTypeDto.AUDIOBOOK.ordinal()] = 8;
            } catch (NoSuchFieldError unused81) {
            }
            try {
                iArr2[CatalogSearchRecentDto.EntityTypeDto.VIDEO.ordinal()] = 9;
            } catch (NoSuchFieldError unused82) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[CatalogBlockDto.SubtypeDto.values().length];
            try {
                iArr3[CatalogBlockDto.SubtypeDto.DEFAULT.ordinal()] = 1;
            } catch (NoSuchFieldError unused83) {
            }
            try {
                iArr3[CatalogBlockDto.SubtypeDto.DONUT.ordinal()] = 2;
            } catch (NoSuchFieldError unused84) {
            }
            $EnumSwitchMapping$2 = iArr3;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0821  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x07b0  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x07d2  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0516  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x07cf  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x06ae  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0534 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0694  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x05ea  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x058d  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x055d A[LOOP:9: B:196:0x0557->B:198:0x055d, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0575  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x04fb A[LOOP:10: B:203:0x04f5->B:205:0x04fb, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0587  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x05e2  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x063d  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x06a6  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0729 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x07dd  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x07e9  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x04bb  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0824  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x083b  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0854  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x04e2 A[ADDED_TO_REGION] */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v18, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r1v19, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v38 */
    /* JADX WARN: Type inference failed for: r1v39 */
    /* JADX WARN: Type inference failed for: r1v40 */
    /* JADX WARN: Type inference failed for: r1v42, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r1v43, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v45 */
    /* JADX WARN: Type inference failed for: r1v46 */
    /* JADX WARN: Type inference failed for: r1v47 */
    /* JADX WARN: Type inference failed for: r1v49, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r1v50, types: [java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final CatalogBlockItemsData a(CatalogBlockDto catalogBlockDto) {
        List<String> i2;
        ArrayList arrayList;
        SearchHistoryModel.Type type;
        String a2;
        List<CatalogGroupsItemDto> V0;
        int i;
        Iterator it;
        LinkedHashMap linkedHashMap;
        List<CatalogEntityGroupsItemDto> w0;
        int i3;
        Iterator it2;
        LinkedHashMap linkedHashMap2;
        CatalogBlockDataTypeDto l0;
        LinkedHashMap linkedHashMap3;
        CatalogBlockDataTypeDto l02;
        LinkedHashMap linkedHashMap4;
        CatalogBlockDataTypeDto l03;
        LinkedHashMap linkedHashMap5;
        CatalogBlockDataTypeDto l04;
        LinkedHashMap linkedHashMap6;
        int i4;
        List<String> P0;
        ?? r1;
        ArrayList arrayList2;
        List<CatalogChannelsItemDto> T;
        Map map;
        List<CatalogRecomPlaylistRelationDto> M;
        ?? r12;
        ?? r13;
        String str = "";
        switch (a.$EnumSwitchMapping$0[catalogBlockDto.l0().ordinal()]) {
            case 1:
                i2 = catalogBlockDto.i2();
                if (i2 == null) {
                    i2 = EmptyList.b;
                }
                CatalogDataType a3 = a4a.a(catalogBlockDto.l0());
                ArrayList arrayList3 = new ArrayList(i2);
                CatalogBlockDataTypeDto l05 = catalogBlockDto.l0();
                V0 = catalogBlockDto.V0();
                i = a.$EnumSwitchMapping$0[l05.ordinal()];
                if ((i != 10 || i == 11 || i == 15) && V0 != null) {
                    LinkedHashMap linkedHashMap7 = new LinkedHashMap();
                    it = V0.iterator();
                    while (it.hasNext()) {
                        GroupCatalogItem o = x1o0.o((CatalogGroupsItemDto) it.next());
                        linkedHashMap7.put(String.valueOf(o.b), o);
                    }
                    linkedHashMap = new LinkedHashMap(linkedHashMap7);
                } else {
                    linkedHashMap = null;
                }
                if (linkedHashMap == null) {
                    linkedHashMap = new LinkedHashMap();
                }
                CatalogBlockDataTypeDto l06 = catalogBlockDto.l0();
                w0 = catalogBlockDto.w0();
                hpu hpuVar = new hpu();
                i3 = a.$EnumSwitchMapping$0[l06.ordinal()];
                if ((i3 != 15 || i3 == 34) && w0 != null) {
                    a2a a2aVar = new a2a(1, hpuVar, hpu.class, "map", "map(Lcom/vk/api/generated/catalog/dto/CatalogEntityGroupsItemDto;)Lcom/vk/dto/group/GroupsEntityCatalogItem;", 0, 0);
                    LinkedHashMap linkedHashMap8 = new LinkedHashMap();
                    it2 = w0.iterator();
                    while (it2.hasNext()) {
                        Object invoke = a2aVar.invoke(it2.next());
                        linkedHashMap8.put(((GroupsEntityCatalogItem) invoke).b, invoke);
                    }
                    linkedHashMap2 = new LinkedHashMap(linkedHashMap8);
                } else {
                    linkedHashMap2 = null;
                }
                if (linkedHashMap2 == null) {
                    linkedHashMap2 = new LinkedHashMap();
                }
                LinkedHashMap linkedHashMap9 = linkedHashMap2;
                l0 = catalogBlockDto.l0();
                List<CatalogSearchAuthorItemDto> y2 = catalogBlockDto.y2();
                if (l0 == CatalogBlockDataTypeDto.SEARCH_AUTHORS) {
                    linkedHashMap3 = new LinkedHashMap();
                } else {
                    if (y2 == null) {
                        y2 = EmptyList.b;
                    }
                    linkedHashMap3 = new LinkedHashMap();
                    for (CatalogSearchAuthorItemDto catalogSearchAuthorItemDto : y2) {
                        String valueOf = String.valueOf(catalogSearchAuthorItemDto.e());
                        long e = catalogSearchAuthorItemDto.e();
                        String r = catalogSearchAuthorItemDto.r();
                        CatalogSearchAuthorItemDto.ContentTypeDto d = catalogSearchAuthorItemDto.d();
                        linkedHashMap3.put(valueOf, new SearchAuthorItem(e, r, d != null ? d.i() : null, catalogSearchAuthorItemDto.getDescription(), catalogSearchAuthorItemDto.f()));
                    }
                }
                l02 = catalogBlockDto.l0();
                List<CatalogGameItemDto> H0 = catalogBlockDto.H0();
                if (l02 == CatalogBlockDataTypeDto.GAMES) {
                    linkedHashMap4 = new LinkedHashMap();
                } else {
                    if (H0 == null) {
                        H0 = EmptyList.b;
                    }
                    linkedHashMap4 = new LinkedHashMap();
                    for (CatalogGameItemDto catalogGameItemDto : H0) {
                        linkedHashMap4.put(String.valueOf(catalogGameItemDto.d().b), new CatalogMiniAppItem(catalogGameItemDto.d().b, catalogGameItemDto.r(), CatalogMiniAppItem.AppType.GAME));
                        str = str;
                    }
                }
                String str2 = str;
                l03 = catalogBlockDto.l0();
                List<CatalogGroupCategoryMetaItemDto> N0 = catalogBlockDto.N0();
                t2a t2aVar = new t2a();
                if (l03 != CatalogBlockDataTypeDto.GROUPS_CATEGORY_ITEMS) {
                    if (N0 == null) {
                        N0 = EmptyList.b;
                    }
                    List<CatalogGroupCategoryMetaItemDto> list = N0;
                    int e2 = on00.e(c5g.u(list, 10));
                    if (e2 < 16) {
                        e2 = 16;
                    }
                    LinkedHashMap linkedHashMap10 = new LinkedHashMap(e2);
                    for (CatalogGroupCategoryMetaItemDto catalogGroupCategoryMetaItemDto : list) {
                        String valueOf2 = String.valueOf(catalogGroupCategoryMetaItemDto.getId());
                        String id = catalogGroupCategoryMetaItemDto.getId();
                        linkedHashMap10.put(valueOf2, new CatalogGroupCategoryItem(id == null ? str2 : id, t2aVar.c(catalogGroupCategoryMetaItemDto.d())));
                    }
                    linkedHashMap5 = new LinkedHashMap(p4g.h(linkedHashMap10));
                } else {
                    linkedHashMap5 = new LinkedHashMap();
                }
                LinkedHashMap linkedHashMap11 = linkedHashMap5;
                l04 = catalogBlockDto.l0();
                List<CatalogMiniAppContentItemDto> E1 = catalogBlockDto.E1();
                if (l04 == CatalogBlockDataTypeDto.MINI_APPS_CONTENT) {
                    linkedHashMap6 = new LinkedHashMap();
                } else {
                    if (E1 == null) {
                        E1 = EmptyList.b;
                    }
                    linkedHashMap6 = new LinkedHashMap();
                    for (CatalogMiniAppContentItemDto catalogMiniAppContentItemDto : E1) {
                        String id2 = catalogMiniAppContentItemDto.getId();
                        if (id2 == null) {
                            id2 = str2;
                        }
                        String id3 = catalogMiniAppContentItemDto.getId();
                        String str3 = id3 == null ? str2 : id3;
                        long d2 = catalogMiniAppContentItemDto.d();
                        String title = catalogMiniAppContentItemDto.getTitle();
                        String str4 = title == null ? str2 : title;
                        String f = catalogMiniAppContentItemDto.f();
                        String str5 = f == null ? str2 : f;
                        String r2 = catalogMiniAppContentItemDto.r();
                        String str6 = r2 == null ? str2 : r2;
                        String url = catalogMiniAppContentItemDto.getUrl();
                        linkedHashMap6.put(id2, new AppContent(str3, d2, str4, str5, str6, url == null ? str2 : url, catalogMiniAppContentItemDto.e()));
                    }
                }
                LinkedHashMap linkedHashMap12 = linkedHashMap6;
                i4 = a.$EnumSwitchMapping$0[catalogBlockDto.l0().ordinal()];
                if (i4 != 10 || i4 == 11) {
                    P0 = catalogBlockDto.P0();
                    if (P0 == null) {
                        List<String> list2 = P0;
                        r1 = new ArrayList(c5g.u(list2, 10));
                        Iterator it3 = list2.iterator();
                        while (it3.hasNext()) {
                            r1.add((String) it3.next());
                        }
                    } else {
                        r1 = 0;
                    }
                    if (r1 == 0) {
                        r1 = EmptyList.b;
                    }
                    arrayList2 = new ArrayList((Collection) r1);
                } else {
                    if (i4 != 15) {
                        if (i4 == 21) {
                            List<UserId> S0 = catalogBlockDto.S0();
                            if (S0 != null) {
                                List<UserId> list3 = S0;
                                r13 = new ArrayList(c5g.u(list3, 10));
                                Iterator it4 = list3.iterator();
                                while (it4.hasNext()) {
                                    r13.add(String.valueOf(((UserId) it4.next()).b));
                                }
                            } else {
                                r13 = 0;
                            }
                            if (r13 == 0) {
                                r13 = EmptyList.b;
                            }
                            arrayList2 = new ArrayList((Collection) r13);
                        } else if (i4 != 34) {
                            arrayList2 = null;
                        }
                    }
                    List<CatalogEntityGroupsItemDto> w02 = catalogBlockDto.w0();
                    if (w02 != null) {
                        List<CatalogEntityGroupsItemDto> list4 = w02;
                        r12 = new ArrayList(c5g.u(list4, 10));
                        Iterator it5 = list4.iterator();
                        while (it5.hasNext()) {
                            String id4 = ((CatalogEntityGroupsItemDto) it5.next()).getId();
                            if (id4 == null) {
                                id4 = str2;
                            }
                            r12.add(id4);
                        }
                    } else {
                        r12 = 0;
                    }
                    if (r12 == 0) {
                        r12 = EmptyList.b;
                    }
                    arrayList2 = new ArrayList((Collection) r12);
                }
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList();
                }
                ArrayList arrayList4 = arrayList2;
                T = catalogBlockDto.T();
                if (T == null) {
                    List<CatalogChannelsItemDto> list5 = T;
                    int e3 = on00.e(c5g.u(list5, 10));
                    if (e3 < 16) {
                        e3 = 16;
                    }
                    map = new LinkedHashMap(e3);
                    for (CatalogChannelsItemDto catalogChannelsItemDto : list5) {
                        Long valueOf3 = Long.valueOf(catalogChannelsItemDto.d());
                        String r3 = catalogChannelsItemDto.r();
                        if (r3 == null) {
                            r3 = str2;
                        }
                        map.put(valueOf3, r3);
                    }
                } else {
                    map = null;
                }
                if (map == null) {
                    map = jgp.b;
                }
                LinkedHashMap linkedHashMap13 = new LinkedHashMap(map);
                CatalogBlockDataTypeDto l07 = catalogBlockDto.l0();
                M = catalogBlockDto.M();
                LinkedHashMap linkedHashMap14 = new LinkedHashMap();
                if (M != null && l07 == CatalogBlockDataTypeDto.MUSIC_PLAYLISTS && !M.isEmpty()) {
                    for (CatalogRecomPlaylistRelationDto catalogRecomPlaylistRelationDto : M) {
                        String e4 = catalogRecomPlaylistRelationDto.e();
                        List<String> d3 = catalogRecomPlaylistRelationDto.d();
                        if (e4 != null && d3 != null) {
                        }
                    }
                }
                return new CatalogBlockItemsData(a3, arrayList3, linkedHashMap, linkedHashMap3, linkedHashMap4, linkedHashMap9, linkedHashMap11, linkedHashMap12, arrayList4, linkedHashMap13, null, linkedHashMap14, 1024, null);
            case 2:
                i2 = catalogBlockDto.R();
                if (i2 == null) {
                }
                CatalogDataType a32 = a4a.a(catalogBlockDto.l0());
                ArrayList arrayList32 = new ArrayList(i2);
                CatalogBlockDataTypeDto l052 = catalogBlockDto.l0();
                V0 = catalogBlockDto.V0();
                i = a.$EnumSwitchMapping$0[l052.ordinal()];
                if (i != 10) {
                }
                LinkedHashMap linkedHashMap72 = new LinkedHashMap();
                it = V0.iterator();
                while (it.hasNext()) {
                }
                linkedHashMap = new LinkedHashMap(linkedHashMap72);
                if (linkedHashMap == null) {
                }
                CatalogBlockDataTypeDto l062 = catalogBlockDto.l0();
                w0 = catalogBlockDto.w0();
                hpu hpuVar2 = new hpu();
                i3 = a.$EnumSwitchMapping$0[l062.ordinal()];
                if (i3 != 15) {
                }
                a2a a2aVar2 = new a2a(1, hpuVar2, hpu.class, "map", "map(Lcom/vk/api/generated/catalog/dto/CatalogEntityGroupsItemDto;)Lcom/vk/dto/group/GroupsEntityCatalogItem;", 0, 0);
                LinkedHashMap linkedHashMap82 = new LinkedHashMap();
                it2 = w0.iterator();
                while (it2.hasNext()) {
                }
                linkedHashMap2 = new LinkedHashMap(linkedHashMap82);
                if (linkedHashMap2 == null) {
                }
                LinkedHashMap linkedHashMap92 = linkedHashMap2;
                l0 = catalogBlockDto.l0();
                List<CatalogSearchAuthorItemDto> y22 = catalogBlockDto.y2();
                if (l0 == CatalogBlockDataTypeDto.SEARCH_AUTHORS) {
                }
                l02 = catalogBlockDto.l0();
                List<CatalogGameItemDto> H02 = catalogBlockDto.H0();
                if (l02 == CatalogBlockDataTypeDto.GAMES) {
                }
                String str22 = str;
                l03 = catalogBlockDto.l0();
                List<CatalogGroupCategoryMetaItemDto> N02 = catalogBlockDto.N0();
                t2a t2aVar2 = new t2a();
                if (l03 != CatalogBlockDataTypeDto.GROUPS_CATEGORY_ITEMS) {
                }
                LinkedHashMap linkedHashMap112 = linkedHashMap5;
                l04 = catalogBlockDto.l0();
                List<CatalogMiniAppContentItemDto> E12 = catalogBlockDto.E1();
                if (l04 == CatalogBlockDataTypeDto.MINI_APPS_CONTENT) {
                }
                LinkedHashMap linkedHashMap122 = linkedHashMap6;
                i4 = a.$EnumSwitchMapping$0[catalogBlockDto.l0().ordinal()];
                if (i4 != 10) {
                }
                P0 = catalogBlockDto.P0();
                if (P0 == null) {
                }
                if (r1 == 0) {
                }
                arrayList2 = new ArrayList((Collection) r1);
                if (arrayList2 == null) {
                }
                ArrayList arrayList42 = arrayList2;
                T = catalogBlockDto.T();
                if (T == null) {
                }
                if (map == null) {
                }
                LinkedHashMap linkedHashMap132 = new LinkedHashMap(map);
                CatalogBlockDataTypeDto l072 = catalogBlockDto.l0();
                M = catalogBlockDto.M();
                LinkedHashMap linkedHashMap142 = new LinkedHashMap();
                if (M != null) {
                    while (r0.hasNext()) {
                    }
                    break;
                }
                return new CatalogBlockItemsData(a32, arrayList32, linkedHashMap, linkedHashMap3, linkedHashMap4, linkedHashMap92, linkedHashMap112, linkedHashMap122, arrayList42, linkedHashMap132, null, linkedHashMap142, 1024, null);
            case 3:
                i2 = catalogBlockDto.C();
                if (i2 == null) {
                }
                CatalogDataType a322 = a4a.a(catalogBlockDto.l0());
                ArrayList arrayList322 = new ArrayList(i2);
                CatalogBlockDataTypeDto l0522 = catalogBlockDto.l0();
                V0 = catalogBlockDto.V0();
                i = a.$EnumSwitchMapping$0[l0522.ordinal()];
                if (i != 10) {
                }
                LinkedHashMap linkedHashMap722 = new LinkedHashMap();
                it = V0.iterator();
                while (it.hasNext()) {
                }
                linkedHashMap = new LinkedHashMap(linkedHashMap722);
                if (linkedHashMap == null) {
                }
                CatalogBlockDataTypeDto l0622 = catalogBlockDto.l0();
                w0 = catalogBlockDto.w0();
                hpu hpuVar22 = new hpu();
                i3 = a.$EnumSwitchMapping$0[l0622.ordinal()];
                if (i3 != 15) {
                }
                a2a a2aVar22 = new a2a(1, hpuVar22, hpu.class, "map", "map(Lcom/vk/api/generated/catalog/dto/CatalogEntityGroupsItemDto;)Lcom/vk/dto/group/GroupsEntityCatalogItem;", 0, 0);
                LinkedHashMap linkedHashMap822 = new LinkedHashMap();
                it2 = w0.iterator();
                while (it2.hasNext()) {
                }
                linkedHashMap2 = new LinkedHashMap(linkedHashMap822);
                if (linkedHashMap2 == null) {
                }
                LinkedHashMap linkedHashMap922 = linkedHashMap2;
                l0 = catalogBlockDto.l0();
                List<CatalogSearchAuthorItemDto> y222 = catalogBlockDto.y2();
                if (l0 == CatalogBlockDataTypeDto.SEARCH_AUTHORS) {
                }
                l02 = catalogBlockDto.l0();
                List<CatalogGameItemDto> H022 = catalogBlockDto.H0();
                if (l02 == CatalogBlockDataTypeDto.GAMES) {
                }
                String str222 = str;
                l03 = catalogBlockDto.l0();
                List<CatalogGroupCategoryMetaItemDto> N022 = catalogBlockDto.N0();
                t2a t2aVar22 = new t2a();
                if (l03 != CatalogBlockDataTypeDto.GROUPS_CATEGORY_ITEMS) {
                }
                LinkedHashMap linkedHashMap1122 = linkedHashMap5;
                l04 = catalogBlockDto.l0();
                List<CatalogMiniAppContentItemDto> E122 = catalogBlockDto.E1();
                if (l04 == CatalogBlockDataTypeDto.MINI_APPS_CONTENT) {
                }
                LinkedHashMap linkedHashMap1222 = linkedHashMap6;
                i4 = a.$EnumSwitchMapping$0[catalogBlockDto.l0().ordinal()];
                if (i4 != 10) {
                }
                P0 = catalogBlockDto.P0();
                if (P0 == null) {
                }
                if (r1 == 0) {
                }
                arrayList2 = new ArrayList((Collection) r1);
                if (arrayList2 == null) {
                }
                ArrayList arrayList422 = arrayList2;
                T = catalogBlockDto.T();
                if (T == null) {
                }
                if (map == null) {
                }
                LinkedHashMap linkedHashMap1322 = new LinkedHashMap(map);
                CatalogBlockDataTypeDto l0722 = catalogBlockDto.l0();
                M = catalogBlockDto.M();
                LinkedHashMap linkedHashMap1422 = new LinkedHashMap();
                if (M != null) {
                }
                return new CatalogBlockItemsData(a322, arrayList322, linkedHashMap, linkedHashMap3, linkedHashMap4, linkedHashMap922, linkedHashMap1122, linkedHashMap1222, arrayList422, linkedHashMap1322, null, linkedHashMap1422, 1024, null);
            case 4:
                i2 = catalogBlockDto.l2();
                if (i2 == null) {
                }
                CatalogDataType a3222 = a4a.a(catalogBlockDto.l0());
                ArrayList arrayList3222 = new ArrayList(i2);
                CatalogBlockDataTypeDto l05222 = catalogBlockDto.l0();
                V0 = catalogBlockDto.V0();
                i = a.$EnumSwitchMapping$0[l05222.ordinal()];
                if (i != 10) {
                }
                LinkedHashMap linkedHashMap7222 = new LinkedHashMap();
                it = V0.iterator();
                while (it.hasNext()) {
                }
                linkedHashMap = new LinkedHashMap(linkedHashMap7222);
                if (linkedHashMap == null) {
                }
                CatalogBlockDataTypeDto l06222 = catalogBlockDto.l0();
                w0 = catalogBlockDto.w0();
                hpu hpuVar222 = new hpu();
                i3 = a.$EnumSwitchMapping$0[l06222.ordinal()];
                if (i3 != 15) {
                }
                a2a a2aVar222 = new a2a(1, hpuVar222, hpu.class, "map", "map(Lcom/vk/api/generated/catalog/dto/CatalogEntityGroupsItemDto;)Lcom/vk/dto/group/GroupsEntityCatalogItem;", 0, 0);
                LinkedHashMap linkedHashMap8222 = new LinkedHashMap();
                it2 = w0.iterator();
                while (it2.hasNext()) {
                }
                linkedHashMap2 = new LinkedHashMap(linkedHashMap8222);
                if (linkedHashMap2 == null) {
                }
                LinkedHashMap linkedHashMap9222 = linkedHashMap2;
                l0 = catalogBlockDto.l0();
                List<CatalogSearchAuthorItemDto> y2222 = catalogBlockDto.y2();
                if (l0 == CatalogBlockDataTypeDto.SEARCH_AUTHORS) {
                }
                l02 = catalogBlockDto.l0();
                List<CatalogGameItemDto> H0222 = catalogBlockDto.H0();
                if (l02 == CatalogBlockDataTypeDto.GAMES) {
                }
                String str2222 = str;
                l03 = catalogBlockDto.l0();
                List<CatalogGroupCategoryMetaItemDto> N0222 = catalogBlockDto.N0();
                t2a t2aVar222 = new t2a();
                if (l03 != CatalogBlockDataTypeDto.GROUPS_CATEGORY_ITEMS) {
                }
                LinkedHashMap linkedHashMap11222 = linkedHashMap5;
                l04 = catalogBlockDto.l0();
                List<CatalogMiniAppContentItemDto> E1222 = catalogBlockDto.E1();
                if (l04 == CatalogBlockDataTypeDto.MINI_APPS_CONTENT) {
                }
                LinkedHashMap linkedHashMap12222 = linkedHashMap6;
                i4 = a.$EnumSwitchMapping$0[catalogBlockDto.l0().ordinal()];
                if (i4 != 10) {
                }
                P0 = catalogBlockDto.P0();
                if (P0 == null) {
                }
                if (r1 == 0) {
                }
                arrayList2 = new ArrayList((Collection) r1);
                if (arrayList2 == null) {
                }
                ArrayList arrayList4222 = arrayList2;
                T = catalogBlockDto.T();
                if (T == null) {
                }
                if (map == null) {
                }
                LinkedHashMap linkedHashMap13222 = new LinkedHashMap(map);
                CatalogBlockDataTypeDto l07222 = catalogBlockDto.l0();
                M = catalogBlockDto.M();
                LinkedHashMap linkedHashMap14222 = new LinkedHashMap();
                if (M != null) {
                }
                return new CatalogBlockItemsData(a3222, arrayList3222, linkedHashMap, linkedHashMap3, linkedHashMap4, linkedHashMap9222, linkedHashMap11222, linkedHashMap12222, arrayList4222, linkedHashMap13222, null, linkedHashMap14222, 1024, null);
            case 5:
                i2 = catalogBlockDto.R1();
                if (i2 == null) {
                }
                CatalogDataType a32222 = a4a.a(catalogBlockDto.l0());
                ArrayList arrayList32222 = new ArrayList(i2);
                CatalogBlockDataTypeDto l052222 = catalogBlockDto.l0();
                V0 = catalogBlockDto.V0();
                i = a.$EnumSwitchMapping$0[l052222.ordinal()];
                if (i != 10) {
                }
                LinkedHashMap linkedHashMap72222 = new LinkedHashMap();
                it = V0.iterator();
                while (it.hasNext()) {
                }
                linkedHashMap = new LinkedHashMap(linkedHashMap72222);
                if (linkedHashMap == null) {
                }
                CatalogBlockDataTypeDto l062222 = catalogBlockDto.l0();
                w0 = catalogBlockDto.w0();
                hpu hpuVar2222 = new hpu();
                i3 = a.$EnumSwitchMapping$0[l062222.ordinal()];
                if (i3 != 15) {
                }
                a2a a2aVar2222 = new a2a(1, hpuVar2222, hpu.class, "map", "map(Lcom/vk/api/generated/catalog/dto/CatalogEntityGroupsItemDto;)Lcom/vk/dto/group/GroupsEntityCatalogItem;", 0, 0);
                LinkedHashMap linkedHashMap82222 = new LinkedHashMap();
                it2 = w0.iterator();
                while (it2.hasNext()) {
                }
                linkedHashMap2 = new LinkedHashMap(linkedHashMap82222);
                if (linkedHashMap2 == null) {
                }
                LinkedHashMap linkedHashMap92222 = linkedHashMap2;
                l0 = catalogBlockDto.l0();
                List<CatalogSearchAuthorItemDto> y22222 = catalogBlockDto.y2();
                if (l0 == CatalogBlockDataTypeDto.SEARCH_AUTHORS) {
                }
                l02 = catalogBlockDto.l0();
                List<CatalogGameItemDto> H02222 = catalogBlockDto.H0();
                if (l02 == CatalogBlockDataTypeDto.GAMES) {
                }
                String str22222 = str;
                l03 = catalogBlockDto.l0();
                List<CatalogGroupCategoryMetaItemDto> N02222 = catalogBlockDto.N0();
                t2a t2aVar2222 = new t2a();
                if (l03 != CatalogBlockDataTypeDto.GROUPS_CATEGORY_ITEMS) {
                }
                LinkedHashMap linkedHashMap112222 = linkedHashMap5;
                l04 = catalogBlockDto.l0();
                List<CatalogMiniAppContentItemDto> E12222 = catalogBlockDto.E1();
                if (l04 == CatalogBlockDataTypeDto.MINI_APPS_CONTENT) {
                }
                LinkedHashMap linkedHashMap122222 = linkedHashMap6;
                i4 = a.$EnumSwitchMapping$0[catalogBlockDto.l0().ordinal()];
                if (i4 != 10) {
                }
                P0 = catalogBlockDto.P0();
                if (P0 == null) {
                }
                if (r1 == 0) {
                }
                arrayList2 = new ArrayList((Collection) r1);
                if (arrayList2 == null) {
                }
                ArrayList arrayList42222 = arrayList2;
                T = catalogBlockDto.T();
                if (T == null) {
                }
                if (map == null) {
                }
                LinkedHashMap linkedHashMap132222 = new LinkedHashMap(map);
                CatalogBlockDataTypeDto l072222 = catalogBlockDto.l0();
                M = catalogBlockDto.M();
                LinkedHashMap linkedHashMap142222 = new LinkedHashMap();
                if (M != null) {
                }
                return new CatalogBlockItemsData(a32222, arrayList32222, linkedHashMap, linkedHashMap3, linkedHashMap4, linkedHashMap92222, linkedHashMap112222, linkedHashMap122222, arrayList42222, linkedHashMap132222, null, linkedHashMap142222, 1024, null);
            case 6:
                i2 = catalogBlockDto.o1();
                if (i2 == null) {
                }
                CatalogDataType a322222 = a4a.a(catalogBlockDto.l0());
                ArrayList arrayList322222 = new ArrayList(i2);
                CatalogBlockDataTypeDto l0522222 = catalogBlockDto.l0();
                V0 = catalogBlockDto.V0();
                i = a.$EnumSwitchMapping$0[l0522222.ordinal()];
                if (i != 10) {
                }
                LinkedHashMap linkedHashMap722222 = new LinkedHashMap();
                it = V0.iterator();
                while (it.hasNext()) {
                }
                linkedHashMap = new LinkedHashMap(linkedHashMap722222);
                if (linkedHashMap == null) {
                }
                CatalogBlockDataTypeDto l0622222 = catalogBlockDto.l0();
                w0 = catalogBlockDto.w0();
                hpu hpuVar22222 = new hpu();
                i3 = a.$EnumSwitchMapping$0[l0622222.ordinal()];
                if (i3 != 15) {
                }
                a2a a2aVar22222 = new a2a(1, hpuVar22222, hpu.class, "map", "map(Lcom/vk/api/generated/catalog/dto/CatalogEntityGroupsItemDto;)Lcom/vk/dto/group/GroupsEntityCatalogItem;", 0, 0);
                LinkedHashMap linkedHashMap822222 = new LinkedHashMap();
                it2 = w0.iterator();
                while (it2.hasNext()) {
                }
                linkedHashMap2 = new LinkedHashMap(linkedHashMap822222);
                if (linkedHashMap2 == null) {
                }
                LinkedHashMap linkedHashMap922222 = linkedHashMap2;
                l0 = catalogBlockDto.l0();
                List<CatalogSearchAuthorItemDto> y222222 = catalogBlockDto.y2();
                if (l0 == CatalogBlockDataTypeDto.SEARCH_AUTHORS) {
                }
                l02 = catalogBlockDto.l0();
                List<CatalogGameItemDto> H022222 = catalogBlockDto.H0();
                if (l02 == CatalogBlockDataTypeDto.GAMES) {
                }
                String str222222 = str;
                l03 = catalogBlockDto.l0();
                List<CatalogGroupCategoryMetaItemDto> N022222 = catalogBlockDto.N0();
                t2a t2aVar22222 = new t2a();
                if (l03 != CatalogBlockDataTypeDto.GROUPS_CATEGORY_ITEMS) {
                }
                LinkedHashMap linkedHashMap1122222 = linkedHashMap5;
                l04 = catalogBlockDto.l0();
                List<CatalogMiniAppContentItemDto> E122222 = catalogBlockDto.E1();
                if (l04 == CatalogBlockDataTypeDto.MINI_APPS_CONTENT) {
                }
                LinkedHashMap linkedHashMap1222222 = linkedHashMap6;
                i4 = a.$EnumSwitchMapping$0[catalogBlockDto.l0().ordinal()];
                if (i4 != 10) {
                }
                P0 = catalogBlockDto.P0();
                if (P0 == null) {
                }
                if (r1 == 0) {
                }
                arrayList2 = new ArrayList((Collection) r1);
                if (arrayList2 == null) {
                }
                ArrayList arrayList422222 = arrayList2;
                T = catalogBlockDto.T();
                if (T == null) {
                }
                if (map == null) {
                }
                LinkedHashMap linkedHashMap1322222 = new LinkedHashMap(map);
                CatalogBlockDataTypeDto l0722222 = catalogBlockDto.l0();
                M = catalogBlockDto.M();
                LinkedHashMap linkedHashMap1422222 = new LinkedHashMap();
                if (M != null) {
                }
                return new CatalogBlockItemsData(a322222, arrayList322222, linkedHashMap, linkedHashMap3, linkedHashMap4, linkedHashMap922222, linkedHashMap1122222, linkedHashMap1222222, arrayList422222, linkedHashMap1322222, null, linkedHashMap1422222, 1024, null);
            case 7:
                List<Integer> K = catalogBlockDto.K();
                if (K != null) {
                    List<Integer> list6 = K;
                    arrayList = new ArrayList(c5g.u(list6, 10));
                    Iterator it6 = list6.iterator();
                    while (it6.hasNext()) {
                        kq.d((Number) it6.next(), arrayList);
                    }
                    i2 = arrayList;
                    if (i2 == null) {
                    }
                    CatalogDataType a3222222 = a4a.a(catalogBlockDto.l0());
                    ArrayList arrayList3222222 = new ArrayList(i2);
                    CatalogBlockDataTypeDto l05222222 = catalogBlockDto.l0();
                    V0 = catalogBlockDto.V0();
                    i = a.$EnumSwitchMapping$0[l05222222.ordinal()];
                    if (i != 10) {
                    }
                    LinkedHashMap linkedHashMap7222222 = new LinkedHashMap();
                    it = V0.iterator();
                    while (it.hasNext()) {
                    }
                    linkedHashMap = new LinkedHashMap(linkedHashMap7222222);
                    if (linkedHashMap == null) {
                    }
                    CatalogBlockDataTypeDto l06222222 = catalogBlockDto.l0();
                    w0 = catalogBlockDto.w0();
                    hpu hpuVar222222 = new hpu();
                    i3 = a.$EnumSwitchMapping$0[l06222222.ordinal()];
                    if (i3 != 15) {
                    }
                    a2a a2aVar222222 = new a2a(1, hpuVar222222, hpu.class, "map", "map(Lcom/vk/api/generated/catalog/dto/CatalogEntityGroupsItemDto;)Lcom/vk/dto/group/GroupsEntityCatalogItem;", 0, 0);
                    LinkedHashMap linkedHashMap8222222 = new LinkedHashMap();
                    it2 = w0.iterator();
                    while (it2.hasNext()) {
                    }
                    linkedHashMap2 = new LinkedHashMap(linkedHashMap8222222);
                    if (linkedHashMap2 == null) {
                    }
                    LinkedHashMap linkedHashMap9222222 = linkedHashMap2;
                    l0 = catalogBlockDto.l0();
                    List<CatalogSearchAuthorItemDto> y2222222 = catalogBlockDto.y2();
                    if (l0 == CatalogBlockDataTypeDto.SEARCH_AUTHORS) {
                    }
                    l02 = catalogBlockDto.l0();
                    List<CatalogGameItemDto> H0222222 = catalogBlockDto.H0();
                    if (l02 == CatalogBlockDataTypeDto.GAMES) {
                    }
                    String str2222222 = str;
                    l03 = catalogBlockDto.l0();
                    List<CatalogGroupCategoryMetaItemDto> N0222222 = catalogBlockDto.N0();
                    t2a t2aVar222222 = new t2a();
                    if (l03 != CatalogBlockDataTypeDto.GROUPS_CATEGORY_ITEMS) {
                    }
                    LinkedHashMap linkedHashMap11222222 = linkedHashMap5;
                    l04 = catalogBlockDto.l0();
                    List<CatalogMiniAppContentItemDto> E1222222 = catalogBlockDto.E1();
                    if (l04 == CatalogBlockDataTypeDto.MINI_APPS_CONTENT) {
                    }
                    LinkedHashMap linkedHashMap12222222 = linkedHashMap6;
                    i4 = a.$EnumSwitchMapping$0[catalogBlockDto.l0().ordinal()];
                    if (i4 != 10) {
                    }
                    P0 = catalogBlockDto.P0();
                    if (P0 == null) {
                    }
                    if (r1 == 0) {
                    }
                    arrayList2 = new ArrayList((Collection) r1);
                    if (arrayList2 == null) {
                    }
                    ArrayList arrayList4222222 = arrayList2;
                    T = catalogBlockDto.T();
                    if (T == null) {
                    }
                    if (map == null) {
                    }
                    LinkedHashMap linkedHashMap13222222 = new LinkedHashMap(map);
                    CatalogBlockDataTypeDto l07222222 = catalogBlockDto.l0();
                    M = catalogBlockDto.M();
                    LinkedHashMap linkedHashMap14222222 = new LinkedHashMap();
                    if (M != null) {
                    }
                    return new CatalogBlockItemsData(a3222222, arrayList3222222, linkedHashMap, linkedHashMap3, linkedHashMap4, linkedHashMap9222222, linkedHashMap11222222, linkedHashMap12222222, arrayList4222222, linkedHashMap13222222, null, linkedHashMap14222222, 1024, null);
                }
                i2 = null;
                if (i2 == null) {
                }
                CatalogDataType a32222222 = a4a.a(catalogBlockDto.l0());
                ArrayList arrayList32222222 = new ArrayList(i2);
                CatalogBlockDataTypeDto l052222222 = catalogBlockDto.l0();
                V0 = catalogBlockDto.V0();
                i = a.$EnumSwitchMapping$0[l052222222.ordinal()];
                if (i != 10) {
                }
                LinkedHashMap linkedHashMap72222222 = new LinkedHashMap();
                it = V0.iterator();
                while (it.hasNext()) {
                }
                linkedHashMap = new LinkedHashMap(linkedHashMap72222222);
                if (linkedHashMap == null) {
                }
                CatalogBlockDataTypeDto l062222222 = catalogBlockDto.l0();
                w0 = catalogBlockDto.w0();
                hpu hpuVar2222222 = new hpu();
                i3 = a.$EnumSwitchMapping$0[l062222222.ordinal()];
                if (i3 != 15) {
                }
                a2a a2aVar2222222 = new a2a(1, hpuVar2222222, hpu.class, "map", "map(Lcom/vk/api/generated/catalog/dto/CatalogEntityGroupsItemDto;)Lcom/vk/dto/group/GroupsEntityCatalogItem;", 0, 0);
                LinkedHashMap linkedHashMap82222222 = new LinkedHashMap();
                it2 = w0.iterator();
                while (it2.hasNext()) {
                }
                linkedHashMap2 = new LinkedHashMap(linkedHashMap82222222);
                if (linkedHashMap2 == null) {
                }
                LinkedHashMap linkedHashMap92222222 = linkedHashMap2;
                l0 = catalogBlockDto.l0();
                List<CatalogSearchAuthorItemDto> y22222222 = catalogBlockDto.y2();
                if (l0 == CatalogBlockDataTypeDto.SEARCH_AUTHORS) {
                }
                l02 = catalogBlockDto.l0();
                List<CatalogGameItemDto> H02222222 = catalogBlockDto.H0();
                if (l02 == CatalogBlockDataTypeDto.GAMES) {
                }
                String str22222222 = str;
                l03 = catalogBlockDto.l0();
                List<CatalogGroupCategoryMetaItemDto> N02222222 = catalogBlockDto.N0();
                t2a t2aVar2222222 = new t2a();
                if (l03 != CatalogBlockDataTypeDto.GROUPS_CATEGORY_ITEMS) {
                }
                LinkedHashMap linkedHashMap112222222 = linkedHashMap5;
                l04 = catalogBlockDto.l0();
                List<CatalogMiniAppContentItemDto> E12222222 = catalogBlockDto.E1();
                if (l04 == CatalogBlockDataTypeDto.MINI_APPS_CONTENT) {
                }
                LinkedHashMap linkedHashMap122222222 = linkedHashMap6;
                i4 = a.$EnumSwitchMapping$0[catalogBlockDto.l0().ordinal()];
                if (i4 != 10) {
                }
                P0 = catalogBlockDto.P0();
                if (P0 == null) {
                }
                if (r1 == 0) {
                }
                arrayList2 = new ArrayList((Collection) r1);
                if (arrayList2 == null) {
                }
                ArrayList arrayList42222222 = arrayList2;
                T = catalogBlockDto.T();
                if (T == null) {
                }
                if (map == null) {
                }
                LinkedHashMap linkedHashMap132222222 = new LinkedHashMap(map);
                CatalogBlockDataTypeDto l072222222 = catalogBlockDto.l0();
                M = catalogBlockDto.M();
                LinkedHashMap linkedHashMap142222222 = new LinkedHashMap();
                if (M != null) {
                }
                return new CatalogBlockItemsData(a32222222, arrayList32222222, linkedHashMap, linkedHashMap3, linkedHashMap4, linkedHashMap92222222, linkedHashMap112222222, linkedHashMap122222222, arrayList42222222, linkedHashMap132222222, null, linkedHashMap142222222, 1024, null);
            case 8:
                List<UserId> S02 = catalogBlockDto.S0();
                if (S02 != null) {
                    List<UserId> list7 = S02;
                    arrayList = new ArrayList(c5g.u(list7, 10));
                    Iterator it7 = list7.iterator();
                    while (it7.hasNext()) {
                        arrayList.add(String.valueOf(((UserId) it7.next()).b));
                    }
                    i2 = arrayList;
                    if (i2 == null) {
                    }
                    CatalogDataType a322222222 = a4a.a(catalogBlockDto.l0());
                    ArrayList arrayList322222222 = new ArrayList(i2);
                    CatalogBlockDataTypeDto l0522222222 = catalogBlockDto.l0();
                    V0 = catalogBlockDto.V0();
                    i = a.$EnumSwitchMapping$0[l0522222222.ordinal()];
                    if (i != 10) {
                    }
                    LinkedHashMap linkedHashMap722222222 = new LinkedHashMap();
                    it = V0.iterator();
                    while (it.hasNext()) {
                    }
                    linkedHashMap = new LinkedHashMap(linkedHashMap722222222);
                    if (linkedHashMap == null) {
                    }
                    CatalogBlockDataTypeDto l0622222222 = catalogBlockDto.l0();
                    w0 = catalogBlockDto.w0();
                    hpu hpuVar22222222 = new hpu();
                    i3 = a.$EnumSwitchMapping$0[l0622222222.ordinal()];
                    if (i3 != 15) {
                    }
                    a2a a2aVar22222222 = new a2a(1, hpuVar22222222, hpu.class, "map", "map(Lcom/vk/api/generated/catalog/dto/CatalogEntityGroupsItemDto;)Lcom/vk/dto/group/GroupsEntityCatalogItem;", 0, 0);
                    LinkedHashMap linkedHashMap822222222 = new LinkedHashMap();
                    it2 = w0.iterator();
                    while (it2.hasNext()) {
                    }
                    linkedHashMap2 = new LinkedHashMap(linkedHashMap822222222);
                    if (linkedHashMap2 == null) {
                    }
                    LinkedHashMap linkedHashMap922222222 = linkedHashMap2;
                    l0 = catalogBlockDto.l0();
                    List<CatalogSearchAuthorItemDto> y222222222 = catalogBlockDto.y2();
                    if (l0 == CatalogBlockDataTypeDto.SEARCH_AUTHORS) {
                    }
                    l02 = catalogBlockDto.l0();
                    List<CatalogGameItemDto> H022222222 = catalogBlockDto.H0();
                    if (l02 == CatalogBlockDataTypeDto.GAMES) {
                    }
                    String str222222222 = str;
                    l03 = catalogBlockDto.l0();
                    List<CatalogGroupCategoryMetaItemDto> N022222222 = catalogBlockDto.N0();
                    t2a t2aVar22222222 = new t2a();
                    if (l03 != CatalogBlockDataTypeDto.GROUPS_CATEGORY_ITEMS) {
                    }
                    LinkedHashMap linkedHashMap1122222222 = linkedHashMap5;
                    l04 = catalogBlockDto.l0();
                    List<CatalogMiniAppContentItemDto> E122222222 = catalogBlockDto.E1();
                    if (l04 == CatalogBlockDataTypeDto.MINI_APPS_CONTENT) {
                    }
                    LinkedHashMap linkedHashMap1222222222 = linkedHashMap6;
                    i4 = a.$EnumSwitchMapping$0[catalogBlockDto.l0().ordinal()];
                    if (i4 != 10) {
                    }
                    P0 = catalogBlockDto.P0();
                    if (P0 == null) {
                    }
                    if (r1 == 0) {
                    }
                    arrayList2 = new ArrayList((Collection) r1);
                    if (arrayList2 == null) {
                    }
                    ArrayList arrayList422222222 = arrayList2;
                    T = catalogBlockDto.T();
                    if (T == null) {
                    }
                    if (map == null) {
                    }
                    LinkedHashMap linkedHashMap1322222222 = new LinkedHashMap(map);
                    CatalogBlockDataTypeDto l0722222222 = catalogBlockDto.l0();
                    M = catalogBlockDto.M();
                    LinkedHashMap linkedHashMap1422222222 = new LinkedHashMap();
                    if (M != null) {
                    }
                    return new CatalogBlockItemsData(a322222222, arrayList322222222, linkedHashMap, linkedHashMap3, linkedHashMap4, linkedHashMap922222222, linkedHashMap1122222222, linkedHashMap1222222222, arrayList422222222, linkedHashMap1322222222, null, linkedHashMap1422222222, 1024, null);
                }
                i2 = null;
                if (i2 == null) {
                }
                CatalogDataType a3222222222 = a4a.a(catalogBlockDto.l0());
                ArrayList arrayList3222222222 = new ArrayList(i2);
                CatalogBlockDataTypeDto l05222222222 = catalogBlockDto.l0();
                V0 = catalogBlockDto.V0();
                i = a.$EnumSwitchMapping$0[l05222222222.ordinal()];
                if (i != 10) {
                }
                LinkedHashMap linkedHashMap7222222222 = new LinkedHashMap();
                it = V0.iterator();
                while (it.hasNext()) {
                }
                linkedHashMap = new LinkedHashMap(linkedHashMap7222222222);
                if (linkedHashMap == null) {
                }
                CatalogBlockDataTypeDto l06222222222 = catalogBlockDto.l0();
                w0 = catalogBlockDto.w0();
                hpu hpuVar222222222 = new hpu();
                i3 = a.$EnumSwitchMapping$0[l06222222222.ordinal()];
                if (i3 != 15) {
                }
                a2a a2aVar222222222 = new a2a(1, hpuVar222222222, hpu.class, "map", "map(Lcom/vk/api/generated/catalog/dto/CatalogEntityGroupsItemDto;)Lcom/vk/dto/group/GroupsEntityCatalogItem;", 0, 0);
                LinkedHashMap linkedHashMap8222222222 = new LinkedHashMap();
                it2 = w0.iterator();
                while (it2.hasNext()) {
                }
                linkedHashMap2 = new LinkedHashMap(linkedHashMap8222222222);
                if (linkedHashMap2 == null) {
                }
                LinkedHashMap linkedHashMap9222222222 = linkedHashMap2;
                l0 = catalogBlockDto.l0();
                List<CatalogSearchAuthorItemDto> y2222222222 = catalogBlockDto.y2();
                if (l0 == CatalogBlockDataTypeDto.SEARCH_AUTHORS) {
                }
                l02 = catalogBlockDto.l0();
                List<CatalogGameItemDto> H0222222222 = catalogBlockDto.H0();
                if (l02 == CatalogBlockDataTypeDto.GAMES) {
                }
                String str2222222222 = str;
                l03 = catalogBlockDto.l0();
                List<CatalogGroupCategoryMetaItemDto> N0222222222 = catalogBlockDto.N0();
                t2a t2aVar222222222 = new t2a();
                if (l03 != CatalogBlockDataTypeDto.GROUPS_CATEGORY_ITEMS) {
                }
                LinkedHashMap linkedHashMap11222222222 = linkedHashMap5;
                l04 = catalogBlockDto.l0();
                List<CatalogMiniAppContentItemDto> E1222222222 = catalogBlockDto.E1();
                if (l04 == CatalogBlockDataTypeDto.MINI_APPS_CONTENT) {
                }
                LinkedHashMap linkedHashMap12222222222 = linkedHashMap6;
                i4 = a.$EnumSwitchMapping$0[catalogBlockDto.l0().ordinal()];
                if (i4 != 10) {
                }
                P0 = catalogBlockDto.P0();
                if (P0 == null) {
                }
                if (r1 == 0) {
                }
                arrayList2 = new ArrayList((Collection) r1);
                if (arrayList2 == null) {
                }
                ArrayList arrayList4222222222 = arrayList2;
                T = catalogBlockDto.T();
                if (T == null) {
                }
                if (map == null) {
                }
                LinkedHashMap linkedHashMap13222222222 = new LinkedHashMap(map);
                CatalogBlockDataTypeDto l07222222222 = catalogBlockDto.l0();
                M = catalogBlockDto.M();
                LinkedHashMap linkedHashMap14222222222 = new LinkedHashMap();
                if (M != null) {
                }
                return new CatalogBlockItemsData(a3222222222, arrayList3222222222, linkedHashMap, linkedHashMap3, linkedHashMap4, linkedHashMap9222222222, linkedHashMap11222222222, linkedHashMap12222222222, arrayList4222222222, linkedHashMap13222222222, null, linkedHashMap14222222222, 1024, null);
            case 9:
                i2 = catalogBlockDto.y1();
                if (i2 == null) {
                }
                CatalogDataType a32222222222 = a4a.a(catalogBlockDto.l0());
                ArrayList arrayList32222222222 = new ArrayList(i2);
                CatalogBlockDataTypeDto l052222222222 = catalogBlockDto.l0();
                V0 = catalogBlockDto.V0();
                i = a.$EnumSwitchMapping$0[l052222222222.ordinal()];
                if (i != 10) {
                }
                LinkedHashMap linkedHashMap72222222222 = new LinkedHashMap();
                it = V0.iterator();
                while (it.hasNext()) {
                }
                linkedHashMap = new LinkedHashMap(linkedHashMap72222222222);
                if (linkedHashMap == null) {
                }
                CatalogBlockDataTypeDto l062222222222 = catalogBlockDto.l0();
                w0 = catalogBlockDto.w0();
                hpu hpuVar2222222222 = new hpu();
                i3 = a.$EnumSwitchMapping$0[l062222222222.ordinal()];
                if (i3 != 15) {
                }
                a2a a2aVar2222222222 = new a2a(1, hpuVar2222222222, hpu.class, "map", "map(Lcom/vk/api/generated/catalog/dto/CatalogEntityGroupsItemDto;)Lcom/vk/dto/group/GroupsEntityCatalogItem;", 0, 0);
                LinkedHashMap linkedHashMap82222222222 = new LinkedHashMap();
                it2 = w0.iterator();
                while (it2.hasNext()) {
                }
                linkedHashMap2 = new LinkedHashMap(linkedHashMap82222222222);
                if (linkedHashMap2 == null) {
                }
                LinkedHashMap linkedHashMap92222222222 = linkedHashMap2;
                l0 = catalogBlockDto.l0();
                List<CatalogSearchAuthorItemDto> y22222222222 = catalogBlockDto.y2();
                if (l0 == CatalogBlockDataTypeDto.SEARCH_AUTHORS) {
                }
                l02 = catalogBlockDto.l0();
                List<CatalogGameItemDto> H02222222222 = catalogBlockDto.H0();
                if (l02 == CatalogBlockDataTypeDto.GAMES) {
                }
                String str22222222222 = str;
                l03 = catalogBlockDto.l0();
                List<CatalogGroupCategoryMetaItemDto> N02222222222 = catalogBlockDto.N0();
                t2a t2aVar2222222222 = new t2a();
                if (l03 != CatalogBlockDataTypeDto.GROUPS_CATEGORY_ITEMS) {
                }
                LinkedHashMap linkedHashMap112222222222 = linkedHashMap5;
                l04 = catalogBlockDto.l0();
                List<CatalogMiniAppContentItemDto> E12222222222 = catalogBlockDto.E1();
                if (l04 == CatalogBlockDataTypeDto.MINI_APPS_CONTENT) {
                }
                LinkedHashMap linkedHashMap122222222222 = linkedHashMap6;
                i4 = a.$EnumSwitchMapping$0[catalogBlockDto.l0().ordinal()];
                if (i4 != 10) {
                }
                P0 = catalogBlockDto.P0();
                if (P0 == null) {
                }
                if (r1 == 0) {
                }
                arrayList2 = new ArrayList((Collection) r1);
                if (arrayList2 == null) {
                }
                ArrayList arrayList42222222222 = arrayList2;
                T = catalogBlockDto.T();
                if (T == null) {
                }
                if (map == null) {
                }
                LinkedHashMap linkedHashMap132222222222 = new LinkedHashMap(map);
                CatalogBlockDataTypeDto l072222222222 = catalogBlockDto.l0();
                M = catalogBlockDto.M();
                LinkedHashMap linkedHashMap142222222222 = new LinkedHashMap();
                if (M != null) {
                }
                return new CatalogBlockItemsData(a32222222222, arrayList32222222222, linkedHashMap, linkedHashMap3, linkedHashMap4, linkedHashMap92222222222, linkedHashMap112222222222, linkedHashMap122222222222, arrayList42222222222, linkedHashMap132222222222, null, linkedHashMap142222222222, 1024, null);
            case 10:
            case 11:
                List<CatalogGroupsItemDto> V02 = catalogBlockDto.V0();
                if (V02 != null) {
                    List<CatalogGroupsItemDto> list8 = V02;
                    arrayList = new ArrayList(c5g.u(list8, 10));
                    Iterator it8 = list8.iterator();
                    while (it8.hasNext()) {
                        arrayList.add(String.valueOf(((CatalogGroupsItemDto) it8.next()).i().b));
                    }
                    i2 = arrayList;
                    if (i2 == null) {
                    }
                    CatalogDataType a322222222222 = a4a.a(catalogBlockDto.l0());
                    ArrayList arrayList322222222222 = new ArrayList(i2);
                    CatalogBlockDataTypeDto l0522222222222 = catalogBlockDto.l0();
                    V0 = catalogBlockDto.V0();
                    i = a.$EnumSwitchMapping$0[l0522222222222.ordinal()];
                    if (i != 10) {
                    }
                    LinkedHashMap linkedHashMap722222222222 = new LinkedHashMap();
                    it = V0.iterator();
                    while (it.hasNext()) {
                    }
                    linkedHashMap = new LinkedHashMap(linkedHashMap722222222222);
                    if (linkedHashMap == null) {
                    }
                    CatalogBlockDataTypeDto l0622222222222 = catalogBlockDto.l0();
                    w0 = catalogBlockDto.w0();
                    hpu hpuVar22222222222 = new hpu();
                    i3 = a.$EnumSwitchMapping$0[l0622222222222.ordinal()];
                    if (i3 != 15) {
                    }
                    a2a a2aVar22222222222 = new a2a(1, hpuVar22222222222, hpu.class, "map", "map(Lcom/vk/api/generated/catalog/dto/CatalogEntityGroupsItemDto;)Lcom/vk/dto/group/GroupsEntityCatalogItem;", 0, 0);
                    LinkedHashMap linkedHashMap822222222222 = new LinkedHashMap();
                    it2 = w0.iterator();
                    while (it2.hasNext()) {
                    }
                    linkedHashMap2 = new LinkedHashMap(linkedHashMap822222222222);
                    if (linkedHashMap2 == null) {
                    }
                    LinkedHashMap linkedHashMap922222222222 = linkedHashMap2;
                    l0 = catalogBlockDto.l0();
                    List<CatalogSearchAuthorItemDto> y222222222222 = catalogBlockDto.y2();
                    if (l0 == CatalogBlockDataTypeDto.SEARCH_AUTHORS) {
                    }
                    l02 = catalogBlockDto.l0();
                    List<CatalogGameItemDto> H022222222222 = catalogBlockDto.H0();
                    if (l02 == CatalogBlockDataTypeDto.GAMES) {
                    }
                    String str222222222222 = str;
                    l03 = catalogBlockDto.l0();
                    List<CatalogGroupCategoryMetaItemDto> N022222222222 = catalogBlockDto.N0();
                    t2a t2aVar22222222222 = new t2a();
                    if (l03 != CatalogBlockDataTypeDto.GROUPS_CATEGORY_ITEMS) {
                    }
                    LinkedHashMap linkedHashMap1122222222222 = linkedHashMap5;
                    l04 = catalogBlockDto.l0();
                    List<CatalogMiniAppContentItemDto> E122222222222 = catalogBlockDto.E1();
                    if (l04 == CatalogBlockDataTypeDto.MINI_APPS_CONTENT) {
                    }
                    LinkedHashMap linkedHashMap1222222222222 = linkedHashMap6;
                    i4 = a.$EnumSwitchMapping$0[catalogBlockDto.l0().ordinal()];
                    if (i4 != 10) {
                    }
                    P0 = catalogBlockDto.P0();
                    if (P0 == null) {
                    }
                    if (r1 == 0) {
                    }
                    arrayList2 = new ArrayList((Collection) r1);
                    if (arrayList2 == null) {
                    }
                    ArrayList arrayList422222222222 = arrayList2;
                    T = catalogBlockDto.T();
                    if (T == null) {
                    }
                    if (map == null) {
                    }
                    LinkedHashMap linkedHashMap1322222222222 = new LinkedHashMap(map);
                    CatalogBlockDataTypeDto l0722222222222 = catalogBlockDto.l0();
                    M = catalogBlockDto.M();
                    LinkedHashMap linkedHashMap1422222222222 = new LinkedHashMap();
                    if (M != null) {
                    }
                    return new CatalogBlockItemsData(a322222222222, arrayList322222222222, linkedHashMap, linkedHashMap3, linkedHashMap4, linkedHashMap922222222222, linkedHashMap1122222222222, linkedHashMap1222222222222, arrayList422222222222, linkedHashMap1322222222222, null, linkedHashMap1422222222222, 1024, null);
                }
                i2 = null;
                if (i2 == null) {
                }
                CatalogDataType a3222222222222 = a4a.a(catalogBlockDto.l0());
                ArrayList arrayList3222222222222 = new ArrayList(i2);
                CatalogBlockDataTypeDto l05222222222222 = catalogBlockDto.l0();
                V0 = catalogBlockDto.V0();
                i = a.$EnumSwitchMapping$0[l05222222222222.ordinal()];
                if (i != 10) {
                }
                LinkedHashMap linkedHashMap7222222222222 = new LinkedHashMap();
                it = V0.iterator();
                while (it.hasNext()) {
                }
                linkedHashMap = new LinkedHashMap(linkedHashMap7222222222222);
                if (linkedHashMap == null) {
                }
                CatalogBlockDataTypeDto l06222222222222 = catalogBlockDto.l0();
                w0 = catalogBlockDto.w0();
                hpu hpuVar222222222222 = new hpu();
                i3 = a.$EnumSwitchMapping$0[l06222222222222.ordinal()];
                if (i3 != 15) {
                }
                a2a a2aVar222222222222 = new a2a(1, hpuVar222222222222, hpu.class, "map", "map(Lcom/vk/api/generated/catalog/dto/CatalogEntityGroupsItemDto;)Lcom/vk/dto/group/GroupsEntityCatalogItem;", 0, 0);
                LinkedHashMap linkedHashMap8222222222222 = new LinkedHashMap();
                it2 = w0.iterator();
                while (it2.hasNext()) {
                }
                linkedHashMap2 = new LinkedHashMap(linkedHashMap8222222222222);
                if (linkedHashMap2 == null) {
                }
                LinkedHashMap linkedHashMap9222222222222 = linkedHashMap2;
                l0 = catalogBlockDto.l0();
                List<CatalogSearchAuthorItemDto> y2222222222222 = catalogBlockDto.y2();
                if (l0 == CatalogBlockDataTypeDto.SEARCH_AUTHORS) {
                }
                l02 = catalogBlockDto.l0();
                List<CatalogGameItemDto> H0222222222222 = catalogBlockDto.H0();
                if (l02 == CatalogBlockDataTypeDto.GAMES) {
                }
                String str2222222222222 = str;
                l03 = catalogBlockDto.l0();
                List<CatalogGroupCategoryMetaItemDto> N0222222222222 = catalogBlockDto.N0();
                t2a t2aVar222222222222 = new t2a();
                if (l03 != CatalogBlockDataTypeDto.GROUPS_CATEGORY_ITEMS) {
                }
                LinkedHashMap linkedHashMap11222222222222 = linkedHashMap5;
                l04 = catalogBlockDto.l0();
                List<CatalogMiniAppContentItemDto> E1222222222222 = catalogBlockDto.E1();
                if (l04 == CatalogBlockDataTypeDto.MINI_APPS_CONTENT) {
                }
                LinkedHashMap linkedHashMap12222222222222 = linkedHashMap6;
                i4 = a.$EnumSwitchMapping$0[catalogBlockDto.l0().ordinal()];
                if (i4 != 10) {
                }
                P0 = catalogBlockDto.P0();
                if (P0 == null) {
                }
                if (r1 == 0) {
                }
                arrayList2 = new ArrayList((Collection) r1);
                if (arrayList2 == null) {
                }
                ArrayList arrayList4222222222222 = arrayList2;
                T = catalogBlockDto.T();
                if (T == null) {
                }
                if (map == null) {
                }
                LinkedHashMap linkedHashMap13222222222222 = new LinkedHashMap(map);
                CatalogBlockDataTypeDto l07222222222222 = catalogBlockDto.l0();
                M = catalogBlockDto.M();
                LinkedHashMap linkedHashMap14222222222222 = new LinkedHashMap();
                if (M != null) {
                }
                return new CatalogBlockItemsData(a3222222222222, arrayList3222222222222, linkedHashMap, linkedHashMap3, linkedHashMap4, linkedHashMap9222222222222, linkedHashMap11222222222222, linkedHashMap12222222222222, arrayList4222222222222, linkedHashMap13222222222222, null, linkedHashMap14222222222222, 1024, null);
            case 12:
                List<Integer> K2 = catalogBlockDto.K();
                if (K2 != null) {
                    List<Integer> list9 = K2;
                    arrayList = new ArrayList(c5g.u(list9, 10));
                    Iterator it9 = list9.iterator();
                    while (it9.hasNext()) {
                        kq.d((Number) it9.next(), arrayList);
                    }
                    i2 = arrayList;
                    if (i2 == null) {
                    }
                    CatalogDataType a32222222222222 = a4a.a(catalogBlockDto.l0());
                    ArrayList arrayList32222222222222 = new ArrayList(i2);
                    CatalogBlockDataTypeDto l052222222222222 = catalogBlockDto.l0();
                    V0 = catalogBlockDto.V0();
                    i = a.$EnumSwitchMapping$0[l052222222222222.ordinal()];
                    if (i != 10) {
                    }
                    LinkedHashMap linkedHashMap72222222222222 = new LinkedHashMap();
                    it = V0.iterator();
                    while (it.hasNext()) {
                    }
                    linkedHashMap = new LinkedHashMap(linkedHashMap72222222222222);
                    if (linkedHashMap == null) {
                    }
                    CatalogBlockDataTypeDto l062222222222222 = catalogBlockDto.l0();
                    w0 = catalogBlockDto.w0();
                    hpu hpuVar2222222222222 = new hpu();
                    i3 = a.$EnumSwitchMapping$0[l062222222222222.ordinal()];
                    if (i3 != 15) {
                    }
                    a2a a2aVar2222222222222 = new a2a(1, hpuVar2222222222222, hpu.class, "map", "map(Lcom/vk/api/generated/catalog/dto/CatalogEntityGroupsItemDto;)Lcom/vk/dto/group/GroupsEntityCatalogItem;", 0, 0);
                    LinkedHashMap linkedHashMap82222222222222 = new LinkedHashMap();
                    it2 = w0.iterator();
                    while (it2.hasNext()) {
                    }
                    linkedHashMap2 = new LinkedHashMap(linkedHashMap82222222222222);
                    if (linkedHashMap2 == null) {
                    }
                    LinkedHashMap linkedHashMap92222222222222 = linkedHashMap2;
                    l0 = catalogBlockDto.l0();
                    List<CatalogSearchAuthorItemDto> y22222222222222 = catalogBlockDto.y2();
                    if (l0 == CatalogBlockDataTypeDto.SEARCH_AUTHORS) {
                    }
                    l02 = catalogBlockDto.l0();
                    List<CatalogGameItemDto> H02222222222222 = catalogBlockDto.H0();
                    if (l02 == CatalogBlockDataTypeDto.GAMES) {
                    }
                    String str22222222222222 = str;
                    l03 = catalogBlockDto.l0();
                    List<CatalogGroupCategoryMetaItemDto> N02222222222222 = catalogBlockDto.N0();
                    t2a t2aVar2222222222222 = new t2a();
                    if (l03 != CatalogBlockDataTypeDto.GROUPS_CATEGORY_ITEMS) {
                    }
                    LinkedHashMap linkedHashMap112222222222222 = linkedHashMap5;
                    l04 = catalogBlockDto.l0();
                    List<CatalogMiniAppContentItemDto> E12222222222222 = catalogBlockDto.E1();
                    if (l04 == CatalogBlockDataTypeDto.MINI_APPS_CONTENT) {
                    }
                    LinkedHashMap linkedHashMap122222222222222 = linkedHashMap6;
                    i4 = a.$EnumSwitchMapping$0[catalogBlockDto.l0().ordinal()];
                    if (i4 != 10) {
                    }
                    P0 = catalogBlockDto.P0();
                    if (P0 == null) {
                    }
                    if (r1 == 0) {
                    }
                    arrayList2 = new ArrayList((Collection) r1);
                    if (arrayList2 == null) {
                    }
                    ArrayList arrayList42222222222222 = arrayList2;
                    T = catalogBlockDto.T();
                    if (T == null) {
                    }
                    if (map == null) {
                    }
                    LinkedHashMap linkedHashMap132222222222222 = new LinkedHashMap(map);
                    CatalogBlockDataTypeDto l072222222222222 = catalogBlockDto.l0();
                    M = catalogBlockDto.M();
                    LinkedHashMap linkedHashMap142222222222222 = new LinkedHashMap();
                    if (M != null) {
                    }
                    return new CatalogBlockItemsData(a32222222222222, arrayList32222222222222, linkedHashMap, linkedHashMap3, linkedHashMap4, linkedHashMap92222222222222, linkedHashMap112222222222222, linkedHashMap122222222222222, arrayList42222222222222, linkedHashMap132222222222222, null, linkedHashMap142222222222222, 1024, null);
                }
                i2 = null;
                if (i2 == null) {
                }
                CatalogDataType a322222222222222 = a4a.a(catalogBlockDto.l0());
                ArrayList arrayList322222222222222 = new ArrayList(i2);
                CatalogBlockDataTypeDto l0522222222222222 = catalogBlockDto.l0();
                V0 = catalogBlockDto.V0();
                i = a.$EnumSwitchMapping$0[l0522222222222222.ordinal()];
                if (i != 10) {
                }
                LinkedHashMap linkedHashMap722222222222222 = new LinkedHashMap();
                it = V0.iterator();
                while (it.hasNext()) {
                }
                linkedHashMap = new LinkedHashMap(linkedHashMap722222222222222);
                if (linkedHashMap == null) {
                }
                CatalogBlockDataTypeDto l0622222222222222 = catalogBlockDto.l0();
                w0 = catalogBlockDto.w0();
                hpu hpuVar22222222222222 = new hpu();
                i3 = a.$EnumSwitchMapping$0[l0622222222222222.ordinal()];
                if (i3 != 15) {
                }
                a2a a2aVar22222222222222 = new a2a(1, hpuVar22222222222222, hpu.class, "map", "map(Lcom/vk/api/generated/catalog/dto/CatalogEntityGroupsItemDto;)Lcom/vk/dto/group/GroupsEntityCatalogItem;", 0, 0);
                LinkedHashMap linkedHashMap822222222222222 = new LinkedHashMap();
                it2 = w0.iterator();
                while (it2.hasNext()) {
                }
                linkedHashMap2 = new LinkedHashMap(linkedHashMap822222222222222);
                if (linkedHashMap2 == null) {
                }
                LinkedHashMap linkedHashMap922222222222222 = linkedHashMap2;
                l0 = catalogBlockDto.l0();
                List<CatalogSearchAuthorItemDto> y222222222222222 = catalogBlockDto.y2();
                if (l0 == CatalogBlockDataTypeDto.SEARCH_AUTHORS) {
                }
                l02 = catalogBlockDto.l0();
                List<CatalogGameItemDto> H022222222222222 = catalogBlockDto.H0();
                if (l02 == CatalogBlockDataTypeDto.GAMES) {
                }
                String str222222222222222 = str;
                l03 = catalogBlockDto.l0();
                List<CatalogGroupCategoryMetaItemDto> N022222222222222 = catalogBlockDto.N0();
                t2a t2aVar22222222222222 = new t2a();
                if (l03 != CatalogBlockDataTypeDto.GROUPS_CATEGORY_ITEMS) {
                }
                LinkedHashMap linkedHashMap1122222222222222 = linkedHashMap5;
                l04 = catalogBlockDto.l0();
                List<CatalogMiniAppContentItemDto> E122222222222222 = catalogBlockDto.E1();
                if (l04 == CatalogBlockDataTypeDto.MINI_APPS_CONTENT) {
                }
                LinkedHashMap linkedHashMap1222222222222222 = linkedHashMap6;
                i4 = a.$EnumSwitchMapping$0[catalogBlockDto.l0().ordinal()];
                if (i4 != 10) {
                }
                P0 = catalogBlockDto.P0();
                if (P0 == null) {
                }
                if (r1 == 0) {
                }
                arrayList2 = new ArrayList((Collection) r1);
                if (arrayList2 == null) {
                }
                ArrayList arrayList422222222222222 = arrayList2;
                T = catalogBlockDto.T();
                if (T == null) {
                }
                if (map == null) {
                }
                LinkedHashMap linkedHashMap1322222222222222 = new LinkedHashMap(map);
                CatalogBlockDataTypeDto l0722222222222222 = catalogBlockDto.l0();
                M = catalogBlockDto.M();
                LinkedHashMap linkedHashMap1422222222222222 = new LinkedHashMap();
                if (M != null) {
                }
                return new CatalogBlockItemsData(a322222222222222, arrayList322222222222222, linkedHashMap, linkedHashMap3, linkedHashMap4, linkedHashMap922222222222222, linkedHashMap1122222222222222, linkedHashMap1222222222222222, arrayList422222222222222, linkedHashMap1322222222222222, null, linkedHashMap1422222222222222, 1024, null);
            case 13:
                List<Integer> K3 = catalogBlockDto.K();
                if (K3 != null) {
                    List<Integer> list10 = K3;
                    arrayList = new ArrayList(c5g.u(list10, 10));
                    Iterator it10 = list10.iterator();
                    while (it10.hasNext()) {
                        kq.d((Number) it10.next(), arrayList);
                    }
                    i2 = arrayList;
                    if (i2 == null) {
                    }
                    CatalogDataType a3222222222222222 = a4a.a(catalogBlockDto.l0());
                    ArrayList arrayList3222222222222222 = new ArrayList(i2);
                    CatalogBlockDataTypeDto l05222222222222222 = catalogBlockDto.l0();
                    V0 = catalogBlockDto.V0();
                    i = a.$EnumSwitchMapping$0[l05222222222222222.ordinal()];
                    if (i != 10) {
                    }
                    LinkedHashMap linkedHashMap7222222222222222 = new LinkedHashMap();
                    it = V0.iterator();
                    while (it.hasNext()) {
                    }
                    linkedHashMap = new LinkedHashMap(linkedHashMap7222222222222222);
                    if (linkedHashMap == null) {
                    }
                    CatalogBlockDataTypeDto l06222222222222222 = catalogBlockDto.l0();
                    w0 = catalogBlockDto.w0();
                    hpu hpuVar222222222222222 = new hpu();
                    i3 = a.$EnumSwitchMapping$0[l06222222222222222.ordinal()];
                    if (i3 != 15) {
                    }
                    a2a a2aVar222222222222222 = new a2a(1, hpuVar222222222222222, hpu.class, "map", "map(Lcom/vk/api/generated/catalog/dto/CatalogEntityGroupsItemDto;)Lcom/vk/dto/group/GroupsEntityCatalogItem;", 0, 0);
                    LinkedHashMap linkedHashMap8222222222222222 = new LinkedHashMap();
                    it2 = w0.iterator();
                    while (it2.hasNext()) {
                    }
                    linkedHashMap2 = new LinkedHashMap(linkedHashMap8222222222222222);
                    if (linkedHashMap2 == null) {
                    }
                    LinkedHashMap linkedHashMap9222222222222222 = linkedHashMap2;
                    l0 = catalogBlockDto.l0();
                    List<CatalogSearchAuthorItemDto> y2222222222222222 = catalogBlockDto.y2();
                    if (l0 == CatalogBlockDataTypeDto.SEARCH_AUTHORS) {
                    }
                    l02 = catalogBlockDto.l0();
                    List<CatalogGameItemDto> H0222222222222222 = catalogBlockDto.H0();
                    if (l02 == CatalogBlockDataTypeDto.GAMES) {
                    }
                    String str2222222222222222 = str;
                    l03 = catalogBlockDto.l0();
                    List<CatalogGroupCategoryMetaItemDto> N0222222222222222 = catalogBlockDto.N0();
                    t2a t2aVar222222222222222 = new t2a();
                    if (l03 != CatalogBlockDataTypeDto.GROUPS_CATEGORY_ITEMS) {
                    }
                    LinkedHashMap linkedHashMap11222222222222222 = linkedHashMap5;
                    l04 = catalogBlockDto.l0();
                    List<CatalogMiniAppContentItemDto> E1222222222222222 = catalogBlockDto.E1();
                    if (l04 == CatalogBlockDataTypeDto.MINI_APPS_CONTENT) {
                    }
                    LinkedHashMap linkedHashMap12222222222222222 = linkedHashMap6;
                    i4 = a.$EnumSwitchMapping$0[catalogBlockDto.l0().ordinal()];
                    if (i4 != 10) {
                    }
                    P0 = catalogBlockDto.P0();
                    if (P0 == null) {
                    }
                    if (r1 == 0) {
                    }
                    arrayList2 = new ArrayList((Collection) r1);
                    if (arrayList2 == null) {
                    }
                    ArrayList arrayList4222222222222222 = arrayList2;
                    T = catalogBlockDto.T();
                    if (T == null) {
                    }
                    if (map == null) {
                    }
                    LinkedHashMap linkedHashMap13222222222222222 = new LinkedHashMap(map);
                    CatalogBlockDataTypeDto l07222222222222222 = catalogBlockDto.l0();
                    M = catalogBlockDto.M();
                    LinkedHashMap linkedHashMap14222222222222222 = new LinkedHashMap();
                    if (M != null) {
                    }
                    return new CatalogBlockItemsData(a3222222222222222, arrayList3222222222222222, linkedHashMap, linkedHashMap3, linkedHashMap4, linkedHashMap9222222222222222, linkedHashMap11222222222222222, linkedHashMap12222222222222222, arrayList4222222222222222, linkedHashMap13222222222222222, null, linkedHashMap14222222222222222, 1024, null);
                }
                i2 = null;
                if (i2 == null) {
                }
                CatalogDataType a32222222222222222 = a4a.a(catalogBlockDto.l0());
                ArrayList arrayList32222222222222222 = new ArrayList(i2);
                CatalogBlockDataTypeDto l052222222222222222 = catalogBlockDto.l0();
                V0 = catalogBlockDto.V0();
                i = a.$EnumSwitchMapping$0[l052222222222222222.ordinal()];
                if (i != 10) {
                }
                LinkedHashMap linkedHashMap72222222222222222 = new LinkedHashMap();
                it = V0.iterator();
                while (it.hasNext()) {
                }
                linkedHashMap = new LinkedHashMap(linkedHashMap72222222222222222);
                if (linkedHashMap == null) {
                }
                CatalogBlockDataTypeDto l062222222222222222 = catalogBlockDto.l0();
                w0 = catalogBlockDto.w0();
                hpu hpuVar2222222222222222 = new hpu();
                i3 = a.$EnumSwitchMapping$0[l062222222222222222.ordinal()];
                if (i3 != 15) {
                }
                a2a a2aVar2222222222222222 = new a2a(1, hpuVar2222222222222222, hpu.class, "map", "map(Lcom/vk/api/generated/catalog/dto/CatalogEntityGroupsItemDto;)Lcom/vk/dto/group/GroupsEntityCatalogItem;", 0, 0);
                LinkedHashMap linkedHashMap82222222222222222 = new LinkedHashMap();
                it2 = w0.iterator();
                while (it2.hasNext()) {
                }
                linkedHashMap2 = new LinkedHashMap(linkedHashMap82222222222222222);
                if (linkedHashMap2 == null) {
                }
                LinkedHashMap linkedHashMap92222222222222222 = linkedHashMap2;
                l0 = catalogBlockDto.l0();
                List<CatalogSearchAuthorItemDto> y22222222222222222 = catalogBlockDto.y2();
                if (l0 == CatalogBlockDataTypeDto.SEARCH_AUTHORS) {
                }
                l02 = catalogBlockDto.l0();
                List<CatalogGameItemDto> H02222222222222222 = catalogBlockDto.H0();
                if (l02 == CatalogBlockDataTypeDto.GAMES) {
                }
                String str22222222222222222 = str;
                l03 = catalogBlockDto.l0();
                List<CatalogGroupCategoryMetaItemDto> N02222222222222222 = catalogBlockDto.N0();
                t2a t2aVar2222222222222222 = new t2a();
                if (l03 != CatalogBlockDataTypeDto.GROUPS_CATEGORY_ITEMS) {
                }
                LinkedHashMap linkedHashMap112222222222222222 = linkedHashMap5;
                l04 = catalogBlockDto.l0();
                List<CatalogMiniAppContentItemDto> E12222222222222222 = catalogBlockDto.E1();
                if (l04 == CatalogBlockDataTypeDto.MINI_APPS_CONTENT) {
                }
                LinkedHashMap linkedHashMap122222222222222222 = linkedHashMap6;
                i4 = a.$EnumSwitchMapping$0[catalogBlockDto.l0().ordinal()];
                if (i4 != 10) {
                }
                P0 = catalogBlockDto.P0();
                if (P0 == null) {
                }
                if (r1 == 0) {
                }
                arrayList2 = new ArrayList((Collection) r1);
                if (arrayList2 == null) {
                }
                ArrayList arrayList42222222222222222 = arrayList2;
                T = catalogBlockDto.T();
                if (T == null) {
                }
                if (map == null) {
                }
                LinkedHashMap linkedHashMap132222222222222222 = new LinkedHashMap(map);
                CatalogBlockDataTypeDto l072222222222222222 = catalogBlockDto.l0();
                M = catalogBlockDto.M();
                LinkedHashMap linkedHashMap142222222222222222 = new LinkedHashMap();
                if (M != null) {
                }
                return new CatalogBlockItemsData(a32222222222222222, arrayList32222222222222222, linkedHashMap, linkedHashMap3, linkedHashMap4, linkedHashMap92222222222222222, linkedHashMap112222222222222222, linkedHashMap122222222222222222, arrayList42222222222222222, linkedHashMap132222222222222222, null, linkedHashMap142222222222222222, 1024, null);
            case 14:
                List<Integer> U0 = catalogBlockDto.U0();
                if (U0 != null) {
                    List<Integer> list11 = U0;
                    arrayList = new ArrayList(c5g.u(list11, 10));
                    Iterator it11 = list11.iterator();
                    while (it11.hasNext()) {
                        kq.d((Number) it11.next(), arrayList);
                    }
                    i2 = arrayList;
                    if (i2 == null) {
                    }
                    CatalogDataType a322222222222222222 = a4a.a(catalogBlockDto.l0());
                    ArrayList arrayList322222222222222222 = new ArrayList(i2);
                    CatalogBlockDataTypeDto l0522222222222222222 = catalogBlockDto.l0();
                    V0 = catalogBlockDto.V0();
                    i = a.$EnumSwitchMapping$0[l0522222222222222222.ordinal()];
                    if (i != 10) {
                    }
                    LinkedHashMap linkedHashMap722222222222222222 = new LinkedHashMap();
                    it = V0.iterator();
                    while (it.hasNext()) {
                    }
                    linkedHashMap = new LinkedHashMap(linkedHashMap722222222222222222);
                    if (linkedHashMap == null) {
                    }
                    CatalogBlockDataTypeDto l0622222222222222222 = catalogBlockDto.l0();
                    w0 = catalogBlockDto.w0();
                    hpu hpuVar22222222222222222 = new hpu();
                    i3 = a.$EnumSwitchMapping$0[l0622222222222222222.ordinal()];
                    if (i3 != 15) {
                    }
                    a2a a2aVar22222222222222222 = new a2a(1, hpuVar22222222222222222, hpu.class, "map", "map(Lcom/vk/api/generated/catalog/dto/CatalogEntityGroupsItemDto;)Lcom/vk/dto/group/GroupsEntityCatalogItem;", 0, 0);
                    LinkedHashMap linkedHashMap822222222222222222 = new LinkedHashMap();
                    it2 = w0.iterator();
                    while (it2.hasNext()) {
                    }
                    linkedHashMap2 = new LinkedHashMap(linkedHashMap822222222222222222);
                    if (linkedHashMap2 == null) {
                    }
                    LinkedHashMap linkedHashMap922222222222222222 = linkedHashMap2;
                    l0 = catalogBlockDto.l0();
                    List<CatalogSearchAuthorItemDto> y222222222222222222 = catalogBlockDto.y2();
                    if (l0 == CatalogBlockDataTypeDto.SEARCH_AUTHORS) {
                    }
                    l02 = catalogBlockDto.l0();
                    List<CatalogGameItemDto> H022222222222222222 = catalogBlockDto.H0();
                    if (l02 == CatalogBlockDataTypeDto.GAMES) {
                    }
                    String str222222222222222222 = str;
                    l03 = catalogBlockDto.l0();
                    List<CatalogGroupCategoryMetaItemDto> N022222222222222222 = catalogBlockDto.N0();
                    t2a t2aVar22222222222222222 = new t2a();
                    if (l03 != CatalogBlockDataTypeDto.GROUPS_CATEGORY_ITEMS) {
                    }
                    LinkedHashMap linkedHashMap1122222222222222222 = linkedHashMap5;
                    l04 = catalogBlockDto.l0();
                    List<CatalogMiniAppContentItemDto> E122222222222222222 = catalogBlockDto.E1();
                    if (l04 == CatalogBlockDataTypeDto.MINI_APPS_CONTENT) {
                    }
                    LinkedHashMap linkedHashMap1222222222222222222 = linkedHashMap6;
                    i4 = a.$EnumSwitchMapping$0[catalogBlockDto.l0().ordinal()];
                    if (i4 != 10) {
                    }
                    P0 = catalogBlockDto.P0();
                    if (P0 == null) {
                    }
                    if (r1 == 0) {
                    }
                    arrayList2 = new ArrayList((Collection) r1);
                    if (arrayList2 == null) {
                    }
                    ArrayList arrayList422222222222222222 = arrayList2;
                    T = catalogBlockDto.T();
                    if (T == null) {
                    }
                    if (map == null) {
                    }
                    LinkedHashMap linkedHashMap1322222222222222222 = new LinkedHashMap(map);
                    CatalogBlockDataTypeDto l0722222222222222222 = catalogBlockDto.l0();
                    M = catalogBlockDto.M();
                    LinkedHashMap linkedHashMap1422222222222222222 = new LinkedHashMap();
                    if (M != null) {
                    }
                    return new CatalogBlockItemsData(a322222222222222222, arrayList322222222222222222, linkedHashMap, linkedHashMap3, linkedHashMap4, linkedHashMap922222222222222222, linkedHashMap1122222222222222222, linkedHashMap1222222222222222222, arrayList422222222222222222, linkedHashMap1322222222222222222, null, linkedHashMap1422222222222222222, 1024, null);
                }
                i2 = null;
                if (i2 == null) {
                }
                CatalogDataType a3222222222222222222 = a4a.a(catalogBlockDto.l0());
                ArrayList arrayList3222222222222222222 = new ArrayList(i2);
                CatalogBlockDataTypeDto l05222222222222222222 = catalogBlockDto.l0();
                V0 = catalogBlockDto.V0();
                i = a.$EnumSwitchMapping$0[l05222222222222222222.ordinal()];
                if (i != 10) {
                }
                LinkedHashMap linkedHashMap7222222222222222222 = new LinkedHashMap();
                it = V0.iterator();
                while (it.hasNext()) {
                }
                linkedHashMap = new LinkedHashMap(linkedHashMap7222222222222222222);
                if (linkedHashMap == null) {
                }
                CatalogBlockDataTypeDto l06222222222222222222 = catalogBlockDto.l0();
                w0 = catalogBlockDto.w0();
                hpu hpuVar222222222222222222 = new hpu();
                i3 = a.$EnumSwitchMapping$0[l06222222222222222222.ordinal()];
                if (i3 != 15) {
                }
                a2a a2aVar222222222222222222 = new a2a(1, hpuVar222222222222222222, hpu.class, "map", "map(Lcom/vk/api/generated/catalog/dto/CatalogEntityGroupsItemDto;)Lcom/vk/dto/group/GroupsEntityCatalogItem;", 0, 0);
                LinkedHashMap linkedHashMap8222222222222222222 = new LinkedHashMap();
                it2 = w0.iterator();
                while (it2.hasNext()) {
                }
                linkedHashMap2 = new LinkedHashMap(linkedHashMap8222222222222222222);
                if (linkedHashMap2 == null) {
                }
                LinkedHashMap linkedHashMap9222222222222222222 = linkedHashMap2;
                l0 = catalogBlockDto.l0();
                List<CatalogSearchAuthorItemDto> y2222222222222222222 = catalogBlockDto.y2();
                if (l0 == CatalogBlockDataTypeDto.SEARCH_AUTHORS) {
                }
                l02 = catalogBlockDto.l0();
                List<CatalogGameItemDto> H0222222222222222222 = catalogBlockDto.H0();
                if (l02 == CatalogBlockDataTypeDto.GAMES) {
                }
                String str2222222222222222222 = str;
                l03 = catalogBlockDto.l0();
                List<CatalogGroupCategoryMetaItemDto> N0222222222222222222 = catalogBlockDto.N0();
                t2a t2aVar222222222222222222 = new t2a();
                if (l03 != CatalogBlockDataTypeDto.GROUPS_CATEGORY_ITEMS) {
                }
                LinkedHashMap linkedHashMap11222222222222222222 = linkedHashMap5;
                l04 = catalogBlockDto.l0();
                List<CatalogMiniAppContentItemDto> E1222222222222222222 = catalogBlockDto.E1();
                if (l04 == CatalogBlockDataTypeDto.MINI_APPS_CONTENT) {
                }
                LinkedHashMap linkedHashMap12222222222222222222 = linkedHashMap6;
                i4 = a.$EnumSwitchMapping$0[catalogBlockDto.l0().ordinal()];
                if (i4 != 10) {
                }
                P0 = catalogBlockDto.P0();
                if (P0 == null) {
                }
                if (r1 == 0) {
                }
                arrayList2 = new ArrayList((Collection) r1);
                if (arrayList2 == null) {
                }
                ArrayList arrayList4222222222222222222 = arrayList2;
                T = catalogBlockDto.T();
                if (T == null) {
                }
                if (map == null) {
                }
                LinkedHashMap linkedHashMap13222222222222222222 = new LinkedHashMap(map);
                CatalogBlockDataTypeDto l07222222222222222222 = catalogBlockDto.l0();
                M = catalogBlockDto.M();
                LinkedHashMap linkedHashMap14222222222222222222 = new LinkedHashMap();
                if (M != null) {
                }
                return new CatalogBlockItemsData(a3222222222222222222, arrayList3222222222222222222, linkedHashMap, linkedHashMap3, linkedHashMap4, linkedHashMap9222222222222222222, linkedHashMap11222222222222222222, linkedHashMap12222222222222222222, arrayList4222222222222222222, linkedHashMap13222222222222222222, null, linkedHashMap14222222222222222222, 1024, null);
            case 15:
                i2 = catalogBlockDto.P0();
                if (i2 == null) {
                }
                CatalogDataType a32222222222222222222 = a4a.a(catalogBlockDto.l0());
                ArrayList arrayList32222222222222222222 = new ArrayList(i2);
                CatalogBlockDataTypeDto l052222222222222222222 = catalogBlockDto.l0();
                V0 = catalogBlockDto.V0();
                i = a.$EnumSwitchMapping$0[l052222222222222222222.ordinal()];
                if (i != 10) {
                }
                LinkedHashMap linkedHashMap72222222222222222222 = new LinkedHashMap();
                it = V0.iterator();
                while (it.hasNext()) {
                }
                linkedHashMap = new LinkedHashMap(linkedHashMap72222222222222222222);
                if (linkedHashMap == null) {
                }
                CatalogBlockDataTypeDto l062222222222222222222 = catalogBlockDto.l0();
                w0 = catalogBlockDto.w0();
                hpu hpuVar2222222222222222222 = new hpu();
                i3 = a.$EnumSwitchMapping$0[l062222222222222222222.ordinal()];
                if (i3 != 15) {
                }
                a2a a2aVar2222222222222222222 = new a2a(1, hpuVar2222222222222222222, hpu.class, "map", "map(Lcom/vk/api/generated/catalog/dto/CatalogEntityGroupsItemDto;)Lcom/vk/dto/group/GroupsEntityCatalogItem;", 0, 0);
                LinkedHashMap linkedHashMap82222222222222222222 = new LinkedHashMap();
                it2 = w0.iterator();
                while (it2.hasNext()) {
                }
                linkedHashMap2 = new LinkedHashMap(linkedHashMap82222222222222222222);
                if (linkedHashMap2 == null) {
                }
                LinkedHashMap linkedHashMap92222222222222222222 = linkedHashMap2;
                l0 = catalogBlockDto.l0();
                List<CatalogSearchAuthorItemDto> y22222222222222222222 = catalogBlockDto.y2();
                if (l0 == CatalogBlockDataTypeDto.SEARCH_AUTHORS) {
                }
                l02 = catalogBlockDto.l0();
                List<CatalogGameItemDto> H02222222222222222222 = catalogBlockDto.H0();
                if (l02 == CatalogBlockDataTypeDto.GAMES) {
                }
                String str22222222222222222222 = str;
                l03 = catalogBlockDto.l0();
                List<CatalogGroupCategoryMetaItemDto> N02222222222222222222 = catalogBlockDto.N0();
                t2a t2aVar2222222222222222222 = new t2a();
                if (l03 != CatalogBlockDataTypeDto.GROUPS_CATEGORY_ITEMS) {
                }
                LinkedHashMap linkedHashMap112222222222222222222 = linkedHashMap5;
                l04 = catalogBlockDto.l0();
                List<CatalogMiniAppContentItemDto> E12222222222222222222 = catalogBlockDto.E1();
                if (l04 == CatalogBlockDataTypeDto.MINI_APPS_CONTENT) {
                }
                LinkedHashMap linkedHashMap122222222222222222222 = linkedHashMap6;
                i4 = a.$EnumSwitchMapping$0[catalogBlockDto.l0().ordinal()];
                if (i4 != 10) {
                }
                P0 = catalogBlockDto.P0();
                if (P0 == null) {
                }
                if (r1 == 0) {
                }
                arrayList2 = new ArrayList((Collection) r1);
                if (arrayList2 == null) {
                }
                ArrayList arrayList42222222222222222222 = arrayList2;
                T = catalogBlockDto.T();
                if (T == null) {
                }
                if (map == null) {
                }
                LinkedHashMap linkedHashMap132222222222222222222 = new LinkedHashMap(map);
                CatalogBlockDataTypeDto l072222222222222222222 = catalogBlockDto.l0();
                M = catalogBlockDto.M();
                LinkedHashMap linkedHashMap142222222222222222222 = new LinkedHashMap();
                if (M != null) {
                }
                return new CatalogBlockItemsData(a32222222222222222222, arrayList32222222222222222222, linkedHashMap, linkedHashMap3, linkedHashMap4, linkedHashMap92222222222222222222, linkedHashMap112222222222222222222, linkedHashMap122222222222222222222, arrayList42222222222222222222, linkedHashMap132222222222222222222, null, linkedHashMap142222222222222222222, 1024, null);
            case 16:
                i2 = catalogBlockDto.K0();
                if (i2 == null) {
                }
                CatalogDataType a322222222222222222222 = a4a.a(catalogBlockDto.l0());
                ArrayList arrayList322222222222222222222 = new ArrayList(i2);
                CatalogBlockDataTypeDto l0522222222222222222222 = catalogBlockDto.l0();
                V0 = catalogBlockDto.V0();
                i = a.$EnumSwitchMapping$0[l0522222222222222222222.ordinal()];
                if (i != 10) {
                }
                LinkedHashMap linkedHashMap722222222222222222222 = new LinkedHashMap();
                it = V0.iterator();
                while (it.hasNext()) {
                }
                linkedHashMap = new LinkedHashMap(linkedHashMap722222222222222222222);
                if (linkedHashMap == null) {
                }
                CatalogBlockDataTypeDto l0622222222222222222222 = catalogBlockDto.l0();
                w0 = catalogBlockDto.w0();
                hpu hpuVar22222222222222222222 = new hpu();
                i3 = a.$EnumSwitchMapping$0[l0622222222222222222222.ordinal()];
                if (i3 != 15) {
                }
                a2a a2aVar22222222222222222222 = new a2a(1, hpuVar22222222222222222222, hpu.class, "map", "map(Lcom/vk/api/generated/catalog/dto/CatalogEntityGroupsItemDto;)Lcom/vk/dto/group/GroupsEntityCatalogItem;", 0, 0);
                LinkedHashMap linkedHashMap822222222222222222222 = new LinkedHashMap();
                it2 = w0.iterator();
                while (it2.hasNext()) {
                }
                linkedHashMap2 = new LinkedHashMap(linkedHashMap822222222222222222222);
                if (linkedHashMap2 == null) {
                }
                LinkedHashMap linkedHashMap922222222222222222222 = linkedHashMap2;
                l0 = catalogBlockDto.l0();
                List<CatalogSearchAuthorItemDto> y222222222222222222222 = catalogBlockDto.y2();
                if (l0 == CatalogBlockDataTypeDto.SEARCH_AUTHORS) {
                }
                l02 = catalogBlockDto.l0();
                List<CatalogGameItemDto> H022222222222222222222 = catalogBlockDto.H0();
                if (l02 == CatalogBlockDataTypeDto.GAMES) {
                }
                String str222222222222222222222 = str;
                l03 = catalogBlockDto.l0();
                List<CatalogGroupCategoryMetaItemDto> N022222222222222222222 = catalogBlockDto.N0();
                t2a t2aVar22222222222222222222 = new t2a();
                if (l03 != CatalogBlockDataTypeDto.GROUPS_CATEGORY_ITEMS) {
                }
                LinkedHashMap linkedHashMap1122222222222222222222 = linkedHashMap5;
                l04 = catalogBlockDto.l0();
                List<CatalogMiniAppContentItemDto> E122222222222222222222 = catalogBlockDto.E1();
                if (l04 == CatalogBlockDataTypeDto.MINI_APPS_CONTENT) {
                }
                LinkedHashMap linkedHashMap1222222222222222222222 = linkedHashMap6;
                i4 = a.$EnumSwitchMapping$0[catalogBlockDto.l0().ordinal()];
                if (i4 != 10) {
                }
                P0 = catalogBlockDto.P0();
                if (P0 == null) {
                }
                if (r1 == 0) {
                }
                arrayList2 = new ArrayList((Collection) r1);
                if (arrayList2 == null) {
                }
                ArrayList arrayList422222222222222222222 = arrayList2;
                T = catalogBlockDto.T();
                if (T == null) {
                }
                if (map == null) {
                }
                LinkedHashMap linkedHashMap1322222222222222222222 = new LinkedHashMap(map);
                CatalogBlockDataTypeDto l0722222222222222222222 = catalogBlockDto.l0();
                M = catalogBlockDto.M();
                LinkedHashMap linkedHashMap1422222222222222222222 = new LinkedHashMap();
                if (M != null) {
                }
                return new CatalogBlockItemsData(a322222222222222222222, arrayList322222222222222222222, linkedHashMap, linkedHashMap3, linkedHashMap4, linkedHashMap922222222222222222222, linkedHashMap1122222222222222222222, linkedHashMap1222222222222222222222, arrayList422222222222222222222, linkedHashMap1322222222222222222222, null, linkedHashMap1422222222222222222222, 1024, null);
            case 17:
                i2 = catalogBlockDto.D1();
                if (i2 == null) {
                }
                CatalogDataType a3222222222222222222222 = a4a.a(catalogBlockDto.l0());
                ArrayList arrayList3222222222222222222222 = new ArrayList(i2);
                CatalogBlockDataTypeDto l05222222222222222222222 = catalogBlockDto.l0();
                V0 = catalogBlockDto.V0();
                i = a.$EnumSwitchMapping$0[l05222222222222222222222.ordinal()];
                if (i != 10) {
                }
                LinkedHashMap linkedHashMap7222222222222222222222 = new LinkedHashMap();
                it = V0.iterator();
                while (it.hasNext()) {
                }
                linkedHashMap = new LinkedHashMap(linkedHashMap7222222222222222222222);
                if (linkedHashMap == null) {
                }
                CatalogBlockDataTypeDto l06222222222222222222222 = catalogBlockDto.l0();
                w0 = catalogBlockDto.w0();
                hpu hpuVar222222222222222222222 = new hpu();
                i3 = a.$EnumSwitchMapping$0[l06222222222222222222222.ordinal()];
                if (i3 != 15) {
                }
                a2a a2aVar222222222222222222222 = new a2a(1, hpuVar222222222222222222222, hpu.class, "map", "map(Lcom/vk/api/generated/catalog/dto/CatalogEntityGroupsItemDto;)Lcom/vk/dto/group/GroupsEntityCatalogItem;", 0, 0);
                LinkedHashMap linkedHashMap8222222222222222222222 = new LinkedHashMap();
                it2 = w0.iterator();
                while (it2.hasNext()) {
                }
                linkedHashMap2 = new LinkedHashMap(linkedHashMap8222222222222222222222);
                if (linkedHashMap2 == null) {
                }
                LinkedHashMap linkedHashMap9222222222222222222222 = linkedHashMap2;
                l0 = catalogBlockDto.l0();
                List<CatalogSearchAuthorItemDto> y2222222222222222222222 = catalogBlockDto.y2();
                if (l0 == CatalogBlockDataTypeDto.SEARCH_AUTHORS) {
                }
                l02 = catalogBlockDto.l0();
                List<CatalogGameItemDto> H0222222222222222222222 = catalogBlockDto.H0();
                if (l02 == CatalogBlockDataTypeDto.GAMES) {
                }
                String str2222222222222222222222 = str;
                l03 = catalogBlockDto.l0();
                List<CatalogGroupCategoryMetaItemDto> N0222222222222222222222 = catalogBlockDto.N0();
                t2a t2aVar222222222222222222222 = new t2a();
                if (l03 != CatalogBlockDataTypeDto.GROUPS_CATEGORY_ITEMS) {
                }
                LinkedHashMap linkedHashMap11222222222222222222222 = linkedHashMap5;
                l04 = catalogBlockDto.l0();
                List<CatalogMiniAppContentItemDto> E1222222222222222222222 = catalogBlockDto.E1();
                if (l04 == CatalogBlockDataTypeDto.MINI_APPS_CONTENT) {
                }
                LinkedHashMap linkedHashMap12222222222222222222222 = linkedHashMap6;
                i4 = a.$EnumSwitchMapping$0[catalogBlockDto.l0().ordinal()];
                if (i4 != 10) {
                }
                P0 = catalogBlockDto.P0();
                if (P0 == null) {
                }
                if (r1 == 0) {
                }
                arrayList2 = new ArrayList((Collection) r1);
                if (arrayList2 == null) {
                }
                ArrayList arrayList4222222222222222222222 = arrayList2;
                T = catalogBlockDto.T();
                if (T == null) {
                }
                if (map == null) {
                }
                LinkedHashMap linkedHashMap13222222222222222222222 = new LinkedHashMap(map);
                CatalogBlockDataTypeDto l07222222222222222222222 = catalogBlockDto.l0();
                M = catalogBlockDto.M();
                LinkedHashMap linkedHashMap14222222222222222222222 = new LinkedHashMap();
                if (M != null) {
                }
                return new CatalogBlockItemsData(a3222222222222222222222, arrayList3222222222222222222222, linkedHashMap, linkedHashMap3, linkedHashMap4, linkedHashMap9222222222222222222222, linkedHashMap11222222222222222222222, linkedHashMap12222222222222222222222, arrayList4222222222222222222222, linkedHashMap13222222222222222222222, null, linkedHashMap14222222222222222222222, 1024, null);
            case 18:
                i2 = catalogBlockDto.l2();
                if (i2 == null) {
                }
                CatalogDataType a32222222222222222222222 = a4a.a(catalogBlockDto.l0());
                ArrayList arrayList32222222222222222222222 = new ArrayList(i2);
                CatalogBlockDataTypeDto l052222222222222222222222 = catalogBlockDto.l0();
                V0 = catalogBlockDto.V0();
                i = a.$EnumSwitchMapping$0[l052222222222222222222222.ordinal()];
                if (i != 10) {
                }
                LinkedHashMap linkedHashMap72222222222222222222222 = new LinkedHashMap();
                it = V0.iterator();
                while (it.hasNext()) {
                }
                linkedHashMap = new LinkedHashMap(linkedHashMap72222222222222222222222);
                if (linkedHashMap == null) {
                }
                CatalogBlockDataTypeDto l062222222222222222222222 = catalogBlockDto.l0();
                w0 = catalogBlockDto.w0();
                hpu hpuVar2222222222222222222222 = new hpu();
                i3 = a.$EnumSwitchMapping$0[l062222222222222222222222.ordinal()];
                if (i3 != 15) {
                }
                a2a a2aVar2222222222222222222222 = new a2a(1, hpuVar2222222222222222222222, hpu.class, "map", "map(Lcom/vk/api/generated/catalog/dto/CatalogEntityGroupsItemDto;)Lcom/vk/dto/group/GroupsEntityCatalogItem;", 0, 0);
                LinkedHashMap linkedHashMap82222222222222222222222 = new LinkedHashMap();
                it2 = w0.iterator();
                while (it2.hasNext()) {
                }
                linkedHashMap2 = new LinkedHashMap(linkedHashMap82222222222222222222222);
                if (linkedHashMap2 == null) {
                }
                LinkedHashMap linkedHashMap92222222222222222222222 = linkedHashMap2;
                l0 = catalogBlockDto.l0();
                List<CatalogSearchAuthorItemDto> y22222222222222222222222 = catalogBlockDto.y2();
                if (l0 == CatalogBlockDataTypeDto.SEARCH_AUTHORS) {
                }
                l02 = catalogBlockDto.l0();
                List<CatalogGameItemDto> H02222222222222222222222 = catalogBlockDto.H0();
                if (l02 == CatalogBlockDataTypeDto.GAMES) {
                }
                String str22222222222222222222222 = str;
                l03 = catalogBlockDto.l0();
                List<CatalogGroupCategoryMetaItemDto> N02222222222222222222222 = catalogBlockDto.N0();
                t2a t2aVar2222222222222222222222 = new t2a();
                if (l03 != CatalogBlockDataTypeDto.GROUPS_CATEGORY_ITEMS) {
                }
                LinkedHashMap linkedHashMap112222222222222222222222 = linkedHashMap5;
                l04 = catalogBlockDto.l0();
                List<CatalogMiniAppContentItemDto> E12222222222222222222222 = catalogBlockDto.E1();
                if (l04 == CatalogBlockDataTypeDto.MINI_APPS_CONTENT) {
                }
                LinkedHashMap linkedHashMap122222222222222222222222 = linkedHashMap6;
                i4 = a.$EnumSwitchMapping$0[catalogBlockDto.l0().ordinal()];
                if (i4 != 10) {
                }
                P0 = catalogBlockDto.P0();
                if (P0 == null) {
                }
                if (r1 == 0) {
                }
                arrayList2 = new ArrayList((Collection) r1);
                if (arrayList2 == null) {
                }
                ArrayList arrayList42222222222222222222222 = arrayList2;
                T = catalogBlockDto.T();
                if (T == null) {
                }
                if (map == null) {
                }
                LinkedHashMap linkedHashMap132222222222222222222222 = new LinkedHashMap(map);
                CatalogBlockDataTypeDto l072222222222222222222222 = catalogBlockDto.l0();
                M = catalogBlockDto.M();
                LinkedHashMap linkedHashMap142222222222222222222222 = new LinkedHashMap();
                if (M != null) {
                }
                return new CatalogBlockItemsData(a32222222222222222222222, arrayList32222222222222222222222, linkedHashMap, linkedHashMap3, linkedHashMap4, linkedHashMap92222222222222222222222, linkedHashMap112222222222222222222222, linkedHashMap122222222222222222222222, arrayList42222222222222222222222, linkedHashMap132222222222222222222222, null, linkedHashMap142222222222222222222222, 1024, null);
            case 19:
                i2 = catalogBlockDto.o();
                if (i2 == null) {
                }
                CatalogDataType a322222222222222222222222 = a4a.a(catalogBlockDto.l0());
                ArrayList arrayList322222222222222222222222 = new ArrayList(i2);
                CatalogBlockDataTypeDto l0522222222222222222222222 = catalogBlockDto.l0();
                V0 = catalogBlockDto.V0();
                i = a.$EnumSwitchMapping$0[l0522222222222222222222222.ordinal()];
                if (i != 10) {
                }
                LinkedHashMap linkedHashMap722222222222222222222222 = new LinkedHashMap();
                it = V0.iterator();
                while (it.hasNext()) {
                }
                linkedHashMap = new LinkedHashMap(linkedHashMap722222222222222222222222);
                if (linkedHashMap == null) {
                }
                CatalogBlockDataTypeDto l0622222222222222222222222 = catalogBlockDto.l0();
                w0 = catalogBlockDto.w0();
                hpu hpuVar22222222222222222222222 = new hpu();
                i3 = a.$EnumSwitchMapping$0[l0622222222222222222222222.ordinal()];
                if (i3 != 15) {
                }
                a2a a2aVar22222222222222222222222 = new a2a(1, hpuVar22222222222222222222222, hpu.class, "map", "map(Lcom/vk/api/generated/catalog/dto/CatalogEntityGroupsItemDto;)Lcom/vk/dto/group/GroupsEntityCatalogItem;", 0, 0);
                LinkedHashMap linkedHashMap822222222222222222222222 = new LinkedHashMap();
                it2 = w0.iterator();
                while (it2.hasNext()) {
                }
                linkedHashMap2 = new LinkedHashMap(linkedHashMap822222222222222222222222);
                if (linkedHashMap2 == null) {
                }
                LinkedHashMap linkedHashMap922222222222222222222222 = linkedHashMap2;
                l0 = catalogBlockDto.l0();
                List<CatalogSearchAuthorItemDto> y222222222222222222222222 = catalogBlockDto.y2();
                if (l0 == CatalogBlockDataTypeDto.SEARCH_AUTHORS) {
                }
                l02 = catalogBlockDto.l0();
                List<CatalogGameItemDto> H022222222222222222222222 = catalogBlockDto.H0();
                if (l02 == CatalogBlockDataTypeDto.GAMES) {
                }
                String str222222222222222222222222 = str;
                l03 = catalogBlockDto.l0();
                List<CatalogGroupCategoryMetaItemDto> N022222222222222222222222 = catalogBlockDto.N0();
                t2a t2aVar22222222222222222222222 = new t2a();
                if (l03 != CatalogBlockDataTypeDto.GROUPS_CATEGORY_ITEMS) {
                }
                LinkedHashMap linkedHashMap1122222222222222222222222 = linkedHashMap5;
                l04 = catalogBlockDto.l0();
                List<CatalogMiniAppContentItemDto> E122222222222222222222222 = catalogBlockDto.E1();
                if (l04 == CatalogBlockDataTypeDto.MINI_APPS_CONTENT) {
                }
                LinkedHashMap linkedHashMap1222222222222222222222222 = linkedHashMap6;
                i4 = a.$EnumSwitchMapping$0[catalogBlockDto.l0().ordinal()];
                if (i4 != 10) {
                }
                P0 = catalogBlockDto.P0();
                if (P0 == null) {
                }
                if (r1 == 0) {
                }
                arrayList2 = new ArrayList((Collection) r1);
                if (arrayList2 == null) {
                }
                ArrayList arrayList422222222222222222222222 = arrayList2;
                T = catalogBlockDto.T();
                if (T == null) {
                }
                if (map == null) {
                }
                LinkedHashMap linkedHashMap1322222222222222222222222 = new LinkedHashMap(map);
                CatalogBlockDataTypeDto l0722222222222222222222222 = catalogBlockDto.l0();
                M = catalogBlockDto.M();
                LinkedHashMap linkedHashMap1422222222222222222222222 = new LinkedHashMap();
                if (M != null) {
                }
                return new CatalogBlockItemsData(a322222222222222222222222, arrayList322222222222222222222222, linkedHashMap, linkedHashMap3, linkedHashMap4, linkedHashMap922222222222222222222222, linkedHashMap1122222222222222222222222, linkedHashMap1222222222222222222222222, arrayList422222222222222222222222, linkedHashMap1322222222222222222222222, null, linkedHashMap1422222222222222222222222, 1024, null);
            case 20:
                i2 = catalogBlockDto.N1();
                if (i2 == null) {
                }
                CatalogDataType a3222222222222222222222222 = a4a.a(catalogBlockDto.l0());
                ArrayList arrayList3222222222222222222222222 = new ArrayList(i2);
                CatalogBlockDataTypeDto l05222222222222222222222222 = catalogBlockDto.l0();
                V0 = catalogBlockDto.V0();
                i = a.$EnumSwitchMapping$0[l05222222222222222222222222.ordinal()];
                if (i != 10) {
                }
                LinkedHashMap linkedHashMap7222222222222222222222222 = new LinkedHashMap();
                it = V0.iterator();
                while (it.hasNext()) {
                }
                linkedHashMap = new LinkedHashMap(linkedHashMap7222222222222222222222222);
                if (linkedHashMap == null) {
                }
                CatalogBlockDataTypeDto l06222222222222222222222222 = catalogBlockDto.l0();
                w0 = catalogBlockDto.w0();
                hpu hpuVar222222222222222222222222 = new hpu();
                i3 = a.$EnumSwitchMapping$0[l06222222222222222222222222.ordinal()];
                if (i3 != 15) {
                }
                a2a a2aVar222222222222222222222222 = new a2a(1, hpuVar222222222222222222222222, hpu.class, "map", "map(Lcom/vk/api/generated/catalog/dto/CatalogEntityGroupsItemDto;)Lcom/vk/dto/group/GroupsEntityCatalogItem;", 0, 0);
                LinkedHashMap linkedHashMap8222222222222222222222222 = new LinkedHashMap();
                it2 = w0.iterator();
                while (it2.hasNext()) {
                }
                linkedHashMap2 = new LinkedHashMap(linkedHashMap8222222222222222222222222);
                if (linkedHashMap2 == null) {
                }
                LinkedHashMap linkedHashMap9222222222222222222222222 = linkedHashMap2;
                l0 = catalogBlockDto.l0();
                List<CatalogSearchAuthorItemDto> y2222222222222222222222222 = catalogBlockDto.y2();
                if (l0 == CatalogBlockDataTypeDto.SEARCH_AUTHORS) {
                }
                l02 = catalogBlockDto.l0();
                List<CatalogGameItemDto> H0222222222222222222222222 = catalogBlockDto.H0();
                if (l02 == CatalogBlockDataTypeDto.GAMES) {
                }
                String str2222222222222222222222222 = str;
                l03 = catalogBlockDto.l0();
                List<CatalogGroupCategoryMetaItemDto> N0222222222222222222222222 = catalogBlockDto.N0();
                t2a t2aVar222222222222222222222222 = new t2a();
                if (l03 != CatalogBlockDataTypeDto.GROUPS_CATEGORY_ITEMS) {
                }
                LinkedHashMap linkedHashMap11222222222222222222222222 = linkedHashMap5;
                l04 = catalogBlockDto.l0();
                List<CatalogMiniAppContentItemDto> E1222222222222222222222222 = catalogBlockDto.E1();
                if (l04 == CatalogBlockDataTypeDto.MINI_APPS_CONTENT) {
                }
                LinkedHashMap linkedHashMap12222222222222222222222222 = linkedHashMap6;
                i4 = a.$EnumSwitchMapping$0[catalogBlockDto.l0().ordinal()];
                if (i4 != 10) {
                }
                P0 = catalogBlockDto.P0();
                if (P0 == null) {
                }
                if (r1 == 0) {
                }
                arrayList2 = new ArrayList((Collection) r1);
                if (arrayList2 == null) {
                }
                ArrayList arrayList4222222222222222222222222 = arrayList2;
                T = catalogBlockDto.T();
                if (T == null) {
                }
                if (map == null) {
                }
                LinkedHashMap linkedHashMap13222222222222222222222222 = new LinkedHashMap(map);
                CatalogBlockDataTypeDto l07222222222222222222222222 = catalogBlockDto.l0();
                M = catalogBlockDto.M();
                LinkedHashMap linkedHashMap14222222222222222222222222 = new LinkedHashMap();
                if (M != null) {
                }
                return new CatalogBlockItemsData(a3222222222222222222222222, arrayList3222222222222222222222222, linkedHashMap, linkedHashMap3, linkedHashMap4, linkedHashMap9222222222222222222222222, linkedHashMap11222222222222222222222222, linkedHashMap12222222222222222222222222, arrayList4222222222222222222222222, linkedHashMap13222222222222222222222222, null, linkedHashMap14222222222222222222222222, 1024, null);
            case 21:
                i2 = catalogBlockDto.j();
                if (i2 == null) {
                }
                CatalogDataType a32222222222222222222222222 = a4a.a(catalogBlockDto.l0());
                ArrayList arrayList32222222222222222222222222 = new ArrayList(i2);
                CatalogBlockDataTypeDto l052222222222222222222222222 = catalogBlockDto.l0();
                V0 = catalogBlockDto.V0();
                i = a.$EnumSwitchMapping$0[l052222222222222222222222222.ordinal()];
                if (i != 10) {
                }
                LinkedHashMap linkedHashMap72222222222222222222222222 = new LinkedHashMap();
                it = V0.iterator();
                while (it.hasNext()) {
                }
                linkedHashMap = new LinkedHashMap(linkedHashMap72222222222222222222222222);
                if (linkedHashMap == null) {
                }
                CatalogBlockDataTypeDto l062222222222222222222222222 = catalogBlockDto.l0();
                w0 = catalogBlockDto.w0();
                hpu hpuVar2222222222222222222222222 = new hpu();
                i3 = a.$EnumSwitchMapping$0[l062222222222222222222222222.ordinal()];
                if (i3 != 15) {
                }
                a2a a2aVar2222222222222222222222222 = new a2a(1, hpuVar2222222222222222222222222, hpu.class, "map", "map(Lcom/vk/api/generated/catalog/dto/CatalogEntityGroupsItemDto;)Lcom/vk/dto/group/GroupsEntityCatalogItem;", 0, 0);
                LinkedHashMap linkedHashMap82222222222222222222222222 = new LinkedHashMap();
                it2 = w0.iterator();
                while (it2.hasNext()) {
                }
                linkedHashMap2 = new LinkedHashMap(linkedHashMap82222222222222222222222222);
                if (linkedHashMap2 == null) {
                }
                LinkedHashMap linkedHashMap92222222222222222222222222 = linkedHashMap2;
                l0 = catalogBlockDto.l0();
                List<CatalogSearchAuthorItemDto> y22222222222222222222222222 = catalogBlockDto.y2();
                if (l0 == CatalogBlockDataTypeDto.SEARCH_AUTHORS) {
                }
                l02 = catalogBlockDto.l0();
                List<CatalogGameItemDto> H02222222222222222222222222 = catalogBlockDto.H0();
                if (l02 == CatalogBlockDataTypeDto.GAMES) {
                }
                String str22222222222222222222222222 = str;
                l03 = catalogBlockDto.l0();
                List<CatalogGroupCategoryMetaItemDto> N02222222222222222222222222 = catalogBlockDto.N0();
                t2a t2aVar2222222222222222222222222 = new t2a();
                if (l03 != CatalogBlockDataTypeDto.GROUPS_CATEGORY_ITEMS) {
                }
                LinkedHashMap linkedHashMap112222222222222222222222222 = linkedHashMap5;
                l04 = catalogBlockDto.l0();
                List<CatalogMiniAppContentItemDto> E12222222222222222222222222 = catalogBlockDto.E1();
                if (l04 == CatalogBlockDataTypeDto.MINI_APPS_CONTENT) {
                }
                LinkedHashMap linkedHashMap122222222222222222222222222 = linkedHashMap6;
                i4 = a.$EnumSwitchMapping$0[catalogBlockDto.l0().ordinal()];
                if (i4 != 10) {
                }
                P0 = catalogBlockDto.P0();
                if (P0 == null) {
                }
                if (r1 == 0) {
                }
                arrayList2 = new ArrayList((Collection) r1);
                if (arrayList2 == null) {
                }
                ArrayList arrayList42222222222222222222222222 = arrayList2;
                T = catalogBlockDto.T();
                if (T == null) {
                }
                if (map == null) {
                }
                LinkedHashMap linkedHashMap132222222222222222222222222 = new LinkedHashMap(map);
                CatalogBlockDataTypeDto l072222222222222222222222222 = catalogBlockDto.l0();
                M = catalogBlockDto.M();
                LinkedHashMap linkedHashMap142222222222222222222222222 = new LinkedHashMap();
                if (M != null) {
                }
                return new CatalogBlockItemsData(a32222222222222222222222222, arrayList32222222222222222222222222, linkedHashMap, linkedHashMap3, linkedHashMap4, linkedHashMap92222222222222222222222222, linkedHashMap112222222222222222222222222, linkedHashMap122222222222222222222222222, arrayList42222222222222222222222222, linkedHashMap132222222222222222222222222, null, linkedHashMap142222222222222222222222222, 1024, null);
            case 22:
                List<Integer> a0 = catalogBlockDto.a0();
                if (a0 != null) {
                    List<Integer> list12 = a0;
                    arrayList = new ArrayList(c5g.u(list12, 10));
                    Iterator it12 = list12.iterator();
                    while (it12.hasNext()) {
                        kq.d((Number) it12.next(), arrayList);
                    }
                    i2 = arrayList;
                    if (i2 == null) {
                    }
                    CatalogDataType a322222222222222222222222222 = a4a.a(catalogBlockDto.l0());
                    ArrayList arrayList322222222222222222222222222 = new ArrayList(i2);
                    CatalogBlockDataTypeDto l0522222222222222222222222222 = catalogBlockDto.l0();
                    V0 = catalogBlockDto.V0();
                    i = a.$EnumSwitchMapping$0[l0522222222222222222222222222.ordinal()];
                    if (i != 10) {
                    }
                    LinkedHashMap linkedHashMap722222222222222222222222222 = new LinkedHashMap();
                    it = V0.iterator();
                    while (it.hasNext()) {
                    }
                    linkedHashMap = new LinkedHashMap(linkedHashMap722222222222222222222222222);
                    if (linkedHashMap == null) {
                    }
                    CatalogBlockDataTypeDto l0622222222222222222222222222 = catalogBlockDto.l0();
                    w0 = catalogBlockDto.w0();
                    hpu hpuVar22222222222222222222222222 = new hpu();
                    i3 = a.$EnumSwitchMapping$0[l0622222222222222222222222222.ordinal()];
                    if (i3 != 15) {
                    }
                    a2a a2aVar22222222222222222222222222 = new a2a(1, hpuVar22222222222222222222222222, hpu.class, "map", "map(Lcom/vk/api/generated/catalog/dto/CatalogEntityGroupsItemDto;)Lcom/vk/dto/group/GroupsEntityCatalogItem;", 0, 0);
                    LinkedHashMap linkedHashMap822222222222222222222222222 = new LinkedHashMap();
                    it2 = w0.iterator();
                    while (it2.hasNext()) {
                    }
                    linkedHashMap2 = new LinkedHashMap(linkedHashMap822222222222222222222222222);
                    if (linkedHashMap2 == null) {
                    }
                    LinkedHashMap linkedHashMap922222222222222222222222222 = linkedHashMap2;
                    l0 = catalogBlockDto.l0();
                    List<CatalogSearchAuthorItemDto> y222222222222222222222222222 = catalogBlockDto.y2();
                    if (l0 == CatalogBlockDataTypeDto.SEARCH_AUTHORS) {
                    }
                    l02 = catalogBlockDto.l0();
                    List<CatalogGameItemDto> H022222222222222222222222222 = catalogBlockDto.H0();
                    if (l02 == CatalogBlockDataTypeDto.GAMES) {
                    }
                    String str222222222222222222222222222 = str;
                    l03 = catalogBlockDto.l0();
                    List<CatalogGroupCategoryMetaItemDto> N022222222222222222222222222 = catalogBlockDto.N0();
                    t2a t2aVar22222222222222222222222222 = new t2a();
                    if (l03 != CatalogBlockDataTypeDto.GROUPS_CATEGORY_ITEMS) {
                    }
                    LinkedHashMap linkedHashMap1122222222222222222222222222 = linkedHashMap5;
                    l04 = catalogBlockDto.l0();
                    List<CatalogMiniAppContentItemDto> E122222222222222222222222222 = catalogBlockDto.E1();
                    if (l04 == CatalogBlockDataTypeDto.MINI_APPS_CONTENT) {
                    }
                    LinkedHashMap linkedHashMap1222222222222222222222222222 = linkedHashMap6;
                    i4 = a.$EnumSwitchMapping$0[catalogBlockDto.l0().ordinal()];
                    if (i4 != 10) {
                    }
                    P0 = catalogBlockDto.P0();
                    if (P0 == null) {
                    }
                    if (r1 == 0) {
                    }
                    arrayList2 = new ArrayList((Collection) r1);
                    if (arrayList2 == null) {
                    }
                    ArrayList arrayList422222222222222222222222222 = arrayList2;
                    T = catalogBlockDto.T();
                    if (T == null) {
                    }
                    if (map == null) {
                    }
                    LinkedHashMap linkedHashMap1322222222222222222222222222 = new LinkedHashMap(map);
                    CatalogBlockDataTypeDto l0722222222222222222222222222 = catalogBlockDto.l0();
                    M = catalogBlockDto.M();
                    LinkedHashMap linkedHashMap1422222222222222222222222222 = new LinkedHashMap();
                    if (M != null) {
                    }
                    return new CatalogBlockItemsData(a322222222222222222222222222, arrayList322222222222222222222222222, linkedHashMap, linkedHashMap3, linkedHashMap4, linkedHashMap922222222222222222222222222, linkedHashMap1122222222222222222222222222, linkedHashMap1222222222222222222222222222, arrayList422222222222222222222222222, linkedHashMap1322222222222222222222222222, null, linkedHashMap1422222222222222222222222222, 1024, null);
                }
                i2 = null;
                if (i2 == null) {
                }
                CatalogDataType a3222222222222222222222222222 = a4a.a(catalogBlockDto.l0());
                ArrayList arrayList3222222222222222222222222222 = new ArrayList(i2);
                CatalogBlockDataTypeDto l05222222222222222222222222222 = catalogBlockDto.l0();
                V0 = catalogBlockDto.V0();
                i = a.$EnumSwitchMapping$0[l05222222222222222222222222222.ordinal()];
                if (i != 10) {
                }
                LinkedHashMap linkedHashMap7222222222222222222222222222 = new LinkedHashMap();
                it = V0.iterator();
                while (it.hasNext()) {
                }
                linkedHashMap = new LinkedHashMap(linkedHashMap7222222222222222222222222222);
                if (linkedHashMap == null) {
                }
                CatalogBlockDataTypeDto l06222222222222222222222222222 = catalogBlockDto.l0();
                w0 = catalogBlockDto.w0();
                hpu hpuVar222222222222222222222222222 = new hpu();
                i3 = a.$EnumSwitchMapping$0[l06222222222222222222222222222.ordinal()];
                if (i3 != 15) {
                }
                a2a a2aVar222222222222222222222222222 = new a2a(1, hpuVar222222222222222222222222222, hpu.class, "map", "map(Lcom/vk/api/generated/catalog/dto/CatalogEntityGroupsItemDto;)Lcom/vk/dto/group/GroupsEntityCatalogItem;", 0, 0);
                LinkedHashMap linkedHashMap8222222222222222222222222222 = new LinkedHashMap();
                it2 = w0.iterator();
                while (it2.hasNext()) {
                }
                linkedHashMap2 = new LinkedHashMap(linkedHashMap8222222222222222222222222222);
                if (linkedHashMap2 == null) {
                }
                LinkedHashMap linkedHashMap9222222222222222222222222222 = linkedHashMap2;
                l0 = catalogBlockDto.l0();
                List<CatalogSearchAuthorItemDto> y2222222222222222222222222222 = catalogBlockDto.y2();
                if (l0 == CatalogBlockDataTypeDto.SEARCH_AUTHORS) {
                }
                l02 = catalogBlockDto.l0();
                List<CatalogGameItemDto> H0222222222222222222222222222 = catalogBlockDto.H0();
                if (l02 == CatalogBlockDataTypeDto.GAMES) {
                }
                String str2222222222222222222222222222 = str;
                l03 = catalogBlockDto.l0();
                List<CatalogGroupCategoryMetaItemDto> N0222222222222222222222222222 = catalogBlockDto.N0();
                t2a t2aVar222222222222222222222222222 = new t2a();
                if (l03 != CatalogBlockDataTypeDto.GROUPS_CATEGORY_ITEMS) {
                }
                LinkedHashMap linkedHashMap11222222222222222222222222222 = linkedHashMap5;
                l04 = catalogBlockDto.l0();
                List<CatalogMiniAppContentItemDto> E1222222222222222222222222222 = catalogBlockDto.E1();
                if (l04 == CatalogBlockDataTypeDto.MINI_APPS_CONTENT) {
                }
                LinkedHashMap linkedHashMap12222222222222222222222222222 = linkedHashMap6;
                i4 = a.$EnumSwitchMapping$0[catalogBlockDto.l0().ordinal()];
                if (i4 != 10) {
                }
                P0 = catalogBlockDto.P0();
                if (P0 == null) {
                }
                if (r1 == 0) {
                }
                arrayList2 = new ArrayList((Collection) r1);
                if (arrayList2 == null) {
                }
                ArrayList arrayList4222222222222222222222222222 = arrayList2;
                T = catalogBlockDto.T();
                if (T == null) {
                }
                if (map == null) {
                }
                LinkedHashMap linkedHashMap13222222222222222222222222222 = new LinkedHashMap(map);
                CatalogBlockDataTypeDto l07222222222222222222222222222 = catalogBlockDto.l0();
                M = catalogBlockDto.M();
                LinkedHashMap linkedHashMap14222222222222222222222222222 = new LinkedHashMap();
                if (M != null) {
                }
                return new CatalogBlockItemsData(a3222222222222222222222222222, arrayList3222222222222222222222222222, linkedHashMap, linkedHashMap3, linkedHashMap4, linkedHashMap9222222222222222222222222222, linkedHashMap11222222222222222222222222222, linkedHashMap12222222222222222222222222222, arrayList4222222222222222222222222222, linkedHashMap13222222222222222222222222222, null, linkedHashMap14222222222222222222222222222, 1024, null);
            case 23:
                i2 = catalogBlockDto.o2();
                if (i2 == null) {
                }
                CatalogDataType a32222222222222222222222222222 = a4a.a(catalogBlockDto.l0());
                ArrayList arrayList32222222222222222222222222222 = new ArrayList(i2);
                CatalogBlockDataTypeDto l052222222222222222222222222222 = catalogBlockDto.l0();
                V0 = catalogBlockDto.V0();
                i = a.$EnumSwitchMapping$0[l052222222222222222222222222222.ordinal()];
                if (i != 10) {
                }
                LinkedHashMap linkedHashMap72222222222222222222222222222 = new LinkedHashMap();
                it = V0.iterator();
                while (it.hasNext()) {
                }
                linkedHashMap = new LinkedHashMap(linkedHashMap72222222222222222222222222222);
                if (linkedHashMap == null) {
                }
                CatalogBlockDataTypeDto l062222222222222222222222222222 = catalogBlockDto.l0();
                w0 = catalogBlockDto.w0();
                hpu hpuVar2222222222222222222222222222 = new hpu();
                i3 = a.$EnumSwitchMapping$0[l062222222222222222222222222222.ordinal()];
                if (i3 != 15) {
                }
                a2a a2aVar2222222222222222222222222222 = new a2a(1, hpuVar2222222222222222222222222222, hpu.class, "map", "map(Lcom/vk/api/generated/catalog/dto/CatalogEntityGroupsItemDto;)Lcom/vk/dto/group/GroupsEntityCatalogItem;", 0, 0);
                LinkedHashMap linkedHashMap82222222222222222222222222222 = new LinkedHashMap();
                it2 = w0.iterator();
                while (it2.hasNext()) {
                }
                linkedHashMap2 = new LinkedHashMap(linkedHashMap82222222222222222222222222222);
                if (linkedHashMap2 == null) {
                }
                LinkedHashMap linkedHashMap92222222222222222222222222222 = linkedHashMap2;
                l0 = catalogBlockDto.l0();
                List<CatalogSearchAuthorItemDto> y22222222222222222222222222222 = catalogBlockDto.y2();
                if (l0 == CatalogBlockDataTypeDto.SEARCH_AUTHORS) {
                }
                l02 = catalogBlockDto.l0();
                List<CatalogGameItemDto> H02222222222222222222222222222 = catalogBlockDto.H0();
                if (l02 == CatalogBlockDataTypeDto.GAMES) {
                }
                String str22222222222222222222222222222 = str;
                l03 = catalogBlockDto.l0();
                List<CatalogGroupCategoryMetaItemDto> N02222222222222222222222222222 = catalogBlockDto.N0();
                t2a t2aVar2222222222222222222222222222 = new t2a();
                if (l03 != CatalogBlockDataTypeDto.GROUPS_CATEGORY_ITEMS) {
                }
                LinkedHashMap linkedHashMap112222222222222222222222222222 = linkedHashMap5;
                l04 = catalogBlockDto.l0();
                List<CatalogMiniAppContentItemDto> E12222222222222222222222222222 = catalogBlockDto.E1();
                if (l04 == CatalogBlockDataTypeDto.MINI_APPS_CONTENT) {
                }
                LinkedHashMap linkedHashMap122222222222222222222222222222 = linkedHashMap6;
                i4 = a.$EnumSwitchMapping$0[catalogBlockDto.l0().ordinal()];
                if (i4 != 10) {
                }
                P0 = catalogBlockDto.P0();
                if (P0 == null) {
                }
                if (r1 == 0) {
                }
                arrayList2 = new ArrayList((Collection) r1);
                if (arrayList2 == null) {
                }
                ArrayList arrayList42222222222222222222222222222 = arrayList2;
                T = catalogBlockDto.T();
                if (T == null) {
                }
                if (map == null) {
                }
                LinkedHashMap linkedHashMap132222222222222222222222222222 = new LinkedHashMap(map);
                CatalogBlockDataTypeDto l072222222222222222222222222222 = catalogBlockDto.l0();
                M = catalogBlockDto.M();
                LinkedHashMap linkedHashMap142222222222222222222222222222 = new LinkedHashMap();
                if (M != null) {
                }
                return new CatalogBlockItemsData(a32222222222222222222222222222, arrayList32222222222222222222222222222, linkedHashMap, linkedHashMap3, linkedHashMap4, linkedHashMap92222222222222222222222222222, linkedHashMap112222222222222222222222222222, linkedHashMap122222222222222222222222222222, arrayList42222222222222222222222222222, linkedHashMap132222222222222222222222222222, null, linkedHashMap142222222222222222222222222222, 1024, null);
            case 24:
                i2 = catalogBlockDto.m2();
                if (i2 == null) {
                }
                CatalogDataType a322222222222222222222222222222 = a4a.a(catalogBlockDto.l0());
                ArrayList arrayList322222222222222222222222222222 = new ArrayList(i2);
                CatalogBlockDataTypeDto l0522222222222222222222222222222 = catalogBlockDto.l0();
                V0 = catalogBlockDto.V0();
                i = a.$EnumSwitchMapping$0[l0522222222222222222222222222222.ordinal()];
                if (i != 10) {
                }
                LinkedHashMap linkedHashMap722222222222222222222222222222 = new LinkedHashMap();
                it = V0.iterator();
                while (it.hasNext()) {
                }
                linkedHashMap = new LinkedHashMap(linkedHashMap722222222222222222222222222222);
                if (linkedHashMap == null) {
                }
                CatalogBlockDataTypeDto l0622222222222222222222222222222 = catalogBlockDto.l0();
                w0 = catalogBlockDto.w0();
                hpu hpuVar22222222222222222222222222222 = new hpu();
                i3 = a.$EnumSwitchMapping$0[l0622222222222222222222222222222.ordinal()];
                if (i3 != 15) {
                }
                a2a a2aVar22222222222222222222222222222 = new a2a(1, hpuVar22222222222222222222222222222, hpu.class, "map", "map(Lcom/vk/api/generated/catalog/dto/CatalogEntityGroupsItemDto;)Lcom/vk/dto/group/GroupsEntityCatalogItem;", 0, 0);
                LinkedHashMap linkedHashMap822222222222222222222222222222 = new LinkedHashMap();
                it2 = w0.iterator();
                while (it2.hasNext()) {
                }
                linkedHashMap2 = new LinkedHashMap(linkedHashMap822222222222222222222222222222);
                if (linkedHashMap2 == null) {
                }
                LinkedHashMap linkedHashMap922222222222222222222222222222 = linkedHashMap2;
                l0 = catalogBlockDto.l0();
                List<CatalogSearchAuthorItemDto> y222222222222222222222222222222 = catalogBlockDto.y2();
                if (l0 == CatalogBlockDataTypeDto.SEARCH_AUTHORS) {
                }
                l02 = catalogBlockDto.l0();
                List<CatalogGameItemDto> H022222222222222222222222222222 = catalogBlockDto.H0();
                if (l02 == CatalogBlockDataTypeDto.GAMES) {
                }
                String str222222222222222222222222222222 = str;
                l03 = catalogBlockDto.l0();
                List<CatalogGroupCategoryMetaItemDto> N022222222222222222222222222222 = catalogBlockDto.N0();
                t2a t2aVar22222222222222222222222222222 = new t2a();
                if (l03 != CatalogBlockDataTypeDto.GROUPS_CATEGORY_ITEMS) {
                }
                LinkedHashMap linkedHashMap1122222222222222222222222222222 = linkedHashMap5;
                l04 = catalogBlockDto.l0();
                List<CatalogMiniAppContentItemDto> E122222222222222222222222222222 = catalogBlockDto.E1();
                if (l04 == CatalogBlockDataTypeDto.MINI_APPS_CONTENT) {
                }
                LinkedHashMap linkedHashMap1222222222222222222222222222222 = linkedHashMap6;
                i4 = a.$EnumSwitchMapping$0[catalogBlockDto.l0().ordinal()];
                if (i4 != 10) {
                }
                P0 = catalogBlockDto.P0();
                if (P0 == null) {
                }
                if (r1 == 0) {
                }
                arrayList2 = new ArrayList((Collection) r1);
                if (arrayList2 == null) {
                }
                ArrayList arrayList422222222222222222222222222222 = arrayList2;
                T = catalogBlockDto.T();
                if (T == null) {
                }
                if (map == null) {
                }
                LinkedHashMap linkedHashMap1322222222222222222222222222222 = new LinkedHashMap(map);
                CatalogBlockDataTypeDto l0722222222222222222222222222222 = catalogBlockDto.l0();
                M = catalogBlockDto.M();
                LinkedHashMap linkedHashMap1422222222222222222222222222222 = new LinkedHashMap();
                if (M != null) {
                }
                return new CatalogBlockItemsData(a322222222222222222222222222222, arrayList322222222222222222222222222222, linkedHashMap, linkedHashMap3, linkedHashMap4, linkedHashMap922222222222222222222222222222, linkedHashMap1122222222222222222222222222222, linkedHashMap1222222222222222222222222222222, arrayList422222222222222222222222222222, linkedHashMap1322222222222222222222222222222, null, linkedHashMap1422222222222222222222222222222, 1024, null);
            case 25:
                i2 = catalogBlockDto.q2();
                if (i2 == null) {
                }
                CatalogDataType a3222222222222222222222222222222 = a4a.a(catalogBlockDto.l0());
                ArrayList arrayList3222222222222222222222222222222 = new ArrayList(i2);
                CatalogBlockDataTypeDto l05222222222222222222222222222222 = catalogBlockDto.l0();
                V0 = catalogBlockDto.V0();
                i = a.$EnumSwitchMapping$0[l05222222222222222222222222222222.ordinal()];
                if (i != 10) {
                }
                LinkedHashMap linkedHashMap7222222222222222222222222222222 = new LinkedHashMap();
                it = V0.iterator();
                while (it.hasNext()) {
                }
                linkedHashMap = new LinkedHashMap(linkedHashMap7222222222222222222222222222222);
                if (linkedHashMap == null) {
                }
                CatalogBlockDataTypeDto l06222222222222222222222222222222 = catalogBlockDto.l0();
                w0 = catalogBlockDto.w0();
                hpu hpuVar222222222222222222222222222222 = new hpu();
                i3 = a.$EnumSwitchMapping$0[l06222222222222222222222222222222.ordinal()];
                if (i3 != 15) {
                }
                a2a a2aVar222222222222222222222222222222 = new a2a(1, hpuVar222222222222222222222222222222, hpu.class, "map", "map(Lcom/vk/api/generated/catalog/dto/CatalogEntityGroupsItemDto;)Lcom/vk/dto/group/GroupsEntityCatalogItem;", 0, 0);
                LinkedHashMap linkedHashMap8222222222222222222222222222222 = new LinkedHashMap();
                it2 = w0.iterator();
                while (it2.hasNext()) {
                }
                linkedHashMap2 = new LinkedHashMap(linkedHashMap8222222222222222222222222222222);
                if (linkedHashMap2 == null) {
                }
                LinkedHashMap linkedHashMap9222222222222222222222222222222 = linkedHashMap2;
                l0 = catalogBlockDto.l0();
                List<CatalogSearchAuthorItemDto> y2222222222222222222222222222222 = catalogBlockDto.y2();
                if (l0 == CatalogBlockDataTypeDto.SEARCH_AUTHORS) {
                }
                l02 = catalogBlockDto.l0();
                List<CatalogGameItemDto> H0222222222222222222222222222222 = catalogBlockDto.H0();
                if (l02 == CatalogBlockDataTypeDto.GAMES) {
                }
                String str2222222222222222222222222222222 = str;
                l03 = catalogBlockDto.l0();
                List<CatalogGroupCategoryMetaItemDto> N0222222222222222222222222222222 = catalogBlockDto.N0();
                t2a t2aVar222222222222222222222222222222 = new t2a();
                if (l03 != CatalogBlockDataTypeDto.GROUPS_CATEGORY_ITEMS) {
                }
                LinkedHashMap linkedHashMap11222222222222222222222222222222 = linkedHashMap5;
                l04 = catalogBlockDto.l0();
                List<CatalogMiniAppContentItemDto> E1222222222222222222222222222222 = catalogBlockDto.E1();
                if (l04 == CatalogBlockDataTypeDto.MINI_APPS_CONTENT) {
                }
                LinkedHashMap linkedHashMap12222222222222222222222222222222 = linkedHashMap6;
                i4 = a.$EnumSwitchMapping$0[catalogBlockDto.l0().ordinal()];
                if (i4 != 10) {
                }
                P0 = catalogBlockDto.P0();
                if (P0 == null) {
                }
                if (r1 == 0) {
                }
                arrayList2 = new ArrayList((Collection) r1);
                if (arrayList2 == null) {
                }
                ArrayList arrayList4222222222222222222222222222222 = arrayList2;
                T = catalogBlockDto.T();
                if (T == null) {
                }
                if (map == null) {
                }
                LinkedHashMap linkedHashMap13222222222222222222222222222222 = new LinkedHashMap(map);
                CatalogBlockDataTypeDto l07222222222222222222222222222222 = catalogBlockDto.l0();
                M = catalogBlockDto.M();
                LinkedHashMap linkedHashMap14222222222222222222222222222222 = new LinkedHashMap();
                if (M != null) {
                }
                return new CatalogBlockItemsData(a3222222222222222222222222222222, arrayList3222222222222222222222222222222, linkedHashMap, linkedHashMap3, linkedHashMap4, linkedHashMap9222222222222222222222222222222, linkedHashMap11222222222222222222222222222222, linkedHashMap12222222222222222222222222222222, arrayList4222222222222222222222222222222, linkedHashMap13222222222222222222222222222222, null, linkedHashMap14222222222222222222222222222222, 1024, null);
            case 26:
                List<Integer> k = catalogBlockDto.k();
                if (k != null) {
                    List<Integer> list13 = k;
                    arrayList = new ArrayList(c5g.u(list13, 10));
                    Iterator it13 = list13.iterator();
                    while (it13.hasNext()) {
                        kq.d((Number) it13.next(), arrayList);
                    }
                    i2 = arrayList;
                    if (i2 == null) {
                    }
                    CatalogDataType a32222222222222222222222222222222 = a4a.a(catalogBlockDto.l0());
                    ArrayList arrayList32222222222222222222222222222222 = new ArrayList(i2);
                    CatalogBlockDataTypeDto l052222222222222222222222222222222 = catalogBlockDto.l0();
                    V0 = catalogBlockDto.V0();
                    i = a.$EnumSwitchMapping$0[l052222222222222222222222222222222.ordinal()];
                    if (i != 10) {
                    }
                    LinkedHashMap linkedHashMap72222222222222222222222222222222 = new LinkedHashMap();
                    it = V0.iterator();
                    while (it.hasNext()) {
                    }
                    linkedHashMap = new LinkedHashMap(linkedHashMap72222222222222222222222222222222);
                    if (linkedHashMap == null) {
                    }
                    CatalogBlockDataTypeDto l062222222222222222222222222222222 = catalogBlockDto.l0();
                    w0 = catalogBlockDto.w0();
                    hpu hpuVar2222222222222222222222222222222 = new hpu();
                    i3 = a.$EnumSwitchMapping$0[l062222222222222222222222222222222.ordinal()];
                    if (i3 != 15) {
                    }
                    a2a a2aVar2222222222222222222222222222222 = new a2a(1, hpuVar2222222222222222222222222222222, hpu.class, "map", "map(Lcom/vk/api/generated/catalog/dto/CatalogEntityGroupsItemDto;)Lcom/vk/dto/group/GroupsEntityCatalogItem;", 0, 0);
                    LinkedHashMap linkedHashMap82222222222222222222222222222222 = new LinkedHashMap();
                    it2 = w0.iterator();
                    while (it2.hasNext()) {
                    }
                    linkedHashMap2 = new LinkedHashMap(linkedHashMap82222222222222222222222222222222);
                    if (linkedHashMap2 == null) {
                    }
                    LinkedHashMap linkedHashMap92222222222222222222222222222222 = linkedHashMap2;
                    l0 = catalogBlockDto.l0();
                    List<CatalogSearchAuthorItemDto> y22222222222222222222222222222222 = catalogBlockDto.y2();
                    if (l0 == CatalogBlockDataTypeDto.SEARCH_AUTHORS) {
                    }
                    l02 = catalogBlockDto.l0();
                    List<CatalogGameItemDto> H02222222222222222222222222222222 = catalogBlockDto.H0();
                    if (l02 == CatalogBlockDataTypeDto.GAMES) {
                    }
                    String str22222222222222222222222222222222 = str;
                    l03 = catalogBlockDto.l0();
                    List<CatalogGroupCategoryMetaItemDto> N02222222222222222222222222222222 = catalogBlockDto.N0();
                    t2a t2aVar2222222222222222222222222222222 = new t2a();
                    if (l03 != CatalogBlockDataTypeDto.GROUPS_CATEGORY_ITEMS) {
                    }
                    LinkedHashMap linkedHashMap112222222222222222222222222222222 = linkedHashMap5;
                    l04 = catalogBlockDto.l0();
                    List<CatalogMiniAppContentItemDto> E12222222222222222222222222222222 = catalogBlockDto.E1();
                    if (l04 == CatalogBlockDataTypeDto.MINI_APPS_CONTENT) {
                    }
                    LinkedHashMap linkedHashMap122222222222222222222222222222222 = linkedHashMap6;
                    i4 = a.$EnumSwitchMapping$0[catalogBlockDto.l0().ordinal()];
                    if (i4 != 10) {
                    }
                    P0 = catalogBlockDto.P0();
                    if (P0 == null) {
                    }
                    if (r1 == 0) {
                    }
                    arrayList2 = new ArrayList((Collection) r1);
                    if (arrayList2 == null) {
                    }
                    ArrayList arrayList42222222222222222222222222222222 = arrayList2;
                    T = catalogBlockDto.T();
                    if (T == null) {
                    }
                    if (map == null) {
                    }
                    LinkedHashMap linkedHashMap132222222222222222222222222222222 = new LinkedHashMap(map);
                    CatalogBlockDataTypeDto l072222222222222222222222222222222 = catalogBlockDto.l0();
                    M = catalogBlockDto.M();
                    LinkedHashMap linkedHashMap142222222222222222222222222222222 = new LinkedHashMap();
                    if (M != null) {
                    }
                    return new CatalogBlockItemsData(a32222222222222222222222222222222, arrayList32222222222222222222222222222222, linkedHashMap, linkedHashMap3, linkedHashMap4, linkedHashMap92222222222222222222222222222222, linkedHashMap112222222222222222222222222222222, linkedHashMap122222222222222222222222222222222, arrayList42222222222222222222222222222222, linkedHashMap132222222222222222222222222222222, null, linkedHashMap142222222222222222222222222222222, 1024, null);
                }
                i2 = null;
                if (i2 == null) {
                }
                CatalogDataType a322222222222222222222222222222222 = a4a.a(catalogBlockDto.l0());
                ArrayList arrayList322222222222222222222222222222222 = new ArrayList(i2);
                CatalogBlockDataTypeDto l0522222222222222222222222222222222 = catalogBlockDto.l0();
                V0 = catalogBlockDto.V0();
                i = a.$EnumSwitchMapping$0[l0522222222222222222222222222222222.ordinal()];
                if (i != 10) {
                }
                LinkedHashMap linkedHashMap722222222222222222222222222222222 = new LinkedHashMap();
                it = V0.iterator();
                while (it.hasNext()) {
                }
                linkedHashMap = new LinkedHashMap(linkedHashMap722222222222222222222222222222222);
                if (linkedHashMap == null) {
                }
                CatalogBlockDataTypeDto l0622222222222222222222222222222222 = catalogBlockDto.l0();
                w0 = catalogBlockDto.w0();
                hpu hpuVar22222222222222222222222222222222 = new hpu();
                i3 = a.$EnumSwitchMapping$0[l0622222222222222222222222222222222.ordinal()];
                if (i3 != 15) {
                }
                a2a a2aVar22222222222222222222222222222222 = new a2a(1, hpuVar22222222222222222222222222222222, hpu.class, "map", "map(Lcom/vk/api/generated/catalog/dto/CatalogEntityGroupsItemDto;)Lcom/vk/dto/group/GroupsEntityCatalogItem;", 0, 0);
                LinkedHashMap linkedHashMap822222222222222222222222222222222 = new LinkedHashMap();
                it2 = w0.iterator();
                while (it2.hasNext()) {
                }
                linkedHashMap2 = new LinkedHashMap(linkedHashMap822222222222222222222222222222222);
                if (linkedHashMap2 == null) {
                }
                LinkedHashMap linkedHashMap922222222222222222222222222222222 = linkedHashMap2;
                l0 = catalogBlockDto.l0();
                List<CatalogSearchAuthorItemDto> y222222222222222222222222222222222 = catalogBlockDto.y2();
                if (l0 == CatalogBlockDataTypeDto.SEARCH_AUTHORS) {
                }
                l02 = catalogBlockDto.l0();
                List<CatalogGameItemDto> H022222222222222222222222222222222 = catalogBlockDto.H0();
                if (l02 == CatalogBlockDataTypeDto.GAMES) {
                }
                String str222222222222222222222222222222222 = str;
                l03 = catalogBlockDto.l0();
                List<CatalogGroupCategoryMetaItemDto> N022222222222222222222222222222222 = catalogBlockDto.N0();
                t2a t2aVar22222222222222222222222222222222 = new t2a();
                if (l03 != CatalogBlockDataTypeDto.GROUPS_CATEGORY_ITEMS) {
                }
                LinkedHashMap linkedHashMap1122222222222222222222222222222222 = linkedHashMap5;
                l04 = catalogBlockDto.l0();
                List<CatalogMiniAppContentItemDto> E122222222222222222222222222222222 = catalogBlockDto.E1();
                if (l04 == CatalogBlockDataTypeDto.MINI_APPS_CONTENT) {
                }
                LinkedHashMap linkedHashMap1222222222222222222222222222222222 = linkedHashMap6;
                i4 = a.$EnumSwitchMapping$0[catalogBlockDto.l0().ordinal()];
                if (i4 != 10) {
                }
                P0 = catalogBlockDto.P0();
                if (P0 == null) {
                }
                if (r1 == 0) {
                }
                arrayList2 = new ArrayList((Collection) r1);
                if (arrayList2 == null) {
                }
                ArrayList arrayList422222222222222222222222222222222 = arrayList2;
                T = catalogBlockDto.T();
                if (T == null) {
                }
                if (map == null) {
                }
                LinkedHashMap linkedHashMap1322222222222222222222222222222222 = new LinkedHashMap(map);
                CatalogBlockDataTypeDto l0722222222222222222222222222222222 = catalogBlockDto.l0();
                M = catalogBlockDto.M();
                LinkedHashMap linkedHashMap1422222222222222222222222222222222 = new LinkedHashMap();
                if (M != null) {
                }
                return new CatalogBlockItemsData(a322222222222222222222222222222222, arrayList322222222222222222222222222222222, linkedHashMap, linkedHashMap3, linkedHashMap4, linkedHashMap922222222222222222222222222222222, linkedHashMap1122222222222222222222222222222222, linkedHashMap1222222222222222222222222222222222, arrayList422222222222222222222222222222222, linkedHashMap1322222222222222222222222222222222, null, linkedHashMap1422222222222222222222222222222222, 1024, null);
            case 27:
                List<Integer> l = catalogBlockDto.l();
                if (l != null) {
                    List<Integer> list14 = l;
                    arrayList = new ArrayList(c5g.u(list14, 10));
                    Iterator it14 = list14.iterator();
                    while (it14.hasNext()) {
                        kq.d((Number) it14.next(), arrayList);
                    }
                    i2 = arrayList;
                    if (i2 == null) {
                    }
                    CatalogDataType a3222222222222222222222222222222222 = a4a.a(catalogBlockDto.l0());
                    ArrayList arrayList3222222222222222222222222222222222 = new ArrayList(i2);
                    CatalogBlockDataTypeDto l05222222222222222222222222222222222 = catalogBlockDto.l0();
                    V0 = catalogBlockDto.V0();
                    i = a.$EnumSwitchMapping$0[l05222222222222222222222222222222222.ordinal()];
                    if (i != 10) {
                    }
                    LinkedHashMap linkedHashMap7222222222222222222222222222222222 = new LinkedHashMap();
                    it = V0.iterator();
                    while (it.hasNext()) {
                    }
                    linkedHashMap = new LinkedHashMap(linkedHashMap7222222222222222222222222222222222);
                    if (linkedHashMap == null) {
                    }
                    CatalogBlockDataTypeDto l06222222222222222222222222222222222 = catalogBlockDto.l0();
                    w0 = catalogBlockDto.w0();
                    hpu hpuVar222222222222222222222222222222222 = new hpu();
                    i3 = a.$EnumSwitchMapping$0[l06222222222222222222222222222222222.ordinal()];
                    if (i3 != 15) {
                    }
                    a2a a2aVar222222222222222222222222222222222 = new a2a(1, hpuVar222222222222222222222222222222222, hpu.class, "map", "map(Lcom/vk/api/generated/catalog/dto/CatalogEntityGroupsItemDto;)Lcom/vk/dto/group/GroupsEntityCatalogItem;", 0, 0);
                    LinkedHashMap linkedHashMap8222222222222222222222222222222222 = new LinkedHashMap();
                    it2 = w0.iterator();
                    while (it2.hasNext()) {
                    }
                    linkedHashMap2 = new LinkedHashMap(linkedHashMap8222222222222222222222222222222222);
                    if (linkedHashMap2 == null) {
                    }
                    LinkedHashMap linkedHashMap9222222222222222222222222222222222 = linkedHashMap2;
                    l0 = catalogBlockDto.l0();
                    List<CatalogSearchAuthorItemDto> y2222222222222222222222222222222222 = catalogBlockDto.y2();
                    if (l0 == CatalogBlockDataTypeDto.SEARCH_AUTHORS) {
                    }
                    l02 = catalogBlockDto.l0();
                    List<CatalogGameItemDto> H0222222222222222222222222222222222 = catalogBlockDto.H0();
                    if (l02 == CatalogBlockDataTypeDto.GAMES) {
                    }
                    String str2222222222222222222222222222222222 = str;
                    l03 = catalogBlockDto.l0();
                    List<CatalogGroupCategoryMetaItemDto> N0222222222222222222222222222222222 = catalogBlockDto.N0();
                    t2a t2aVar222222222222222222222222222222222 = new t2a();
                    if (l03 != CatalogBlockDataTypeDto.GROUPS_CATEGORY_ITEMS) {
                    }
                    LinkedHashMap linkedHashMap11222222222222222222222222222222222 = linkedHashMap5;
                    l04 = catalogBlockDto.l0();
                    List<CatalogMiniAppContentItemDto> E1222222222222222222222222222222222 = catalogBlockDto.E1();
                    if (l04 == CatalogBlockDataTypeDto.MINI_APPS_CONTENT) {
                    }
                    LinkedHashMap linkedHashMap12222222222222222222222222222222222 = linkedHashMap6;
                    i4 = a.$EnumSwitchMapping$0[catalogBlockDto.l0().ordinal()];
                    if (i4 != 10) {
                    }
                    P0 = catalogBlockDto.P0();
                    if (P0 == null) {
                    }
                    if (r1 == 0) {
                    }
                    arrayList2 = new ArrayList((Collection) r1);
                    if (arrayList2 == null) {
                    }
                    ArrayList arrayList4222222222222222222222222222222222 = arrayList2;
                    T = catalogBlockDto.T();
                    if (T == null) {
                    }
                    if (map == null) {
                    }
                    LinkedHashMap linkedHashMap13222222222222222222222222222222222 = new LinkedHashMap(map);
                    CatalogBlockDataTypeDto l07222222222222222222222222222222222 = catalogBlockDto.l0();
                    M = catalogBlockDto.M();
                    LinkedHashMap linkedHashMap14222222222222222222222222222222222 = new LinkedHashMap();
                    if (M != null) {
                    }
                    return new CatalogBlockItemsData(a3222222222222222222222222222222222, arrayList3222222222222222222222222222222222, linkedHashMap, linkedHashMap3, linkedHashMap4, linkedHashMap9222222222222222222222222222222222, linkedHashMap11222222222222222222222222222222222, linkedHashMap12222222222222222222222222222222222, arrayList4222222222222222222222222222222222, linkedHashMap13222222222222222222222222222222222, null, linkedHashMap14222222222222222222222222222222222, 1024, null);
                }
                i2 = null;
                if (i2 == null) {
                }
                CatalogDataType a32222222222222222222222222222222222 = a4a.a(catalogBlockDto.l0());
                ArrayList arrayList32222222222222222222222222222222222 = new ArrayList(i2);
                CatalogBlockDataTypeDto l052222222222222222222222222222222222 = catalogBlockDto.l0();
                V0 = catalogBlockDto.V0();
                i = a.$EnumSwitchMapping$0[l052222222222222222222222222222222222.ordinal()];
                if (i != 10) {
                }
                LinkedHashMap linkedHashMap72222222222222222222222222222222222 = new LinkedHashMap();
                it = V0.iterator();
                while (it.hasNext()) {
                }
                linkedHashMap = new LinkedHashMap(linkedHashMap72222222222222222222222222222222222);
                if (linkedHashMap == null) {
                }
                CatalogBlockDataTypeDto l062222222222222222222222222222222222 = catalogBlockDto.l0();
                w0 = catalogBlockDto.w0();
                hpu hpuVar2222222222222222222222222222222222 = new hpu();
                i3 = a.$EnumSwitchMapping$0[l062222222222222222222222222222222222.ordinal()];
                if (i3 != 15) {
                }
                a2a a2aVar2222222222222222222222222222222222 = new a2a(1, hpuVar2222222222222222222222222222222222, hpu.class, "map", "map(Lcom/vk/api/generated/catalog/dto/CatalogEntityGroupsItemDto;)Lcom/vk/dto/group/GroupsEntityCatalogItem;", 0, 0);
                LinkedHashMap linkedHashMap82222222222222222222222222222222222 = new LinkedHashMap();
                it2 = w0.iterator();
                while (it2.hasNext()) {
                }
                linkedHashMap2 = new LinkedHashMap(linkedHashMap82222222222222222222222222222222222);
                if (linkedHashMap2 == null) {
                }
                LinkedHashMap linkedHashMap92222222222222222222222222222222222 = linkedHashMap2;
                l0 = catalogBlockDto.l0();
                List<CatalogSearchAuthorItemDto> y22222222222222222222222222222222222 = catalogBlockDto.y2();
                if (l0 == CatalogBlockDataTypeDto.SEARCH_AUTHORS) {
                }
                l02 = catalogBlockDto.l0();
                List<CatalogGameItemDto> H02222222222222222222222222222222222 = catalogBlockDto.H0();
                if (l02 == CatalogBlockDataTypeDto.GAMES) {
                }
                String str22222222222222222222222222222222222 = str;
                l03 = catalogBlockDto.l0();
                List<CatalogGroupCategoryMetaItemDto> N02222222222222222222222222222222222 = catalogBlockDto.N0();
                t2a t2aVar2222222222222222222222222222222222 = new t2a();
                if (l03 != CatalogBlockDataTypeDto.GROUPS_CATEGORY_ITEMS) {
                }
                LinkedHashMap linkedHashMap112222222222222222222222222222222222 = linkedHashMap5;
                l04 = catalogBlockDto.l0();
                List<CatalogMiniAppContentItemDto> E12222222222222222222222222222222222 = catalogBlockDto.E1();
                if (l04 == CatalogBlockDataTypeDto.MINI_APPS_CONTENT) {
                }
                LinkedHashMap linkedHashMap122222222222222222222222222222222222 = linkedHashMap6;
                i4 = a.$EnumSwitchMapping$0[catalogBlockDto.l0().ordinal()];
                if (i4 != 10) {
                }
                P0 = catalogBlockDto.P0();
                if (P0 == null) {
                }
                if (r1 == 0) {
                }
                arrayList2 = new ArrayList((Collection) r1);
                if (arrayList2 == null) {
                }
                ArrayList arrayList42222222222222222222222222222222222 = arrayList2;
                T = catalogBlockDto.T();
                if (T == null) {
                }
                if (map == null) {
                }
                LinkedHashMap linkedHashMap132222222222222222222222222222222222 = new LinkedHashMap(map);
                CatalogBlockDataTypeDto l072222222222222222222222222222222222 = catalogBlockDto.l0();
                M = catalogBlockDto.M();
                LinkedHashMap linkedHashMap142222222222222222222222222222222222 = new LinkedHashMap();
                if (M != null) {
                }
                return new CatalogBlockItemsData(a32222222222222222222222222222222222, arrayList32222222222222222222222222222222222, linkedHashMap, linkedHashMap3, linkedHashMap4, linkedHashMap92222222222222222222222222222222222, linkedHashMap112222222222222222222222222222222222, linkedHashMap122222222222222222222222222222222222, arrayList42222222222222222222222222222222222, linkedHashMap132222222222222222222222222222222222, null, linkedHashMap142222222222222222222222222222222222, 1024, null);
            case 28:
                List<String> B = catalogBlockDto.B();
                if (B == null) {
                    B = EmptyList.b;
                }
                List<String> list15 = B;
                List<String> i22 = catalogBlockDto.i2();
                if (i22 == null) {
                    i22 = EmptyList.b;
                }
                i2 = j5g.u0(i22, list15);
                if (i2 == null) {
                }
                CatalogDataType a322222222222222222222222222222222222 = a4a.a(catalogBlockDto.l0());
                ArrayList arrayList322222222222222222222222222222222222 = new ArrayList(i2);
                CatalogBlockDataTypeDto l0522222222222222222222222222222222222 = catalogBlockDto.l0();
                V0 = catalogBlockDto.V0();
                i = a.$EnumSwitchMapping$0[l0522222222222222222222222222222222222.ordinal()];
                if (i != 10) {
                }
                LinkedHashMap linkedHashMap722222222222222222222222222222222222 = new LinkedHashMap();
                it = V0.iterator();
                while (it.hasNext()) {
                }
                linkedHashMap = new LinkedHashMap(linkedHashMap722222222222222222222222222222222222);
                if (linkedHashMap == null) {
                }
                CatalogBlockDataTypeDto l0622222222222222222222222222222222222 = catalogBlockDto.l0();
                w0 = catalogBlockDto.w0();
                hpu hpuVar22222222222222222222222222222222222 = new hpu();
                i3 = a.$EnumSwitchMapping$0[l0622222222222222222222222222222222222.ordinal()];
                if (i3 != 15) {
                }
                a2a a2aVar22222222222222222222222222222222222 = new a2a(1, hpuVar22222222222222222222222222222222222, hpu.class, "map", "map(Lcom/vk/api/generated/catalog/dto/CatalogEntityGroupsItemDto;)Lcom/vk/dto/group/GroupsEntityCatalogItem;", 0, 0);
                LinkedHashMap linkedHashMap822222222222222222222222222222222222 = new LinkedHashMap();
                it2 = w0.iterator();
                while (it2.hasNext()) {
                }
                linkedHashMap2 = new LinkedHashMap(linkedHashMap822222222222222222222222222222222222);
                if (linkedHashMap2 == null) {
                }
                LinkedHashMap linkedHashMap922222222222222222222222222222222222 = linkedHashMap2;
                l0 = catalogBlockDto.l0();
                List<CatalogSearchAuthorItemDto> y222222222222222222222222222222222222 = catalogBlockDto.y2();
                if (l0 == CatalogBlockDataTypeDto.SEARCH_AUTHORS) {
                }
                l02 = catalogBlockDto.l0();
                List<CatalogGameItemDto> H022222222222222222222222222222222222 = catalogBlockDto.H0();
                if (l02 == CatalogBlockDataTypeDto.GAMES) {
                }
                String str222222222222222222222222222222222222 = str;
                l03 = catalogBlockDto.l0();
                List<CatalogGroupCategoryMetaItemDto> N022222222222222222222222222222222222 = catalogBlockDto.N0();
                t2a t2aVar22222222222222222222222222222222222 = new t2a();
                if (l03 != CatalogBlockDataTypeDto.GROUPS_CATEGORY_ITEMS) {
                }
                LinkedHashMap linkedHashMap1122222222222222222222222222222222222 = linkedHashMap5;
                l04 = catalogBlockDto.l0();
                List<CatalogMiniAppContentItemDto> E122222222222222222222222222222222222 = catalogBlockDto.E1();
                if (l04 == CatalogBlockDataTypeDto.MINI_APPS_CONTENT) {
                }
                LinkedHashMap linkedHashMap1222222222222222222222222222222222222 = linkedHashMap6;
                i4 = a.$EnumSwitchMapping$0[catalogBlockDto.l0().ordinal()];
                if (i4 != 10) {
                }
                P0 = catalogBlockDto.P0();
                if (P0 == null) {
                }
                if (r1 == 0) {
                }
                arrayList2 = new ArrayList((Collection) r1);
                if (arrayList2 == null) {
                }
                ArrayList arrayList422222222222222222222222222222222222 = arrayList2;
                T = catalogBlockDto.T();
                if (T == null) {
                }
                if (map == null) {
                }
                LinkedHashMap linkedHashMap1322222222222222222222222222222222222 = new LinkedHashMap(map);
                CatalogBlockDataTypeDto l0722222222222222222222222222222222222 = catalogBlockDto.l0();
                M = catalogBlockDto.M();
                LinkedHashMap linkedHashMap1422222222222222222222222222222222222 = new LinkedHashMap();
                if (M != null) {
                }
                return new CatalogBlockItemsData(a322222222222222222222222222222222222, arrayList322222222222222222222222222222222222, linkedHashMap, linkedHashMap3, linkedHashMap4, linkedHashMap922222222222222222222222222222222222, linkedHashMap1122222222222222222222222222222222222, linkedHashMap1222222222222222222222222222222222222, arrayList422222222222222222222222222222222222, linkedHashMap1322222222222222222222222222222222222, null, linkedHashMap1422222222222222222222222222222222222, 1024, null);
            case 29:
                i2 = catalogBlockDto.F0();
                if (i2 == null) {
                }
                CatalogDataType a3222222222222222222222222222222222222 = a4a.a(catalogBlockDto.l0());
                ArrayList arrayList3222222222222222222222222222222222222 = new ArrayList(i2);
                CatalogBlockDataTypeDto l05222222222222222222222222222222222222 = catalogBlockDto.l0();
                V0 = catalogBlockDto.V0();
                i = a.$EnumSwitchMapping$0[l05222222222222222222222222222222222222.ordinal()];
                if (i != 10) {
                }
                LinkedHashMap linkedHashMap7222222222222222222222222222222222222 = new LinkedHashMap();
                it = V0.iterator();
                while (it.hasNext()) {
                }
                linkedHashMap = new LinkedHashMap(linkedHashMap7222222222222222222222222222222222222);
                if (linkedHashMap == null) {
                }
                CatalogBlockDataTypeDto l06222222222222222222222222222222222222 = catalogBlockDto.l0();
                w0 = catalogBlockDto.w0();
                hpu hpuVar222222222222222222222222222222222222 = new hpu();
                i3 = a.$EnumSwitchMapping$0[l06222222222222222222222222222222222222.ordinal()];
                if (i3 != 15) {
                }
                a2a a2aVar222222222222222222222222222222222222 = new a2a(1, hpuVar222222222222222222222222222222222222, hpu.class, "map", "map(Lcom/vk/api/generated/catalog/dto/CatalogEntityGroupsItemDto;)Lcom/vk/dto/group/GroupsEntityCatalogItem;", 0, 0);
                LinkedHashMap linkedHashMap8222222222222222222222222222222222222 = new LinkedHashMap();
                it2 = w0.iterator();
                while (it2.hasNext()) {
                }
                linkedHashMap2 = new LinkedHashMap(linkedHashMap8222222222222222222222222222222222222);
                if (linkedHashMap2 == null) {
                }
                LinkedHashMap linkedHashMap9222222222222222222222222222222222222 = linkedHashMap2;
                l0 = catalogBlockDto.l0();
                List<CatalogSearchAuthorItemDto> y2222222222222222222222222222222222222 = catalogBlockDto.y2();
                if (l0 == CatalogBlockDataTypeDto.SEARCH_AUTHORS) {
                }
                l02 = catalogBlockDto.l0();
                List<CatalogGameItemDto> H0222222222222222222222222222222222222 = catalogBlockDto.H0();
                if (l02 == CatalogBlockDataTypeDto.GAMES) {
                }
                String str2222222222222222222222222222222222222 = str;
                l03 = catalogBlockDto.l0();
                List<CatalogGroupCategoryMetaItemDto> N0222222222222222222222222222222222222 = catalogBlockDto.N0();
                t2a t2aVar222222222222222222222222222222222222 = new t2a();
                if (l03 != CatalogBlockDataTypeDto.GROUPS_CATEGORY_ITEMS) {
                }
                LinkedHashMap linkedHashMap11222222222222222222222222222222222222 = linkedHashMap5;
                l04 = catalogBlockDto.l0();
                List<CatalogMiniAppContentItemDto> E1222222222222222222222222222222222222 = catalogBlockDto.E1();
                if (l04 == CatalogBlockDataTypeDto.MINI_APPS_CONTENT) {
                }
                LinkedHashMap linkedHashMap12222222222222222222222222222222222222 = linkedHashMap6;
                i4 = a.$EnumSwitchMapping$0[catalogBlockDto.l0().ordinal()];
                if (i4 != 10) {
                }
                P0 = catalogBlockDto.P0();
                if (P0 == null) {
                }
                if (r1 == 0) {
                }
                arrayList2 = new ArrayList((Collection) r1);
                if (arrayList2 == null) {
                }
                ArrayList arrayList4222222222222222222222222222222222222 = arrayList2;
                T = catalogBlockDto.T();
                if (T == null) {
                }
                if (map == null) {
                }
                LinkedHashMap linkedHashMap13222222222222222222222222222222222222 = new LinkedHashMap(map);
                CatalogBlockDataTypeDto l07222222222222222222222222222222222222 = catalogBlockDto.l0();
                M = catalogBlockDto.M();
                LinkedHashMap linkedHashMap14222222222222222222222222222222222222 = new LinkedHashMap();
                if (M != null) {
                }
                return new CatalogBlockItemsData(a3222222222222222222222222222222222222, arrayList3222222222222222222222222222222222222, linkedHashMap, linkedHashMap3, linkedHashMap4, linkedHashMap9222222222222222222222222222222222222, linkedHashMap11222222222222222222222222222222222222, linkedHashMap12222222222222222222222222222222222222, arrayList4222222222222222222222222222222222222, linkedHashMap13222222222222222222222222222222222222, null, linkedHashMap14222222222222222222222222222222222222, 1024, null);
            case 30:
                List<Integer> r22 = catalogBlockDto.r2();
                if (r22 != null) {
                    List<Integer> list16 = r22;
                    arrayList = new ArrayList(c5g.u(list16, 10));
                    Iterator it15 = list16.iterator();
                    while (it15.hasNext()) {
                        kq.d((Number) it15.next(), arrayList);
                    }
                    i2 = arrayList;
                    if (i2 == null) {
                    }
                    CatalogDataType a32222222222222222222222222222222222222 = a4a.a(catalogBlockDto.l0());
                    ArrayList arrayList32222222222222222222222222222222222222 = new ArrayList(i2);
                    CatalogBlockDataTypeDto l052222222222222222222222222222222222222 = catalogBlockDto.l0();
                    V0 = catalogBlockDto.V0();
                    i = a.$EnumSwitchMapping$0[l052222222222222222222222222222222222222.ordinal()];
                    if (i != 10) {
                    }
                    LinkedHashMap linkedHashMap72222222222222222222222222222222222222 = new LinkedHashMap();
                    it = V0.iterator();
                    while (it.hasNext()) {
                    }
                    linkedHashMap = new LinkedHashMap(linkedHashMap72222222222222222222222222222222222222);
                    if (linkedHashMap == null) {
                    }
                    CatalogBlockDataTypeDto l062222222222222222222222222222222222222 = catalogBlockDto.l0();
                    w0 = catalogBlockDto.w0();
                    hpu hpuVar2222222222222222222222222222222222222 = new hpu();
                    i3 = a.$EnumSwitchMapping$0[l062222222222222222222222222222222222222.ordinal()];
                    if (i3 != 15) {
                    }
                    a2a a2aVar2222222222222222222222222222222222222 = new a2a(1, hpuVar2222222222222222222222222222222222222, hpu.class, "map", "map(Lcom/vk/api/generated/catalog/dto/CatalogEntityGroupsItemDto;)Lcom/vk/dto/group/GroupsEntityCatalogItem;", 0, 0);
                    LinkedHashMap linkedHashMap82222222222222222222222222222222222222 = new LinkedHashMap();
                    it2 = w0.iterator();
                    while (it2.hasNext()) {
                    }
                    linkedHashMap2 = new LinkedHashMap(linkedHashMap82222222222222222222222222222222222222);
                    if (linkedHashMap2 == null) {
                    }
                    LinkedHashMap linkedHashMap92222222222222222222222222222222222222 = linkedHashMap2;
                    l0 = catalogBlockDto.l0();
                    List<CatalogSearchAuthorItemDto> y22222222222222222222222222222222222222 = catalogBlockDto.y2();
                    if (l0 == CatalogBlockDataTypeDto.SEARCH_AUTHORS) {
                    }
                    l02 = catalogBlockDto.l0();
                    List<CatalogGameItemDto> H02222222222222222222222222222222222222 = catalogBlockDto.H0();
                    if (l02 == CatalogBlockDataTypeDto.GAMES) {
                    }
                    String str22222222222222222222222222222222222222 = str;
                    l03 = catalogBlockDto.l0();
                    List<CatalogGroupCategoryMetaItemDto> N02222222222222222222222222222222222222 = catalogBlockDto.N0();
                    t2a t2aVar2222222222222222222222222222222222222 = new t2a();
                    if (l03 != CatalogBlockDataTypeDto.GROUPS_CATEGORY_ITEMS) {
                    }
                    LinkedHashMap linkedHashMap112222222222222222222222222222222222222 = linkedHashMap5;
                    l04 = catalogBlockDto.l0();
                    List<CatalogMiniAppContentItemDto> E12222222222222222222222222222222222222 = catalogBlockDto.E1();
                    if (l04 == CatalogBlockDataTypeDto.MINI_APPS_CONTENT) {
                    }
                    LinkedHashMap linkedHashMap122222222222222222222222222222222222222 = linkedHashMap6;
                    i4 = a.$EnumSwitchMapping$0[catalogBlockDto.l0().ordinal()];
                    if (i4 != 10) {
                    }
                    P0 = catalogBlockDto.P0();
                    if (P0 == null) {
                    }
                    if (r1 == 0) {
                    }
                    arrayList2 = new ArrayList((Collection) r1);
                    if (arrayList2 == null) {
                    }
                    ArrayList arrayList42222222222222222222222222222222222222 = arrayList2;
                    T = catalogBlockDto.T();
                    if (T == null) {
                    }
                    if (map == null) {
                    }
                    LinkedHashMap linkedHashMap132222222222222222222222222222222222222 = new LinkedHashMap(map);
                    CatalogBlockDataTypeDto l072222222222222222222222222222222222222 = catalogBlockDto.l0();
                    M = catalogBlockDto.M();
                    LinkedHashMap linkedHashMap142222222222222222222222222222222222222 = new LinkedHashMap();
                    if (M != null) {
                    }
                    return new CatalogBlockItemsData(a32222222222222222222222222222222222222, arrayList32222222222222222222222222222222222222, linkedHashMap, linkedHashMap3, linkedHashMap4, linkedHashMap92222222222222222222222222222222222222, linkedHashMap112222222222222222222222222222222222222, linkedHashMap122222222222222222222222222222222222222, arrayList42222222222222222222222222222222222222, linkedHashMap132222222222222222222222222222222222222, null, linkedHashMap142222222222222222222222222222222222222, 1024, null);
                }
                i2 = null;
                if (i2 == null) {
                }
                CatalogDataType a322222222222222222222222222222222222222 = a4a.a(catalogBlockDto.l0());
                ArrayList arrayList322222222222222222222222222222222222222 = new ArrayList(i2);
                CatalogBlockDataTypeDto l0522222222222222222222222222222222222222 = catalogBlockDto.l0();
                V0 = catalogBlockDto.V0();
                i = a.$EnumSwitchMapping$0[l0522222222222222222222222222222222222222.ordinal()];
                if (i != 10) {
                }
                LinkedHashMap linkedHashMap722222222222222222222222222222222222222 = new LinkedHashMap();
                it = V0.iterator();
                while (it.hasNext()) {
                }
                linkedHashMap = new LinkedHashMap(linkedHashMap722222222222222222222222222222222222222);
                if (linkedHashMap == null) {
                }
                CatalogBlockDataTypeDto l0622222222222222222222222222222222222222 = catalogBlockDto.l0();
                w0 = catalogBlockDto.w0();
                hpu hpuVar22222222222222222222222222222222222222 = new hpu();
                i3 = a.$EnumSwitchMapping$0[l0622222222222222222222222222222222222222.ordinal()];
                if (i3 != 15) {
                }
                a2a a2aVar22222222222222222222222222222222222222 = new a2a(1, hpuVar22222222222222222222222222222222222222, hpu.class, "map", "map(Lcom/vk/api/generated/catalog/dto/CatalogEntityGroupsItemDto;)Lcom/vk/dto/group/GroupsEntityCatalogItem;", 0, 0);
                LinkedHashMap linkedHashMap822222222222222222222222222222222222222 = new LinkedHashMap();
                it2 = w0.iterator();
                while (it2.hasNext()) {
                }
                linkedHashMap2 = new LinkedHashMap(linkedHashMap822222222222222222222222222222222222222);
                if (linkedHashMap2 == null) {
                }
                LinkedHashMap linkedHashMap922222222222222222222222222222222222222 = linkedHashMap2;
                l0 = catalogBlockDto.l0();
                List<CatalogSearchAuthorItemDto> y222222222222222222222222222222222222222 = catalogBlockDto.y2();
                if (l0 == CatalogBlockDataTypeDto.SEARCH_AUTHORS) {
                }
                l02 = catalogBlockDto.l0();
                List<CatalogGameItemDto> H022222222222222222222222222222222222222 = catalogBlockDto.H0();
                if (l02 == CatalogBlockDataTypeDto.GAMES) {
                }
                String str222222222222222222222222222222222222222 = str;
                l03 = catalogBlockDto.l0();
                List<CatalogGroupCategoryMetaItemDto> N022222222222222222222222222222222222222 = catalogBlockDto.N0();
                t2a t2aVar22222222222222222222222222222222222222 = new t2a();
                if (l03 != CatalogBlockDataTypeDto.GROUPS_CATEGORY_ITEMS) {
                }
                LinkedHashMap linkedHashMap1122222222222222222222222222222222222222 = linkedHashMap5;
                l04 = catalogBlockDto.l0();
                List<CatalogMiniAppContentItemDto> E122222222222222222222222222222222222222 = catalogBlockDto.E1();
                if (l04 == CatalogBlockDataTypeDto.MINI_APPS_CONTENT) {
                }
                LinkedHashMap linkedHashMap1222222222222222222222222222222222222222 = linkedHashMap6;
                i4 = a.$EnumSwitchMapping$0[catalogBlockDto.l0().ordinal()];
                if (i4 != 10) {
                }
                P0 = catalogBlockDto.P0();
                if (P0 == null) {
                }
                if (r1 == 0) {
                }
                arrayList2 = new ArrayList((Collection) r1);
                if (arrayList2 == null) {
                }
                ArrayList arrayList422222222222222222222222222222222222222 = arrayList2;
                T = catalogBlockDto.T();
                if (T == null) {
                }
                if (map == null) {
                }
                LinkedHashMap linkedHashMap1322222222222222222222222222222222222222 = new LinkedHashMap(map);
                CatalogBlockDataTypeDto l0722222222222222222222222222222222222222 = catalogBlockDto.l0();
                M = catalogBlockDto.M();
                LinkedHashMap linkedHashMap1422222222222222222222222222222222222222 = new LinkedHashMap();
                if (M != null) {
                }
                return new CatalogBlockItemsData(a322222222222222222222222222222222222222, arrayList322222222222222222222222222222222222222, linkedHashMap, linkedHashMap3, linkedHashMap4, linkedHashMap922222222222222222222222222222222222222, linkedHashMap1122222222222222222222222222222222222222, linkedHashMap1222222222222222222222222222222222222222, arrayList422222222222222222222222222222222222222, linkedHashMap1322222222222222222222222222222222222222, null, linkedHashMap1422222222222222222222222222222222222222, 1024, null);
            case 31:
                i2 = catalogBlockDto.p();
                if (i2 == null) {
                }
                CatalogDataType a3222222222222222222222222222222222222222 = a4a.a(catalogBlockDto.l0());
                ArrayList arrayList3222222222222222222222222222222222222222 = new ArrayList(i2);
                CatalogBlockDataTypeDto l05222222222222222222222222222222222222222 = catalogBlockDto.l0();
                V0 = catalogBlockDto.V0();
                i = a.$EnumSwitchMapping$0[l05222222222222222222222222222222222222222.ordinal()];
                if (i != 10) {
                }
                LinkedHashMap linkedHashMap7222222222222222222222222222222222222222 = new LinkedHashMap();
                it = V0.iterator();
                while (it.hasNext()) {
                }
                linkedHashMap = new LinkedHashMap(linkedHashMap7222222222222222222222222222222222222222);
                if (linkedHashMap == null) {
                }
                CatalogBlockDataTypeDto l06222222222222222222222222222222222222222 = catalogBlockDto.l0();
                w0 = catalogBlockDto.w0();
                hpu hpuVar222222222222222222222222222222222222222 = new hpu();
                i3 = a.$EnumSwitchMapping$0[l06222222222222222222222222222222222222222.ordinal()];
                if (i3 != 15) {
                }
                a2a a2aVar222222222222222222222222222222222222222 = new a2a(1, hpuVar222222222222222222222222222222222222222, hpu.class, "map", "map(Lcom/vk/api/generated/catalog/dto/CatalogEntityGroupsItemDto;)Lcom/vk/dto/group/GroupsEntityCatalogItem;", 0, 0);
                LinkedHashMap linkedHashMap8222222222222222222222222222222222222222 = new LinkedHashMap();
                it2 = w0.iterator();
                while (it2.hasNext()) {
                }
                linkedHashMap2 = new LinkedHashMap(linkedHashMap8222222222222222222222222222222222222222);
                if (linkedHashMap2 == null) {
                }
                LinkedHashMap linkedHashMap9222222222222222222222222222222222222222 = linkedHashMap2;
                l0 = catalogBlockDto.l0();
                List<CatalogSearchAuthorItemDto> y2222222222222222222222222222222222222222 = catalogBlockDto.y2();
                if (l0 == CatalogBlockDataTypeDto.SEARCH_AUTHORS) {
                }
                l02 = catalogBlockDto.l0();
                List<CatalogGameItemDto> H0222222222222222222222222222222222222222 = catalogBlockDto.H0();
                if (l02 == CatalogBlockDataTypeDto.GAMES) {
                }
                String str2222222222222222222222222222222222222222 = str;
                l03 = catalogBlockDto.l0();
                List<CatalogGroupCategoryMetaItemDto> N0222222222222222222222222222222222222222 = catalogBlockDto.N0();
                t2a t2aVar222222222222222222222222222222222222222 = new t2a();
                if (l03 != CatalogBlockDataTypeDto.GROUPS_CATEGORY_ITEMS) {
                }
                LinkedHashMap linkedHashMap11222222222222222222222222222222222222222 = linkedHashMap5;
                l04 = catalogBlockDto.l0();
                List<CatalogMiniAppContentItemDto> E1222222222222222222222222222222222222222 = catalogBlockDto.E1();
                if (l04 == CatalogBlockDataTypeDto.MINI_APPS_CONTENT) {
                }
                LinkedHashMap linkedHashMap12222222222222222222222222222222222222222 = linkedHashMap6;
                i4 = a.$EnumSwitchMapping$0[catalogBlockDto.l0().ordinal()];
                if (i4 != 10) {
                }
                P0 = catalogBlockDto.P0();
                if (P0 == null) {
                }
                if (r1 == 0) {
                }
                arrayList2 = new ArrayList((Collection) r1);
                if (arrayList2 == null) {
                }
                ArrayList arrayList4222222222222222222222222222222222222222 = arrayList2;
                T = catalogBlockDto.T();
                if (T == null) {
                }
                if (map == null) {
                }
                LinkedHashMap linkedHashMap13222222222222222222222222222222222222222 = new LinkedHashMap(map);
                CatalogBlockDataTypeDto l07222222222222222222222222222222222222222 = catalogBlockDto.l0();
                M = catalogBlockDto.M();
                LinkedHashMap linkedHashMap14222222222222222222222222222222222222222 = new LinkedHashMap();
                if (M != null) {
                }
                return new CatalogBlockItemsData(a3222222222222222222222222222222222222222, arrayList3222222222222222222222222222222222222222, linkedHashMap, linkedHashMap3, linkedHashMap4, linkedHashMap9222222222222222222222222222222222222222, linkedHashMap11222222222222222222222222222222222222222, linkedHashMap12222222222222222222222222222222222222222, arrayList4222222222222222222222222222222222222222, linkedHashMap13222222222222222222222222222222222222222, null, linkedHashMap14222222222222222222222222222222222222222, 1024, null);
            case 32:
                i2 = catalogBlockDto.u();
                if (i2 == null) {
                }
                CatalogDataType a32222222222222222222222222222222222222222 = a4a.a(catalogBlockDto.l0());
                ArrayList arrayList32222222222222222222222222222222222222222 = new ArrayList(i2);
                CatalogBlockDataTypeDto l052222222222222222222222222222222222222222 = catalogBlockDto.l0();
                V0 = catalogBlockDto.V0();
                i = a.$EnumSwitchMapping$0[l052222222222222222222222222222222222222222.ordinal()];
                if (i != 10) {
                }
                LinkedHashMap linkedHashMap72222222222222222222222222222222222222222 = new LinkedHashMap();
                it = V0.iterator();
                while (it.hasNext()) {
                }
                linkedHashMap = new LinkedHashMap(linkedHashMap72222222222222222222222222222222222222222);
                if (linkedHashMap == null) {
                }
                CatalogBlockDataTypeDto l062222222222222222222222222222222222222222 = catalogBlockDto.l0();
                w0 = catalogBlockDto.w0();
                hpu hpuVar2222222222222222222222222222222222222222 = new hpu();
                i3 = a.$EnumSwitchMapping$0[l062222222222222222222222222222222222222222.ordinal()];
                if (i3 != 15) {
                }
                a2a a2aVar2222222222222222222222222222222222222222 = new a2a(1, hpuVar2222222222222222222222222222222222222222, hpu.class, "map", "map(Lcom/vk/api/generated/catalog/dto/CatalogEntityGroupsItemDto;)Lcom/vk/dto/group/GroupsEntityCatalogItem;", 0, 0);
                LinkedHashMap linkedHashMap82222222222222222222222222222222222222222 = new LinkedHashMap();
                it2 = w0.iterator();
                while (it2.hasNext()) {
                }
                linkedHashMap2 = new LinkedHashMap(linkedHashMap82222222222222222222222222222222222222222);
                if (linkedHashMap2 == null) {
                }
                LinkedHashMap linkedHashMap92222222222222222222222222222222222222222 = linkedHashMap2;
                l0 = catalogBlockDto.l0();
                List<CatalogSearchAuthorItemDto> y22222222222222222222222222222222222222222 = catalogBlockDto.y2();
                if (l0 == CatalogBlockDataTypeDto.SEARCH_AUTHORS) {
                }
                l02 = catalogBlockDto.l0();
                List<CatalogGameItemDto> H02222222222222222222222222222222222222222 = catalogBlockDto.H0();
                if (l02 == CatalogBlockDataTypeDto.GAMES) {
                }
                String str22222222222222222222222222222222222222222 = str;
                l03 = catalogBlockDto.l0();
                List<CatalogGroupCategoryMetaItemDto> N02222222222222222222222222222222222222222 = catalogBlockDto.N0();
                t2a t2aVar2222222222222222222222222222222222222222 = new t2a();
                if (l03 != CatalogBlockDataTypeDto.GROUPS_CATEGORY_ITEMS) {
                }
                LinkedHashMap linkedHashMap112222222222222222222222222222222222222222 = linkedHashMap5;
                l04 = catalogBlockDto.l0();
                List<CatalogMiniAppContentItemDto> E12222222222222222222222222222222222222222 = catalogBlockDto.E1();
                if (l04 == CatalogBlockDataTypeDto.MINI_APPS_CONTENT) {
                }
                LinkedHashMap linkedHashMap122222222222222222222222222222222222222222 = linkedHashMap6;
                i4 = a.$EnumSwitchMapping$0[catalogBlockDto.l0().ordinal()];
                if (i4 != 10) {
                }
                P0 = catalogBlockDto.P0();
                if (P0 == null) {
                }
                if (r1 == 0) {
                }
                arrayList2 = new ArrayList((Collection) r1);
                if (arrayList2 == null) {
                }
                ArrayList arrayList42222222222222222222222222222222222222222 = arrayList2;
                T = catalogBlockDto.T();
                if (T == null) {
                }
                if (map == null) {
                }
                LinkedHashMap linkedHashMap132222222222222222222222222222222222222222 = new LinkedHashMap(map);
                CatalogBlockDataTypeDto l072222222222222222222222222222222222222222 = catalogBlockDto.l0();
                M = catalogBlockDto.M();
                LinkedHashMap linkedHashMap142222222222222222222222222222222222222222 = new LinkedHashMap();
                if (M != null) {
                }
                return new CatalogBlockItemsData(a32222222222222222222222222222222222222222, arrayList32222222222222222222222222222222222222222, linkedHashMap, linkedHashMap3, linkedHashMap4, linkedHashMap92222222222222222222222222222222222222222, linkedHashMap112222222222222222222222222222222222222222, linkedHashMap122222222222222222222222222222222222222222, arrayList42222222222222222222222222222222222222222, linkedHashMap132222222222222222222222222222222222222222, null, linkedHashMap142222222222222222222222222222222222222222, 1024, null);
            case 33:
                List<CatalogGameItemDto> H03 = catalogBlockDto.H0();
                if (H03 != null) {
                    List<CatalogGameItemDto> list17 = H03;
                    arrayList = new ArrayList(c5g.u(list17, 10));
                    Iterator it16 = list17.iterator();
                    while (it16.hasNext()) {
                        arrayList.add(String.valueOf(((CatalogGameItemDto) it16.next()).d().b));
                    }
                    i2 = arrayList;
                    if (i2 == null) {
                    }
                    CatalogDataType a322222222222222222222222222222222222222222 = a4a.a(catalogBlockDto.l0());
                    ArrayList arrayList322222222222222222222222222222222222222222 = new ArrayList(i2);
                    CatalogBlockDataTypeDto l0522222222222222222222222222222222222222222 = catalogBlockDto.l0();
                    V0 = catalogBlockDto.V0();
                    i = a.$EnumSwitchMapping$0[l0522222222222222222222222222222222222222222.ordinal()];
                    if (i != 10) {
                    }
                    LinkedHashMap linkedHashMap722222222222222222222222222222222222222222 = new LinkedHashMap();
                    it = V0.iterator();
                    while (it.hasNext()) {
                    }
                    linkedHashMap = new LinkedHashMap(linkedHashMap722222222222222222222222222222222222222222);
                    if (linkedHashMap == null) {
                    }
                    CatalogBlockDataTypeDto l0622222222222222222222222222222222222222222 = catalogBlockDto.l0();
                    w0 = catalogBlockDto.w0();
                    hpu hpuVar22222222222222222222222222222222222222222 = new hpu();
                    i3 = a.$EnumSwitchMapping$0[l0622222222222222222222222222222222222222222.ordinal()];
                    if (i3 != 15) {
                    }
                    a2a a2aVar22222222222222222222222222222222222222222 = new a2a(1, hpuVar22222222222222222222222222222222222222222, hpu.class, "map", "map(Lcom/vk/api/generated/catalog/dto/CatalogEntityGroupsItemDto;)Lcom/vk/dto/group/GroupsEntityCatalogItem;", 0, 0);
                    LinkedHashMap linkedHashMap822222222222222222222222222222222222222222 = new LinkedHashMap();
                    it2 = w0.iterator();
                    while (it2.hasNext()) {
                    }
                    linkedHashMap2 = new LinkedHashMap(linkedHashMap822222222222222222222222222222222222222222);
                    if (linkedHashMap2 == null) {
                    }
                    LinkedHashMap linkedHashMap922222222222222222222222222222222222222222 = linkedHashMap2;
                    l0 = catalogBlockDto.l0();
                    List<CatalogSearchAuthorItemDto> y222222222222222222222222222222222222222222 = catalogBlockDto.y2();
                    if (l0 == CatalogBlockDataTypeDto.SEARCH_AUTHORS) {
                    }
                    l02 = catalogBlockDto.l0();
                    List<CatalogGameItemDto> H022222222222222222222222222222222222222222 = catalogBlockDto.H0();
                    if (l02 == CatalogBlockDataTypeDto.GAMES) {
                    }
                    String str222222222222222222222222222222222222222222 = str;
                    l03 = catalogBlockDto.l0();
                    List<CatalogGroupCategoryMetaItemDto> N022222222222222222222222222222222222222222 = catalogBlockDto.N0();
                    t2a t2aVar22222222222222222222222222222222222222222 = new t2a();
                    if (l03 != CatalogBlockDataTypeDto.GROUPS_CATEGORY_ITEMS) {
                    }
                    LinkedHashMap linkedHashMap1122222222222222222222222222222222222222222 = linkedHashMap5;
                    l04 = catalogBlockDto.l0();
                    List<CatalogMiniAppContentItemDto> E122222222222222222222222222222222222222222 = catalogBlockDto.E1();
                    if (l04 == CatalogBlockDataTypeDto.MINI_APPS_CONTENT) {
                    }
                    LinkedHashMap linkedHashMap1222222222222222222222222222222222222222222 = linkedHashMap6;
                    i4 = a.$EnumSwitchMapping$0[catalogBlockDto.l0().ordinal()];
                    if (i4 != 10) {
                    }
                    P0 = catalogBlockDto.P0();
                    if (P0 == null) {
                    }
                    if (r1 == 0) {
                    }
                    arrayList2 = new ArrayList((Collection) r1);
                    if (arrayList2 == null) {
                    }
                    ArrayList arrayList422222222222222222222222222222222222222222 = arrayList2;
                    T = catalogBlockDto.T();
                    if (T == null) {
                    }
                    if (map == null) {
                    }
                    LinkedHashMap linkedHashMap1322222222222222222222222222222222222222222 = new LinkedHashMap(map);
                    CatalogBlockDataTypeDto l0722222222222222222222222222222222222222222 = catalogBlockDto.l0();
                    M = catalogBlockDto.M();
                    LinkedHashMap linkedHashMap1422222222222222222222222222222222222222222 = new LinkedHashMap();
                    if (M != null) {
                    }
                    return new CatalogBlockItemsData(a322222222222222222222222222222222222222222, arrayList322222222222222222222222222222222222222222, linkedHashMap, linkedHashMap3, linkedHashMap4, linkedHashMap922222222222222222222222222222222222222222, linkedHashMap1122222222222222222222222222222222222222222, linkedHashMap1222222222222222222222222222222222222222222, arrayList422222222222222222222222222222222222222222, linkedHashMap1322222222222222222222222222222222222222222, null, linkedHashMap1422222222222222222222222222222222222222222, 1024, null);
                }
                i2 = null;
                if (i2 == null) {
                }
                CatalogDataType a3222222222222222222222222222222222222222222 = a4a.a(catalogBlockDto.l0());
                ArrayList arrayList3222222222222222222222222222222222222222222 = new ArrayList(i2);
                CatalogBlockDataTypeDto l05222222222222222222222222222222222222222222 = catalogBlockDto.l0();
                V0 = catalogBlockDto.V0();
                i = a.$EnumSwitchMapping$0[l05222222222222222222222222222222222222222222.ordinal()];
                if (i != 10) {
                }
                LinkedHashMap linkedHashMap7222222222222222222222222222222222222222222 = new LinkedHashMap();
                it = V0.iterator();
                while (it.hasNext()) {
                }
                linkedHashMap = new LinkedHashMap(linkedHashMap7222222222222222222222222222222222222222222);
                if (linkedHashMap == null) {
                }
                CatalogBlockDataTypeDto l06222222222222222222222222222222222222222222 = catalogBlockDto.l0();
                w0 = catalogBlockDto.w0();
                hpu hpuVar222222222222222222222222222222222222222222 = new hpu();
                i3 = a.$EnumSwitchMapping$0[l06222222222222222222222222222222222222222222.ordinal()];
                if (i3 != 15) {
                }
                a2a a2aVar222222222222222222222222222222222222222222 = new a2a(1, hpuVar222222222222222222222222222222222222222222, hpu.class, "map", "map(Lcom/vk/api/generated/catalog/dto/CatalogEntityGroupsItemDto;)Lcom/vk/dto/group/GroupsEntityCatalogItem;", 0, 0);
                LinkedHashMap linkedHashMap8222222222222222222222222222222222222222222 = new LinkedHashMap();
                it2 = w0.iterator();
                while (it2.hasNext()) {
                }
                linkedHashMap2 = new LinkedHashMap(linkedHashMap8222222222222222222222222222222222222222222);
                if (linkedHashMap2 == null) {
                }
                LinkedHashMap linkedHashMap9222222222222222222222222222222222222222222 = linkedHashMap2;
                l0 = catalogBlockDto.l0();
                List<CatalogSearchAuthorItemDto> y2222222222222222222222222222222222222222222 = catalogBlockDto.y2();
                if (l0 == CatalogBlockDataTypeDto.SEARCH_AUTHORS) {
                }
                l02 = catalogBlockDto.l0();
                List<CatalogGameItemDto> H0222222222222222222222222222222222222222222 = catalogBlockDto.H0();
                if (l02 == CatalogBlockDataTypeDto.GAMES) {
                }
                String str2222222222222222222222222222222222222222222 = str;
                l03 = catalogBlockDto.l0();
                List<CatalogGroupCategoryMetaItemDto> N0222222222222222222222222222222222222222222 = catalogBlockDto.N0();
                t2a t2aVar222222222222222222222222222222222222222222 = new t2a();
                if (l03 != CatalogBlockDataTypeDto.GROUPS_CATEGORY_ITEMS) {
                }
                LinkedHashMap linkedHashMap11222222222222222222222222222222222222222222 = linkedHashMap5;
                l04 = catalogBlockDto.l0();
                List<CatalogMiniAppContentItemDto> E1222222222222222222222222222222222222222222 = catalogBlockDto.E1();
                if (l04 == CatalogBlockDataTypeDto.MINI_APPS_CONTENT) {
                }
                LinkedHashMap linkedHashMap12222222222222222222222222222222222222222222 = linkedHashMap6;
                i4 = a.$EnumSwitchMapping$0[catalogBlockDto.l0().ordinal()];
                if (i4 != 10) {
                }
                P0 = catalogBlockDto.P0();
                if (P0 == null) {
                }
                if (r1 == 0) {
                }
                arrayList2 = new ArrayList((Collection) r1);
                if (arrayList2 == null) {
                }
                ArrayList arrayList4222222222222222222222222222222222222222222 = arrayList2;
                T = catalogBlockDto.T();
                if (T == null) {
                }
                if (map == null) {
                }
                LinkedHashMap linkedHashMap13222222222222222222222222222222222222222222 = new LinkedHashMap(map);
                CatalogBlockDataTypeDto l07222222222222222222222222222222222222222222 = catalogBlockDto.l0();
                M = catalogBlockDto.M();
                LinkedHashMap linkedHashMap14222222222222222222222222222222222222222222 = new LinkedHashMap();
                if (M != null) {
                }
                return new CatalogBlockItemsData(a3222222222222222222222222222222222222222222, arrayList3222222222222222222222222222222222222222222, linkedHashMap, linkedHashMap3, linkedHashMap4, linkedHashMap9222222222222222222222222222222222222222222, linkedHashMap11222222222222222222222222222222222222222222, linkedHashMap12222222222222222222222222222222222222222222, arrayList4222222222222222222222222222222222222222222, linkedHashMap13222222222222222222222222222222222222222222, null, linkedHashMap14222222222222222222222222222222222222222222, 1024, null);
            case 34:
                List<CatalogGroupCategoryMetaItemDto> N03 = catalogBlockDto.N0();
                if (N03 != null) {
                    List<CatalogGroupCategoryMetaItemDto> list18 = N03;
                    arrayList = new ArrayList(c5g.u(list18, 10));
                    Iterator it17 = list18.iterator();
                    while (it17.hasNext()) {
                        String id5 = ((CatalogGroupCategoryMetaItemDto) it17.next()).getId();
                        if (id5 == null) {
                            id5 = "";
                        }
                        arrayList.add(id5);
                    }
                    i2 = arrayList;
                    if (i2 == null) {
                    }
                    CatalogDataType a32222222222222222222222222222222222222222222 = a4a.a(catalogBlockDto.l0());
                    ArrayList arrayList32222222222222222222222222222222222222222222 = new ArrayList(i2);
                    CatalogBlockDataTypeDto l052222222222222222222222222222222222222222222 = catalogBlockDto.l0();
                    V0 = catalogBlockDto.V0();
                    i = a.$EnumSwitchMapping$0[l052222222222222222222222222222222222222222222.ordinal()];
                    if (i != 10) {
                    }
                    LinkedHashMap linkedHashMap72222222222222222222222222222222222222222222 = new LinkedHashMap();
                    it = V0.iterator();
                    while (it.hasNext()) {
                    }
                    linkedHashMap = new LinkedHashMap(linkedHashMap72222222222222222222222222222222222222222222);
                    if (linkedHashMap == null) {
                    }
                    CatalogBlockDataTypeDto l062222222222222222222222222222222222222222222 = catalogBlockDto.l0();
                    w0 = catalogBlockDto.w0();
                    hpu hpuVar2222222222222222222222222222222222222222222 = new hpu();
                    i3 = a.$EnumSwitchMapping$0[l062222222222222222222222222222222222222222222.ordinal()];
                    if (i3 != 15) {
                    }
                    a2a a2aVar2222222222222222222222222222222222222222222 = new a2a(1, hpuVar2222222222222222222222222222222222222222222, hpu.class, "map", "map(Lcom/vk/api/generated/catalog/dto/CatalogEntityGroupsItemDto;)Lcom/vk/dto/group/GroupsEntityCatalogItem;", 0, 0);
                    LinkedHashMap linkedHashMap82222222222222222222222222222222222222222222 = new LinkedHashMap();
                    it2 = w0.iterator();
                    while (it2.hasNext()) {
                    }
                    linkedHashMap2 = new LinkedHashMap(linkedHashMap82222222222222222222222222222222222222222222);
                    if (linkedHashMap2 == null) {
                    }
                    LinkedHashMap linkedHashMap92222222222222222222222222222222222222222222 = linkedHashMap2;
                    l0 = catalogBlockDto.l0();
                    List<CatalogSearchAuthorItemDto> y22222222222222222222222222222222222222222222 = catalogBlockDto.y2();
                    if (l0 == CatalogBlockDataTypeDto.SEARCH_AUTHORS) {
                    }
                    l02 = catalogBlockDto.l0();
                    List<CatalogGameItemDto> H02222222222222222222222222222222222222222222 = catalogBlockDto.H0();
                    if (l02 == CatalogBlockDataTypeDto.GAMES) {
                    }
                    String str22222222222222222222222222222222222222222222 = str;
                    l03 = catalogBlockDto.l0();
                    List<CatalogGroupCategoryMetaItemDto> N02222222222222222222222222222222222222222222 = catalogBlockDto.N0();
                    t2a t2aVar2222222222222222222222222222222222222222222 = new t2a();
                    if (l03 != CatalogBlockDataTypeDto.GROUPS_CATEGORY_ITEMS) {
                    }
                    LinkedHashMap linkedHashMap112222222222222222222222222222222222222222222 = linkedHashMap5;
                    l04 = catalogBlockDto.l0();
                    List<CatalogMiniAppContentItemDto> E12222222222222222222222222222222222222222222 = catalogBlockDto.E1();
                    if (l04 == CatalogBlockDataTypeDto.MINI_APPS_CONTENT) {
                    }
                    LinkedHashMap linkedHashMap122222222222222222222222222222222222222222222 = linkedHashMap6;
                    i4 = a.$EnumSwitchMapping$0[catalogBlockDto.l0().ordinal()];
                    if (i4 != 10) {
                    }
                    P0 = catalogBlockDto.P0();
                    if (P0 == null) {
                    }
                    if (r1 == 0) {
                    }
                    arrayList2 = new ArrayList((Collection) r1);
                    if (arrayList2 == null) {
                    }
                    ArrayList arrayList42222222222222222222222222222222222222222222 = arrayList2;
                    T = catalogBlockDto.T();
                    if (T == null) {
                    }
                    if (map == null) {
                    }
                    LinkedHashMap linkedHashMap132222222222222222222222222222222222222222222 = new LinkedHashMap(map);
                    CatalogBlockDataTypeDto l072222222222222222222222222222222222222222222 = catalogBlockDto.l0();
                    M = catalogBlockDto.M();
                    LinkedHashMap linkedHashMap142222222222222222222222222222222222222222222 = new LinkedHashMap();
                    if (M != null) {
                    }
                    return new CatalogBlockItemsData(a32222222222222222222222222222222222222222222, arrayList32222222222222222222222222222222222222222222, linkedHashMap, linkedHashMap3, linkedHashMap4, linkedHashMap92222222222222222222222222222222222222222222, linkedHashMap112222222222222222222222222222222222222222222, linkedHashMap122222222222222222222222222222222222222222222, arrayList42222222222222222222222222222222222222222222, linkedHashMap132222222222222222222222222222222222222222222, null, linkedHashMap142222222222222222222222222222222222222222222, 1024, null);
                }
                i2 = null;
                if (i2 == null) {
                }
                CatalogDataType a322222222222222222222222222222222222222222222 = a4a.a(catalogBlockDto.l0());
                ArrayList arrayList322222222222222222222222222222222222222222222 = new ArrayList(i2);
                CatalogBlockDataTypeDto l0522222222222222222222222222222222222222222222 = catalogBlockDto.l0();
                V0 = catalogBlockDto.V0();
                i = a.$EnumSwitchMapping$0[l0522222222222222222222222222222222222222222222.ordinal()];
                if (i != 10) {
                }
                LinkedHashMap linkedHashMap722222222222222222222222222222222222222222222 = new LinkedHashMap();
                it = V0.iterator();
                while (it.hasNext()) {
                }
                linkedHashMap = new LinkedHashMap(linkedHashMap722222222222222222222222222222222222222222222);
                if (linkedHashMap == null) {
                }
                CatalogBlockDataTypeDto l0622222222222222222222222222222222222222222222 = catalogBlockDto.l0();
                w0 = catalogBlockDto.w0();
                hpu hpuVar22222222222222222222222222222222222222222222 = new hpu();
                i3 = a.$EnumSwitchMapping$0[l0622222222222222222222222222222222222222222222.ordinal()];
                if (i3 != 15) {
                }
                a2a a2aVar22222222222222222222222222222222222222222222 = new a2a(1, hpuVar22222222222222222222222222222222222222222222, hpu.class, "map", "map(Lcom/vk/api/generated/catalog/dto/CatalogEntityGroupsItemDto;)Lcom/vk/dto/group/GroupsEntityCatalogItem;", 0, 0);
                LinkedHashMap linkedHashMap822222222222222222222222222222222222222222222 = new LinkedHashMap();
                it2 = w0.iterator();
                while (it2.hasNext()) {
                }
                linkedHashMap2 = new LinkedHashMap(linkedHashMap822222222222222222222222222222222222222222222);
                if (linkedHashMap2 == null) {
                }
                LinkedHashMap linkedHashMap922222222222222222222222222222222222222222222 = linkedHashMap2;
                l0 = catalogBlockDto.l0();
                List<CatalogSearchAuthorItemDto> y222222222222222222222222222222222222222222222 = catalogBlockDto.y2();
                if (l0 == CatalogBlockDataTypeDto.SEARCH_AUTHORS) {
                }
                l02 = catalogBlockDto.l0();
                List<CatalogGameItemDto> H022222222222222222222222222222222222222222222 = catalogBlockDto.H0();
                if (l02 == CatalogBlockDataTypeDto.GAMES) {
                }
                String str222222222222222222222222222222222222222222222 = str;
                l03 = catalogBlockDto.l0();
                List<CatalogGroupCategoryMetaItemDto> N022222222222222222222222222222222222222222222 = catalogBlockDto.N0();
                t2a t2aVar22222222222222222222222222222222222222222222 = new t2a();
                if (l03 != CatalogBlockDataTypeDto.GROUPS_CATEGORY_ITEMS) {
                }
                LinkedHashMap linkedHashMap1122222222222222222222222222222222222222222222 = linkedHashMap5;
                l04 = catalogBlockDto.l0();
                List<CatalogMiniAppContentItemDto> E122222222222222222222222222222222222222222222 = catalogBlockDto.E1();
                if (l04 == CatalogBlockDataTypeDto.MINI_APPS_CONTENT) {
                }
                LinkedHashMap linkedHashMap1222222222222222222222222222222222222222222222 = linkedHashMap6;
                i4 = a.$EnumSwitchMapping$0[catalogBlockDto.l0().ordinal()];
                if (i4 != 10) {
                }
                P0 = catalogBlockDto.P0();
                if (P0 == null) {
                }
                if (r1 == 0) {
                }
                arrayList2 = new ArrayList((Collection) r1);
                if (arrayList2 == null) {
                }
                ArrayList arrayList422222222222222222222222222222222222222222222 = arrayList2;
                T = catalogBlockDto.T();
                if (T == null) {
                }
                if (map == null) {
                }
                LinkedHashMap linkedHashMap1322222222222222222222222222222222222222222222 = new LinkedHashMap(map);
                CatalogBlockDataTypeDto l0722222222222222222222222222222222222222222222 = catalogBlockDto.l0();
                M = catalogBlockDto.M();
                LinkedHashMap linkedHashMap1422222222222222222222222222222222222222222222 = new LinkedHashMap();
                if (M != null) {
                }
                return new CatalogBlockItemsData(a322222222222222222222222222222222222222222222, arrayList322222222222222222222222222222222222222222222, linkedHashMap, linkedHashMap3, linkedHashMap4, linkedHashMap922222222222222222222222222222222222222222222, linkedHashMap1122222222222222222222222222222222222222222222, linkedHashMap1222222222222222222222222222222222222222222222, arrayList422222222222222222222222222222222222222222222, linkedHashMap1322222222222222222222222222222222222222222222, null, linkedHashMap1422222222222222222222222222222222222222222222, 1024, null);
            case 35:
                List<CatalogSearchRecentDto> E2 = catalogBlockDto.E2();
                if (E2 != null) {
                    arrayList = new ArrayList();
                    for (CatalogSearchRecentDto catalogSearchRecentDto : E2) {
                        String id6 = catalogSearchRecentDto.getId();
                        String e5 = catalogSearchRecentDto.e();
                        Long n = e5 != null ? arm0.n(e5) : null;
                        if (id6 == null && n == null) {
                            a2 = null;
                        } else {
                            String id7 = catalogSearchRecentDto.getId();
                            if (id7 == null) {
                                id7 = "";
                            }
                            UserId userId = new UserId(n != null ? n.longValue() : 0L);
                            switch (a.$EnumSwitchMapping$1[catalogSearchRecentDto.d().ordinal()]) {
                                case 1:
                                    type = SearchHistoryModel.Type.Track;
                                    break;
                                case 2:
                                    type = SearchHistoryModel.Type.Album;
                                    break;
                                case 3:
                                    type = SearchHistoryModel.Type.Playlist;
                                    break;
                                case 4:
                                    type = SearchHistoryModel.Type.TrackLyrics;
                                    break;
                                case 5:
                                    type = SearchHistoryModel.Type.Artist;
                                    break;
                                case 6:
                                    type = SearchHistoryModel.Type.Podcast;
                                    break;
                                case 7:
                                    type = SearchHistoryModel.Type.RadioStation;
                                    break;
                                case 8:
                                    type = SearchHistoryModel.Type.AudioBook;
                                    break;
                                case 9:
                                    type = SearchHistoryModel.Type.Video;
                                    break;
                                default:
                                    throw new NoWhenBranchMatchedException();
                            }
                            StringBuilder sb = new StringBuilder();
                            sb.append(type.i());
                            sb.append(HiAnalyticsConstant.REPORT_VAL_SEPARATOR);
                            sb.append(userId);
                            sb.append(HiAnalyticsConstant.REPORT_VAL_SEPARATOR);
                            a2 = i5s.a(sb, id7, "|null|");
                        }
                        if (a2 != null) {
                            arrayList.add(a2);
                        }
                    }
                    i2 = arrayList;
                    if (i2 == null) {
                    }
                    CatalogDataType a3222222222222222222222222222222222222222222222 = a4a.a(catalogBlockDto.l0());
                    ArrayList arrayList3222222222222222222222222222222222222222222222 = new ArrayList(i2);
                    CatalogBlockDataTypeDto l05222222222222222222222222222222222222222222222 = catalogBlockDto.l0();
                    V0 = catalogBlockDto.V0();
                    i = a.$EnumSwitchMapping$0[l05222222222222222222222222222222222222222222222.ordinal()];
                    if (i != 10) {
                    }
                    LinkedHashMap linkedHashMap7222222222222222222222222222222222222222222222 = new LinkedHashMap();
                    it = V0.iterator();
                    while (it.hasNext()) {
                    }
                    linkedHashMap = new LinkedHashMap(linkedHashMap7222222222222222222222222222222222222222222222);
                    if (linkedHashMap == null) {
                    }
                    CatalogBlockDataTypeDto l06222222222222222222222222222222222222222222222 = catalogBlockDto.l0();
                    w0 = catalogBlockDto.w0();
                    hpu hpuVar222222222222222222222222222222222222222222222 = new hpu();
                    i3 = a.$EnumSwitchMapping$0[l06222222222222222222222222222222222222222222222.ordinal()];
                    if (i3 != 15) {
                    }
                    a2a a2aVar222222222222222222222222222222222222222222222 = new a2a(1, hpuVar222222222222222222222222222222222222222222222, hpu.class, "map", "map(Lcom/vk/api/generated/catalog/dto/CatalogEntityGroupsItemDto;)Lcom/vk/dto/group/GroupsEntityCatalogItem;", 0, 0);
                    LinkedHashMap linkedHashMap8222222222222222222222222222222222222222222222 = new LinkedHashMap();
                    it2 = w0.iterator();
                    while (it2.hasNext()) {
                    }
                    linkedHashMap2 = new LinkedHashMap(linkedHashMap8222222222222222222222222222222222222222222222);
                    if (linkedHashMap2 == null) {
                    }
                    LinkedHashMap linkedHashMap9222222222222222222222222222222222222222222222 = linkedHashMap2;
                    l0 = catalogBlockDto.l0();
                    List<CatalogSearchAuthorItemDto> y2222222222222222222222222222222222222222222222 = catalogBlockDto.y2();
                    if (l0 == CatalogBlockDataTypeDto.SEARCH_AUTHORS) {
                    }
                    l02 = catalogBlockDto.l0();
                    List<CatalogGameItemDto> H0222222222222222222222222222222222222222222222 = catalogBlockDto.H0();
                    if (l02 == CatalogBlockDataTypeDto.GAMES) {
                    }
                    String str2222222222222222222222222222222222222222222222 = str;
                    l03 = catalogBlockDto.l0();
                    List<CatalogGroupCategoryMetaItemDto> N0222222222222222222222222222222222222222222222 = catalogBlockDto.N0();
                    t2a t2aVar222222222222222222222222222222222222222222222 = new t2a();
                    if (l03 != CatalogBlockDataTypeDto.GROUPS_CATEGORY_ITEMS) {
                    }
                    LinkedHashMap linkedHashMap11222222222222222222222222222222222222222222222 = linkedHashMap5;
                    l04 = catalogBlockDto.l0();
                    List<CatalogMiniAppContentItemDto> E1222222222222222222222222222222222222222222222 = catalogBlockDto.E1();
                    if (l04 == CatalogBlockDataTypeDto.MINI_APPS_CONTENT) {
                    }
                    LinkedHashMap linkedHashMap12222222222222222222222222222222222222222222222 = linkedHashMap6;
                    i4 = a.$EnumSwitchMapping$0[catalogBlockDto.l0().ordinal()];
                    if (i4 != 10) {
                    }
                    P0 = catalogBlockDto.P0();
                    if (P0 == null) {
                    }
                    if (r1 == 0) {
                    }
                    arrayList2 = new ArrayList((Collection) r1);
                    if (arrayList2 == null) {
                    }
                    ArrayList arrayList4222222222222222222222222222222222222222222222 = arrayList2;
                    T = catalogBlockDto.T();
                    if (T == null) {
                    }
                    if (map == null) {
                    }
                    LinkedHashMap linkedHashMap13222222222222222222222222222222222222222222222 = new LinkedHashMap(map);
                    CatalogBlockDataTypeDto l07222222222222222222222222222222222222222222222 = catalogBlockDto.l0();
                    M = catalogBlockDto.M();
                    LinkedHashMap linkedHashMap14222222222222222222222222222222222222222222222 = new LinkedHashMap();
                    if (M != null) {
                    }
                    return new CatalogBlockItemsData(a3222222222222222222222222222222222222222222222, arrayList3222222222222222222222222222222222222222222222, linkedHashMap, linkedHashMap3, linkedHashMap4, linkedHashMap9222222222222222222222222222222222222222222222, linkedHashMap11222222222222222222222222222222222222222222222, linkedHashMap12222222222222222222222222222222222222222222222, arrayList4222222222222222222222222222222222222222222222, linkedHashMap13222222222222222222222222222222222222222222222, null, linkedHashMap14222222222222222222222222222222222222222222222, 1024, null);
                }
                i2 = null;
                if (i2 == null) {
                }
                CatalogDataType a32222222222222222222222222222222222222222222222 = a4a.a(catalogBlockDto.l0());
                ArrayList arrayList32222222222222222222222222222222222222222222222 = new ArrayList(i2);
                CatalogBlockDataTypeDto l052222222222222222222222222222222222222222222222 = catalogBlockDto.l0();
                V0 = catalogBlockDto.V0();
                i = a.$EnumSwitchMapping$0[l052222222222222222222222222222222222222222222222.ordinal()];
                if (i != 10) {
                }
                LinkedHashMap linkedHashMap72222222222222222222222222222222222222222222222 = new LinkedHashMap();
                it = V0.iterator();
                while (it.hasNext()) {
                }
                linkedHashMap = new LinkedHashMap(linkedHashMap72222222222222222222222222222222222222222222222);
                if (linkedHashMap == null) {
                }
                CatalogBlockDataTypeDto l062222222222222222222222222222222222222222222222 = catalogBlockDto.l0();
                w0 = catalogBlockDto.w0();
                hpu hpuVar2222222222222222222222222222222222222222222222 = new hpu();
                i3 = a.$EnumSwitchMapping$0[l062222222222222222222222222222222222222222222222.ordinal()];
                if (i3 != 15) {
                }
                a2a a2aVar2222222222222222222222222222222222222222222222 = new a2a(1, hpuVar2222222222222222222222222222222222222222222222, hpu.class, "map", "map(Lcom/vk/api/generated/catalog/dto/CatalogEntityGroupsItemDto;)Lcom/vk/dto/group/GroupsEntityCatalogItem;", 0, 0);
                LinkedHashMap linkedHashMap82222222222222222222222222222222222222222222222 = new LinkedHashMap();
                it2 = w0.iterator();
                while (it2.hasNext()) {
                }
                linkedHashMap2 = new LinkedHashMap(linkedHashMap82222222222222222222222222222222222222222222222);
                if (linkedHashMap2 == null) {
                }
                LinkedHashMap linkedHashMap92222222222222222222222222222222222222222222222 = linkedHashMap2;
                l0 = catalogBlockDto.l0();
                List<CatalogSearchAuthorItemDto> y22222222222222222222222222222222222222222222222 = catalogBlockDto.y2();
                if (l0 == CatalogBlockDataTypeDto.SEARCH_AUTHORS) {
                }
                l02 = catalogBlockDto.l0();
                List<CatalogGameItemDto> H02222222222222222222222222222222222222222222222 = catalogBlockDto.H0();
                if (l02 == CatalogBlockDataTypeDto.GAMES) {
                }
                String str22222222222222222222222222222222222222222222222 = str;
                l03 = catalogBlockDto.l0();
                List<CatalogGroupCategoryMetaItemDto> N02222222222222222222222222222222222222222222222 = catalogBlockDto.N0();
                t2a t2aVar2222222222222222222222222222222222222222222222 = new t2a();
                if (l03 != CatalogBlockDataTypeDto.GROUPS_CATEGORY_ITEMS) {
                }
                LinkedHashMap linkedHashMap112222222222222222222222222222222222222222222222 = linkedHashMap5;
                l04 = catalogBlockDto.l0();
                List<CatalogMiniAppContentItemDto> E12222222222222222222222222222222222222222222222 = catalogBlockDto.E1();
                if (l04 == CatalogBlockDataTypeDto.MINI_APPS_CONTENT) {
                }
                LinkedHashMap linkedHashMap122222222222222222222222222222222222222222222222 = linkedHashMap6;
                i4 = a.$EnumSwitchMapping$0[catalogBlockDto.l0().ordinal()];
                if (i4 != 10) {
                }
                P0 = catalogBlockDto.P0();
                if (P0 == null) {
                }
                if (r1 == 0) {
                }
                arrayList2 = new ArrayList((Collection) r1);
                if (arrayList2 == null) {
                }
                ArrayList arrayList42222222222222222222222222222222222222222222222 = arrayList2;
                T = catalogBlockDto.T();
                if (T == null) {
                }
                if (map == null) {
                }
                LinkedHashMap linkedHashMap132222222222222222222222222222222222222222222222 = new LinkedHashMap(map);
                CatalogBlockDataTypeDto l072222222222222222222222222222222222222222222222 = catalogBlockDto.l0();
                M = catalogBlockDto.M();
                LinkedHashMap linkedHashMap142222222222222222222222222222222222222222222222 = new LinkedHashMap();
                if (M != null) {
                }
                return new CatalogBlockItemsData(a32222222222222222222222222222222222222222222222, arrayList32222222222222222222222222222222222222222222222, linkedHashMap, linkedHashMap3, linkedHashMap4, linkedHashMap92222222222222222222222222222222222222222222222, linkedHashMap112222222222222222222222222222222222222222222222, linkedHashMap122222222222222222222222222222222222222222222222, arrayList42222222222222222222222222222222222222222222222, linkedHashMap132222222222222222222222222222222222222222222222, null, linkedHashMap142222222222222222222222222222222222222222222222, 1024, null);
            case 36:
                i2 = catalogBlockDto.Q2();
                if (i2 == null) {
                }
                CatalogDataType a322222222222222222222222222222222222222222222222 = a4a.a(catalogBlockDto.l0());
                ArrayList arrayList322222222222222222222222222222222222222222222222 = new ArrayList(i2);
                CatalogBlockDataTypeDto l0522222222222222222222222222222222222222222222222 = catalogBlockDto.l0();
                V0 = catalogBlockDto.V0();
                i = a.$EnumSwitchMapping$0[l0522222222222222222222222222222222222222222222222.ordinal()];
                if (i != 10) {
                }
                LinkedHashMap linkedHashMap722222222222222222222222222222222222222222222222 = new LinkedHashMap();
                it = V0.iterator();
                while (it.hasNext()) {
                }
                linkedHashMap = new LinkedHashMap(linkedHashMap722222222222222222222222222222222222222222222222);
                if (linkedHashMap == null) {
                }
                CatalogBlockDataTypeDto l0622222222222222222222222222222222222222222222222 = catalogBlockDto.l0();
                w0 = catalogBlockDto.w0();
                hpu hpuVar22222222222222222222222222222222222222222222222 = new hpu();
                i3 = a.$EnumSwitchMapping$0[l0622222222222222222222222222222222222222222222222.ordinal()];
                if (i3 != 15) {
                }
                a2a a2aVar22222222222222222222222222222222222222222222222 = new a2a(1, hpuVar22222222222222222222222222222222222222222222222, hpu.class, "map", "map(Lcom/vk/api/generated/catalog/dto/CatalogEntityGroupsItemDto;)Lcom/vk/dto/group/GroupsEntityCatalogItem;", 0, 0);
                LinkedHashMap linkedHashMap822222222222222222222222222222222222222222222222 = new LinkedHashMap();
                it2 = w0.iterator();
                while (it2.hasNext()) {
                }
                linkedHashMap2 = new LinkedHashMap(linkedHashMap822222222222222222222222222222222222222222222222);
                if (linkedHashMap2 == null) {
                }
                LinkedHashMap linkedHashMap922222222222222222222222222222222222222222222222 = linkedHashMap2;
                l0 = catalogBlockDto.l0();
                List<CatalogSearchAuthorItemDto> y222222222222222222222222222222222222222222222222 = catalogBlockDto.y2();
                if (l0 == CatalogBlockDataTypeDto.SEARCH_AUTHORS) {
                }
                l02 = catalogBlockDto.l0();
                List<CatalogGameItemDto> H022222222222222222222222222222222222222222222222 = catalogBlockDto.H0();
                if (l02 == CatalogBlockDataTypeDto.GAMES) {
                }
                String str222222222222222222222222222222222222222222222222 = str;
                l03 = catalogBlockDto.l0();
                List<CatalogGroupCategoryMetaItemDto> N022222222222222222222222222222222222222222222222 = catalogBlockDto.N0();
                t2a t2aVar22222222222222222222222222222222222222222222222 = new t2a();
                if (l03 != CatalogBlockDataTypeDto.GROUPS_CATEGORY_ITEMS) {
                }
                LinkedHashMap linkedHashMap1122222222222222222222222222222222222222222222222 = linkedHashMap5;
                l04 = catalogBlockDto.l0();
                List<CatalogMiniAppContentItemDto> E122222222222222222222222222222222222222222222222 = catalogBlockDto.E1();
                if (l04 == CatalogBlockDataTypeDto.MINI_APPS_CONTENT) {
                }
                LinkedHashMap linkedHashMap1222222222222222222222222222222222222222222222222 = linkedHashMap6;
                i4 = a.$EnumSwitchMapping$0[catalogBlockDto.l0().ordinal()];
                if (i4 != 10) {
                }
                P0 = catalogBlockDto.P0();
                if (P0 == null) {
                }
                if (r1 == 0) {
                }
                arrayList2 = new ArrayList((Collection) r1);
                if (arrayList2 == null) {
                }
                ArrayList arrayList422222222222222222222222222222222222222222222222 = arrayList2;
                T = catalogBlockDto.T();
                if (T == null) {
                }
                if (map == null) {
                }
                LinkedHashMap linkedHashMap1322222222222222222222222222222222222222222222222 = new LinkedHashMap(map);
                CatalogBlockDataTypeDto l0722222222222222222222222222222222222222222222222 = catalogBlockDto.l0();
                M = catalogBlockDto.M();
                LinkedHashMap linkedHashMap1422222222222222222222222222222222222222222222222 = new LinkedHashMap();
                if (M != null) {
                }
                return new CatalogBlockItemsData(a322222222222222222222222222222222222222222222222, arrayList322222222222222222222222222222222222222222222222, linkedHashMap, linkedHashMap3, linkedHashMap4, linkedHashMap922222222222222222222222222222222222222222222222, linkedHashMap1122222222222222222222222222222222222222222222222, linkedHashMap1222222222222222222222222222222222222222222222222, arrayList422222222222222222222222222222222222222222222222, linkedHashMap1322222222222222222222222222222222222222222222222, null, linkedHashMap1422222222222222222222222222222222222222222222222, 1024, null);
            case 37:
                i2 = catalogBlockDto.J2();
                if (i2 == null) {
                }
                CatalogDataType a3222222222222222222222222222222222222222222222222 = a4a.a(catalogBlockDto.l0());
                ArrayList arrayList3222222222222222222222222222222222222222222222222 = new ArrayList(i2);
                CatalogBlockDataTypeDto l05222222222222222222222222222222222222222222222222 = catalogBlockDto.l0();
                V0 = catalogBlockDto.V0();
                i = a.$EnumSwitchMapping$0[l05222222222222222222222222222222222222222222222222.ordinal()];
                if (i != 10) {
                }
                LinkedHashMap linkedHashMap7222222222222222222222222222222222222222222222222 = new LinkedHashMap();
                it = V0.iterator();
                while (it.hasNext()) {
                }
                linkedHashMap = new LinkedHashMap(linkedHashMap7222222222222222222222222222222222222222222222222);
                if (linkedHashMap == null) {
                }
                CatalogBlockDataTypeDto l06222222222222222222222222222222222222222222222222 = catalogBlockDto.l0();
                w0 = catalogBlockDto.w0();
                hpu hpuVar222222222222222222222222222222222222222222222222 = new hpu();
                i3 = a.$EnumSwitchMapping$0[l06222222222222222222222222222222222222222222222222.ordinal()];
                if (i3 != 15) {
                }
                a2a a2aVar222222222222222222222222222222222222222222222222 = new a2a(1, hpuVar222222222222222222222222222222222222222222222222, hpu.class, "map", "map(Lcom/vk/api/generated/catalog/dto/CatalogEntityGroupsItemDto;)Lcom/vk/dto/group/GroupsEntityCatalogItem;", 0, 0);
                LinkedHashMap linkedHashMap8222222222222222222222222222222222222222222222222 = new LinkedHashMap();
                it2 = w0.iterator();
                while (it2.hasNext()) {
                }
                linkedHashMap2 = new LinkedHashMap(linkedHashMap8222222222222222222222222222222222222222222222222);
                if (linkedHashMap2 == null) {
                }
                LinkedHashMap linkedHashMap9222222222222222222222222222222222222222222222222 = linkedHashMap2;
                l0 = catalogBlockDto.l0();
                List<CatalogSearchAuthorItemDto> y2222222222222222222222222222222222222222222222222 = catalogBlockDto.y2();
                if (l0 == CatalogBlockDataTypeDto.SEARCH_AUTHORS) {
                }
                l02 = catalogBlockDto.l0();
                List<CatalogGameItemDto> H0222222222222222222222222222222222222222222222222 = catalogBlockDto.H0();
                if (l02 == CatalogBlockDataTypeDto.GAMES) {
                }
                String str2222222222222222222222222222222222222222222222222 = str;
                l03 = catalogBlockDto.l0();
                List<CatalogGroupCategoryMetaItemDto> N0222222222222222222222222222222222222222222222222 = catalogBlockDto.N0();
                t2a t2aVar222222222222222222222222222222222222222222222222 = new t2a();
                if (l03 != CatalogBlockDataTypeDto.GROUPS_CATEGORY_ITEMS) {
                }
                LinkedHashMap linkedHashMap11222222222222222222222222222222222222222222222222 = linkedHashMap5;
                l04 = catalogBlockDto.l0();
                List<CatalogMiniAppContentItemDto> E1222222222222222222222222222222222222222222222222 = catalogBlockDto.E1();
                if (l04 == CatalogBlockDataTypeDto.MINI_APPS_CONTENT) {
                }
                LinkedHashMap linkedHashMap12222222222222222222222222222222222222222222222222 = linkedHashMap6;
                i4 = a.$EnumSwitchMapping$0[catalogBlockDto.l0().ordinal()];
                if (i4 != 10) {
                }
                P0 = catalogBlockDto.P0();
                if (P0 == null) {
                }
                if (r1 == 0) {
                }
                arrayList2 = new ArrayList((Collection) r1);
                if (arrayList2 == null) {
                }
                ArrayList arrayList4222222222222222222222222222222222222222222222222 = arrayList2;
                T = catalogBlockDto.T();
                if (T == null) {
                }
                if (map == null) {
                }
                LinkedHashMap linkedHashMap13222222222222222222222222222222222222222222222222 = new LinkedHashMap(map);
                CatalogBlockDataTypeDto l07222222222222222222222222222222222222222222222222 = catalogBlockDto.l0();
                M = catalogBlockDto.M();
                LinkedHashMap linkedHashMap14222222222222222222222222222222222222222222222222 = new LinkedHashMap();
                if (M != null) {
                }
                return new CatalogBlockItemsData(a3222222222222222222222222222222222222222222222222, arrayList3222222222222222222222222222222222222222222222222, linkedHashMap, linkedHashMap3, linkedHashMap4, linkedHashMap9222222222222222222222222222222222222222222222222, linkedHashMap11222222222222222222222222222222222222222222222222, linkedHashMap12222222222222222222222222222222222222222222222222, arrayList4222222222222222222222222222222222222222222222222, linkedHashMap13222222222222222222222222222222222222222222222222, null, linkedHashMap14222222222222222222222222222222222222222222222222, 1024, null);
            case 38:
                List<CatalogSearchAuthorItemDto> y23 = catalogBlockDto.y2();
                if (y23 != null) {
                    List<CatalogSearchAuthorItemDto> list19 = y23;
                    arrayList = new ArrayList(c5g.u(list19, 10));
                    Iterator it18 = list19.iterator();
                    while (it18.hasNext()) {
                        arrayList.add(String.valueOf(((CatalogSearchAuthorItemDto) it18.next()).e()));
                    }
                    i2 = arrayList;
                    if (i2 == null) {
                    }
                    CatalogDataType a32222222222222222222222222222222222222222222222222 = a4a.a(catalogBlockDto.l0());
                    ArrayList arrayList32222222222222222222222222222222222222222222222222 = new ArrayList(i2);
                    CatalogBlockDataTypeDto l052222222222222222222222222222222222222222222222222 = catalogBlockDto.l0();
                    V0 = catalogBlockDto.V0();
                    i = a.$EnumSwitchMapping$0[l052222222222222222222222222222222222222222222222222.ordinal()];
                    if (i != 10) {
                    }
                    LinkedHashMap linkedHashMap72222222222222222222222222222222222222222222222222 = new LinkedHashMap();
                    it = V0.iterator();
                    while (it.hasNext()) {
                    }
                    linkedHashMap = new LinkedHashMap(linkedHashMap72222222222222222222222222222222222222222222222222);
                    if (linkedHashMap == null) {
                    }
                    CatalogBlockDataTypeDto l062222222222222222222222222222222222222222222222222 = catalogBlockDto.l0();
                    w0 = catalogBlockDto.w0();
                    hpu hpuVar2222222222222222222222222222222222222222222222222 = new hpu();
                    i3 = a.$EnumSwitchMapping$0[l062222222222222222222222222222222222222222222222222.ordinal()];
                    if (i3 != 15) {
                    }
                    a2a a2aVar2222222222222222222222222222222222222222222222222 = new a2a(1, hpuVar2222222222222222222222222222222222222222222222222, hpu.class, "map", "map(Lcom/vk/api/generated/catalog/dto/CatalogEntityGroupsItemDto;)Lcom/vk/dto/group/GroupsEntityCatalogItem;", 0, 0);
                    LinkedHashMap linkedHashMap82222222222222222222222222222222222222222222222222 = new LinkedHashMap();
                    it2 = w0.iterator();
                    while (it2.hasNext()) {
                    }
                    linkedHashMap2 = new LinkedHashMap(linkedHashMap82222222222222222222222222222222222222222222222222);
                    if (linkedHashMap2 == null) {
                    }
                    LinkedHashMap linkedHashMap92222222222222222222222222222222222222222222222222 = linkedHashMap2;
                    l0 = catalogBlockDto.l0();
                    List<CatalogSearchAuthorItemDto> y22222222222222222222222222222222222222222222222222 = catalogBlockDto.y2();
                    if (l0 == CatalogBlockDataTypeDto.SEARCH_AUTHORS) {
                    }
                    l02 = catalogBlockDto.l0();
                    List<CatalogGameItemDto> H02222222222222222222222222222222222222222222222222 = catalogBlockDto.H0();
                    if (l02 == CatalogBlockDataTypeDto.GAMES) {
                    }
                    String str22222222222222222222222222222222222222222222222222 = str;
                    l03 = catalogBlockDto.l0();
                    List<CatalogGroupCategoryMetaItemDto> N02222222222222222222222222222222222222222222222222 = catalogBlockDto.N0();
                    t2a t2aVar2222222222222222222222222222222222222222222222222 = new t2a();
                    if (l03 != CatalogBlockDataTypeDto.GROUPS_CATEGORY_ITEMS) {
                    }
                    LinkedHashMap linkedHashMap112222222222222222222222222222222222222222222222222 = linkedHashMap5;
                    l04 = catalogBlockDto.l0();
                    List<CatalogMiniAppContentItemDto> E12222222222222222222222222222222222222222222222222 = catalogBlockDto.E1();
                    if (l04 == CatalogBlockDataTypeDto.MINI_APPS_CONTENT) {
                    }
                    LinkedHashMap linkedHashMap122222222222222222222222222222222222222222222222222 = linkedHashMap6;
                    i4 = a.$EnumSwitchMapping$0[catalogBlockDto.l0().ordinal()];
                    if (i4 != 10) {
                    }
                    P0 = catalogBlockDto.P0();
                    if (P0 == null) {
                    }
                    if (r1 == 0) {
                    }
                    arrayList2 = new ArrayList((Collection) r1);
                    if (arrayList2 == null) {
                    }
                    ArrayList arrayList42222222222222222222222222222222222222222222222222 = arrayList2;
                    T = catalogBlockDto.T();
                    if (T == null) {
                    }
                    if (map == null) {
                    }
                    LinkedHashMap linkedHashMap132222222222222222222222222222222222222222222222222 = new LinkedHashMap(map);
                    CatalogBlockDataTypeDto l072222222222222222222222222222222222222222222222222 = catalogBlockDto.l0();
                    M = catalogBlockDto.M();
                    LinkedHashMap linkedHashMap142222222222222222222222222222222222222222222222222 = new LinkedHashMap();
                    if (M != null) {
                    }
                    return new CatalogBlockItemsData(a32222222222222222222222222222222222222222222222222, arrayList32222222222222222222222222222222222222222222222222, linkedHashMap, linkedHashMap3, linkedHashMap4, linkedHashMap92222222222222222222222222222222222222222222222222, linkedHashMap112222222222222222222222222222222222222222222222222, linkedHashMap122222222222222222222222222222222222222222222222222, arrayList42222222222222222222222222222222222222222222222222, linkedHashMap132222222222222222222222222222222222222222222222222, null, linkedHashMap142222222222222222222222222222222222222222222222222, 1024, null);
                }
                i2 = null;
                if (i2 == null) {
                }
                CatalogDataType a322222222222222222222222222222222222222222222222222 = a4a.a(catalogBlockDto.l0());
                ArrayList arrayList322222222222222222222222222222222222222222222222222 = new ArrayList(i2);
                CatalogBlockDataTypeDto l0522222222222222222222222222222222222222222222222222 = catalogBlockDto.l0();
                V0 = catalogBlockDto.V0();
                i = a.$EnumSwitchMapping$0[l0522222222222222222222222222222222222222222222222222.ordinal()];
                if (i != 10) {
                }
                LinkedHashMap linkedHashMap722222222222222222222222222222222222222222222222222 = new LinkedHashMap();
                it = V0.iterator();
                while (it.hasNext()) {
                }
                linkedHashMap = new LinkedHashMap(linkedHashMap722222222222222222222222222222222222222222222222222);
                if (linkedHashMap == null) {
                }
                CatalogBlockDataTypeDto l0622222222222222222222222222222222222222222222222222 = catalogBlockDto.l0();
                w0 = catalogBlockDto.w0();
                hpu hpuVar22222222222222222222222222222222222222222222222222 = new hpu();
                i3 = a.$EnumSwitchMapping$0[l0622222222222222222222222222222222222222222222222222.ordinal()];
                if (i3 != 15) {
                }
                a2a a2aVar22222222222222222222222222222222222222222222222222 = new a2a(1, hpuVar22222222222222222222222222222222222222222222222222, hpu.class, "map", "map(Lcom/vk/api/generated/catalog/dto/CatalogEntityGroupsItemDto;)Lcom/vk/dto/group/GroupsEntityCatalogItem;", 0, 0);
                LinkedHashMap linkedHashMap822222222222222222222222222222222222222222222222222 = new LinkedHashMap();
                it2 = w0.iterator();
                while (it2.hasNext()) {
                }
                linkedHashMap2 = new LinkedHashMap(linkedHashMap822222222222222222222222222222222222222222222222222);
                if (linkedHashMap2 == null) {
                }
                LinkedHashMap linkedHashMap922222222222222222222222222222222222222222222222222 = linkedHashMap2;
                l0 = catalogBlockDto.l0();
                List<CatalogSearchAuthorItemDto> y222222222222222222222222222222222222222222222222222 = catalogBlockDto.y2();
                if (l0 == CatalogBlockDataTypeDto.SEARCH_AUTHORS) {
                }
                l02 = catalogBlockDto.l0();
                List<CatalogGameItemDto> H022222222222222222222222222222222222222222222222222 = catalogBlockDto.H0();
                if (l02 == CatalogBlockDataTypeDto.GAMES) {
                }
                String str222222222222222222222222222222222222222222222222222 = str;
                l03 = catalogBlockDto.l0();
                List<CatalogGroupCategoryMetaItemDto> N022222222222222222222222222222222222222222222222222 = catalogBlockDto.N0();
                t2a t2aVar22222222222222222222222222222222222222222222222222 = new t2a();
                if (l03 != CatalogBlockDataTypeDto.GROUPS_CATEGORY_ITEMS) {
                }
                LinkedHashMap linkedHashMap1122222222222222222222222222222222222222222222222222 = linkedHashMap5;
                l04 = catalogBlockDto.l0();
                List<CatalogMiniAppContentItemDto> E122222222222222222222222222222222222222222222222222 = catalogBlockDto.E1();
                if (l04 == CatalogBlockDataTypeDto.MINI_APPS_CONTENT) {
                }
                LinkedHashMap linkedHashMap1222222222222222222222222222222222222222222222222222 = linkedHashMap6;
                i4 = a.$EnumSwitchMapping$0[catalogBlockDto.l0().ordinal()];
                if (i4 != 10) {
                }
                P0 = catalogBlockDto.P0();
                if (P0 == null) {
                }
                if (r1 == 0) {
                }
                arrayList2 = new ArrayList((Collection) r1);
                if (arrayList2 == null) {
                }
                ArrayList arrayList422222222222222222222222222222222222222222222222222 = arrayList2;
                T = catalogBlockDto.T();
                if (T == null) {
                }
                if (map == null) {
                }
                LinkedHashMap linkedHashMap1322222222222222222222222222222222222222222222222222 = new LinkedHashMap(map);
                CatalogBlockDataTypeDto l0722222222222222222222222222222222222222222222222222 = catalogBlockDto.l0();
                M = catalogBlockDto.M();
                LinkedHashMap linkedHashMap1422222222222222222222222222222222222222222222222222 = new LinkedHashMap();
                if (M != null) {
                }
                return new CatalogBlockItemsData(a322222222222222222222222222222222222222222222222222, arrayList322222222222222222222222222222222222222222222222222, linkedHashMap, linkedHashMap3, linkedHashMap4, linkedHashMap922222222222222222222222222222222222222222222222222, linkedHashMap1122222222222222222222222222222222222222222222222222, linkedHashMap1222222222222222222222222222222222222222222222222222, arrayList422222222222222222222222222222222222222222222222222, linkedHashMap1322222222222222222222222222222222222222222222222222, null, linkedHashMap1422222222222222222222222222222222222222222222222222, 1024, null);
            case 39:
                i2 = catalogBlockDto.h3();
                if (i2 == null) {
                }
                CatalogDataType a3222222222222222222222222222222222222222222222222222 = a4a.a(catalogBlockDto.l0());
                ArrayList arrayList3222222222222222222222222222222222222222222222222222 = new ArrayList(i2);
                CatalogBlockDataTypeDto l05222222222222222222222222222222222222222222222222222 = catalogBlockDto.l0();
                V0 = catalogBlockDto.V0();
                i = a.$EnumSwitchMapping$0[l05222222222222222222222222222222222222222222222222222.ordinal()];
                if (i != 10) {
                }
                LinkedHashMap linkedHashMap7222222222222222222222222222222222222222222222222222 = new LinkedHashMap();
                it = V0.iterator();
                while (it.hasNext()) {
                }
                linkedHashMap = new LinkedHashMap(linkedHashMap7222222222222222222222222222222222222222222222222222);
                if (linkedHashMap == null) {
                }
                CatalogBlockDataTypeDto l06222222222222222222222222222222222222222222222222222 = catalogBlockDto.l0();
                w0 = catalogBlockDto.w0();
                hpu hpuVar222222222222222222222222222222222222222222222222222 = new hpu();
                i3 = a.$EnumSwitchMapping$0[l06222222222222222222222222222222222222222222222222222.ordinal()];
                if (i3 != 15) {
                }
                a2a a2aVar222222222222222222222222222222222222222222222222222 = new a2a(1, hpuVar222222222222222222222222222222222222222222222222222, hpu.class, "map", "map(Lcom/vk/api/generated/catalog/dto/CatalogEntityGroupsItemDto;)Lcom/vk/dto/group/GroupsEntityCatalogItem;", 0, 0);
                LinkedHashMap linkedHashMap8222222222222222222222222222222222222222222222222222 = new LinkedHashMap();
                it2 = w0.iterator();
                while (it2.hasNext()) {
                }
                linkedHashMap2 = new LinkedHashMap(linkedHashMap8222222222222222222222222222222222222222222222222222);
                if (linkedHashMap2 == null) {
                }
                LinkedHashMap linkedHashMap9222222222222222222222222222222222222222222222222222 = linkedHashMap2;
                l0 = catalogBlockDto.l0();
                List<CatalogSearchAuthorItemDto> y2222222222222222222222222222222222222222222222222222 = catalogBlockDto.y2();
                if (l0 == CatalogBlockDataTypeDto.SEARCH_AUTHORS) {
                }
                l02 = catalogBlockDto.l0();
                List<CatalogGameItemDto> H0222222222222222222222222222222222222222222222222222 = catalogBlockDto.H0();
                if (l02 == CatalogBlockDataTypeDto.GAMES) {
                }
                String str2222222222222222222222222222222222222222222222222222 = str;
                l03 = catalogBlockDto.l0();
                List<CatalogGroupCategoryMetaItemDto> N0222222222222222222222222222222222222222222222222222 = catalogBlockDto.N0();
                t2a t2aVar222222222222222222222222222222222222222222222222222 = new t2a();
                if (l03 != CatalogBlockDataTypeDto.GROUPS_CATEGORY_ITEMS) {
                }
                LinkedHashMap linkedHashMap11222222222222222222222222222222222222222222222222222 = linkedHashMap5;
                l04 = catalogBlockDto.l0();
                List<CatalogMiniAppContentItemDto> E1222222222222222222222222222222222222222222222222222 = catalogBlockDto.E1();
                if (l04 == CatalogBlockDataTypeDto.MINI_APPS_CONTENT) {
                }
                LinkedHashMap linkedHashMap12222222222222222222222222222222222222222222222222222 = linkedHashMap6;
                i4 = a.$EnumSwitchMapping$0[catalogBlockDto.l0().ordinal()];
                if (i4 != 10) {
                }
                P0 = catalogBlockDto.P0();
                if (P0 == null) {
                }
                if (r1 == 0) {
                }
                arrayList2 = new ArrayList((Collection) r1);
                if (arrayList2 == null) {
                }
                ArrayList arrayList4222222222222222222222222222222222222222222222222222 = arrayList2;
                T = catalogBlockDto.T();
                if (T == null) {
                }
                if (map == null) {
                }
                LinkedHashMap linkedHashMap13222222222222222222222222222222222222222222222222222 = new LinkedHashMap(map);
                CatalogBlockDataTypeDto l07222222222222222222222222222222222222222222222222222 = catalogBlockDto.l0();
                M = catalogBlockDto.M();
                LinkedHashMap linkedHashMap14222222222222222222222222222222222222222222222222222 = new LinkedHashMap();
                if (M != null) {
                }
                return new CatalogBlockItemsData(a3222222222222222222222222222222222222222222222222222, arrayList3222222222222222222222222222222222222222222222222222, linkedHashMap, linkedHashMap3, linkedHashMap4, linkedHashMap9222222222222222222222222222222222222222222222222222, linkedHashMap11222222222222222222222222222222222222222222222222222, linkedHashMap12222222222222222222222222222222222222222222222222222, arrayList4222222222222222222222222222222222222222222222222222, linkedHashMap13222222222222222222222222222222222222222222222222222, null, linkedHashMap14222222222222222222222222222222222222222222222222222, 1024, null);
            case 40:
                i2 = catalogBlockDto.f3();
                if (i2 == null) {
                }
                CatalogDataType a32222222222222222222222222222222222222222222222222222 = a4a.a(catalogBlockDto.l0());
                ArrayList arrayList32222222222222222222222222222222222222222222222222222 = new ArrayList(i2);
                CatalogBlockDataTypeDto l052222222222222222222222222222222222222222222222222222 = catalogBlockDto.l0();
                V0 = catalogBlockDto.V0();
                i = a.$EnumSwitchMapping$0[l052222222222222222222222222222222222222222222222222222.ordinal()];
                if (i != 10) {
                }
                LinkedHashMap linkedHashMap72222222222222222222222222222222222222222222222222222 = new LinkedHashMap();
                it = V0.iterator();
                while (it.hasNext()) {
                }
                linkedHashMap = new LinkedHashMap(linkedHashMap72222222222222222222222222222222222222222222222222222);
                if (linkedHashMap == null) {
                }
                CatalogBlockDataTypeDto l062222222222222222222222222222222222222222222222222222 = catalogBlockDto.l0();
                w0 = catalogBlockDto.w0();
                hpu hpuVar2222222222222222222222222222222222222222222222222222 = new hpu();
                i3 = a.$EnumSwitchMapping$0[l062222222222222222222222222222222222222222222222222222.ordinal()];
                if (i3 != 15) {
                }
                a2a a2aVar2222222222222222222222222222222222222222222222222222 = new a2a(1, hpuVar2222222222222222222222222222222222222222222222222222, hpu.class, "map", "map(Lcom/vk/api/generated/catalog/dto/CatalogEntityGroupsItemDto;)Lcom/vk/dto/group/GroupsEntityCatalogItem;", 0, 0);
                LinkedHashMap linkedHashMap82222222222222222222222222222222222222222222222222222 = new LinkedHashMap();
                it2 = w0.iterator();
                while (it2.hasNext()) {
                }
                linkedHashMap2 = new LinkedHashMap(linkedHashMap82222222222222222222222222222222222222222222222222222);
                if (linkedHashMap2 == null) {
                }
                LinkedHashMap linkedHashMap92222222222222222222222222222222222222222222222222222 = linkedHashMap2;
                l0 = catalogBlockDto.l0();
                List<CatalogSearchAuthorItemDto> y22222222222222222222222222222222222222222222222222222 = catalogBlockDto.y2();
                if (l0 == CatalogBlockDataTypeDto.SEARCH_AUTHORS) {
                }
                l02 = catalogBlockDto.l0();
                List<CatalogGameItemDto> H02222222222222222222222222222222222222222222222222222 = catalogBlockDto.H0();
                if (l02 == CatalogBlockDataTypeDto.GAMES) {
                }
                String str22222222222222222222222222222222222222222222222222222 = str;
                l03 = catalogBlockDto.l0();
                List<CatalogGroupCategoryMetaItemDto> N02222222222222222222222222222222222222222222222222222 = catalogBlockDto.N0();
                t2a t2aVar2222222222222222222222222222222222222222222222222222 = new t2a();
                if (l03 != CatalogBlockDataTypeDto.GROUPS_CATEGORY_ITEMS) {
                }
                LinkedHashMap linkedHashMap112222222222222222222222222222222222222222222222222222 = linkedHashMap5;
                l04 = catalogBlockDto.l0();
                List<CatalogMiniAppContentItemDto> E12222222222222222222222222222222222222222222222222222 = catalogBlockDto.E1();
                if (l04 == CatalogBlockDataTypeDto.MINI_APPS_CONTENT) {
                }
                LinkedHashMap linkedHashMap122222222222222222222222222222222222222222222222222222 = linkedHashMap6;
                i4 = a.$EnumSwitchMapping$0[catalogBlockDto.l0().ordinal()];
                if (i4 != 10) {
                }
                P0 = catalogBlockDto.P0();
                if (P0 == null) {
                }
                if (r1 == 0) {
                }
                arrayList2 = new ArrayList((Collection) r1);
                if (arrayList2 == null) {
                }
                ArrayList arrayList42222222222222222222222222222222222222222222222222222 = arrayList2;
                T = catalogBlockDto.T();
                if (T == null) {
                }
                if (map == null) {
                }
                LinkedHashMap linkedHashMap132222222222222222222222222222222222222222222222222222 = new LinkedHashMap(map);
                CatalogBlockDataTypeDto l072222222222222222222222222222222222222222222222222222 = catalogBlockDto.l0();
                M = catalogBlockDto.M();
                LinkedHashMap linkedHashMap142222222222222222222222222222222222222222222222222222 = new LinkedHashMap();
                if (M != null) {
                }
                return new CatalogBlockItemsData(a32222222222222222222222222222222222222222222222222222, arrayList32222222222222222222222222222222222222222222222222222, linkedHashMap, linkedHashMap3, linkedHashMap4, linkedHashMap92222222222222222222222222222222222222222222222222222, linkedHashMap112222222222222222222222222222222222222222222222222222, linkedHashMap122222222222222222222222222222222222222222222222222222, arrayList42222222222222222222222222222222222222222222222222222, linkedHashMap132222222222222222222222222222222222222222222222222222, null, linkedHashMap142222222222222222222222222222222222222222222222222222, 1024, null);
            case 41:
                i2 = catalogBlockDto.I2();
                if (i2 == null) {
                }
                CatalogDataType a322222222222222222222222222222222222222222222222222222 = a4a.a(catalogBlockDto.l0());
                ArrayList arrayList322222222222222222222222222222222222222222222222222222 = new ArrayList(i2);
                CatalogBlockDataTypeDto l0522222222222222222222222222222222222222222222222222222 = catalogBlockDto.l0();
                V0 = catalogBlockDto.V0();
                i = a.$EnumSwitchMapping$0[l0522222222222222222222222222222222222222222222222222222.ordinal()];
                if (i != 10) {
                }
                LinkedHashMap linkedHashMap722222222222222222222222222222222222222222222222222222 = new LinkedHashMap();
                it = V0.iterator();
                while (it.hasNext()) {
                }
                linkedHashMap = new LinkedHashMap(linkedHashMap722222222222222222222222222222222222222222222222222222);
                if (linkedHashMap == null) {
                }
                CatalogBlockDataTypeDto l0622222222222222222222222222222222222222222222222222222 = catalogBlockDto.l0();
                w0 = catalogBlockDto.w0();
                hpu hpuVar22222222222222222222222222222222222222222222222222222 = new hpu();
                i3 = a.$EnumSwitchMapping$0[l0622222222222222222222222222222222222222222222222222222.ordinal()];
                if (i3 != 15) {
                }
                a2a a2aVar22222222222222222222222222222222222222222222222222222 = new a2a(1, hpuVar22222222222222222222222222222222222222222222222222222, hpu.class, "map", "map(Lcom/vk/api/generated/catalog/dto/CatalogEntityGroupsItemDto;)Lcom/vk/dto/group/GroupsEntityCatalogItem;", 0, 0);
                LinkedHashMap linkedHashMap822222222222222222222222222222222222222222222222222222 = new LinkedHashMap();
                it2 = w0.iterator();
                while (it2.hasNext()) {
                }
                linkedHashMap2 = new LinkedHashMap(linkedHashMap822222222222222222222222222222222222222222222222222222);
                if (linkedHashMap2 == null) {
                }
                LinkedHashMap linkedHashMap922222222222222222222222222222222222222222222222222222 = linkedHashMap2;
                l0 = catalogBlockDto.l0();
                List<CatalogSearchAuthorItemDto> y222222222222222222222222222222222222222222222222222222 = catalogBlockDto.y2();
                if (l0 == CatalogBlockDataTypeDto.SEARCH_AUTHORS) {
                }
                l02 = catalogBlockDto.l0();
                List<CatalogGameItemDto> H022222222222222222222222222222222222222222222222222222 = catalogBlockDto.H0();
                if (l02 == CatalogBlockDataTypeDto.GAMES) {
                }
                String str222222222222222222222222222222222222222222222222222222 = str;
                l03 = catalogBlockDto.l0();
                List<CatalogGroupCategoryMetaItemDto> N022222222222222222222222222222222222222222222222222222 = catalogBlockDto.N0();
                t2a t2aVar22222222222222222222222222222222222222222222222222222 = new t2a();
                if (l03 != CatalogBlockDataTypeDto.GROUPS_CATEGORY_ITEMS) {
                }
                LinkedHashMap linkedHashMap1122222222222222222222222222222222222222222222222222222 = linkedHashMap5;
                l04 = catalogBlockDto.l0();
                List<CatalogMiniAppContentItemDto> E122222222222222222222222222222222222222222222222222222 = catalogBlockDto.E1();
                if (l04 == CatalogBlockDataTypeDto.MINI_APPS_CONTENT) {
                }
                LinkedHashMap linkedHashMap1222222222222222222222222222222222222222222222222222222 = linkedHashMap6;
                i4 = a.$EnumSwitchMapping$0[catalogBlockDto.l0().ordinal()];
                if (i4 != 10) {
                }
                P0 = catalogBlockDto.P0();
                if (P0 == null) {
                }
                if (r1 == 0) {
                }
                arrayList2 = new ArrayList((Collection) r1);
                if (arrayList2 == null) {
                }
                ArrayList arrayList422222222222222222222222222222222222222222222222222222 = arrayList2;
                T = catalogBlockDto.T();
                if (T == null) {
                }
                if (map == null) {
                }
                LinkedHashMap linkedHashMap1322222222222222222222222222222222222222222222222222222 = new LinkedHashMap(map);
                CatalogBlockDataTypeDto l0722222222222222222222222222222222222222222222222222222 = catalogBlockDto.l0();
                M = catalogBlockDto.M();
                LinkedHashMap linkedHashMap1422222222222222222222222222222222222222222222222222222 = new LinkedHashMap();
                if (M != null) {
                }
                return new CatalogBlockItemsData(a322222222222222222222222222222222222222222222222222222, arrayList322222222222222222222222222222222222222222222222222222, linkedHashMap, linkedHashMap3, linkedHashMap4, linkedHashMap922222222222222222222222222222222222222222222222222222, linkedHashMap1122222222222222222222222222222222222222222222222222222, linkedHashMap1222222222222222222222222222222222222222222222222222222, arrayList422222222222222222222222222222222222222222222222222222, linkedHashMap1322222222222222222222222222222222222222222222222222222, null, linkedHashMap1422222222222222222222222222222222222222222222222222222, 1024, null);
            case 42:
                List<CatalogMiniAppContentItemDto> E13 = catalogBlockDto.E1();
                if (E13 != null) {
                    List<CatalogMiniAppContentItemDto> list20 = E13;
                    arrayList = new ArrayList(c5g.u(list20, 10));
                    Iterator it19 = list20.iterator();
                    while (it19.hasNext()) {
                        String id8 = ((CatalogMiniAppContentItemDto) it19.next()).getId();
                        if (id8 == null) {
                            id8 = "";
                        }
                        arrayList.add(id8);
                    }
                    i2 = arrayList;
                    if (i2 == null) {
                    }
                    CatalogDataType a3222222222222222222222222222222222222222222222222222222 = a4a.a(catalogBlockDto.l0());
                    ArrayList arrayList3222222222222222222222222222222222222222222222222222222 = new ArrayList(i2);
                    CatalogBlockDataTypeDto l05222222222222222222222222222222222222222222222222222222 = catalogBlockDto.l0();
                    V0 = catalogBlockDto.V0();
                    i = a.$EnumSwitchMapping$0[l05222222222222222222222222222222222222222222222222222222.ordinal()];
                    if (i != 10) {
                    }
                    LinkedHashMap linkedHashMap7222222222222222222222222222222222222222222222222222222 = new LinkedHashMap();
                    it = V0.iterator();
                    while (it.hasNext()) {
                    }
                    linkedHashMap = new LinkedHashMap(linkedHashMap7222222222222222222222222222222222222222222222222222222);
                    if (linkedHashMap == null) {
                    }
                    CatalogBlockDataTypeDto l06222222222222222222222222222222222222222222222222222222 = catalogBlockDto.l0();
                    w0 = catalogBlockDto.w0();
                    hpu hpuVar222222222222222222222222222222222222222222222222222222 = new hpu();
                    i3 = a.$EnumSwitchMapping$0[l06222222222222222222222222222222222222222222222222222222.ordinal()];
                    if (i3 != 15) {
                    }
                    a2a a2aVar222222222222222222222222222222222222222222222222222222 = new a2a(1, hpuVar222222222222222222222222222222222222222222222222222222, hpu.class, "map", "map(Lcom/vk/api/generated/catalog/dto/CatalogEntityGroupsItemDto;)Lcom/vk/dto/group/GroupsEntityCatalogItem;", 0, 0);
                    LinkedHashMap linkedHashMap8222222222222222222222222222222222222222222222222222222 = new LinkedHashMap();
                    it2 = w0.iterator();
                    while (it2.hasNext()) {
                    }
                    linkedHashMap2 = new LinkedHashMap(linkedHashMap8222222222222222222222222222222222222222222222222222222);
                    if (linkedHashMap2 == null) {
                    }
                    LinkedHashMap linkedHashMap9222222222222222222222222222222222222222222222222222222 = linkedHashMap2;
                    l0 = catalogBlockDto.l0();
                    List<CatalogSearchAuthorItemDto> y2222222222222222222222222222222222222222222222222222222 = catalogBlockDto.y2();
                    if (l0 == CatalogBlockDataTypeDto.SEARCH_AUTHORS) {
                    }
                    l02 = catalogBlockDto.l0();
                    List<CatalogGameItemDto> H0222222222222222222222222222222222222222222222222222222 = catalogBlockDto.H0();
                    if (l02 == CatalogBlockDataTypeDto.GAMES) {
                    }
                    String str2222222222222222222222222222222222222222222222222222222 = str;
                    l03 = catalogBlockDto.l0();
                    List<CatalogGroupCategoryMetaItemDto> N0222222222222222222222222222222222222222222222222222222 = catalogBlockDto.N0();
                    t2a t2aVar222222222222222222222222222222222222222222222222222222 = new t2a();
                    if (l03 != CatalogBlockDataTypeDto.GROUPS_CATEGORY_ITEMS) {
                    }
                    LinkedHashMap linkedHashMap11222222222222222222222222222222222222222222222222222222 = linkedHashMap5;
                    l04 = catalogBlockDto.l0();
                    List<CatalogMiniAppContentItemDto> E1222222222222222222222222222222222222222222222222222222 = catalogBlockDto.E1();
                    if (l04 == CatalogBlockDataTypeDto.MINI_APPS_CONTENT) {
                    }
                    LinkedHashMap linkedHashMap12222222222222222222222222222222222222222222222222222222 = linkedHashMap6;
                    i4 = a.$EnumSwitchMapping$0[catalogBlockDto.l0().ordinal()];
                    if (i4 != 10) {
                    }
                    P0 = catalogBlockDto.P0();
                    if (P0 == null) {
                    }
                    if (r1 == 0) {
                    }
                    arrayList2 = new ArrayList((Collection) r1);
                    if (arrayList2 == null) {
                    }
                    ArrayList arrayList4222222222222222222222222222222222222222222222222222222 = arrayList2;
                    T = catalogBlockDto.T();
                    if (T == null) {
                    }
                    if (map == null) {
                    }
                    LinkedHashMap linkedHashMap13222222222222222222222222222222222222222222222222222222 = new LinkedHashMap(map);
                    CatalogBlockDataTypeDto l07222222222222222222222222222222222222222222222222222222 = catalogBlockDto.l0();
                    M = catalogBlockDto.M();
                    LinkedHashMap linkedHashMap14222222222222222222222222222222222222222222222222222222 = new LinkedHashMap();
                    if (M != null) {
                    }
                    return new CatalogBlockItemsData(a3222222222222222222222222222222222222222222222222222222, arrayList3222222222222222222222222222222222222222222222222222222, linkedHashMap, linkedHashMap3, linkedHashMap4, linkedHashMap9222222222222222222222222222222222222222222222222222222, linkedHashMap11222222222222222222222222222222222222222222222222222222, linkedHashMap12222222222222222222222222222222222222222222222222222222, arrayList4222222222222222222222222222222222222222222222222222222, linkedHashMap13222222222222222222222222222222222222222222222222222222, null, linkedHashMap14222222222222222222222222222222222222222222222222222222, 1024, null);
                }
                i2 = null;
                if (i2 == null) {
                }
                CatalogDataType a32222222222222222222222222222222222222222222222222222222 = a4a.a(catalogBlockDto.l0());
                ArrayList arrayList32222222222222222222222222222222222222222222222222222222 = new ArrayList(i2);
                CatalogBlockDataTypeDto l052222222222222222222222222222222222222222222222222222222 = catalogBlockDto.l0();
                V0 = catalogBlockDto.V0();
                i = a.$EnumSwitchMapping$0[l052222222222222222222222222222222222222222222222222222222.ordinal()];
                if (i != 10) {
                }
                LinkedHashMap linkedHashMap72222222222222222222222222222222222222222222222222222222 = new LinkedHashMap();
                it = V0.iterator();
                while (it.hasNext()) {
                }
                linkedHashMap = new LinkedHashMap(linkedHashMap72222222222222222222222222222222222222222222222222222222);
                if (linkedHashMap == null) {
                }
                CatalogBlockDataTypeDto l062222222222222222222222222222222222222222222222222222222 = catalogBlockDto.l0();
                w0 = catalogBlockDto.w0();
                hpu hpuVar2222222222222222222222222222222222222222222222222222222 = new hpu();
                i3 = a.$EnumSwitchMapping$0[l062222222222222222222222222222222222222222222222222222222.ordinal()];
                if (i3 != 15) {
                }
                a2a a2aVar2222222222222222222222222222222222222222222222222222222 = new a2a(1, hpuVar2222222222222222222222222222222222222222222222222222222, hpu.class, "map", "map(Lcom/vk/api/generated/catalog/dto/CatalogEntityGroupsItemDto;)Lcom/vk/dto/group/GroupsEntityCatalogItem;", 0, 0);
                LinkedHashMap linkedHashMap82222222222222222222222222222222222222222222222222222222 = new LinkedHashMap();
                it2 = w0.iterator();
                while (it2.hasNext()) {
                }
                linkedHashMap2 = new LinkedHashMap(linkedHashMap82222222222222222222222222222222222222222222222222222222);
                if (linkedHashMap2 == null) {
                }
                LinkedHashMap linkedHashMap92222222222222222222222222222222222222222222222222222222 = linkedHashMap2;
                l0 = catalogBlockDto.l0();
                List<CatalogSearchAuthorItemDto> y22222222222222222222222222222222222222222222222222222222 = catalogBlockDto.y2();
                if (l0 == CatalogBlockDataTypeDto.SEARCH_AUTHORS) {
                }
                l02 = catalogBlockDto.l0();
                List<CatalogGameItemDto> H02222222222222222222222222222222222222222222222222222222 = catalogBlockDto.H0();
                if (l02 == CatalogBlockDataTypeDto.GAMES) {
                }
                String str22222222222222222222222222222222222222222222222222222222 = str;
                l03 = catalogBlockDto.l0();
                List<CatalogGroupCategoryMetaItemDto> N02222222222222222222222222222222222222222222222222222222 = catalogBlockDto.N0();
                t2a t2aVar2222222222222222222222222222222222222222222222222222222 = new t2a();
                if (l03 != CatalogBlockDataTypeDto.GROUPS_CATEGORY_ITEMS) {
                }
                LinkedHashMap linkedHashMap112222222222222222222222222222222222222222222222222222222 = linkedHashMap5;
                l04 = catalogBlockDto.l0();
                List<CatalogMiniAppContentItemDto> E12222222222222222222222222222222222222222222222222222222 = catalogBlockDto.E1();
                if (l04 == CatalogBlockDataTypeDto.MINI_APPS_CONTENT) {
                }
                LinkedHashMap linkedHashMap122222222222222222222222222222222222222222222222222222222 = linkedHashMap6;
                i4 = a.$EnumSwitchMapping$0[catalogBlockDto.l0().ordinal()];
                if (i4 != 10) {
                }
                P0 = catalogBlockDto.P0();
                if (P0 == null) {
                }
                if (r1 == 0) {
                }
                arrayList2 = new ArrayList((Collection) r1);
                if (arrayList2 == null) {
                }
                ArrayList arrayList42222222222222222222222222222222222222222222222222222222 = arrayList2;
                T = catalogBlockDto.T();
                if (T == null) {
                }
                if (map == null) {
                }
                LinkedHashMap linkedHashMap132222222222222222222222222222222222222222222222222222222 = new LinkedHashMap(map);
                CatalogBlockDataTypeDto l072222222222222222222222222222222222222222222222222222222 = catalogBlockDto.l0();
                M = catalogBlockDto.M();
                LinkedHashMap linkedHashMap142222222222222222222222222222222222222222222222222222222 = new LinkedHashMap();
                if (M != null) {
                }
                return new CatalogBlockItemsData(a32222222222222222222222222222222222222222222222222222222, arrayList32222222222222222222222222222222222222222222222222222222, linkedHashMap, linkedHashMap3, linkedHashMap4, linkedHashMap92222222222222222222222222222222222222222222222222222222, linkedHashMap112222222222222222222222222222222222222222222222222222222, linkedHashMap122222222222222222222222222222222222222222222222222222222, arrayList42222222222222222222222222222222222222222222222222222222, linkedHashMap132222222222222222222222222222222222222222222222222222222, null, linkedHashMap142222222222222222222222222222222222222222222222222222222, 1024, null);
            case 43:
                List<Integer> N2 = catalogBlockDto.N2();
                if (N2 != null) {
                    List<Integer> list21 = N2;
                    arrayList = new ArrayList(c5g.u(list21, 10));
                    Iterator it20 = list21.iterator();
                    while (it20.hasNext()) {
                        kq.d((Number) it20.next(), arrayList);
                    }
                    i2 = arrayList;
                    if (i2 == null) {
                    }
                    CatalogDataType a322222222222222222222222222222222222222222222222222222222 = a4a.a(catalogBlockDto.l0());
                    ArrayList arrayList322222222222222222222222222222222222222222222222222222222 = new ArrayList(i2);
                    CatalogBlockDataTypeDto l0522222222222222222222222222222222222222222222222222222222 = catalogBlockDto.l0();
                    V0 = catalogBlockDto.V0();
                    i = a.$EnumSwitchMapping$0[l0522222222222222222222222222222222222222222222222222222222.ordinal()];
                    if (i != 10) {
                    }
                    LinkedHashMap linkedHashMap722222222222222222222222222222222222222222222222222222222 = new LinkedHashMap();
                    it = V0.iterator();
                    while (it.hasNext()) {
                    }
                    linkedHashMap = new LinkedHashMap(linkedHashMap722222222222222222222222222222222222222222222222222222222);
                    if (linkedHashMap == null) {
                    }
                    CatalogBlockDataTypeDto l0622222222222222222222222222222222222222222222222222222222 = catalogBlockDto.l0();
                    w0 = catalogBlockDto.w0();
                    hpu hpuVar22222222222222222222222222222222222222222222222222222222 = new hpu();
                    i3 = a.$EnumSwitchMapping$0[l0622222222222222222222222222222222222222222222222222222222.ordinal()];
                    if (i3 != 15) {
                    }
                    a2a a2aVar22222222222222222222222222222222222222222222222222222222 = new a2a(1, hpuVar22222222222222222222222222222222222222222222222222222222, hpu.class, "map", "map(Lcom/vk/api/generated/catalog/dto/CatalogEntityGroupsItemDto;)Lcom/vk/dto/group/GroupsEntityCatalogItem;", 0, 0);
                    LinkedHashMap linkedHashMap822222222222222222222222222222222222222222222222222222222 = new LinkedHashMap();
                    it2 = w0.iterator();
                    while (it2.hasNext()) {
                    }
                    linkedHashMap2 = new LinkedHashMap(linkedHashMap822222222222222222222222222222222222222222222222222222222);
                    if (linkedHashMap2 == null) {
                    }
                    LinkedHashMap linkedHashMap922222222222222222222222222222222222222222222222222222222 = linkedHashMap2;
                    l0 = catalogBlockDto.l0();
                    List<CatalogSearchAuthorItemDto> y222222222222222222222222222222222222222222222222222222222 = catalogBlockDto.y2();
                    if (l0 == CatalogBlockDataTypeDto.SEARCH_AUTHORS) {
                    }
                    l02 = catalogBlockDto.l0();
                    List<CatalogGameItemDto> H022222222222222222222222222222222222222222222222222222222 = catalogBlockDto.H0();
                    if (l02 == CatalogBlockDataTypeDto.GAMES) {
                    }
                    String str222222222222222222222222222222222222222222222222222222222 = str;
                    l03 = catalogBlockDto.l0();
                    List<CatalogGroupCategoryMetaItemDto> N022222222222222222222222222222222222222222222222222222222 = catalogBlockDto.N0();
                    t2a t2aVar22222222222222222222222222222222222222222222222222222222 = new t2a();
                    if (l03 != CatalogBlockDataTypeDto.GROUPS_CATEGORY_ITEMS) {
                    }
                    LinkedHashMap linkedHashMap1122222222222222222222222222222222222222222222222222222222 = linkedHashMap5;
                    l04 = catalogBlockDto.l0();
                    List<CatalogMiniAppContentItemDto> E122222222222222222222222222222222222222222222222222222222 = catalogBlockDto.E1();
                    if (l04 == CatalogBlockDataTypeDto.MINI_APPS_CONTENT) {
                    }
                    LinkedHashMap linkedHashMap1222222222222222222222222222222222222222222222222222222222 = linkedHashMap6;
                    i4 = a.$EnumSwitchMapping$0[catalogBlockDto.l0().ordinal()];
                    if (i4 != 10) {
                    }
                    P0 = catalogBlockDto.P0();
                    if (P0 == null) {
                    }
                    if (r1 == 0) {
                    }
                    arrayList2 = new ArrayList((Collection) r1);
                    if (arrayList2 == null) {
                    }
                    ArrayList arrayList422222222222222222222222222222222222222222222222222222222 = arrayList2;
                    T = catalogBlockDto.T();
                    if (T == null) {
                    }
                    if (map == null) {
                    }
                    LinkedHashMap linkedHashMap1322222222222222222222222222222222222222222222222222222222 = new LinkedHashMap(map);
                    CatalogBlockDataTypeDto l0722222222222222222222222222222222222222222222222222222222 = catalogBlockDto.l0();
                    M = catalogBlockDto.M();
                    LinkedHashMap linkedHashMap1422222222222222222222222222222222222222222222222222222222 = new LinkedHashMap();
                    if (M != null) {
                    }
                    return new CatalogBlockItemsData(a322222222222222222222222222222222222222222222222222222222, arrayList322222222222222222222222222222222222222222222222222222222, linkedHashMap, linkedHashMap3, linkedHashMap4, linkedHashMap922222222222222222222222222222222222222222222222222222222, linkedHashMap1122222222222222222222222222222222222222222222222222222222, linkedHashMap1222222222222222222222222222222222222222222222222222222222, arrayList422222222222222222222222222222222222222222222222222222222, linkedHashMap1322222222222222222222222222222222222222222222222222222222, null, linkedHashMap1422222222222222222222222222222222222222222222222222222222, 1024, null);
                }
                i2 = null;
                if (i2 == null) {
                }
                CatalogDataType a3222222222222222222222222222222222222222222222222222222222 = a4a.a(catalogBlockDto.l0());
                ArrayList arrayList3222222222222222222222222222222222222222222222222222222222 = new ArrayList(i2);
                CatalogBlockDataTypeDto l05222222222222222222222222222222222222222222222222222222222 = catalogBlockDto.l0();
                V0 = catalogBlockDto.V0();
                i = a.$EnumSwitchMapping$0[l05222222222222222222222222222222222222222222222222222222222.ordinal()];
                if (i != 10) {
                }
                LinkedHashMap linkedHashMap7222222222222222222222222222222222222222222222222222222222 = new LinkedHashMap();
                it = V0.iterator();
                while (it.hasNext()) {
                }
                linkedHashMap = new LinkedHashMap(linkedHashMap7222222222222222222222222222222222222222222222222222222222);
                if (linkedHashMap == null) {
                }
                CatalogBlockDataTypeDto l06222222222222222222222222222222222222222222222222222222222 = catalogBlockDto.l0();
                w0 = catalogBlockDto.w0();
                hpu hpuVar222222222222222222222222222222222222222222222222222222222 = new hpu();
                i3 = a.$EnumSwitchMapping$0[l06222222222222222222222222222222222222222222222222222222222.ordinal()];
                if (i3 != 15) {
                }
                a2a a2aVar222222222222222222222222222222222222222222222222222222222 = new a2a(1, hpuVar222222222222222222222222222222222222222222222222222222222, hpu.class, "map", "map(Lcom/vk/api/generated/catalog/dto/CatalogEntityGroupsItemDto;)Lcom/vk/dto/group/GroupsEntityCatalogItem;", 0, 0);
                LinkedHashMap linkedHashMap8222222222222222222222222222222222222222222222222222222222 = new LinkedHashMap();
                it2 = w0.iterator();
                while (it2.hasNext()) {
                }
                linkedHashMap2 = new LinkedHashMap(linkedHashMap8222222222222222222222222222222222222222222222222222222222);
                if (linkedHashMap2 == null) {
                }
                LinkedHashMap linkedHashMap9222222222222222222222222222222222222222222222222222222222 = linkedHashMap2;
                l0 = catalogBlockDto.l0();
                List<CatalogSearchAuthorItemDto> y2222222222222222222222222222222222222222222222222222222222 = catalogBlockDto.y2();
                if (l0 == CatalogBlockDataTypeDto.SEARCH_AUTHORS) {
                }
                l02 = catalogBlockDto.l0();
                List<CatalogGameItemDto> H0222222222222222222222222222222222222222222222222222222222 = catalogBlockDto.H0();
                if (l02 == CatalogBlockDataTypeDto.GAMES) {
                }
                String str2222222222222222222222222222222222222222222222222222222222 = str;
                l03 = catalogBlockDto.l0();
                List<CatalogGroupCategoryMetaItemDto> N0222222222222222222222222222222222222222222222222222222222 = catalogBlockDto.N0();
                t2a t2aVar222222222222222222222222222222222222222222222222222222222 = new t2a();
                if (l03 != CatalogBlockDataTypeDto.GROUPS_CATEGORY_ITEMS) {
                }
                LinkedHashMap linkedHashMap11222222222222222222222222222222222222222222222222222222222 = linkedHashMap5;
                l04 = catalogBlockDto.l0();
                List<CatalogMiniAppContentItemDto> E1222222222222222222222222222222222222222222222222222222222 = catalogBlockDto.E1();
                if (l04 == CatalogBlockDataTypeDto.MINI_APPS_CONTENT) {
                }
                LinkedHashMap linkedHashMap12222222222222222222222222222222222222222222222222222222222 = linkedHashMap6;
                i4 = a.$EnumSwitchMapping$0[catalogBlockDto.l0().ordinal()];
                if (i4 != 10) {
                }
                P0 = catalogBlockDto.P0();
                if (P0 == null) {
                }
                if (r1 == 0) {
                }
                arrayList2 = new ArrayList((Collection) r1);
                if (arrayList2 == null) {
                }
                ArrayList arrayList4222222222222222222222222222222222222222222222222222222222 = arrayList2;
                T = catalogBlockDto.T();
                if (T == null) {
                }
                if (map == null) {
                }
                LinkedHashMap linkedHashMap13222222222222222222222222222222222222222222222222222222222 = new LinkedHashMap(map);
                CatalogBlockDataTypeDto l07222222222222222222222222222222222222222222222222222222222 = catalogBlockDto.l0();
                M = catalogBlockDto.M();
                LinkedHashMap linkedHashMap14222222222222222222222222222222222222222222222222222222222 = new LinkedHashMap();
                if (M != null) {
                }
                return new CatalogBlockItemsData(a3222222222222222222222222222222222222222222222222222222222, arrayList3222222222222222222222222222222222222222222222222222222222, linkedHashMap, linkedHashMap3, linkedHashMap4, linkedHashMap9222222222222222222222222222222222222222222222222222222222, linkedHashMap11222222222222222222222222222222222222222222222222222222222, linkedHashMap12222222222222222222222222222222222222222222222222222222222, arrayList4222222222222222222222222222222222222222222222222222222222, linkedHashMap13222222222222222222222222222222222222222222222222222222222, null, linkedHashMap14222222222222222222222222222222222222222222222222222222222, 1024, null);
            case 44:
                i2 = catalogBlockDto.L2();
                if (i2 == null) {
                }
                CatalogDataType a32222222222222222222222222222222222222222222222222222222222 = a4a.a(catalogBlockDto.l0());
                ArrayList arrayList32222222222222222222222222222222222222222222222222222222222 = new ArrayList(i2);
                CatalogBlockDataTypeDto l052222222222222222222222222222222222222222222222222222222222 = catalogBlockDto.l0();
                V0 = catalogBlockDto.V0();
                i = a.$EnumSwitchMapping$0[l052222222222222222222222222222222222222222222222222222222222.ordinal()];
                if (i != 10) {
                }
                LinkedHashMap linkedHashMap72222222222222222222222222222222222222222222222222222222222 = new LinkedHashMap();
                it = V0.iterator();
                while (it.hasNext()) {
                }
                linkedHashMap = new LinkedHashMap(linkedHashMap72222222222222222222222222222222222222222222222222222222222);
                if (linkedHashMap == null) {
                }
                CatalogBlockDataTypeDto l062222222222222222222222222222222222222222222222222222222222 = catalogBlockDto.l0();
                w0 = catalogBlockDto.w0();
                hpu hpuVar2222222222222222222222222222222222222222222222222222222222 = new hpu();
                i3 = a.$EnumSwitchMapping$0[l062222222222222222222222222222222222222222222222222222222222.ordinal()];
                if (i3 != 15) {
                }
                a2a a2aVar2222222222222222222222222222222222222222222222222222222222 = new a2a(1, hpuVar2222222222222222222222222222222222222222222222222222222222, hpu.class, "map", "map(Lcom/vk/api/generated/catalog/dto/CatalogEntityGroupsItemDto;)Lcom/vk/dto/group/GroupsEntityCatalogItem;", 0, 0);
                LinkedHashMap linkedHashMap82222222222222222222222222222222222222222222222222222222222 = new LinkedHashMap();
                it2 = w0.iterator();
                while (it2.hasNext()) {
                }
                linkedHashMap2 = new LinkedHashMap(linkedHashMap82222222222222222222222222222222222222222222222222222222222);
                if (linkedHashMap2 == null) {
                }
                LinkedHashMap linkedHashMap92222222222222222222222222222222222222222222222222222222222 = linkedHashMap2;
                l0 = catalogBlockDto.l0();
                List<CatalogSearchAuthorItemDto> y22222222222222222222222222222222222222222222222222222222222 = catalogBlockDto.y2();
                if (l0 == CatalogBlockDataTypeDto.SEARCH_AUTHORS) {
                }
                l02 = catalogBlockDto.l0();
                List<CatalogGameItemDto> H02222222222222222222222222222222222222222222222222222222222 = catalogBlockDto.H0();
                if (l02 == CatalogBlockDataTypeDto.GAMES) {
                }
                String str22222222222222222222222222222222222222222222222222222222222 = str;
                l03 = catalogBlockDto.l0();
                List<CatalogGroupCategoryMetaItemDto> N02222222222222222222222222222222222222222222222222222222222 = catalogBlockDto.N0();
                t2a t2aVar2222222222222222222222222222222222222222222222222222222222 = new t2a();
                if (l03 != CatalogBlockDataTypeDto.GROUPS_CATEGORY_ITEMS) {
                }
                LinkedHashMap linkedHashMap112222222222222222222222222222222222222222222222222222222222 = linkedHashMap5;
                l04 = catalogBlockDto.l0();
                List<CatalogMiniAppContentItemDto> E12222222222222222222222222222222222222222222222222222222222 = catalogBlockDto.E1();
                if (l04 == CatalogBlockDataTypeDto.MINI_APPS_CONTENT) {
                }
                LinkedHashMap linkedHashMap122222222222222222222222222222222222222222222222222222222222 = linkedHashMap6;
                i4 = a.$EnumSwitchMapping$0[catalogBlockDto.l0().ordinal()];
                if (i4 != 10) {
                }
                P0 = catalogBlockDto.P0();
                if (P0 == null) {
                }
                if (r1 == 0) {
                }
                arrayList2 = new ArrayList((Collection) r1);
                if (arrayList2 == null) {
                }
                ArrayList arrayList42222222222222222222222222222222222222222222222222222222222 = arrayList2;
                T = catalogBlockDto.T();
                if (T == null) {
                }
                if (map == null) {
                }
                LinkedHashMap linkedHashMap132222222222222222222222222222222222222222222222222222222222 = new LinkedHashMap(map);
                CatalogBlockDataTypeDto l072222222222222222222222222222222222222222222222222222222222 = catalogBlockDto.l0();
                M = catalogBlockDto.M();
                LinkedHashMap linkedHashMap142222222222222222222222222222222222222222222222222222222222 = new LinkedHashMap();
                if (M != null) {
                }
                return new CatalogBlockItemsData(a32222222222222222222222222222222222222222222222222222222222, arrayList32222222222222222222222222222222222222222222222222222222222, linkedHashMap, linkedHashMap3, linkedHashMap4, linkedHashMap92222222222222222222222222222222222222222222222222222222222, linkedHashMap112222222222222222222222222222222222222222222222222222222222, linkedHashMap122222222222222222222222222222222222222222222222222222222222, arrayList42222222222222222222222222222222222222222222222222222222222, linkedHashMap132222222222222222222222222222222222222222222222222222222222, null, linkedHashMap142222222222222222222222222222222222222222222222222222222222, 1024, null);
            case 45:
                i2 = catalogBlockDto.U1();
                if (i2 == null) {
                }
                CatalogDataType a322222222222222222222222222222222222222222222222222222222222 = a4a.a(catalogBlockDto.l0());
                ArrayList arrayList322222222222222222222222222222222222222222222222222222222222 = new ArrayList(i2);
                CatalogBlockDataTypeDto l0522222222222222222222222222222222222222222222222222222222222 = catalogBlockDto.l0();
                V0 = catalogBlockDto.V0();
                i = a.$EnumSwitchMapping$0[l0522222222222222222222222222222222222222222222222222222222222.ordinal()];
                if (i != 10) {
                }
                LinkedHashMap linkedHashMap722222222222222222222222222222222222222222222222222222222222 = new LinkedHashMap();
                it = V0.iterator();
                while (it.hasNext()) {
                }
                linkedHashMap = new LinkedHashMap(linkedHashMap722222222222222222222222222222222222222222222222222222222222);
                if (linkedHashMap == null) {
                }
                CatalogBlockDataTypeDto l0622222222222222222222222222222222222222222222222222222222222 = catalogBlockDto.l0();
                w0 = catalogBlockDto.w0();
                hpu hpuVar22222222222222222222222222222222222222222222222222222222222 = new hpu();
                i3 = a.$EnumSwitchMapping$0[l0622222222222222222222222222222222222222222222222222222222222.ordinal()];
                if (i3 != 15) {
                }
                a2a a2aVar22222222222222222222222222222222222222222222222222222222222 = new a2a(1, hpuVar22222222222222222222222222222222222222222222222222222222222, hpu.class, "map", "map(Lcom/vk/api/generated/catalog/dto/CatalogEntityGroupsItemDto;)Lcom/vk/dto/group/GroupsEntityCatalogItem;", 0, 0);
                LinkedHashMap linkedHashMap822222222222222222222222222222222222222222222222222222222222 = new LinkedHashMap();
                it2 = w0.iterator();
                while (it2.hasNext()) {
                }
                linkedHashMap2 = new LinkedHashMap(linkedHashMap822222222222222222222222222222222222222222222222222222222222);
                if (linkedHashMap2 == null) {
                }
                LinkedHashMap linkedHashMap922222222222222222222222222222222222222222222222222222222222 = linkedHashMap2;
                l0 = catalogBlockDto.l0();
                List<CatalogSearchAuthorItemDto> y222222222222222222222222222222222222222222222222222222222222 = catalogBlockDto.y2();
                if (l0 == CatalogBlockDataTypeDto.SEARCH_AUTHORS) {
                }
                l02 = catalogBlockDto.l0();
                List<CatalogGameItemDto> H022222222222222222222222222222222222222222222222222222222222 = catalogBlockDto.H0();
                if (l02 == CatalogBlockDataTypeDto.GAMES) {
                }
                String str222222222222222222222222222222222222222222222222222222222222 = str;
                l03 = catalogBlockDto.l0();
                List<CatalogGroupCategoryMetaItemDto> N022222222222222222222222222222222222222222222222222222222222 = catalogBlockDto.N0();
                t2a t2aVar22222222222222222222222222222222222222222222222222222222222 = new t2a();
                if (l03 != CatalogBlockDataTypeDto.GROUPS_CATEGORY_ITEMS) {
                }
                LinkedHashMap linkedHashMap1122222222222222222222222222222222222222222222222222222222222 = linkedHashMap5;
                l04 = catalogBlockDto.l0();
                List<CatalogMiniAppContentItemDto> E122222222222222222222222222222222222222222222222222222222222 = catalogBlockDto.E1();
                if (l04 == CatalogBlockDataTypeDto.MINI_APPS_CONTENT) {
                }
                LinkedHashMap linkedHashMap1222222222222222222222222222222222222222222222222222222222222 = linkedHashMap6;
                i4 = a.$EnumSwitchMapping$0[catalogBlockDto.l0().ordinal()];
                if (i4 != 10) {
                }
                P0 = catalogBlockDto.P0();
                if (P0 == null) {
                }
                if (r1 == 0) {
                }
                arrayList2 = new ArrayList((Collection) r1);
                if (arrayList2 == null) {
                }
                ArrayList arrayList422222222222222222222222222222222222222222222222222222222222 = arrayList2;
                T = catalogBlockDto.T();
                if (T == null) {
                }
                if (map == null) {
                }
                LinkedHashMap linkedHashMap1322222222222222222222222222222222222222222222222222222222222 = new LinkedHashMap(map);
                CatalogBlockDataTypeDto l0722222222222222222222222222222222222222222222222222222222222 = catalogBlockDto.l0();
                M = catalogBlockDto.M();
                LinkedHashMap linkedHashMap1422222222222222222222222222222222222222222222222222222222222 = new LinkedHashMap();
                if (M != null) {
                }
                return new CatalogBlockItemsData(a322222222222222222222222222222222222222222222222222222222222, arrayList322222222222222222222222222222222222222222222222222222222222, linkedHashMap, linkedHashMap3, linkedHashMap4, linkedHashMap922222222222222222222222222222222222222222222222222222222222, linkedHashMap1122222222222222222222222222222222222222222222222222222222222, linkedHashMap1222222222222222222222222222222222222222222222222222222222222, arrayList422222222222222222222222222222222222222222222222222222222222, linkedHashMap1322222222222222222222222222222222222222222222222222222222222, null, linkedHashMap1422222222222222222222222222222222222222222222222222222222222, 1024, null);
            case 46:
                List<Integer> x1 = catalogBlockDto.x1();
                if (x1 != null) {
                    List<Integer> list22 = x1;
                    arrayList = new ArrayList(c5g.u(list22, 10));
                    Iterator it21 = list22.iterator();
                    while (it21.hasNext()) {
                        kq.d((Number) it21.next(), arrayList);
                    }
                    i2 = arrayList;
                    if (i2 == null) {
                    }
                    CatalogDataType a3222222222222222222222222222222222222222222222222222222222222 = a4a.a(catalogBlockDto.l0());
                    ArrayList arrayList3222222222222222222222222222222222222222222222222222222222222 = new ArrayList(i2);
                    CatalogBlockDataTypeDto l05222222222222222222222222222222222222222222222222222222222222 = catalogBlockDto.l0();
                    V0 = catalogBlockDto.V0();
                    i = a.$EnumSwitchMapping$0[l05222222222222222222222222222222222222222222222222222222222222.ordinal()];
                    if (i != 10) {
                    }
                    LinkedHashMap linkedHashMap7222222222222222222222222222222222222222222222222222222222222 = new LinkedHashMap();
                    it = V0.iterator();
                    while (it.hasNext()) {
                    }
                    linkedHashMap = new LinkedHashMap(linkedHashMap7222222222222222222222222222222222222222222222222222222222222);
                    if (linkedHashMap == null) {
                    }
                    CatalogBlockDataTypeDto l06222222222222222222222222222222222222222222222222222222222222 = catalogBlockDto.l0();
                    w0 = catalogBlockDto.w0();
                    hpu hpuVar222222222222222222222222222222222222222222222222222222222222 = new hpu();
                    i3 = a.$EnumSwitchMapping$0[l06222222222222222222222222222222222222222222222222222222222222.ordinal()];
                    if (i3 != 15) {
                    }
                    a2a a2aVar222222222222222222222222222222222222222222222222222222222222 = new a2a(1, hpuVar222222222222222222222222222222222222222222222222222222222222, hpu.class, "map", "map(Lcom/vk/api/generated/catalog/dto/CatalogEntityGroupsItemDto;)Lcom/vk/dto/group/GroupsEntityCatalogItem;", 0, 0);
                    LinkedHashMap linkedHashMap8222222222222222222222222222222222222222222222222222222222222 = new LinkedHashMap();
                    it2 = w0.iterator();
                    while (it2.hasNext()) {
                    }
                    linkedHashMap2 = new LinkedHashMap(linkedHashMap8222222222222222222222222222222222222222222222222222222222222);
                    if (linkedHashMap2 == null) {
                    }
                    LinkedHashMap linkedHashMap9222222222222222222222222222222222222222222222222222222222222 = linkedHashMap2;
                    l0 = catalogBlockDto.l0();
                    List<CatalogSearchAuthorItemDto> y2222222222222222222222222222222222222222222222222222222222222 = catalogBlockDto.y2();
                    if (l0 == CatalogBlockDataTypeDto.SEARCH_AUTHORS) {
                    }
                    l02 = catalogBlockDto.l0();
                    List<CatalogGameItemDto> H0222222222222222222222222222222222222222222222222222222222222 = catalogBlockDto.H0();
                    if (l02 == CatalogBlockDataTypeDto.GAMES) {
                    }
                    String str2222222222222222222222222222222222222222222222222222222222222 = str;
                    l03 = catalogBlockDto.l0();
                    List<CatalogGroupCategoryMetaItemDto> N0222222222222222222222222222222222222222222222222222222222222 = catalogBlockDto.N0();
                    t2a t2aVar222222222222222222222222222222222222222222222222222222222222 = new t2a();
                    if (l03 != CatalogBlockDataTypeDto.GROUPS_CATEGORY_ITEMS) {
                    }
                    LinkedHashMap linkedHashMap11222222222222222222222222222222222222222222222222222222222222 = linkedHashMap5;
                    l04 = catalogBlockDto.l0();
                    List<CatalogMiniAppContentItemDto> E1222222222222222222222222222222222222222222222222222222222222 = catalogBlockDto.E1();
                    if (l04 == CatalogBlockDataTypeDto.MINI_APPS_CONTENT) {
                    }
                    LinkedHashMap linkedHashMap12222222222222222222222222222222222222222222222222222222222222 = linkedHashMap6;
                    i4 = a.$EnumSwitchMapping$0[catalogBlockDto.l0().ordinal()];
                    if (i4 != 10) {
                    }
                    P0 = catalogBlockDto.P0();
                    if (P0 == null) {
                    }
                    if (r1 == 0) {
                    }
                    arrayList2 = new ArrayList((Collection) r1);
                    if (arrayList2 == null) {
                    }
                    ArrayList arrayList4222222222222222222222222222222222222222222222222222222222222 = arrayList2;
                    T = catalogBlockDto.T();
                    if (T == null) {
                    }
                    if (map == null) {
                    }
                    LinkedHashMap linkedHashMap13222222222222222222222222222222222222222222222222222222222222 = new LinkedHashMap(map);
                    CatalogBlockDataTypeDto l07222222222222222222222222222222222222222222222222222222222222 = catalogBlockDto.l0();
                    M = catalogBlockDto.M();
                    LinkedHashMap linkedHashMap14222222222222222222222222222222222222222222222222222222222222 = new LinkedHashMap();
                    if (M != null) {
                    }
                    return new CatalogBlockItemsData(a3222222222222222222222222222222222222222222222222222222222222, arrayList3222222222222222222222222222222222222222222222222222222222222, linkedHashMap, linkedHashMap3, linkedHashMap4, linkedHashMap9222222222222222222222222222222222222222222222222222222222222, linkedHashMap11222222222222222222222222222222222222222222222222222222222222, linkedHashMap12222222222222222222222222222222222222222222222222222222222222, arrayList4222222222222222222222222222222222222222222222222222222222222, linkedHashMap13222222222222222222222222222222222222222222222222222222222222, null, linkedHashMap14222222222222222222222222222222222222222222222222222222222222, 1024, null);
                }
                i2 = null;
                if (i2 == null) {
                }
                CatalogDataType a32222222222222222222222222222222222222222222222222222222222222 = a4a.a(catalogBlockDto.l0());
                ArrayList arrayList32222222222222222222222222222222222222222222222222222222222222 = new ArrayList(i2);
                CatalogBlockDataTypeDto l052222222222222222222222222222222222222222222222222222222222222 = catalogBlockDto.l0();
                V0 = catalogBlockDto.V0();
                i = a.$EnumSwitchMapping$0[l052222222222222222222222222222222222222222222222222222222222222.ordinal()];
                if (i != 10) {
                }
                LinkedHashMap linkedHashMap72222222222222222222222222222222222222222222222222222222222222 = new LinkedHashMap();
                it = V0.iterator();
                while (it.hasNext()) {
                }
                linkedHashMap = new LinkedHashMap(linkedHashMap72222222222222222222222222222222222222222222222222222222222222);
                if (linkedHashMap == null) {
                }
                CatalogBlockDataTypeDto l062222222222222222222222222222222222222222222222222222222222222 = catalogBlockDto.l0();
                w0 = catalogBlockDto.w0();
                hpu hpuVar2222222222222222222222222222222222222222222222222222222222222 = new hpu();
                i3 = a.$EnumSwitchMapping$0[l062222222222222222222222222222222222222222222222222222222222222.ordinal()];
                if (i3 != 15) {
                }
                a2a a2aVar2222222222222222222222222222222222222222222222222222222222222 = new a2a(1, hpuVar2222222222222222222222222222222222222222222222222222222222222, hpu.class, "map", "map(Lcom/vk/api/generated/catalog/dto/CatalogEntityGroupsItemDto;)Lcom/vk/dto/group/GroupsEntityCatalogItem;", 0, 0);
                LinkedHashMap linkedHashMap82222222222222222222222222222222222222222222222222222222222222 = new LinkedHashMap();
                it2 = w0.iterator();
                while (it2.hasNext()) {
                }
                linkedHashMap2 = new LinkedHashMap(linkedHashMap82222222222222222222222222222222222222222222222222222222222222);
                if (linkedHashMap2 == null) {
                }
                LinkedHashMap linkedHashMap92222222222222222222222222222222222222222222222222222222222222 = linkedHashMap2;
                l0 = catalogBlockDto.l0();
                List<CatalogSearchAuthorItemDto> y22222222222222222222222222222222222222222222222222222222222222 = catalogBlockDto.y2();
                if (l0 == CatalogBlockDataTypeDto.SEARCH_AUTHORS) {
                }
                l02 = catalogBlockDto.l0();
                List<CatalogGameItemDto> H02222222222222222222222222222222222222222222222222222222222222 = catalogBlockDto.H0();
                if (l02 == CatalogBlockDataTypeDto.GAMES) {
                }
                String str22222222222222222222222222222222222222222222222222222222222222 = str;
                l03 = catalogBlockDto.l0();
                List<CatalogGroupCategoryMetaItemDto> N02222222222222222222222222222222222222222222222222222222222222 = catalogBlockDto.N0();
                t2a t2aVar2222222222222222222222222222222222222222222222222222222222222 = new t2a();
                if (l03 != CatalogBlockDataTypeDto.GROUPS_CATEGORY_ITEMS) {
                }
                LinkedHashMap linkedHashMap112222222222222222222222222222222222222222222222222222222222222 = linkedHashMap5;
                l04 = catalogBlockDto.l0();
                List<CatalogMiniAppContentItemDto> E12222222222222222222222222222222222222222222222222222222222222 = catalogBlockDto.E1();
                if (l04 == CatalogBlockDataTypeDto.MINI_APPS_CONTENT) {
                }
                LinkedHashMap linkedHashMap122222222222222222222222222222222222222222222222222222222222222 = linkedHashMap6;
                i4 = a.$EnumSwitchMapping$0[catalogBlockDto.l0().ordinal()];
                if (i4 != 10) {
                }
                P0 = catalogBlockDto.P0();
                if (P0 == null) {
                }
                if (r1 == 0) {
                }
                arrayList2 = new ArrayList((Collection) r1);
                if (arrayList2 == null) {
                }
                ArrayList arrayList42222222222222222222222222222222222222222222222222222222222222 = arrayList2;
                T = catalogBlockDto.T();
                if (T == null) {
                }
                if (map == null) {
                }
                LinkedHashMap linkedHashMap132222222222222222222222222222222222222222222222222222222222222 = new LinkedHashMap(map);
                CatalogBlockDataTypeDto l072222222222222222222222222222222222222222222222222222222222222 = catalogBlockDto.l0();
                M = catalogBlockDto.M();
                LinkedHashMap linkedHashMap142222222222222222222222222222222222222222222222222222222222222 = new LinkedHashMap();
                if (M != null) {
                }
                return new CatalogBlockItemsData(a32222222222222222222222222222222222222222222222222222222222222, arrayList32222222222222222222222222222222222222222222222222222222222222, linkedHashMap, linkedHashMap3, linkedHashMap4, linkedHashMap92222222222222222222222222222222222222222222222222222222222222, linkedHashMap112222222222222222222222222222222222222222222222222222222222222, linkedHashMap122222222222222222222222222222222222222222222222222222222222222, arrayList42222222222222222222222222222222222222222222222222222222222222, linkedHashMap132222222222222222222222222222222222222222222222222222222222222, null, linkedHashMap142222222222222222222222222222222222222222222222222222222222222, 1024, null);
            case 47:
                i2 = catalogBlockDto.Z();
                if (i2 == null) {
                }
                CatalogDataType a322222222222222222222222222222222222222222222222222222222222222 = a4a.a(catalogBlockDto.l0());
                ArrayList arrayList322222222222222222222222222222222222222222222222222222222222222 = new ArrayList(i2);
                CatalogBlockDataTypeDto l0522222222222222222222222222222222222222222222222222222222222222 = catalogBlockDto.l0();
                V0 = catalogBlockDto.V0();
                i = a.$EnumSwitchMapping$0[l0522222222222222222222222222222222222222222222222222222222222222.ordinal()];
                if (i != 10) {
                }
                LinkedHashMap linkedHashMap722222222222222222222222222222222222222222222222222222222222222 = new LinkedHashMap();
                it = V0.iterator();
                while (it.hasNext()) {
                }
                linkedHashMap = new LinkedHashMap(linkedHashMap722222222222222222222222222222222222222222222222222222222222222);
                if (linkedHashMap == null) {
                }
                CatalogBlockDataTypeDto l0622222222222222222222222222222222222222222222222222222222222222 = catalogBlockDto.l0();
                w0 = catalogBlockDto.w0();
                hpu hpuVar22222222222222222222222222222222222222222222222222222222222222 = new hpu();
                i3 = a.$EnumSwitchMapping$0[l0622222222222222222222222222222222222222222222222222222222222222.ordinal()];
                if (i3 != 15) {
                }
                a2a a2aVar22222222222222222222222222222222222222222222222222222222222222 = new a2a(1, hpuVar22222222222222222222222222222222222222222222222222222222222222, hpu.class, "map", "map(Lcom/vk/api/generated/catalog/dto/CatalogEntityGroupsItemDto;)Lcom/vk/dto/group/GroupsEntityCatalogItem;", 0, 0);
                LinkedHashMap linkedHashMap822222222222222222222222222222222222222222222222222222222222222 = new LinkedHashMap();
                it2 = w0.iterator();
                while (it2.hasNext()) {
                }
                linkedHashMap2 = new LinkedHashMap(linkedHashMap822222222222222222222222222222222222222222222222222222222222222);
                if (linkedHashMap2 == null) {
                }
                LinkedHashMap linkedHashMap922222222222222222222222222222222222222222222222222222222222222 = linkedHashMap2;
                l0 = catalogBlockDto.l0();
                List<CatalogSearchAuthorItemDto> y222222222222222222222222222222222222222222222222222222222222222 = catalogBlockDto.y2();
                if (l0 == CatalogBlockDataTypeDto.SEARCH_AUTHORS) {
                }
                l02 = catalogBlockDto.l0();
                List<CatalogGameItemDto> H022222222222222222222222222222222222222222222222222222222222222 = catalogBlockDto.H0();
                if (l02 == CatalogBlockDataTypeDto.GAMES) {
                }
                String str222222222222222222222222222222222222222222222222222222222222222 = str;
                l03 = catalogBlockDto.l0();
                List<CatalogGroupCategoryMetaItemDto> N022222222222222222222222222222222222222222222222222222222222222 = catalogBlockDto.N0();
                t2a t2aVar22222222222222222222222222222222222222222222222222222222222222 = new t2a();
                if (l03 != CatalogBlockDataTypeDto.GROUPS_CATEGORY_ITEMS) {
                }
                LinkedHashMap linkedHashMap1122222222222222222222222222222222222222222222222222222222222222 = linkedHashMap5;
                l04 = catalogBlockDto.l0();
                List<CatalogMiniAppContentItemDto> E122222222222222222222222222222222222222222222222222222222222222 = catalogBlockDto.E1();
                if (l04 == CatalogBlockDataTypeDto.MINI_APPS_CONTENT) {
                }
                LinkedHashMap linkedHashMap1222222222222222222222222222222222222222222222222222222222222222 = linkedHashMap6;
                i4 = a.$EnumSwitchMapping$0[catalogBlockDto.l0().ordinal()];
                if (i4 != 10) {
                }
                P0 = catalogBlockDto.P0();
                if (P0 == null) {
                }
                if (r1 == 0) {
                }
                arrayList2 = new ArrayList((Collection) r1);
                if (arrayList2 == null) {
                }
                ArrayList arrayList422222222222222222222222222222222222222222222222222222222222222 = arrayList2;
                T = catalogBlockDto.T();
                if (T == null) {
                }
                if (map == null) {
                }
                LinkedHashMap linkedHashMap1322222222222222222222222222222222222222222222222222222222222222 = new LinkedHashMap(map);
                CatalogBlockDataTypeDto l0722222222222222222222222222222222222222222222222222222222222222 = catalogBlockDto.l0();
                M = catalogBlockDto.M();
                LinkedHashMap linkedHashMap1422222222222222222222222222222222222222222222222222222222222222 = new LinkedHashMap();
                if (M != null) {
                }
                return new CatalogBlockItemsData(a322222222222222222222222222222222222222222222222222222222222222, arrayList322222222222222222222222222222222222222222222222222222222222222, linkedHashMap, linkedHashMap3, linkedHashMap4, linkedHashMap922222222222222222222222222222222222222222222222222222222222222, linkedHashMap1122222222222222222222222222222222222222222222222222222222222222, linkedHashMap1222222222222222222222222222222222222222222222222222222222222222, arrayList422222222222222222222222222222222222222222222222222222222222222, linkedHashMap1322222222222222222222222222222222222222222222222222222222222222, null, linkedHashMap1422222222222222222222222222222222222222222222222222222222222222, 1024, null);
            case 48:
                i2 = catalogBlockDto.i();
                if (i2 == null) {
                }
                CatalogDataType a3222222222222222222222222222222222222222222222222222222222222222 = a4a.a(catalogBlockDto.l0());
                ArrayList arrayList3222222222222222222222222222222222222222222222222222222222222222 = new ArrayList(i2);
                CatalogBlockDataTypeDto l05222222222222222222222222222222222222222222222222222222222222222 = catalogBlockDto.l0();
                V0 = catalogBlockDto.V0();
                i = a.$EnumSwitchMapping$0[l05222222222222222222222222222222222222222222222222222222222222222.ordinal()];
                if (i != 10) {
                }
                LinkedHashMap linkedHashMap7222222222222222222222222222222222222222222222222222222222222222 = new LinkedHashMap();
                it = V0.iterator();
                while (it.hasNext()) {
                }
                linkedHashMap = new LinkedHashMap(linkedHashMap7222222222222222222222222222222222222222222222222222222222222222);
                if (linkedHashMap == null) {
                }
                CatalogBlockDataTypeDto l06222222222222222222222222222222222222222222222222222222222222222 = catalogBlockDto.l0();
                w0 = catalogBlockDto.w0();
                hpu hpuVar222222222222222222222222222222222222222222222222222222222222222 = new hpu();
                i3 = a.$EnumSwitchMapping$0[l06222222222222222222222222222222222222222222222222222222222222222.ordinal()];
                if (i3 != 15) {
                }
                a2a a2aVar222222222222222222222222222222222222222222222222222222222222222 = new a2a(1, hpuVar222222222222222222222222222222222222222222222222222222222222222, hpu.class, "map", "map(Lcom/vk/api/generated/catalog/dto/CatalogEntityGroupsItemDto;)Lcom/vk/dto/group/GroupsEntityCatalogItem;", 0, 0);
                LinkedHashMap linkedHashMap8222222222222222222222222222222222222222222222222222222222222222 = new LinkedHashMap();
                it2 = w0.iterator();
                while (it2.hasNext()) {
                }
                linkedHashMap2 = new LinkedHashMap(linkedHashMap8222222222222222222222222222222222222222222222222222222222222222);
                if (linkedHashMap2 == null) {
                }
                LinkedHashMap linkedHashMap9222222222222222222222222222222222222222222222222222222222222222 = linkedHashMap2;
                l0 = catalogBlockDto.l0();
                List<CatalogSearchAuthorItemDto> y2222222222222222222222222222222222222222222222222222222222222222 = catalogBlockDto.y2();
                if (l0 == CatalogBlockDataTypeDto.SEARCH_AUTHORS) {
                }
                l02 = catalogBlockDto.l0();
                List<CatalogGameItemDto> H0222222222222222222222222222222222222222222222222222222222222222 = catalogBlockDto.H0();
                if (l02 == CatalogBlockDataTypeDto.GAMES) {
                }
                String str2222222222222222222222222222222222222222222222222222222222222222 = str;
                l03 = catalogBlockDto.l0();
                List<CatalogGroupCategoryMetaItemDto> N0222222222222222222222222222222222222222222222222222222222222222 = catalogBlockDto.N0();
                t2a t2aVar222222222222222222222222222222222222222222222222222222222222222 = new t2a();
                if (l03 != CatalogBlockDataTypeDto.GROUPS_CATEGORY_ITEMS) {
                }
                LinkedHashMap linkedHashMap11222222222222222222222222222222222222222222222222222222222222222 = linkedHashMap5;
                l04 = catalogBlockDto.l0();
                List<CatalogMiniAppContentItemDto> E1222222222222222222222222222222222222222222222222222222222222222 = catalogBlockDto.E1();
                if (l04 == CatalogBlockDataTypeDto.MINI_APPS_CONTENT) {
                }
                LinkedHashMap linkedHashMap12222222222222222222222222222222222222222222222222222222222222222 = linkedHashMap6;
                i4 = a.$EnumSwitchMapping$0[catalogBlockDto.l0().ordinal()];
                if (i4 != 10) {
                }
                P0 = catalogBlockDto.P0();
                if (P0 == null) {
                }
                if (r1 == 0) {
                }
                arrayList2 = new ArrayList((Collection) r1);
                if (arrayList2 == null) {
                }
                ArrayList arrayList4222222222222222222222222222222222222222222222222222222222222222 = arrayList2;
                T = catalogBlockDto.T();
                if (T == null) {
                }
                if (map == null) {
                }
                LinkedHashMap linkedHashMap13222222222222222222222222222222222222222222222222222222222222222 = new LinkedHashMap(map);
                CatalogBlockDataTypeDto l07222222222222222222222222222222222222222222222222222222222222222 = catalogBlockDto.l0();
                M = catalogBlockDto.M();
                LinkedHashMap linkedHashMap14222222222222222222222222222222222222222222222222222222222222222 = new LinkedHashMap();
                if (M != null) {
                }
                return new CatalogBlockItemsData(a3222222222222222222222222222222222222222222222222222222222222222, arrayList3222222222222222222222222222222222222222222222222222222222222222, linkedHashMap, linkedHashMap3, linkedHashMap4, linkedHashMap9222222222222222222222222222222222222222222222222222222222222222, linkedHashMap11222222222222222222222222222222222222222222222222222222222222222, linkedHashMap12222222222222222222222222222222222222222222222222222222222222222, arrayList4222222222222222222222222222222222222222222222222222222222222222, linkedHashMap13222222222222222222222222222222222222222222222222222222222222222, null, linkedHashMap14222222222222222222222222222222222222222222222222222222222222222, 1024, null);
            case 49:
                i2 = catalogBlockDto.f();
                if (i2 == null) {
                }
                CatalogDataType a32222222222222222222222222222222222222222222222222222222222222222 = a4a.a(catalogBlockDto.l0());
                ArrayList arrayList32222222222222222222222222222222222222222222222222222222222222222 = new ArrayList(i2);
                CatalogBlockDataTypeDto l052222222222222222222222222222222222222222222222222222222222222222 = catalogBlockDto.l0();
                V0 = catalogBlockDto.V0();
                i = a.$EnumSwitchMapping$0[l052222222222222222222222222222222222222222222222222222222222222222.ordinal()];
                if (i != 10) {
                }
                LinkedHashMap linkedHashMap72222222222222222222222222222222222222222222222222222222222222222 = new LinkedHashMap();
                it = V0.iterator();
                while (it.hasNext()) {
                }
                linkedHashMap = new LinkedHashMap(linkedHashMap72222222222222222222222222222222222222222222222222222222222222222);
                if (linkedHashMap == null) {
                }
                CatalogBlockDataTypeDto l062222222222222222222222222222222222222222222222222222222222222222 = catalogBlockDto.l0();
                w0 = catalogBlockDto.w0();
                hpu hpuVar2222222222222222222222222222222222222222222222222222222222222222 = new hpu();
                i3 = a.$EnumSwitchMapping$0[l062222222222222222222222222222222222222222222222222222222222222222.ordinal()];
                if (i3 != 15) {
                }
                a2a a2aVar2222222222222222222222222222222222222222222222222222222222222222 = new a2a(1, hpuVar2222222222222222222222222222222222222222222222222222222222222222, hpu.class, "map", "map(Lcom/vk/api/generated/catalog/dto/CatalogEntityGroupsItemDto;)Lcom/vk/dto/group/GroupsEntityCatalogItem;", 0, 0);
                LinkedHashMap linkedHashMap82222222222222222222222222222222222222222222222222222222222222222 = new LinkedHashMap();
                it2 = w0.iterator();
                while (it2.hasNext()) {
                }
                linkedHashMap2 = new LinkedHashMap(linkedHashMap82222222222222222222222222222222222222222222222222222222222222222);
                if (linkedHashMap2 == null) {
                }
                LinkedHashMap linkedHashMap92222222222222222222222222222222222222222222222222222222222222222 = linkedHashMap2;
                l0 = catalogBlockDto.l0();
                List<CatalogSearchAuthorItemDto> y22222222222222222222222222222222222222222222222222222222222222222 = catalogBlockDto.y2();
                if (l0 == CatalogBlockDataTypeDto.SEARCH_AUTHORS) {
                }
                l02 = catalogBlockDto.l0();
                List<CatalogGameItemDto> H02222222222222222222222222222222222222222222222222222222222222222 = catalogBlockDto.H0();
                if (l02 == CatalogBlockDataTypeDto.GAMES) {
                }
                String str22222222222222222222222222222222222222222222222222222222222222222 = str;
                l03 = catalogBlockDto.l0();
                List<CatalogGroupCategoryMetaItemDto> N02222222222222222222222222222222222222222222222222222222222222222 = catalogBlockDto.N0();
                t2a t2aVar2222222222222222222222222222222222222222222222222222222222222222 = new t2a();
                if (l03 != CatalogBlockDataTypeDto.GROUPS_CATEGORY_ITEMS) {
                }
                LinkedHashMap linkedHashMap112222222222222222222222222222222222222222222222222222222222222222 = linkedHashMap5;
                l04 = catalogBlockDto.l0();
                List<CatalogMiniAppContentItemDto> E12222222222222222222222222222222222222222222222222222222222222222 = catalogBlockDto.E1();
                if (l04 == CatalogBlockDataTypeDto.MINI_APPS_CONTENT) {
                }
                LinkedHashMap linkedHashMap122222222222222222222222222222222222222222222222222222222222222222 = linkedHashMap6;
                i4 = a.$EnumSwitchMapping$0[catalogBlockDto.l0().ordinal()];
                if (i4 != 10) {
                }
                P0 = catalogBlockDto.P0();
                if (P0 == null) {
                }
                if (r1 == 0) {
                }
                arrayList2 = new ArrayList((Collection) r1);
                if (arrayList2 == null) {
                }
                ArrayList arrayList42222222222222222222222222222222222222222222222222222222222222222 = arrayList2;
                T = catalogBlockDto.T();
                if (T == null) {
                }
                if (map == null) {
                }
                LinkedHashMap linkedHashMap132222222222222222222222222222222222222222222222222222222222222222 = new LinkedHashMap(map);
                CatalogBlockDataTypeDto l072222222222222222222222222222222222222222222222222222222222222222 = catalogBlockDto.l0();
                M = catalogBlockDto.M();
                LinkedHashMap linkedHashMap142222222222222222222222222222222222222222222222222222222222222222 = new LinkedHashMap();
                if (M != null) {
                }
                return new CatalogBlockItemsData(a32222222222222222222222222222222222222222222222222222222222222222, arrayList32222222222222222222222222222222222222222222222222222222222222222, linkedHashMap, linkedHashMap3, linkedHashMap4, linkedHashMap92222222222222222222222222222222222222222222222222222222222222222, linkedHashMap112222222222222222222222222222222222222222222222222222222222222222, linkedHashMap122222222222222222222222222222222222222222222222222222222222222222, arrayList42222222222222222222222222222222222222222222222222222222222222222, linkedHashMap132222222222222222222222222222222222222222222222222222222222222222, null, linkedHashMap142222222222222222222222222222222222222222222222222222222222222222, 1024, null);
            case 50:
            case 51:
            case 52:
            case 53:
                i2 = catalogBlockDto.g3();
                if (i2 == null) {
                }
                CatalogDataType a322222222222222222222222222222222222222222222222222222222222222222 = a4a.a(catalogBlockDto.l0());
                ArrayList arrayList322222222222222222222222222222222222222222222222222222222222222222 = new ArrayList(i2);
                CatalogBlockDataTypeDto l0522222222222222222222222222222222222222222222222222222222222222222 = catalogBlockDto.l0();
                V0 = catalogBlockDto.V0();
                i = a.$EnumSwitchMapping$0[l0522222222222222222222222222222222222222222222222222222222222222222.ordinal()];
                if (i != 10) {
                }
                LinkedHashMap linkedHashMap722222222222222222222222222222222222222222222222222222222222222222 = new LinkedHashMap();
                it = V0.iterator();
                while (it.hasNext()) {
                }
                linkedHashMap = new LinkedHashMap(linkedHashMap722222222222222222222222222222222222222222222222222222222222222222);
                if (linkedHashMap == null) {
                }
                CatalogBlockDataTypeDto l0622222222222222222222222222222222222222222222222222222222222222222 = catalogBlockDto.l0();
                w0 = catalogBlockDto.w0();
                hpu hpuVar22222222222222222222222222222222222222222222222222222222222222222 = new hpu();
                i3 = a.$EnumSwitchMapping$0[l0622222222222222222222222222222222222222222222222222222222222222222.ordinal()];
                if (i3 != 15) {
                }
                a2a a2aVar22222222222222222222222222222222222222222222222222222222222222222 = new a2a(1, hpuVar22222222222222222222222222222222222222222222222222222222222222222, hpu.class, "map", "map(Lcom/vk/api/generated/catalog/dto/CatalogEntityGroupsItemDto;)Lcom/vk/dto/group/GroupsEntityCatalogItem;", 0, 0);
                LinkedHashMap linkedHashMap822222222222222222222222222222222222222222222222222222222222222222 = new LinkedHashMap();
                it2 = w0.iterator();
                while (it2.hasNext()) {
                }
                linkedHashMap2 = new LinkedHashMap(linkedHashMap822222222222222222222222222222222222222222222222222222222222222222);
                if (linkedHashMap2 == null) {
                }
                LinkedHashMap linkedHashMap922222222222222222222222222222222222222222222222222222222222222222 = linkedHashMap2;
                l0 = catalogBlockDto.l0();
                List<CatalogSearchAuthorItemDto> y222222222222222222222222222222222222222222222222222222222222222222 = catalogBlockDto.y2();
                if (l0 == CatalogBlockDataTypeDto.SEARCH_AUTHORS) {
                }
                l02 = catalogBlockDto.l0();
                List<CatalogGameItemDto> H022222222222222222222222222222222222222222222222222222222222222222 = catalogBlockDto.H0();
                if (l02 == CatalogBlockDataTypeDto.GAMES) {
                }
                String str222222222222222222222222222222222222222222222222222222222222222222 = str;
                l03 = catalogBlockDto.l0();
                List<CatalogGroupCategoryMetaItemDto> N022222222222222222222222222222222222222222222222222222222222222222 = catalogBlockDto.N0();
                t2a t2aVar22222222222222222222222222222222222222222222222222222222222222222 = new t2a();
                if (l03 != CatalogBlockDataTypeDto.GROUPS_CATEGORY_ITEMS) {
                }
                LinkedHashMap linkedHashMap1122222222222222222222222222222222222222222222222222222222222222222 = linkedHashMap5;
                l04 = catalogBlockDto.l0();
                List<CatalogMiniAppContentItemDto> E122222222222222222222222222222222222222222222222222222222222222222 = catalogBlockDto.E1();
                if (l04 == CatalogBlockDataTypeDto.MINI_APPS_CONTENT) {
                }
                LinkedHashMap linkedHashMap1222222222222222222222222222222222222222222222222222222222222222222 = linkedHashMap6;
                i4 = a.$EnumSwitchMapping$0[catalogBlockDto.l0().ordinal()];
                if (i4 != 10) {
                }
                P0 = catalogBlockDto.P0();
                if (P0 == null) {
                }
                if (r1 == 0) {
                }
                arrayList2 = new ArrayList((Collection) r1);
                if (arrayList2 == null) {
                }
                ArrayList arrayList422222222222222222222222222222222222222222222222222222222222222222 = arrayList2;
                T = catalogBlockDto.T();
                if (T == null) {
                }
                if (map == null) {
                }
                LinkedHashMap linkedHashMap1322222222222222222222222222222222222222222222222222222222222222222 = new LinkedHashMap(map);
                CatalogBlockDataTypeDto l0722222222222222222222222222222222222222222222222222222222222222222 = catalogBlockDto.l0();
                M = catalogBlockDto.M();
                LinkedHashMap linkedHashMap1422222222222222222222222222222222222222222222222222222222222222222 = new LinkedHashMap();
                if (M != null) {
                }
                return new CatalogBlockItemsData(a322222222222222222222222222222222222222222222222222222222222222222, arrayList322222222222222222222222222222222222222222222222222222222222222222, linkedHashMap, linkedHashMap3, linkedHashMap4, linkedHashMap922222222222222222222222222222222222222222222222222222222222222222, linkedHashMap1122222222222222222222222222222222222222222222222222222222222222222, linkedHashMap1222222222222222222222222222222222222222222222222222222222222222222, arrayList422222222222222222222222222222222222222222222222222222222222222222, linkedHashMap1322222222222222222222222222222222222222222222222222222222222222222, null, linkedHashMap1422222222222222222222222222222222222222222222222222222222222222222, 1024, null);
            case 54:
                List<CatalogChannelsItemDto> T2 = catalogBlockDto.T();
                if (T2 != null) {
                    List<CatalogChannelsItemDto> list23 = T2;
                    arrayList = new ArrayList(c5g.u(list23, 10));
                    Iterator it22 = list23.iterator();
                    while (it22.hasNext()) {
                        arrayList.add(String.valueOf(((CatalogChannelsItemDto) it22.next()).d()));
                    }
                    i2 = arrayList;
                    if (i2 == null) {
                    }
                    CatalogDataType a3222222222222222222222222222222222222222222222222222222222222222222 = a4a.a(catalogBlockDto.l0());
                    ArrayList arrayList3222222222222222222222222222222222222222222222222222222222222222222 = new ArrayList(i2);
                    CatalogBlockDataTypeDto l05222222222222222222222222222222222222222222222222222222222222222222 = catalogBlockDto.l0();
                    V0 = catalogBlockDto.V0();
                    i = a.$EnumSwitchMapping$0[l05222222222222222222222222222222222222222222222222222222222222222222.ordinal()];
                    if (i != 10) {
                    }
                    LinkedHashMap linkedHashMap7222222222222222222222222222222222222222222222222222222222222222222 = new LinkedHashMap();
                    it = V0.iterator();
                    while (it.hasNext()) {
                    }
                    linkedHashMap = new LinkedHashMap(linkedHashMap7222222222222222222222222222222222222222222222222222222222222222222);
                    if (linkedHashMap == null) {
                    }
                    CatalogBlockDataTypeDto l06222222222222222222222222222222222222222222222222222222222222222222 = catalogBlockDto.l0();
                    w0 = catalogBlockDto.w0();
                    hpu hpuVar222222222222222222222222222222222222222222222222222222222222222222 = new hpu();
                    i3 = a.$EnumSwitchMapping$0[l06222222222222222222222222222222222222222222222222222222222222222222.ordinal()];
                    if (i3 != 15) {
                    }
                    a2a a2aVar222222222222222222222222222222222222222222222222222222222222222222 = new a2a(1, hpuVar222222222222222222222222222222222222222222222222222222222222222222, hpu.class, "map", "map(Lcom/vk/api/generated/catalog/dto/CatalogEntityGroupsItemDto;)Lcom/vk/dto/group/GroupsEntityCatalogItem;", 0, 0);
                    LinkedHashMap linkedHashMap8222222222222222222222222222222222222222222222222222222222222222222 = new LinkedHashMap();
                    it2 = w0.iterator();
                    while (it2.hasNext()) {
                    }
                    linkedHashMap2 = new LinkedHashMap(linkedHashMap8222222222222222222222222222222222222222222222222222222222222222222);
                    if (linkedHashMap2 == null) {
                    }
                    LinkedHashMap linkedHashMap9222222222222222222222222222222222222222222222222222222222222222222 = linkedHashMap2;
                    l0 = catalogBlockDto.l0();
                    List<CatalogSearchAuthorItemDto> y2222222222222222222222222222222222222222222222222222222222222222222 = catalogBlockDto.y2();
                    if (l0 == CatalogBlockDataTypeDto.SEARCH_AUTHORS) {
                    }
                    l02 = catalogBlockDto.l0();
                    List<CatalogGameItemDto> H0222222222222222222222222222222222222222222222222222222222222222222 = catalogBlockDto.H0();
                    if (l02 == CatalogBlockDataTypeDto.GAMES) {
                    }
                    String str2222222222222222222222222222222222222222222222222222222222222222222 = str;
                    l03 = catalogBlockDto.l0();
                    List<CatalogGroupCategoryMetaItemDto> N0222222222222222222222222222222222222222222222222222222222222222222 = catalogBlockDto.N0();
                    t2a t2aVar222222222222222222222222222222222222222222222222222222222222222222 = new t2a();
                    if (l03 != CatalogBlockDataTypeDto.GROUPS_CATEGORY_ITEMS) {
                    }
                    LinkedHashMap linkedHashMap11222222222222222222222222222222222222222222222222222222222222222222 = linkedHashMap5;
                    l04 = catalogBlockDto.l0();
                    List<CatalogMiniAppContentItemDto> E1222222222222222222222222222222222222222222222222222222222222222222 = catalogBlockDto.E1();
                    if (l04 == CatalogBlockDataTypeDto.MINI_APPS_CONTENT) {
                    }
                    LinkedHashMap linkedHashMap12222222222222222222222222222222222222222222222222222222222222222222 = linkedHashMap6;
                    i4 = a.$EnumSwitchMapping$0[catalogBlockDto.l0().ordinal()];
                    if (i4 != 10) {
                    }
                    P0 = catalogBlockDto.P0();
                    if (P0 == null) {
                    }
                    if (r1 == 0) {
                    }
                    arrayList2 = new ArrayList((Collection) r1);
                    if (arrayList2 == null) {
                    }
                    ArrayList arrayList4222222222222222222222222222222222222222222222222222222222222222222 = arrayList2;
                    T = catalogBlockDto.T();
                    if (T == null) {
                    }
                    if (map == null) {
                    }
                    LinkedHashMap linkedHashMap13222222222222222222222222222222222222222222222222222222222222222222 = new LinkedHashMap(map);
                    CatalogBlockDataTypeDto l07222222222222222222222222222222222222222222222222222222222222222222 = catalogBlockDto.l0();
                    M = catalogBlockDto.M();
                    LinkedHashMap linkedHashMap14222222222222222222222222222222222222222222222222222222222222222222 = new LinkedHashMap();
                    if (M != null) {
                    }
                    return new CatalogBlockItemsData(a3222222222222222222222222222222222222222222222222222222222222222222, arrayList3222222222222222222222222222222222222222222222222222222222222222222, linkedHashMap, linkedHashMap3, linkedHashMap4, linkedHashMap9222222222222222222222222222222222222222222222222222222222222222222, linkedHashMap11222222222222222222222222222222222222222222222222222222222222222222, linkedHashMap12222222222222222222222222222222222222222222222222222222222222222222, arrayList4222222222222222222222222222222222222222222222222222222222222222222, linkedHashMap13222222222222222222222222222222222222222222222222222222222222222222, null, linkedHashMap14222222222222222222222222222222222222222222222222222222222222222222, 1024, null);
                }
                i2 = null;
                if (i2 == null) {
                }
                CatalogDataType a32222222222222222222222222222222222222222222222222222222222222222222 = a4a.a(catalogBlockDto.l0());
                ArrayList arrayList32222222222222222222222222222222222222222222222222222222222222222222 = new ArrayList(i2);
                CatalogBlockDataTypeDto l052222222222222222222222222222222222222222222222222222222222222222222 = catalogBlockDto.l0();
                V0 = catalogBlockDto.V0();
                i = a.$EnumSwitchMapping$0[l052222222222222222222222222222222222222222222222222222222222222222222.ordinal()];
                if (i != 10) {
                }
                LinkedHashMap linkedHashMap72222222222222222222222222222222222222222222222222222222222222222222 = new LinkedHashMap();
                it = V0.iterator();
                while (it.hasNext()) {
                }
                linkedHashMap = new LinkedHashMap(linkedHashMap72222222222222222222222222222222222222222222222222222222222222222222);
                if (linkedHashMap == null) {
                }
                CatalogBlockDataTypeDto l062222222222222222222222222222222222222222222222222222222222222222222 = catalogBlockDto.l0();
                w0 = catalogBlockDto.w0();
                hpu hpuVar2222222222222222222222222222222222222222222222222222222222222222222 = new hpu();
                i3 = a.$EnumSwitchMapping$0[l062222222222222222222222222222222222222222222222222222222222222222222.ordinal()];
                if (i3 != 15) {
                }
                a2a a2aVar2222222222222222222222222222222222222222222222222222222222222222222 = new a2a(1, hpuVar2222222222222222222222222222222222222222222222222222222222222222222, hpu.class, "map", "map(Lcom/vk/api/generated/catalog/dto/CatalogEntityGroupsItemDto;)Lcom/vk/dto/group/GroupsEntityCatalogItem;", 0, 0);
                LinkedHashMap linkedHashMap82222222222222222222222222222222222222222222222222222222222222222222 = new LinkedHashMap();
                it2 = w0.iterator();
                while (it2.hasNext()) {
                }
                linkedHashMap2 = new LinkedHashMap(linkedHashMap82222222222222222222222222222222222222222222222222222222222222222222);
                if (linkedHashMap2 == null) {
                }
                LinkedHashMap linkedHashMap92222222222222222222222222222222222222222222222222222222222222222222 = linkedHashMap2;
                l0 = catalogBlockDto.l0();
                List<CatalogSearchAuthorItemDto> y22222222222222222222222222222222222222222222222222222222222222222222 = catalogBlockDto.y2();
                if (l0 == CatalogBlockDataTypeDto.SEARCH_AUTHORS) {
                }
                l02 = catalogBlockDto.l0();
                List<CatalogGameItemDto> H02222222222222222222222222222222222222222222222222222222222222222222 = catalogBlockDto.H0();
                if (l02 == CatalogBlockDataTypeDto.GAMES) {
                }
                String str22222222222222222222222222222222222222222222222222222222222222222222 = str;
                l03 = catalogBlockDto.l0();
                List<CatalogGroupCategoryMetaItemDto> N02222222222222222222222222222222222222222222222222222222222222222222 = catalogBlockDto.N0();
                t2a t2aVar2222222222222222222222222222222222222222222222222222222222222222222 = new t2a();
                if (l03 != CatalogBlockDataTypeDto.GROUPS_CATEGORY_ITEMS) {
                }
                LinkedHashMap linkedHashMap112222222222222222222222222222222222222222222222222222222222222222222 = linkedHashMap5;
                l04 = catalogBlockDto.l0();
                List<CatalogMiniAppContentItemDto> E12222222222222222222222222222222222222222222222222222222222222222222 = catalogBlockDto.E1();
                if (l04 == CatalogBlockDataTypeDto.MINI_APPS_CONTENT) {
                }
                LinkedHashMap linkedHashMap122222222222222222222222222222222222222222222222222222222222222222222 = linkedHashMap6;
                i4 = a.$EnumSwitchMapping$0[catalogBlockDto.l0().ordinal()];
                if (i4 != 10) {
                }
                P0 = catalogBlockDto.P0();
                if (P0 == null) {
                }
                if (r1 == 0) {
                }
                arrayList2 = new ArrayList((Collection) r1);
                if (arrayList2 == null) {
                }
                ArrayList arrayList42222222222222222222222222222222222222222222222222222222222222222222 = arrayList2;
                T = catalogBlockDto.T();
                if (T == null) {
                }
                if (map == null) {
                }
                LinkedHashMap linkedHashMap132222222222222222222222222222222222222222222222222222222222222222222 = new LinkedHashMap(map);
                CatalogBlockDataTypeDto l072222222222222222222222222222222222222222222222222222222222222222222 = catalogBlockDto.l0();
                M = catalogBlockDto.M();
                LinkedHashMap linkedHashMap142222222222222222222222222222222222222222222222222222222222222222222 = new LinkedHashMap();
                if (M != null) {
                }
                return new CatalogBlockItemsData(a32222222222222222222222222222222222222222222222222222222222222222222, arrayList32222222222222222222222222222222222222222222222222222222222222222222, linkedHashMap, linkedHashMap3, linkedHashMap4, linkedHashMap92222222222222222222222222222222222222222222222222222222222222222222, linkedHashMap112222222222222222222222222222222222222222222222222222222222222222222, linkedHashMap122222222222222222222222222222222222222222222222222222222222222222222, arrayList42222222222222222222222222222222222222222222222222222222222222222222, linkedHashMap132222222222222222222222222222222222222222222222222222222222222222222, null, linkedHashMap142222222222222222222222222222222222222222222222222222222222222222222, 1024, null);
            case 55:
                i2 = catalogBlockDto.n();
                if (i2 == null) {
                }
                CatalogDataType a322222222222222222222222222222222222222222222222222222222222222222222 = a4a.a(catalogBlockDto.l0());
                ArrayList arrayList322222222222222222222222222222222222222222222222222222222222222222222 = new ArrayList(i2);
                CatalogBlockDataTypeDto l0522222222222222222222222222222222222222222222222222222222222222222222 = catalogBlockDto.l0();
                V0 = catalogBlockDto.V0();
                i = a.$EnumSwitchMapping$0[l0522222222222222222222222222222222222222222222222222222222222222222222.ordinal()];
                if (i != 10) {
                }
                LinkedHashMap linkedHashMap722222222222222222222222222222222222222222222222222222222222222222222 = new LinkedHashMap();
                it = V0.iterator();
                while (it.hasNext()) {
                }
                linkedHashMap = new LinkedHashMap(linkedHashMap722222222222222222222222222222222222222222222222222222222222222222222);
                if (linkedHashMap == null) {
                }
                CatalogBlockDataTypeDto l0622222222222222222222222222222222222222222222222222222222222222222222 = catalogBlockDto.l0();
                w0 = catalogBlockDto.w0();
                hpu hpuVar22222222222222222222222222222222222222222222222222222222222222222222 = new hpu();
                i3 = a.$EnumSwitchMapping$0[l0622222222222222222222222222222222222222222222222222222222222222222222.ordinal()];
                if (i3 != 15) {
                }
                a2a a2aVar22222222222222222222222222222222222222222222222222222222222222222222 = new a2a(1, hpuVar22222222222222222222222222222222222222222222222222222222222222222222, hpu.class, "map", "map(Lcom/vk/api/generated/catalog/dto/CatalogEntityGroupsItemDto;)Lcom/vk/dto/group/GroupsEntityCatalogItem;", 0, 0);
                LinkedHashMap linkedHashMap822222222222222222222222222222222222222222222222222222222222222222222 = new LinkedHashMap();
                it2 = w0.iterator();
                while (it2.hasNext()) {
                }
                linkedHashMap2 = new LinkedHashMap(linkedHashMap822222222222222222222222222222222222222222222222222222222222222222222);
                if (linkedHashMap2 == null) {
                }
                LinkedHashMap linkedHashMap922222222222222222222222222222222222222222222222222222222222222222222 = linkedHashMap2;
                l0 = catalogBlockDto.l0();
                List<CatalogSearchAuthorItemDto> y222222222222222222222222222222222222222222222222222222222222222222222 = catalogBlockDto.y2();
                if (l0 == CatalogBlockDataTypeDto.SEARCH_AUTHORS) {
                }
                l02 = catalogBlockDto.l0();
                List<CatalogGameItemDto> H022222222222222222222222222222222222222222222222222222222222222222222 = catalogBlockDto.H0();
                if (l02 == CatalogBlockDataTypeDto.GAMES) {
                }
                String str222222222222222222222222222222222222222222222222222222222222222222222 = str;
                l03 = catalogBlockDto.l0();
                List<CatalogGroupCategoryMetaItemDto> N022222222222222222222222222222222222222222222222222222222222222222222 = catalogBlockDto.N0();
                t2a t2aVar22222222222222222222222222222222222222222222222222222222222222222222 = new t2a();
                if (l03 != CatalogBlockDataTypeDto.GROUPS_CATEGORY_ITEMS) {
                }
                LinkedHashMap linkedHashMap1122222222222222222222222222222222222222222222222222222222222222222222 = linkedHashMap5;
                l04 = catalogBlockDto.l0();
                List<CatalogMiniAppContentItemDto> E122222222222222222222222222222222222222222222222222222222222222222222 = catalogBlockDto.E1();
                if (l04 == CatalogBlockDataTypeDto.MINI_APPS_CONTENT) {
                }
                LinkedHashMap linkedHashMap1222222222222222222222222222222222222222222222222222222222222222222222 = linkedHashMap6;
                i4 = a.$EnumSwitchMapping$0[catalogBlockDto.l0().ordinal()];
                if (i4 != 10) {
                }
                P0 = catalogBlockDto.P0();
                if (P0 == null) {
                }
                if (r1 == 0) {
                }
                arrayList2 = new ArrayList((Collection) r1);
                if (arrayList2 == null) {
                }
                ArrayList arrayList422222222222222222222222222222222222222222222222222222222222222222222 = arrayList2;
                T = catalogBlockDto.T();
                if (T == null) {
                }
                if (map == null) {
                }
                LinkedHashMap linkedHashMap1322222222222222222222222222222222222222222222222222222222222222222222 = new LinkedHashMap(map);
                CatalogBlockDataTypeDto l0722222222222222222222222222222222222222222222222222222222222222222222 = catalogBlockDto.l0();
                M = catalogBlockDto.M();
                LinkedHashMap linkedHashMap1422222222222222222222222222222222222222222222222222222222222222222222 = new LinkedHashMap();
                if (M != null) {
                }
                return new CatalogBlockItemsData(a322222222222222222222222222222222222222222222222222222222222222222222, arrayList322222222222222222222222222222222222222222222222222222222222222222222, linkedHashMap, linkedHashMap3, linkedHashMap4, linkedHashMap922222222222222222222222222222222222222222222222222222222222222222222, linkedHashMap1122222222222222222222222222222222222222222222222222222222222222222222, linkedHashMap1222222222222222222222222222222222222222222222222222222222222222222222, arrayList422222222222222222222222222222222222222222222222222222222222222222222, linkedHashMap1322222222222222222222222222222222222222222222222222222222222222222222, null, linkedHashMap1422222222222222222222222222222222222222222222222222222222222222222222, 1024, null);
            case 56:
                i2 = catalogBlockDto.T2();
                if (i2 == null) {
                }
                CatalogDataType a3222222222222222222222222222222222222222222222222222222222222222222222 = a4a.a(catalogBlockDto.l0());
                ArrayList arrayList3222222222222222222222222222222222222222222222222222222222222222222222 = new ArrayList(i2);
                CatalogBlockDataTypeDto l05222222222222222222222222222222222222222222222222222222222222222222222 = catalogBlockDto.l0();
                V0 = catalogBlockDto.V0();
                i = a.$EnumSwitchMapping$0[l05222222222222222222222222222222222222222222222222222222222222222222222.ordinal()];
                if (i != 10) {
                }
                LinkedHashMap linkedHashMap7222222222222222222222222222222222222222222222222222222222222222222222 = new LinkedHashMap();
                it = V0.iterator();
                while (it.hasNext()) {
                }
                linkedHashMap = new LinkedHashMap(linkedHashMap7222222222222222222222222222222222222222222222222222222222222222222222);
                if (linkedHashMap == null) {
                }
                CatalogBlockDataTypeDto l06222222222222222222222222222222222222222222222222222222222222222222222 = catalogBlockDto.l0();
                w0 = catalogBlockDto.w0();
                hpu hpuVar222222222222222222222222222222222222222222222222222222222222222222222 = new hpu();
                i3 = a.$EnumSwitchMapping$0[l06222222222222222222222222222222222222222222222222222222222222222222222.ordinal()];
                if (i3 != 15) {
                }
                a2a a2aVar222222222222222222222222222222222222222222222222222222222222222222222 = new a2a(1, hpuVar222222222222222222222222222222222222222222222222222222222222222222222, hpu.class, "map", "map(Lcom/vk/api/generated/catalog/dto/CatalogEntityGroupsItemDto;)Lcom/vk/dto/group/GroupsEntityCatalogItem;", 0, 0);
                LinkedHashMap linkedHashMap8222222222222222222222222222222222222222222222222222222222222222222222 = new LinkedHashMap();
                it2 = w0.iterator();
                while (it2.hasNext()) {
                }
                linkedHashMap2 = new LinkedHashMap(linkedHashMap8222222222222222222222222222222222222222222222222222222222222222222222);
                if (linkedHashMap2 == null) {
                }
                LinkedHashMap linkedHashMap9222222222222222222222222222222222222222222222222222222222222222222222 = linkedHashMap2;
                l0 = catalogBlockDto.l0();
                List<CatalogSearchAuthorItemDto> y2222222222222222222222222222222222222222222222222222222222222222222222 = catalogBlockDto.y2();
                if (l0 == CatalogBlockDataTypeDto.SEARCH_AUTHORS) {
                }
                l02 = catalogBlockDto.l0();
                List<CatalogGameItemDto> H0222222222222222222222222222222222222222222222222222222222222222222222 = catalogBlockDto.H0();
                if (l02 == CatalogBlockDataTypeDto.GAMES) {
                }
                String str2222222222222222222222222222222222222222222222222222222222222222222222 = str;
                l03 = catalogBlockDto.l0();
                List<CatalogGroupCategoryMetaItemDto> N0222222222222222222222222222222222222222222222222222222222222222222222 = catalogBlockDto.N0();
                t2a t2aVar222222222222222222222222222222222222222222222222222222222222222222222 = new t2a();
                if (l03 != CatalogBlockDataTypeDto.GROUPS_CATEGORY_ITEMS) {
                }
                LinkedHashMap linkedHashMap11222222222222222222222222222222222222222222222222222222222222222222222 = linkedHashMap5;
                l04 = catalogBlockDto.l0();
                List<CatalogMiniAppContentItemDto> E1222222222222222222222222222222222222222222222222222222222222222222222 = catalogBlockDto.E1();
                if (l04 == CatalogBlockDataTypeDto.MINI_APPS_CONTENT) {
                }
                LinkedHashMap linkedHashMap12222222222222222222222222222222222222222222222222222222222222222222222 = linkedHashMap6;
                i4 = a.$EnumSwitchMapping$0[catalogBlockDto.l0().ordinal()];
                if (i4 != 10) {
                }
                P0 = catalogBlockDto.P0();
                if (P0 == null) {
                }
                if (r1 == 0) {
                }
                arrayList2 = new ArrayList((Collection) r1);
                if (arrayList2 == null) {
                }
                ArrayList arrayList4222222222222222222222222222222222222222222222222222222222222222222222 = arrayList2;
                T = catalogBlockDto.T();
                if (T == null) {
                }
                if (map == null) {
                }
                LinkedHashMap linkedHashMap13222222222222222222222222222222222222222222222222222222222222222222222 = new LinkedHashMap(map);
                CatalogBlockDataTypeDto l07222222222222222222222222222222222222222222222222222222222222222222222 = catalogBlockDto.l0();
                M = catalogBlockDto.M();
                LinkedHashMap linkedHashMap14222222222222222222222222222222222222222222222222222222222222222222222 = new LinkedHashMap();
                if (M != null) {
                }
                return new CatalogBlockItemsData(a3222222222222222222222222222222222222222222222222222222222222222222222, arrayList3222222222222222222222222222222222222222222222222222222222222222222222, linkedHashMap, linkedHashMap3, linkedHashMap4, linkedHashMap9222222222222222222222222222222222222222222222222222222222222222222222, linkedHashMap11222222222222222222222222222222222222222222222222222222222222222222222, linkedHashMap12222222222222222222222222222222222222222222222222222222222222222222222, arrayList4222222222222222222222222222222222222222222222222222222222222222222222, linkedHashMap13222222222222222222222222222222222222222222222222222222222222222222222, null, linkedHashMap14222222222222222222222222222222222222222222222222222222222222222222222, 1024, null);
            case 57:
                i2 = catalogBlockDto.R2();
                if (i2 == null) {
                }
                CatalogDataType a32222222222222222222222222222222222222222222222222222222222222222222222 = a4a.a(catalogBlockDto.l0());
                ArrayList arrayList32222222222222222222222222222222222222222222222222222222222222222222222 = new ArrayList(i2);
                CatalogBlockDataTypeDto l052222222222222222222222222222222222222222222222222222222222222222222222 = catalogBlockDto.l0();
                V0 = catalogBlockDto.V0();
                i = a.$EnumSwitchMapping$0[l052222222222222222222222222222222222222222222222222222222222222222222222.ordinal()];
                if (i != 10) {
                }
                LinkedHashMap linkedHashMap72222222222222222222222222222222222222222222222222222222222222222222222 = new LinkedHashMap();
                it = V0.iterator();
                while (it.hasNext()) {
                }
                linkedHashMap = new LinkedHashMap(linkedHashMap72222222222222222222222222222222222222222222222222222222222222222222222);
                if (linkedHashMap == null) {
                }
                CatalogBlockDataTypeDto l062222222222222222222222222222222222222222222222222222222222222222222222 = catalogBlockDto.l0();
                w0 = catalogBlockDto.w0();
                hpu hpuVar2222222222222222222222222222222222222222222222222222222222222222222222 = new hpu();
                i3 = a.$EnumSwitchMapping$0[l062222222222222222222222222222222222222222222222222222222222222222222222.ordinal()];
                if (i3 != 15) {
                }
                a2a a2aVar2222222222222222222222222222222222222222222222222222222222222222222222 = new a2a(1, hpuVar2222222222222222222222222222222222222222222222222222222222222222222222, hpu.class, "map", "map(Lcom/vk/api/generated/catalog/dto/CatalogEntityGroupsItemDto;)Lcom/vk/dto/group/GroupsEntityCatalogItem;", 0, 0);
                LinkedHashMap linkedHashMap82222222222222222222222222222222222222222222222222222222222222222222222 = new LinkedHashMap();
                it2 = w0.iterator();
                while (it2.hasNext()) {
                }
                linkedHashMap2 = new LinkedHashMap(linkedHashMap82222222222222222222222222222222222222222222222222222222222222222222222);
                if (linkedHashMap2 == null) {
                }
                LinkedHashMap linkedHashMap92222222222222222222222222222222222222222222222222222222222222222222222 = linkedHashMap2;
                l0 = catalogBlockDto.l0();
                List<CatalogSearchAuthorItemDto> y22222222222222222222222222222222222222222222222222222222222222222222222 = catalogBlockDto.y2();
                if (l0 == CatalogBlockDataTypeDto.SEARCH_AUTHORS) {
                }
                l02 = catalogBlockDto.l0();
                List<CatalogGameItemDto> H02222222222222222222222222222222222222222222222222222222222222222222222 = catalogBlockDto.H0();
                if (l02 == CatalogBlockDataTypeDto.GAMES) {
                }
                String str22222222222222222222222222222222222222222222222222222222222222222222222 = str;
                l03 = catalogBlockDto.l0();
                List<CatalogGroupCategoryMetaItemDto> N02222222222222222222222222222222222222222222222222222222222222222222222 = catalogBlockDto.N0();
                t2a t2aVar2222222222222222222222222222222222222222222222222222222222222222222222 = new t2a();
                if (l03 != CatalogBlockDataTypeDto.GROUPS_CATEGORY_ITEMS) {
                }
                LinkedHashMap linkedHashMap112222222222222222222222222222222222222222222222222222222222222222222222 = linkedHashMap5;
                l04 = catalogBlockDto.l0();
                List<CatalogMiniAppContentItemDto> E12222222222222222222222222222222222222222222222222222222222222222222222 = catalogBlockDto.E1();
                if (l04 == CatalogBlockDataTypeDto.MINI_APPS_CONTENT) {
                }
                LinkedHashMap linkedHashMap122222222222222222222222222222222222222222222222222222222222222222222222 = linkedHashMap6;
                i4 = a.$EnumSwitchMapping$0[catalogBlockDto.l0().ordinal()];
                if (i4 != 10) {
                }
                P0 = catalogBlockDto.P0();
                if (P0 == null) {
                }
                if (r1 == 0) {
                }
                arrayList2 = new ArrayList((Collection) r1);
                if (arrayList2 == null) {
                }
                ArrayList arrayList42222222222222222222222222222222222222222222222222222222222222222222222 = arrayList2;
                T = catalogBlockDto.T();
                if (T == null) {
                }
                if (map == null) {
                }
                LinkedHashMap linkedHashMap132222222222222222222222222222222222222222222222222222222222222222222222 = new LinkedHashMap(map);
                CatalogBlockDataTypeDto l072222222222222222222222222222222222222222222222222222222222222222222222 = catalogBlockDto.l0();
                M = catalogBlockDto.M();
                LinkedHashMap linkedHashMap142222222222222222222222222222222222222222222222222222222222222222222222 = new LinkedHashMap();
                if (M != null) {
                }
                return new CatalogBlockItemsData(a32222222222222222222222222222222222222222222222222222222222222222222222, arrayList32222222222222222222222222222222222222222222222222222222222222222222222, linkedHashMap, linkedHashMap3, linkedHashMap4, linkedHashMap92222222222222222222222222222222222222222222222222222222222222222222222, linkedHashMap112222222222222222222222222222222222222222222222222222222222222222222222, linkedHashMap122222222222222222222222222222222222222222222222222222222222222222222222, arrayList42222222222222222222222222222222222222222222222222222222222222222222222, linkedHashMap132222222222222222222222222222222222222222222222222222222222222222222222, null, linkedHashMap142222222222222222222222222222222222222222222222222222222222222222222222, 1024, null);
            case 58:
                i2 = catalogBlockDto.B2();
                if (i2 == null) {
                }
                CatalogDataType a322222222222222222222222222222222222222222222222222222222222222222222222 = a4a.a(catalogBlockDto.l0());
                ArrayList arrayList322222222222222222222222222222222222222222222222222222222222222222222222 = new ArrayList(i2);
                CatalogBlockDataTypeDto l0522222222222222222222222222222222222222222222222222222222222222222222222 = catalogBlockDto.l0();
                V0 = catalogBlockDto.V0();
                i = a.$EnumSwitchMapping$0[l0522222222222222222222222222222222222222222222222222222222222222222222222.ordinal()];
                if (i != 10) {
                }
                LinkedHashMap linkedHashMap722222222222222222222222222222222222222222222222222222222222222222222222 = new LinkedHashMap();
                it = V0.iterator();
                while (it.hasNext()) {
                }
                linkedHashMap = new LinkedHashMap(linkedHashMap722222222222222222222222222222222222222222222222222222222222222222222222);
                if (linkedHashMap == null) {
                }
                CatalogBlockDataTypeDto l0622222222222222222222222222222222222222222222222222222222222222222222222 = catalogBlockDto.l0();
                w0 = catalogBlockDto.w0();
                hpu hpuVar22222222222222222222222222222222222222222222222222222222222222222222222 = new hpu();
                i3 = a.$EnumSwitchMapping$0[l0622222222222222222222222222222222222222222222222222222222222222222222222.ordinal()];
                if (i3 != 15) {
                }
                a2a a2aVar22222222222222222222222222222222222222222222222222222222222222222222222 = new a2a(1, hpuVar22222222222222222222222222222222222222222222222222222222222222222222222, hpu.class, "map", "map(Lcom/vk/api/generated/catalog/dto/CatalogEntityGroupsItemDto;)Lcom/vk/dto/group/GroupsEntityCatalogItem;", 0, 0);
                LinkedHashMap linkedHashMap822222222222222222222222222222222222222222222222222222222222222222222222 = new LinkedHashMap();
                it2 = w0.iterator();
                while (it2.hasNext()) {
                }
                linkedHashMap2 = new LinkedHashMap(linkedHashMap822222222222222222222222222222222222222222222222222222222222222222222222);
                if (linkedHashMap2 == null) {
                }
                LinkedHashMap linkedHashMap922222222222222222222222222222222222222222222222222222222222222222222222 = linkedHashMap2;
                l0 = catalogBlockDto.l0();
                List<CatalogSearchAuthorItemDto> y222222222222222222222222222222222222222222222222222222222222222222222222 = catalogBlockDto.y2();
                if (l0 == CatalogBlockDataTypeDto.SEARCH_AUTHORS) {
                }
                l02 = catalogBlockDto.l0();
                List<CatalogGameItemDto> H022222222222222222222222222222222222222222222222222222222222222222222222 = catalogBlockDto.H0();
                if (l02 == CatalogBlockDataTypeDto.GAMES) {
                }
                String str222222222222222222222222222222222222222222222222222222222222222222222222 = str;
                l03 = catalogBlockDto.l0();
                List<CatalogGroupCategoryMetaItemDto> N022222222222222222222222222222222222222222222222222222222222222222222222 = catalogBlockDto.N0();
                t2a t2aVar22222222222222222222222222222222222222222222222222222222222222222222222 = new t2a();
                if (l03 != CatalogBlockDataTypeDto.GROUPS_CATEGORY_ITEMS) {
                }
                LinkedHashMap linkedHashMap1122222222222222222222222222222222222222222222222222222222222222222222222 = linkedHashMap5;
                l04 = catalogBlockDto.l0();
                List<CatalogMiniAppContentItemDto> E122222222222222222222222222222222222222222222222222222222222222222222222 = catalogBlockDto.E1();
                if (l04 == CatalogBlockDataTypeDto.MINI_APPS_CONTENT) {
                }
                LinkedHashMap linkedHashMap1222222222222222222222222222222222222222222222222222222222222222222222222 = linkedHashMap6;
                i4 = a.$EnumSwitchMapping$0[catalogBlockDto.l0().ordinal()];
                if (i4 != 10) {
                }
                P0 = catalogBlockDto.P0();
                if (P0 == null) {
                }
                if (r1 == 0) {
                }
                arrayList2 = new ArrayList((Collection) r1);
                if (arrayList2 == null) {
                }
                ArrayList arrayList422222222222222222222222222222222222222222222222222222222222222222222222 = arrayList2;
                T = catalogBlockDto.T();
                if (T == null) {
                }
                if (map == null) {
                }
                LinkedHashMap linkedHashMap1322222222222222222222222222222222222222222222222222222222222222222222222 = new LinkedHashMap(map);
                CatalogBlockDataTypeDto l0722222222222222222222222222222222222222222222222222222222222222222222222 = catalogBlockDto.l0();
                M = catalogBlockDto.M();
                LinkedHashMap linkedHashMap1422222222222222222222222222222222222222222222222222222222222222222222222 = new LinkedHashMap();
                if (M != null) {
                }
                return new CatalogBlockItemsData(a322222222222222222222222222222222222222222222222222222222222222222222222, arrayList322222222222222222222222222222222222222222222222222222222222222222222222, linkedHashMap, linkedHashMap3, linkedHashMap4, linkedHashMap922222222222222222222222222222222222222222222222222222222222222222222222, linkedHashMap1122222222222222222222222222222222222222222222222222222222222222222222222, linkedHashMap1222222222222222222222222222222222222222222222222222222222222222222222222, arrayList422222222222222222222222222222222222222222222222222222222222222222222222, linkedHashMap1322222222222222222222222222222222222222222222222222222222222222222222222, null, linkedHashMap1422222222222222222222222222222222222222222222222222222222222222222222222, 1024, null);
            case 59:
                i2 = catalogBlockDto.G2();
                if (i2 == null) {
                }
                CatalogDataType a3222222222222222222222222222222222222222222222222222222222222222222222222 = a4a.a(catalogBlockDto.l0());
                ArrayList arrayList3222222222222222222222222222222222222222222222222222222222222222222222222 = new ArrayList(i2);
                CatalogBlockDataTypeDto l05222222222222222222222222222222222222222222222222222222222222222222222222 = catalogBlockDto.l0();
                V0 = catalogBlockDto.V0();
                i = a.$EnumSwitchMapping$0[l05222222222222222222222222222222222222222222222222222222222222222222222222.ordinal()];
                if (i != 10) {
                }
                LinkedHashMap linkedHashMap7222222222222222222222222222222222222222222222222222222222222222222222222 = new LinkedHashMap();
                it = V0.iterator();
                while (it.hasNext()) {
                }
                linkedHashMap = new LinkedHashMap(linkedHashMap7222222222222222222222222222222222222222222222222222222222222222222222222);
                if (linkedHashMap == null) {
                }
                CatalogBlockDataTypeDto l06222222222222222222222222222222222222222222222222222222222222222222222222 = catalogBlockDto.l0();
                w0 = catalogBlockDto.w0();
                hpu hpuVar222222222222222222222222222222222222222222222222222222222222222222222222 = new hpu();
                i3 = a.$EnumSwitchMapping$0[l06222222222222222222222222222222222222222222222222222222222222222222222222.ordinal()];
                if (i3 != 15) {
                }
                a2a a2aVar222222222222222222222222222222222222222222222222222222222222222222222222 = new a2a(1, hpuVar222222222222222222222222222222222222222222222222222222222222222222222222, hpu.class, "map", "map(Lcom/vk/api/generated/catalog/dto/CatalogEntityGroupsItemDto;)Lcom/vk/dto/group/GroupsEntityCatalogItem;", 0, 0);
                LinkedHashMap linkedHashMap8222222222222222222222222222222222222222222222222222222222222222222222222 = new LinkedHashMap();
                it2 = w0.iterator();
                while (it2.hasNext()) {
                }
                linkedHashMap2 = new LinkedHashMap(linkedHashMap8222222222222222222222222222222222222222222222222222222222222222222222222);
                if (linkedHashMap2 == null) {
                }
                LinkedHashMap linkedHashMap9222222222222222222222222222222222222222222222222222222222222222222222222 = linkedHashMap2;
                l0 = catalogBlockDto.l0();
                List<CatalogSearchAuthorItemDto> y2222222222222222222222222222222222222222222222222222222222222222222222222 = catalogBlockDto.y2();
                if (l0 == CatalogBlockDataTypeDto.SEARCH_AUTHORS) {
                }
                l02 = catalogBlockDto.l0();
                List<CatalogGameItemDto> H0222222222222222222222222222222222222222222222222222222222222222222222222 = catalogBlockDto.H0();
                if (l02 == CatalogBlockDataTypeDto.GAMES) {
                }
                String str2222222222222222222222222222222222222222222222222222222222222222222222222 = str;
                l03 = catalogBlockDto.l0();
                List<CatalogGroupCategoryMetaItemDto> N0222222222222222222222222222222222222222222222222222222222222222222222222 = catalogBlockDto.N0();
                t2a t2aVar222222222222222222222222222222222222222222222222222222222222222222222222 = new t2a();
                if (l03 != CatalogBlockDataTypeDto.GROUPS_CATEGORY_ITEMS) {
                }
                LinkedHashMap linkedHashMap11222222222222222222222222222222222222222222222222222222222222222222222222 = linkedHashMap5;
                l04 = catalogBlockDto.l0();
                List<CatalogMiniAppContentItemDto> E1222222222222222222222222222222222222222222222222222222222222222222222222 = catalogBlockDto.E1();
                if (l04 == CatalogBlockDataTypeDto.MINI_APPS_CONTENT) {
                }
                LinkedHashMap linkedHashMap12222222222222222222222222222222222222222222222222222222222222222222222222 = linkedHashMap6;
                i4 = a.$EnumSwitchMapping$0[catalogBlockDto.l0().ordinal()];
                if (i4 != 10) {
                }
                P0 = catalogBlockDto.P0();
                if (P0 == null) {
                }
                if (r1 == 0) {
                }
                arrayList2 = new ArrayList((Collection) r1);
                if (arrayList2 == null) {
                }
                ArrayList arrayList4222222222222222222222222222222222222222222222222222222222222222222222222 = arrayList2;
                T = catalogBlockDto.T();
                if (T == null) {
                }
                if (map == null) {
                }
                LinkedHashMap linkedHashMap13222222222222222222222222222222222222222222222222222222222222222222222222 = new LinkedHashMap(map);
                CatalogBlockDataTypeDto l07222222222222222222222222222222222222222222222222222222222222222222222222 = catalogBlockDto.l0();
                M = catalogBlockDto.M();
                LinkedHashMap linkedHashMap14222222222222222222222222222222222222222222222222222222222222222222222222 = new LinkedHashMap();
                if (M != null) {
                }
                return new CatalogBlockItemsData(a3222222222222222222222222222222222222222222222222222222222222222222222222, arrayList3222222222222222222222222222222222222222222222222222222222222222222222222, linkedHashMap, linkedHashMap3, linkedHashMap4, linkedHashMap9222222222222222222222222222222222222222222222222222222222222222222222222, linkedHashMap11222222222222222222222222222222222222222222222222222222222222222222222222, linkedHashMap12222222222222222222222222222222222222222222222222222222222222222222222222, arrayList4222222222222222222222222222222222222222222222222222222222222222222222222, linkedHashMap13222222222222222222222222222222222222222222222222222222222222222222222222, null, linkedHashMap14222222222222222222222222222222222222222222222222222222222222222222222222, 1024, null);
            case 60:
                i2 = catalogBlockDto.F();
                if (i2 == null) {
                }
                CatalogDataType a32222222222222222222222222222222222222222222222222222222222222222222222222 = a4a.a(catalogBlockDto.l0());
                ArrayList arrayList32222222222222222222222222222222222222222222222222222222222222222222222222 = new ArrayList(i2);
                CatalogBlockDataTypeDto l052222222222222222222222222222222222222222222222222222222222222222222222222 = catalogBlockDto.l0();
                V0 = catalogBlockDto.V0();
                i = a.$EnumSwitchMapping$0[l052222222222222222222222222222222222222222222222222222222222222222222222222.ordinal()];
                if (i != 10) {
                }
                LinkedHashMap linkedHashMap72222222222222222222222222222222222222222222222222222222222222222222222222 = new LinkedHashMap();
                it = V0.iterator();
                while (it.hasNext()) {
                }
                linkedHashMap = new LinkedHashMap(linkedHashMap72222222222222222222222222222222222222222222222222222222222222222222222222);
                if (linkedHashMap == null) {
                }
                CatalogBlockDataTypeDto l062222222222222222222222222222222222222222222222222222222222222222222222222 = catalogBlockDto.l0();
                w0 = catalogBlockDto.w0();
                hpu hpuVar2222222222222222222222222222222222222222222222222222222222222222222222222 = new hpu();
                i3 = a.$EnumSwitchMapping$0[l062222222222222222222222222222222222222222222222222222222222222222222222222.ordinal()];
                if (i3 != 15) {
                }
                a2a a2aVar2222222222222222222222222222222222222222222222222222222222222222222222222 = new a2a(1, hpuVar2222222222222222222222222222222222222222222222222222222222222222222222222, hpu.class, "map", "map(Lcom/vk/api/generated/catalog/dto/CatalogEntityGroupsItemDto;)Lcom/vk/dto/group/GroupsEntityCatalogItem;", 0, 0);
                LinkedHashMap linkedHashMap82222222222222222222222222222222222222222222222222222222222222222222222222 = new LinkedHashMap();
                it2 = w0.iterator();
                while (it2.hasNext()) {
                }
                linkedHashMap2 = new LinkedHashMap(linkedHashMap82222222222222222222222222222222222222222222222222222222222222222222222222);
                if (linkedHashMap2 == null) {
                }
                LinkedHashMap linkedHashMap92222222222222222222222222222222222222222222222222222222222222222222222222 = linkedHashMap2;
                l0 = catalogBlockDto.l0();
                List<CatalogSearchAuthorItemDto> y22222222222222222222222222222222222222222222222222222222222222222222222222 = catalogBlockDto.y2();
                if (l0 == CatalogBlockDataTypeDto.SEARCH_AUTHORS) {
                }
                l02 = catalogBlockDto.l0();
                List<CatalogGameItemDto> H02222222222222222222222222222222222222222222222222222222222222222222222222 = catalogBlockDto.H0();
                if (l02 == CatalogBlockDataTypeDto.GAMES) {
                }
                String str22222222222222222222222222222222222222222222222222222222222222222222222222 = str;
                l03 = catalogBlockDto.l0();
                List<CatalogGroupCategoryMetaItemDto> N02222222222222222222222222222222222222222222222222222222222222222222222222 = catalogBlockDto.N0();
                t2a t2aVar2222222222222222222222222222222222222222222222222222222222222222222222222 = new t2a();
                if (l03 != CatalogBlockDataTypeDto.GROUPS_CATEGORY_ITEMS) {
                }
                LinkedHashMap linkedHashMap112222222222222222222222222222222222222222222222222222222222222222222222222 = linkedHashMap5;
                l04 = catalogBlockDto.l0();
                List<CatalogMiniAppContentItemDto> E12222222222222222222222222222222222222222222222222222222222222222222222222 = catalogBlockDto.E1();
                if (l04 == CatalogBlockDataTypeDto.MINI_APPS_CONTENT) {
                }
                LinkedHashMap linkedHashMap122222222222222222222222222222222222222222222222222222222222222222222222222 = linkedHashMap6;
                i4 = a.$EnumSwitchMapping$0[catalogBlockDto.l0().ordinal()];
                if (i4 != 10) {
                }
                P0 = catalogBlockDto.P0();
                if (P0 == null) {
                }
                if (r1 == 0) {
                }
                arrayList2 = new ArrayList((Collection) r1);
                if (arrayList2 == null) {
                }
                ArrayList arrayList42222222222222222222222222222222222222222222222222222222222222222222222222 = arrayList2;
                T = catalogBlockDto.T();
                if (T == null) {
                }
                if (map == null) {
                }
                LinkedHashMap linkedHashMap132222222222222222222222222222222222222222222222222222222222222222222222222 = new LinkedHashMap(map);
                CatalogBlockDataTypeDto l072222222222222222222222222222222222222222222222222222222222222222222222222 = catalogBlockDto.l0();
                M = catalogBlockDto.M();
                LinkedHashMap linkedHashMap142222222222222222222222222222222222222222222222222222222222222222222222222 = new LinkedHashMap();
                if (M != null) {
                }
                return new CatalogBlockItemsData(a32222222222222222222222222222222222222222222222222222222222222222222222222, arrayList32222222222222222222222222222222222222222222222222222222222222222222222222, linkedHashMap, linkedHashMap3, linkedHashMap4, linkedHashMap92222222222222222222222222222222222222222222222222222222222222222222222222, linkedHashMap112222222222222222222222222222222222222222222222222222222222222222222222222, linkedHashMap122222222222222222222222222222222222222222222222222222222222222222222222222, arrayList42222222222222222222222222222222222222222222222222222222222222222222222222, linkedHashMap132222222222222222222222222222222222222222222222222222222222222222222222222, null, linkedHashMap142222222222222222222222222222222222222222222222222222222222222222222222222, 1024, null);
            case 61:
                i2 = catalogBlockDto.z1();
                if (i2 == null) {
                }
                CatalogDataType a322222222222222222222222222222222222222222222222222222222222222222222222222 = a4a.a(catalogBlockDto.l0());
                ArrayList arrayList322222222222222222222222222222222222222222222222222222222222222222222222222 = new ArrayList(i2);
                CatalogBlockDataTypeDto l0522222222222222222222222222222222222222222222222222222222222222222222222222 = catalogBlockDto.l0();
                V0 = catalogBlockDto.V0();
                i = a.$EnumSwitchMapping$0[l0522222222222222222222222222222222222222222222222222222222222222222222222222.ordinal()];
                if (i != 10) {
                }
                LinkedHashMap linkedHashMap722222222222222222222222222222222222222222222222222222222222222222222222222 = new LinkedHashMap();
                it = V0.iterator();
                while (it.hasNext()) {
                }
                linkedHashMap = new LinkedHashMap(linkedHashMap722222222222222222222222222222222222222222222222222222222222222222222222222);
                if (linkedHashMap == null) {
                }
                CatalogBlockDataTypeDto l0622222222222222222222222222222222222222222222222222222222222222222222222222 = catalogBlockDto.l0();
                w0 = catalogBlockDto.w0();
                hpu hpuVar22222222222222222222222222222222222222222222222222222222222222222222222222 = new hpu();
                i3 = a.$EnumSwitchMapping$0[l0622222222222222222222222222222222222222222222222222222222222222222222222222.ordinal()];
                if (i3 != 15) {
                }
                a2a a2aVar22222222222222222222222222222222222222222222222222222222222222222222222222 = new a2a(1, hpuVar22222222222222222222222222222222222222222222222222222222222222222222222222, hpu.class, "map", "map(Lcom/vk/api/generated/catalog/dto/CatalogEntityGroupsItemDto;)Lcom/vk/dto/group/GroupsEntityCatalogItem;", 0, 0);
                LinkedHashMap linkedHashMap822222222222222222222222222222222222222222222222222222222222222222222222222 = new LinkedHashMap();
                it2 = w0.iterator();
                while (it2.hasNext()) {
                }
                linkedHashMap2 = new LinkedHashMap(linkedHashMap822222222222222222222222222222222222222222222222222222222222222222222222222);
                if (linkedHashMap2 == null) {
                }
                LinkedHashMap linkedHashMap922222222222222222222222222222222222222222222222222222222222222222222222222 = linkedHashMap2;
                l0 = catalogBlockDto.l0();
                List<CatalogSearchAuthorItemDto> y222222222222222222222222222222222222222222222222222222222222222222222222222 = catalogBlockDto.y2();
                if (l0 == CatalogBlockDataTypeDto.SEARCH_AUTHORS) {
                }
                l02 = catalogBlockDto.l0();
                List<CatalogGameItemDto> H022222222222222222222222222222222222222222222222222222222222222222222222222 = catalogBlockDto.H0();
                if (l02 == CatalogBlockDataTypeDto.GAMES) {
                }
                String str222222222222222222222222222222222222222222222222222222222222222222222222222 = str;
                l03 = catalogBlockDto.l0();
                List<CatalogGroupCategoryMetaItemDto> N022222222222222222222222222222222222222222222222222222222222222222222222222 = catalogBlockDto.N0();
                t2a t2aVar22222222222222222222222222222222222222222222222222222222222222222222222222 = new t2a();
                if (l03 != CatalogBlockDataTypeDto.GROUPS_CATEGORY_ITEMS) {
                }
                LinkedHashMap linkedHashMap1122222222222222222222222222222222222222222222222222222222222222222222222222 = linkedHashMap5;
                l04 = catalogBlockDto.l0();
                List<CatalogMiniAppContentItemDto> E122222222222222222222222222222222222222222222222222222222222222222222222222 = catalogBlockDto.E1();
                if (l04 == CatalogBlockDataTypeDto.MINI_APPS_CONTENT) {
                }
                LinkedHashMap linkedHashMap1222222222222222222222222222222222222222222222222222222222222222222222222222 = linkedHashMap6;
                i4 = a.$EnumSwitchMapping$0[catalogBlockDto.l0().ordinal()];
                if (i4 != 10) {
                }
                P0 = catalogBlockDto.P0();
                if (P0 == null) {
                }
                if (r1 == 0) {
                }
                arrayList2 = new ArrayList((Collection) r1);
                if (arrayList2 == null) {
                }
                ArrayList arrayList422222222222222222222222222222222222222222222222222222222222222222222222222 = arrayList2;
                T = catalogBlockDto.T();
                if (T == null) {
                }
                if (map == null) {
                }
                LinkedHashMap linkedHashMap1322222222222222222222222222222222222222222222222222222222222222222222222222 = new LinkedHashMap(map);
                CatalogBlockDataTypeDto l0722222222222222222222222222222222222222222222222222222222222222222222222222 = catalogBlockDto.l0();
                M = catalogBlockDto.M();
                LinkedHashMap linkedHashMap1422222222222222222222222222222222222222222222222222222222222222222222222222 = new LinkedHashMap();
                if (M != null) {
                }
                return new CatalogBlockItemsData(a322222222222222222222222222222222222222222222222222222222222222222222222222, arrayList322222222222222222222222222222222222222222222222222222222222222222222222222, linkedHashMap, linkedHashMap3, linkedHashMap4, linkedHashMap922222222222222222222222222222222222222222222222222222222222222222222222222, linkedHashMap1122222222222222222222222222222222222222222222222222222222222222222222222222, linkedHashMap1222222222222222222222222222222222222222222222222222222222222222222222222222, arrayList422222222222222222222222222222222222222222222222222222222222222222222222222, linkedHashMap1322222222222222222222222222222222222222222222222222222222222222222222222222, null, linkedHashMap1422222222222222222222222222222222222222222222222222222222222222222222222222, 1024, null);
            case 62:
                i2 = catalogBlockDto.W();
                if (i2 == null) {
                }
                CatalogDataType a3222222222222222222222222222222222222222222222222222222222222222222222222222 = a4a.a(catalogBlockDto.l0());
                ArrayList arrayList3222222222222222222222222222222222222222222222222222222222222222222222222222 = new ArrayList(i2);
                CatalogBlockDataTypeDto l05222222222222222222222222222222222222222222222222222222222222222222222222222 = catalogBlockDto.l0();
                V0 = catalogBlockDto.V0();
                i = a.$EnumSwitchMapping$0[l05222222222222222222222222222222222222222222222222222222222222222222222222222.ordinal()];
                if (i != 10) {
                }
                LinkedHashMap linkedHashMap7222222222222222222222222222222222222222222222222222222222222222222222222222 = new LinkedHashMap();
                it = V0.iterator();
                while (it.hasNext()) {
                }
                linkedHashMap = new LinkedHashMap(linkedHashMap7222222222222222222222222222222222222222222222222222222222222222222222222222);
                if (linkedHashMap == null) {
                }
                CatalogBlockDataTypeDto l06222222222222222222222222222222222222222222222222222222222222222222222222222 = catalogBlockDto.l0();
                w0 = catalogBlockDto.w0();
                hpu hpuVar222222222222222222222222222222222222222222222222222222222222222222222222222 = new hpu();
                i3 = a.$EnumSwitchMapping$0[l06222222222222222222222222222222222222222222222222222222222222222222222222222.ordinal()];
                if (i3 != 15) {
                }
                a2a a2aVar222222222222222222222222222222222222222222222222222222222222222222222222222 = new a2a(1, hpuVar222222222222222222222222222222222222222222222222222222222222222222222222222, hpu.class, "map", "map(Lcom/vk/api/generated/catalog/dto/CatalogEntityGroupsItemDto;)Lcom/vk/dto/group/GroupsEntityCatalogItem;", 0, 0);
                LinkedHashMap linkedHashMap8222222222222222222222222222222222222222222222222222222222222222222222222222 = new LinkedHashMap();
                it2 = w0.iterator();
                while (it2.hasNext()) {
                }
                linkedHashMap2 = new LinkedHashMap(linkedHashMap8222222222222222222222222222222222222222222222222222222222222222222222222222);
                if (linkedHashMap2 == null) {
                }
                LinkedHashMap linkedHashMap9222222222222222222222222222222222222222222222222222222222222222222222222222 = linkedHashMap2;
                l0 = catalogBlockDto.l0();
                List<CatalogSearchAuthorItemDto> y2222222222222222222222222222222222222222222222222222222222222222222222222222 = catalogBlockDto.y2();
                if (l0 == CatalogBlockDataTypeDto.SEARCH_AUTHORS) {
                }
                l02 = catalogBlockDto.l0();
                List<CatalogGameItemDto> H0222222222222222222222222222222222222222222222222222222222222222222222222222 = catalogBlockDto.H0();
                if (l02 == CatalogBlockDataTypeDto.GAMES) {
                }
                String str2222222222222222222222222222222222222222222222222222222222222222222222222222 = str;
                l03 = catalogBlockDto.l0();
                List<CatalogGroupCategoryMetaItemDto> N0222222222222222222222222222222222222222222222222222222222222222222222222222 = catalogBlockDto.N0();
                t2a t2aVar222222222222222222222222222222222222222222222222222222222222222222222222222 = new t2a();
                if (l03 != CatalogBlockDataTypeDto.GROUPS_CATEGORY_ITEMS) {
                }
                LinkedHashMap linkedHashMap11222222222222222222222222222222222222222222222222222222222222222222222222222 = linkedHashMap5;
                l04 = catalogBlockDto.l0();
                List<CatalogMiniAppContentItemDto> E1222222222222222222222222222222222222222222222222222222222222222222222222222 = catalogBlockDto.E1();
                if (l04 == CatalogBlockDataTypeDto.MINI_APPS_CONTENT) {
                }
                LinkedHashMap linkedHashMap12222222222222222222222222222222222222222222222222222222222222222222222222222 = linkedHashMap6;
                i4 = a.$EnumSwitchMapping$0[catalogBlockDto.l0().ordinal()];
                if (i4 != 10) {
                }
                P0 = catalogBlockDto.P0();
                if (P0 == null) {
                }
                if (r1 == 0) {
                }
                arrayList2 = new ArrayList((Collection) r1);
                if (arrayList2 == null) {
                }
                ArrayList arrayList4222222222222222222222222222222222222222222222222222222222222222222222222222 = arrayList2;
                T = catalogBlockDto.T();
                if (T == null) {
                }
                if (map == null) {
                }
                LinkedHashMap linkedHashMap13222222222222222222222222222222222222222222222222222222222222222222222222222 = new LinkedHashMap(map);
                CatalogBlockDataTypeDto l07222222222222222222222222222222222222222222222222222222222222222222222222222 = catalogBlockDto.l0();
                M = catalogBlockDto.M();
                LinkedHashMap linkedHashMap14222222222222222222222222222222222222222222222222222222222222222222222222222 = new LinkedHashMap();
                if (M != null) {
                }
                return new CatalogBlockItemsData(a3222222222222222222222222222222222222222222222222222222222222222222222222222, arrayList3222222222222222222222222222222222222222222222222222222222222222222222222222, linkedHashMap, linkedHashMap3, linkedHashMap4, linkedHashMap9222222222222222222222222222222222222222222222222222222222222222222222222222, linkedHashMap11222222222222222222222222222222222222222222222222222222222222222222222222222, linkedHashMap12222222222222222222222222222222222222222222222222222222222222222222222222222, arrayList4222222222222222222222222222222222222222222222222222222222222222222222222222, linkedHashMap13222222222222222222222222222222222222222222222222222222222222222222222222222, null, linkedHashMap14222222222222222222222222222222222222222222222222222222222222222222222222222, 1024, null);
            case 63:
                i2 = catalogBlockDto.t1();
                if (i2 == null) {
                }
                CatalogDataType a32222222222222222222222222222222222222222222222222222222222222222222222222222 = a4a.a(catalogBlockDto.l0());
                ArrayList arrayList32222222222222222222222222222222222222222222222222222222222222222222222222222 = new ArrayList(i2);
                CatalogBlockDataTypeDto l052222222222222222222222222222222222222222222222222222222222222222222222222222 = catalogBlockDto.l0();
                V0 = catalogBlockDto.V0();
                i = a.$EnumSwitchMapping$0[l052222222222222222222222222222222222222222222222222222222222222222222222222222.ordinal()];
                if (i != 10) {
                }
                LinkedHashMap linkedHashMap72222222222222222222222222222222222222222222222222222222222222222222222222222 = new LinkedHashMap();
                it = V0.iterator();
                while (it.hasNext()) {
                }
                linkedHashMap = new LinkedHashMap(linkedHashMap72222222222222222222222222222222222222222222222222222222222222222222222222222);
                if (linkedHashMap == null) {
                }
                CatalogBlockDataTypeDto l062222222222222222222222222222222222222222222222222222222222222222222222222222 = catalogBlockDto.l0();
                w0 = catalogBlockDto.w0();
                hpu hpuVar2222222222222222222222222222222222222222222222222222222222222222222222222222 = new hpu();
                i3 = a.$EnumSwitchMapping$0[l062222222222222222222222222222222222222222222222222222222222222222222222222222.ordinal()];
                if (i3 != 15) {
                }
                a2a a2aVar2222222222222222222222222222222222222222222222222222222222222222222222222222 = new a2a(1, hpuVar2222222222222222222222222222222222222222222222222222222222222222222222222222, hpu.class, "map", "map(Lcom/vk/api/generated/catalog/dto/CatalogEntityGroupsItemDto;)Lcom/vk/dto/group/GroupsEntityCatalogItem;", 0, 0);
                LinkedHashMap linkedHashMap82222222222222222222222222222222222222222222222222222222222222222222222222222 = new LinkedHashMap();
                it2 = w0.iterator();
                while (it2.hasNext()) {
                }
                linkedHashMap2 = new LinkedHashMap(linkedHashMap82222222222222222222222222222222222222222222222222222222222222222222222222222);
                if (linkedHashMap2 == null) {
                }
                LinkedHashMap linkedHashMap92222222222222222222222222222222222222222222222222222222222222222222222222222 = linkedHashMap2;
                l0 = catalogBlockDto.l0();
                List<CatalogSearchAuthorItemDto> y22222222222222222222222222222222222222222222222222222222222222222222222222222 = catalogBlockDto.y2();
                if (l0 == CatalogBlockDataTypeDto.SEARCH_AUTHORS) {
                }
                l02 = catalogBlockDto.l0();
                List<CatalogGameItemDto> H02222222222222222222222222222222222222222222222222222222222222222222222222222 = catalogBlockDto.H0();
                if (l02 == CatalogBlockDataTypeDto.GAMES) {
                }
                String str22222222222222222222222222222222222222222222222222222222222222222222222222222 = str;
                l03 = catalogBlockDto.l0();
                List<CatalogGroupCategoryMetaItemDto> N02222222222222222222222222222222222222222222222222222222222222222222222222222 = catalogBlockDto.N0();
                t2a t2aVar2222222222222222222222222222222222222222222222222222222222222222222222222222 = new t2a();
                if (l03 != CatalogBlockDataTypeDto.GROUPS_CATEGORY_ITEMS) {
                }
                LinkedHashMap linkedHashMap112222222222222222222222222222222222222222222222222222222222222222222222222222 = linkedHashMap5;
                l04 = catalogBlockDto.l0();
                List<CatalogMiniAppContentItemDto> E12222222222222222222222222222222222222222222222222222222222222222222222222222 = catalogBlockDto.E1();
                if (l04 == CatalogBlockDataTypeDto.MINI_APPS_CONTENT) {
                }
                LinkedHashMap linkedHashMap122222222222222222222222222222222222222222222222222222222222222222222222222222 = linkedHashMap6;
                i4 = a.$EnumSwitchMapping$0[catalogBlockDto.l0().ordinal()];
                if (i4 != 10) {
                }
                P0 = catalogBlockDto.P0();
                if (P0 == null) {
                }
                if (r1 == 0) {
                }
                arrayList2 = new ArrayList((Collection) r1);
                if (arrayList2 == null) {
                }
                ArrayList arrayList42222222222222222222222222222222222222222222222222222222222222222222222222222 = arrayList2;
                T = catalogBlockDto.T();
                if (T == null) {
                }
                if (map == null) {
                }
                LinkedHashMap linkedHashMap132222222222222222222222222222222222222222222222222222222222222222222222222222 = new LinkedHashMap(map);
                CatalogBlockDataTypeDto l072222222222222222222222222222222222222222222222222222222222222222222222222222 = catalogBlockDto.l0();
                M = catalogBlockDto.M();
                LinkedHashMap linkedHashMap142222222222222222222222222222222222222222222222222222222222222222222222222222 = new LinkedHashMap();
                if (M != null) {
                }
                return new CatalogBlockItemsData(a32222222222222222222222222222222222222222222222222222222222222222222222222222, arrayList32222222222222222222222222222222222222222222222222222222222222222222222222222, linkedHashMap, linkedHashMap3, linkedHashMap4, linkedHashMap92222222222222222222222222222222222222222222222222222222222222222222222222222, linkedHashMap112222222222222222222222222222222222222222222222222222222222222222222222222222, linkedHashMap122222222222222222222222222222222222222222222222222222222222222222222222222222, arrayList42222222222222222222222222222222222222222222222222222222222222222222222222222, linkedHashMap132222222222222222222222222222222222222222222222222222222222222222222222222222, null, linkedHashMap142222222222222222222222222222222222222222222222222222222222222222222222222222, 1024, null);
            case 64:
                i2 = catalogBlockDto.J2();
                if (i2 == null) {
                }
                CatalogDataType a322222222222222222222222222222222222222222222222222222222222222222222222222222 = a4a.a(catalogBlockDto.l0());
                ArrayList arrayList322222222222222222222222222222222222222222222222222222222222222222222222222222 = new ArrayList(i2);
                CatalogBlockDataTypeDto l0522222222222222222222222222222222222222222222222222222222222222222222222222222 = catalogBlockDto.l0();
                V0 = catalogBlockDto.V0();
                i = a.$EnumSwitchMapping$0[l0522222222222222222222222222222222222222222222222222222222222222222222222222222.ordinal()];
                if (i != 10) {
                }
                LinkedHashMap linkedHashMap722222222222222222222222222222222222222222222222222222222222222222222222222222 = new LinkedHashMap();
                it = V0.iterator();
                while (it.hasNext()) {
                }
                linkedHashMap = new LinkedHashMap(linkedHashMap722222222222222222222222222222222222222222222222222222222222222222222222222222);
                if (linkedHashMap == null) {
                }
                CatalogBlockDataTypeDto l0622222222222222222222222222222222222222222222222222222222222222222222222222222 = catalogBlockDto.l0();
                w0 = catalogBlockDto.w0();
                hpu hpuVar22222222222222222222222222222222222222222222222222222222222222222222222222222 = new hpu();
                i3 = a.$EnumSwitchMapping$0[l0622222222222222222222222222222222222222222222222222222222222222222222222222222.ordinal()];
                if (i3 != 15) {
                }
                a2a a2aVar22222222222222222222222222222222222222222222222222222222222222222222222222222 = new a2a(1, hpuVar22222222222222222222222222222222222222222222222222222222222222222222222222222, hpu.class, "map", "map(Lcom/vk/api/generated/catalog/dto/CatalogEntityGroupsItemDto;)Lcom/vk/dto/group/GroupsEntityCatalogItem;", 0, 0);
                LinkedHashMap linkedHashMap822222222222222222222222222222222222222222222222222222222222222222222222222222 = new LinkedHashMap();
                it2 = w0.iterator();
                while (it2.hasNext()) {
                }
                linkedHashMap2 = new LinkedHashMap(linkedHashMap822222222222222222222222222222222222222222222222222222222222222222222222222222);
                if (linkedHashMap2 == null) {
                }
                LinkedHashMap linkedHashMap922222222222222222222222222222222222222222222222222222222222222222222222222222 = linkedHashMap2;
                l0 = catalogBlockDto.l0();
                List<CatalogSearchAuthorItemDto> y222222222222222222222222222222222222222222222222222222222222222222222222222222 = catalogBlockDto.y2();
                if (l0 == CatalogBlockDataTypeDto.SEARCH_AUTHORS) {
                }
                l02 = catalogBlockDto.l0();
                List<CatalogGameItemDto> H022222222222222222222222222222222222222222222222222222222222222222222222222222 = catalogBlockDto.H0();
                if (l02 == CatalogBlockDataTypeDto.GAMES) {
                }
                String str222222222222222222222222222222222222222222222222222222222222222222222222222222 = str;
                l03 = catalogBlockDto.l0();
                List<CatalogGroupCategoryMetaItemDto> N022222222222222222222222222222222222222222222222222222222222222222222222222222 = catalogBlockDto.N0();
                t2a t2aVar22222222222222222222222222222222222222222222222222222222222222222222222222222 = new t2a();
                if (l03 != CatalogBlockDataTypeDto.GROUPS_CATEGORY_ITEMS) {
                }
                LinkedHashMap linkedHashMap1122222222222222222222222222222222222222222222222222222222222222222222222222222 = linkedHashMap5;
                l04 = catalogBlockDto.l0();
                List<CatalogMiniAppContentItemDto> E122222222222222222222222222222222222222222222222222222222222222222222222222222 = catalogBlockDto.E1();
                if (l04 == CatalogBlockDataTypeDto.MINI_APPS_CONTENT) {
                }
                LinkedHashMap linkedHashMap1222222222222222222222222222222222222222222222222222222222222222222222222222222 = linkedHashMap6;
                i4 = a.$EnumSwitchMapping$0[catalogBlockDto.l0().ordinal()];
                if (i4 != 10) {
                }
                P0 = catalogBlockDto.P0();
                if (P0 == null) {
                }
                if (r1 == 0) {
                }
                arrayList2 = new ArrayList((Collection) r1);
                if (arrayList2 == null) {
                }
                ArrayList arrayList422222222222222222222222222222222222222222222222222222222222222222222222222222 = arrayList2;
                T = catalogBlockDto.T();
                if (T == null) {
                }
                if (map == null) {
                }
                LinkedHashMap linkedHashMap1322222222222222222222222222222222222222222222222222222222222222222222222222222 = new LinkedHashMap(map);
                CatalogBlockDataTypeDto l0722222222222222222222222222222222222222222222222222222222222222222222222222222 = catalogBlockDto.l0();
                M = catalogBlockDto.M();
                LinkedHashMap linkedHashMap1422222222222222222222222222222222222222222222222222222222222222222222222222222 = new LinkedHashMap();
                if (M != null) {
                }
                return new CatalogBlockItemsData(a322222222222222222222222222222222222222222222222222222222222222222222222222222, arrayList322222222222222222222222222222222222222222222222222222222222222222222222222222, linkedHashMap, linkedHashMap3, linkedHashMap4, linkedHashMap922222222222222222222222222222222222222222222222222222222222222222222222222222, linkedHashMap1122222222222222222222222222222222222222222222222222222222222222222222222222222, linkedHashMap1222222222222222222222222222222222222222222222222222222222222222222222222222222, arrayList422222222222222222222222222222222222222222222222222222222222222222222222222222, linkedHashMap1322222222222222222222222222222222222222222222222222222222222222222222222222222, null, linkedHashMap1422222222222222222222222222222222222222222222222222222222222222222222222222222, 1024, null);
            case 65:
                i2 = catalogBlockDto.q2();
                if (i2 == null) {
                }
                CatalogDataType a3222222222222222222222222222222222222222222222222222222222222222222222222222222 = a4a.a(catalogBlockDto.l0());
                ArrayList arrayList3222222222222222222222222222222222222222222222222222222222222222222222222222222 = new ArrayList(i2);
                CatalogBlockDataTypeDto l05222222222222222222222222222222222222222222222222222222222222222222222222222222 = catalogBlockDto.l0();
                V0 = catalogBlockDto.V0();
                i = a.$EnumSwitchMapping$0[l05222222222222222222222222222222222222222222222222222222222222222222222222222222.ordinal()];
                if (i != 10) {
                }
                LinkedHashMap linkedHashMap7222222222222222222222222222222222222222222222222222222222222222222222222222222 = new LinkedHashMap();
                it = V0.iterator();
                while (it.hasNext()) {
                }
                linkedHashMap = new LinkedHashMap(linkedHashMap7222222222222222222222222222222222222222222222222222222222222222222222222222222);
                if (linkedHashMap == null) {
                }
                CatalogBlockDataTypeDto l06222222222222222222222222222222222222222222222222222222222222222222222222222222 = catalogBlockDto.l0();
                w0 = catalogBlockDto.w0();
                hpu hpuVar222222222222222222222222222222222222222222222222222222222222222222222222222222 = new hpu();
                i3 = a.$EnumSwitchMapping$0[l06222222222222222222222222222222222222222222222222222222222222222222222222222222.ordinal()];
                if (i3 != 15) {
                }
                a2a a2aVar222222222222222222222222222222222222222222222222222222222222222222222222222222 = new a2a(1, hpuVar222222222222222222222222222222222222222222222222222222222222222222222222222222, hpu.class, "map", "map(Lcom/vk/api/generated/catalog/dto/CatalogEntityGroupsItemDto;)Lcom/vk/dto/group/GroupsEntityCatalogItem;", 0, 0);
                LinkedHashMap linkedHashMap8222222222222222222222222222222222222222222222222222222222222222222222222222222 = new LinkedHashMap();
                it2 = w0.iterator();
                while (it2.hasNext()) {
                }
                linkedHashMap2 = new LinkedHashMap(linkedHashMap8222222222222222222222222222222222222222222222222222222222222222222222222222222);
                if (linkedHashMap2 == null) {
                }
                LinkedHashMap linkedHashMap9222222222222222222222222222222222222222222222222222222222222222222222222222222 = linkedHashMap2;
                l0 = catalogBlockDto.l0();
                List<CatalogSearchAuthorItemDto> y2222222222222222222222222222222222222222222222222222222222222222222222222222222 = catalogBlockDto.y2();
                if (l0 == CatalogBlockDataTypeDto.SEARCH_AUTHORS) {
                }
                l02 = catalogBlockDto.l0();
                List<CatalogGameItemDto> H0222222222222222222222222222222222222222222222222222222222222222222222222222222 = catalogBlockDto.H0();
                if (l02 == CatalogBlockDataTypeDto.GAMES) {
                }
                String str2222222222222222222222222222222222222222222222222222222222222222222222222222222 = str;
                l03 = catalogBlockDto.l0();
                List<CatalogGroupCategoryMetaItemDto> N0222222222222222222222222222222222222222222222222222222222222222222222222222222 = catalogBlockDto.N0();
                t2a t2aVar222222222222222222222222222222222222222222222222222222222222222222222222222222 = new t2a();
                if (l03 != CatalogBlockDataTypeDto.GROUPS_CATEGORY_ITEMS) {
                }
                LinkedHashMap linkedHashMap11222222222222222222222222222222222222222222222222222222222222222222222222222222 = linkedHashMap5;
                l04 = catalogBlockDto.l0();
                List<CatalogMiniAppContentItemDto> E1222222222222222222222222222222222222222222222222222222222222222222222222222222 = catalogBlockDto.E1();
                if (l04 == CatalogBlockDataTypeDto.MINI_APPS_CONTENT) {
                }
                LinkedHashMap linkedHashMap12222222222222222222222222222222222222222222222222222222222222222222222222222222 = linkedHashMap6;
                i4 = a.$EnumSwitchMapping$0[catalogBlockDto.l0().ordinal()];
                if (i4 != 10) {
                }
                P0 = catalogBlockDto.P0();
                if (P0 == null) {
                }
                if (r1 == 0) {
                }
                arrayList2 = new ArrayList((Collection) r1);
                if (arrayList2 == null) {
                }
                ArrayList arrayList4222222222222222222222222222222222222222222222222222222222222222222222222222222 = arrayList2;
                T = catalogBlockDto.T();
                if (T == null) {
                }
                if (map == null) {
                }
                LinkedHashMap linkedHashMap13222222222222222222222222222222222222222222222222222222222222222222222222222222 = new LinkedHashMap(map);
                CatalogBlockDataTypeDto l07222222222222222222222222222222222222222222222222222222222222222222222222222222 = catalogBlockDto.l0();
                M = catalogBlockDto.M();
                LinkedHashMap linkedHashMap14222222222222222222222222222222222222222222222222222222222222222222222222222222 = new LinkedHashMap();
                if (M != null) {
                }
                return new CatalogBlockItemsData(a3222222222222222222222222222222222222222222222222222222222222222222222222222222, arrayList3222222222222222222222222222222222222222222222222222222222222222222222222222222, linkedHashMap, linkedHashMap3, linkedHashMap4, linkedHashMap9222222222222222222222222222222222222222222222222222222222222222222222222222222, linkedHashMap11222222222222222222222222222222222222222222222222222222222222222222222222222222, linkedHashMap12222222222222222222222222222222222222222222222222222222222222222222222222222222, arrayList4222222222222222222222222222222222222222222222222222222222222222222222222222222, linkedHashMap13222222222222222222222222222222222222222222222222222222222222222222222222222222, null, linkedHashMap14222222222222222222222222222222222222222222222222222222222222222222222222222222, 1024, null);
            case 66:
                i2 = catalogBlockDto.y0();
                if (i2 == null) {
                }
                CatalogDataType a32222222222222222222222222222222222222222222222222222222222222222222222222222222 = a4a.a(catalogBlockDto.l0());
                ArrayList arrayList32222222222222222222222222222222222222222222222222222222222222222222222222222222 = new ArrayList(i2);
                CatalogBlockDataTypeDto l052222222222222222222222222222222222222222222222222222222222222222222222222222222 = catalogBlockDto.l0();
                V0 = catalogBlockDto.V0();
                i = a.$EnumSwitchMapping$0[l052222222222222222222222222222222222222222222222222222222222222222222222222222222.ordinal()];
                if (i != 10) {
                }
                LinkedHashMap linkedHashMap72222222222222222222222222222222222222222222222222222222222222222222222222222222 = new LinkedHashMap();
                it = V0.iterator();
                while (it.hasNext()) {
                }
                linkedHashMap = new LinkedHashMap(linkedHashMap72222222222222222222222222222222222222222222222222222222222222222222222222222222);
                if (linkedHashMap == null) {
                }
                CatalogBlockDataTypeDto l062222222222222222222222222222222222222222222222222222222222222222222222222222222 = catalogBlockDto.l0();
                w0 = catalogBlockDto.w0();
                hpu hpuVar2222222222222222222222222222222222222222222222222222222222222222222222222222222 = new hpu();
                i3 = a.$EnumSwitchMapping$0[l062222222222222222222222222222222222222222222222222222222222222222222222222222222.ordinal()];
                if (i3 != 15) {
                }
                a2a a2aVar2222222222222222222222222222222222222222222222222222222222222222222222222222222 = new a2a(1, hpuVar2222222222222222222222222222222222222222222222222222222222222222222222222222222, hpu.class, "map", "map(Lcom/vk/api/generated/catalog/dto/CatalogEntityGroupsItemDto;)Lcom/vk/dto/group/GroupsEntityCatalogItem;", 0, 0);
                LinkedHashMap linkedHashMap82222222222222222222222222222222222222222222222222222222222222222222222222222222 = new LinkedHashMap();
                it2 = w0.iterator();
                while (it2.hasNext()) {
                }
                linkedHashMap2 = new LinkedHashMap(linkedHashMap82222222222222222222222222222222222222222222222222222222222222222222222222222222);
                if (linkedHashMap2 == null) {
                }
                LinkedHashMap linkedHashMap92222222222222222222222222222222222222222222222222222222222222222222222222222222 = linkedHashMap2;
                l0 = catalogBlockDto.l0();
                List<CatalogSearchAuthorItemDto> y22222222222222222222222222222222222222222222222222222222222222222222222222222222 = catalogBlockDto.y2();
                if (l0 == CatalogBlockDataTypeDto.SEARCH_AUTHORS) {
                }
                l02 = catalogBlockDto.l0();
                List<CatalogGameItemDto> H02222222222222222222222222222222222222222222222222222222222222222222222222222222 = catalogBlockDto.H0();
                if (l02 == CatalogBlockDataTypeDto.GAMES) {
                }
                String str22222222222222222222222222222222222222222222222222222222222222222222222222222222 = str;
                l03 = catalogBlockDto.l0();
                List<CatalogGroupCategoryMetaItemDto> N02222222222222222222222222222222222222222222222222222222222222222222222222222222 = catalogBlockDto.N0();
                t2a t2aVar2222222222222222222222222222222222222222222222222222222222222222222222222222222 = new t2a();
                if (l03 != CatalogBlockDataTypeDto.GROUPS_CATEGORY_ITEMS) {
                }
                LinkedHashMap linkedHashMap112222222222222222222222222222222222222222222222222222222222222222222222222222222 = linkedHashMap5;
                l04 = catalogBlockDto.l0();
                List<CatalogMiniAppContentItemDto> E12222222222222222222222222222222222222222222222222222222222222222222222222222222 = catalogBlockDto.E1();
                if (l04 == CatalogBlockDataTypeDto.MINI_APPS_CONTENT) {
                }
                LinkedHashMap linkedHashMap122222222222222222222222222222222222222222222222222222222222222222222222222222222 = linkedHashMap6;
                i4 = a.$EnumSwitchMapping$0[catalogBlockDto.l0().ordinal()];
                if (i4 != 10) {
                }
                P0 = catalogBlockDto.P0();
                if (P0 == null) {
                }
                if (r1 == 0) {
                }
                arrayList2 = new ArrayList((Collection) r1);
                if (arrayList2 == null) {
                }
                ArrayList arrayList42222222222222222222222222222222222222222222222222222222222222222222222222222222 = arrayList2;
                T = catalogBlockDto.T();
                if (T == null) {
                }
                if (map == null) {
                }
                LinkedHashMap linkedHashMap132222222222222222222222222222222222222222222222222222222222222222222222222222222 = new LinkedHashMap(map);
                CatalogBlockDataTypeDto l072222222222222222222222222222222222222222222222222222222222222222222222222222222 = catalogBlockDto.l0();
                M = catalogBlockDto.M();
                LinkedHashMap linkedHashMap142222222222222222222222222222222222222222222222222222222222222222222222222222222 = new LinkedHashMap();
                if (M != null) {
                }
                return new CatalogBlockItemsData(a32222222222222222222222222222222222222222222222222222222222222222222222222222222, arrayList32222222222222222222222222222222222222222222222222222222222222222222222222222222, linkedHashMap, linkedHashMap3, linkedHashMap4, linkedHashMap92222222222222222222222222222222222222222222222222222222222222222222222222222222, linkedHashMap112222222222222222222222222222222222222222222222222222222222222222222222222222222, linkedHashMap122222222222222222222222222222222222222222222222222222222222222222222222222222222, arrayList42222222222222222222222222222222222222222222222222222222222222222222222222222222, linkedHashMap132222222222222222222222222222222222222222222222222222222222222222222222222222222, null, linkedHashMap142222222222222222222222222222222222222222222222222222222222222222222222222222222, 1024, null);
            case 67:
                i2 = catalogBlockDto.W1();
                if (i2 == null) {
                }
                CatalogDataType a322222222222222222222222222222222222222222222222222222222222222222222222222222222 = a4a.a(catalogBlockDto.l0());
                ArrayList arrayList322222222222222222222222222222222222222222222222222222222222222222222222222222222 = new ArrayList(i2);
                CatalogBlockDataTypeDto l0522222222222222222222222222222222222222222222222222222222222222222222222222222222 = catalogBlockDto.l0();
                V0 = catalogBlockDto.V0();
                i = a.$EnumSwitchMapping$0[l0522222222222222222222222222222222222222222222222222222222222222222222222222222222.ordinal()];
                if (i != 10) {
                }
                LinkedHashMap linkedHashMap722222222222222222222222222222222222222222222222222222222222222222222222222222222 = new LinkedHashMap();
                it = V0.iterator();
                while (it.hasNext()) {
                }
                linkedHashMap = new LinkedHashMap(linkedHashMap722222222222222222222222222222222222222222222222222222222222222222222222222222222);
                if (linkedHashMap == null) {
                }
                CatalogBlockDataTypeDto l0622222222222222222222222222222222222222222222222222222222222222222222222222222222 = catalogBlockDto.l0();
                w0 = catalogBlockDto.w0();
                hpu hpuVar22222222222222222222222222222222222222222222222222222222222222222222222222222222 = new hpu();
                i3 = a.$EnumSwitchMapping$0[l0622222222222222222222222222222222222222222222222222222222222222222222222222222222.ordinal()];
                if (i3 != 15) {
                }
                a2a a2aVar22222222222222222222222222222222222222222222222222222222222222222222222222222222 = new a2a(1, hpuVar22222222222222222222222222222222222222222222222222222222222222222222222222222222, hpu.class, "map", "map(Lcom/vk/api/generated/catalog/dto/CatalogEntityGroupsItemDto;)Lcom/vk/dto/group/GroupsEntityCatalogItem;", 0, 0);
                LinkedHashMap linkedHashMap822222222222222222222222222222222222222222222222222222222222222222222222222222222 = new LinkedHashMap();
                it2 = w0.iterator();
                while (it2.hasNext()) {
                }
                linkedHashMap2 = new LinkedHashMap(linkedHashMap822222222222222222222222222222222222222222222222222222222222222222222222222222222);
                if (linkedHashMap2 == null) {
                }
                LinkedHashMap linkedHashMap922222222222222222222222222222222222222222222222222222222222222222222222222222222 = linkedHashMap2;
                l0 = catalogBlockDto.l0();
                List<CatalogSearchAuthorItemDto> y222222222222222222222222222222222222222222222222222222222222222222222222222222222 = catalogBlockDto.y2();
                if (l0 == CatalogBlockDataTypeDto.SEARCH_AUTHORS) {
                }
                l02 = catalogBlockDto.l0();
                List<CatalogGameItemDto> H022222222222222222222222222222222222222222222222222222222222222222222222222222222 = catalogBlockDto.H0();
                if (l02 == CatalogBlockDataTypeDto.GAMES) {
                }
                String str222222222222222222222222222222222222222222222222222222222222222222222222222222222 = str;
                l03 = catalogBlockDto.l0();
                List<CatalogGroupCategoryMetaItemDto> N022222222222222222222222222222222222222222222222222222222222222222222222222222222 = catalogBlockDto.N0();
                t2a t2aVar22222222222222222222222222222222222222222222222222222222222222222222222222222222 = new t2a();
                if (l03 != CatalogBlockDataTypeDto.GROUPS_CATEGORY_ITEMS) {
                }
                LinkedHashMap linkedHashMap1122222222222222222222222222222222222222222222222222222222222222222222222222222222 = linkedHashMap5;
                l04 = catalogBlockDto.l0();
                List<CatalogMiniAppContentItemDto> E122222222222222222222222222222222222222222222222222222222222222222222222222222222 = catalogBlockDto.E1();
                if (l04 == CatalogBlockDataTypeDto.MINI_APPS_CONTENT) {
                }
                LinkedHashMap linkedHashMap1222222222222222222222222222222222222222222222222222222222222222222222222222222222 = linkedHashMap6;
                i4 = a.$EnumSwitchMapping$0[catalogBlockDto.l0().ordinal()];
                if (i4 != 10) {
                }
                P0 = catalogBlockDto.P0();
                if (P0 == null) {
                }
                if (r1 == 0) {
                }
                arrayList2 = new ArrayList((Collection) r1);
                if (arrayList2 == null) {
                }
                ArrayList arrayList422222222222222222222222222222222222222222222222222222222222222222222222222222222 = arrayList2;
                T = catalogBlockDto.T();
                if (T == null) {
                }
                if (map == null) {
                }
                LinkedHashMap linkedHashMap1322222222222222222222222222222222222222222222222222222222222222222222222222222222 = new LinkedHashMap(map);
                CatalogBlockDataTypeDto l0722222222222222222222222222222222222222222222222222222222222222222222222222222222 = catalogBlockDto.l0();
                M = catalogBlockDto.M();
                LinkedHashMap linkedHashMap1422222222222222222222222222222222222222222222222222222222222222222222222222222222 = new LinkedHashMap();
                if (M != null) {
                }
                return new CatalogBlockItemsData(a322222222222222222222222222222222222222222222222222222222222222222222222222222222, arrayList322222222222222222222222222222222222222222222222222222222222222222222222222222222, linkedHashMap, linkedHashMap3, linkedHashMap4, linkedHashMap922222222222222222222222222222222222222222222222222222222222222222222222222222222, linkedHashMap1122222222222222222222222222222222222222222222222222222222222222222222222222222222, linkedHashMap1222222222222222222222222222222222222222222222222222222222222222222222222222222222, arrayList422222222222222222222222222222222222222222222222222222222222222222222222222222222, linkedHashMap1322222222222222222222222222222222222222222222222222222222222222222222222222222222, null, linkedHashMap1422222222222222222222222222222222222222222222222222222222222222222222222222222222, 1024, null);
            case 68:
                i2 = catalogBlockDto.G();
                if (i2 == null) {
                }
                CatalogDataType a3222222222222222222222222222222222222222222222222222222222222222222222222222222222 = a4a.a(catalogBlockDto.l0());
                ArrayList arrayList3222222222222222222222222222222222222222222222222222222222222222222222222222222222 = new ArrayList(i2);
                CatalogBlockDataTypeDto l05222222222222222222222222222222222222222222222222222222222222222222222222222222222 = catalogBlockDto.l0();
                V0 = catalogBlockDto.V0();
                i = a.$EnumSwitchMapping$0[l05222222222222222222222222222222222222222222222222222222222222222222222222222222222.ordinal()];
                if (i != 10) {
                }
                LinkedHashMap linkedHashMap7222222222222222222222222222222222222222222222222222222222222222222222222222222222 = new LinkedHashMap();
                it = V0.iterator();
                while (it.hasNext()) {
                }
                linkedHashMap = new LinkedHashMap(linkedHashMap7222222222222222222222222222222222222222222222222222222222222222222222222222222222);
                if (linkedHashMap == null) {
                }
                CatalogBlockDataTypeDto l06222222222222222222222222222222222222222222222222222222222222222222222222222222222 = catalogBlockDto.l0();
                w0 = catalogBlockDto.w0();
                hpu hpuVar222222222222222222222222222222222222222222222222222222222222222222222222222222222 = new hpu();
                i3 = a.$EnumSwitchMapping$0[l06222222222222222222222222222222222222222222222222222222222222222222222222222222222.ordinal()];
                if (i3 != 15) {
                }
                a2a a2aVar222222222222222222222222222222222222222222222222222222222222222222222222222222222 = new a2a(1, hpuVar222222222222222222222222222222222222222222222222222222222222222222222222222222222, hpu.class, "map", "map(Lcom/vk/api/generated/catalog/dto/CatalogEntityGroupsItemDto;)Lcom/vk/dto/group/GroupsEntityCatalogItem;", 0, 0);
                LinkedHashMap linkedHashMap8222222222222222222222222222222222222222222222222222222222222222222222222222222222 = new LinkedHashMap();
                it2 = w0.iterator();
                while (it2.hasNext()) {
                }
                linkedHashMap2 = new LinkedHashMap(linkedHashMap8222222222222222222222222222222222222222222222222222222222222222222222222222222222);
                if (linkedHashMap2 == null) {
                }
                LinkedHashMap linkedHashMap9222222222222222222222222222222222222222222222222222222222222222222222222222222222 = linkedHashMap2;
                l0 = catalogBlockDto.l0();
                List<CatalogSearchAuthorItemDto> y2222222222222222222222222222222222222222222222222222222222222222222222222222222222 = catalogBlockDto.y2();
                if (l0 == CatalogBlockDataTypeDto.SEARCH_AUTHORS) {
                }
                l02 = catalogBlockDto.l0();
                List<CatalogGameItemDto> H0222222222222222222222222222222222222222222222222222222222222222222222222222222222 = catalogBlockDto.H0();
                if (l02 == CatalogBlockDataTypeDto.GAMES) {
                }
                String str2222222222222222222222222222222222222222222222222222222222222222222222222222222222 = str;
                l03 = catalogBlockDto.l0();
                List<CatalogGroupCategoryMetaItemDto> N0222222222222222222222222222222222222222222222222222222222222222222222222222222222 = catalogBlockDto.N0();
                t2a t2aVar222222222222222222222222222222222222222222222222222222222222222222222222222222222 = new t2a();
                if (l03 != CatalogBlockDataTypeDto.GROUPS_CATEGORY_ITEMS) {
                }
                LinkedHashMap linkedHashMap11222222222222222222222222222222222222222222222222222222222222222222222222222222222 = linkedHashMap5;
                l04 = catalogBlockDto.l0();
                List<CatalogMiniAppContentItemDto> E1222222222222222222222222222222222222222222222222222222222222222222222222222222222 = catalogBlockDto.E1();
                if (l04 == CatalogBlockDataTypeDto.MINI_APPS_CONTENT) {
                }
                LinkedHashMap linkedHashMap12222222222222222222222222222222222222222222222222222222222222222222222222222222222 = linkedHashMap6;
                i4 = a.$EnumSwitchMapping$0[catalogBlockDto.l0().ordinal()];
                if (i4 != 10) {
                }
                P0 = catalogBlockDto.P0();
                if (P0 == null) {
                }
                if (r1 == 0) {
                }
                arrayList2 = new ArrayList((Collection) r1);
                if (arrayList2 == null) {
                }
                ArrayList arrayList4222222222222222222222222222222222222222222222222222222222222222222222222222222222 = arrayList2;
                T = catalogBlockDto.T();
                if (T == null) {
                }
                if (map == null) {
                }
                LinkedHashMap linkedHashMap13222222222222222222222222222222222222222222222222222222222222222222222222222222222 = new LinkedHashMap(map);
                CatalogBlockDataTypeDto l07222222222222222222222222222222222222222222222222222222222222222222222222222222222 = catalogBlockDto.l0();
                M = catalogBlockDto.M();
                LinkedHashMap linkedHashMap14222222222222222222222222222222222222222222222222222222222222222222222222222222222 = new LinkedHashMap();
                if (M != null) {
                }
                return new CatalogBlockItemsData(a3222222222222222222222222222222222222222222222222222222222222222222222222222222222, arrayList3222222222222222222222222222222222222222222222222222222222222222222222222222222222, linkedHashMap, linkedHashMap3, linkedHashMap4, linkedHashMap9222222222222222222222222222222222222222222222222222222222222222222222222222222222, linkedHashMap11222222222222222222222222222222222222222222222222222222222222222222222222222222222, linkedHashMap12222222222222222222222222222222222222222222222222222222222222222222222222222222222, arrayList4222222222222222222222222222222222222222222222222222222222222222222222222222222222, linkedHashMap13222222222222222222222222222222222222222222222222222222222222222222222222222222222, null, linkedHashMap14222222222222222222222222222222222222222222222222222222222222222222222222222222222, 1024, null);
            case 69:
                i2 = catalogBlockDto.D0();
                if (i2 == null) {
                }
                CatalogDataType a32222222222222222222222222222222222222222222222222222222222222222222222222222222222 = a4a.a(catalogBlockDto.l0());
                ArrayList arrayList32222222222222222222222222222222222222222222222222222222222222222222222222222222222 = new ArrayList(i2);
                CatalogBlockDataTypeDto l052222222222222222222222222222222222222222222222222222222222222222222222222222222222 = catalogBlockDto.l0();
                V0 = catalogBlockDto.V0();
                i = a.$EnumSwitchMapping$0[l052222222222222222222222222222222222222222222222222222222222222222222222222222222222.ordinal()];
                if (i != 10) {
                }
                LinkedHashMap linkedHashMap72222222222222222222222222222222222222222222222222222222222222222222222222222222222 = new LinkedHashMap();
                it = V0.iterator();
                while (it.hasNext()) {
                }
                linkedHashMap = new LinkedHashMap(linkedHashMap72222222222222222222222222222222222222222222222222222222222222222222222222222222222);
                if (linkedHashMap == null) {
                }
                CatalogBlockDataTypeDto l062222222222222222222222222222222222222222222222222222222222222222222222222222222222 = catalogBlockDto.l0();
                w0 = catalogBlockDto.w0();
                hpu hpuVar2222222222222222222222222222222222222222222222222222222222222222222222222222222222 = new hpu();
                i3 = a.$EnumSwitchMapping$0[l062222222222222222222222222222222222222222222222222222222222222222222222222222222222.ordinal()];
                if (i3 != 15) {
                }
                a2a a2aVar2222222222222222222222222222222222222222222222222222222222222222222222222222222222 = new a2a(1, hpuVar2222222222222222222222222222222222222222222222222222222222222222222222222222222222, hpu.class, "map", "map(Lcom/vk/api/generated/catalog/dto/CatalogEntityGroupsItemDto;)Lcom/vk/dto/group/GroupsEntityCatalogItem;", 0, 0);
                LinkedHashMap linkedHashMap82222222222222222222222222222222222222222222222222222222222222222222222222222222222 = new LinkedHashMap();
                it2 = w0.iterator();
                while (it2.hasNext()) {
                }
                linkedHashMap2 = new LinkedHashMap(linkedHashMap82222222222222222222222222222222222222222222222222222222222222222222222222222222222);
                if (linkedHashMap2 == null) {
                }
                LinkedHashMap linkedHashMap92222222222222222222222222222222222222222222222222222222222222222222222222222222222 = linkedHashMap2;
                l0 = catalogBlockDto.l0();
                List<CatalogSearchAuthorItemDto> y22222222222222222222222222222222222222222222222222222222222222222222222222222222222 = catalogBlockDto.y2();
                if (l0 == CatalogBlockDataTypeDto.SEARCH_AUTHORS) {
                }
                l02 = catalogBlockDto.l0();
                List<CatalogGameItemDto> H02222222222222222222222222222222222222222222222222222222222222222222222222222222222 = catalogBlockDto.H0();
                if (l02 == CatalogBlockDataTypeDto.GAMES) {
                }
                String str22222222222222222222222222222222222222222222222222222222222222222222222222222222222 = str;
                l03 = catalogBlockDto.l0();
                List<CatalogGroupCategoryMetaItemDto> N02222222222222222222222222222222222222222222222222222222222222222222222222222222222 = catalogBlockDto.N0();
                t2a t2aVar2222222222222222222222222222222222222222222222222222222222222222222222222222222222 = new t2a();
                if (l03 != CatalogBlockDataTypeDto.GROUPS_CATEGORY_ITEMS) {
                }
                LinkedHashMap linkedHashMap112222222222222222222222222222222222222222222222222222222222222222222222222222222222 = linkedHashMap5;
                l04 = catalogBlockDto.l0();
                List<CatalogMiniAppContentItemDto> E12222222222222222222222222222222222222222222222222222222222222222222222222222222222 = catalogBlockDto.E1();
                if (l04 == CatalogBlockDataTypeDto.MINI_APPS_CONTENT) {
                }
                LinkedHashMap linkedHashMap122222222222222222222222222222222222222222222222222222222222222222222222222222222222 = linkedHashMap6;
                i4 = a.$EnumSwitchMapping$0[catalogBlockDto.l0().ordinal()];
                if (i4 != 10) {
                }
                P0 = catalogBlockDto.P0();
                if (P0 == null) {
                }
                if (r1 == 0) {
                }
                arrayList2 = new ArrayList((Collection) r1);
                if (arrayList2 == null) {
                }
                ArrayList arrayList42222222222222222222222222222222222222222222222222222222222222222222222222222222222 = arrayList2;
                T = catalogBlockDto.T();
                if (T == null) {
                }
                if (map == null) {
                }
                LinkedHashMap linkedHashMap132222222222222222222222222222222222222222222222222222222222222222222222222222222222 = new LinkedHashMap(map);
                CatalogBlockDataTypeDto l072222222222222222222222222222222222222222222222222222222222222222222222222222222222 = catalogBlockDto.l0();
                M = catalogBlockDto.M();
                LinkedHashMap linkedHashMap142222222222222222222222222222222222222222222222222222222222222222222222222222222222 = new LinkedHashMap();
                if (M != null) {
                }
                return new CatalogBlockItemsData(a32222222222222222222222222222222222222222222222222222222222222222222222222222222222, arrayList32222222222222222222222222222222222222222222222222222222222222222222222222222222222, linkedHashMap, linkedHashMap3, linkedHashMap4, linkedHashMap92222222222222222222222222222222222222222222222222222222222222222222222222222222222, linkedHashMap112222222222222222222222222222222222222222222222222222222222222222222222222222222222, linkedHashMap122222222222222222222222222222222222222222222222222222222222222222222222222222222222, arrayList42222222222222222222222222222222222222222222222222222222222222222222222222222222222, linkedHashMap132222222222222222222222222222222222222222222222222222222222222222222222222222222222, null, linkedHashMap142222222222222222222222222222222222222222222222222222222222222222222222222222222222, 1024, null);
            case 70:
                i2 = catalogBlockDto.W2();
                if (i2 == null) {
                }
                CatalogDataType a322222222222222222222222222222222222222222222222222222222222222222222222222222222222 = a4a.a(catalogBlockDto.l0());
                ArrayList arrayList322222222222222222222222222222222222222222222222222222222222222222222222222222222222 = new ArrayList(i2);
                CatalogBlockDataTypeDto l0522222222222222222222222222222222222222222222222222222222222222222222222222222222222 = catalogBlockDto.l0();
                V0 = catalogBlockDto.V0();
                i = a.$EnumSwitchMapping$0[l0522222222222222222222222222222222222222222222222222222222222222222222222222222222222.ordinal()];
                if (i != 10) {
                }
                LinkedHashMap linkedHashMap722222222222222222222222222222222222222222222222222222222222222222222222222222222222 = new LinkedHashMap();
                it = V0.iterator();
                while (it.hasNext()) {
                }
                linkedHashMap = new LinkedHashMap(linkedHashMap722222222222222222222222222222222222222222222222222222222222222222222222222222222222);
                if (linkedHashMap == null) {
                }
                CatalogBlockDataTypeDto l0622222222222222222222222222222222222222222222222222222222222222222222222222222222222 = catalogBlockDto.l0();
                w0 = catalogBlockDto.w0();
                hpu hpuVar22222222222222222222222222222222222222222222222222222222222222222222222222222222222 = new hpu();
                i3 = a.$EnumSwitchMapping$0[l0622222222222222222222222222222222222222222222222222222222222222222222222222222222222.ordinal()];
                if (i3 != 15) {
                }
                a2a a2aVar22222222222222222222222222222222222222222222222222222222222222222222222222222222222 = new a2a(1, hpuVar22222222222222222222222222222222222222222222222222222222222222222222222222222222222, hpu.class, "map", "map(Lcom/vk/api/generated/catalog/dto/CatalogEntityGroupsItemDto;)Lcom/vk/dto/group/GroupsEntityCatalogItem;", 0, 0);
                LinkedHashMap linkedHashMap822222222222222222222222222222222222222222222222222222222222222222222222222222222222 = new LinkedHashMap();
                it2 = w0.iterator();
                while (it2.hasNext()) {
                }
                linkedHashMap2 = new LinkedHashMap(linkedHashMap822222222222222222222222222222222222222222222222222222222222222222222222222222222222);
                if (linkedHashMap2 == null) {
                }
                LinkedHashMap linkedHashMap922222222222222222222222222222222222222222222222222222222222222222222222222222222222 = linkedHashMap2;
                l0 = catalogBlockDto.l0();
                List<CatalogSearchAuthorItemDto> y222222222222222222222222222222222222222222222222222222222222222222222222222222222222 = catalogBlockDto.y2();
                if (l0 == CatalogBlockDataTypeDto.SEARCH_AUTHORS) {
                }
                l02 = catalogBlockDto.l0();
                List<CatalogGameItemDto> H022222222222222222222222222222222222222222222222222222222222222222222222222222222222 = catalogBlockDto.H0();
                if (l02 == CatalogBlockDataTypeDto.GAMES) {
                }
                String str222222222222222222222222222222222222222222222222222222222222222222222222222222222222 = str;
                l03 = catalogBlockDto.l0();
                List<CatalogGroupCategoryMetaItemDto> N022222222222222222222222222222222222222222222222222222222222222222222222222222222222 = catalogBlockDto.N0();
                t2a t2aVar22222222222222222222222222222222222222222222222222222222222222222222222222222222222 = new t2a();
                if (l03 != CatalogBlockDataTypeDto.GROUPS_CATEGORY_ITEMS) {
                }
                LinkedHashMap linkedHashMap1122222222222222222222222222222222222222222222222222222222222222222222222222222222222 = linkedHashMap5;
                l04 = catalogBlockDto.l0();
                List<CatalogMiniAppContentItemDto> E122222222222222222222222222222222222222222222222222222222222222222222222222222222222 = catalogBlockDto.E1();
                if (l04 == CatalogBlockDataTypeDto.MINI_APPS_CONTENT) {
                }
                LinkedHashMap linkedHashMap1222222222222222222222222222222222222222222222222222222222222222222222222222222222222 = linkedHashMap6;
                i4 = a.$EnumSwitchMapping$0[catalogBlockDto.l0().ordinal()];
                if (i4 != 10) {
                }
                P0 = catalogBlockDto.P0();
                if (P0 == null) {
                }
                if (r1 == 0) {
                }
                arrayList2 = new ArrayList((Collection) r1);
                if (arrayList2 == null) {
                }
                ArrayList arrayList422222222222222222222222222222222222222222222222222222222222222222222222222222222222 = arrayList2;
                T = catalogBlockDto.T();
                if (T == null) {
                }
                if (map == null) {
                }
                LinkedHashMap linkedHashMap1322222222222222222222222222222222222222222222222222222222222222222222222222222222222 = new LinkedHashMap(map);
                CatalogBlockDataTypeDto l0722222222222222222222222222222222222222222222222222222222222222222222222222222222222 = catalogBlockDto.l0();
                M = catalogBlockDto.M();
                LinkedHashMap linkedHashMap1422222222222222222222222222222222222222222222222222222222222222222222222222222222222 = new LinkedHashMap();
                if (M != null) {
                }
                return new CatalogBlockItemsData(a322222222222222222222222222222222222222222222222222222222222222222222222222222222222, arrayList322222222222222222222222222222222222222222222222222222222222222222222222222222222222, linkedHashMap, linkedHashMap3, linkedHashMap4, linkedHashMap922222222222222222222222222222222222222222222222222222222222222222222222222222222222, linkedHashMap1122222222222222222222222222222222222222222222222222222222222222222222222222222222222, linkedHashMap1222222222222222222222222222222222222222222222222222222222222222222222222222222222222, arrayList422222222222222222222222222222222222222222222222222222222222222222222222222222222222, linkedHashMap1322222222222222222222222222222222222222222222222222222222222222222222222222222222222, null, linkedHashMap1422222222222222222222222222222222222222222222222222222222222222222222222222222222222, 1024, null);
            case 71:
                i2 = catalogBlockDto.L2();
                if (i2 == null) {
                }
                CatalogDataType a3222222222222222222222222222222222222222222222222222222222222222222222222222222222222 = a4a.a(catalogBlockDto.l0());
                ArrayList arrayList3222222222222222222222222222222222222222222222222222222222222222222222222222222222222 = new ArrayList(i2);
                CatalogBlockDataTypeDto l05222222222222222222222222222222222222222222222222222222222222222222222222222222222222 = catalogBlockDto.l0();
                V0 = catalogBlockDto.V0();
                i = a.$EnumSwitchMapping$0[l05222222222222222222222222222222222222222222222222222222222222222222222222222222222222.ordinal()];
                if (i != 10) {
                }
                LinkedHashMap linkedHashMap7222222222222222222222222222222222222222222222222222222222222222222222222222222222222 = new LinkedHashMap();
                it = V0.iterator();
                while (it.hasNext()) {
                }
                linkedHashMap = new LinkedHashMap(linkedHashMap7222222222222222222222222222222222222222222222222222222222222222222222222222222222222);
                if (linkedHashMap == null) {
                }
                CatalogBlockDataTypeDto l06222222222222222222222222222222222222222222222222222222222222222222222222222222222222 = catalogBlockDto.l0();
                w0 = catalogBlockDto.w0();
                hpu hpuVar222222222222222222222222222222222222222222222222222222222222222222222222222222222222 = new hpu();
                i3 = a.$EnumSwitchMapping$0[l06222222222222222222222222222222222222222222222222222222222222222222222222222222222222.ordinal()];
                if (i3 != 15) {
                }
                a2a a2aVar222222222222222222222222222222222222222222222222222222222222222222222222222222222222 = new a2a(1, hpuVar222222222222222222222222222222222222222222222222222222222222222222222222222222222222, hpu.class, "map", "map(Lcom/vk/api/generated/catalog/dto/CatalogEntityGroupsItemDto;)Lcom/vk/dto/group/GroupsEntityCatalogItem;", 0, 0);
                LinkedHashMap linkedHashMap8222222222222222222222222222222222222222222222222222222222222222222222222222222222222 = new LinkedHashMap();
                it2 = w0.iterator();
                while (it2.hasNext()) {
                }
                linkedHashMap2 = new LinkedHashMap(linkedHashMap8222222222222222222222222222222222222222222222222222222222222222222222222222222222222);
                if (linkedHashMap2 == null) {
                }
                LinkedHashMap linkedHashMap9222222222222222222222222222222222222222222222222222222222222222222222222222222222222 = linkedHashMap2;
                l0 = catalogBlockDto.l0();
                List<CatalogSearchAuthorItemDto> y2222222222222222222222222222222222222222222222222222222222222222222222222222222222222 = catalogBlockDto.y2();
                if (l0 == CatalogBlockDataTypeDto.SEARCH_AUTHORS) {
                }
                l02 = catalogBlockDto.l0();
                List<CatalogGameItemDto> H0222222222222222222222222222222222222222222222222222222222222222222222222222222222222 = catalogBlockDto.H0();
                if (l02 == CatalogBlockDataTypeDto.GAMES) {
                }
                String str2222222222222222222222222222222222222222222222222222222222222222222222222222222222222 = str;
                l03 = catalogBlockDto.l0();
                List<CatalogGroupCategoryMetaItemDto> N0222222222222222222222222222222222222222222222222222222222222222222222222222222222222 = catalogBlockDto.N0();
                t2a t2aVar222222222222222222222222222222222222222222222222222222222222222222222222222222222222 = new t2a();
                if (l03 != CatalogBlockDataTypeDto.GROUPS_CATEGORY_ITEMS) {
                }
                LinkedHashMap linkedHashMap11222222222222222222222222222222222222222222222222222222222222222222222222222222222222 = linkedHashMap5;
                l04 = catalogBlockDto.l0();
                List<CatalogMiniAppContentItemDto> E1222222222222222222222222222222222222222222222222222222222222222222222222222222222222 = catalogBlockDto.E1();
                if (l04 == CatalogBlockDataTypeDto.MINI_APPS_CONTENT) {
                }
                LinkedHashMap linkedHashMap12222222222222222222222222222222222222222222222222222222222222222222222222222222222222 = linkedHashMap6;
                i4 = a.$EnumSwitchMapping$0[catalogBlockDto.l0().ordinal()];
                if (i4 != 10) {
                }
                P0 = catalogBlockDto.P0();
                if (P0 == null) {
                }
                if (r1 == 0) {
                }
                arrayList2 = new ArrayList((Collection) r1);
                if (arrayList2 == null) {
                }
                ArrayList arrayList4222222222222222222222222222222222222222222222222222222222222222222222222222222222222 = arrayList2;
                T = catalogBlockDto.T();
                if (T == null) {
                }
                if (map == null) {
                }
                LinkedHashMap linkedHashMap13222222222222222222222222222222222222222222222222222222222222222222222222222222222222 = new LinkedHashMap(map);
                CatalogBlockDataTypeDto l07222222222222222222222222222222222222222222222222222222222222222222222222222222222222 = catalogBlockDto.l0();
                M = catalogBlockDto.M();
                LinkedHashMap linkedHashMap14222222222222222222222222222222222222222222222222222222222222222222222222222222222222 = new LinkedHashMap();
                if (M != null) {
                }
                return new CatalogBlockItemsData(a3222222222222222222222222222222222222222222222222222222222222222222222222222222222222, arrayList3222222222222222222222222222222222222222222222222222222222222222222222222222222222222, linkedHashMap, linkedHashMap3, linkedHashMap4, linkedHashMap9222222222222222222222222222222222222222222222222222222222222222222222222222222222222, linkedHashMap11222222222222222222222222222222222222222222222222222222222222222222222222222222222222, linkedHashMap12222222222222222222222222222222222222222222222222222222222222222222222222222222222222, arrayList4222222222222222222222222222222222222222222222222222222222222222222222222222222222222, linkedHashMap13222222222222222222222222222222222222222222222222222222222222222222222222222222222222, null, linkedHashMap14222222222222222222222222222222222222222222222222222222222222222222222222222222222222, 1024, null);
            case 72:
                i2 = catalogBlockDto.V2();
                if (i2 == null) {
                }
                CatalogDataType a32222222222222222222222222222222222222222222222222222222222222222222222222222222222222 = a4a.a(catalogBlockDto.l0());
                ArrayList arrayList32222222222222222222222222222222222222222222222222222222222222222222222222222222222222 = new ArrayList(i2);
                CatalogBlockDataTypeDto l052222222222222222222222222222222222222222222222222222222222222222222222222222222222222 = catalogBlockDto.l0();
                V0 = catalogBlockDto.V0();
                i = a.$EnumSwitchMapping$0[l052222222222222222222222222222222222222222222222222222222222222222222222222222222222222.ordinal()];
                if (i != 10) {
                }
                LinkedHashMap linkedHashMap72222222222222222222222222222222222222222222222222222222222222222222222222222222222222 = new LinkedHashMap();
                it = V0.iterator();
                while (it.hasNext()) {
                }
                linkedHashMap = new LinkedHashMap(linkedHashMap72222222222222222222222222222222222222222222222222222222222222222222222222222222222222);
                if (linkedHashMap == null) {
                }
                CatalogBlockDataTypeDto l062222222222222222222222222222222222222222222222222222222222222222222222222222222222222 = catalogBlockDto.l0();
                w0 = catalogBlockDto.w0();
                hpu hpuVar2222222222222222222222222222222222222222222222222222222222222222222222222222222222222 = new hpu();
                i3 = a.$EnumSwitchMapping$0[l062222222222222222222222222222222222222222222222222222222222222222222222222222222222222.ordinal()];
                if (i3 != 15) {
                }
                a2a a2aVar2222222222222222222222222222222222222222222222222222222222222222222222222222222222222 = new a2a(1, hpuVar2222222222222222222222222222222222222222222222222222222222222222222222222222222222222, hpu.class, "map", "map(Lcom/vk/api/generated/catalog/dto/CatalogEntityGroupsItemDto;)Lcom/vk/dto/group/GroupsEntityCatalogItem;", 0, 0);
                LinkedHashMap linkedHashMap82222222222222222222222222222222222222222222222222222222222222222222222222222222222222 = new LinkedHashMap();
                it2 = w0.iterator();
                while (it2.hasNext()) {
                }
                linkedHashMap2 = new LinkedHashMap(linkedHashMap82222222222222222222222222222222222222222222222222222222222222222222222222222222222222);
                if (linkedHashMap2 == null) {
                }
                LinkedHashMap linkedHashMap92222222222222222222222222222222222222222222222222222222222222222222222222222222222222 = linkedHashMap2;
                l0 = catalogBlockDto.l0();
                List<CatalogSearchAuthorItemDto> y22222222222222222222222222222222222222222222222222222222222222222222222222222222222222 = catalogBlockDto.y2();
                if (l0 == CatalogBlockDataTypeDto.SEARCH_AUTHORS) {
                }
                l02 = catalogBlockDto.l0();
                List<CatalogGameItemDto> H02222222222222222222222222222222222222222222222222222222222222222222222222222222222222 = catalogBlockDto.H0();
                if (l02 == CatalogBlockDataTypeDto.GAMES) {
                }
                String str22222222222222222222222222222222222222222222222222222222222222222222222222222222222222 = str;
                l03 = catalogBlockDto.l0();
                List<CatalogGroupCategoryMetaItemDto> N02222222222222222222222222222222222222222222222222222222222222222222222222222222222222 = catalogBlockDto.N0();
                t2a t2aVar2222222222222222222222222222222222222222222222222222222222222222222222222222222222222 = new t2a();
                if (l03 != CatalogBlockDataTypeDto.GROUPS_CATEGORY_ITEMS) {
                }
                LinkedHashMap linkedHashMap112222222222222222222222222222222222222222222222222222222222222222222222222222222222222 = linkedHashMap5;
                l04 = catalogBlockDto.l0();
                List<CatalogMiniAppContentItemDto> E12222222222222222222222222222222222222222222222222222222222222222222222222222222222222 = catalogBlockDto.E1();
                if (l04 == CatalogBlockDataTypeDto.MINI_APPS_CONTENT) {
                }
                LinkedHashMap linkedHashMap122222222222222222222222222222222222222222222222222222222222222222222222222222222222222 = linkedHashMap6;
                i4 = a.$EnumSwitchMapping$0[catalogBlockDto.l0().ordinal()];
                if (i4 != 10) {
                }
                P0 = catalogBlockDto.P0();
                if (P0 == null) {
                }
                if (r1 == 0) {
                }
                arrayList2 = new ArrayList((Collection) r1);
                if (arrayList2 == null) {
                }
                ArrayList arrayList42222222222222222222222222222222222222222222222222222222222222222222222222222222222222 = arrayList2;
                T = catalogBlockDto.T();
                if (T == null) {
                }
                if (map == null) {
                }
                LinkedHashMap linkedHashMap132222222222222222222222222222222222222222222222222222222222222222222222222222222222222 = new LinkedHashMap(map);
                CatalogBlockDataTypeDto l072222222222222222222222222222222222222222222222222222222222222222222222222222222222222 = catalogBlockDto.l0();
                M = catalogBlockDto.M();
                LinkedHashMap linkedHashMap142222222222222222222222222222222222222222222222222222222222222222222222222222222222222 = new LinkedHashMap();
                if (M != null) {
                }
                return new CatalogBlockItemsData(a32222222222222222222222222222222222222222222222222222222222222222222222222222222222222, arrayList32222222222222222222222222222222222222222222222222222222222222222222222222222222222222, linkedHashMap, linkedHashMap3, linkedHashMap4, linkedHashMap92222222222222222222222222222222222222222222222222222222222222222222222222222222222222, linkedHashMap112222222222222222222222222222222222222222222222222222222222222222222222222222222222222, linkedHashMap122222222222222222222222222222222222222222222222222222222222222222222222222222222222222, arrayList42222222222222222222222222222222222222222222222222222222222222222222222222222222222222, linkedHashMap132222222222222222222222222222222222222222222222222222222222222222222222222222222222222, null, linkedHashMap142222222222222222222222222222222222222222222222222222222222222222222222222222222222222, 1024, null);
            case TokenParametersOuterClass$TokenParameters.APPSETID_FIELD_NUMBER /* 73 */:
                i2 = null;
                if (i2 == null) {
                }
                CatalogDataType a322222222222222222222222222222222222222222222222222222222222222222222222222222222222222 = a4a.a(catalogBlockDto.l0());
                ArrayList arrayList322222222222222222222222222222222222222222222222222222222222222222222222222222222222222 = new ArrayList(i2);
                CatalogBlockDataTypeDto l0522222222222222222222222222222222222222222222222222222222222222222222222222222222222222 = catalogBlockDto.l0();
                V0 = catalogBlockDto.V0();
                i = a.$EnumSwitchMapping$0[l0522222222222222222222222222222222222222222222222222222222222222222222222222222222222222.ordinal()];
                if (i != 10) {
                }
                LinkedHashMap linkedHashMap722222222222222222222222222222222222222222222222222222222222222222222222222222222222222 = new LinkedHashMap();
                it = V0.iterator();
                while (it.hasNext()) {
                }
                linkedHashMap = new LinkedHashMap(linkedHashMap722222222222222222222222222222222222222222222222222222222222222222222222222222222222222);
                if (linkedHashMap == null) {
                }
                CatalogBlockDataTypeDto l0622222222222222222222222222222222222222222222222222222222222222222222222222222222222222 = catalogBlockDto.l0();
                w0 = catalogBlockDto.w0();
                hpu hpuVar22222222222222222222222222222222222222222222222222222222222222222222222222222222222222 = new hpu();
                i3 = a.$EnumSwitchMapping$0[l0622222222222222222222222222222222222222222222222222222222222222222222222222222222222222.ordinal()];
                if (i3 != 15) {
                }
                a2a a2aVar22222222222222222222222222222222222222222222222222222222222222222222222222222222222222 = new a2a(1, hpuVar22222222222222222222222222222222222222222222222222222222222222222222222222222222222222, hpu.class, "map", "map(Lcom/vk/api/generated/catalog/dto/CatalogEntityGroupsItemDto;)Lcom/vk/dto/group/GroupsEntityCatalogItem;", 0, 0);
                LinkedHashMap linkedHashMap822222222222222222222222222222222222222222222222222222222222222222222222222222222222222 = new LinkedHashMap();
                it2 = w0.iterator();
                while (it2.hasNext()) {
                }
                linkedHashMap2 = new LinkedHashMap(linkedHashMap822222222222222222222222222222222222222222222222222222222222222222222222222222222222222);
                if (linkedHashMap2 == null) {
                }
                LinkedHashMap linkedHashMap922222222222222222222222222222222222222222222222222222222222222222222222222222222222222 = linkedHashMap2;
                l0 = catalogBlockDto.l0();
                List<CatalogSearchAuthorItemDto> y222222222222222222222222222222222222222222222222222222222222222222222222222222222222222 = catalogBlockDto.y2();
                if (l0 == CatalogBlockDataTypeDto.SEARCH_AUTHORS) {
                }
                l02 = catalogBlockDto.l0();
                List<CatalogGameItemDto> H022222222222222222222222222222222222222222222222222222222222222222222222222222222222222 = catalogBlockDto.H0();
                if (l02 == CatalogBlockDataTypeDto.GAMES) {
                }
                String str222222222222222222222222222222222222222222222222222222222222222222222222222222222222222 = str;
                l03 = catalogBlockDto.l0();
                List<CatalogGroupCategoryMetaItemDto> N022222222222222222222222222222222222222222222222222222222222222222222222222222222222222 = catalogBlockDto.N0();
                t2a t2aVar22222222222222222222222222222222222222222222222222222222222222222222222222222222222222 = new t2a();
                if (l03 != CatalogBlockDataTypeDto.GROUPS_CATEGORY_ITEMS) {
                }
                LinkedHashMap linkedHashMap1122222222222222222222222222222222222222222222222222222222222222222222222222222222222222 = linkedHashMap5;
                l04 = catalogBlockDto.l0();
                List<CatalogMiniAppContentItemDto> E122222222222222222222222222222222222222222222222222222222222222222222222222222222222222 = catalogBlockDto.E1();
                if (l04 == CatalogBlockDataTypeDto.MINI_APPS_CONTENT) {
                }
                LinkedHashMap linkedHashMap1222222222222222222222222222222222222222222222222222222222222222222222222222222222222222 = linkedHashMap6;
                i4 = a.$EnumSwitchMapping$0[catalogBlockDto.l0().ordinal()];
                if (i4 != 10) {
                }
                P0 = catalogBlockDto.P0();
                if (P0 == null) {
                }
                if (r1 == 0) {
                }
                arrayList2 = new ArrayList((Collection) r1);
                if (arrayList2 == null) {
                }
                ArrayList arrayList422222222222222222222222222222222222222222222222222222222222222222222222222222222222222 = arrayList2;
                T = catalogBlockDto.T();
                if (T == null) {
                }
                if (map == null) {
                }
                LinkedHashMap linkedHashMap1322222222222222222222222222222222222222222222222222222222222222222222222222222222222222 = new LinkedHashMap(map);
                CatalogBlockDataTypeDto l0722222222222222222222222222222222222222222222222222222222222222222222222222222222222222 = catalogBlockDto.l0();
                M = catalogBlockDto.M();
                LinkedHashMap linkedHashMap1422222222222222222222222222222222222222222222222222222222222222222222222222222222222222 = new LinkedHashMap();
                if (M != null) {
                }
                return new CatalogBlockItemsData(a322222222222222222222222222222222222222222222222222222222222222222222222222222222222222, arrayList322222222222222222222222222222222222222222222222222222222222222222222222222222222222222, linkedHashMap, linkedHashMap3, linkedHashMap4, linkedHashMap922222222222222222222222222222222222222222222222222222222222222222222222222222222222222, linkedHashMap1122222222222222222222222222222222222222222222222222222222222222222222222222222222222222, linkedHashMap1222222222222222222222222222222222222222222222222222222222222222222222222222222222222222, arrayList422222222222222222222222222222222222222222222222222222222222222222222222222222222222222, linkedHashMap1322222222222222222222222222222222222222222222222222222222222222222222222222222222222222, null, linkedHashMap1422222222222222222222222222222222222222222222222222222222222222222222222222222222222222, 1024, null);
            default:
                L.i(new NoSuchElementException("Mapping of items ids is missed for " + catalogBlockDto.l0() + JwtParser.SEPARATOR_CHAR));
                i2 = null;
                if (i2 == null) {
                }
                CatalogDataType a3222222222222222222222222222222222222222222222222222222222222222222222222222222222222222 = a4a.a(catalogBlockDto.l0());
                ArrayList arrayList3222222222222222222222222222222222222222222222222222222222222222222222222222222222222222 = new ArrayList(i2);
                CatalogBlockDataTypeDto l05222222222222222222222222222222222222222222222222222222222222222222222222222222222222222 = catalogBlockDto.l0();
                V0 = catalogBlockDto.V0();
                i = a.$EnumSwitchMapping$0[l05222222222222222222222222222222222222222222222222222222222222222222222222222222222222222.ordinal()];
                if (i != 10) {
                }
                LinkedHashMap linkedHashMap7222222222222222222222222222222222222222222222222222222222222222222222222222222222222222 = new LinkedHashMap();
                it = V0.iterator();
                while (it.hasNext()) {
                }
                linkedHashMap = new LinkedHashMap(linkedHashMap7222222222222222222222222222222222222222222222222222222222222222222222222222222222222222);
                if (linkedHashMap == null) {
                }
                CatalogBlockDataTypeDto l06222222222222222222222222222222222222222222222222222222222222222222222222222222222222222 = catalogBlockDto.l0();
                w0 = catalogBlockDto.w0();
                hpu hpuVar222222222222222222222222222222222222222222222222222222222222222222222222222222222222222 = new hpu();
                i3 = a.$EnumSwitchMapping$0[l06222222222222222222222222222222222222222222222222222222222222222222222222222222222222222.ordinal()];
                if (i3 != 15) {
                }
                a2a a2aVar222222222222222222222222222222222222222222222222222222222222222222222222222222222222222 = new a2a(1, hpuVar222222222222222222222222222222222222222222222222222222222222222222222222222222222222222, hpu.class, "map", "map(Lcom/vk/api/generated/catalog/dto/CatalogEntityGroupsItemDto;)Lcom/vk/dto/group/GroupsEntityCatalogItem;", 0, 0);
                LinkedHashMap linkedHashMap8222222222222222222222222222222222222222222222222222222222222222222222222222222222222222 = new LinkedHashMap();
                it2 = w0.iterator();
                while (it2.hasNext()) {
                }
                linkedHashMap2 = new LinkedHashMap(linkedHashMap8222222222222222222222222222222222222222222222222222222222222222222222222222222222222222);
                if (linkedHashMap2 == null) {
                }
                LinkedHashMap linkedHashMap9222222222222222222222222222222222222222222222222222222222222222222222222222222222222222 = linkedHashMap2;
                l0 = catalogBlockDto.l0();
                List<CatalogSearchAuthorItemDto> y2222222222222222222222222222222222222222222222222222222222222222222222222222222222222222 = catalogBlockDto.y2();
                if (l0 == CatalogBlockDataTypeDto.SEARCH_AUTHORS) {
                }
                l02 = catalogBlockDto.l0();
                List<CatalogGameItemDto> H0222222222222222222222222222222222222222222222222222222222222222222222222222222222222222 = catalogBlockDto.H0();
                if (l02 == CatalogBlockDataTypeDto.GAMES) {
                }
                String str2222222222222222222222222222222222222222222222222222222222222222222222222222222222222222 = str;
                l03 = catalogBlockDto.l0();
                List<CatalogGroupCategoryMetaItemDto> N0222222222222222222222222222222222222222222222222222222222222222222222222222222222222222 = catalogBlockDto.N0();
                t2a t2aVar222222222222222222222222222222222222222222222222222222222222222222222222222222222222222 = new t2a();
                if (l03 != CatalogBlockDataTypeDto.GROUPS_CATEGORY_ITEMS) {
                }
                LinkedHashMap linkedHashMap11222222222222222222222222222222222222222222222222222222222222222222222222222222222222222 = linkedHashMap5;
                l04 = catalogBlockDto.l0();
                List<CatalogMiniAppContentItemDto> E1222222222222222222222222222222222222222222222222222222222222222222222222222222222222222 = catalogBlockDto.E1();
                if (l04 == CatalogBlockDataTypeDto.MINI_APPS_CONTENT) {
                }
                LinkedHashMap linkedHashMap12222222222222222222222222222222222222222222222222222222222222222222222222222222222222222 = linkedHashMap6;
                i4 = a.$EnumSwitchMapping$0[catalogBlockDto.l0().ordinal()];
                if (i4 != 10) {
                }
                P0 = catalogBlockDto.P0();
                if (P0 == null) {
                }
                if (r1 == 0) {
                }
                arrayList2 = new ArrayList((Collection) r1);
                if (arrayList2 == null) {
                }
                ArrayList arrayList4222222222222222222222222222222222222222222222222222222222222222222222222222222222222222 = arrayList2;
                T = catalogBlockDto.T();
                if (T == null) {
                }
                if (map == null) {
                }
                LinkedHashMap linkedHashMap13222222222222222222222222222222222222222222222222222222222222222222222222222222222222222 = new LinkedHashMap(map);
                CatalogBlockDataTypeDto l07222222222222222222222222222222222222222222222222222222222222222222222222222222222222222 = catalogBlockDto.l0();
                M = catalogBlockDto.M();
                LinkedHashMap linkedHashMap14222222222222222222222222222222222222222222222222222222222222222222222222222222222222222 = new LinkedHashMap();
                if (M != null) {
                }
                return new CatalogBlockItemsData(a3222222222222222222222222222222222222222222222222222222222222222222222222222222222222222, arrayList3222222222222222222222222222222222222222222222222222222222222222222222222222222222222222, linkedHashMap, linkedHashMap3, linkedHashMap4, linkedHashMap9222222222222222222222222222222222222222222222222222222222222222222222222222222222222222, linkedHashMap11222222222222222222222222222222222222222222222222222222222222222222222222222222222222222, linkedHashMap12222222222222222222222222222222222222222222222222222222222222222222222222222222222222222, arrayList4222222222222222222222222222222222222222222222222222222222222222222222222222222222222222, linkedHashMap13222222222222222222222222222222222222222222222222222222222222222222222222222222222222222, null, linkedHashMap14222222222222222222222222222222222222222222222222222222222222222222222222222222222222222, 1024, null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v22 */
    /* JADX WARN: Type inference failed for: r1v23 */
    /* JADX WARN: Type inference failed for: r1v24 */
    /* JADX WARN: Type inference failed for: r1v26, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r1v27, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v29 */
    /* JADX WARN: Type inference failed for: r1v30 */
    /* JADX WARN: Type inference failed for: r1v31 */
    /* JADX WARN: Type inference failed for: r1v33, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r1v34, types: [java.util.ArrayList] */
    public final CatalogBlock b(CatalogBlockDto catalogBlockDto, String str) {
        CatalogBadge catalogBadge;
        CatalogViewType catalogViewType;
        TopTitle topTitle;
        ArrayList arrayList;
        String str2;
        String str3;
        CatalogDataType catalogDataType;
        String str4;
        Map map;
        CatalogOnboardingInfo catalogOnboardingInfo;
        ArrayList arrayList2;
        List list;
        String str5;
        Iterator it;
        List list2;
        CatalogArtistInfo catalogArtistInfo;
        int i;
        Boolean g;
        CatalogShowAllInfoDto i2;
        String i3;
        String i4;
        t2a t2aVar = new t2a();
        String id = catalogBlockDto.getId();
        CatalogDataType a2 = a4a.a(catalogBlockDto.l0());
        String id2 = catalogBlockDto.getId();
        String V1 = catalogBlockDto.V1();
        String url = catalogBlockDto.getUrl();
        CatalogBadgeDto D = catalogBlockDto.D();
        String str6 = "";
        if (D != null) {
            String d = D.d();
            if (d == null) {
                d = "";
            }
            catalogBadge = new CatalogBadge(d, D.e().i());
        } else {
            catalogBadge = null;
        }
        CatalogLayoutDto n1 = catalogBlockDto.n1();
        if (!epx.f(n1.e(), Boolean.TRUE)) {
            CatalogLayoutDto.NameDto f = n1.f();
            switch (f != null ? z7a.$EnumSwitchMapping$0[f.ordinal()] : -1) {
                case -1:
                    catalogViewType = CatalogViewType.UNKNOWN;
                    break;
                case 0:
                default:
                    L.i(new NoSuchElementException("Mapping to CatalogViewType is missed for " + f + JwtParser.SEPARATOR_CHAR));
                    catalogViewType = CatalogViewType.UNKNOWN;
                    break;
                case 1:
                    catalogViewType = CatalogViewType.LIST;
                    break;
                case 2:
                    catalogViewType = CatalogViewType.SLIDER;
                    break;
                case 3:
                    catalogViewType = CatalogViewType.ARTIST_MERCH_SLIDER;
                    break;
                case 4:
                    catalogViewType = CatalogViewType.HEADER;
                    break;
                case 5:
                    catalogViewType = CatalogViewType.HEADER_COMPACT;
                    break;
                case 6:
                    catalogViewType = CatalogViewType.SEPARATOR;
                    break;
                case 7:
                    catalogViewType = CatalogViewType.PLACEHOLDER;
                    break;
                case 8:
                    catalogViewType = CatalogViewType.PLACEHOLDER_SMALL;
                    break;
                case 9:
                    catalogViewType = CatalogViewType.PLACEHOLDER_IMAGE_WARNING;
                    break;
                case 10:
                    catalogViewType = CatalogViewType.LIST_PICKER;
                    break;
                case 11:
                    catalogViewType = CatalogViewType.TRIPLE_STACKED_SLIDER;
                    break;
                case 12:
                    catalogViewType = CatalogViewType.BUTTONS_HORIZONTAL;
                    break;
                case 13:
                    catalogViewType = CatalogViewType.BANNER;
                    break;
                case 14:
                    catalogViewType = CatalogViewType.SMALL_BANNER_OFFER;
                    break;
                case 15:
                    catalogViewType = CatalogViewType.TRIPLE_STACKED_SLIDER_PICKER;
                    break;
                case 16:
                    catalogViewType = CatalogViewType.HEADER_EXTENDED;
                    break;
                case 17:
                    catalogViewType = CatalogViewType.PROMO_BANNERS_SLIDER;
                    break;
                case 18:
                    catalogViewType = CatalogViewType.STACKED_LIST;
                    break;
                case 19:
                    catalogViewType = CatalogViewType.PLACEHOLDER_ILLEGAL_QUERY;
                    break;
                case 20:
                    catalogViewType = CatalogViewType.LARGE_LIST;
                    break;
                case 21:
                    catalogViewType = CatalogViewType.SMALL_LIST;
                    break;
                case 22:
                    catalogViewType = CatalogViewType.COMPACT_LIST;
                    break;
                case 23:
                    catalogViewType = CatalogViewType.LARGE_SLIDER;
                    break;
                case 24:
                    catalogViewType = CatalogViewType.DOUBLE_STACKED_SLIDER;
                    break;
                case 25:
                    catalogViewType = CatalogViewType.MUSIC_CHART_TRIPLE_STACKED_SLIDER;
                    break;
                case 26:
                    catalogViewType = CatalogViewType.MUSIC_CHART_LIST;
                    break;
                case 27:
                    catalogViewType = CatalogViewType.GRID;
                    break;
                case 28:
                    catalogViewType = CatalogViewType.PREVIEW;
                    break;
                case 29:
                    catalogViewType = CatalogViewType.FEATURED_LIST;
                    break;
                case 30:
                    catalogViewType = CatalogViewType.CATEGORIES_LIST;
                    break;
                case 31:
                    catalogViewType = CatalogViewType.CATEGORIES_GRID;
                    break;
                case 32:
                    catalogViewType = CatalogViewType.RECOMMS_SLIDER;
                    break;
                case 33:
                    catalogViewType = CatalogViewType.ARTISTS_SLIDER;
                    break;
                case 34:
                    catalogViewType = CatalogViewType.AUDIO_CONTENT_CARD_EXTENDED_SLIDER;
                    break;
                case 35:
                    catalogViewType = CatalogViewType.MUSIC_NEWSFEED_TITLE;
                    break;
                case 36:
                    catalogViewType = CatalogViewType.OWNER_CELL;
                    break;
                case 37:
                    catalogViewType = CatalogViewType.USER_PROFILE;
                    break;
                case 38:
                    catalogViewType = CatalogViewType.TEXT;
                    break;
                case 39:
                    catalogViewType = CatalogViewType.CHIPS;
                    break;
                case 40:
                    catalogViewType = CatalogViewType.MUSIC_EXCLUSIVE_SLIDER;
                    break;
                case 41:
                    catalogViewType = CatalogViewType.ICONS_SLIDER;
                    break;
                case 42:
                    catalogViewType = CatalogViewType.CROP_SLIDER;
                    break;
                case 43:
                    catalogViewType = CatalogViewType.DOUBLE_LIST;
                    break;
                case 44:
                    catalogViewType = CatalogViewType.HEADER_LARGE;
                    break;
                case 45:
                    catalogViewType = CatalogViewType.SLIDER_CARD;
                    break;
                case 46:
                    catalogViewType = CatalogViewType.SMALL_SLIDER;
                    break;
                case 47:
                    catalogViewType = CatalogViewType.DOUBLE_STACKED_LIST;
                    break;
                case 48:
                    catalogViewType = CatalogViewType.SLIDER_EVENT;
                    break;
                case 49:
                    catalogViewType = CatalogViewType.PODCAST_BANNERS_SLIDER;
                    break;
                case 50:
                    catalogViewType = CatalogViewType.LISTENED_LIST;
                    break;
                case 51:
                    catalogViewType = CatalogViewType.PODCAST_FAVORITES;
                    break;
                case 52:
                    catalogViewType = CatalogViewType.PODCAST_CATEGORY_GENRE_BUTTONS;
                    break;
                case 53:
                    catalogViewType = CatalogViewType.PODCAST_EXTENDED_SLIDER;
                    break;
                case 54:
                    catalogViewType = CatalogViewType.FRIENDS_BUTTON_LIST_WIDE;
                    break;
                case 55:
                    catalogViewType = CatalogViewType.FRIENDS_BIRTHDAYS_LIST;
                    break;
                case 56:
                    catalogViewType = CatalogViewType.FRIENDS_REQUEST;
                    break;
                case 57:
                    catalogViewType = CatalogViewType.FRIENDS_UNREAD_REQUEST;
                    break;
                case 58:
                    catalogViewType = CatalogViewType.FRIENDS_ACTION_LIST_ITEM;
                    break;
                case 59:
                    catalogViewType = CatalogViewType.LIST_FRIENDS_SUGGEST;
                    break;
                case 60:
                    catalogViewType = CatalogViewType.HORIZONTAL_LIST_FRIEND_SUGGESTS;
                    break;
                case 61:
                    catalogViewType = CatalogViewType.LIST_MYFOLLOWERS;
                    break;
                case 62:
                    catalogViewType = CatalogViewType.LIST_FRIENDS_REQUESTS;
                    break;
                case 63:
                    catalogViewType = CatalogViewType.LIST_FRIENDS_REQUESTS_OUT;
                    break;
                case 64:
                    catalogViewType = CatalogViewType.MUSIC_CHART_LARGE_SLIDER;
                    break;
                case 65:
                    catalogViewType = CatalogViewType.AUDIO_STREAM_MIX;
                    break;
                case 66:
                    catalogViewType = CatalogViewType.AUDIO_STREAM_MIX_INTERACTIVE;
                    break;
                case 67:
                    catalogViewType = CatalogViewType.PLAYLIST_SMALL;
                    break;
                case 68:
                    catalogViewType = CatalogViewType.ENTITY_DOUBLE_GRID;
                    break;
                case 69:
                    catalogViewType = CatalogViewType.SNIPPETS_BANNER;
                    break;
                case 70:
                    catalogViewType = CatalogViewType.FILTER_BUTTON;
                    break;
                case 71:
                    catalogViewType = CatalogViewType.VERTICAL_GRID;
                    break;
                case 72:
                    catalogViewType = CatalogViewType.PLACEHOLDER_BIG;
                    break;
                case TokenParametersOuterClass$TokenParameters.APPSETID_FIELD_NUMBER /* 73 */:
                    catalogViewType = CatalogViewType.MY_SHELF_PLAYABLE_ITEM;
                    break;
                case TokenParametersOuterClass$TokenParameters.ENCRYPTEDTOPICS_FIELD_NUMBER /* 74 */:
                case TokenParametersOuterClass$TokenParameters.TOPICS_FIELD_NUMBER /* 75 */:
                    catalogViewType = CatalogViewType.DOUBLE_STACKED_SLIDER_MINIMALISTIC_CARD;
                    break;
                case TokenParametersOuterClass$TokenParameters.ADSERVICESVERSION_FIELD_NUMBER /* 76 */:
                    catalogViewType = CatalogViewType.SUBSECTION_TABS;
                    break;
                case TokenParametersOuterClass$TokenParameters.PUBEXTRADATA_FIELD_NUMBER /* 77 */:
                case TokenParametersOuterClass$TokenParameters.GPP_FIELD_NUMBER /* 78 */:
                    catalogViewType = CatalogViewType.DOUBLE_STACKED_LIST_MINIMALISTIC_CARD;
                    break;
                case 79:
                    catalogViewType = CatalogViewType.SLIDER_MINIMALISTIC_CARD;
                    break;
                case CarZone.CAR_ZONE_COLUMN_DRIVER /* 80 */:
                    catalogViewType = CatalogViewType.LIST_WITH_NOTIFICATION_STATE;
                    break;
                case IMAGES_IMAGE_LOADED_VALUE:
                    catalogViewType = CatalogViewType.LIST_WITH_RETURN_STATE;
                    break;
                case 82:
                    catalogViewType = CatalogViewType.MAP_PREVIEW;
                    break;
                case 83:
                    catalogViewType = CatalogViewType.LIST;
                    break;
                case 84:
                    catalogViewType = CatalogViewType.SYNTHETIC_ACTION_LOGOUT;
                    break;
                case 85:
                    catalogViewType = CatalogViewType.DYNAMIC_GRID;
                    break;
                case ModuleDescriptor.MODULE_VERSION /* 86 */:
                    catalogViewType = CatalogViewType.BIOGRAPHY_LAYOUT;
                    break;
                case 87:
                    catalogViewType = CatalogViewType.ARTIST_HEADER;
                    break;
                case 88:
                    catalogViewType = CatalogViewType.SLIDER_WITH_VERTICAL_VIDEOS;
                    break;
                case TsExtractor.TS_STREAM_TYPE_DVBSUBS /* 89 */:
                    catalogViewType = CatalogViewType.VIDEO_SLIDER;
                    break;
                case 90:
                    catalogViewType = CatalogViewType.STICKERS_SLIDER_ONLY_PRICE;
                    break;
                case JsonToken.BEGIN_ARRAY /* 91 */:
                    catalogViewType = CatalogViewType.STICKERS_LARGE_SLIDER_ONLY_PRICE;
                    break;
                case 92:
                    catalogViewType = CatalogViewType.LIST_STICKERS_PREVIEW;
                    break;
                case JsonToken.END_ARRAY /* 93 */:
                    catalogViewType = CatalogViewType.BUTTON;
                    break;
                case MBSupportMuteAdType.REWARD_VIDEO /* 94 */:
                    catalogViewType = CatalogViewType.SEPARATOR_COMPACT;
                    break;
                case 95:
                    catalogViewType = CatalogViewType.AD_BANNER;
                    break;
                case CarZone.CAR_ZONE_COLUMN_PASSENGER /* 96 */:
                    catalogViewType = CatalogViewType.HELP_HINT_BANNER;
                    break;
                case 97:
                    catalogViewType = CatalogViewType.INVISIBLE;
                    break;
                case JsonToken.BOOLEAN /* 98 */:
                    catalogViewType = CatalogViewType.LARGE_SLIDER_WITH_VERTICAL_VIDEOS;
                    break;
                case SQLiteStatementType.STATEMENT_OTHER /* 99 */:
                    catalogViewType = CatalogViewType.TITLE_SUBTITLE_AVATAR;
                    break;
                case 100:
                    catalogViewType = CatalogViewType.CATALOG_BANNER;
                    break;
                case 101:
                    catalogViewType = CatalogViewType.MUSIC_MAIN_NAVIGATION;
                    break;
                case 102:
                    catalogViewType = CatalogViewType.VIDEO_MUSIC_STREAM_MIX;
                    break;
                case 103:
                    catalogViewType = CatalogViewType.SHORT_VIDEO_LIST;
                    break;
                case 104:
                    catalogViewType = CatalogViewType.FLOOR_CLIPS;
                    break;
                case 105:
                    catalogViewType = CatalogViewType.CAROUSEL_CLIPS;
                    break;
                case INVALID_REQUEST_BUILDER_ERROR_VALUE:
                    catalogViewType = CatalogViewType.SEARCH_FLOOR_CLIPS;
                    break;
                case ApiInvocationException.ErrorCodes.PARAM_SESSION_KEY_CHANGED /* 107 */:
                    catalogViewType = CatalogViewType.SEARCH_CAROUSEL_CLIPS;
                    break;
                case 108:
                    catalogViewType = CatalogViewType.SLIDER_VERTICAL_VIDEOS_NO_AUTOPLAY;
                    break;
                case 109:
                    catalogViewType = CatalogViewType.KIDS_CATALOG;
                    break;
                case 110:
                    catalogViewType = CatalogViewType.KIDS_COLLECTION;
                    break;
                case 111:
                    catalogViewType = CatalogViewType.BUTTONS_HORIZONTAL_WITH_SCROLL;
                    break;
                case 112:
                    catalogViewType = CatalogViewType.HORIZONTAL_BUTTONS_STACK;
                    break;
                case 113:
                    catalogViewType = CatalogViewType.VIDEO_TABS_ALBUM_LIST;
                    break;
                case ASSET_WRITE_ERROR_VALUE:
                    catalogViewType = CatalogViewType.SHOWCASE_LIST;
                    break;
                case INVALID_INDEX_URL_VALUE:
                    catalogViewType = CatalogViewType.HORIZONTAL_SHOWCASE_STACK;
                    break;
                case 116:
                    catalogViewType = CatalogViewType.SHORT_DOUBLE_STACKED_LIST;
                    break;
                case ASSET_FAILED_STATUS_CODE_VALUE:
                    catalogViewType = CatalogViewType.SUBNAVIGATION_BAR;
                    break;
            }
        } else {
            CatalogLayoutDto.NameDto f2 = n1.f();
            int i5 = f2 != null ? z7a.$EnumSwitchMapping$0[f2.ordinal()] : -1;
            catalogViewType = i5 != 2 ? i5 != 17 ? i5 != 20 ? i5 != 23 ? i5 != 45 ? i5 != 49 ? i5 != 80 ? i5 != 81 ? CatalogViewType.UNKNOWN : CatalogViewType.LIST_WITH_RETURN_STATE : CatalogViewType.LIST_WITH_NOTIFICATION_STATE : CatalogViewType.PODCAST_BANNERS_SLIDER_INFINITE : CatalogViewType.SLIDER_CARD_INFINITE : CatalogViewType.LARGE_SLIDER_INFINITE : CatalogViewType.LARGE_LIST_INFINITE : CatalogViewType.PROMO_BANNERS_SLIDER_INFINITE : CatalogViewType.SLIDER_INFINITE;
        }
        CatalogViewType catalogViewType2 = catalogViewType;
        UserId q = n1.q();
        if (q == null) {
            q = UserId.d;
        }
        UserId userId = q;
        String title = n1.getTitle();
        String str7 = title == null ? "" : title;
        String j = n1.j();
        String str8 = j == null ? "" : j;
        CatalogLayoutTopTitleDto k = n1.k();
        if (k != null) {
            String e = k.e();
            topTitle = new TopTitle(e == null ? "" : e, k.d());
        } else {
            topTitle = null;
        }
        Boolean e2 = n1.e();
        boolean booleanValue = e2 != null ? e2.booleanValue() : false;
        Bundle bundle = new Bundle();
        CatalogLayoutDto.StyleDto i6 = n1.i();
        if (i6 != null && (i4 = i6.i()) != null) {
            bundle.putString(CatalogCustomAttributes$Keys.STYLE.h(), i4);
        }
        s3q0 s3q0Var = s3q0.a;
        LayoutSize.a aVar = LayoutSize.Companion;
        CatalogLayoutDto.SizeDto g2 = n1.g();
        String i7 = g2 != null ? g2.i() : null;
        aVar.getClass();
        CatalogLayout catalogLayout = new CatalogLayout(catalogViewType2, userId, str7, str8, topTitle, booleanValue, bundle, LayoutSize.a.a(i7), n1.d());
        List<CatalogButtonDto> e3 = catalogBlockDto.e();
        if (e3 != null) {
            ArrayList arrayList3 = new ArrayList();
            Iterator it2 = e3.iterator();
            while (it2.hasNext()) {
                CatalogButton c = t2aVar.c((CatalogButtonDto) it2.next());
                if (c != null) {
                    arrayList3.add(c);
                }
            }
            arrayList = p4g.q(arrayList3);
        } else {
            arrayList = new ArrayList();
        }
        ArrayList arrayList4 = arrayList;
        String r = catalogBlockDto.r();
        List<String> s1 = catalogBlockDto.s1();
        if (s1 == null) {
            s1 = EmptyList.b;
        }
        CatalogBlockItemsData a3 = a(catalogBlockDto);
        String b1 = catalogBlockDto.b1();
        List<CatalogItemBadgeDto> d1 = catalogBlockDto.d1();
        if (d1 != null) {
            List<CatalogItemBadgeDto> list3 = d1;
            str2 = r;
            HashMap hashMap = new HashMap(list3.size());
            for (Iterator<CatalogItemBadgeDto> it3 = list3.iterator(); it3.hasNext(); it3 = it3) {
                CatalogItemBadgeDto next = it3.next();
                hashMap.put(next.e(), next);
            }
            map = new LinkedHashMap(on00.e(hashMap.size()));
            for (Map.Entry entry : hashMap.entrySet()) {
                String str9 = id;
                Object key = entry.getKey();
                CatalogBadgeDto d2 = ((CatalogItemBadgeDto) entry.getValue()).d();
                CatalogDataType catalogDataType2 = a2;
                String d3 = d2.d();
                String str10 = id2;
                map.put(key, new CatalogBadge(d3 == null ? "" : d3, d2.e().i()));
                id = str9;
                a2 = catalogDataType2;
                id2 = str10;
            }
            str3 = id;
            catalogDataType = a2;
            str4 = id2;
        } else {
            str2 = r;
            str3 = id;
            catalogDataType = a2;
            str4 = id2;
            map = jgp.b;
        }
        Map map2 = map;
        CatalogBlockMetaDto B1 = catalogBlockDto.B1();
        CatalogOnboardingInfoDto d4 = B1 != null ? B1.d() : null;
        if (d4 != null) {
            String url2 = d4.getUrl();
            if (url2 == null) {
                url2 = "";
            }
            CatalogOnboardingInfoDto.TypeDto d5 = d4.d();
            if (d5 != null && (i3 = d5.i()) != null) {
                str6 = i3;
            }
            catalogOnboardingInfo = new CatalogOnboardingInfo(url2, str6);
        } else {
            catalogOnboardingInfo = null;
        }
        CatalogBlockMetaDto B12 = catalogBlockDto.B1();
        ShowAllInfo showAllInfo = (B12 == null || (i2 = B12.i()) == null) ? null : new ShowAllInfo(i2.getTitle(), i2.d());
        CatalogBlockMetaDto B13 = catalogBlockDto.B1();
        CatalogBlockMetaDto.ContextDto f3 = B13 != null ? B13.f() : null;
        CatalogBlockMetaDto B14 = catalogBlockDto.B1();
        String e4 = B14 != null ? B14.e() : null;
        CatalogBlockMetaDto B15 = catalogBlockDto.B1();
        Meta meta = new Meta(null, null, "", null, catalogOnboardingInfo, showAllInfo, false, f3, e4, Boolean.valueOf((B15 == null || (g = B15.g()) == null) ? false : g.booleanValue()));
        CatalogBlockDto.ActionButtonColorDto d6 = catalogBlockDto.d();
        String i8 = d6 != null ? d6.i() : null;
        CatalogBlockDto.SubtypeDto O2 = catalogBlockDto.O2();
        String str11 = BuildConfig.FLAVOR;
        if (O2 != null && (i = a.$EnumSwitchMapping$2[O2.ordinal()]) != 1) {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            str11 = "donut";
        }
        List<CatalogArtistInfoItemDto> g3 = catalogBlockDto.g();
        if (g3 != null) {
            arrayList2 = new ArrayList();
            Iterator it4 = g3.iterator();
            while (it4.hasNext()) {
                CatalogArtistInfoItemDto catalogArtistInfoItemDto = (CatalogArtistInfoItemDto) it4.next();
                if (catalogArtistInfoItemDto == null) {
                    str5 = i8;
                    it = it4;
                    catalogArtistInfo = null;
                } else {
                    List<CatalogButtonDto> d7 = catalogArtistInfoItemDto.d();
                    if (d7 != null) {
                        List<CatalogButtonDto> list4 = d7;
                        str5 = i8;
                        it = it4;
                        list2 = new ArrayList(c5g.u(list4, 10));
                        for (CatalogButtonDto catalogButtonDto : list4) {
                            list2.add(new CatalogArtistChip(catalogButtonDto.getTitle(), catalogButtonDto.p(), t2aVar.c(catalogButtonDto), catalogButtonDto.r(), catalogButtonDto.B(), catalogButtonDto.l(), catalogButtonDto.i()));
                        }
                    } else {
                        str5 = i8;
                        it = it4;
                        list2 = 0;
                    }
                    if (list2 == 0) {
                        list2 = EmptyList.b;
                    }
                    catalogArtistInfo = new CatalogArtistInfo(list2, catalogArtistInfoItemDto.l(), catalogArtistInfoItemDto.g(), catalogArtistInfoItemDto.j(), catalogArtistInfoItemDto.i(), catalogArtistInfoItemDto.k(), catalogArtistInfoItemDto.e(), catalogArtistInfoItemDto.f());
                }
                if (catalogArtistInfo != null) {
                    arrayList2.add(catalogArtistInfo);
                }
                i8 = str5;
                it4 = it;
            }
        } else {
            arrayList2 = null;
        }
        String str12 = i8;
        List list5 = arrayList2;
        if (arrayList2 == null) {
            list5 = EmptyList.b;
        }
        List list6 = list5;
        List<CatalogPinnedVideosItemDto> X1 = catalogBlockDto.X1();
        if (X1 != null) {
            list = new ArrayList();
            for (CatalogPinnedVideosItemDto catalogPinnedVideosItemDto : X1) {
                CatalogPinnedVideoInfo catalogPinnedVideoInfo = catalogPinnedVideosItemDto == null ? null : new CatalogPinnedVideoInfo(catalogPinnedVideosItemDto.e(), k3t0.a(catalogPinnedVideosItemDto.d()));
                if (catalogPinnedVideoInfo != null) {
                    list.add(catalogPinnedVideoInfo);
                }
            }
        } else {
            list = 0;
        }
        if (list == 0) {
            list = EmptyList.b;
        }
        return new CatalogBlock(str3, catalogDataType, str4, str, V1, url, catalogBadge, catalogLayout, arrayList4, str2, s1, a3, b1, map2, meta, str12, str11, null, list6, null, list, 655360, null);
    }
}
