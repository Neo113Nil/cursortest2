package xsna;

import com.vk.core.ui.tracking.UiTracker;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.SchemeStat$TypeAction;
import com.vk.stat.scheme.SchemeStat$TypeMessagingActionItem;
import xsna.mwv;
import xsna.mwv.a;

/* compiled from: ImBaseActionReporter.kt */
/* loaded from: classes5.dex */
public abstract class axv<T extends mwv.a> implements mwv<T> {
    public final iid0 a;

    public axv(iid0 iid0Var) {
        this.a = iid0Var;
    }

    public static void c(axv axvVar, SchemeStat$TypeMessagingActionItem schemeStat$TypeMessagingActionItem) {
        iid0 iid0Var = axvVar.a;
        UiTracker uiTracker = UiTracker.a;
        MobileOfficialAppsCoreNavStat$EventScreen c = UiTracker.c();
        SchemeStat$TypeAction a = SchemeStat$TypeAction.a.a(null, null, schemeStat$TypeMessagingActionItem);
        iid0Var.f = c;
        iid0Var.g = a;
        iid0Var.q();
    }
}
