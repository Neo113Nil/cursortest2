package xsna;

import com.vk.api.generated.catalog.dto.CatalogBlockDataTypeDto;
import com.vk.api.generated.catalog.dto.CatalogSectionDataTypeDto;
import com.vk.catalog2.common.dto.api.CatalogDataType;
import com.vk.log.L;
import io.jsonwebtoken.JwtParser;
import java.util.NoSuchElementException;

/* compiled from: CatalogDataTypeMapper.kt */
/* loaded from: classes16.dex */
public final class a4a {

    /* compiled from: CatalogDataTypeMapper.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[CatalogBlockDataTypeDto.values().length];
            try {
                iArr[CatalogBlockDataTypeDto.MINI_APPS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CatalogBlockDataTypeDto.LINKS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CatalogBlockDataTypeDto.NONE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[CatalogBlockDataTypeDto.GROUPS_ITEMS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[CatalogBlockDataTypeDto.GROUPS.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[CatalogBlockDataTypeDto.CATALOG_USERS.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[CatalogBlockDataTypeDto.MARKET_ITEMS.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[CatalogBlockDataTypeDto.ARTIST_VIDEOS.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[CatalogBlockDataTypeDto.VIDEOS.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[CatalogBlockDataTypeDto.PLACEHOLDER.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[CatalogBlockDataTypeDto.ACTION.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[CatalogBlockDataTypeDto.GROUPS_BANNER_ITEMS.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[CatalogBlockDataTypeDto.GROUPS_INVITES.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[CatalogBlockDataTypeDto.GROUPS_COLLECTION.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[CatalogBlockDataTypeDto.GROUPS_ALL_GROUPS_OR_RECOMMENDATIONS.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr[CatalogBlockDataTypeDto.GROUPS_FRIENDS_LIKES.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr[CatalogBlockDataTypeDto.GROUPS_INFO_ITEMS.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr[CatalogBlockDataTypeDto.CATALOG_BANNERS.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr[CatalogBlockDataTypeDto.MUSIC_PLAYLISTS.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr[CatalogBlockDataTypeDto.MUSIC_AUDIOS.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr[CatalogBlockDataTypeDto.MUSIC_RECOMMENDED_PLAYLISTS.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                iArr[CatalogBlockDataTypeDto.AUDIO_FOLLOWINGS_UPDATE_INFO.ordinal()] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                iArr[CatalogBlockDataTypeDto.MUSIC_OWNERS.ordinal()] = 23;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                iArr[CatalogBlockDataTypeDto.ARTIST.ordinal()] = 24;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                iArr[CatalogBlockDataTypeDto.CURATOR.ordinal()] = 25;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                iArr[CatalogBlockDataTypeDto.PODCASTS.ordinal()] = 26;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                iArr[CatalogBlockDataTypeDto.PODCAST_EPISODES.ordinal()] = 27;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                iArr[CatalogBlockDataTypeDto.PODCAST_SLIDER_ITEMS.ordinal()] = 28;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                iArr[CatalogBlockDataTypeDto.AUDIO_STREAM_MIXES.ordinal()] = 29;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                iArr[CatalogBlockDataTypeDto.AUDIO_BOOKS.ordinal()] = 30;
            } catch (NoSuchFieldError unused30) {
            }
            try {
                iArr[CatalogBlockDataTypeDto.AUDIO_BOOKS_PERSONS.ordinal()] = 31;
            } catch (NoSuchFieldError unused31) {
            }
            try {
                iArr[CatalogBlockDataTypeDto.FRIENDS_LIKED_EPISODES.ordinal()] = 32;
            } catch (NoSuchFieldError unused32) {
            }
            try {
                iArr[CatalogBlockDataTypeDto.RADIOSTATIONS.ordinal()] = 33;
            } catch (NoSuchFieldError unused33) {
            }
            try {
                iArr[CatalogBlockDataTypeDto.AUDIO_FOLLOWINGS_UPDATE_ITEM.ordinal()] = 34;
            } catch (NoSuchFieldError unused34) {
            }
            try {
                iArr[CatalogBlockDataTypeDto.AUDIO_SIGNAL_COMMON_INFO.ordinal()] = 35;
            } catch (NoSuchFieldError unused35) {
            }
            try {
                iArr[CatalogBlockDataTypeDto.GAMES.ordinal()] = 36;
            } catch (NoSuchFieldError unused36) {
            }
            try {
                iArr[CatalogBlockDataTypeDto.EMPTY.ordinal()] = 37;
            } catch (NoSuchFieldError unused37) {
            }
            try {
                iArr[CatalogBlockDataTypeDto.GROUPS_CATEGORY_ITEMS.ordinal()] = 38;
            } catch (NoSuchFieldError unused38) {
            }
            try {
                iArr[CatalogBlockDataTypeDto.AUDIO_SEARCH_RECENTS.ordinal()] = 39;
            } catch (NoSuchFieldError unused39) {
            }
            try {
                iArr[CatalogBlockDataTypeDto.SEARCH_SUGGESTIONS.ordinal()] = 40;
            } catch (NoSuchFieldError unused40) {
            }
            try {
                iArr[CatalogBlockDataTypeDto.CATALOG_SEARCH_SUGGESTION.ordinal()] = 41;
            } catch (NoSuchFieldError unused41) {
            }
            try {
                iArr[CatalogBlockDataTypeDto.SEARCH_AUTHORS.ordinal()] = 42;
            } catch (NoSuchFieldError unused42) {
            }
            try {
                iArr[CatalogBlockDataTypeDto.NAVIGATION_TABS.ordinal()] = 43;
            } catch (NoSuchFieldError unused43) {
            }
            try {
                iArr[CatalogBlockDataTypeDto.SEARCH_SPELLCHECKER.ordinal()] = 44;
            } catch (NoSuchFieldError unused44) {
            }
            try {
                iArr[CatalogBlockDataTypeDto.EXTENDED_PODCASTS.ordinal()] = 45;
            } catch (NoSuchFieldError unused45) {
            }
            try {
                iArr[CatalogBlockDataTypeDto.MINI_APPS_CONTENT.ordinal()] = 46;
            } catch (NoSuchFieldError unused46) {
            }
            try {
                iArr[CatalogBlockDataTypeDto.STICKERS_PACKS.ordinal()] = 47;
            } catch (NoSuchFieldError unused47) {
            }
            try {
                iArr[CatalogBlockDataTypeDto.SHORT_VIDEO_AUDIOS.ordinal()] = 48;
            } catch (NoSuchFieldError unused48) {
            }
            try {
                iArr[CatalogBlockDataTypeDto.NEWSFEED_ITEMS.ordinal()] = 49;
            } catch (NoSuchFieldError unused49) {
            }
            try {
                iArr[CatalogBlockDataTypeDto.SEARCH_WALL_ITEMS.ordinal()] = 50;
            } catch (NoSuchFieldError unused50) {
            }
            try {
                iArr[CatalogBlockDataTypeDto.AUDIO_CONTENT_CARDS.ordinal()] = 51;
            } catch (NoSuchFieldError unused51) {
            }
            try {
                iArr[CatalogBlockDataTypeDto.MARKET_INFO.ordinal()] = 52;
            } catch (NoSuchFieldError unused52) {
            }
            try {
                iArr[CatalogBlockDataTypeDto.CONCERTS.ordinal()] = 53;
            } catch (NoSuchFieldError unused53) {
            }
            try {
                iArr[CatalogBlockDataTypeDto.ALBUMS.ordinal()] = 54;
            } catch (NoSuchFieldError unused54) {
            }
            try {
                iArr[CatalogBlockDataTypeDto.VIDEO_SHOWCASE_VKLIVE_CATEGORIES_ITEMS.ordinal()] = 55;
            } catch (NoSuchFieldError unused55) {
            }
            try {
                iArr[CatalogBlockDataTypeDto.COMMUNITY_CHANNELS.ordinal()] = 56;
            } catch (NoSuchFieldError unused56) {
            }
            try {
                iArr[CatalogBlockDataTypeDto.SEARCH_FILTER.ordinal()] = 57;
            } catch (NoSuchFieldError unused57) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[CatalogSectionDataTypeDto.values().length];
            try {
                iArr2[CatalogSectionDataTypeDto.FAVORITES.ordinal()] = 1;
            } catch (NoSuchFieldError unused58) {
            }
            try {
                iArr2[CatalogSectionDataTypeDto.WALL.ordinal()] = 2;
            } catch (NoSuchFieldError unused59) {
            }
            try {
                iArr2[CatalogSectionDataTypeDto.VIDEOS.ordinal()] = 3;
            } catch (NoSuchFieldError unused60) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public static CatalogDataType a(CatalogBlockDataTypeDto catalogBlockDataTypeDto) {
        switch (catalogBlockDataTypeDto == null ? -1 : a.$EnumSwitchMapping$0[catalogBlockDataTypeDto.ordinal()]) {
            case -1:
                return CatalogDataType.UNKNOWN;
            case 0:
            default:
                L.i(new NoSuchElementException("Mapping to CatalogDataType is missed for " + catalogBlockDataTypeDto + JwtParser.SEPARATOR_CHAR));
                return CatalogDataType.UNKNOWN;
            case 1:
                return CatalogDataType.DATA_TYPE_MINIAPPS;
            case 2:
                return CatalogDataType.DATA_TYPE_LINKS;
            case 3:
                return CatalogDataType.DATA_TYPE_NONE;
            case 4:
                return CatalogDataType.DATA_TYPE_GROUPS_ITEMS;
            case 5:
                return CatalogDataType.DATA_TYPE_GROUPS;
            case 6:
                return CatalogDataType.DATA_TYPE_CATALOG_USERS;
            case 7:
                return CatalogDataType.DATA_TYPE_CATALOG_MARKET_ITEMS;
            case 8:
                return CatalogDataType.DATA_TYPE_ARTIST_VIDEOS;
            case 9:
                return CatalogDataType.DATA_TYPE_VIDEO_VIDEOS;
            case 10:
                return CatalogDataType.DATA_TYPE_PLACEHOLDER;
            case 11:
                return CatalogDataType.DATA_TYPE_ACTION;
            case 12:
                return CatalogDataType.DATA_TYPE_GROUP_BANNERS;
            case 13:
                return CatalogDataType.DATA_TYPE_GROUPS_INVITES;
            case 14:
                return CatalogDataType.DATA_TYPE_GROUPS_COLLECTION;
            case 15:
                return CatalogDataType.DATA_TYPE_ALL_GROUPS_OR_RECOMMENDATIONS;
            case 16:
                return CatalogDataType.DATA_TYPE_FRIENDS_LIKES;
            case 17:
                return CatalogDataType.DATA_TYPE_CATALOG_GROUPS_INFO_ITEMS;
            case 18:
                return CatalogDataType.DATA_TYPE_CATALOG_BANNERS;
            case 19:
                return CatalogDataType.DATA_TYPE_MUSIC_PLAYLISTS;
            case 20:
                return CatalogDataType.DATA_TYPE_MUSIC_TRACKS;
            case 21:
                return CatalogDataType.DATA_TYPE_MUSIC_RECOMMENDED_PLAYLISTS;
            case 22:
                return CatalogDataType.DATA_TYPE_AUDIO_FOLLOWINGS_UPDATE_INFO;
            case 23:
                return CatalogDataType.DATA_TYPE_MUSIC_OWNERS;
            case 24:
                return CatalogDataType.DATA_TYPE_ARTIST;
            case 25:
                return CatalogDataType.DATA_TYPE_CURATOR;
            case 26:
                return CatalogDataType.DATA_TYPE_PODCASTS;
            case 27:
                return CatalogDataType.DATA_TYPE_PODCAST_EPISODES;
            case 28:
                return CatalogDataType.DATA_TYPE_PODCAST_SLIDER_ITEMS;
            case 29:
                return CatalogDataType.DATA_TYPE_AUDIO_STREAM_MIXES;
            case 30:
                return CatalogDataType.DATA_TYPE_AUDIOBOOKS;
            case 31:
                return CatalogDataType.DATA_TYPE_AUDIOBOOKS_PERSONS;
            case 32:
                return CatalogDataType.DATA_TYPE_FRIENDS_LIKE_EPISODE;
            case 33:
                return CatalogDataType.DATA_TYPE_RADIO_STATIONS;
            case 34:
                return CatalogDataType.DATA_TYPE_AUDIO_FOLLOWINGS_UPDATE_ITEM;
            case 35:
                return CatalogDataType.DATA_TYPE_AUDIO_SIGNAL_COMMON_INFO;
            case 36:
                return CatalogDataType.DATA_TYPE_GAMES;
            case 37:
                return CatalogDataType.DATA_TYPE_EMPTY;
            case 38:
                return CatalogDataType.DATA_TYPE_GROUPS_CATEGORY_ITEMS;
            case 39:
                return CatalogDataType.DATA_TYPE_AUDIO_SEARCH_RECENTS;
            case 40:
                return CatalogDataType.DATA_TYPE_SEARCH_SUGGESTION;
            case 41:
                return CatalogDataType.DATA_TYPE_SEARCH_SUGGESTION;
            case 42:
                return CatalogDataType.DATA_TYPE_SEARCH_AUTHORS;
            case 43:
                return CatalogDataType.DATA_TYPE_CATALOG_NAVIGATION_TABS;
            case 44:
                return CatalogDataType.DATA_TYPE_SEARCH_SPELLCHECKER;
            case 45:
                return CatalogDataType.DATA_TYPE_EXTENDED_PODCASTS;
            case 46:
                return CatalogDataType.DATA_TYPE_MINI_APPS_CONTENT;
            case 47:
                return CatalogDataType.DATA_TYPE_STICKER_PACKS;
            case 48:
                return CatalogDataType.DATA_TYPE_SHORT_VIDEO_AUDIOS;
            case 49:
                return CatalogDataType.DATA_TYPE_SEARCH_NEWSFEED;
            case 50:
                return CatalogDataType.DATA_TYPE_SEARCH_WALL_ITEMS;
            case 51:
                return CatalogDataType.DATA_TYPE_AUDIO_CONTENT_CARDS;
            case 52:
                return CatalogDataType.DATA_TYPE_MARKET_INFO;
            case 53:
                return CatalogDataType.DATA_TYPE_CONCERTS;
            case 54:
                return CatalogDataType.DATA_TYPE_VIDEO_ALBUMS;
            case 55:
                return CatalogDataType.DATA_TYPE_LIVE_CATEGORY;
            case 56:
                return CatalogDataType.DATA_TYPE_CHANNELS;
            case 57:
                return CatalogDataType.DATA_TYPE_SEARCH_FILTERS;
        }
    }
}
