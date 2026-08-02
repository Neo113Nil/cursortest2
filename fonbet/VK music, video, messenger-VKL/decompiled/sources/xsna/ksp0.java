package xsna;

import com.ironsource.X3;
import java.util.concurrent.Callable;
import java.util.concurrent.RunnableFuture;
import java.util.concurrent.locks.LockSupport;
import xsna.cox;
import xsna.je;
import xsna.mur;

/* compiled from: TrustedListenableFutureTask.java */
/* loaded from: classes13.dex */
public final class ksp0<V> extends mur.a<V> implements RunnableFuture<V> {
    public volatile a i;

    /* compiled from: TrustedListenableFutureTask.java */
    public final class a extends cox<V> {
        private final Callable<V> callable;

        public a(Callable<V> callable) {
            callable.getClass();
            this.callable = callable;
        }

        @Override // xsna.cox
        public final V d() throws Exception {
            return this.callable.call();
        }

        @Override // xsna.cox
        public final String g() {
            return this.callable.toString();
        }
    }

    public ksp0(Callable<V> callable) {
        this.i = new a(callable);
    }

    @Override // xsna.je
    public final void c() {
        a aVar;
        Object obj = this.b;
        if ((obj instanceof je.b) && ((je.b) obj).a && (aVar = this.i) != null) {
            cox.b bVar = cox.c;
            cox.b bVar2 = cox.b;
            Runnable runnable = (Runnable) aVar.get();
            if (runnable instanceof Thread) {
                cox.a aVar2 = new cox.a(aVar);
                cox.a.a(aVar2, Thread.currentThread());
                if (aVar.compareAndSet(runnable, aVar2)) {
                    try {
                        ((Thread) runnable).interrupt();
                    } finally {
                        if (((Runnable) aVar.getAndSet(bVar2)) == bVar) {
                            LockSupport.unpark((Thread) runnable);
                        }
                    }
                }
            }
        }
        this.i = null;
    }

    @Override // xsna.je
    public final String i() {
        a aVar = this.i;
        if (aVar == null) {
            return super.i();
        }
        return "task=[" + aVar + X3.j.e;
    }

    @Override // java.util.concurrent.RunnableFuture, java.lang.Runnable
    public final void run() {
        a aVar = this.i;
        if (aVar != null) {
            aVar.run();
        }
        this.i = null;
    }
}
