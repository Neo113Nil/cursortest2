package xsna;

import com.vk.core.ui.tracking.UiTracker;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.MobileOfficialAppsVideoStat$TypeVideoCatalogButtonExtendedClick;
import com.vk.stat.scheme.MobileOfficialAppsVideoStat$TypeVideoOpenAuthorCabinetClick;
import com.vk.stat.scheme.SchemeStat$EventItem;
import com.vk.stat.scheme.SchemeStat$TypeClick;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import xsna.t0a;

/* compiled from: CatalogAnalyticsImpl.kt */
/* loaded from: classes16.dex */
public final class v0a implements s0a {
    public final List<qmk> a;
    public final tda b;

    /* JADX WARN: Multi-variable type inference failed */
    public v0a(List<? extends qmk> list, tda tdaVar) {
        this.a = list;
        this.b = tdaVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.s0a
    public final void a(t0a t0aVar) {
        SchemeStat$TypeClick.b bVar;
        if (!(t0aVar instanceof t0a.a)) {
            if (!(t0aVar instanceof rmk)) {
                throw new NoWhenBranchMatchedException();
            }
            Iterator<T> it = this.a.iterator();
            while (it.hasNext()) {
                ((qmk) it.next()).a((rmk) t0aVar);
            }
            return;
        }
        t0a.a aVar = (t0a.a) t0aVar;
        t0a.a.d dVar = aVar.d;
        if (dVar == null || !this.b.b(dVar, aVar.a)) {
            SchemeStat$EventItem schemeStat$EventItem = new SchemeStat$EventItem(SchemeStat$EventItem.Type.CATALOG_ITEM, null, null, aVar.b, aVar.a, null, 38, null);
            t0a.a.c cVar = aVar.c;
            if (cVar instanceof t0a.a.C3709a) {
                bVar = new MobileOfficialAppsVideoStat$TypeVideoCatalogButtonExtendedClick(((t0a.a.C3709a) cVar).a);
            } else {
                String str = null;
                Object[] objArr = 0;
                if (epx.f(cVar, t0a.a.b.a)) {
                    bVar = new MobileOfficialAppsVideoStat$TypeVideoOpenAuthorCabinetClick(str, 1, objArr == true ? 1 : 0);
                } else {
                    if (cVar != null) {
                        throw new NoWhenBranchMatchedException();
                    }
                    bVar = null;
                }
            }
            SchemeStat$TypeClick b = SchemeStat$TypeClick.a.b(schemeStat$EventItem, bVar, 2);
            UiTracker uiTracker = UiTracker.a;
            MobileOfficialAppsCoreNavStat$EventScreen c = UiTracker.c();
            uzp0 uzp0Var = UiTracker.h;
            uzp0Var.getClass();
            new bjc(c, b, uzp0Var.a).q();
        }
    }
}
