package xsna;

import com.vk.core.ui.tracking.UiTracker;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.SchemeStat$EventItem;
import com.vk.stat.scheme.SchemeStat$TypeClick;
import com.vk.stat.scheme.SchemeStat$TypeVideoMiniplayerItem;

/* compiled from: VideoMiniPlayerTracker.kt */
/* loaded from: classes3.dex */
public final class sts0 {
    public final rqs0 a;
    public final dac0 b;

    public sts0(rqs0 rqs0Var, dac0 dac0Var) {
        this.a = rqs0Var;
        this.b = dac0Var;
    }

    public final void a(SchemeStat$TypeVideoMiniplayerItem.EventType eventType) {
        Long l = (Long) this.a.invoke();
        slt0 slt0Var = (slt0) this.b.invoke();
        if (slt0Var != null) {
            SchemeStat$TypeClick b = SchemeStat$TypeClick.a.b(new SchemeStat$EventItem(SchemeStat$EventItem.Type.VIDEO, Long.valueOf(r2.o0()), Long.valueOf(slt0Var.a.I0().b), null, slt0Var.b, null, 40, null), new SchemeStat$TypeVideoMiniplayerItem(eventType, l != null ? Integer.valueOf((int) (l.longValue() / 1000)) : null), 2);
            UiTracker uiTracker = UiTracker.a;
            MobileOfficialAppsCoreNavStat$EventScreen c = UiTracker.c();
            uzp0 uzp0Var = UiTracker.h;
            uzp0Var.getClass();
            new bjc(c, b, uzp0Var.a).q();
        }
    }
}
