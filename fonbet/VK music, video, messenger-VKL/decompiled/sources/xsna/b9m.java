package xsna;

import ru.ok.android.webrtc.stat.rtc.RTCStat;
import ru.ok.android.webrtc.topology.direct.P2PNetworkStatusReporter;

/* compiled from: DialogActionsVcByPopup.kt */
/* loaded from: classes2.dex */
public final class b9m implements c480, io.reactivex.rxjava3.functions.l {
    public final Object b;

    public /* synthetic */ b9m(Object obj) {
        this.b = obj;
    }

    @Override // xsna.c480
    public void a(u8m u8mVar) {
        izs izsVar = (izs) this.b;
        if (izsVar != null) {
            izsVar.invoke(u8mVar);
        }
    }

    @Override // io.reactivex.rxjava3.functions.l
    public Object apply(Object obj) {
        double a;
        a = ((P2PNetworkStatusReporter) this.b).a((RTCStat) obj);
        return Double.valueOf(a);
    }

    public b9m() {
        this.b = new yd10();
    }
}
