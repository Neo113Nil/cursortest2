package xsna;

import com.vk.dto.common.id.UserId;
import com.vk.dto.photo.Photo;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;

/* compiled from: PhotosGetAll.java */
/* loaded from: classes15.dex */
public final class zea0 extends pug0<Photo> {
    public zea0(UserId userId, int i, int i2) {
        super("photos.getAll", Photo.R);
        if (fkq0.c(userId)) {
            F(userId, "owner_id");
        }
        C(i, SignalingProtocol.KEY_OFFSET);
        C(i2, "count");
        C(1, "extended");
        C(1, "photo_sizes");
        C(1, "need_hidden");
    }
}
