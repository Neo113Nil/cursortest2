package xsna;

import com.vk.core.apps.BuildInfo;
import com.vk.toggle.features.VoipFeatures;

/* compiled from: CallDebugMenuInteractorProviderImpl.kt */
/* loaded from: classes7.dex */
public final class e29 implements d29 {
    public final bpn0 a = new bpn0(new qe3(3));
    public final bpn0 b = new bpn0(new wm1(this, 9));

    public e29(up2 up2Var) {
    }

    @Override // xsna.d29
    public final p19 provide() {
        if (!BuildInfo.h()) {
            VoipFeatures voipFeatures = VoipFeatures.FEATURE_VOIP_DEBUG_MENU;
            voipFeatures.getClass();
            if (!com.vk.toggle.b.A.a(voipFeatures)) {
                return null;
            }
        }
        return (p19) this.b.getValue();
    }
}
