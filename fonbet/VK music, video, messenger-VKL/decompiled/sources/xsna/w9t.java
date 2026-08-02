package xsna;

import com.vk.core.ui.tracking.UiTracker;
import com.vk.stat.scheme.CommonStat$TypeTrackCodeItem;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.MobileOfficialAppsMiniappsStat$TypeGameAppView;
import com.vk.stat.scheme.SchemeStat$EventItem;
import com.vk.stat.scheme.SchemeStat$TypeClick;
import com.vk.stat.scheme.SchemeStat$TypeGameCatalogItem;
import com.vk.stat.scheme.SchemeStat$TypeMiniAppItem;
import com.vk.stat.scheme.SchemeStat$TypeView;
import java.util.LinkedHashSet;
import xsna.hzp0;

/* compiled from: GamesCatalogAnalytics.kt */
/* loaded from: classes17.dex */
public final class w9t {
    public String a;
    public Integer b;
    public boolean d;
    public boolean e;
    public Boolean c = Boolean.FALSE;
    public final LinkedHashSet f = new LinkedHashSet();
    public final LinkedHashSet g = new LinkedHashSet();
    public final LinkedHashSet h = new LinkedHashSet();

    public static void b(w9t w9tVar, String str, Integer num) {
        w9tVar.a = str;
        w9tVar.b = num;
        w9tVar.c = true;
    }

    public static void e(SchemeStat$TypeMiniAppItem.Type type) {
        SchemeStat$TypeClick b = SchemeStat$TypeClick.a.b(new SchemeStat$EventItem(SchemeStat$EventItem.Type.MINI_APP, null, null, null, null, null, 62, null), new SchemeStat$TypeMiniAppItem(type, null, null, 6, null), 2);
        UiTracker uiTracker = UiTracker.a;
        MobileOfficialAppsCoreNavStat$EventScreen c = UiTracker.c();
        uzp0 uzp0Var = UiTracker.h;
        uzp0Var.getClass();
        new bjc(c, b, uzp0Var.a).q();
    }

    public final nw50 a() {
        if (this.d) {
            return null;
        }
        SchemeStat$EventItem schemeStat$EventItem = epx.f(this.c, Boolean.TRUE) ? new SchemeStat$EventItem(SchemeStat$EventItem.Type.GAME, null, null, null, null, null, 62, null) : null;
        String str = this.a;
        if (str == null) {
            str = "";
        }
        SchemeStat$TypeGameCatalogItem schemeStat$TypeGameCatalogItem = new SchemeStat$TypeGameCatalogItem(str, null, null, this.b, null, null, 54, null);
        this.a = null;
        this.b = null;
        this.c = null;
        this.d = false;
        return new nw50(schemeStat$EventItem, schemeStat$TypeGameCatalogItem);
    }

    /* JADX WARN: Type inference failed for: r13v1, types: [java.lang.Object, kotlin.Lazy] */
    public final void c(uet uetVar) {
        String str = uetVar.b;
        if (this.e || str == null || !this.h.add(str)) {
            return;
        }
        UiTracker uiTracker = UiTracker.a;
        SchemeStat$EventItem schemeStat$EventItem = new SchemeStat$EventItem(SchemeStat$EventItem.Type.GAMES_CATALOG_SECTION, null, null, null, null, null, 62, null);
        MobileOfficialAppsMiniappsStat$TypeGameAppView.Type type = MobileOfficialAppsMiniappsStat$TypeGameAppView.Type.APP_VIEW_PART;
        int i = (int) uetVar.a;
        CommonStat$TypeTrackCodeItem commonStat$TypeTrackCodeItem = new CommonStat$TypeTrackCodeItem(str);
        ?? r13 = uca.a;
        new bvt0(UiTracker.c(), SchemeStat$TypeView.a.b(schemeStat$EventItem, "0", "0", null, new MobileOfficialAppsMiniappsStat$TypeGameAppView(type, i, commonStat$TypeTrackCodeItem, null, Integer.valueOf(((Number) r13.getValue()).intValue()), 8, null), 8)).q();
        ((Number) r13.getValue()).intValue();
    }

    public final void d(uet uetVar) {
        String str = uetVar.b;
        if (this.e || str == null || !this.g.add(str)) {
            return;
        }
        new hzp0.u(new SchemeStat$EventItem(SchemeStat$EventItem.Type.GAME, Long.valueOf(uetVar.a), null, null, null, null, 60, null), new SchemeStat$TypeGameCatalogItem(uetVar.c, SchemeStat$TypeGameCatalogItem.Subtype.APP_VIEW, new CommonStat$TypeTrackCodeItem(str), null, null, null, 56, null)).a();
    }
}
