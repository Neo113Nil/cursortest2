package xsna;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* compiled from: Mutex.kt */
/* loaded from: classes11.dex */
public final class wi50 extends bhi0 implements ui50 {
    public static final /* synthetic */ AtomicReferenceFieldUpdater i = AtomicReferenceFieldUpdater.newUpdater(wi50.class, Object.class, "owner$volatile");
    private volatile /* synthetic */ Object owner$volatile;

    /* compiled from: Mutex.kt */
    public final class a implements kq9<s3q0>, a8x0 {
        public final lq9<s3q0> b;

        public a(lq9 lq9Var) {
            this.b = lq9Var;
        }

        @Override // xsna.kq9
        public final void D(Object obj) {
            this.b.D(obj);
        }

        @Override // xsna.kq9
        public final void F(Object obj, yzs yzsVar) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = wi50.i;
            wi50 wi50Var = wi50.this;
            atomicReferenceFieldUpdater.set(wi50Var, null);
            nl30 nl30Var = new nl30(wi50Var, this);
            this.b.p((s3q0) obj, nl30Var);
        }

        @Override // xsna.kq9
        public final con0 K(Object obj, yzs yzsVar) {
            final wi50 wi50Var = wi50.this;
            yzs yzsVar2 = new yzs(this) { // from class: xsna.vi50
                @Override // xsna.yzs
                public final Object invoke(Object obj2, Object obj3, Object obj4) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = wi50.i;
                    wi50 wi50Var2 = wi50.this;
                    atomicReferenceFieldUpdater.set(wi50Var2, null);
                    wi50Var2.c(null);
                    return s3q0.a;
                }
            };
            con0 C = this.b.C((s3q0) obj, yzsVar2);
            if (C != null) {
                wi50.i.set(wi50Var, null);
            }
            return C;
        }

        @Override // xsna.a8x0
        public final void d(n4i0<?> n4i0Var, int i) {
            this.b.d(n4i0Var, i);
        }

        @Override // xsna.spj
        public final kotlin.coroutines.d getContext() {
            return this.b.f;
        }

        @Override // xsna.kq9
        public final boolean isActive() {
            return this.b.isActive();
        }

        @Override // xsna.kq9
        public final void p(s3q0 s3q0Var, izs izsVar) {
            this.b.p(s3q0Var, null);
        }

        @Override // xsna.spj
        public final void resumeWith(Object obj) {
            this.b.resumeWith(obj);
        }

        @Override // xsna.kq9
        public final boolean z(Throwable th) {
            return this.b.z(th);
        }
    }

    public wi50(boolean z) {
        super(1, z ? 1 : 0);
        this.owner$volatile = z ? null : bay.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0022, code lost:
    
        r0.F(xsna.s3q0.a, r3.c);
     */
    @Override // xsna.ui50
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(spj spjVar) {
        if (f()) {
            return s3q0.a;
        }
        lq9 d = v801.d(s7s0.c(spjVar));
        try {
            a aVar = new a(d);
            while (true) {
                int andDecrement = bhi0.h.getAndDecrement(this);
                if (andDecrement <= this.b) {
                    if (andDecrement > 0) {
                        break;
                    }
                    if (d(aVar)) {
                        break;
                    }
                }
            }
            Object n = d.n();
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (n != coroutineSingletons) {
                n = s3q0.a;
            }
            return n == coroutineSingletons ? n : s3q0.a;
        } catch (Throwable th) {
            d.x();
            throw th;
        }
    }

    @Override // xsna.ui50
    public final void c(Object obj) {
        while (e()) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = i;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            con0 con0Var = bay.a;
            if (obj2 != con0Var) {
                if (obj2 == obj || obj == null) {
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, con0Var)) {
                        if (atomicReferenceFieldUpdater.get(this) != obj2) {
                            break;
                        }
                    }
                    release();
                    return;
                }
                throw new IllegalStateException(("This mutex is locked by " + obj2 + ", but " + obj + " is expected").toString());
            }
        }
        throw new IllegalStateException("This mutex is not locked");
    }

    public final boolean e() {
        return Math.max(bhi0.h.get(this), 0) == 0;
    }

    public final boolean f() {
        int i2;
        char c;
        while (true) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = bhi0.h;
            int i3 = atomicIntegerFieldUpdater.get(this);
            int i4 = this.b;
            if (i3 > i4) {
                do {
                    i2 = atomicIntegerFieldUpdater.get(this);
                    if (i2 > i4) {
                    }
                } while (!atomicIntegerFieldUpdater.compareAndSet(this, i2, i4));
            } else {
                if (i3 <= 0) {
                    c = 1;
                    break;
                }
                if (atomicIntegerFieldUpdater.compareAndSet(this, i3, i3 - 1)) {
                    i.set(this, null);
                    c = 0;
                    break;
                }
            }
        }
        if (c == 0) {
            return true;
        }
        if (c == 1) {
            return false;
        }
        if (c != 2) {
            throw new IllegalStateException("unexpected");
        }
        throw new IllegalStateException("This mutex is already locked by the specified owner: null".toString());
    }

    public final String toString() {
        return "Mutex@" + y6l.a(this) + "[isLocked=" + e() + ",owner=" + i.get(this) + ']';
    }
}
