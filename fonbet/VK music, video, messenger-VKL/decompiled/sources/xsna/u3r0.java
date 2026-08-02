package xsna;

import com.vk.libvideo.video.queue.api.model.related.VideoRelatedVideosLoopMode;
import com.vk.voip.utils.ics.Freq;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

/* compiled from: utils.kt */
/* loaded from: classes7.dex */
public final class u3r0 {
    public static final VideoRelatedVideosLoopMode a(VideoRelatedVideosLoopMode videoRelatedVideosLoopMode) {
        zrp<VideoRelatedVideosLoopMode> h = VideoRelatedVideosLoopMode.h();
        int indexOf = VideoRelatedVideosLoopMode.h().indexOf(videoRelatedVideosLoopMode) + 1;
        return (VideoRelatedVideosLoopMode) ((indexOf < 0 || indexOf >= h.size()) ? (VideoRelatedVideosLoopMode) j5g.Y(VideoRelatedVideosLoopMode.h()) : h.get(indexOf));
    }

    public static final String b(q5o q5oVar, TimeZone timeZone) {
        StringBuilder sb = new StringBuilder("FREQ=");
        sb.append(((Freq) q5oVar.c).h());
        sb.append(";");
        if (((Date) q5oVar.b) != null) {
            sb.append("UNTIL=");
            Date date = (Date) q5oVar.b;
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMdd'T'HHmmss'Z'");
            simpleDateFormat.setTimeZone(timeZone);
            sb.append(simpleDateFormat.format(date));
            sb.append(";");
        }
        sb.append("INTERVAL=1");
        return sb.toString();
    }

    public static xy2 c(u3r0 u3r0Var, String str, int i) {
        if ((i & 2) != 0) {
            str = null;
        }
        String str2 = str;
        u3r0Var.getClass();
        tfx tfxVar = new tfx("vmoji.getAvatar", new thl0(10), new qjk0(9));
        if (str2 != null) {
            tfx.o(tfxVar, "avatar_id", str2, 0, 0, 12);
        }
        return tfxVar;
    }

    public tfx d(String str) {
        tfx tfxVar = new tfx("vmoji.getCharacterById", new rjk0(9), new fbj0(10));
        tfx.o(tfxVar, "character_id", str, 0, 0, 12);
        tfxVar.j("with_stickers", true);
        return tfxVar;
    }

    public tfx e() {
        return new tfx("vmoji.getPhotoUploadUrl", new wul0(6), new koi0(10));
    }

    public tfx f(String str) {
        tfx tfxVar = new tfx("vmoji.getStickerPacksRecommendationBlock", new s7o0(3), new joi0(9));
        tfx.o(tfxVar, "block_id", str, 0, 0, 12);
        return tfxVar;
    }

    public tfx g(String str, boolean z) {
        tfx tfxVar = new tfx("vmoji.setAvatarState", new x6t0(3), new hun0(5));
        tfx.o(tfxVar, "avatar_id", str, 0, 0, 12);
        tfxVar.j("is_active", z);
        return tfxVar;
    }
}
