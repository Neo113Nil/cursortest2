package yads;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;

/* loaded from: classes10.dex */
public final class io3 implements op2 {
    public final HashMap a = new HashMap();
    public final cr2 b;
    public final tr c;
    public final BlockingQueue d;

    public io3(tr trVar, PriorityBlockingQueue priorityBlockingQueue, cr2 cr2Var) {
        this.b = cr2Var;
        this.c = trVar;
        this.d = priorityBlockingQueue;
    }

    public final synchronized boolean a(qp2 qp2Var) {
        try {
            String c = qp2Var.c();
            if (!this.a.containsKey(c)) {
                this.a.put(c, null);
                qp2Var.a((op2) this);
                boolean z = pn3.a;
                return false;
            }
            List list = (List) this.a.get(c);
            if (list == null) {
                list = new ArrayList();
            }
            qp2Var.a("waiting-for-response");
            list.add(qp2Var);
            this.a.put(c, list);
            boolean z2 = pn3.a;
            return true;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void b(qp2 qp2Var) {
        BlockingQueue blockingQueue;
        try {
            String c = qp2Var.c();
            List list = (List) this.a.remove(c);
            if (list != null && !list.isEmpty()) {
                if (pn3.a) {
                    list.size();
                }
                qp2 qp2Var2 = (qp2) list.remove(0);
                this.a.put(c, list);
                qp2Var2.a((op2) this);
                if (this.c != null && (blockingQueue = this.d) != null) {
                    try {
                        blockingQueue.put(qp2Var2);
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                        tr trVar = this.c;
                        trVar.f = true;
                        trVar.interrupt();
                    }
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void a(qp2 qp2Var, wq2 wq2Var) {
        List list;
        lr lrVar = wq2Var.b;
        if (lrVar != null) {
            if (lrVar.e >= System.currentTimeMillis()) {
                String c = qp2Var.c();
                synchronized (this) {
                    list = (List) this.a.remove(c);
                }
                if (list != null) {
                    if (pn3.a) {
                        list.size();
                    }
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        ((hn0) this.b).a((qp2) it.next(), wq2Var, null);
                    }
                    return;
                }
                return;
            }
        }
        b(qp2Var);
    }
}
