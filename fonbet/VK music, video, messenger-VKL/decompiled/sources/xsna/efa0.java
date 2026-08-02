package xsna;

import com.vk.dto.common.id.UserId;

/* compiled from: PhotosGetOwnerPhotoUploadServerGU.kt */
/* loaded from: classes15.dex */
public final class efa0 extends nd6 {
    public efa0(UserId userId) {
        super("photos.getOwnerPhotoUploadServer");
        if (fkq0.b(userId)) {
            F(userId, "owner_id");
        }
        R("upload_v2", true);
    }
}
