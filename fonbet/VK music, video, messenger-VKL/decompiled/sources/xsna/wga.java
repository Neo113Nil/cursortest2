package xsna;

import com.huawei.hms.api.ConnectionResult;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.vk.api.generated.catalog.dto.CatalogGetAudioSearchRequestedSectionIdDto;
import com.vk.api.generated.catalog.dto.CatalogGetBlockItemsEntryPointDto;
import com.vk.api.generated.catalog.dto.CatalogGetPeopleSearchSexDto;
import com.vk.api.generated.catalog.dto.CatalogGetPeopleSearchStatusDto;
import com.vk.api.generated.catalog.dto.CatalogGetSearchGroupsContentTabDto;
import com.vk.api.generated.catalog.dto.CatalogGetSearchGroupsScreenRefDto;
import com.vk.api.generated.catalog.dto.CatalogGetSearchGroupsSortDto;
import com.vk.api.generated.catalog.dto.CatalogGetSearchGroupsTypeDto;
import com.vk.api.generated.catalog.dto.CatalogGetShortVideoSearchScreenRefDto;
import com.vk.api.generated.catalog.dto.CatalogGetVideoAlbumCatalogTypeDto;
import com.vk.api.generated.catalog.dto.CatalogGetVideoAlbumSortAlbumDto;
import com.vk.dto.common.id.UserId;
import com.vk.internal.api.GsonHolder;
import io.requery.android.database.sqlite.SQLiteDatabase;
import java.util.ArrayList;
import java.util.List;

/* compiled from: CatalogService.kt */
/* loaded from: classes2.dex */
public interface wga {
    static /* synthetic */ xy2 b(wga wgaVar, String str, String str2, int i) {
        if ((i & 8) != 0) {
            str2 = null;
        }
        return wgaVar.g(str, str2);
    }

    static xy2 c(xga xgaVar, String str, Integer num, CatalogGetPeopleSearchSexDto catalogGetPeopleSearchSexDto, Integer num2, Integer num3, CatalogGetPeopleSearchStatusDto catalogGetPeopleSearchStatusDto, Integer num4, Integer num5, Integer num6, Integer num7, String str2, UserId userId, UserId userId2, String str3, Boolean bool, int i, int i2) {
        tfx tfxVar;
        Integer num8 = (i & 4) != 0 ? null : num;
        CatalogGetPeopleSearchSexDto catalogGetPeopleSearchSexDto2 = (i & 32) != 0 ? null : catalogGetPeopleSearchSexDto;
        Integer num9 = (i & 64) != 0 ? null : num2;
        Integer num10 = (i & 128) != 0 ? null : num3;
        CatalogGetPeopleSearchStatusDto catalogGetPeopleSearchStatusDto2 = (i & 256) != 0 ? null : catalogGetPeopleSearchStatusDto;
        Integer num11 = (i & 512) != 0 ? null : num4;
        Integer num12 = (i & 1024) != 0 ? null : num5;
        Integer num13 = (i & 4096) != 0 ? null : num6;
        Integer num14 = (i & 8192) != 0 ? null : num7;
        String str4 = (134217728 & i) != 0 ? null : str2;
        UserId userId3 = (268435456 & i) != 0 ? null : userId;
        UserId userId4 = (i & SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING) != 0 ? null : userId2;
        Boolean bool2 = (i2 & 2) == 0 ? bool : null;
        xgaVar.getClass();
        UserId userId5 = userId4;
        tfx tfxVar2 = new tfx("catalog.getPeopleSearch", new wr(11), new xr(9));
        if (str != null) {
            tfx.o(tfxVar2, CampaignEx.JSON_KEY_AD_Q, str, 0, 0, 12);
            tfxVar = tfxVar2;
        } else {
            tfxVar = tfxVar2;
        }
        if (num8 != null) {
            tfx.l(tfxVar, "city_id", num8.intValue(), 0, 0, 8);
        }
        if (catalogGetPeopleSearchSexDto2 != null) {
            tfx.o(tfxVar, "sex", catalogGetPeopleSearchSexDto2.i(), 0, 0, 12);
        }
        if (num9 != null) {
            tfx.l(tfxVar, "age_from", num9.intValue(), 0, 0, 8);
        }
        if (num10 != null) {
            tfx.l(tfxVar, "age_to", num10.intValue(), 0, 0, 8);
        }
        if (catalogGetPeopleSearchStatusDto2 != null) {
            tfx.o(tfxVar, "status", catalogGetPeopleSearchStatusDto2.i(), 0, 0, 12);
        }
        if (num11 != null) {
            tfx.l(tfxVar, "school", num11.intValue(), 0, 0, 8);
        }
        if (num12 != null) {
            tfx.l(tfxVar, "school_year", num12.intValue(), 0, 0, 8);
        }
        if (num13 != null) {
            tfx.l(tfxVar, "university", num13.intValue(), 0, 0, 8);
        }
        if (num14 != null) {
            tfx.l(tfxVar, "university_year", num14.intValue(), 0, 0, 8);
        }
        if (str4 != null) {
            tfx.o(tfxVar, "company", str4, 0, 0, 12);
        }
        if (userId3 != null) {
            tfx.n(tfxVar, "friendlist_user_id", userId3, 1L, 0L, 8);
        }
        if (userId5 != null) {
            tfx.n(tfxVar, "group_id", userId5, 0L, -1L, 4);
        }
        if (str3 != null) {
            tfx.o(tfxVar, "screen_ref", str3, 0, 0, 12);
        }
        if (bool2 != null) {
            tfxVar.j("no_spellcheck", bool2.booleanValue());
        }
        return tfxVar;
    }

    static /* synthetic */ xy2 d(wga wgaVar, String str, Integer num, String str2, Boolean bool, List list, String str3, int i) {
        if ((i & 2) != 0) {
            num = null;
        }
        if ((i & 4) != 0) {
            str2 = null;
        }
        if ((i & 128) != 0) {
            bool = null;
        }
        if ((i & 1024) != 0) {
            list = null;
        }
        if ((i & 2048) != 0) {
            str3 = null;
        }
        return wgaVar.a(str, num, str2, bool, list, str3);
    }

    static xy2 e(xga xgaVar, String str, String str2, UserId userId, int i) {
        tfx tfxVar;
        String str3 = (i & 1) != 0 ? null : str;
        if ((i & 4) != 0) {
            str2 = null;
        }
        UserId userId2 = (i & 8) == 0 ? userId : null;
        xgaVar.getClass();
        tfx tfxVar2 = new tfx("catalog.getAudioClips", new pq(4), new j8(6));
        if (str3 != null) {
            tfxVar = tfxVar2;
            tfx.o(tfxVar, "ref", str3, 0, 0, 12);
        } else {
            tfxVar = tfxVar2;
        }
        tfxVar.j("need_blocks", true);
        if (str2 != null) {
            tfx.o(tfxVar, "url", str2, 0, 0, 12);
        }
        if (userId2 != null) {
            tfx.n(tfxVar, "owner_id", userId2, 0L, 0L, 12);
        }
        return tfxVar;
    }

    static xy2 f(xga xgaVar, String str, String str2, Integer num, UserId userId, CatalogGetBlockItemsEntryPointDto catalogGetBlockItemsEntryPointDto, List list, String str3, int i) {
        Integer num2 = (i & 4) != 0 ? null : num;
        UserId userId2 = (i & 16) != 0 ? null : userId;
        CatalogGetBlockItemsEntryPointDto catalogGetBlockItemsEntryPointDto2 = (i & 128) != 0 ? null : catalogGetBlockItemsEntryPointDto;
        List list2 = (i & 256) != 0 ? null : list;
        String str4 = (i & 512) == 0 ? str3 : null;
        xgaVar.getClass();
        tfx tfxVar = new tfx("catalog.getBlockItems", new sr(8), new tr(6));
        tfx.o(tfxVar, "block_id", str, 0, 0, 12);
        if (str2 != null) {
            tfx.o(tfxVar, "start_from", str2, 0, 0, 12);
        }
        if (num2 != null) {
            tfxVar.f(num2.intValue(), 1, 100, "count");
        }
        if (userId2 != null) {
            tfx.n(tfxVar, "purchase_for", userId2, 0L, 0L, 12);
        }
        if (catalogGetBlockItemsEntryPointDto2 != null) {
            tfx.o(tfxVar, "entry_point", catalogGetBlockItemsEntryPointDto2.i(), 0, 0, 12);
        }
        if (list2 != null) {
            tfx.o(tfxVar, "applied_toggles", GsonHolder.a().toJson(list2), 0, 0, 12);
        }
        if (str4 != null) {
            tfx.o(tfxVar, "ref", str4, 0, 0, 12);
        }
        return tfxVar;
    }

    static /* synthetic */ xy2 i(wga wgaVar, String str, ArrayList arrayList, String str2, Boolean bool, String str3, CatalogGetAudioSearchRequestedSectionIdDto catalogGetAudioSearchRequestedSectionIdDto, ArrayList arrayList2, String str4, int i) {
        if ((i & 2) != 0) {
            arrayList = null;
        }
        if ((i & 16) != 0) {
            str2 = null;
        }
        if ((i & 32) != 0) {
            bool = null;
        }
        if ((i & 64) != 0) {
            str3 = null;
        }
        if ((i & 128) != 0) {
            catalogGetAudioSearchRequestedSectionIdDto = null;
        }
        if ((i & 256) != 0) {
            arrayList2 = null;
        }
        if ((i & 512) != 0) {
            str4 = null;
        }
        return wgaVar.p(str, arrayList, str2, bool, str3, catalogGetAudioSearchRequestedSectionIdDto, arrayList2, str4);
    }

    static xy2 n(xga xgaVar, List list, List list2, String str, int i) {
        if ((i & 2) != 0) {
            list2 = null;
        }
        String str2 = (i & 4) != 0 ? null : str;
        xgaVar.getClass();
        tfx tfxVar = new tfx("catalog.replaceBlocks", new at(8), new bt(6));
        tfxVar.i("replacement_ids", list);
        if (list2 != null) {
            tfx.o(tfxVar, "applied_toggles", GsonHolder.a().toJson(list2), 0, 0, 12);
        }
        if (str2 != null) {
            tfx.o(tfxVar, "ref", str2, 0, 0, 12);
        }
        return tfxVar;
    }

    static /* synthetic */ xy2 o(xga xgaVar, String str, String str2, int i) {
        Boolean bool = Boolean.TRUE;
        if ((i & 1) != 0) {
            str = null;
        }
        return xgaVar.r(null, bool, str, str2, null);
    }

    default tfx a(String str, Integer num, String str2, Boolean bool, List list, String str3) {
        tfx tfxVar = new tfx("catalog.getSection", new sf3(5), new s11(5));
        tfx.o(tfxVar, "section_id", str, 0, 0, 12);
        if (num != null) {
            tfx.l(tfxVar, "count", num.intValue(), 0, 0, 8);
        }
        if (str2 != null) {
            tfx.o(tfxVar, "start_from", str2, 0, 0, 12);
        }
        if (bool != null) {
            tfxVar.j("force_refresh", bool.booleanValue());
        }
        if (list != null) {
            tfx.o(tfxVar, "applied_toggles", GsonHolder.a().toJson(list), 0, 0, 12);
        }
        if (str3 != null) {
            tfx.o(tfxVar, "ref", str3, 0, 0, 12);
        }
        return tfxVar;
    }

    default tfx g(String str, String str2) {
        tfx tfxVar = new tfx("catalog.getVideoSearchSubscriptions", new et(8), new gp(8));
        if (str != null) {
            tfx.o(tfxVar, CampaignEx.JSON_KEY_AD_Q, str, 0, 255, 4);
        }
        if (str2 != null) {
            tfx.o(tfxVar, "section_id", str2, 0, 0, 12);
        }
        return tfxVar;
    }

    default tfx h(String str, CatalogGetShortVideoSearchScreenRefDto catalogGetShortVideoSearchScreenRefDto, Boolean bool, Integer num, String str2, String str3) {
        tfx tfxVar = new tfx("catalog.getShortVideoSearch", new u11(13), new v11(7));
        if (str != null) {
            tfx.o(tfxVar, CampaignEx.JSON_KEY_AD_Q, str, 0, 0, 12);
        }
        tfxVar.j("need_blocks", true);
        if (catalogGetShortVideoSearchScreenRefDto != null) {
            tfx.o(tfxVar, "screen_ref", catalogGetShortVideoSearchScreenRefDto.i(), 0, 0, 12);
        }
        tfxVar.j("no_spellcheck", bool.booleanValue());
        if (num != null) {
            tfx.l(tfxVar, "show_suggests", num.intValue(), 0, 0, 12);
        }
        if (str2 != null) {
            tfx.o(tfxVar, "suggest_trackcode", str2, 0, 0, 12);
        }
        if (str3 != null) {
            tfx.o(tfxVar, "input_method", str3, 0, 0, 12);
        }
        return tfxVar;
    }

    default tfx j(UserId userId, int i, String str, CatalogGetVideoAlbumCatalogTypeDto catalogGetVideoAlbumCatalogTypeDto, CatalogGetVideoAlbumSortAlbumDto catalogGetVideoAlbumSortAlbumDto) {
        tfx tfxVar = new tfx("catalog.getVideoAlbum", new zn(9), new io.reactivex.rxjava3.subjects.c(8));
        tfx.n(tfxVar, "owner_id", userId, 0L, 0L, 12);
        tfx.l(tfxVar, "album_id", i, 0, 0, 12);
        tfxVar.j("need_blocks", true);
        if (str != null) {
            tfx.o(tfxVar, "from_trackcode", str, 0, 0, 12);
        }
        if (catalogGetVideoAlbumCatalogTypeDto != null) {
            tfx.o(tfxVar, "catalog_type", catalogGetVideoAlbumCatalogTypeDto.i(), 0, 0, 12);
        }
        if (catalogGetVideoAlbumSortAlbumDto != null) {
            tfx.l(tfxVar, "sort_album", catalogGetVideoAlbumSortAlbumDto.i(), 0, 0, 12);
        }
        return tfxVar;
    }

    default tfx k(String str, String str2, String str3) {
        tfx tfxVar = new tfx("catalog.getSearchChannels", new uq(5), new vq(6));
        if (str != null) {
            tfx.o(tfxVar, CampaignEx.JSON_KEY_AD_Q, str, 0, 0, 12);
        }
        if (str2 != null) {
            tfx.o(tfxVar, "input_method", str2, 0, 0, 12);
        }
        if (str3 != null) {
            tfx.o(tfxVar, "screen_ref", str3, 0, 0, 12);
        }
        return tfxVar;
    }

    default tfx l(Float f, Float f2, Float f3, Float f4, UserId userId, String str, CatalogGetSearchGroupsSortDto catalogGetSearchGroupsSortDto, CatalogGetSearchGroupsTypeDto catalogGetSearchGroupsTypeDto, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, Integer num7, Boolean bool, CatalogGetSearchGroupsScreenRefDto catalogGetSearchGroupsScreenRefDto, String str2, Integer num8, String str3, String str4) {
        tfx tfxVar = new tfx("catalog.getSearchGroups", new br(11), new cr(6));
        if (f != null) {
            tfxVar.h("latitude", f.floatValue(), -90.0d, 90.0d);
        }
        if (f2 != null) {
            tfxVar.h("longitude", f2.floatValue(), -180.0d, 180.0d);
        }
        if (f3 != null) {
            tfxVar.h("latitude_allowed", f3.floatValue(), -90.0d, 90.0d);
        }
        if (f4 != null) {
            tfxVar.h("longitude_allowed", f4.floatValue(), -180.0d, 180.0d);
        }
        if (userId != null) {
            tfx.n(tfxVar, "owner_id", userId, 0L, 0L, 8);
        }
        if (str != null) {
            tfx.o(tfxVar, CampaignEx.JSON_KEY_AD_Q, str, 0, 255, 4);
        }
        if (catalogGetSearchGroupsSortDto != null) {
            tfx.o(tfxVar, "sort", catalogGetSearchGroupsSortDto.i(), 0, 0, 12);
        }
        if (catalogGetSearchGroupsTypeDto != null) {
            tfx.o(tfxVar, "type", catalogGetSearchGroupsTypeDto.i(), 0, 0, 12);
        }
        if (num != null) {
            tfx.l(tfxVar, "city_id", num.intValue(), 0, 0, 8);
        }
        if (num2 != null) {
            tfx.l(tfxVar, "only_official", num2.intValue(), 0, 0, 8);
        }
        if (num3 != null) {
            tfx.l(tfxVar, "high_rating", num3.intValue(), 0, 0, 8);
        }
        if (num4 != null) {
            tfx.l(tfxVar, "has_services", num4.intValue(), 0, 0, 8);
        }
        if (num5 != null) {
            tfx.l(tfxVar, "has_goods", num5.intValue(), 0, 0, 8);
        }
        if (num6 != null) {
            tfx.l(tfxVar, "has_ozon", num6.intValue(), 0, 0, 8);
        }
        if (num7 != null) {
            tfx.l(tfxVar, "has_delivery", num7.intValue(), 0, 0, 8);
        }
        tfxVar.j("no_spellcheck", bool.booleanValue());
        if (catalogGetSearchGroupsScreenRefDto != null) {
            tfx.o(tfxVar, "screen_ref", catalogGetSearchGroupsScreenRefDto.j(), 0, 0, 12);
        }
        if (str2 != null) {
            tfx.o(tfxVar, "ad_campaign_source", str2, 0, 0, 12);
        }
        tfx.l(tfxVar, "show_suggests", num8.intValue(), 0, 0, 12);
        if (str3 != null) {
            tfx.o(tfxVar, "suggest_trackcode", str3, 0, 0, 12);
        }
        if (str4 != null) {
            tfx.o(tfxVar, "input_method", str4, 0, 0, 12);
        }
        return tfxVar;
    }

    default tfx m(String str, List list) {
        tfx tfxVar = new tfx("catalog.hideBlock", new ao(8), new bo(10));
        tfx.o(tfxVar, "block_id", str, 0, 0, 12);
        if (list != null) {
            tfx.o(tfxVar, "applied_toggles", GsonHolder.a().toJson(list), 0, 0, 12);
        }
        return tfxVar;
    }

    default tfx p(String str, List list, String str2, Boolean bool, String str3, CatalogGetAudioSearchRequestedSectionIdDto catalogGetAudioSearchRequestedSectionIdDto, List list2, String str4) {
        tfx tfxVar = new tfx("catalog.getAudioSearch", new en(10), new io.reactivex.rxjava3.internal.operators.observable.q1(9));
        if (str != null) {
            tfx.o(tfxVar, "query", str, 0, ConnectionResult.NETWORK_ERROR, 4);
        }
        if (list != null) {
            tfx.o(tfxVar, "search_recents", GsonHolder.a().toJson(list), 0, 0, 12);
        }
        tfxVar.j("need_blocks", true);
        if (str2 != null) {
            tfx.o(tfxVar, "screen_ref", str2, 0, 0, 12);
        }
        if (bool != null) {
            tfxVar.j("show_suggests", bool.booleanValue());
        }
        if (str3 != null) {
            tfx.o(tfxVar, "suggest_trackcode", str3, 0, 0, 12);
        }
        if (catalogGetAudioSearchRequestedSectionIdDto != null) {
            tfx.o(tfxVar, "requested_section_id", catalogGetAudioSearchRequestedSectionIdDto.j(), 0, 0, 12);
        }
        if (list2 != null) {
            tfx.o(tfxVar, "applied_toggles", GsonHolder.a().toJson(list2), 0, 0, 12);
        }
        if (str4 != null) {
            tfx.o(tfxVar, "ref", str4, 0, 0, 12);
        }
        return tfxVar;
    }

    default tfx q(Boolean bool, String str) {
        tfx tfxVar = new tfx("catalog.getVideoSearch", new eq0(6), new k73(8));
        if (str != null) {
            tfx.o(tfxVar, CampaignEx.JSON_KEY_AD_Q, str, 0, 0, 12);
        }
        tfxVar.j("no_spellcheck", bool.booleanValue());
        tfx.o(tfxVar, "category", "history", 0, 0, 12);
        return tfxVar;
    }

    default tfx r(UserId userId, Boolean bool, String str, String str2, List list) {
        tfx tfxVar = new tfx("catalog.getAudio", new rf3(6), new r11(8));
        if (str != null) {
            tfx.o(tfxVar, "ref", str, 0, 0, 12);
        }
        tfxVar.j("need_blocks", bool.booleanValue());
        if (str2 != null) {
            tfx.o(tfxVar, "url", str2, 0, 0, 12);
        }
        if (userId != null) {
            tfx.n(tfxVar, "owner_id", userId, 0L, 0L, 12);
        }
        if (list != null) {
            tfx.o(tfxVar, "applied_toggles", GsonHolder.a().toJson(list), 0, 0, 12);
        }
        return tfxVar;
    }

    default tfx s(UserId userId, String str, CatalogGetSearchGroupsContentTabDto catalogGetSearchGroupsContentTabDto) {
        tfx tfxVar = new tfx("catalog.getSearchGroupsContent", new com.vk.movika.sdk.android.defaultplayer.interactive.c(7), new ar(6));
        tfx.n(tfxVar, "owner_id", userId, 1L, 0L, 8);
        if (str != null) {
            tfx.o(tfxVar, CampaignEx.JSON_KEY_AD_Q, str, 0, 255, 4);
        }
        if (catalogGetSearchGroupsContentTabDto != null) {
            tfx.o(tfxVar, "tab", catalogGetSearchGroupsContentTabDto.i(), 0, 0, 12);
        }
        return tfxVar;
    }
}
