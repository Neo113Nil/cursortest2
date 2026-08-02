package xsna;

import com.vk.dto.common.id.UserId;
import com.vk.dto.photo.Photo;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;

/* compiled from: PhotosGet.java */
/* loaded from: classes15.dex */
public final class vea0 extends pug0<Photo> {
    public vea0(UserId userId, int i, int i2, int i3, boolean z) {
        super(i != 0 ? "photos.get" : "photos.getAll", Photo.R);
        C(i, "album_id");
        if (fkq0.c(userId)) {
            F(userId, "owner_id");
        }
        C(1, "extended");
        C(1, "photo_sizes");
        C(i2, SignalingProtocol.KEY_OFFSET);
        C(i3, "count");
        R("rev", z);
    }
}
