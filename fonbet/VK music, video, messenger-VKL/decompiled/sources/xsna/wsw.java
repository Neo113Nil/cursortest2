package xsna;

import com.vk.log.L;
import com.vk.voip.api.id.CallId;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* compiled from: IncomingCallListenerProxyImpl.kt */
/* loaded from: classes11.dex */
public final class wsw implements usw {
    public final CopyOnWriteArraySet<tsw> b = new CopyOnWriteArraySet<>();

    public final void a(tsw tswVar) {
        StringBuilder sb = new StringBuilder("incomingCallListeners: ");
        CopyOnWriteArraySet<tsw> copyOnWriteArraySet = this.b;
        L.e("IncomingCallListenerProxy", fw3.d(copyOnWriteArraySet, sb));
        copyOnWriteArraySet.add(tswVar);
    }

    @Override // xsna.tsw
    public final void m(com.vk.voip.b bVar, String str, dhw0 dhw0Var, CallId callId, boolean z) {
        i0q0.i(0L, new or4(new vsw(this, bVar, str, dhw0Var, callId, z), 7));
    }

    @Override // xsna.tsw
    public final void o(mlp mlpVar) {
        StringBuilder sb = new StringBuilder("incomingCallListeners: ");
        CopyOnWriteArraySet<tsw> copyOnWriteArraySet = this.b;
        L.e("IncomingCallListenerProxy", fw3.d(copyOnWriteArraySet, sb));
        Iterator<tsw> it = copyOnWriteArraySet.iterator();
        while (it.hasNext()) {
            it.next().o(mlpVar);
        }
    }
}
