package xsna;

import ru.ok.android.webrtc.topology.direct.P2PNetworkStatusReporter;

/* loaded from: classes8.dex */
public final class p8z0 implements io.reactivex.rxjava3.functions.f {
    public final /* synthetic */ P2PNetworkStatusReporter b;

    public p8z0(P2PNetworkStatusReporter p2PNetworkStatusReporter) {
        this.b = p2PNetworkStatusReporter;
    }

    @Override // io.reactivex.rxjava3.functions.f
    public final void accept(Object obj) {
        double d;
        izs izsVar;
        double d2;
        izs izsVar2;
        izs izsVar3;
        Double d3 = (Double) obj;
        double doubleValue = d3.doubleValue();
        P2PNetworkStatusReporter p2PNetworkStatusReporter = this.b;
        d = p2PNetworkStatusReporter.i;
        double abs = Math.abs(doubleValue - d);
        if (P2PNetworkStatusReporter.access$shouldSubmitNetworkStatus(p2PNetworkStatusReporter, abs)) {
            izsVar2 = p2PNetworkStatusReporter.f;
            izsVar2.invoke("submit p2p network status");
            p2PNetworkStatusReporter.i = d3.doubleValue();
            izsVar3 = p2PNetworkStatusReporter.e;
            izsVar3.invoke(d3);
            return;
        }
        izsVar = p2PNetworkStatusReporter.f;
        d2 = p2PNetworkStatusReporter.i;
        StringBuilder a = lby.a("not valuable network status diff: ", abs, ": ");
        a.append(d2);
        a.append(" -> ");
        a.append(d3);
        izsVar.invoke(a.toString());
    }
}
