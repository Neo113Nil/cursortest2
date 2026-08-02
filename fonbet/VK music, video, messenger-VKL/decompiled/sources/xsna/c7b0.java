package xsna;

import com.vk.core.ui.tracking.UiTracker;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.SchemeStat$TypeClick;

/* compiled from: PlaylistAnalyticsTrackerImpl.kt */
/* loaded from: classes17.dex */
public final class c7b0 implements b7b0 {
    public static final c7b0 a = new c7b0();

    @Override // xsna.b7b0
    public final void a(SchemeStat$TypeClick schemeStat$TypeClick) {
        UiTracker uiTracker = UiTracker.a;
        MobileOfficialAppsCoreNavStat$EventScreen c = UiTracker.c();
        uzp0 uzp0Var = UiTracker.h;
        uzp0Var.getClass();
        new bjc(c, schemeStat$TypeClick, uzp0Var.a).q();
    }
}
