package xsna;

import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.vk.api.generated.video.dto.VideoGetFromAlbumSortAlbumDto;
import com.vk.dto.common.id.UserId;
import java.util.ArrayList;
import java.util.List;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.tft0;

/* compiled from: VideoService.kt */
/* loaded from: classes.dex */
public interface sft0 {

    /* compiled from: VideoService.kt */
    /* loaded from: classes17.dex */
    public static final class a {
        public static vfx a(UserId userId, List list, Integer num, Integer num2, Integer num3, Boolean bool, List list2, Boolean bool2) {
            vfx vfxVar = new vfx("video.get", new oft0(1), new k2s0(4));
            if (userId != null) {
                vfx.l(vfxVar, "owner_id", userId, 12);
            }
            if (list != null) {
                vfxVar.i("videos", list);
            }
            if (num != null) {
                vfx.k(vfxVar, "album_id", num.intValue(), 0, 12);
            }
            if (num2 != null) {
                vfxVar.f(num2.intValue(), 0, 200, "count");
            }
            if (num3 != null) {
                vfx.k(vfxVar, SignalingProtocol.KEY_OFFSET, num3.intValue(), 0, 8);
            }
            if (bool != null) {
                vfxVar.j("extended", bool.booleanValue());
            }
            if (list2 != null) {
                vfxVar.i("fields", list2);
            }
            if (bool2 != null) {
                vfxVar.j("filter_can_play", bool2.booleanValue());
            }
            return vfxVar;
        }

        public static /* synthetic */ xy2 b(sft0 sft0Var, UserId userId, List list, Integer num, Integer num2, Integer num3, Boolean bool, List list2, int i) {
            Boolean bool2 = Boolean.TRUE;
            if ((i & 1) != 0) {
                userId = null;
            }
            if ((i & 8) != 0) {
                list = null;
            }
            if ((i & 16) != 0) {
                num = null;
            }
            if ((i & 64) != 0) {
                num2 = null;
            }
            if ((i & 128) != 0) {
                num3 = null;
            }
            if ((i & 1024) != 0) {
                bool = null;
            }
            if ((i & 2048) != 0) {
                list2 = null;
            }
            return sft0Var.i(userId, list, num, num2, num3, bool, list2, (i & ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0 ? null : bool2);
        }

        public static vfx c(int i, UserId userId, Integer num, Integer num2, String str, VideoGetFromAlbumSortAlbumDto videoGetFromAlbumSortAlbumDto, String str2, Integer num3, String str3, Boolean bool, List list) {
            vfx vfxVar = new vfx("video.getFromAlbum", new g7r0(3), new bbs0(2));
            vfx.k(vfxVar, "album_id", i, 0, 12);
            if (userId != null) {
                vfx.l(vfxVar, "owner_id", userId, 12);
            }
            if (num != null) {
                vfxVar.f(num.intValue(), 1, 200, "count");
            }
            if (num2 != null) {
                vfx.k(vfxVar, SignalingProtocol.KEY_OFFSET, num2.intValue(), 0, 8);
            }
            if (str != null) {
                vfx.m(vfxVar, "track_code", str, 0, 12);
            }
            if (videoGetFromAlbumSortAlbumDto != null) {
                vfx.k(vfxVar, "sort_album", videoGetFromAlbumSortAlbumDto.i(), 0, 12);
            }
            if (str2 != null) {
                vfx.m(vfxVar, "focus_on_video", str2, 0, 12);
            }
            if (num3 != null) {
                vfx.k(vfxVar, "shuffle_key", num3.intValue(), 0, 12);
            }
            if (str3 != null) {
                vfx.m(vfxVar, "shuffle_first_video", str3, 0, 12);
            }
            if (bool != null) {
                vfxVar.j("extended", bool.booleanValue());
            }
            if (list != null) {
                vfxVar.i("fields", list);
            }
            return vfxVar;
        }

        public static xy2 d(uft0 uft0Var, int i, UserId userId, Integer num, Integer num2, String str, VideoGetFromAlbumSortAlbumDto videoGetFromAlbumSortAlbumDto, String str2, Integer num3, String str3, ArrayList arrayList, int i2) {
            Boolean bool = Boolean.TRUE;
            if ((i2 & 4) != 0) {
                num = null;
            }
            if ((i2 & 8) != 0) {
                num2 = null;
            }
            if ((i2 & 16) != 0) {
                str = null;
            }
            if ((i2 & 32) != 0) {
                videoGetFromAlbumSortAlbumDto = null;
            }
            if ((i2 & 64) != 0) {
                str2 = null;
            }
            if ((i2 & 128) != 0) {
                num3 = null;
            }
            if ((i2 & 256) != 0) {
                str3 = null;
            }
            if ((i2 & 512) != 0) {
                bool = null;
            }
            if ((i2 & 1024) != 0) {
                arrayList = null;
            }
            uft0Var.getClass();
            return tft0.a.b(i, userId, num, num2, str, videoGetFromAlbumSortAlbumDto, str2, num3, str3, bool, arrayList);
        }
    }

    vfx i(UserId userId, List list, Integer num, Integer num2, Integer num3, Boolean bool, List list2, Boolean bool2);
}
