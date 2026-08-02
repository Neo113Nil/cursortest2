package xsna;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import xsna.osl;

/* compiled from: EventLoop.common.kt */
/* loaded from: classes11.dex */
public abstract class d0q extends e0q implements osl {
    public static final /* synthetic */ AtomicReferenceFieldUpdater g = AtomicReferenceFieldUpdater.newUpdater(d0q.class, Object.class, "_queue$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater h = AtomicReferenceFieldUpdater.newUpdater(d0q.class, Object.class, "_delayed$volatile");
    public static final /* synthetic */ AtomicIntegerFieldUpdater i = AtomicIntegerFieldUpdater.newUpdater(d0q.class, "_isCompleted$volatile");
    private volatile /* synthetic */ Object _delayed$volatile;
    private volatile /* synthetic */ int _isCompleted$volatile;
    private volatile /* synthetic */ Object _queue$volatile;

    /* compiled from: EventLoop.common.kt */
    /* loaded from: classes8.dex */
    public final class a extends c {
        public final lq9 d;

        public a(long j, lq9 lq9Var) {
            super(j);
            this.d = lq9Var;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.d.A(d0q.this, s3q0.a);
        }

        @Override // xsna.d0q.c
        public final String toString() {
            return super.toString() + this.d;
        }
    }

    /* compiled from: EventLoop.common.kt */
    /* loaded from: classes8.dex */
    public static final class b extends c {
        public final Runnable d;

        public b(long j, Runnable runnable) {
            super(j);
            this.d = runnable;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.d.run();
        }

        @Override // xsna.d0q.c
        public final String toString() {
            return super.toString() + this.d;
        }
    }

    /* compiled from: EventLoop.common.kt */
    /* loaded from: classes8.dex */
    public static abstract class c implements Runnable, Comparable<c>, ogn, hro0 {
        private volatile Object _heap;
        public long b;
        public int c = -1;

        public c(long j) {
            this.b = j;
        }

        @Override // xsna.hro0
        public final void b(d dVar) {
            if (this._heap == f0q.a) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            this._heap = dVar;
        }

        public final int c(long j, d dVar, d0q d0qVar) {
            synchronized (this) {
                if (this._heap == f0q.a) {
                    return 2;
                }
                synchronized (dVar) {
                    try {
                        Object[] objArr = dVar.a;
                        c cVar = (c) (objArr != null ? objArr[0] : null);
                        if (d0q.i.get(d0qVar) == 1) {
                            return 1;
                        }
                        if (cVar == null) {
                            dVar.c = j;
                        } else {
                            long j2 = cVar.b;
                            if (j2 - j < 0) {
                                j = j2;
                            }
                            if (j - dVar.c > 0) {
                                dVar.c = j;
                            }
                        }
                        long j3 = this.b;
                        long j4 = dVar.c;
                        if (j3 - j4 < 0) {
                            this.b = j4;
                        }
                        dVar.a(this);
                        return 0;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        }

        @Override // java.lang.Comparable
        public final int compareTo(c cVar) {
            long j = this.b - cVar.b;
            if (j > 0) {
                return 1;
            }
            return j < 0 ? -1 : 0;
        }

        public final boolean d(long j) {
            return j - this.b >= 0;
        }

        @Override // xsna.ogn
        public final void dispose() {
            synchronized (this) {
                try {
                    Object obj = this._heap;
                    con0 con0Var = f0q.a;
                    if (obj == con0Var) {
                        return;
                    }
                    d dVar = obj instanceof d ? (d) obj : null;
                    if (dVar != null) {
                        synchronized (dVar) {
                            Object obj2 = this._heap;
                            if ((obj2 instanceof gro0 ? (gro0) obj2 : null) != null) {
                                dVar.b(this.c);
                            }
                        }
                    }
                    this._heap = con0Var;
                    s3q0 s3q0Var = s3q0.a;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // xsna.hro0
        public final void setIndex(int i) {
            this.c = i;
        }

        public String toString() {
            return vu5.a(']', this.b, new StringBuilder("Delayed[nanos="));
        }
    }

    /* compiled from: EventLoop.common.kt */
    public static final class d extends gro0<c> {
        public long c;
    }

    @Override // xsna.osl
    public ogn J(long j, Runnable runnable, kotlin.coroutines.d dVar) {
        return osl.a.a(j, runnable, dVar);
    }

    @Override // xsna.ovj
    public final void P(kotlin.coroutines.d dVar, Runnable runnable) {
        d0(runnable);
    }

    @Override // xsna.c0q
    public final long Y() {
        Runnable runnable;
        Object obj;
        con0 con0Var = f0q.b;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = g;
        if (!a0()) {
            e0();
            loop0: while (true) {
                Object obj2 = atomicReferenceFieldUpdater.get(this);
                if (obj2 == null) {
                    break;
                }
                if (!(obj2 instanceof szz)) {
                    if (obj2 != con0Var) {
                        while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, null)) {
                            if (atomicReferenceFieldUpdater.get(this) != obj2) {
                                break;
                            }
                        }
                        runnable = (Runnable) obj2;
                        break loop0;
                    }
                    break;
                }
                szz szzVar = (szz) obj2;
                Object d2 = szzVar.d();
                if (d2 != szz.g) {
                    runnable = (Runnable) d2;
                    break;
                }
                szz c2 = szzVar.c();
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, c2) && atomicReferenceFieldUpdater.get(this) == obj2) {
                }
            }
            runnable = null;
            if (runnable != null) {
                runnable.run();
                return 0L;
            }
            sk3<ocn<?>> sk3Var = this.e;
            if (((sk3Var == null || sk3Var.isEmpty()) ? Long.MAX_VALUE : 0L) != 0) {
                Object obj3 = atomicReferenceFieldUpdater.get(this);
                if (obj3 != null) {
                    if (obj3 instanceof szz) {
                        long j = szz.f.get((szz) obj3);
                        if (((int) (1073741823 & j)) != ((int) ((j & 1152921503533105152L) >> 30))) {
                            return 0L;
                        }
                    } else if (obj3 == con0Var) {
                        return Long.MAX_VALUE;
                    }
                }
                d dVar = (d) h.get(this);
                if (dVar != null) {
                    synchronized (dVar) {
                        Object[] objArr = dVar.a;
                        obj = objArr != null ? objArr[0] : null;
                    }
                    c cVar = (c) obj;
                    if (cVar != null) {
                        long nanoTime = cVar.b - System.nanoTime();
                        if (nanoTime >= 0) {
                            return nanoTime;
                        }
                    }
                }
                return Long.MAX_VALUE;
            }
        }
        return 0L;
    }

    public void d0(Runnable runnable) {
        e0();
        if (!f0(runnable)) {
            qel.j.d0(runnable);
            return;
        }
        Thread b0 = b0();
        if (Thread.currentThread() != b0) {
            LockSupport.unpark(b0);
        }
    }

    public final void e0() {
        c cVar;
        d dVar = (d) h.get(this);
        if (dVar == null || gro0.b.get(dVar) == 0) {
            return;
        }
        long nanoTime = System.nanoTime();
        do {
            synchronized (dVar) {
                try {
                    Object[] objArr = dVar.a;
                    Object obj = objArr != null ? objArr[0] : null;
                    if (obj != null) {
                        c cVar2 = (c) obj;
                        cVar = cVar2.d(nanoTime) ? f0(cVar2) : false ? dVar.b(0) : null;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } while (cVar != null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0062, code lost:
    
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean f0(Runnable runnable) {
        loop0: while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = g;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (i.get(this) != 1) {
                if (obj != null) {
                    if (!(obj instanceof szz)) {
                        if (obj != f0q.b) {
                            szz szzVar = new szz(8, true);
                            szzVar.a((Runnable) obj);
                            szzVar.a(runnable);
                            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, szzVar)) {
                                if (atomicReferenceFieldUpdater.get(this) != obj) {
                                    break;
                                }
                            }
                            break loop0;
                        }
                        return false;
                    }
                    szz szzVar2 = (szz) obj;
                    int a2 = szzVar2.a(runnable);
                    if (a2 == 0) {
                        break;
                    }
                    if (a2 == 1) {
                        szz c2 = szzVar2.c();
                        while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, c2) && atomicReferenceFieldUpdater.get(this) == obj) {
                        }
                    } else if (a2 == 2) {
                        return false;
                    }
                } else {
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, null, runnable)) {
                        if (atomicReferenceFieldUpdater.get(this) != null) {
                            break;
                        }
                    }
                    break loop0;
                }
            } else {
                return false;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0024, code lost:
    
        if ((xsna.gro0.b.get(r0) == 0) == false) goto L29;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean g0() {
        sk3<ocn<?>> sk3Var = this.e;
        if (sk3Var != null ? sk3Var.isEmpty() : true) {
            d dVar = (d) h.get(this);
            if (dVar != null) {
            }
            Object obj = g.get(this);
            if (obj != null) {
                if (obj instanceof szz) {
                    long j = szz.f.get((szz) obj);
                    return ((int) (1073741823 & j)) == ((int) ((j & 1152921503533105152L) >> 30));
                }
                if (obj == f0q.b) {
                }
            }
            return true;
        }
        return false;
    }

    public final void h0(long j, c cVar) {
        int c2;
        Thread b0;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = h;
        if (i.get(this) == 1) {
            c2 = 1;
        } else {
            d dVar = (d) atomicReferenceFieldUpdater.get(this);
            if (dVar == null) {
                d dVar2 = new d();
                dVar2.c = j;
                yq.h(atomicReferenceFieldUpdater, this, dVar2);
                dVar = (d) atomicReferenceFieldUpdater.get(this);
            }
            c2 = cVar.c(j, dVar, this);
        }
        if (c2 != 0) {
            if (c2 == 1) {
                c0(j, cVar);
                return;
            } else {
                if (c2 != 2) {
                    throw new IllegalStateException("unexpected result");
                }
                return;
            }
        }
        d dVar3 = (d) atomicReferenceFieldUpdater.get(this);
        if (dVar3 != null) {
            synchronized (dVar3) {
                Object[] objArr = dVar3.a;
                r5 = objArr != null ? objArr[0] : null;
            }
            r5 = (c) r5;
        }
        if (r5 != cVar || Thread.currentThread() == (b0 = b0())) {
            return;
        }
        LockSupport.unpark(b0);
    }

    @Override // xsna.osl
    public final void s(long j, lq9 lq9Var) {
        long j2 = j > 0 ? j >= 9223372036854L ? Long.MAX_VALUE : 1000000 * j : 0L;
        if (j2 < 4611686018427387903L) {
            long nanoTime = System.nanoTime();
            a aVar = new a(j2 + nanoTime, lq9Var);
            h0(nanoTime, aVar);
            lq9Var.s(new xgn(aVar));
        }
    }

    @Override // xsna.c0q
    public void shutdown() {
        c b2;
        bro0.a.set(null);
        i.set(this, 1);
        con0 con0Var = f0q.b;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = g;
        loop0: while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj != null) {
                if (!(obj instanceof szz)) {
                    if (obj != con0Var) {
                        szz szzVar = new szz(8, true);
                        szzVar.a((Runnable) obj);
                        while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, szzVar)) {
                            if (atomicReferenceFieldUpdater.get(this) != obj) {
                                break;
                            }
                        }
                        break loop0;
                    }
                    break;
                }
                ((szz) obj).b();
                break;
            }
            while (!atomicReferenceFieldUpdater.compareAndSet(this, null, con0Var)) {
                if (atomicReferenceFieldUpdater.get(this) != null) {
                    break;
                }
            }
            break loop0;
        }
        while (Y() <= 0) {
        }
        long nanoTime = System.nanoTime();
        while (true) {
            d dVar = (d) h.get(this);
            if (dVar == null) {
                return;
            }
            synchronized (dVar) {
                b2 = gro0.b.get(dVar) > 0 ? dVar.b(0) : null;
            }
            c cVar = b2;
            if (cVar == null) {
                return;
            } else {
                c0(nanoTime, cVar);
            }
        }
    }
}
