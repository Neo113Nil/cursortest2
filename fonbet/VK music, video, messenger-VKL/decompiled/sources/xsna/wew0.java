package xsna;

import com.vk.core.ui.tracking.UiTracker;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.SchemeStat$EventItem;
import com.vk.stat.scheme.SchemeStat$TypeClick;
import xsna.mdw0;

/* compiled from: VoipBaseClickAnalytics.kt */
/* loaded from: classes11.dex */
public abstract class wew0<T extends mdw0> implements kdw0<T> {
    public final vk6<SchemeStat$TypeClick> a;
    public final SchemeStat$EventItem b = new SchemeStat$EventItem(SchemeStat$EventItem.Type.CLICK_ITEM, null, null, null, null, null, 62, null);

    public wew0(vk6<SchemeStat$TypeClick> vk6Var) {
        this.a = vk6Var;
    }

    public static void c(wew0 wew0Var, MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen, SchemeStat$EventItem schemeStat$EventItem, SchemeStat$TypeClick.b bVar, int i) {
        if ((i & 1) != 0) {
            UiTracker uiTracker = UiTracker.a;
            mobileOfficialAppsCoreNavStat$EventScreen = UiTracker.c();
        }
        if ((i & 2) != 0) {
            schemeStat$EventItem = null;
        }
        if (schemeStat$EventItem == null) {
            schemeStat$EventItem = wew0Var.b;
        }
        vk6<SchemeStat$TypeClick> vk6Var = wew0Var.a;
        SchemeStat$TypeClick a = SchemeStat$TypeClick.a.a(schemeStat$EventItem, null, bVar);
        vk6Var.f = mobileOfficialAppsCoreNavStat$EventScreen;
        vk6Var.g = a;
        vk6Var.q();
    }
}
