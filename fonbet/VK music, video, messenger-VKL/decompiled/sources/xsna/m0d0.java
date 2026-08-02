package xsna;

import androidx.recyclerview.widget.RecyclerView;
import java.util.concurrent.PriorityBlockingQueue;

/* compiled from: Prefetchers.kt */
/* loaded from: classes12.dex */
public abstract class m0d0 {
    public final a7o0 a;
    public final PriorityBlockingQueue<j0d0> b = new PriorityBlockingQueue<>();
    public final b c = new b();
    public boolean d;

    /* compiled from: Prefetchers.kt */
    public interface a {
        boolean a(j0d0 j0d0Var);

        RecyclerView.e0 b(int i);

        boolean c(int i, long j, long j2);

        boolean d(int i, int i2);

        void e(j0d0 j0d0Var, String str);

        boolean f(j0d0 j0d0Var);

        void g(int i, long j);

        void h(j0d0 j0d0Var, Throwable th);

        void i(RecyclerView.e0 e0Var);
    }

    /* compiled from: Prefetchers.kt */
    public final class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            m0d0 m0d0Var = m0d0.this;
            PriorityBlockingQueue<j0d0> priorityBlockingQueue = m0d0Var.b;
            try {
                long d = m0d0Var.d(priorityBlockingQueue);
                if (!m0d0Var.d || priorityBlockingQueue.isEmpty()) {
                    return;
                }
                m0d0Var.a.a(d / 1000000, this);
            } catch (Throwable th) {
                j0d0 peek = priorityBlockingQueue.peek();
                if (peek != null) {
                    peek.b.h(peek, th);
                }
            }
        }
    }

    public m0d0(a7o0 a7o0Var) {
        this.a = a7o0Var;
    }

    public abstract long d(PriorityBlockingQueue priorityBlockingQueue);

    public void b() {
    }

    public void c() {
    }
}
