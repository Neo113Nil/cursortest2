package yads;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes10.dex */
public final class dq2 {
    public final AtomicInteger a;
    public final HashSet b;
    public final PriorityBlockingQueue c;
    public final PriorityBlockingQueue d;
    public final mr e;
    public final xo f;
    public final cr2 g;
    public final c92[] h;
    public tr i;
    public final ArrayList j;
    public final ArrayList k;

    public dq2(mr mrVar, xo xoVar, int i) {
        this(mrVar, xoVar, i, new hn0(new Handler(Looper.getMainLooper())));
    }

    public final void a(qp2 qp2Var) {
        qp2Var.i = this;
        synchronized (this.b) {
            this.b.add(qp2Var);
        }
        qp2Var.h = Integer.valueOf(this.a.incrementAndGet());
        qp2Var.a("add-to-queue");
        a(qp2Var, 0);
        if (qp2Var.j) {
            this.c.add(qp2Var);
        } else {
            this.d.add(qp2Var);
        }
    }

    public dq2(mr mrVar, xo xoVar, int i, hn0 hn0Var) {
        this.a = new AtomicInteger();
        this.b = new HashSet();
        this.c = new PriorityBlockingQueue();
        this.d = new PriorityBlockingQueue();
        this.j = new ArrayList();
        this.k = new ArrayList();
        this.e = mrVar;
        this.f = xoVar;
        this.h = new c92[i];
        this.g = hn0Var;
    }

    public final void a(cq2 cq2Var) {
        synchronized (this.b) {
            try {
                Iterator it = this.b.iterator();
                while (it.hasNext()) {
                    qp2 qp2Var = (qp2) it.next();
                    if (cq2Var.a(qp2Var)) {
                        qp2Var.a();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void a(qp2 qp2Var, int i) {
        vp2 vp2Var;
        synchronized (this.k) {
            try {
                Iterator it = this.k.iterator();
                while (it.hasNext()) {
                    ((sp2) ((bq2) it.next())).getClass();
                    po poVar = qp2Var instanceof po ? (po) qp2Var : null;
                    if (poVar != null && i == 3 && (vp2Var = poVar.u) != null) {
                        vp2Var.b();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void a() {
        tr trVar = this.i;
        if (trVar != null) {
            trVar.f = true;
            trVar.interrupt();
        }
        for (c92 c92Var : this.h) {
            if (c92Var != null) {
                c92Var.f = true;
                c92Var.interrupt();
            }
        }
        tr trVar2 = new tr(this.c, this.d, this.e, this.g);
        this.i = trVar2;
        trVar2.start();
        for (int i = 0; i < this.h.length; i++) {
            c92 c92Var2 = new c92(this.d, this.f, this.e, this.g);
            this.h[i] = c92Var2;
            c92Var2.start();
        }
    }
}
