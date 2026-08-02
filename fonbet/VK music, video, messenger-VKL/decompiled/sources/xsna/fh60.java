package xsna;

import com.vk.dto.common.id.UserId;

/* compiled from: NewsfeedDeleteBan.java */
/* loaded from: classes15.dex */
public final class fh60 extends xsg0 {
    public fh60(UserId userId) {
        super("newsfeed.deleteBan");
        if (userId.b > 0) {
            F(userId, "user_ids");
        } else {
            F(fkq0.e(userId), "group_ids");
        }
    }
}
