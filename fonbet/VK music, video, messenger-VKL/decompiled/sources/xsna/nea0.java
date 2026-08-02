package xsna;

import com.vk.dto.common.id.UserId;

/* compiled from: PhotosConfirmTag.java */
/* loaded from: classes15.dex */
public final class nea0 extends xsg0 {
    public nea0(UserId userId, int i, int i2) {
        super("photos.confirmTag");
        F(userId, "owner_id");
        C(i, "photo_id");
        C(i2, "tag_id");
    }
}
