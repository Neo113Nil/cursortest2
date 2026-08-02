package xsna;

import com.vk.core.ui.tracking.UiTracker;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.MobileOfficialAppsGroupsStat$TypeGroupsEventItem;
import com.vk.stat.scheme.SchemeStat$EventItem;
import com.vk.stat.scheme.SchemeStat$TypeAction;
import com.vk.stat.scheme.SchemeStat$TypeClick;
import com.vk.stat.scheme.SchemeStat$TypeMessagingActionItem;

/* compiled from: ChannelsActionsReporterImpl.kt */
/* loaded from: classes5.dex */
public final class geb implements feb {
    @Override // xsna.feb
    public final void a(long j) {
        iid0 iid0Var = new iid0();
        UiTracker uiTracker = UiTracker.a;
        MobileOfficialAppsCoreNavStat$EventScreen c = UiTracker.c();
        SchemeStat$TypeAction b = SchemeStat$TypeAction.a.b(null, null, new SchemeStat$TypeMessagingActionItem(SchemeStat$TypeMessagingActionItem.ActionType.ENABLE_NOTIFICATIONS_CHANNEL, null, null, null, null, Long.valueOf(j), null, null, null, null, null, null, 4062, null), 3);
        iid0Var.f = c;
        iid0Var.g = b;
        iid0Var.q();
    }

    @Override // xsna.feb
    public final void b(long j) {
        SchemeStat$TypeClick b = SchemeStat$TypeClick.a.b(new SchemeStat$EventItem(SchemeStat$EventItem.Type.CLICK_ITEM, null, Long.valueOf(j), null, null, null, 58, null), MobileOfficialAppsGroupsStat$TypeGroupsEventItem.a.a(j, MobileOfficialAppsGroupsStat$TypeGroupsEventItem.Source.MESSENGER_RECOMMENDATION, null, new com.vk.stat.scheme.d0(), 28), 2);
        UiTracker uiTracker = UiTracker.a;
        MobileOfficialAppsCoreNavStat$EventScreen c = UiTracker.c();
        uzp0 uzp0Var = UiTracker.h;
        uzp0Var.getClass();
        new bjc(c, b, uzp0Var.a).q();
    }

    @Override // xsna.feb
    public final void c(long j) {
        iid0 iid0Var = new iid0();
        UiTracker uiTracker = UiTracker.a;
        MobileOfficialAppsCoreNavStat$EventScreen c = UiTracker.c();
        SchemeStat$TypeAction b = SchemeStat$TypeAction.a.b(null, null, new SchemeStat$TypeMessagingActionItem(SchemeStat$TypeMessagingActionItem.ActionType.DISABLE_NOTIFICATIONS_CHANNEL, null, null, null, null, Long.valueOf(j), null, null, null, null, null, null, 4062, null), 3);
        iid0Var.f = c;
        iid0Var.g = b;
        iid0Var.q();
    }

    @Override // xsna.feb
    public final void d(long j) {
        iid0 iid0Var = new iid0();
        UiTracker uiTracker = UiTracker.a;
        MobileOfficialAppsCoreNavStat$EventScreen c = UiTracker.c();
        SchemeStat$TypeAction b = SchemeStat$TypeAction.a.b(null, null, new SchemeStat$TypeMessagingActionItem(SchemeStat$TypeMessagingActionItem.ActionType.CANCEL_LEAVE_CHANNEL, null, null, null, null, Long.valueOf(j), null, null, null, null, null, null, 4062, null), 3);
        iid0Var.f = c;
        iid0Var.g = b;
        iid0Var.q();
    }

    @Override // xsna.feb
    public final void e(long j, boolean z) {
        UiTracker uiTracker = UiTracker.a;
        MobileOfficialAppsCoreNavStat$EventScreen c = UiTracker.c();
        if (c == MobileOfficialAppsCoreNavStat$EventScreen.NOWHERE) {
            c = null;
        }
        if (c == null) {
            c = MobileOfficialAppsCoreNavStat$EventScreen.OTHER;
        }
        iid0 iid0Var = new iid0();
        SchemeStat$TypeAction b = SchemeStat$TypeAction.a.b(null, null, new SchemeStat$TypeMessagingActionItem(SchemeStat$TypeMessagingActionItem.ActionType.CHANGE_STORY, null, Integer.valueOf((int) j), null, null, Long.valueOf(j), null, null, Boolean.valueOf(z), null, null, null, 3802, null), 3);
        iid0Var.f = c;
        iid0Var.g = b;
        iid0Var.q();
    }
}
