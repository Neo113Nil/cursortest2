package xsna;

import android.util.Pair;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;

/* compiled from: ThrottlingProducer.java */
/* loaded from: classes12.dex */
public final class aso0<T> implements thd0<T> {
    public final v9g0 a;
    public int b;
    public final ConcurrentLinkedQueue<Pair<l7j<T>, uhd0>> c;
    public final Executor d;

    /* compiled from: ThrottlingProducer.java */
    public class a extends wtl<T, T> {

        /* compiled from: ThrottlingProducer.java */
        /* renamed from: xsna.aso0$a$a, reason: collision with other inner class name */
        public class RunnableC2568a implements Runnable {
            public final /* synthetic */ Pair b;

            public RunnableC2568a(Pair pair) {
                this.b = pair;
            }

            @Override // java.lang.Runnable
            public final void run() {
                aso0 aso0Var = aso0.this;
                Pair pair = this.b;
                l7j l7jVar = (l7j) pair.first;
                uhd0 uhd0Var = (uhd0) pair.second;
                aso0Var.getClass();
                uhd0Var.q().f(uhd0Var, "ThrottlingProducer", null);
                aso0Var.a.b(new a(l7jVar), uhd0Var);
            }
        }

        public a(l7j l7jVar) {
            super(l7jVar);
        }

        @Override // xsna.wtl, xsna.ac6
        public final void f() {
            this.b.a();
            l();
        }

        @Override // xsna.wtl, xsna.ac6
        public final void g(Throwable th) {
            this.b.onFailure(th);
            l();
        }

        @Override // xsna.ac6
        public final void h(int i, Object obj) {
            this.b.b(i, obj);
            if (ac6.d(i)) {
                l();
            }
        }

        public final void l() {
            Pair<l7j<T>, uhd0> poll;
            synchronized (aso0.this) {
                try {
                    poll = aso0.this.c.poll();
                    if (poll == null) {
                        aso0 aso0Var = aso0.this;
                        aso0Var.b--;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (poll != null) {
                aso0.this.d.execute(new RunnableC2568a(poll));
            }
        }
    }

    public aso0(Executor executor, v9g0 v9g0Var) {
        executor.getClass();
        this.d = executor;
        this.a = v9g0Var;
        this.c = new ConcurrentLinkedQueue<>();
        this.b = 0;
    }

    @Override // xsna.thd0
    public final void b(l7j<T> l7jVar, uhd0 uhd0Var) {
        boolean z;
        uhd0Var.q().k(uhd0Var, "ThrottlingProducer");
        synchronized (this) {
            try {
                int i = this.b;
                z = true;
                if (i >= 5) {
                    this.c.add(Pair.create(l7jVar, uhd0Var));
                } else {
                    this.b = i + 1;
                    z = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z) {
            return;
        }
        uhd0Var.q().f(uhd0Var, "ThrottlingProducer", null);
        this.a.b(new a(l7jVar), uhd0Var);
    }
}
