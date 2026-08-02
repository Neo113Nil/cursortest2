package xsna;

import com.vk.dto.common.id.UserId;

/* compiled from: PoolsGetPhotoUploadServer.kt */
/* loaded from: classes15.dex */
public final class xvb0 extends nd6 {
    public xvb0(UserId userId) {
        super("polls.getPhotoUploadServer");
        if (fkq0.c(userId)) {
            F(userId, "owner_id");
        }
    }
}
