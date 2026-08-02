package xsna;

import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.SchemeStat$EventItem;
import com.vk.stat.scheme.SchemeStat$TypeAction;
import com.vk.stat.scheme.SchemeStat$TypeClick;
import com.vk.stat.scheme.SchemeStat$TypeClipViewerItem;
import com.vk.stat.scheme.SchemeStat$TypeDevNullItem;

/* compiled from: ItemsAnalyticsEventsTrackerImpl.kt */
/* loaded from: classes17.dex */
public final class vvx implements uvx {
    public final irk0 a;

    public vvx(irk0 irk0Var) {
        this.a = irk0Var;
    }

    @Override // xsna.uvx
    public final void a(MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen, MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen2, SchemeStat$EventItem schemeStat$EventItem, SchemeStat$TypeAction.b bVar) {
        new iid0(mobileOfficialAppsCoreNavStat$EventScreen, SchemeStat$TypeAction.a.a(schemeStat$EventItem, mobileOfficialAppsCoreNavStat$EventScreen2, bVar), this.a).q();
    }

    @Override // xsna.uvx
    public final void b(SchemeStat$TypeDevNullItem schemeStat$TypeDevNullItem) {
        l5m l5mVar = new l5m(this.a, null, 2);
        l5mVar.g = schemeStat$TypeDevNullItem;
        l5mVar.q();
    }

    @Override // xsna.uvx
    public final void c(MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen, SchemeStat$EventItem schemeStat$EventItem, SchemeStat$TypeClipViewerItem schemeStat$TypeClipViewerItem) {
        new bjc(mobileOfficialAppsCoreNavStat$EventScreen, SchemeStat$TypeClick.a.b(schemeStat$EventItem, schemeStat$TypeClipViewerItem, 2), this.a).q();
    }
}
