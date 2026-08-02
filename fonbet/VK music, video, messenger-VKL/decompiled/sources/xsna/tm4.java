package xsna;

import com.vk.dto.common.id.UserId;

/* compiled from: AudioDeletePlaylistCoverPhoto.kt */
/* loaded from: classes14.dex */
public final class tm4 extends xsg0 {
    public tm4(UserId userId, int i) {
        super("video.deleteAlbum");
        C(i, "album_id");
        if (userId.b < 0) {
            F(fkq0.e(userId), "group_id");
        }
    }
}
