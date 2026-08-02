package xsna;

import com.vk.core.ui.tracking.UiTracker;
import com.vk.dto.hints.Hint;
import com.vk.stat.scheme.MobileOfficialAppsVideoStat$TypeScreenMode;
import com.vk.stat.scheme.MobileOfficialAppsVideoStat$TypeVideoAdTrialClick;
import com.vk.stat.scheme.MobileOfficialAppsVideoStat$TypeVideoAdTrialShow;
import com.vk.stat.scheme.MobileOfficialAppsVideoStat$TypeVideoAdTrialUi;
import com.vk.stat.scheme.SchemeStat$EventItem;
import com.vk.stat.scheme.SchemeStat$TypeView;
import kotlin.jvm.internal.Ref$BooleanRef;
import xsna.c0s0;

/* compiled from: VideoAdsSuspendManagerImpl.kt */
/* loaded from: classes6.dex */
public final class k0s0 implements c0s0.b {
    public final /* synthetic */ l0s0 a;
    public final /* synthetic */ Hint b;
    public final /* synthetic */ Ref$BooleanRef c;

    public k0s0(l0s0 l0s0Var, Hint hint, Ref$BooleanRef ref$BooleanRef) {
        this.a = l0s0Var;
        this.b = hint;
        this.c = ref$BooleanRef;
    }

    @Override // xsna.c0s0.b
    public final void b() {
        n0s0 n0s0Var = this.a.i;
        String f = l0s0.f(this.b);
        n0s0Var.getClass();
        n0s0.c(MobileOfficialAppsVideoStat$TypeVideoAdTrialClick.EventType.CLOSE_CROSS, MobileOfficialAppsVideoStat$TypeVideoAdTrialUi.POPUP, f, MobileOfficialAppsVideoStat$TypeScreenMode.PREVIEW);
        this.c.element = true;
    }

    @Override // xsna.c0s0.b
    public final void c() {
        n0s0 n0s0Var = this.a.i;
        String f = l0s0.f(this.b);
        n0s0Var.getClass();
        n0s0.c(MobileOfficialAppsVideoStat$TypeVideoAdTrialClick.EventType.BANNER_CLICK, MobileOfficialAppsVideoStat$TypeVideoAdTrialUi.POPUP, f, MobileOfficialAppsVideoStat$TypeScreenMode.PREVIEW);
        this.c.element = true;
    }

    @Override // xsna.c0s0.b
    public final void d() {
        l0s0 l0s0Var = this.a;
        n0s0 n0s0Var = l0s0Var.i;
        Hint hint = this.b;
        String f = l0s0.f(hint);
        n0s0Var.getClass();
        MobileOfficialAppsVideoStat$TypeVideoAdTrialShow.EventType eventType = MobileOfficialAppsVideoStat$TypeVideoAdTrialShow.EventType.SUCCESS;
        MobileOfficialAppsVideoStat$TypeVideoAdTrialUi mobileOfficialAppsVideoStat$TypeVideoAdTrialUi = MobileOfficialAppsVideoStat$TypeVideoAdTrialUi.POPUP;
        MobileOfficialAppsVideoStat$TypeScreenMode mobileOfficialAppsVideoStat$TypeScreenMode = MobileOfficialAppsVideoStat$TypeScreenMode.PREVIEW;
        UiTracker uiTracker = UiTracker.a;
        new bvt0(UiTracker.c(), SchemeStat$TypeView.a.b(new SchemeStat$EventItem(SchemeStat$EventItem.Type.VIDEO, null, null, null, null, null, 62, null), "", "", null, new MobileOfficialAppsVideoStat$TypeVideoAdTrialShow(eventType, mobileOfficialAppsVideoStat$TypeVideoAdTrialUi, f, mobileOfficialAppsVideoStat$TypeScreenMode), 8)).q();
        l0s0Var.g().s(hint);
    }

    @Override // xsna.c0s0.b
    public final void onClosed() {
        if (this.c.element) {
            return;
        }
        n0s0 n0s0Var = this.a.i;
        String f = l0s0.f(this.b);
        n0s0Var.getClass();
        n0s0.c(MobileOfficialAppsVideoStat$TypeVideoAdTrialClick.EventType.CLOSE_ANYWHERE, MobileOfficialAppsVideoStat$TypeVideoAdTrialUi.POPUP, f, MobileOfficialAppsVideoStat$TypeScreenMode.PREVIEW);
    }
}
