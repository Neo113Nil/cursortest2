package xsna;

import java.util.Iterator;
import xsna.usi0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes11.dex */
public final /* synthetic */ class dte0 implements Runnable {
    public final /* synthetic */ int b;

    public /* synthetic */ dte0(int i) {
        this.b = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.b) {
            case 0:
                try {
                    yse0.b();
                    break;
                } catch (Exception e) {
                    com.vk.metrics.eventtracking.b.a.q(e);
                    return;
                }
            default:
                q6r0.f();
                q6r0.j();
                Iterator it = ((mui0) q6r0.d.getValue()).e().iterator();
                while (it.hasNext()) {
                    q6r0.e(((usi0.a) it.next()).c().b());
                }
                break;
        }
    }
}
