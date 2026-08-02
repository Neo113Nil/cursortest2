package xsna;

import com.vk.dto.common.id.UserId;
import com.vkontakte.android.data.b;
import java.util.Set;

/* compiled from: ProfileTracker.kt */
/* loaded from: classes5.dex */
public final class p0e0 {
    public static final Set<String> a = rl3.y0(new String[]{"stories", "photos", "videos", "audios", "podcasts", "docs", "market", "topics", "articles", "classifieds"});

    @ozl
    public static final void a(UserId userId, String str, String str2) {
        b.d a2 = io.reactivex.rxjava3.processors.b.a("groups_action_button", "action", str);
        a2.b(Long.valueOf(-userId.b), "group_id");
        a2.b(str2, "source");
        a2.e();
    }

    @ozl
    public static final void b(UserId userId, String str) {
        long j = userId.b;
        if (j >= 0) {
            return;
        }
        b.d a2 = io.reactivex.rxjava3.processors.b.a("open_screen", "name", str);
        a2.b(Long.valueOf(-j), "group_id");
        a2.e();
    }

    @ozl
    public static final void c(UserId userId, String str) {
        long j = userId.b;
        if (j >= 0) {
            return;
        }
        b.d a2 = io.reactivex.rxjava3.processors.b.a("open_screen", "name", "messages_group");
        a2.b(Long.valueOf(-j), "group_id");
        a2.b(str, "source");
        a2.e();
    }
}
