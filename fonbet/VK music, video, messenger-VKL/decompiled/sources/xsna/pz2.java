package xsna;

import com.vk.core.apps.BuildInfo;
import com.vk.im.engine.reporters.performance.events.LogType;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.BiFunction;
import xsna.c63;

/* compiled from: ApiMethodsReporter.kt */
/* loaded from: classes2.dex */
public final class pz2 extends c63.b {
    public static final pz2 b = new pz2();
    public static final bpn0 c = new bpn0(new lz2(0));
    public static final ConcurrentHashMap<String, Integer> d = new ConcurrentHashMap<>();

    public final void D(String str) {
        if ((BuildInfo.s() || BuildInfo.t()) && ((Boolean) c.getValue()).booleanValue()) {
            byte b2 = 0;
            final mz2 mz2Var = new mz2(b2, b2);
            d.merge(str, 1, new BiFunction() { // from class: xsna.nz2
                @Override // java.util.function.BiFunction
                public final Object apply(Object obj, Object obj2) {
                    return (Integer) mz2.this.invoke(obj, obj2);
                }
            });
            c63 c63Var = c63.a;
            c63.a(this);
        }
    }

    @Override // xsna.c63.b
    public final void u() {
        c63 c63Var = c63.a;
        c63.c(this);
        ConcurrentHashMap<String, Integer> concurrentHashMap = d;
        if (!concurrentHashMap.isEmpty()) {
            List D0 = j5g.D0(new oz2(0), concurrentHashMap.entrySet());
            int F0 = j5g.F0(concurrentHashMap.values());
            int size = concurrentHashMap.size();
            List<Map.Entry> H0 = j5g.H0(D0, 10);
            ArrayList arrayList = new ArrayList(c5g.u(H0, 10));
            for (Map.Entry entry : H0) {
                arrayList.add(new r3w0(LogType.API_METHOD_CALLS, (String) entry.getKey(), null, null, null, null, null, (Integer) entry.getValue(), Integer.valueOf(F0), Integer.valueOf(size), null, 15484));
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((r3w0) it.next()).q();
            }
        }
        concurrentHashMap.clear();
    }
}
