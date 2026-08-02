package xsna;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: Semaphore.kt */
/* loaded from: classes11.dex */
public class bhi0 {
    public static final /* synthetic */ AtomicReferenceFieldUpdater d = AtomicReferenceFieldUpdater.newUpdater(bhi0.class, Object.class, "head$volatile");
    public static final /* synthetic */ AtomicLongFieldUpdater e = AtomicLongFieldUpdater.newUpdater(bhi0.class, "deqIdx$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater f = AtomicReferenceFieldUpdater.newUpdater(bhi0.class, Object.class, "tail$volatile");
    public static final /* synthetic */ AtomicLongFieldUpdater g = AtomicLongFieldUpdater.newUpdater(bhi0.class, "enqIdx$volatile");
    public static final /* synthetic */ AtomicIntegerFieldUpdater h = AtomicIntegerFieldUpdater.newUpdater(bhi0.class, "_availablePermits$volatile");
    private volatile /* synthetic */ int _availablePermits$volatile;
    public final int b;
    public final ahi0 c;
    private volatile /* synthetic */ long deqIdx$volatile;
    private volatile /* synthetic */ long enqIdx$volatile;
    private volatile /* synthetic */ Object head$volatile;
    private volatile /* synthetic */ Object tail$volatile;

    /* compiled from: Semaphore.kt */
    public /* synthetic */ class a extends FunctionReferenceImpl implements wzs<Long, fhi0, fhi0> {
        public static final a b = new a(2, ehi0.class, "createSegment", "createSegment(JLkotlinx/coroutines/sync/SemaphoreSegment;)Lkotlinx/coroutines/sync/SemaphoreSegment;", 1);

        @Override // xsna.wzs
        public final fhi0 invoke(Long l, fhi0 fhi0Var) {
            int i = ehi0.a;
            return new fhi0(l.longValue(), fhi0Var, 0);
        }
    }

    /* JADX WARN: Type inference failed for: r6v6, types: [xsna.ahi0] */
    public bhi0(int i, int i2) {
        this.b = i;
        if (i <= 0) {
            throw new IllegalArgumentException(lhg.a(i, "Semaphore should have at least 1 permit, but had ").toString());
        }
        if (i2 < 0 || i2 > i) {
            throw new IllegalArgumentException(lhg.a(i, "The number of acquired permits should be in 0..").toString());
        }
        fhi0 fhi0Var = new fhi0(0L, null, 2);
        this.head$volatile = fhi0Var;
        this.tail$volatile = fhi0Var;
        this._availablePermits$volatile = i - i2;
        this.c = new yzs() { // from class: xsna.ahi0
            @Override // xsna.yzs
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                bhi0.this.release();
                return s3q0.a;
            }
        };
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0025, code lost:
    
        r4.F(xsna.s3q0.a, r3.c);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ContinuationImpl continuationImpl) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int andDecrement;
        int i;
        do {
            atomicIntegerFieldUpdater = h;
            andDecrement = atomicIntegerFieldUpdater.getAndDecrement(this);
            i = this.b;
        } while (andDecrement > i);
        if (andDecrement > 0) {
            return s3q0.a;
        }
        lq9 d2 = v801.d(s7s0.c(continuationImpl));
        try {
            if (!d(d2)) {
                while (true) {
                    int andDecrement2 = atomicIntegerFieldUpdater.getAndDecrement(this);
                    if (andDecrement2 <= i) {
                        if (andDecrement2 > 0) {
                            break;
                        }
                        if (d(d2)) {
                            break;
                        }
                    }
                }
            }
            Object n = d2.n();
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (n != coroutineSingletons) {
                n = s3q0.a;
            }
            return n == coroutineSingletons ? n : s3q0.a;
        } catch (Throwable th) {
            d2.x();
            throw th;
        }
    }

    public final boolean d(a8x0 a8x0Var) {
        Object c;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f;
        fhi0 fhi0Var = (fhi0) atomicReferenceFieldUpdater.get(this);
        long andIncrement = g.getAndIncrement(this);
        a aVar = a.b;
        long j = andIncrement / ehi0.f;
        loop0: while (true) {
            c = rwi.c(fhi0Var, j, aVar);
            if (!h5i0.c(c)) {
                n4i0 b = h5i0.b(c);
                while (true) {
                    n4i0 n4i0Var = (n4i0) atomicReferenceFieldUpdater.get(this);
                    if (n4i0Var.d >= b.d) {
                        break loop0;
                    }
                    if (!b.j()) {
                        break;
                    }
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, n4i0Var, b)) {
                        if (atomicReferenceFieldUpdater.get(this) != n4i0Var) {
                            if (b.f()) {
                                b.e();
                            }
                        }
                    }
                    if (n4i0Var.f()) {
                        n4i0Var.e();
                    }
                }
            } else {
                break;
            }
        }
        fhi0 fhi0Var2 = (fhi0) h5i0.b(c);
        AtomicReferenceArray atomicReferenceArray = fhi0Var2.f;
        int i = (int) (andIncrement % ehi0.f);
        while (!atomicReferenceArray.compareAndSet(i, null, a8x0Var)) {
            if (atomicReferenceArray.get(i) != null) {
                con0 con0Var = ehi0.b;
                con0 con0Var2 = ehi0.c;
                while (!atomicReferenceArray.compareAndSet(i, con0Var, con0Var2)) {
                    if (atomicReferenceArray.get(i) != con0Var) {
                        return false;
                    }
                }
                ((kq9) a8x0Var).F(s3q0.a, this.c);
                return true;
            }
        }
        a8x0Var.d(fhi0Var2, i);
        return true;
    }

    public final void release() {
        int i;
        Object c;
        boolean z;
        do {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = h;
            int andIncrement = atomicIntegerFieldUpdater.getAndIncrement(this);
            int i2 = this.b;
            if (andIncrement >= i2) {
                do {
                    i = atomicIntegerFieldUpdater.get(this);
                    if (i <= i2) {
                        break;
                    }
                } while (!atomicIntegerFieldUpdater.compareAndSet(this, i, i2));
                throw new IllegalStateException(("The number of released permits cannot be greater than " + i2).toString());
            }
            if (andIncrement >= 0) {
                return;
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = d;
            fhi0 fhi0Var = (fhi0) atomicReferenceFieldUpdater.get(this);
            long andIncrement2 = e.getAndIncrement(this);
            long j = andIncrement2 / ehi0.f;
            chi0 chi0Var = chi0.b;
            while (true) {
                c = rwi.c(fhi0Var, j, chi0Var);
                if (h5i0.c(c)) {
                    break;
                }
                n4i0 b = h5i0.b(c);
                while (true) {
                    n4i0 n4i0Var = (n4i0) atomicReferenceFieldUpdater.get(this);
                    if (n4i0Var.d >= b.d) {
                        break;
                    }
                    if (!b.j()) {
                        break;
                    }
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, n4i0Var, b)) {
                        if (atomicReferenceFieldUpdater.get(this) != n4i0Var) {
                            if (b.f()) {
                                b.e();
                            }
                        }
                    }
                    if (n4i0Var.f()) {
                        n4i0Var.e();
                    }
                }
            }
            fhi0 fhi0Var2 = (fhi0) h5i0.b(c);
            fhi0Var2.b();
            AtomicReferenceArray atomicReferenceArray = fhi0Var2.f;
            z = false;
            if (fhi0Var2.d <= j) {
                int i3 = (int) (andIncrement2 % ehi0.f);
                Object andSet = atomicReferenceArray.getAndSet(i3, ehi0.b);
                if (andSet == null) {
                    int i4 = ehi0.a;
                    for (int i5 = 0; i5 < i4; i5++) {
                        if (atomicReferenceArray.get(i3) == ehi0.c) {
                            z = true;
                            break;
                        }
                    }
                    con0 con0Var = ehi0.b;
                    con0 con0Var2 = ehi0.d;
                    while (true) {
                        if (!atomicReferenceArray.compareAndSet(i3, con0Var, con0Var2)) {
                            if (atomicReferenceArray.get(i3) != con0Var) {
                                break;
                            }
                        } else {
                            z = true;
                            break;
                        }
                    }
                    z = !z;
                } else if (andSet != ehi0.e) {
                    if (andSet instanceof kq9) {
                        kq9 kq9Var = (kq9) andSet;
                        con0 K = kq9Var.K(s3q0.a, this.c);
                        if (K != null) {
                            kq9Var.D(K);
                            z = true;
                            break;
                            break;
                        }
                    } else {
                        if (!(andSet instanceof x8i0)) {
                            throw new IllegalStateException(rqi.c(andSet, "unexpected: "));
                        }
                        z = ((x8i0) andSet).e(this, s3q0.a);
                    }
                }
            }
        } while (!z);
    }
}
