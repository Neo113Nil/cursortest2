package xsna;

import com.vk.lifecycle.ProcessStateProvider;
import com.vk.log.L;
import com.vk.metrics.performance.appstart.a;
import java.util.Iterator;
import xsna.nx50;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class y83 implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ y83(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // java.lang.Runnable
    public final void run() {
        switch (this.b) {
            case 0:
                com.vk.metrics.performance.appstart.a aVar = (com.vk.metrics.performance.appstart.a) this.c;
                aVar.getClass();
                ProcessStateProvider processStateProvider = ow90.o;
                ProcessStateProvider.ProcessState a = processStateProvider != null ? processStateProvider.a() : null;
                if (aVar.e != a || a != ProcessStateProvider.ProcessState.Foreground) {
                    aVar.c = false;
                    Iterator<a.InterfaceC1278a> it = aVar.d.iterator();
                    while (it.hasNext()) {
                        it.next().c();
                    }
                    break;
                }
                break;
            default:
                nx50 nx50Var = (nx50) this.c;
                hg1.e(nx50Var.x0, ((eef) nx50Var.h0.getValue()).b().a0(asu0.a.d()).subscribe(new afs(new u3u(nx50Var, 17), 11), new cp50(new nx50.f(L.a), 1)));
                break;
        }
    }
}
