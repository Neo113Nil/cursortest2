package xsna;

import com.vk.core.ui.tracking.UiTracker;
import com.vk.dto.common.id.UserId;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.SchemeStat$EventItem;
import com.vk.stat.scheme.SchemeStat$TypeClick;
import com.vk.stat.scheme.SchemeStat$TypeQuestionItem;

/* compiled from: QuestionAnalyticHelper.kt */
/* loaded from: classes5.dex */
public final class mpe0 {
    public static void a(SchemeStat$TypeQuestionItem.Type type, UserId userId, UserId userId2, Integer num, String str, Boolean bool) {
        SchemeStat$TypeClick b = SchemeStat$TypeClick.a.b(new SchemeStat$EventItem(SchemeStat$EventItem.Type.CLICK_ITEM, num != null ? Long.valueOf(num.intValue()) : null, null, null, null, null, 60, null), new SchemeStat$TypeQuestionItem(type, userId2 != null ? Long.valueOf(userId2.b) : null, userId != null ? Long.valueOf(userId.b) : null, str, null, null, bool, 48, null), 2);
        UiTracker uiTracker = UiTracker.a;
        MobileOfficialAppsCoreNavStat$EventScreen c = UiTracker.c();
        uzp0 uzp0Var = UiTracker.h;
        uzp0Var.getClass();
        new bjc(c, b, uzp0Var.a).q();
    }

    public static /* synthetic */ void b(SchemeStat$TypeQuestionItem.Type type, UserId userId, UserId userId2, Integer num, String str, Boolean bool, int i) {
        if ((i & 4) != 0) {
            userId2 = null;
        }
        if ((i & 8) != 0) {
            num = null;
        }
        if ((i & 16) != 0) {
            str = null;
        }
        if ((i & 32) != 0) {
            bool = null;
        }
        a(type, userId, userId2, num, str, bool);
    }
}
