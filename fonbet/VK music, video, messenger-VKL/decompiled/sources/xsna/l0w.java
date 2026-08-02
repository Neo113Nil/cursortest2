package xsna;

import com.vk.core.ui.tracking.UiTracker;
import com.vk.dto.common.Peer;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.SchemeStat$TypeAction;
import com.vk.stat.scheme.SchemeStat$TypeMessagingActionItem;
import java.util.ArrayList;

/* compiled from: ImDialogsActionsReporterImpl.kt */
/* loaded from: classes5.dex */
public final class l0w implements k0w {
    public final bpn0 a = new bpn0(new i21(12));

    @Override // xsna.k0w
    public final void a(String str) {
        iid0 m = m();
        UiTracker uiTracker = UiTracker.a;
        MobileOfficialAppsCoreNavStat$EventScreen c = UiTracker.c();
        SchemeStat$TypeAction b = SchemeStat$TypeAction.a.b(null, null, new SchemeStat$TypeMessagingActionItem(SchemeStat$TypeMessagingActionItem.ActionType.OPEN_FOLDER, null, null, null, null, null, null, str, null, null, null, null, 3966, null), 3);
        m.f = c;
        m.g = b;
        m.q();
    }

    @Override // xsna.k0w
    public final void b(long j) {
        iid0 m = m();
        UiTracker uiTracker = UiTracker.a;
        MobileOfficialAppsCoreNavStat$EventScreen c = UiTracker.c();
        SchemeStat$TypeAction b = SchemeStat$TypeAction.a.b(null, null, new SchemeStat$TypeMessagingActionItem(SchemeStat$TypeMessagingActionItem.ActionType.FIND_CLIP_IN_RESPONSE, null, Integer.valueOf((int) j), null, null, null, null, null, null, null, null, null, 4090, null), 3);
        m.f = c;
        m.g = b;
        m.q();
    }

    @Override // xsna.k0w
    public final void c(Peer peer, String str) {
        iid0 m = m();
        UiTracker uiTracker = UiTracker.a;
        MobileOfficialAppsCoreNavStat$EventScreen c = UiTracker.c();
        SchemeStat$TypeAction b = SchemeStat$TypeAction.a.b(null, null, new SchemeStat$TypeMessagingActionItem(SchemeStat$TypeMessagingActionItem.ActionType.CREATE_CHAT, str, Integer.valueOf((int) peer.b), null, null, null, null, null, null, null, null, null, 4088, null), 3);
        m.f = c;
        m.g = b;
        m.q();
    }

    @Override // xsna.k0w
    public final void d(long j) {
        iid0 m = m();
        UiTracker uiTracker = UiTracker.a;
        MobileOfficialAppsCoreNavStat$EventScreen c = UiTracker.c();
        SchemeStat$TypeAction b = SchemeStat$TypeAction.a.b(null, null, new SchemeStat$TypeMessagingActionItem(SchemeStat$TypeMessagingActionItem.ActionType.WATCH_CLIP_AGAIN, null, Integer.valueOf((int) j), null, null, null, null, null, null, null, null, null, 4090, null), 3);
        m.f = c;
        m.g = b;
        m.q();
    }

    @Override // xsna.k0w
    public final void e(long j, ArrayList arrayList) {
        iid0 m = m();
        UiTracker uiTracker = UiTracker.a;
        MobileOfficialAppsCoreNavStat$EventScreen c = UiTracker.c();
        SchemeStat$TypeAction b = SchemeStat$TypeAction.a.b(null, null, new SchemeStat$TypeMessagingActionItem(SchemeStat$TypeMessagingActionItem.ActionType.SEND_DRAFT_MESSAGE, null, Integer.valueOf((int) j), null, arrayList, null, null, null, null, null, null, null, 4074, null), 3);
        m.f = c;
        m.g = b;
        m.q();
    }

    @Override // xsna.k0w
    public final void f(long j, ArrayList arrayList) {
        iid0 m = m();
        UiTracker uiTracker = UiTracker.a;
        MobileOfficialAppsCoreNavStat$EventScreen c = UiTracker.c();
        SchemeStat$TypeAction b = SchemeStat$TypeAction.a.b(null, null, new SchemeStat$TypeMessagingActionItem(SchemeStat$TypeMessagingActionItem.ActionType.CREATE_DRAFT_MESSAGE, null, Integer.valueOf((int) j), null, arrayList, null, null, null, null, null, null, null, 4074, null), 3);
        m.f = c;
        m.g = b;
        m.q();
    }

    @Override // xsna.k0w
    public final void g(long j, ArrayList arrayList) {
        iid0 m = m();
        UiTracker uiTracker = UiTracker.a;
        MobileOfficialAppsCoreNavStat$EventScreen c = UiTracker.c();
        SchemeStat$TypeAction b = SchemeStat$TypeAction.a.b(null, null, new SchemeStat$TypeMessagingActionItem(SchemeStat$TypeMessagingActionItem.ActionType.DELETE_DRAFT_MESSAGE, null, Integer.valueOf((int) j), null, arrayList, null, null, null, null, null, null, null, 4074, null), 3);
        m.f = c;
        m.g = b;
        m.q();
    }

    @Override // xsna.k0w
    public final void h(long j, long j2) {
        iid0 m = m();
        UiTracker uiTracker = UiTracker.a;
        MobileOfficialAppsCoreNavStat$EventScreen c = UiTracker.c();
        SchemeStat$TypeAction b = SchemeStat$TypeAction.a.b(null, null, new SchemeStat$TypeMessagingActionItem(SchemeStat$TypeMessagingActionItem.ActionType.ATTEMPT_TO_REACT, null, null, null, null, Long.valueOf(j), Long.valueOf(j2), null, null, null, null, null, 3998, null), 3);
        m.f = c;
        m.g = b;
        m.q();
    }

    @Override // xsna.k0w
    public final void i(long j, String str) {
        iid0 m = m();
        UiTracker uiTracker = UiTracker.a;
        MobileOfficialAppsCoreNavStat$EventScreen c = UiTracker.c();
        SchemeStat$TypeAction b = SchemeStat$TypeAction.a.b(null, null, new SchemeStat$TypeMessagingActionItem(SchemeStat$TypeMessagingActionItem.ActionType.SHOW_DO_YOU_WANNA_REPLY_CHAT, null, null, null, null, Long.valueOf(j), null, str, null, null, null, null, 3934, null), 3);
        m.f = c;
        m.g = b;
        m.q();
    }

    @Override // xsna.k0w
    public final void j(long j) {
        iid0 m = m();
        UiTracker uiTracker = UiTracker.a;
        MobileOfficialAppsCoreNavStat$EventScreen c = UiTracker.c();
        SchemeStat$TypeAction b = SchemeStat$TypeAction.a.b(null, null, new SchemeStat$TypeMessagingActionItem(SchemeStat$TypeMessagingActionItem.ActionType.CLICK_ON_SETTINGS, null, null, null, null, Long.valueOf(j), null, null, null, null, null, null, 4062, null), 3);
        m.f = c;
        m.g = b;
        m.q();
    }

    @Override // xsna.k0w
    public final void k(long j, String str) {
        iid0 m = m();
        UiTracker uiTracker = UiTracker.a;
        MobileOfficialAppsCoreNavStat$EventScreen c = UiTracker.c();
        SchemeStat$TypeAction b = SchemeStat$TypeAction.a.b(null, null, new SchemeStat$TypeMessagingActionItem(SchemeStat$TypeMessagingActionItem.ActionType.CLICK_DO_YOU_WANNA_REPLY_CHAT, null, null, null, null, Long.valueOf(j), null, str, null, null, null, null, 3934, null), 3);
        m.f = c;
        m.g = b;
        m.q();
    }

    @Override // xsna.k0w
    public final void l(long j, long j2) {
        iid0 m = m();
        UiTracker uiTracker = UiTracker.a;
        MobileOfficialAppsCoreNavStat$EventScreen c = UiTracker.c();
        SchemeStat$TypeAction b = SchemeStat$TypeAction.a.b(null, null, new SchemeStat$TypeMessagingActionItem(SchemeStat$TypeMessagingActionItem.ActionType.STICKER_MENU_SHOW_DURATION, null, null, null, null, Long.valueOf(j), null, String.valueOf(j2), null, null, null, null, 3934, null), 3);
        m.f = c;
        m.g = b;
        m.q();
    }

    public final iid0 m() {
        return (iid0) this.a.getValue();
    }
}
