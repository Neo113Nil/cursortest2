package xsna;

import com.vk.core.ui.tracking.UiTracker;
import com.vk.log.L;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.SchemeStat$EventItem;
import com.vk.stat.scheme.SchemeStat$TypeClick;

/* compiled from: UiItemClicked.kt */
/* loaded from: classes17.dex */
public final class gzp0 {
    public final MobileOfficialAppsCoreNavStat$EventScreen a;
    public final SchemeStat$TypeClick b;

    /* compiled from: UiItemClicked.kt */
    public static final class a {
        @ozl
        public static void a(MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen, SchemeStat$TypeClick schemeStat$TypeClick) {
            UiTracker uiTracker = UiTracker.a;
            if (UiTracker.c() != mobileOfficialAppsCoreNavStat$EventScreen) {
                L.G("Wtf, why click on another screen. Fix me!");
            }
            uzp0 uzp0Var = UiTracker.h;
            uzp0Var.getClass();
            new bjc(mobileOfficialAppsCoreNavStat$EventScreen, schemeStat$TypeClick, uzp0Var.a).q();
        }

        public static void b(SchemeStat$TypeClick schemeStat$TypeClick) {
            UiTracker uiTracker = UiTracker.a;
            MobileOfficialAppsCoreNavStat$EventScreen c = UiTracker.c();
            uzp0 uzp0Var = UiTracker.h;
            uzp0Var.getClass();
            new bjc(c, schemeStat$TypeClick, uzp0Var.a).q();
        }

        public static void c(SchemeStat$TypeClick.b bVar) {
            b(SchemeStat$TypeClick.a.a(new SchemeStat$EventItem(SchemeStat$EventItem.Type.CLICK_ITEM, null, null, null, null, null, 62, null), -1, bVar));
        }
    }

    public gzp0(MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen, SchemeStat$TypeClick schemeStat$TypeClick) {
        this.a = mobileOfficialAppsCoreNavStat$EventScreen;
        this.b = schemeStat$TypeClick;
    }
}
