package xsna;

import com.vk.core.ui.tracking.UiTracker;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.SchemeStat$EventItem;
import com.vk.stat.scheme.SchemeStat$TypeClick;
import xsna.mwv;
import xsna.mwv.a;

/* compiled from: ImBaseClickReporter.kt */
/* loaded from: classes5.dex */
public abstract class bxv<T extends mwv.a> implements mwv<T> {
    public final vk6<SchemeStat$TypeClick> a;
    public final SchemeStat$EventItem b = new SchemeStat$EventItem(SchemeStat$EventItem.Type.CLICK_ITEM, null, null, null, null, null, 62, null);

    public bxv(vk6<SchemeStat$TypeClick> vk6Var) {
        this.a = vk6Var;
    }

    public static void c(bxv bxvVar, SchemeStat$EventItem schemeStat$EventItem, SchemeStat$TypeClick.b bVar, int i) {
        if ((i & 1) != 0) {
            schemeStat$EventItem = null;
        }
        if (schemeStat$EventItem == null) {
            schemeStat$EventItem = bxvVar.b;
        }
        vk6<SchemeStat$TypeClick> vk6Var = bxvVar.a;
        UiTracker uiTracker = UiTracker.a;
        MobileOfficialAppsCoreNavStat$EventScreen c = UiTracker.c();
        SchemeStat$TypeClick a = SchemeStat$TypeClick.a.a(schemeStat$EventItem, null, bVar);
        vk6Var.f = c;
        vk6Var.g = a;
        vk6Var.q();
    }
}
