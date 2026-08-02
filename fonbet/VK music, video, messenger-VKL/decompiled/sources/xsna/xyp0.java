package xsna;

import com.vk.core.fragments.FragmentImpl;
import com.vk.core.ui.tracking.UiTracker;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.SchemeStat$EventItem;
import com.vk.stat.scheme.SchemeStat$TypeDialogItem;
import com.vk.stat.scheme.SchemeStat$TypeMiniAppItem;
import java.util.List;

/* compiled from: UiDialogTracker.kt */
/* loaded from: classes17.dex */
public class xyp0 implements m0q0 {
    public final boolean b;
    public m0q0 c;
    public boolean d;
    public SchemeStat$TypeDialogItem.DialogAction e;
    public UiTrackingScreen f;

    /* compiled from: UiDialogTracker.kt */
    public static final class a {
        /* JADX WARN: Removed duplicated region for block: B:17:0x002b  */
        /* JADX WARN: Removed duplicated region for block: B:21:0x002d  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static SchemeStat$TypeDialogItem a(SchemeStat$EventItem schemeStat$EventItem, SchemeStat$TypeDialogItem.DialogItem dialogItem, SchemeStat$TypeDialogItem.DialogAction dialogAction, List list, SchemeStat$TypeMiniAppItem schemeStat$TypeMiniAppItem, boolean z, int i) {
            SchemeStat$EventItem schemeStat$EventItem2;
            if ((i & 16) != 0) {
                schemeStat$TypeMiniAppItem = null;
            }
            boolean z2 = (i & 32) != 0 ? false : z;
            SchemeStat$TypeDialogItem.AdditionalAction additionalAction = schemeStat$TypeMiniAppItem == null ? null : SchemeStat$TypeDialogItem.AdditionalAction.TYPE_MINI_APP_ITEM;
            UiTrackingScreen uiTrackingScreen = UiTracker.j.b;
            MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen = uiTrackingScreen != null ? uiTrackingScreen.a : null;
            if (schemeStat$EventItem == null) {
                if (uiTrackingScreen == null) {
                    schemeStat$EventItem2 = null;
                    return new SchemeStat$TypeDialogItem(dialogItem, dialogAction, list, Boolean.valueOf(z2), mobileOfficialAppsCoreNavStat$EventScreen, schemeStat$EventItem2, additionalAction, schemeStat$TypeMiniAppItem == null ? schemeStat$TypeMiniAppItem : null, null);
                }
                schemeStat$EventItem = uiTrackingScreen.f;
            }
            schemeStat$EventItem2 = schemeStat$EventItem;
            return new SchemeStat$TypeDialogItem(dialogItem, dialogAction, list, Boolean.valueOf(z2), mobileOfficialAppsCoreNavStat$EventScreen, schemeStat$EventItem2, additionalAction, schemeStat$TypeMiniAppItem == null ? schemeStat$TypeMiniAppItem : null, null);
        }
    }

    public xyp0(FragmentImpl fragmentImpl) {
        this(false);
        this.c = fragmentImpl;
    }

    public void a() {
        d();
    }

    public void b() {
        c();
    }

    public final void c() {
        if (this.d) {
            return;
        }
        this.e = SchemeStat$TypeDialogItem.DialogAction.DISMISS;
        this.d = true;
        t1q0 t1q0Var = UiTracker.j;
        UiTrackingScreen b = t1q0Var.b();
        if (b == null || !b.d() || !b.equals(this.f)) {
            UiTracker.i.g();
            return;
        }
        this.d = true;
        UiTrackingScreen c = t1q0Var.c();
        if (c != null) {
            t1q0Var.d(c, true);
        }
    }

    public final void d() {
        this.e = SchemeStat$TypeDialogItem.DialogAction.SHOW;
        this.d = false;
        UiTrackingScreen a2 = UiTrackingScreen.Companion.a(new UiTrackingScreen(UiTrackingScreen.Companion.DialogType.DIALOG_MODAL_DESTINATION), this);
        if (UiTracker.j.b != null) {
            UiTracker.i.j(a2, true);
            return;
        }
        UiTrackingScreen a3 = UiTrackingScreen.Companion.a(new UiTrackingScreen(MobileOfficialAppsCoreNavStat$EventScreen.SPRINGBOARD), UiTrackingScreen.j);
        l1q0 l1q0Var = UiTracker.i;
        if (l1q0Var.c()) {
            l1q0Var.e(a3, a2, true);
        }
    }

    @Override // xsna.m0q0
    public void y(UiTrackingScreen uiTrackingScreen) {
        UiTrackingScreen uiTrackingScreen2;
        m0q0 m0q0Var = this.c;
        if (m0q0Var != null) {
            a2q0.a.getClass();
            uiTrackingScreen2 = a2q0.d(m0q0Var);
        } else {
            uiTrackingScreen2 = null;
        }
        if (uiTrackingScreen2 != null && !uiTrackingScreen2.e()) {
            uiTrackingScreen.a = uiTrackingScreen2.a;
        }
        m0q0 m0q0Var2 = this.c;
        if (m0q0Var2 != null) {
            m0q0Var2.y(uiTrackingScreen);
        }
        this.f = uiTrackingScreen;
        if (uiTrackingScreen.d != UiTrackingScreen.Companion.DialogType.DIALOG_MODAL_SOURCE || this.b) {
            return;
        }
        this.d = true;
        t1q0 t1q0Var = UiTracker.j;
        UiTrackingScreen c = t1q0Var.c();
        if (c != null) {
            t1q0Var.d(c, true);
        }
    }

    public xyp0(boolean z) {
        this.b = z;
        this.e = SchemeStat$TypeDialogItem.DialogAction.DISMISS;
    }

    public xyp0(m0q0 m0q0Var, boolean z) {
        this(z);
        this.c = m0q0Var;
    }
}
