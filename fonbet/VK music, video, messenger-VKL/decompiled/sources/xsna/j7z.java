package xsna;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.coroutines.EmptyCoroutineContext;

/* compiled from: LimitedDispatcher.kt */
/* loaded from: classes11.dex */
public final class j7z extends ovj implements osl {
    public static final /* synthetic */ AtomicIntegerFieldUpdater h = AtomicIntegerFieldUpdater.newUpdater(j7z.class, "runningWorkers$volatile");
    public final /* synthetic */ osl c;
    public final ovj d;
    public final int e;
    public final rzz<Runnable> f;
    public final Object g;
    private volatile /* synthetic */ int runningWorkers$volatile;

    /* compiled from: LimitedDispatcher.kt */
    public final class a implements Runnable {
        public Runnable b;

        public a(Runnable runnable) {
            this.b = runnable;
        }

        @Override // java.lang.Runnable
        public final void run() {
            int i = 0;
            while (true) {
                try {
                    this.b.run();
                } catch (Throwable th) {
                    rvj.a(EmptyCoroutineContext.b, th);
                }
                Runnable U = j7z.this.U();
                if (U == null) {
                    return;
                }
                try {
                    this.b = U;
                    i++;
                    if (i >= 16) {
                        j7z j7zVar = j7z.this;
                        if (upj.d(j7zVar.d, j7zVar)) {
                            j7z j7zVar2 = j7z.this;
                            upj.c(j7zVar2.d, j7zVar2, this);
                            return;
                        }
                    }
                } catch (Throwable th2) {
                    j7z j7zVar3 = j7z.this;
                    synchronized (j7zVar3.g) {
                        j7z.h.decrementAndGet(j7zVar3);
                        throw th2;
                    }
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public j7z(ovj ovjVar, int i) {
        osl oslVar = ovjVar instanceof osl ? (osl) ovjVar : null;
        this.c = oslVar == null ? rel.a : oslVar;
        this.d = ovjVar;
        this.e = i;
        this.f = new rzz<>();
        this.g = new Object();
    }

    @Override // xsna.osl
    public final ogn J(long j, Runnable runnable, kotlin.coroutines.d dVar) {
        return this.c.J(j, runnable, dVar);
    }

    @Override // xsna.ovj
    public final void P(kotlin.coroutines.d dVar, Runnable runnable) {
        Runnable U;
        this.f.a(runnable);
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = h;
        if (atomicIntegerFieldUpdater.get(this) >= this.e || !V() || (U = U()) == null) {
            return;
        }
        try {
            upj.c(this.d, this, new a(U));
        } catch (Throwable th) {
            atomicIntegerFieldUpdater.decrementAndGet(this);
            throw th;
        }
    }

    @Override // xsna.ovj
    public final void Q(kotlin.coroutines.d dVar, Runnable runnable) {
        Runnable U;
        this.f.a(runnable);
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = h;
        if (atomicIntegerFieldUpdater.get(this) >= this.e || !V() || (U = U()) == null) {
            return;
        }
        try {
            this.d.Q(this, new a(U));
        } catch (Throwable th) {
            atomicIntegerFieldUpdater.decrementAndGet(this);
            throw th;
        }
    }

    @Override // xsna.ovj
    public final ovj T(int i) {
        p7i.c(i);
        return i >= this.e ? this : super.T(i);
    }

    public final Runnable U() {
        while (true) {
            Runnable c = this.f.c();
            if (c != null) {
                return c;
            }
            synchronized (this.g) {
                AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = h;
                atomicIntegerFieldUpdater.decrementAndGet(this);
                if (this.f.b() == 0) {
                    return null;
                }
                atomicIntegerFieldUpdater.incrementAndGet(this);
            }
        }
    }

    public final boolean V() {
        synchronized (this.g) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = h;
            if (atomicIntegerFieldUpdater.get(this) >= this.e) {
                return false;
            }
            atomicIntegerFieldUpdater.incrementAndGet(this);
            return true;
        }
    }

    @Override // xsna.osl
    public final void s(long j, lq9 lq9Var) {
        this.c.s(j, lq9Var);
    }

    @Override // xsna.ovj
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.d);
        sb.append(".limitedParallelism(");
        return vu5.b(sb, this.e, ')');
    }
}
