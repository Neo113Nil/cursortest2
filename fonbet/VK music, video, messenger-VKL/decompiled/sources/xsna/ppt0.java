package xsna;

import com.vk.api.generated.video.dto.VideoVideoFullDto;
import com.vk.dto.common.ClipVideoFile;
import com.vk.dto.common.VideoFileOld;
import com.vk.dto.common.id.UserId;
import com.vk.dto.music.MusicTrack;
import com.vk.dto.newsfeed.Owner;
import com.vkontakte.android.attachments.VideoAttachment;
import java.util.Map;
import xsna.xod;

/* compiled from: VideoVideoFullDtoToVideoAttachmentMapper.kt */
/* loaded from: classes3.dex */
public final class ppt0 {
    public final ibr0 a;

    public ppt0(ibr0 ibr0Var) {
        this.a = ibr0Var;
    }

    public final VideoAttachment a(VideoVideoFullDto videoVideoFullDto, Map<UserId, Owner> map) {
        Owner owner;
        VideoFileOld d = ums0.d(ums0.a, videoVideoFullDto, map, null, null, 28);
        if (d instanceof ClipVideoFile) {
            ClipVideoFile clipVideoFile = (ClipVideoFile) d;
            MusicTrack musicTrack = clipVideoFile.D1;
            String str = clipVideoFile.m;
            ibr0 ibr0Var = this.a;
            clipVideoFile.U1 = xod.a.a(ibr0Var, str, null, false, 14);
            if (musicTrack != null) {
                clipVideoFile.V1 = ibr0Var.b(musicTrack.d);
                clipVideoFile.W1 = ibr0Var.c(musicTrack);
            }
        }
        if (map != null && (owner = map.get(d.b)) != null) {
            d.f1(owner);
        }
        return new VideoAttachment(d);
    }
}
