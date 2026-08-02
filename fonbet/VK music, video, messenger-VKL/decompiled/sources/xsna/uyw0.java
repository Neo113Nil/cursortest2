package xsna;

import com.vk.sharing.api.di.SharingComponent;
import com.vk.voip.ui.scheduled.callslist.VoipScheduledCallsFragment;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes7.dex */
public final /* synthetic */ class uyw0 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ androidx.fragment.app.d c;

    public /* synthetic */ uyw0(androidx.fragment.app.d dVar, int i) {
        this.b = i;
        this.c = dVar;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        int i = this.b;
        androidx.fragment.app.d dVar = this.c;
        switch (i) {
            case 0:
                VoipScheduledCallsFragment voipScheduledCallsFragment = (VoipScheduledCallsFragment) dVar;
                int i2 = VoipScheduledCallsFragment.c0;
                return new ro80(voipScheduledCallsFragment.requireContext(), voipScheduledCallsFragment.T);
            default:
                int i3 = l1x0.k1;
                return (SharingComponent) m7m.d((l1x0) dVar).a(fpf0.a(SharingComponent.class));
        }
    }
}
