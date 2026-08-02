package xsna;

import com.vk.dto.common.id.UserId;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import xsna.acc;

/* compiled from: VoipAnonymQueueApiManager.kt */
/* loaded from: classes5.dex */
public final class tdw0 implements zqe0 {
    public final gzs<UserId> a;
    public final gzs<String> b;
    public final gzs<l7r0> c;
    public final ExecutorService d;
    public final du2 e;

    public tdw0(gzs gzsVar, gzs gzsVar2, j55 j55Var, ExecutorService executorService, du2 du2Var) {
        this.a = gzsVar;
        this.b = gzsVar2;
        this.c = j55Var;
        this.d = executorService;
        this.e = du2Var;
    }

    @Override // xsna.zqe0
    public final cre0 b(long j, String str, Collection collection) {
        return (cre0) rte0.B(this.c.invoke(), new bre0(this.a.invoke(), str, collection, j), this.d);
    }

    @Override // xsna.zqe0
    public final void c(Collection collection) {
        boolean z;
        if (collection.isEmpty()) {
            return;
        }
        l7r0 invoke = this.c.invoke();
        UserId invoke2 = this.a.invoke();
        ArrayList a = acc.a.a(collection);
        PriorityQueue priorityQueue = new PriorityQueue(a.size(), new q1q(new f6g((byte) 0, 5)));
        ArrayList arrayList = new ArrayList(c5g.u(a, 10));
        Iterator it = a.iterator();
        while (it.hasNext()) {
            acc accVar = (acc) it.next();
            arrayList.add(rte0.A(invoke, new pre0(invoke2, accVar.a, accVar.b), this.d));
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            Future future = (Future) it2.next();
            try {
                if (priorityQueue.peek() instanceof InterruptedException) {
                    z = true;
                } else {
                    future.get();
                    z = false;
                }
            } catch (Exception e) {
                priorityQueue.add(e);
                z = e instanceof InterruptedException;
            }
            if (z) {
                future.cancel(true);
            }
        }
        Exception exc = (Exception) priorityQueue.poll();
        if (exc != null) {
            while (!priorityQueue.isEmpty()) {
                Exception exc2 = (Exception) priorityQueue.poll();
                if (exc2 != null) {
                    exc.addSuppressed(exc2);
                }
            }
            throw exc;
        }
    }

    @Override // xsna.zqe0
    public final Map d(HashSet hashSet) {
        Map map = (Map) rte0.B(this.c.invoke(), new udw0(this.a.invoke(), this.b.invoke(), hashSet), this.d);
        Iterator it = map.entrySet().iterator();
        while (it.hasNext()) {
            ((io.reactivex.rxjava3.subjects.f) this.e.a.getValue()).onNext(((bu2) ((Map.Entry) it.next()).getValue()).b);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(on00.e(map.size()));
        for (Map.Entry entry : map.entrySet()) {
            linkedHashMap.put(entry.getKey(), ((bu2) entry.getValue()).a);
        }
        return linkedHashMap;
    }
}
