package xsna;

import com.vk.voip.ui.scheduled.creation.ui.settings.VoipScheduledCallSettingsFragment;
import com.vk.voip.ui.scheduled.creation.ui.settings.ui.state.VoipScheduledCallSettingsContentViewState$ScreenState$Item;
import xsna.ddv;

/* compiled from: VoipScheduledCallSettingsFragment.kt */
/* loaded from: classes7.dex */
public final class eyw0 implements ddv.a<hfz> {
    @Override // xsna.ddv.a
    public final boolean a(hfz hfzVar, hfz hfzVar2) {
        hfz hfzVar3 = hfzVar2;
        int i = VoipScheduledCallSettingsFragment.T;
        return ((hfzVar3 instanceof VoipScheduledCallSettingsContentViewState$ScreenState$Item.Setting) && ((VoipScheduledCallSettingsContentViewState$ScreenState$Item.Setting) hfzVar3).b == VoipScheduledCallSettingsContentViewState$ScreenState$Item.Setting.Type.SCREEN_SHARING) || (hfzVar3 instanceof VoipScheduledCallSettingsContentViewState$ScreenState$Item.a);
    }
}
