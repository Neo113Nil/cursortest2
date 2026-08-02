package xsna;

import com.vk.dto.group.Group;
import com.vk.dto.group.GroupSuggestion;
import com.vkontakte.android.data.b;
import org.chromium.base.TimeUtils;

/* compiled from: GroupsAnalytics.kt */
/* loaded from: classes17.dex */
public final class apu {
    public static void a(String str, GroupSuggestion groupSuggestion, String str2) {
        StringBuilder b = ho8.b(str, "_view:");
        Group group = groupSuggestion.b;
        b.append(group.c);
        b.append(':');
        b.append(str2);
        b.append(':');
        String str3 = groupSuggestion.e;
        b.append(str3);
        String sb = b.toString();
        if (com.vkontakte.android.data.b.i(sb)) {
            return;
        }
        b.d dVar = new b.d(str);
        dVar.b(group.c, "group_id");
        dVar.b(str3, "track_code");
        dVar.b(str2, "ref");
        dVar.e();
        com.vkontakte.android.data.b.e(TimeUtils.MILLISECONDS_PER_DAY, sb);
    }
}
