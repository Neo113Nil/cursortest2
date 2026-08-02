package xsna;

import com.huawei.hms.api.ConnectionResult;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.vk.api.generated.video.dto.VideoCreateCommentScreenModeDto;
import com.vk.api.generated.video.dto.VideoGetByIdsVideoFieldsDto;
import com.vk.api.generated.video.dto.VideoGetCommentsExtendedSortDto;
import com.vk.api.generated.video.dto.VideoGetFromAlbumSortAlbumDto;
import com.vk.api.generated.video.dto.VideoSetNotificationsStatusStatusDto;
import com.vk.api.generated.video.dto.VideoViewSegmentsEndStreamReasonDto;
import com.vk.api.generated.video.dto.VideoViewSegmentsStateEndDto;
import com.vk.api.generated.video.dto.VideoViewSegmentsStateStartDto;
import com.vk.dto.common.id.UserId;
import io.requery.android.database.sqlite.SQLiteDatabase;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.sft0;

/* compiled from: VideoService.kt */
/* loaded from: classes.dex */
public interface tft0 extends sft0 {

    /* compiled from: VideoService.kt */
    /* loaded from: classes2.dex */
    public static final class a {
        public static vfx a(UserId userId, List list, Integer num, Integer num2, Integer num3, Boolean bool, List list2, Boolean bool2) {
            return sft0.a.a(userId, list, num, num2, num3, bool, list2, bool2);
        }

        public static vfx b(int i, UserId userId, Integer num, Integer num2, String str, VideoGetFromAlbumSortAlbumDto videoGetFromAlbumSortAlbumDto, String str2, Integer num3, String str3, Boolean bool, List list) {
            return sft0.a.c(i, userId, num, num2, str, videoGetFromAlbumSortAlbumDto, str2, num3, str3, bool, list);
        }
    }

    static xy2 B(uft0 uft0Var, UserId userId, int i, UserId userId2, List list, String str, String str2, String str3, int i2) {
        String str4 = (i2 & 32) != 0 ? null : str;
        String str5 = (i2 & 256) != 0 ? null : str2;
        String str6 = (i2 & 512) == 0 ? str3 : null;
        uft0Var.getClass();
        tfx tfxVar = new tfx("video.addToAlbum", new ly80(11), new bjl0(3));
        tfx.n(tfxVar, "owner_id", userId, 0L, 0L, 12);
        tfx.l(tfxVar, "video_id", i, 0, 0, 8);
        if (userId2 != null) {
            tfx.n(tfxVar, "target_id", userId2, 0L, 0L, 12);
        }
        if (list != null) {
            tfxVar.i("album_ids", list);
        }
        if (str4 != null) {
            tfx.o(tfxVar, "access_key", str4, 0, 0, 12);
        }
        if (str5 != null) {
            tfx.o(tfxVar, "screen_mode", str5, 0, 0, 12);
        }
        if (str6 != null) {
            tfx.o(tfxVar, "track_code", str6, 0, 0, 12);
        }
        return tfxVar;
    }

    static xy2 C(uft0 uft0Var, int i, UserId userId, String str, Boolean bool, Integer num, Integer num2, Integer num3, VideoGetCommentsExtendedSortDto videoGetCommentsExtendedSortDto, List list, Boolean bool2, Integer num4, Integer num5, int i2) {
        String str2 = (i2 & 4) != 0 ? null : str;
        Boolean bool3 = (i2 & 8) != 0 ? null : bool;
        Integer num6 = (i2 & 16) != 0 ? null : num;
        Boolean bool4 = (i2 & 1024) != 0 ? null : bool2;
        Integer num7 = (i2 & 2048) != 0 ? null : num4;
        Integer num8 = (i2 & 4096) == 0 ? num5 : null;
        uft0Var.getClass();
        tfx tfxVar = new tfx("video.getComments", new trk0(6), new xga0(9));
        tfx.l(tfxVar, "video_id", i, 0, 0, 8);
        if (userId != null) {
            tfx.n(tfxVar, "owner_id", userId, 0L, 0L, 12);
        }
        if (str2 != null) {
            tfx.o(tfxVar, "access_key", str2, 0, 0, 12);
        }
        if (bool3 != null) {
            tfxVar.j("need_likes", bool3.booleanValue());
        }
        if (num6 != null) {
            tfx.l(tfxVar, "start_comment_id", num6.intValue(), 0, 0, 12);
        }
        if (num2 != null) {
            tfx.l(tfxVar, SignalingProtocol.KEY_OFFSET, num2.intValue(), 0, 0, 12);
        }
        tfxVar.f(num3.intValue(), 0, 100, "count");
        if (videoGetCommentsExtendedSortDto != null) {
            tfx.o(tfxVar, "sort", videoGetCommentsExtendedSortDto.i(), 0, 0, 12);
        }
        tfxVar.j("extended", true);
        if (list != null) {
            tfxVar.i("fields", list);
        }
        if (bool4 != null) {
            tfxVar.j("toxic_supported", bool4.booleanValue());
        }
        if (num7 != null) {
            tfx.l(tfxVar, "comment_id", num7.intValue(), 0, 0, 12);
        }
        if (num8 != null) {
            tfxVar.f(num8.intValue(), 0, 10, "thread_items_count");
        }
        return tfxVar;
    }

    static xy2 b(uft0 uft0Var, UserId userId, int i, Boolean bool, String str, String str2, int i2) {
        String str3 = (i2 & 32) != 0 ? null : str2;
        String str4 = (i2 & 64) == 0 ? "button" : null;
        uft0Var.getClass();
        tfx tfxVar = new tfx("video.notInterested", new uul0(3), new tr(29));
        tfx.n(tfxVar, "owner_id", userId, 0L, 0L, 12);
        tfx.l(tfxVar, "video_id", i, 1, 0, 8);
        tfxVar.j("is_unset", bool.booleanValue());
        if (str != null) {
            tfx.o(tfxVar, "track_code", str, 0, 0, 12);
        }
        if (str3 != null) {
            tfx.o(tfxVar, "screen_mode", str3, 0, 0, 12);
        }
        if (str4 != null) {
            tfx.o(tfxVar, "event_source", str4, 0, 0, 12);
        }
        return tfxVar;
    }

    static xy2 d(uft0 uft0Var, String str, Integer num, String str2, String str3, String str4, int i) {
        if ((i & 4) != 0) {
            num = null;
        }
        uft0Var.getClass();
        tfx tfxVar = new tfx("video.getMusicMix", new iyo0(1), new sf3(28));
        if (str != null) {
            tfx.o(tfxVar, "source_video", str, 0, 0, 12);
        }
        if (num != null) {
            tfxVar.f(num.intValue(), 0, 10, "count");
        }
        if (str2 != null) {
            tfx.o(tfxVar, "payload", str2, 0, 0, 12);
        }
        if (str3 != null) {
            tfx.o(tfxVar, "ref", str3, 0, 0, 12);
        }
        if (str4 != null) {
            tfx.o(tfxVar, "track_code", str4, 0, 0, 12);
        }
        return tfxVar;
    }

    static xy2 f(uft0 uft0Var, UserId userId, int i, Integer num, Integer num2, String str, String str2, ArrayList arrayList, String str3, String str4, int i2) {
        ArrayList arrayList2 = (i2 & 512) != 0 ? null : arrayList;
        String str5 = (i2 & 2048) == 0 ? str4 : null;
        uft0Var.getClass();
        tfx tfxVar = new tfx("video.getSimilar", new jgj0(8), new zjh0(9));
        tfx.n(tfxVar, "owner_id", userId, 0L, 0L, 12);
        tfx.l(tfxVar, "video_id", i, 0, 0, 8);
        tfx.l(tfxVar, SignalingProtocol.KEY_OFFSET, num.intValue(), 0, 0, 8);
        tfxVar.f(num2.intValue(), 0, 50, "count");
        if (str != null) {
            tfx.o(tfxVar, "ref", str, 0, 0, 12);
        }
        if (str2 != null) {
            tfx.o(tfxVar, "track_code", str2, 0, 0, 12);
        }
        if (arrayList2 != null) {
            tfxVar.i("fields", arrayList2);
        }
        if (str3 != null) {
            tfx.o(tfxVar, "payload", str3, 0, 0, 12);
        }
        if (str5 != null) {
            tfx.o(tfxVar, "tab_id", str5, 0, 0, 12);
        }
        return tfxVar;
    }

    static xy2 k(uft0 uft0Var, UserId userId, int i, Integer num, Integer num2, String str, String str2, ArrayList arrayList, String str3, String str4, int i2) {
        Integer num3 = (i2 & 8) != 0 ? null : num;
        Integer num4 = (i2 & 16) != 0 ? null : num2;
        String str5 = (i2 & 32) != 0 ? null : str;
        String str6 = (i2 & 128) != 0 ? null : str2;
        ArrayList arrayList2 = (i2 & 512) != 0 ? null : arrayList;
        String str7 = (i2 & 1024) != 0 ? null : str3;
        String str8 = (i2 & 2048) == 0 ? str4 : null;
        uft0Var.getClass();
        tfx tfxVar = new tfx("video.getVideoDiscover", new rjk0(8), new fbj0(9));
        tfx.n(tfxVar, "owner_id", userId, 0L, 0L, 12);
        tfx.l(tfxVar, "video_id", i, 0, 0, 8);
        if (num3 != null) {
            tfx.l(tfxVar, SignalingProtocol.KEY_OFFSET, num3.intValue(), 0, 0, 8);
        }
        if (num4 != null) {
            tfxVar.f(num4.intValue(), 0, 50, "count");
        }
        if (str5 != null) {
            tfx.o(tfxVar, "ref", str5, 0, 0, 12);
        }
        if (str6 != null) {
            tfx.o(tfxVar, "track_code", str6, 0, 0, 12);
        }
        if (arrayList2 != null) {
            tfxVar.i("fields", arrayList2);
        }
        if (str7 != null) {
            tfx.o(tfxVar, "payload", str7, 0, 0, 12);
        }
        if (str8 != null) {
            tfx.o(tfxVar, "tab_id", str8, 0, 0, 12);
        }
        return tfxVar;
    }

    static xy2 l(uft0 uft0Var, UserId userId, Integer num, int i) {
        if ((i & 2) != 0) {
            num = null;
        }
        uft0Var.getClass();
        tfx tfxVar = new tfx("video.liveSubscribe", new caf0(4), new ck70(13));
        tfx.n(tfxVar, "owner_id", userId, 0L, 0L, 12);
        if (num != null) {
            tfx.l(tfxVar, "video_id", num.intValue(), 0, 0, 8);
        }
        return tfxVar;
    }

    static xy2 m(uft0 uft0Var, int i, UserId userId, String str, String str2, ArrayList arrayList, ArrayList arrayList2, Integer num, String str3, List list, Integer num2, int i2) {
        String str4 = (i2 & 4) != 0 ? null : str;
        String str5 = (i2 & 8) != 0 ? null : str2;
        ArrayList arrayList3 = (i2 & 16) != 0 ? null : arrayList;
        ArrayList arrayList4 = (i2 & 32) != 0 ? null : arrayList2;
        Integer num3 = (i2 & 1024) != 0 ? null : num;
        String str6 = (i2 & 4096) != 0 ? null : str3;
        List list2 = (131072 & i2) != 0 ? null : list;
        Integer num4 = (i2 & SQLiteDatabase.OPEN_PRIVATECACHE) == 0 ? num2 : null;
        uft0Var.getClass();
        tfx tfxVar = new tfx("video.edit", new ful0(5), new koi0(9));
        tfx.l(tfxVar, "video_id", i, 0, 0, 8);
        if (userId != null) {
            tfx.n(tfxVar, "owner_id", userId, 0L, 0L, 12);
        }
        if (str4 != null) {
            tfx.o(tfxVar, "name", str4, 0, 0, 12);
        }
        if (str5 != null) {
            tfx.o(tfxVar, CampaignEx.JSON_KEY_DESC, str5, 0, 0, 12);
        }
        if (arrayList3 != null) {
            tfxVar.i("privacy_view", arrayList3);
        }
        if (arrayList4 != null) {
            tfxVar.i("privacy_comment", arrayList4);
        }
        if (num3 != null) {
            tfx.l(tfxVar, "publish_date", num3.intValue(), 0, 0, 8);
        }
        if (str6 != null) {
            tfx.o(tfxVar, "ord_info", str6, 0, 0, 12);
        }
        if (list2 != null) {
            tfxVar.i("attach_short_videos", list2);
        }
        if (num4 != null) {
            tfx.l(tfxVar, "donut_level_id", num4.intValue(), 0, 0, 12);
        }
        return tfxVar;
    }

    static xy2 p(uft0 uft0Var, UserId userId, int i, Integer num, Integer num2, String str, String str2, ArrayList arrayList, String str3, int i2) {
        Integer num3 = (i2 & 8) != 0 ? null : num;
        Integer num4 = (i2 & 16) != 0 ? null : num2;
        String str4 = (i2 & 32) != 0 ? null : str;
        String str5 = (i2 & 128) != 0 ? null : str2;
        ArrayList arrayList2 = (i2 & 512) != 0 ? null : arrayList;
        String str6 = (i2 & 1024) == 0 ? str3 : null;
        uft0Var.getClass();
        tfx tfxVar = new tfx("video.getVideoDiscoverV2", new xul0(6), new bjn0(5));
        tfx.n(tfxVar, "owner_id", userId, 0L, 0L, 12);
        tfx.l(tfxVar, "video_id", i, 0, 0, 8);
        if (num3 != null) {
            tfx.l(tfxVar, SignalingProtocol.KEY_OFFSET, num3.intValue(), 0, 0, 8);
        }
        if (num4 != null) {
            tfxVar.f(num4.intValue(), 0, 50, "count");
        }
        if (str4 != null) {
            tfx.o(tfxVar, "ref", str4, 0, 0, 12);
        }
        if (str5 != null) {
            tfx.o(tfxVar, "track_code", str5, 0, 0, 12);
        }
        if (arrayList2 != null) {
            tfxVar.i("fields", arrayList2);
        }
        if (str6 != null) {
            tfx.o(tfxVar, "payload", str6, 0, 0, 12);
        }
        return tfxVar;
    }

    static xy2 s(uft0 uft0Var, ArrayList arrayList, List list, int i) {
        ArrayList arrayList2;
        if ((i & 2) != 0) {
            list = null;
        }
        uft0Var.getClass();
        tfx tfxVar = new tfx("video.getByIds", new s7o0(2), new joi0(8));
        if (arrayList != null) {
            tfxVar.i("videos", arrayList);
        }
        if (list != null) {
            List list2 = list;
            arrayList2 = new ArrayList(c5g.u(list2, 10));
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                arrayList2.add(((VideoGetByIdsVideoFieldsDto) it.next()).i());
            }
        } else {
            arrayList2 = null;
        }
        if (arrayList2 != null) {
            tfxVar.i("video_fields", arrayList2);
        }
        return tfxVar;
    }

    static xy2 y(uft0 uft0Var, int i, UserId userId, String str, Integer num, Integer num2, List list, int i2) {
        Boolean bool = Boolean.TRUE;
        String str2 = (i2 & 4) != 0 ? null : str;
        Integer num3 = (i2 & 16) != 0 ? null : num;
        Integer num4 = (i2 & 32) != 0 ? null : 0;
        if ((i2 & 512) != 0) {
            bool = null;
        }
        List list2 = (i2 & 1024) == 0 ? list : null;
        uft0Var.getClass();
        tfx tfxVar = new tfx("video.getComments", new trk0(5), new xga0(8));
        tfx.l(tfxVar, "video_id", i, 0, 0, 8);
        if (userId != null) {
            tfx.n(tfxVar, "owner_id", userId, 0L, 0L, 12);
        }
        if (str2 != null) {
            tfx.o(tfxVar, "access_key", str2, 0, 0, 12);
            tfxVar = tfxVar;
        }
        if (num3 != null) {
            tfx.l(tfxVar, "start_comment_id", num3.intValue(), 0, 0, 12);
        }
        if (num4 != null) {
            tfx.l(tfxVar, SignalingProtocol.KEY_OFFSET, num4.intValue(), 0, 0, 12);
        }
        tfxVar.f(num2.intValue(), 0, 100, "count");
        if (bool != null) {
            tfxVar.j("extended", bool.booleanValue());
        }
        if (list2 != null) {
            tfxVar.i("fields", list2);
        }
        return tfxVar;
    }

    default tfx A(int i, Long l) {
        tfx tfxVar = new tfx("video.getVideoMessageUploadInfo", new az60(10), new yil0(4));
        tfx.l(tfxVar, "shape_id", i, 1, 0, 8);
        tfx.m(tfxVar, "channel_id", l.longValue(), 0L, 8);
        return tfxVar;
    }

    default tfx D(Integer num, String str, Integer num2, UserId userId, List list) {
        tfx tfxVar = new tfx("video.getWatchTogetherOwnerVideos", new t3j0(6), new mft0());
        if (userId != null) {
            tfx.n(tfxVar, "owner_id", userId, 0L, 0L, 12);
        }
        tfx.l(tfxVar, "album_id", num.intValue(), -2, 0, 8);
        tfxVar.f(num2.intValue(), 0, 100, "count");
        if (str != null) {
            tfx.o(tfxVar, "start_from", str, 0, 0, 12);
        }
        tfxVar.j("extended", true);
        if (list != null) {
            tfxVar.i("fields", list);
        }
        return tfxVar;
    }

    default tfx a(int i, UserId userId, UserId userId2) {
        tfx tfxVar = new tfx("video.getAlbumsByVideo", new bt(28), new ct(29));
        tfx.n(tfxVar, "owner_id", userId, 0L, 0L, 12);
        tfx.l(tfxVar, "video_id", i, 0, 0, 8);
        if (userId2 != null) {
            tfx.n(tfxVar, "target_id", userId2, 0L, 0L, 12);
        }
        return tfxVar;
    }

    default tfx c(UserId userId, Integer num) {
        tfx tfxVar = new tfx("video.liveUnsubscribe", new uga0(6), new yu50(14));
        tfx.n(tfxVar, "owner_id", userId, 0L, 0L, 12);
        if (num != null) {
            tfx.l(tfxVar, "video_id", num.intValue(), 0, 0, 8);
        }
        return tfxVar;
    }

    default tfx e(UserId userId, Integer num, String str) {
        tfx tfxVar = new tfx("video.subscribeToAlbum", new bzk0(3), new ly80(12));
        tfx.n(tfxVar, "owner_id", userId, 0L, 0L, 12);
        tfx.l(tfxVar, "album_id", num.intValue(), 0, 0, 12);
        if (str != null) {
            tfx.o(tfxVar, "track_code", str, 0, 0, 12);
        }
        return tfxVar;
    }

    default tfx h(String str) {
        tfx tfxVar = new tfx("video.markOnboardingBannerAsViewed", new bjl0(4), new kft0(1));
        tfx.o(tfxVar, "block_id", str, 0, 0, 12);
        return tfxVar;
    }

    default tfx j(UserId userId) {
        tfx tfxVar = new tfx("video.getPrivacyDictionary", new umq0(3), new itj0(8));
        if (userId != null) {
            tfx.n(tfxVar, "group_id", userId, 1L, 0L, 8);
        }
        return tfxVar;
    }

    default tfx n(UserId userId, VideoSetNotificationsStatusStatusDto videoSetNotificationsStatusStatusDto) {
        tfx tfxVar = new tfx("video.setNotificationsStatus", new zil0(4), new vga0(8));
        tfx.n(tfxVar, "owner_id", userId, 0L, 0L, 12);
        tfx.o(tfxVar, "status", videoSetNotificationsStatusStatusDto.i(), 0, 0, 12);
        return tfxVar;
    }

    default tfx o(int i, UserId userId, String str, String str2, List list, Boolean bool, Integer num, Integer num2, String str3, String str4, Boolean bool2, String str5, String str6, UserId userId2, VideoCreateCommentScreenModeDto videoCreateCommentScreenModeDto) {
        tfx tfxVar = new tfx("video.createComment", new igj0(9), new b690(10));
        tfx.l(tfxVar, "video_id", i, 0, 0, 8);
        if (userId != null) {
            tfx.n(tfxVar, "owner_id", userId, 0L, 0L, 12);
        }
        if (str != null) {
            tfx.o(tfxVar, "access_key", str, 0, 0, 12);
        }
        if (str2 != null) {
            tfx.o(tfxVar, "message", str2, 0, 0, 12);
        }
        if (list != null) {
            tfxVar.i("attachments", list);
        }
        tfxVar.j("from_group", bool.booleanValue());
        if (num != null) {
            tfx.l(tfxVar, "reply_to_comment", num.intValue(), 0, 0, 8);
        }
        if (num2 != null) {
            tfx.l(tfxVar, "sticker_id", num2.intValue(), 0, 0, 8);
        }
        if (str3 != null) {
            tfx.o(tfxVar, "guid", str3, 0, 0, 12);
        }
        if (str4 != null) {
            tfx.o(tfxVar, "sticker_referrer", str4, 0, 0, 12);
        }
        if (bool2 != null) {
            tfxVar.j("live_special", bool2.booleanValue());
        }
        if (str5 != null) {
            tfx.o(tfxVar, "ref", str5, 0, 0, 12);
        }
        if (str6 != null) {
            tfx.o(tfxVar, "track_code", str6, 0, 0, 12);
        }
        if (userId2 != null) {
            tfx.n(tfxVar, "from_owner_id", userId2, 0L, 0L, 12);
        }
        if (videoCreateCommentScreenModeDto != null) {
            tfx.o(tfxVar, "screen_mode", videoCreateCommentScreenModeDto.i(), 0, 0, 12);
        }
        return tfxVar;
    }

    default tfx q(int i, UserId userId, String str, String str2, String str3, String str4, Integer num, Boolean bool, VideoViewSegmentsStateStartDto videoViewSegmentsStateStartDto, VideoViewSegmentsStateEndDto videoViewSegmentsStateEndDto, VideoViewSegmentsEndStreamReasonDto videoViewSegmentsEndStreamReasonDto, String str5, Boolean bool2) {
        tfx tfxVar = new tfx("video.viewSegments", new ky80(11), new ajl0(5));
        tfx.l(tfxVar, "video_id", i, 0, 0, 8);
        tfx.n(tfxVar, "owner_id", userId, 0L, 0L, 12);
        tfx.o(tfxVar, "ranges", str, 0, ConnectionResult.NETWORK_ERROR, 4);
        tfx.l(tfxVar, "search_pos", 0, 0, 0, 12);
        if (str2 != null) {
            tfx.o(tfxVar, "ref", str2, 0, 0, 12);
        }
        if (str3 != null) {
            tfx.o(tfxVar, "context", str3, 0, 0, 12);
        }
        if (str4 != null) {
            tfx.o(tfxVar, "track_code", str4, 0, 0, 12);
        }
        tfx.l(tfxVar, "start_time", num.intValue(), 0, 0, 8);
        tfxVar.j("is_autoplay", bool.booleanValue());
        if (videoViewSegmentsStateStartDto != null) {
            tfx.o(tfxVar, "state_start", videoViewSegmentsStateStartDto.i(), 0, 0, 12);
        }
        if (videoViewSegmentsStateEndDto != null) {
            tfx.o(tfxVar, "state_end", videoViewSegmentsStateEndDto.i(), 0, 0, 12);
        }
        if (videoViewSegmentsEndStreamReasonDto != null) {
            tfx.o(tfxVar, "end_stream_reason", videoViewSegmentsEndStreamReasonDto.i(), 0, 0, 12);
        }
        if (str5 != null) {
            tfx.o(tfxVar, "prev_video_id", str5, 0, 0, 12);
        }
        tfxVar.j("muted", bool2.booleanValue());
        return tfxVar;
    }

    default tfx r(int i, UserId userId, UserId userId2) {
        tfx tfxVar = new tfx("video.getAlbumsByVideo", new bbs0(1), new zzq0(3));
        tfx.n(tfxVar, "owner_id", userId, 0L, 0L, 12);
        tfx.l(tfxVar, "video_id", i, 0, 0, 8);
        if (userId2 != null) {
            tfx.n(tfxVar, "target_id", userId2, 0L, 0L, 12);
        }
        tfxVar.j("extended", true);
        return tfxVar;
    }

    default tfx t(UserId userId, Integer num, Integer num2) {
        tfx tfxVar = new tfx("video.getAlbums", new hbn0(2), new rft0(0));
        if (userId != null) {
            tfx.n(tfxVar, "owner_id", userId, 0L, 0L, 12);
        }
        if (num != null) {
            tfx.l(tfxVar, SignalingProtocol.KEY_OFFSET, num.intValue(), 0, 0, 8);
        }
        tfxVar.f(num2.intValue(), 0, 100, "count");
        tfxVar.j("extended", true);
        return tfxVar;
    }

    default tfx u(UserId userId, Integer num, String str) {
        tfx tfxVar = new tfx("video.unsubscribeFromAlbum", new sni0(8), new gsi0(5));
        tfx.n(tfxVar, "owner_id", userId, 0L, 0L, 12);
        tfx.l(tfxVar, "album_id", num.intValue(), 0, 0, 12);
        if (str != null) {
            tfx.o(tfxVar, "track_code", str, 0, 0, 12);
        }
        return tfxVar;
    }

    default tfx v(int i, UserId userId) {
        tfx tfxVar = new tfx("video.getAlbumById", new aoq0(3), new cjl0(3));
        tfx.l(tfxVar, "album_id", i, 0, 0, 12);
        if (userId != null) {
            tfx.n(tfxVar, "owner_id", userId, 0L, 0L, 12);
        }
        return tfxVar;
    }

    default tfx w(int i, UserId userId) {
        tfx tfxVar = new tfx("video.getVideoForEdit", new zq(29), new pft0(0));
        tfx.l(tfxVar, "video_id", i, 1, 0, 8);
        if (userId != null) {
            tfx.n(tfxVar, "owner_id", userId, 0L, 0L, 12);
        }
        return tfxVar;
    }

    default tfx x(UserId userId, int i, String str, String str2, ArrayList arrayList, ArrayList arrayList2, Boolean bool, Integer num, String str3, ArrayList arrayList3, Integer num2) {
        tfx tfxVar = new tfx("video.publish", new qmk0(4), new bz60(13));
        tfx.n(tfxVar, "owner_id", userId, 0L, 0L, 12);
        tfx.l(tfxVar, "video_id", i, 1, 0, 8);
        if (str != null) {
            tfx.o(tfxVar, "description", str, 0, 0, 12);
        }
        if (str2 != null) {
            tfx.o(tfxVar, "title", str2, 0, 0, 12);
        }
        tfxVar.i("privacy_video", arrayList);
        tfxVar.i("privacy_video_comments", arrayList2);
        tfxVar.j("add_to_wall", bool.booleanValue());
        tfx.l(tfxVar, "publish_at", num.intValue(), 0, 0, 8);
        tfx.o(tfxVar, "ord_info", str3, 0, 0, 12);
        tfxVar.i("attach_short_videos", arrayList3);
        if (num2 != null) {
            tfx.l(tfxVar, "donut_level_id", num2.intValue(), 0, 0, 12);
        }
        return tfxVar;
    }

    default tfx z(UserId userId, int i, UserId userId2, List list) {
        tfx tfxVar = new tfx("video.removeFromAlbum", new pq(27), new iun0(8));
        tfx.n(tfxVar, "owner_id", userId, 0L, 0L, 12);
        tfx.l(tfxVar, "video_id", i, 0, 0, 8);
        if (userId2 != null) {
            tfx.n(tfxVar, "target_id", userId2, 0L, 0L, 12);
        }
        if (list != null) {
            tfxVar.i("album_ids", list);
        }
        return tfxVar;
    }
}
