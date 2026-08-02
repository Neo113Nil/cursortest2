package xsna;

import com.vk.dto.common.id.UserId;

/* compiled from: GroupsBanUser.java */
/* loaded from: classes15.dex */
public final class bpu extends xsg0 {
    public bpu(UserId userId, UserId userId2, boolean z, int i, int i2, String str, boolean z2) {
        super(z ? "groups.ban" : "groups.unban");
        F(userId, "group_id");
        F(userId2, "owner_id");
        if (z) {
            if (i > 0) {
                K("end_date", i + "");
            }
            K("reason", i2 + "");
            K("comment", str);
            K("comment_visible", z2 ? "1" : "0");
        }
    }
}
