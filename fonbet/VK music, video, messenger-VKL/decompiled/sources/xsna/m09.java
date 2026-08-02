package xsna;

import com.google.firebase.perf.session.gauges.GaugeManager;
import com.google.firebase.perf.v1.ApplicationProcessState;
import ru.ok.android.webrtc.Call;
import ru.ok.android.webrtc.SharedPeerConnectionFactory;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes9.dex */
public final /* synthetic */ class m09 implements Runnable {
    public final /* synthetic */ int b = 1;
    public final /* synthetic */ String c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ m09(GaugeManager gaugeManager, String str, ApplicationProcessState applicationProcessState) {
        this.d = gaugeManager;
        this.c = str;
        this.e = applicationProcessState;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.b) {
            case 0:
                ((Call) this.d).a((SharedPeerConnectionFactory) this.e, this.c);
                break;
            default:
                ((GaugeManager) this.d).lambda$startCollectingGauges$3(this.c, (ApplicationProcessState) this.e);
                break;
        }
    }

    public /* synthetic */ m09(Call call, SharedPeerConnectionFactory sharedPeerConnectionFactory, String str) {
        this.d = call;
        this.e = sharedPeerConnectionFactory;
        this.c = str;
    }
}
