package xsna;

import com.ironsource.mediationsdk.logger.IronSourceError;
import com.vk.voip.ui.call_list.scheduled.ScheduledScreenSharingMuteOption;
import com.vk.voip.ui.call_list.scheduled.feature.model.ScheduledAudioMuteOption;
import com.vk.voip.ui.call_list.scheduled.feature.model.ScheduledVideoMuteOption;
import com.vk.voip.ui.call_list.scheduled.feature.model.ScheduledWatchTogetherOption;
import com.vk.voip.ui.scheduled.creation.ui.settings.VoipScheduledCallSettingsConfig;
import kotlin.NoWhenBranchMatchedException;
import xsna.gyw0;
import xsna.iyw0;

/* compiled from: VoipScheduledCallSettingsReducer.kt */
/* loaded from: classes7.dex */
public final class hyw0 extends dm50<myw0, gyw0, iyw0> {
    @Override // xsna.dm50
    public final iyw0 c(iyw0 iyw0Var, gyw0 gyw0Var) {
        iyw0 iyw0Var2 = iyw0Var;
        gyw0 gyw0Var2 = gyw0Var;
        if (gyw0Var2 instanceof gyw0.a) {
            VoipScheduledCallSettingsConfig.CallSettings callSettings = ((gyw0.a) gyw0Var2).b.b;
            boolean z = callSettings.b;
            boolean z2 = callSettings.c;
            boolean z3 = callSettings.d;
            ScheduledAudioMuteOption scheduledAudioMuteOption = callSettings.e;
            ScheduledVideoMuteOption scheduledVideoMuteOption = callSettings.f;
            ScheduledWatchTogetherOption scheduledWatchTogetherOption = callSettings.g;
            ScheduledScreenSharingMuteOption scheduledScreenSharingMuteOption = callSettings.h;
            return new iyw0.a(z, z2, z3, scheduledAudioMuteOption, scheduledVideoMuteOption, scheduledWatchTogetherOption, new iyw0.a.C3088a(scheduledScreenSharingMuteOption == ScheduledScreenSharingMuteOption.Enabled, scheduledScreenSharingMuteOption), callSettings.i, callSettings.j);
        }
        if (gyw0Var2 instanceof gyw0.c) {
            iyw0.a aVar = iyw0Var2 instanceof iyw0.a ? (iyw0.a) iyw0Var2 : null;
            return aVar != null ? iyw0.a.a(aVar, false, false, false, null, ((gyw0.c) gyw0Var2).b, null, null, false, false, 495) : iyw0Var2;
        }
        if (gyw0Var2 instanceof gyw0.f) {
            iyw0.a aVar2 = iyw0Var2 instanceof iyw0.a ? (iyw0.a) iyw0Var2 : null;
            return aVar2 != null ? iyw0.a.a(aVar2, false, false, false, ((gyw0.f) gyw0Var2).b, null, null, null, false, false, 503) : iyw0Var2;
        }
        if (gyw0Var2 instanceof gyw0.e) {
            iyw0.a aVar3 = iyw0Var2 instanceof iyw0.a ? (iyw0.a) iyw0Var2 : null;
            return aVar3 != null ? iyw0.a.a(aVar3, false, false, ((gyw0.e) gyw0Var2).b, null, null, null, null, false, false, 507) : iyw0Var2;
        }
        if (gyw0Var2 instanceof gyw0.b) {
            iyw0.a aVar4 = iyw0Var2 instanceof iyw0.a ? (iyw0.a) iyw0Var2 : null;
            return aVar4 != null ? iyw0.a.a(aVar4, false, ((gyw0.b) gyw0Var2).b, false, null, null, null, null, false, false, IronSourceError.ERROR_CODE_NO_ADS_TO_SHOW) : iyw0Var2;
        }
        if (gyw0Var2 instanceof gyw0.i) {
            iyw0.a aVar5 = iyw0Var2 instanceof iyw0.a ? (iyw0.a) iyw0Var2 : null;
            return aVar5 != null ? iyw0.a.a(aVar5, ((gyw0.i) gyw0Var2).b, false, false, null, null, null, null, false, false, 510) : iyw0Var2;
        }
        if (gyw0Var2 instanceof gyw0.j) {
            iyw0.a aVar6 = iyw0Var2 instanceof iyw0.a ? (iyw0.a) iyw0Var2 : null;
            return aVar6 != null ? iyw0.a.a(aVar6, false, false, false, null, null, ((gyw0.j) gyw0Var2).b, null, false, false, 479) : iyw0Var2;
        }
        if (gyw0Var2 instanceof gyw0.g) {
            iyw0.a aVar7 = iyw0Var2 instanceof iyw0.a ? (iyw0.a) iyw0Var2 : null;
            return aVar7 != null ? iyw0.a.a(aVar7, false, false, false, null, null, null, null, ((gyw0.g) gyw0Var2).b, false, 383) : iyw0Var2;
        }
        if (gyw0Var2 instanceof gyw0.h) {
            iyw0.a aVar8 = iyw0Var2 instanceof iyw0.a ? (iyw0.a) iyw0Var2 : null;
            return aVar8 != null ? iyw0.a.a(aVar8, false, false, false, null, null, null, ((gyw0.h) gyw0Var2).b, false, false, 447) : iyw0Var2;
        }
        if (!(gyw0Var2 instanceof gyw0.d)) {
            throw new NoWhenBranchMatchedException();
        }
        iyw0.a aVar9 = iyw0Var2 instanceof iyw0.a ? (iyw0.a) iyw0Var2 : null;
        return aVar9 != null ? iyw0.a.a(aVar9, false, false, false, null, null, null, null, false, ((gyw0.d) gyw0Var2).b, 255) : iyw0Var2;
    }

    @Override // xsna.dm50
    public final myw0 d() {
        return new myw0(e(new jz30(22)));
    }

    @Override // xsna.dm50
    public final void h(iyw0 iyw0Var, myw0 myw0Var) {
        iyw0 iyw0Var2 = iyw0Var;
        myw0 myw0Var2 = myw0Var;
        if (iyw0Var2 instanceof iyw0.a) {
            f(myw0Var2.a, iyw0Var2);
        }
    }
}
