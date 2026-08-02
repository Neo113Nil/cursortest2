package xsna;

import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.core.ui.tracking.UiTracker;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.MobileOfficialAppsVideoStat$TypeVideoCatalogButtonExtendedClick;
import com.vk.stat.scheme.SchemeStat$EventItem;
import com.vk.stat.scheme.SchemeStat$TypeClick;

/* compiled from: CatalogUIClickTracker.kt */
/* loaded from: classes16.dex */
public class uha {
    public final s1v a;

    public uha() {
        this(0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void b(UIBlock uIBlock) {
        String I2;
        boolean z = uIBlock instanceof ksx0;
        s1v s1vVar = this.a;
        MobileOfficialAppsVideoStat$TypeVideoCatalogButtonExtendedClick mobileOfficialAppsVideoStat$TypeVideoCatalogButtonExtendedClick = null;
        if (!z) {
            SchemeStat$TypeClick b = SchemeStat$TypeClick.a.b(new SchemeStat$EventItem(SchemeStat$EventItem.Type.CATALOG_ITEM, null, null, s1v.f(uIBlock), s1vVar.e(uIBlock), null, 38, null), null, 6);
            UiTracker uiTracker = UiTracker.a;
            MobileOfficialAppsCoreNavStat$EventScreen c = UiTracker.c();
            uzp0 uzp0Var = UiTracker.h;
            uzp0Var.getClass();
            new bjc(c, b, uzp0Var.a).q();
            return;
        }
        SchemeStat$EventItem schemeStat$EventItem = new SchemeStat$EventItem(SchemeStat$EventItem.Type.CATALOG_ITEM, null, null, s1v.f(uIBlock), s1vVar.e(uIBlock), null, 38, null);
        ksx0 ksx0Var = z ? (ksx0) uIBlock : null;
        if (ksx0Var != null && (I2 = ksx0Var.I2()) != null) {
            mobileOfficialAppsVideoStat$TypeVideoCatalogButtonExtendedClick = new MobileOfficialAppsVideoStat$TypeVideoCatalogButtonExtendedClick(I2);
        }
        SchemeStat$TypeClick b2 = SchemeStat$TypeClick.a.b(schemeStat$EventItem, mobileOfficialAppsVideoStat$TypeVideoCatalogButtonExtendedClick, 2);
        UiTracker uiTracker2 = UiTracker.a;
        MobileOfficialAppsCoreNavStat$EventScreen c2 = UiTracker.c();
        uzp0 uzp0Var2 = UiTracker.h;
        uzp0Var2.getClass();
        new bjc(c2, b2, uzp0Var2.a).q();
    }

    public void c(UIBlock uIBlock, Object obj) {
        b(uIBlock);
    }

    public uha(s1v s1vVar) {
        this.a = s1vVar;
    }

    public /* synthetic */ uha(int i) {
        this(new s1v());
    }

    public void a() {
    }
}
