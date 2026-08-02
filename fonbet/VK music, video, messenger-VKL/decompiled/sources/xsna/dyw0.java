package xsna;

import com.vk.voip.ui.scheduled.creation.ui.settings.VoipScheduledCallSettingsFragment;
import xsna.ddv;

/* compiled from: VoipScheduledCallSettingsFragment.kt */
/* loaded from: classes7.dex */
public final class dyw0 implements ddv.b<hfz> {
    public final /* synthetic */ VoipScheduledCallSettingsFragment a;

    public dyw0(VoipScheduledCallSettingsFragment voipScheduledCallSettingsFragment) {
        this.a = voipScheduledCallSettingsFragment;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.ddv.b
    public final hfz a(int i) {
        int i2 = VoipScheduledCallSettingsFragment.T;
        return (hfz) j5g.b0(i, ((sxm) this.a.Q.getValue()).getItems());
    }
}
