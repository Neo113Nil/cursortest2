package xsna;

import com.vk.dto.common.id.UserId;
import com.vkontakte.android.data.b;

/* compiled from: UsersDiscoverAnalytics.kt */
/* loaded from: classes13.dex */
public final class q0r0 {
    public static void a(UserId userId, String str) {
        b.d dVar = new b.d("friend_swipe_open");
        if (str != null && str.length() != 0) {
            dVar.b(str, "source");
        }
        if (fkq0.c(userId)) {
            dVar.b(userId, "user_id");
        }
        dVar.e();
    }
}
