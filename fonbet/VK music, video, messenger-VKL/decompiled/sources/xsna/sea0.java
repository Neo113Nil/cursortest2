package xsna;

import com.vk.dto.common.id.UserId;

/* compiled from: PhotosDeleteAlbum.java */
/* loaded from: classes15.dex */
public final class sea0 extends xsg0 {
    public sea0(int i, UserId userId) {
        super("photos.deleteAlbum");
        C(i, "album_id");
        if (userId.b > 0) {
            F(userId, "group_id");
        }
    }
}
