package xsna;

import com.vk.core.ui.tracking.UiTracker;
import com.vk.stat.scheme.MobileOfficialAppsVideoStat$TypeVideoToClipAttach;
import com.vk.stat.scheme.SchemeStat$EventItem;
import com.vk.stat.scheme.SchemeStat$TypeClick;
import com.vk.video.ui.upload.impl.settings.presentation.feature.entity.SettingsState;
import com.vk.video.ui.upload.impl.settings.presentation.fragment.SettingsArguments;
import xsna.q0j0;

/* compiled from: SettingsAnalyticsMiddleware.kt */
/* loaded from: classes7.dex */
public final class s0j0 implements h7f0<SettingsState, q0j0, on50, ll50<on50, bwj, dwj>, jl50<SettingsState>, q1j0> {
    public final SettingsArguments b;
    public final sl50<SettingsState, q0j0, on50, ll50<on50, bwj, dwj>, jl50<SettingsState>, q1j0> c;

    public s0j0(SettingsArguments settingsArguments, sl50<SettingsState, q0j0, on50, ll50<on50, bwj, dwj>, jl50<SettingsState>, q1j0> sl50Var) {
        this.b = settingsArguments;
        this.c = sl50Var;
    }

    @Override // xsna.h7f0
    public final void K(lj50 lj50Var) {
        if (((q0j0) lj50Var) instanceof q0j0.a.b) {
            MobileOfficialAppsVideoStat$TypeVideoToClipAttach.EventType eventType = MobileOfficialAppsVideoStat$TypeVideoToClipAttach.EventType.TRY_TO_ATTACH_CLIP;
            SettingsArguments settingsArguments = this.b;
            MobileOfficialAppsVideoStat$TypeVideoToClipAttach.EventSubtype eventSubtype = settingsArguments.i == null ? MobileOfficialAppsVideoStat$TypeVideoToClipAttach.EventSubtype.FROM_UPLOAD : MobileOfficialAppsVideoStat$TypeVideoToClipAttach.EventSubtype.FROM_EDIT;
            UiTracker uiTracker = UiTracker.a;
            new bjc(UiTracker.c(), SchemeStat$TypeClick.a.b(new SchemeStat$EventItem(SchemeStat$EventItem.Type.VIDEO, settingsArguments.i != null ? Long.valueOf(r4.o0()) : null, Long.valueOf(settingsArguments.h.b), null, null, null, 56, null), new MobileOfficialAppsVideoStat$TypeVideoToClipAttach(eventType, eventSubtype, null, 4, null), 2)).q();
        }
    }

    @Override // xsna.h7f0
    public final /* bridge */ /* synthetic */ void T(pk50 pk50Var) {
    }

    @Override // xsna.rl50
    public final lm50 getCurrentState() {
        return this.c.getCurrentState();
    }

    @Override // xsna.h7f0
    public final /* bridge */ /* synthetic */ void l(hn50 hn50Var) {
    }

    @Override // xsna.h7f0
    public final /* bridge */ /* synthetic */ void o(yl50 yl50Var) {
    }

    @Override // xsna.h7f0
    public final /* bridge */ /* synthetic */ void u(lm50 lm50Var) {
    }

    @Override // xsna.uic
    public final void clear() {
    }

    @Override // xsna.rl50
    public final void init() {
    }
}
