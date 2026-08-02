package xsna;

import com.vk.dto.common.VideoAlbum;
import com.vk.dto.common.id.UserId;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;

/* compiled from: VideoGetAlbums.java */
/* loaded from: classes15.dex */
public final class ens0 extends pug0<VideoAlbum> {
    public ens0(UserId userId, int i, int i2) {
        super("video.getAlbums", VideoAlbum.k);
        F(userId, "owner_id");
        C(i2, "count");
        C(i, SignalingProtocol.KEY_OFFSET);
        C(1, "extended");
    }
}
