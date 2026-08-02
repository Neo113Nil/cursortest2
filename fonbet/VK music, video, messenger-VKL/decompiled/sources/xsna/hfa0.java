package xsna;

import com.vk.dto.common.id.UserId;

/* compiled from: PhotosGetUploadServer.kt */
/* loaded from: classes15.dex */
public final class hfa0 extends nd6 {
    public hfa0(int i, UserId userId) {
        super("photos.getUploadServer");
        C(i, "album_id");
        if (fkq0.b(userId)) {
            F(fkq0.e(userId), "group_id");
        }
    }
}
