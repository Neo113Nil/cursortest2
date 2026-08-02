package xsna;

import ru.ok.android.webrtc.topology.direct.P2PNetworkStatusReporter;

/* loaded from: classes8.dex */
public final class w9z0 implements io.reactivex.rxjava3.functions.f {
    public final /* synthetic */ P2PNetworkStatusReporter b;

    public w9z0(P2PNetworkStatusReporter p2PNetworkStatusReporter) {
        this.b = p2PNetworkStatusReporter;
    }

    @Override // io.reactivex.rxjava3.functions.f
    public final void accept(Object obj) {
        izs izsVar;
        izsVar = this.b.f;
        izsVar.invoke("error occurred: " + ((Throwable) obj));
    }
}
