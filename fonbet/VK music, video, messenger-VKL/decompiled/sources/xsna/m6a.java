package xsna;

import android.view.View;
import com.vk.im.engine.models.attaches.HistoryAttach;
import ru.ok.android.webrtc.topology.direct.P2PNetworkStatusReporter;

/* compiled from: CatalogGetPodcastRequestFactory.kt */
/* loaded from: classes16.dex */
public final class m6a implements z1y0, io.reactivex.rxjava3.functions.l {
    public Object b;

    public /* synthetic */ m6a(Object obj) {
        this.b = obj;
    }

    public void a(View view, HistoryAttach historyAttach) {
        ips0 ips0Var = ((ips0) this.b).m.v;
        if (ips0Var == null) {
            ips0Var = null;
        }
        ips0Var.h(view.getContext(), historyAttach);
    }

    @Override // io.reactivex.rxjava3.functions.l
    public Object apply(Object obj) {
        izs izsVar;
        io.reactivex.rxjava3.core.x a;
        P2PNetworkStatusReporter p2PNetworkStatusReporter = (P2PNetworkStatusReporter) this.b;
        izsVar = p2PNetworkStatusReporter.f;
        izsVar.invoke("run routine #" + ((Long) obj));
        a = p2PNetworkStatusReporter.a();
        return a;
    }

    public void b(HistoryAttach historyAttach) {
        j2s0 j2s0Var = ((ips0) this.b).m;
        iwv.l(j2s0Var.k.k(), j2s0Var.t, historyAttach.d, null, null, Long.valueOf(j2s0Var.n.b), null, !j2s0Var.h1(), 44);
    }

    @Override // xsna.z1y0
    public void i() {
        xgy xgyVar = ((leg) this.b).o;
        if (xgyVar != null) {
            xgyVar.k();
        }
    }

    @Override // xsna.z1y0
    public void f() {
    }

    @Override // xsna.z1y0
    public void g() {
    }
}
