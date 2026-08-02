package xsna;

import com.vk.dto.common.id.UserId;
import com.vk.dto.photo.Photo;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;

/* compiled from: PhotosGetUserPhotos.kt */
/* loaded from: classes15.dex */
public final class ifa0 extends pug0<Photo> {
    public ifa0(int i, int i2, UserId userId, boolean z) {
        super("photos.getUserPhotos", Photo.R);
        F(userId, "user_id");
        C(i, SignalingProtocol.KEY_OFFSET);
        C(i2, "count");
        C(1, "extended");
        C(!z ? 1 : 0, "sort");
        C(1, "photo_sizes");
    }
}
