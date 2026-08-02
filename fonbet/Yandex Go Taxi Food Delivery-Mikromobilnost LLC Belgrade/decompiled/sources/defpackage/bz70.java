package defpackage;

import com.yandex.go.taxi.order.provider.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlinx.coroutines.flow.r0;
import ru.yandex.taxi.order.OrderListOverlayStateProvider$invalidate$$inlined$safeCollectIn$1;

/* loaded from: classes6.dex */
public final class bz70 {
    public final a a;
    public final zfm b;
    public g18 c = g18.u1;
    public final hbp0 d = new hbp0(new czo0(14), "", null);
    public final r0 e = bvf0.c(null);
    public final ConcurrentHashMap f = new ConcurrentHashMap();

    public bz70(a aVar, zfm zfmVar) {
        this.a = aVar;
        this.b = zfmVar;
    }

    public final o2y0 a() {
        o2y0 o2y0Var;
        List l = this.a.l();
        if (l.isEmpty() || (o2y0Var = (o2y0) l.get(scc.f(l))) == null || !an91.i(o2y0Var.c())) {
            return null;
        }
        return o2y0Var;
    }

    public final void b() {
        ConcurrentHashMap concurrentHashMap;
        a aVar = this.a;
        Iterator it = aVar.l().iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            concurrentHashMap = this.f;
            if (!hasNext) {
                break;
            }
            o2y0 o2y0Var = (o2y0) it.next();
            if (!concurrentHashMap.containsKey(o2y0Var)) {
                this.b.getClass();
                concurrentHashMap.put(o2y0Var, tje.N(this.d, null, null, new OrderListOverlayStateProvider$invalidate$$inlined$safeCollectIn$1(zfm.a(o2y0Var), null, this), 3));
            }
        }
        ArrayList arrayList = new ArrayList();
        List l = aVar.l();
        for (o2y0 o2y0Var2 : concurrentHashMap.keySet()) {
            if (!l.contains(o2y0Var2)) {
                arrayList.add(o2y0Var2);
            }
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            l8x l8xVar = (l8x) concurrentHashMap.remove((o2y0) it2.next());
            if (l8xVar != null) {
                l8xVar.a(null);
            }
        }
        az70 az70Var = new az70(aVar.l(), a());
        r0 r0Var = this.e;
        r0Var.getClass();
        r0Var.m(null, az70Var);
    }
}
