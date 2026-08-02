package xsna;

import com.vk.dto.common.id.UserId;

/* compiled from: PhotosDelete.java */
/* loaded from: classes15.dex */
public final class rea0 extends xsg0 {
    public rea0(UserId userId, int i) {
        super("photos.delete");
        F(userId, "owner_id");
        C(i, "photo_id");
    }
}
