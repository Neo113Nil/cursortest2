package xsna;

import com.vk.api.generated.shortVideo.dto.ShortVideoGetGridShortVideosGridTypeDto;
import com.vk.api.generated.shortVideo.dto.ShortVideoGetOwnerVideosPlaylistAliasDto;
import com.vk.api.generated.shortVideo.dto.ShortVideoGetOwnerVideosPlaylistDto;
import com.vk.api.generated.shortVideo.dto.ShortVideoGetOwnerVideosSortDto;
import com.vk.dto.common.id.UserId;
import io.requery.android.database.sqlite.SQLiteDatabase;
import java.util.List;

/* compiled from: ShortVideoService.kt */
/* loaded from: classes.dex */
public interface lgj0 {

    /* compiled from: ShortVideoService.kt */
    /* loaded from: classes17.dex */
    public static final class a {
        public static vfx a(UserId userId, int i, String str, List list, List list2, Boolean bool, Integer num, String str2, List list3, String str3) {
            vfx vfxVar = new vfx("shortVideo.edit", new io.reactivex.rxjava3.internal.operators.mixed.n(28), new zq(24));
            vfx.l(vfxVar, "owner_id", userId, 12);
            vfx.k(vfxVar, "video_id", i, 1, 8);
            if (str != null) {
                vfx.m(vfxVar, "description", str, 0, 12);
            }
            if (list != null) {
                vfxVar.i("privacy_view", list);
            }
            if (list2 != null) {
                vfxVar.i("privacy_comment", list2);
            }
            if (bool != null) {
                vfxVar.j("can_make_duet", bool.booleanValue());
            }
            if (num != null) {
                vfxVar.f(num.intValue(), 0, 2145906000, "publish_date");
            }
            if (str2 != null) {
                vfx.m(vfxVar, "ord_info", str2, 0, 12);
            }
            if (list3 != null) {
                vfx.n(vfxVar, list3);
            }
            if (str3 != null) {
                vfx.m(vfxVar, "attach_to_video_raw_id", str3, 0, 12);
            }
            return vfxVar;
        }

        public static /* synthetic */ xy2 b(lgj0 lgj0Var, UserId userId, int i, String str, List list, List list2, Boolean bool, Integer num, String str2, List list3, String str3, int i2) {
            if ((i2 & 4) != 0) {
                str = null;
            }
            if ((i2 & 8) != 0) {
                list = null;
            }
            if ((i2 & 16) != 0) {
                list2 = null;
            }
            if ((i2 & 32) != 0) {
                bool = null;
            }
            if ((i2 & 64) != 0) {
                num = null;
            }
            if ((i2 & 1024) != 0) {
                str2 = null;
            }
            if ((i2 & 2048) != 0) {
                list3 = null;
            }
            if ((i2 & 4096) != 0) {
                str3 = null;
            }
            return lgj0Var.c(userId, i, str, list, list2, bool, num, str2, list3, str3);
        }

        public static vfx c(List list, List list2) {
            vfx vfxVar = new vfx("shortVideo.get", new alb0(4), new sqe0(2));
            vfxVar.i("short_video_raw_ids", list);
            if (list2 != null) {
                vfxVar.i("fields", list2);
            }
            return vfxVar;
        }

        public static /* synthetic */ xy2 d(lgj0 lgj0Var, List list, List list2, int i) {
            if ((i & 4) != 0) {
                list2 = null;
            }
            return lgj0Var.d(list, list2);
        }

        public static vfx e(ShortVideoGetGridShortVideosGridTypeDto shortVideoGetGridShortVideosGridTypeDto, String str, Integer num, String str2, String str3, List list) {
            vfx vfxVar = new vfx("shortVideo.getGridShortVideos", new io.reactivex.rxjava3.internal.operators.mixed.j(25), new kgj0(0));
            vfx.m(vfxVar, "grid_type", shortVideoGetGridShortVideosGridTypeDto.i(), 0, 12);
            vfx.m(vfxVar, "object_id", str, 0, 12);
            vfxVar.f(num.intValue(), 0, 100, "count");
            if (str2 != null) {
                vfx.m(vfxVar, "page_anchor", str2, 0, 12);
            }
            if (str3 != null) {
                vfx.m(vfxVar, "ref", str3, 0, 12);
            }
            if (list != null) {
                vfxVar.i("fields", list);
            }
            return vfxVar;
        }

        public static vfx f(UserId userId, Integer num, String str, List list, Boolean bool, ShortVideoGetOwnerVideosPlaylistDto shortVideoGetOwnerVideosPlaylistDto, Integer num2, ShortVideoGetOwnerVideosPlaylistAliasDto shortVideoGetOwnerVideosPlaylistAliasDto, String str2, Integer num3, ShortVideoGetOwnerVideosSortDto shortVideoGetOwnerVideosSortDto) {
            vfx vfxVar = new vfx("shortVideo.getOwnerVideos", new sq(23), new tq(24));
            if (userId != null) {
                vfx.l(vfxVar, "owner_id", userId, 12);
            }
            if (num != null) {
                vfxVar.f(num.intValue(), 0, 100, "count");
            }
            if (str != null) {
                vfx.m(vfxVar, "start_from", str, 0, 12);
            }
            if (list != null) {
                vfxVar.i("fields", list);
            }
            if (bool != null) {
                vfxVar.j("is_get_statistic", bool.booleanValue());
            }
            if (shortVideoGetOwnerVideosPlaylistDto != null) {
                vfx.m(vfxVar, "playlist", shortVideoGetOwnerVideosPlaylistDto.i(), 0, 12);
            }
            if (num2 != null) {
                vfx.k(vfxVar, "playlist_id", num2.intValue(), 0, 12);
            }
            if (shortVideoGetOwnerVideosPlaylistAliasDto != null) {
                vfx.m(vfxVar, "playlist_alias", shortVideoGetOwnerVideosPlaylistAliasDto.i(), 0, 12);
            }
            if (str2 != null) {
                vfx.m(vfxVar, "start_from_video_id", str2, 0, 12);
            }
            if (num3 != null) {
                vfxVar.f(num3.intValue(), 0, 100, "from_video_position");
            }
            if (shortVideoGetOwnerVideosSortDto != null) {
                vfx.m(vfxVar, "sort", shortVideoGetOwnerVideosSortDto.i(), 0, 12);
            }
            return vfxVar;
        }

        public static /* synthetic */ xy2 g(lgj0 lgj0Var, UserId userId, Integer num, String str, List list, Boolean bool, ShortVideoGetOwnerVideosPlaylistDto shortVideoGetOwnerVideosPlaylistDto, Integer num2, ShortVideoGetOwnerVideosPlaylistAliasDto shortVideoGetOwnerVideosPlaylistAliasDto, String str2, ShortVideoGetOwnerVideosSortDto shortVideoGetOwnerVideosSortDto, int i) {
            if ((i & 1) != 0) {
                userId = null;
            }
            if ((i & 2) != 0) {
                num = null;
            }
            if ((i & 4) != 0) {
                str = null;
            }
            if ((i & 8) != 0) {
                list = null;
            }
            if ((i & 16) != 0) {
                bool = null;
            }
            if ((i & 32) != 0) {
                shortVideoGetOwnerVideosPlaylistDto = null;
            }
            if ((i & 64) != 0) {
                num2 = null;
            }
            if ((i & 128) != 0) {
                shortVideoGetOwnerVideosPlaylistAliasDto = null;
            }
            if ((i & 256) != 0) {
                str2 = null;
            }
            return lgj0Var.f(userId, num, str, list, bool, shortVideoGetOwnerVideosPlaylistDto, num2, shortVideoGetOwnerVideosPlaylistAliasDto, str2, null, (i & 1024) != 0 ? null : shortVideoGetOwnerVideosSortDto);
        }

        public static vfx h(Integer num, String str, String str2, String str3, List list, Integer num2, String str4, Integer num3, List list2, String str5, String str6) {
            vfx vfxVar = new vfx("shortVideo.getRecom", new bkh0(2), new yq(29));
            vfxVar.f(num.intValue(), 0, 100, "count");
            if (str != null) {
                vfx.m(vfxVar, "page_anchor", str, 0, 12);
            }
            if (str2 != null) {
                vfx.m(vfxVar, "ref", str2, 0, 12);
            }
            if (str3 != null) {
                vfx.m(vfxVar, "similar_short_video_track_code", str3, 0, 12);
            }
            if (list != null) {
                vfxVar.i("fields", list);
            }
            if (num2 != null) {
                vfx.k(vfxVar, "prefetch_count", num2.intValue(), 0, 8);
            }
            if (str4 != null) {
                vfx.m(vfxVar, "device_info", str4, 0, 12);
            }
            if (num3 != null) {
                vfx.k(vfxVar, "prefetch_session_id", num3.intValue(), 0, 12);
            }
            if (list2 != null) {
                vfxVar.i("last_short_video_ids", list2);
            }
            if (str5 != null) {
                vfx.m(vfxVar, "product_data", str5, 2000, 4);
            }
            if (str6 != null) {
                vfx.m(vfxVar, "last_positive_events", str6, 0, 12);
            }
            return vfxVar;
        }

        public static /* synthetic */ xy2 i(lgj0 lgj0Var, Integer num, String str, String str2, String str3, List list, Integer num2, String str4, Integer num3, List list2, String str5, String str6, int i) {
            if ((i & 2) != 0) {
                str = null;
            }
            if ((i & 8) != 0) {
                str3 = null;
            }
            if ((i & 16) != 0) {
                list = null;
            }
            if ((i & 32) != 0) {
                num2 = null;
            }
            if ((i & 256) != 0) {
                num3 = null;
            }
            if ((i & 2048) != 0) {
                list2 = null;
            }
            if ((i & 4096) != 0) {
                str5 = null;
            }
            if ((i & 16384) != 0) {
                str6 = null;
            }
            return lgj0Var.w(num, str, str2, str3, list, num2, str4, num3, list2, str5, str6);
        }

        public static xy2 j(ogj0 ogj0Var, UserId userId) {
            vfx vfxVar = new vfx("shortVideo.getThumbUploadUrl", new nq(23), new zjh0(2));
            vfx.l(vfxVar, "owner_id", userId, 12);
            return vfxVar;
        }

        public static vfx k(Integer num, String str, String str2, String str3, String str4, String str5, List list, Integer num2, String str6, Integer num3, List list2, String str7) {
            vfx vfxVar = new vfx("shortVideo.getTopVideos", new uq(26), new jgj0(0));
            vfxVar.f(num.intValue(), 0, 100, "count");
            if (str != null) {
                vfx.m(vfxVar, "start_from", str, 0, 12);
            }
            if (str2 != null) {
                vfx.m(vfxVar, "filters", str2, 0, 12);
            }
            if (str3 != null) {
                vfx.m(vfxVar, "from_video", str3, 0, 12);
            }
            if (str4 != null) {
                vfx.m(vfxVar, "ref", str4, 0, 12);
            }
            if (str5 != null) {
                vfx.m(vfxVar, "track_code", str5, 0, 12);
            }
            if (list != null) {
                vfxVar.i("fields", list);
            }
            if (num2 != null) {
                vfx.k(vfxVar, "prefetch_count", num2.intValue(), 0, 8);
            }
            if (str6 != null) {
                vfx.m(vfxVar, "device_info", str6, 0, 12);
            }
            if (num3 != null) {
                vfx.k(vfxVar, "prefetch_session_id", num3.intValue(), 0, 12);
            }
            if (list2 != null) {
                vfxVar.i("last_video_ids", list2);
            }
            if (str7 != null) {
                vfx.m(vfxVar, "product_data", str7, 2000, 4);
            }
            return vfxVar;
        }

        public static /* synthetic */ xy2 l(lgj0 lgj0Var, Integer num, String str, String str2, String str3, String str4, String str5, List list, Integer num2, String str6, Integer num3, List list2, String str7, int i) {
            if ((i & 2) != 0) {
                str = null;
            }
            if ((i & 8) != 0) {
                str3 = null;
            }
            if ((i & 16) != 0) {
                str4 = null;
            }
            if ((i & 32) != 0) {
                str5 = null;
            }
            if ((i & 64) != 0) {
                list = null;
            }
            if ((i & 128) != 0) {
                num2 = null;
            }
            if ((i & 256) != 0) {
                str6 = null;
            }
            if ((i & 1024) != 0) {
                num3 = null;
            }
            if ((131072 & i) != 0) {
                list2 = null;
            }
            if ((i & SQLiteDatabase.OPEN_PRIVATECACHE) != 0) {
                str7 = null;
            }
            return lgj0Var.o(num, str, str2, str3, str4, str5, list, num2, str6, num3, list2, str7);
        }

        public static vfx m(int i, UserId userId, String str) {
            vfx vfxVar = new vfx("shortVideo.notInterested", new oq(27), new pq(19));
            vfx.l(vfxVar, "owner_id", userId, 12);
            vfx.k(vfxVar, "video_id", i, 0, 8);
            if (str != null) {
                vfx.m(vfxVar, "track_code", str, 0, 12);
            }
            return vfxVar;
        }

        public static xy2 n(ogj0 ogj0Var, UserId userId, String str, Integer num) {
            vfx vfxVar = new vfx("shortVideo.saveUploadedThumb", new dr(29), new com.vk.movika.sdk.android.defaultplayer.view.a(29));
            vfx.l(vfxVar, "owner_id", userId, 12);
            vfx.m(vfxVar, "thumb_json", str, 0, 12);
            vfx.k(vfxVar, "video_id", num.intValue(), 1, 8);
            return vfxVar;
        }
    }

    vfx c(UserId userId, int i, String str, List list, List list2, Boolean bool, Integer num, String str2, List list3, String str3);

    vfx d(List list, List list2);

    vfx f(UserId userId, Integer num, String str, List list, Boolean bool, ShortVideoGetOwnerVideosPlaylistDto shortVideoGetOwnerVideosPlaylistDto, Integer num2, ShortVideoGetOwnerVideosPlaylistAliasDto shortVideoGetOwnerVideosPlaylistAliasDto, String str2, Integer num3, ShortVideoGetOwnerVideosSortDto shortVideoGetOwnerVideosSortDto);

    xy2 m(int i, UserId userId, String str);

    vfx o(Integer num, String str, String str2, String str3, String str4, String str5, List list, Integer num2, String str6, Integer num3, List list2, String str7);

    xy2 q(int i, UserId userId, String str);

    vfx s(int i, UserId userId, String str);

    vfx w(Integer num, String str, String str2, String str3, List list, Integer num2, String str4, Integer num3, List list2, String str5, String str6);
}
