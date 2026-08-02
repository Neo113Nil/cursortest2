package xsna;

import android.text.TextUtils;
import com.vk.dto.common.id.UserId;

/* compiled from: NewsfeedAddBan.java */
/* loaded from: classes15.dex */
public final class lc60 extends xsg0 {
    public lc60(UserId userId, String str) {
        super("newsfeed.addBan");
        if (!TextUtils.isEmpty(str)) {
            K("ref", str);
        }
        TextUtils.isEmpty(null);
        if (userId.b > 0) {
            F(userId, "user_ids");
        } else {
            F(fkq0.e(userId), "group_ids");
        }
        K("type", "always");
    }
}
