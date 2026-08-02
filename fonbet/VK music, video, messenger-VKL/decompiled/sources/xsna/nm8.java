package xsna;

import com.ironsource.X3;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlinx.coroutines.channels.ClosedReceiveChannelException;
import kotlinx.coroutines.channels.ClosedSendChannelException;
import kotlinx.coroutines.internal.UndeliveredElementException;
import kotlinx.coroutines.selects.TrySelectDetailedResult;
import xsna.kbb;

/* compiled from: BufferedChannel.kt */
/* loaded from: classes11.dex */
public class nm8<E> implements qta<E> {
    public static final /* synthetic */ AtomicLongFieldUpdater e = AtomicLongFieldUpdater.newUpdater(nm8.class, "sendersAndCloseStatus$volatile");
    public static final /* synthetic */ AtomicLongFieldUpdater f = AtomicLongFieldUpdater.newUpdater(nm8.class, "receivers$volatile");
    public static final /* synthetic */ AtomicLongFieldUpdater g = AtomicLongFieldUpdater.newUpdater(nm8.class, "bufferEnd$volatile");
    public static final /* synthetic */ AtomicLongFieldUpdater h = AtomicLongFieldUpdater.newUpdater(nm8.class, "completedExpandBuffersAndPauseFlag$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater i = AtomicReferenceFieldUpdater.newUpdater(nm8.class, Object.class, "sendSegment$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater j = AtomicReferenceFieldUpdater.newUpdater(nm8.class, Object.class, "receiveSegment$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater k = AtomicReferenceFieldUpdater.newUpdater(nm8.class, Object.class, "bufferEndSegment$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater l = AtomicReferenceFieldUpdater.newUpdater(nm8.class, Object.class, "_closeCause$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater m = AtomicReferenceFieldUpdater.newUpdater(nm8.class, Object.class, "closeHandler$volatile");
    private volatile /* synthetic */ Object _closeCause$volatile;
    public final int b;
    private volatile /* synthetic */ long bufferEnd$volatile;
    private volatile /* synthetic */ Object bufferEndSegment$volatile;
    public final izs<E, s3q0> c;
    private volatile /* synthetic */ Object closeHandler$volatile;
    private volatile /* synthetic */ long completedExpandBuffersAndPauseFlag$volatile;
    public final km8 d;
    private volatile /* synthetic */ Object receiveSegment$volatile;
    private volatile /* synthetic */ long receivers$volatile;
    private volatile /* synthetic */ Object sendSegment$volatile;
    private volatile /* synthetic */ long sendersAndCloseStatus$volatile;

    /* compiled from: BufferedChannel.kt */
    public final class a implements o0b<E>, a8x0 {
        public Object b = tm8.p;
        public lq9<? super Boolean> c;

        public a() {
        }

        @Override // xsna.o0b
        public final Object a(ContinuationImpl continuationImpl) {
            qbb<E> qbbVar;
            Boolean bool;
            Object obj = this.b;
            boolean z = true;
            if (obj == tm8.p || obj == tm8.l) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = nm8.j;
                nm8<E> nm8Var = nm8.this;
                qbb<E> qbbVar2 = (qbb) atomicReferenceFieldUpdater.get(nm8Var);
                while (true) {
                    if (nm8Var.A()) {
                        this.b = tm8.l;
                        Throwable r = nm8Var.r();
                        if (r != null) {
                            int i = nok0.a;
                            throw r;
                        }
                        z = false;
                    } else {
                        long andIncrement = nm8.f.getAndIncrement(nm8Var);
                        long j = tm8.b;
                        long j2 = andIncrement / j;
                        int i2 = (int) (andIncrement % j);
                        if (qbbVar2.d != j2) {
                            qbbVar = nm8Var.q(j2, qbbVar2);
                            if (qbbVar == null) {
                                continue;
                            }
                        } else {
                            qbbVar = qbbVar2;
                        }
                        Object L = nm8Var.L(qbbVar, i2, andIncrement, null);
                        con0 con0Var = tm8.m;
                        if (L == con0Var) {
                            throw new IllegalStateException("unreachable");
                        }
                        con0 con0Var2 = tm8.o;
                        if (L == con0Var2) {
                            if (andIncrement < nm8Var.x()) {
                                qbbVar.b();
                            }
                            qbbVar2 = qbbVar;
                        } else {
                            if (L == tm8.n) {
                                nm8<E> nm8Var2 = nm8.this;
                                lq9<? super Boolean> d = v801.d(s7s0.c(continuationImpl));
                                try {
                                    this.c = d;
                                    Object L2 = nm8Var2.L(qbbVar, i2, andIncrement, this);
                                    izs<E, s3q0> izsVar = nm8Var2.c;
                                    if (L2 == con0Var) {
                                        d(qbbVar, i2);
                                    } else {
                                        lm8 lm8Var = null;
                                        if (L2 == con0Var2) {
                                            if (andIncrement < nm8Var2.x()) {
                                                qbbVar.b();
                                            }
                                            qbb<E> qbbVar3 = (qbb) nm8.j.get(nm8Var2);
                                            while (true) {
                                                if (nm8Var2.A()) {
                                                    lq9<? super Boolean> lq9Var = this.c;
                                                    this.c = null;
                                                    this.b = tm8.l;
                                                    Throwable r2 = nm8Var.r();
                                                    if (r2 == null) {
                                                        lq9Var.resumeWith(Boolean.FALSE);
                                                    } else {
                                                        lq9Var.resumeWith(new Result.Failure(r2));
                                                    }
                                                } else {
                                                    long andIncrement2 = nm8.f.getAndIncrement(nm8Var2);
                                                    long j3 = tm8.b;
                                                    long j4 = andIncrement2 / j3;
                                                    int i3 = (int) (andIncrement2 % j3);
                                                    if (qbbVar3.d != j4) {
                                                        qbb<E> q = nm8Var2.q(j4, qbbVar3);
                                                        if (q != null) {
                                                            qbbVar3 = q;
                                                        }
                                                    }
                                                    Object L3 = nm8Var2.L(qbbVar3, i3, andIncrement2, this);
                                                    if (L3 == tm8.m) {
                                                        d(qbbVar3, i3);
                                                        break;
                                                    }
                                                    if (L3 == tm8.o) {
                                                        if (andIncrement2 < nm8Var2.x()) {
                                                            qbbVar3.b();
                                                        }
                                                    } else {
                                                        if (L3 == tm8.n) {
                                                            throw new IllegalStateException("unexpected");
                                                        }
                                                        qbbVar3.b();
                                                        this.b = L3;
                                                        this.c = null;
                                                        bool = Boolean.TRUE;
                                                        if (izsVar != null) {
                                                            lm8Var = new lm8(L3, izsVar);
                                                        }
                                                    }
                                                }
                                            }
                                        } else {
                                            qbbVar.b();
                                            this.b = L2;
                                            this.c = null;
                                            bool = Boolean.TRUE;
                                            if (izsVar != null) {
                                                lm8Var = new lm8(L2, izsVar);
                                            }
                                        }
                                        d.F(bool, lm8Var);
                                    }
                                    Object n = d.n();
                                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                                    return n;
                                } catch (Throwable th) {
                                    d.x();
                                    throw th;
                                }
                            }
                            qbbVar.b();
                            this.b = L;
                        }
                    }
                }
            }
            return Boolean.valueOf(z);
        }

        @Override // xsna.a8x0
        public final void d(n4i0<?> n4i0Var, int i) {
            lq9<? super Boolean> lq9Var = this.c;
            if (lq9Var != null) {
                lq9Var.d(n4i0Var, i);
            }
        }

        @Override // xsna.o0b
        public final E next() {
            E e = (E) this.b;
            con0 con0Var = tm8.p;
            if (e == con0Var) {
                throw new IllegalStateException("`hasNext()` has not been invoked");
            }
            this.b = con0Var;
            if (e != tm8.l) {
                return e;
            }
            AtomicLongFieldUpdater atomicLongFieldUpdater = nm8.e;
            Throwable v = nm8.this.v();
            int i = nok0.a;
            throw v;
        }
    }

    /* compiled from: BufferedChannel.kt */
    public static final class b implements a8x0 {
        @Override // xsna.a8x0
        public final void d(n4i0<?> n4i0Var, int i) {
            throw null;
        }
    }

    /* compiled from: BufferedChannel.kt */
    /* loaded from: classes8.dex */
    public /* synthetic */ class c extends FunctionReferenceImpl implements yzs<nm8<?>, x8i0<?>, Object, s3q0> {
        public static final c b = new c(3, nm8.class, "registerSelectForReceive", "registerSelectForReceive(Lkotlinx/coroutines/selects/SelectInstance;Ljava/lang/Object;)V", 0);

        @Override // xsna.yzs
        public final s3q0 invoke(nm8<?> nm8Var, x8i0<?> x8i0Var, Object obj) {
            nm8.i(nm8Var, x8i0Var);
            return s3q0.a;
        }
    }

    /* compiled from: BufferedChannel.kt */
    /* loaded from: classes8.dex */
    public /* synthetic */ class d extends FunctionReferenceImpl implements yzs<nm8<?>, Object, Object, Object> {
        public static final d b = new d(3, nm8.class, "processResultSelectReceive", "processResultSelectReceive(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", 0);

        @Override // xsna.yzs
        public final Object invoke(nm8<?> nm8Var, Object obj, Object obj2) {
            nm8<?> nm8Var2 = nm8Var;
            AtomicLongFieldUpdater atomicLongFieldUpdater = nm8.e;
            nm8Var2.getClass();
            if (obj2 != tm8.l) {
                return obj2;
            }
            throw nm8Var2.v();
        }
    }

    /* compiled from: BufferedChannel.kt */
    /* loaded from: classes8.dex */
    public /* synthetic */ class e extends FunctionReferenceImpl implements yzs<nm8<?>, x8i0<?>, Object, s3q0> {
        public static final e b = new e(3, nm8.class, "registerSelectForReceive", "registerSelectForReceive(Lkotlinx/coroutines/selects/SelectInstance;Ljava/lang/Object;)V", 0);

        @Override // xsna.yzs
        public final s3q0 invoke(nm8<?> nm8Var, x8i0<?> x8i0Var, Object obj) {
            nm8.i(nm8Var, x8i0Var);
            return s3q0.a;
        }
    }

    /* compiled from: BufferedChannel.kt */
    /* loaded from: classes8.dex */
    public /* synthetic */ class f extends FunctionReferenceImpl implements yzs<nm8<?>, Object, Object, Object> {
        public static final f b = new f(3, nm8.class, "processResultSelectReceiveCatching", "processResultSelectReceiveCatching(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", 0);

        @Override // xsna.yzs
        public final Object invoke(nm8<?> nm8Var, Object obj, Object obj2) {
            nm8<?> nm8Var2 = nm8Var;
            AtomicLongFieldUpdater atomicLongFieldUpdater = nm8.e;
            nm8Var2.getClass();
            if (obj2 == tm8.l) {
                obj2 = new kbb.a(nm8Var2.r());
            }
            return new kbb(obj2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0, types: [xsna.izs<? super E, xsna.s3q0>, xsna.izs<E, xsna.s3q0>] */
    /* JADX WARN: Type inference failed for: r9v8, types: [xsna.km8] */
    public nm8(int i2, izs<? super E, s3q0> izsVar) {
        this.b = i2;
        this.c = izsVar;
        if (i2 < 0) {
            throw new IllegalArgumentException(tgw.b(i2, "Invalid channel capacity: ", ", should be >=0").toString());
        }
        qbb<Object> qbbVar = tm8.a;
        this.bufferEnd$volatile = i2 != 0 ? i2 != Integer.MAX_VALUE ? i2 : Long.MAX_VALUE : 0L;
        this.completedExpandBuffersAndPauseFlag$volatile = g.get(this);
        qbb<Object> qbbVar2 = new qbb<>(0L, null, this, 3);
        this.sendSegment$volatile = qbbVar2;
        this.receiveSegment$volatile = qbbVar2;
        this.bufferEndSegment$volatile = D() ? tm8.a : qbbVar2;
        this.d = izsVar != 0 ? new yzs() { // from class: xsna.km8
            @Override // xsna.yzs
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return new mm8(obj3, nm8.this, (x8i0) obj, 0);
            }
        } : null;
        this._closeCause$volatile = tm8.s;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Object G(nm8 nm8Var, ContinuationImpl continuationImpl) {
        qm8 qm8Var;
        int i2;
        qbb<E> qbbVar;
        if (continuationImpl instanceof qm8) {
            qm8Var = (qm8) continuationImpl;
            int i3 = qm8Var.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                qm8Var.label = i3 - Integer.MIN_VALUE;
                qm8 qm8Var2 = qm8Var;
                Object obj = qm8Var2.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i2 = qm8Var2.label;
                if (i2 == 0) {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.a.a(obj);
                    return ((kbb) obj).a;
                }
                kotlin.a.a(obj);
                qbb<E> qbbVar2 = (qbb) j.get(nm8Var);
                while (!nm8Var.A()) {
                    long andIncrement = f.getAndIncrement(nm8Var);
                    long j2 = tm8.b;
                    long j3 = andIncrement / j2;
                    int i4 = (int) (andIncrement % j2);
                    if (qbbVar2.d != j3) {
                        qbb<E> q = nm8Var.q(j3, qbbVar2);
                        if (q == null) {
                            continue;
                        } else {
                            qbbVar = q;
                        }
                    } else {
                        qbbVar = qbbVar2;
                    }
                    nm8 nm8Var2 = nm8Var;
                    Object L = nm8Var2.L(qbbVar, i4, andIncrement, null);
                    if (L == tm8.m) {
                        throw new IllegalStateException("unexpected");
                    }
                    if (L != tm8.o) {
                        if (L != tm8.n) {
                            qbbVar.b();
                            return L;
                        }
                        qm8Var2.label = 1;
                        Object H = nm8Var2.H(qbbVar, i4, andIncrement, qm8Var2);
                        return H == coroutineSingletons ? coroutineSingletons : H;
                    }
                    if (andIncrement < nm8Var2.x()) {
                        qbbVar.b();
                    }
                    nm8Var = nm8Var2;
                    qbbVar2 = qbbVar;
                }
                return new kbb.a(nm8Var.r());
            }
        }
        qm8Var = new qm8(nm8Var, continuationImpl);
        qm8 qm8Var22 = qm8Var;
        Object obj2 = qm8Var22.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i2 = qm8Var22.label;
        if (i2 == 0) {
        }
    }

    public static final qbb c(nm8 nm8Var, long j2, qbb qbbVar) {
        Object c2;
        nm8 nm8Var2;
        qbb<Object> qbbVar2 = tm8.a;
        sm8 sm8Var = sm8.b;
        loop0: while (true) {
            c2 = rwi.c(qbbVar, j2, sm8Var);
            if (!h5i0.c(c2)) {
                n4i0 b2 = h5i0.b(c2);
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = i;
                    n4i0 n4i0Var = (n4i0) atomicReferenceFieldUpdater.get(nm8Var);
                    if (n4i0Var.d >= b2.d) {
                        break loop0;
                    }
                    if (!b2.j()) {
                        break;
                    }
                    if (ao.b(atomicReferenceFieldUpdater, nm8Var, n4i0Var, b2)) {
                        if (n4i0Var.f()) {
                            n4i0Var.e();
                        }
                    } else if (b2.f()) {
                        b2.e();
                    }
                }
            } else {
                break;
            }
        }
        boolean c3 = h5i0.c(c2);
        AtomicLongFieldUpdater atomicLongFieldUpdater = f;
        if (c3) {
            nm8Var.d();
            if (qbbVar.d * tm8.b < atomicLongFieldUpdater.get(nm8Var)) {
                qbbVar.b();
                return null;
            }
        } else {
            qbb qbbVar3 = (qbb) h5i0.b(c2);
            long j3 = qbbVar3.d;
            if (j3 <= j2) {
                return qbbVar3;
            }
            long j4 = tm8.b * j3;
            while (true) {
                long j5 = e.get(nm8Var);
                long j6 = 1152921504606846975L & j5;
                if (j6 >= j4) {
                    nm8Var2 = nm8Var;
                    break;
                }
                nm8Var2 = nm8Var;
                if (e.compareAndSet(nm8Var2, j5, (((int) (j5 >> 60)) << 60) + j6)) {
                    break;
                }
                nm8Var = nm8Var2;
            }
            if (j3 * tm8.b < atomicLongFieldUpdater.get(nm8Var2)) {
                qbbVar3.b();
            }
        }
        return null;
    }

    public static final void h(nm8 nm8Var, Object obj, lq9 lq9Var) {
        izs<E, s3q0> izsVar = nm8Var.c;
        if (izsVar != null) {
            fvr.g(izsVar, obj, lq9Var.f);
        }
        lq9Var.resumeWith(new Result.Failure(nm8Var.w()));
    }

    public static final void i(nm8 nm8Var, x8i0 x8i0Var) {
        qbb<E> qbbVar;
        nm8 nm8Var2;
        x8i0 x8i0Var2;
        int i2;
        nm8Var.getClass();
        qbb<E> qbbVar2 = (qbb) j.get(nm8Var);
        while (!nm8Var.A()) {
            long andIncrement = f.getAndIncrement(nm8Var);
            long j2 = tm8.b;
            long j3 = andIncrement / j2;
            int i3 = (int) (andIncrement % j2);
            if (qbbVar2.d != j3) {
                qbb<E> q = nm8Var.q(j3, qbbVar2);
                if (q == null) {
                    continue;
                } else {
                    qbbVar = q;
                    x8i0Var2 = x8i0Var;
                    i2 = i3;
                    nm8Var2 = nm8Var;
                }
            } else {
                qbbVar = qbbVar2;
                nm8Var2 = nm8Var;
                x8i0Var2 = x8i0Var;
                i2 = i3;
            }
            Object L = nm8Var2.L(qbbVar, i2, andIncrement, x8i0Var2);
            qbbVar2 = qbbVar;
            if (L == tm8.m) {
                a8x0 a8x0Var = x8i0Var2 instanceof a8x0 ? (a8x0) x8i0Var2 : null;
                if (a8x0Var != null) {
                    a8x0Var.d(qbbVar2, i2);
                    return;
                }
                return;
            }
            if (L != tm8.o) {
                if (L == tm8.n) {
                    throw new IllegalStateException("unexpected");
                }
                qbbVar2.b();
                x8i0Var2.c(L);
                return;
            }
            if (andIncrement < nm8Var2.x()) {
                qbbVar2.b();
            }
            nm8Var = nm8Var2;
            x8i0Var = x8i0Var2;
        }
        x8i0Var.c(tm8.l);
    }

    public static final int j(nm8 nm8Var, qbb qbbVar, int i2, Object obj, long j2, Object obj2, boolean z) {
        qbbVar.n(i2, obj);
        if (z) {
            return nm8Var.M(qbbVar, i2, obj, j2, obj2, z);
        }
        Object l2 = qbbVar.l(i2);
        if (l2 == null) {
            if (nm8Var.k(j2)) {
                if (qbbVar.k(i2, null, tm8.d)) {
                    return 1;
                }
            } else {
                if (obj2 == null) {
                    return 3;
                }
                if (qbbVar.k(i2, null, obj2)) {
                    return 2;
                }
            }
        } else if (l2 instanceof a8x0) {
            qbbVar.n(i2, null);
            if (nm8Var.J(l2, obj)) {
                qbbVar.o(i2, tm8.i);
                return 0;
            }
            con0 con0Var = tm8.k;
            if (qbbVar.g.getAndSet((i2 * 2) + 1, con0Var) == con0Var) {
                return 5;
            }
            qbbVar.m(i2, true);
            return 5;
        }
        return nm8Var.M(qbbVar, i2, obj, j2, obj2, z);
    }

    public static void y(nm8 nm8Var) {
        AtomicLongFieldUpdater atomicLongFieldUpdater = h;
        if ((atomicLongFieldUpdater.addAndGet(nm8Var, 1L) & 4611686018427387904L) != 0) {
            while ((atomicLongFieldUpdater.get(nm8Var) & 4611686018427387904L) != 0) {
            }
        }
    }

    public final boolean A() {
        return z(e.get(this), true);
    }

    @Override // xsna.ohi0
    public final boolean B(Throwable th) {
        return m(th, false);
    }

    public boolean C() {
        return false;
    }

    public final boolean D() {
        long j2 = g.get(this);
        return j2 == 0 || j2 == Long.MAX_VALUE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0011, code lost:
    
        continue;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void E(long j2, qbb<E> qbbVar) {
        qbb<E> qbbVar2;
        qbb<E> qbbVar3;
        while (qbbVar.d < j2 && (qbbVar3 = (qbb) qbbVar.c()) != null) {
            qbbVar = qbbVar3;
        }
        while (true) {
            if (!qbbVar.d() || (qbbVar2 = (qbb) qbbVar.c()) == null) {
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = k;
                    n4i0 n4i0Var = (n4i0) atomicReferenceFieldUpdater.get(this);
                    if (n4i0Var.d >= qbbVar.d) {
                        return;
                    }
                    if (!qbbVar.j()) {
                        break;
                    }
                    if (zn.d(atomicReferenceFieldUpdater, this, n4i0Var, qbbVar)) {
                        if (n4i0Var.f()) {
                            n4i0Var.e();
                            return;
                        }
                        return;
                    } else if (qbbVar.f()) {
                        qbbVar.e();
                    }
                }
            } else {
                qbbVar = qbbVar2;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:3:0x0011, code lost:
    
        r3 = xsna.fvr.i(r4, r3, null);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object F(E e2, spj<? super s3q0> spjVar) {
        UndeliveredElementException i2;
        lq9 lq9Var = new lq9(1, s7s0.c(spjVar));
        lq9Var.o();
        izs<E, s3q0> izsVar = this.c;
        if (izsVar == null || i2 == null) {
            lq9Var.resumeWith(new Result.Failure(w()));
        } else {
            mnh0.d(i2, w());
            lq9Var.resumeWith(new Result.Failure(i2));
        }
        Object n = lq9Var.n();
        return n == CoroutineSingletons.COROUTINE_SUSPENDED ? n : s3q0.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object H(qbb qbbVar, int i2, long j2, ContinuationImpl continuationImpl) {
        rm8 rm8Var;
        int i3;
        kbb kbbVar;
        qbb<E> qbbVar2;
        if (continuationImpl instanceof rm8) {
            rm8Var = (rm8) continuationImpl;
            int i4 = rm8Var.label;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                rm8Var.label = i4 - Integer.MIN_VALUE;
                Object obj = rm8Var.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i3 = rm8Var.label;
                if (i3 != 0) {
                    kotlin.a.a(obj);
                    rm8Var.L$0 = this;
                    rm8Var.L$1 = qbbVar;
                    rm8Var.I$0 = i2;
                    rm8Var.J$0 = j2;
                    rm8Var.label = 1;
                    lq9 d2 = v801.d(s7s0.c(rm8Var));
                    try {
                        a9f0 a9f0Var = new a9f0(d2);
                        Object L = L(qbbVar, i2, j2, a9f0Var);
                        if (L == tm8.m) {
                            a9f0Var.d(qbbVar, i2);
                        } else {
                            con0 con0Var = tm8.o;
                            pm8 pm8Var = null;
                            izs<E, s3q0> izsVar = this.c;
                            if (L == con0Var) {
                                if (j2 < x()) {
                                    qbbVar.b();
                                }
                                qbb<E> qbbVar3 = (qbb) j.get(this);
                                while (true) {
                                    if (A()) {
                                        d2.resumeWith(new kbb(new kbb.a(r())));
                                        break;
                                    }
                                    long andIncrement = f.getAndIncrement(this);
                                    long j3 = tm8.b;
                                    long j4 = andIncrement / j3;
                                    int i5 = (int) (andIncrement % j3);
                                    if (qbbVar3.d != j4) {
                                        qbbVar2 = q(j4, qbbVar3);
                                        if (qbbVar2 == null) {
                                        }
                                    } else {
                                        qbbVar2 = qbbVar3;
                                    }
                                    Object L2 = L(qbbVar2, i5, andIncrement, a9f0Var);
                                    if (L2 == tm8.m) {
                                        a9f0Var.d(qbbVar2, i5);
                                        break;
                                    }
                                    if (L2 == tm8.o) {
                                        if (andIncrement < x()) {
                                            qbbVar2.b();
                                        }
                                        qbbVar3 = qbbVar2;
                                    } else {
                                        if (L2 == tm8.n) {
                                            throw new IllegalStateException("unexpected");
                                        }
                                        qbbVar2.b();
                                        kbbVar = new kbb(L2);
                                        if (izsVar != null) {
                                            pm8Var = new pm8(this);
                                        }
                                    }
                                }
                            } else {
                                qbbVar.b();
                                kbbVar = new kbb(L);
                                if (izsVar != null) {
                                    pm8Var = new pm8(this);
                                }
                            }
                            d2.F(kbbVar, pm8Var);
                        }
                        obj = d2.n();
                        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        if (obj == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } catch (Throwable th) {
                        d2.x();
                        throw th;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.a.a(obj);
                }
                return ((kbb) obj).a;
            }
        }
        rm8Var = new rm8(this, continuationImpl);
        Object obj2 = rm8Var.result;
        CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i3 = rm8Var.label;
        if (i3 != 0) {
        }
        return ((kbb) obj2).a;
    }

    public final void I(a8x0 a8x0Var, boolean z) {
        if (a8x0Var instanceof b) {
            ((b) a8x0Var).getClass();
            throw null;
        }
        if (a8x0Var instanceof kq9) {
            ((spj) a8x0Var).resumeWith(new Result.Failure(z ? v() : w()));
            return;
        }
        if (a8x0Var instanceof a9f0) {
            ((a9f0) a8x0Var).b.resumeWith(new kbb(new kbb.a(r())));
            return;
        }
        if (!(a8x0Var instanceof a)) {
            if (a8x0Var instanceof x8i0) {
                ((x8i0) a8x0Var).e(this, tm8.l);
                return;
            } else {
                throw new IllegalStateException(("Unexpected waiter: " + a8x0Var).toString());
            }
        }
        a aVar = (a) a8x0Var;
        lq9<? super Boolean> lq9Var = aVar.c;
        aVar.c = null;
        aVar.b = tm8.l;
        Throwable r = nm8.this.r();
        if (r == null) {
            lq9Var.resumeWith(Boolean.FALSE);
        } else {
            lq9Var.resumeWith(new Result.Failure(r));
        }
    }

    public final boolean J(Object obj, E e2) {
        if (obj instanceof x8i0) {
            return ((x8i0) obj).e(this, e2);
        }
        boolean z = obj instanceof a9f0;
        izs<E, s3q0> izsVar = this.c;
        if (z) {
            return tm8.a(((a9f0) obj).b, new kbb(e2), izsVar != null ? new pm8(this) : null);
        }
        if (!(obj instanceof a)) {
            if (obj instanceof kq9) {
                return tm8.a((kq9) obj, e2, izsVar != null ? new om8(this) : null);
            }
            throw new IllegalStateException(rqi.c(obj, "Unexpected receiver type: "));
        }
        a aVar = (a) obj;
        lq9<? super Boolean> lq9Var = aVar.c;
        aVar.c = null;
        aVar.b = e2;
        Boolean bool = Boolean.TRUE;
        izs<E, s3q0> izsVar2 = nm8.this.c;
        return tm8.a(lq9Var, bool, izsVar2 != null ? new lm8(e2, izsVar2) : null);
    }

    public final boolean K(Object obj, qbb<E> qbbVar, int i2) {
        if (obj instanceof kq9) {
            return tm8.a((kq9) obj, s3q0.a, null);
        }
        if (obj instanceof x8i0) {
            TrySelectDetailedResult l2 = ((v8i0) obj).l(this, s3q0.a);
            if (l2 == TrySelectDetailedResult.REREGISTER) {
                qbbVar.n(i2, null);
            }
            return l2 == TrySelectDetailedResult.SUCCESSFUL;
        }
        if (!(obj instanceof b)) {
            throw new IllegalStateException(rqi.c(obj, "Unexpected waiter: "));
        }
        ((b) obj).getClass();
        tm8.a(null, Boolean.TRUE, null);
        throw null;
    }

    public final Object L(qbb<E> qbbVar, int i2, long j2, Object obj) {
        Object l2 = qbbVar.l(i2);
        AtomicReferenceArray atomicReferenceArray = qbbVar.g;
        AtomicLongFieldUpdater atomicLongFieldUpdater = e;
        if (l2 == null) {
            if (j2 >= (atomicLongFieldUpdater.get(this) & 1152921504606846975L)) {
                if (obj == null) {
                    return tm8.n;
                }
                if (qbbVar.k(i2, l2, obj)) {
                    p();
                    return tm8.m;
                }
            }
        } else if (l2 == tm8.d && qbbVar.k(i2, l2, tm8.i)) {
            p();
            Object obj2 = atomicReferenceArray.get(i2 * 2);
            qbbVar.n(i2, null);
            return obj2;
        }
        while (true) {
            Object l3 = qbbVar.l(i2);
            if (l3 == null || l3 == tm8.e) {
                if (j2 < (atomicLongFieldUpdater.get(this) & 1152921504606846975L)) {
                    if (qbbVar.k(i2, l3, tm8.h)) {
                        p();
                        return tm8.o;
                    }
                } else {
                    if (obj == null) {
                        return tm8.n;
                    }
                    if (qbbVar.k(i2, l3, obj)) {
                        p();
                        return tm8.m;
                    }
                }
            } else if (l3 != tm8.d) {
                con0 con0Var = tm8.j;
                if (l3 == con0Var) {
                    return tm8.o;
                }
                if (l3 == tm8.h) {
                    return tm8.o;
                }
                if (l3 == tm8.l) {
                    p();
                    return tm8.o;
                }
                if (l3 != tm8.g && qbbVar.k(i2, l3, tm8.f)) {
                    boolean z = l3 instanceof b8x0;
                    if (z) {
                        l3 = ((b8x0) l3).a;
                    }
                    if (K(l3, qbbVar, i2)) {
                        qbbVar.o(i2, tm8.i);
                        p();
                        Object obj3 = atomicReferenceArray.get(i2 * 2);
                        qbbVar.n(i2, null);
                        return obj3;
                    }
                    qbbVar.o(i2, con0Var);
                    qbbVar.i();
                    if (z) {
                        p();
                    }
                    return tm8.o;
                }
            } else if (qbbVar.k(i2, l3, tm8.i)) {
                p();
                Object obj4 = atomicReferenceArray.get(i2 * 2);
                qbbVar.n(i2, null);
                return obj4;
            }
        }
    }

    public final int M(qbb<E> qbbVar, int i2, E e2, long j2, Object obj, boolean z) {
        while (true) {
            Object l2 = qbbVar.l(i2);
            if (l2 == null) {
                if (!k(j2) || z) {
                    if (z) {
                        if (qbbVar.k(i2, null, tm8.j)) {
                            qbbVar.i();
                            return 4;
                        }
                    } else {
                        if (obj == null) {
                            return 3;
                        }
                        if (qbbVar.k(i2, null, obj)) {
                            return 2;
                        }
                    }
                } else if (qbbVar.k(i2, null, tm8.d)) {
                    break;
                }
            } else {
                if (l2 != tm8.e) {
                    con0 con0Var = tm8.k;
                    if (l2 == con0Var) {
                        qbbVar.n(i2, null);
                        return 5;
                    }
                    if (l2 == tm8.h) {
                        qbbVar.n(i2, null);
                        return 5;
                    }
                    if (l2 == tm8.l) {
                        qbbVar.n(i2, null);
                        d();
                        return 4;
                    }
                    qbbVar.n(i2, null);
                    if (l2 instanceof b8x0) {
                        l2 = ((b8x0) l2).a;
                    }
                    if (J(l2, e2)) {
                        qbbVar.o(i2, tm8.i);
                        return 0;
                    }
                    if (qbbVar.g.getAndSet((i2 * 2) + 1, con0Var) != con0Var) {
                        qbbVar.m(i2, true);
                    }
                    return 5;
                }
                if (qbbVar.k(i2, l2, tm8.d)) {
                    break;
                }
            }
        }
        return 1;
    }

    public final void N(long j2) {
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        nm8<E> nm8Var = this;
        if (nm8Var.D()) {
            return;
        }
        while (true) {
            atomicLongFieldUpdater = g;
            if (atomicLongFieldUpdater.get(nm8Var) > j2) {
                break;
            } else {
                nm8Var = this;
            }
        }
        int i2 = tm8.c;
        int i3 = 0;
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater2 = h;
            if (i3 < i2) {
                long j3 = atomicLongFieldUpdater.get(nm8Var);
                if (j3 == (4611686018427387903L & atomicLongFieldUpdater2.get(nm8Var)) && j3 == atomicLongFieldUpdater.get(nm8Var)) {
                    return;
                } else {
                    i3++;
                }
            } else {
                while (true) {
                    long j4 = atomicLongFieldUpdater2.get(nm8Var);
                    if (atomicLongFieldUpdater2.compareAndSet(nm8Var, j4, (j4 & 4611686018427387903L) + 4611686018427387904L)) {
                        break;
                    } else {
                        nm8Var = this;
                    }
                }
                while (true) {
                    long j5 = atomicLongFieldUpdater.get(nm8Var);
                    long j6 = atomicLongFieldUpdater2.get(nm8Var);
                    long j7 = j6 & 4611686018427387903L;
                    boolean z = (j6 & 4611686018427387904L) != 0;
                    if (j5 == j7 && j5 == atomicLongFieldUpdater.get(nm8Var)) {
                        break;
                    }
                    if (z) {
                        nm8Var = this;
                    } else {
                        nm8Var = this;
                        atomicLongFieldUpdater2.compareAndSet(nm8Var, j6, 4611686018427387904L + j7);
                    }
                }
                while (true) {
                    long j8 = atomicLongFieldUpdater2.get(nm8Var);
                    if (atomicLongFieldUpdater2.compareAndSet(nm8Var, j8, j8 & 4611686018427387903L)) {
                        return;
                    } else {
                        nm8Var = this;
                    }
                }
            }
        }
    }

    @Override // xsna.b9f0
    public final Object a(spj<? super E> spjVar) {
        qbb<E> qbbVar;
        Throwable th;
        long andIncrement;
        long j2;
        int i2;
        qbb<E> qbbVar2;
        nm8<E> nm8Var;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = j;
        qbb<E> qbbVar3 = (qbb) atomicReferenceFieldUpdater.get(this);
        while (!A()) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f;
            long andIncrement2 = atomicLongFieldUpdater.getAndIncrement(this);
            long j3 = tm8.b;
            long j4 = andIncrement2 / j3;
            int i3 = (int) (andIncrement2 % j3);
            if (qbbVar3.d != j4) {
                qbb<E> q = q(j4, qbbVar3);
                if (q == null) {
                    continue;
                } else {
                    qbbVar = q;
                }
            } else {
                qbbVar = qbbVar3;
            }
            Object L = L(qbbVar, i3, andIncrement2, null);
            con0 con0Var = tm8.m;
            if (L == con0Var) {
                throw new IllegalStateException("unexpected");
            }
            con0 con0Var2 = tm8.o;
            if (L == con0Var2) {
                if (andIncrement2 < x()) {
                    qbbVar.b();
                }
                qbbVar3 = qbbVar;
            } else {
                if (L != tm8.n) {
                    qbbVar.b();
                    return L;
                }
                lq9 d2 = v801.d(s7s0.c(spjVar));
                nm8<E> nm8Var2 = this;
                try {
                    Object L2 = nm8Var2.L(qbbVar, i3, andIncrement2, d2);
                    if (L2 == con0Var) {
                        d2.d(qbbVar, i3);
                    } else {
                        om8 om8Var = null;
                        izs<E, s3q0> izsVar = nm8Var2.c;
                        if (L2 == con0Var2) {
                            if (andIncrement2 < x()) {
                                qbbVar.b();
                            }
                            qbb<E> qbbVar4 = (qbb) atomicReferenceFieldUpdater.get(this);
                            while (true) {
                                if (A()) {
                                    d2.resumeWith(new Result.Failure(v()));
                                    break;
                                }
                                lq9 lq9Var = d2;
                                try {
                                    andIncrement = atomicLongFieldUpdater.getAndIncrement(this);
                                    long j5 = tm8.b;
                                    j2 = andIncrement / j5;
                                    i2 = (int) (andIncrement % j5);
                                } catch (Throwable th2) {
                                    th = th2;
                                }
                                try {
                                    if (qbbVar4.d != j2) {
                                        try {
                                            qbb<E> q2 = q(j2, qbbVar4);
                                            if (q2 == null) {
                                                d2 = lq9Var;
                                            } else {
                                                qbbVar2 = q2;
                                            }
                                        } catch (Throwable th3) {
                                            th = th3;
                                            d2 = lq9Var;
                                            d2.x();
                                            throw th;
                                        }
                                    } else {
                                        qbbVar2 = qbbVar4;
                                    }
                                    L2 = nm8Var.L(qbbVar2, i2, andIncrement, lq9Var);
                                    nm8Var2 = nm8Var;
                                    qbb<E> qbbVar5 = qbbVar2;
                                    d2 = lq9Var;
                                    if (L2 == tm8.m) {
                                        d2.d(qbbVar5, i2);
                                        break;
                                    }
                                    if (L2 == tm8.o) {
                                        if (andIncrement < x()) {
                                            qbbVar5.b();
                                        }
                                        qbbVar4 = qbbVar5;
                                    } else {
                                        if (L2 == tm8.n) {
                                            throw new IllegalStateException("unexpected");
                                        }
                                        qbbVar5.b();
                                        if (izsVar != null) {
                                            om8Var = new om8(this);
                                        }
                                    }
                                } catch (Throwable th4) {
                                    th = th4;
                                    d2 = lq9Var;
                                    th = th;
                                    d2.x();
                                    throw th;
                                }
                                nm8Var = nm8Var2;
                            }
                        } else {
                            qbbVar.b();
                            if (izsVar != null) {
                                om8Var = new om8(this);
                            }
                        }
                        d2.F(L2, om8Var);
                    }
                    Object n = d2.n();
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    return n;
                } catch (Throwable th5) {
                    th = th5;
                }
            }
        }
        Throwable v = v();
        int i4 = nok0.a;
        throw v;
    }

    @Override // xsna.b9f0
    public final void b(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new CancellationException("Channel was cancelled");
        }
        m(cancellationException, true);
    }

    @Override // xsna.ohi0
    public final boolean d() {
        return z(e.get(this), false);
    }

    @Override // xsna.b9f0
    public final a7i0 e() {
        c cVar = c.b;
        ttp0.d(3, cVar);
        d dVar = d.b;
        ttp0.d(3, dVar);
        return new a7i0(this, cVar, dVar, this.d);
    }

    @Override // xsna.ohi0
    public Object f(E e2) {
        AtomicLongFieldUpdater atomicLongFieldUpdater = e;
        boolean z = false;
        long j2 = 1152921504606846975L;
        boolean z2 = z(atomicLongFieldUpdater.get(this), false) ? false : !k(r1 & 1152921504606846975L);
        kbb.b bVar = kbb.b;
        if (z2) {
            return bVar;
        }
        Object obj = tm8.j;
        qbb qbbVar = (qbb) i.get(this);
        while (true) {
            long andIncrement = atomicLongFieldUpdater.getAndIncrement(this);
            long j3 = andIncrement & j2;
            boolean z3 = z(andIncrement, z);
            int i2 = tm8.b;
            long j4 = i2;
            long j5 = j3 / j4;
            int i3 = (int) (j3 % j4);
            if (qbbVar.d != j5) {
                qbb c2 = c(this, j5, qbbVar);
                if (c2 != null) {
                    qbbVar = c2;
                } else {
                    if (z3) {
                        return new kbb.a(w());
                    }
                    z = false;
                    j2 = 1152921504606846975L;
                }
            }
            int j6 = j(this, qbbVar, i3, e2, j3, obj, z3);
            if (j6 == 0) {
                qbbVar.b();
                return s3q0.a;
            }
            if (j6 == 1) {
                return s3q0.a;
            }
            if (j6 == 2) {
                if (z3) {
                    qbbVar.i();
                    return new kbb.a(w());
                }
                a8x0 a8x0Var = obj instanceof a8x0 ? (a8x0) obj : null;
                if (a8x0Var != null) {
                    a8x0Var.d(qbbVar, i3 + i2);
                }
                qbbVar.i();
                return bVar;
            }
            if (j6 == 3) {
                throw new IllegalStateException("unexpected");
            }
            if (j6 == 4) {
                if (j3 < f.get(this)) {
                    qbbVar.b();
                }
                return new kbb.a(w());
            }
            if (j6 == 5) {
                qbbVar.b();
            }
            z = false;
            j2 = 1152921504606846975L;
        }
    }

    @Override // xsna.b9f0
    public final a7i0 g() {
        e eVar = e.b;
        ttp0.d(3, eVar);
        f fVar = f.b;
        ttp0.d(3, fVar);
        return new a7i0(this, eVar, fVar, this.d);
    }

    @Override // xsna.b9f0
    public final o0b<E> iterator() {
        return new a();
    }

    public final boolean k(long j2) {
        return j2 < g.get(this) || j2 < f.get(this) + ((long) this.b);
    }

    @Override // xsna.b9f0
    public final Object l() {
        qbb<E> qbbVar;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f;
        long j2 = atomicLongFieldUpdater.get(this);
        long j3 = e.get(this);
        if (z(j3, true)) {
            return new kbb.a(r());
        }
        long j4 = j3 & 1152921504606846975L;
        kbb.b bVar = kbb.b;
        if (j2 >= j4) {
            return bVar;
        }
        Object obj = tm8.k;
        qbb<E> qbbVar2 = (qbb) j.get(this);
        while (!A()) {
            long andIncrement = atomicLongFieldUpdater.getAndIncrement(this);
            long j5 = tm8.b;
            long j6 = andIncrement / j5;
            int i2 = (int) (andIncrement % j5);
            if (qbbVar2.d != j6) {
                qbb<E> q = q(j6, qbbVar2);
                if (q == null) {
                    continue;
                } else {
                    qbbVar = q;
                }
            } else {
                qbbVar = qbbVar2;
            }
            Object L = L(qbbVar, i2, andIncrement, obj);
            qbb<E> qbbVar3 = qbbVar;
            if (L == tm8.m) {
                a8x0 a8x0Var = obj instanceof a8x0 ? (a8x0) obj : null;
                if (a8x0Var != null) {
                    a8x0Var.d(qbbVar3, i2);
                }
                N(andIncrement);
                qbbVar3.i();
                return bVar;
            }
            if (L != tm8.o) {
                if (L == tm8.n) {
                    throw new IllegalStateException("unexpected");
                }
                qbbVar3.b();
                return L;
            }
            if (andIncrement < x()) {
                qbbVar3.b();
            }
            qbbVar2 = qbbVar3;
        }
        return new kbb.a(r());
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x003c A[LOOP:2: B:17:0x003c->B:39:?, LOOP_START] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x006e A[LOOP:3: B:22:0x006e->B:30:?, LOOP_LABEL: LOOP:3: B:22:0x006e->B:30:?, LOOP_START] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x004c A[LOOP:5: B:40:0x004c->B:48:?, LOOP_START] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x002f A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m(Throwable th, boolean z) {
        nm8<E> nm8Var;
        con0 con0Var;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        boolean z2;
        long j2;
        long j3;
        long j4;
        Object obj;
        long j5;
        long j6;
        AtomicLongFieldUpdater atomicLongFieldUpdater = e;
        if (z) {
            do {
                j6 = atomicLongFieldUpdater.get(this);
                if (((int) (j6 >> 60)) == 0) {
                    qbb<Object> qbbVar = tm8.a;
                    nm8Var = this;
                }
            } while (!atomicLongFieldUpdater.compareAndSet(nm8Var, j6, (j6 & 1152921504606846975L) + (1 << 60)));
            con0Var = tm8.s;
            while (true) {
                atomicReferenceFieldUpdater = l;
                if (!atomicReferenceFieldUpdater.compareAndSet(this, con0Var, th)) {
                    z2 = true;
                    break;
                }
                if (atomicReferenceFieldUpdater.get(this) != con0Var) {
                    z2 = false;
                    break;
                }
            }
            if (z) {
                do {
                    j2 = atomicLongFieldUpdater.get(this);
                    int i2 = (int) (j2 >> 60);
                    if (i2 == 0) {
                        j3 = j2 & 1152921504606846975L;
                        j4 = 2;
                    } else {
                        if (i2 != 1) {
                            break;
                        }
                        j3 = j2 & 1152921504606846975L;
                        j4 = 3;
                    }
                } while (!atomicLongFieldUpdater.compareAndSet(nm8Var, j2, (j4 << 60) + j3));
            } else {
                do {
                    j5 = atomicLongFieldUpdater.get(this);
                } while (!atomicLongFieldUpdater.compareAndSet(nm8Var, j5, (3 << 60) + (j5 & 1152921504606846975L)));
            }
            d();
            if (z2) {
                loop3: while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = m;
                    obj = atomicReferenceFieldUpdater2.get(this);
                    con0 con0Var2 = obj == null ? tm8.q : tm8.r;
                    while (!atomicReferenceFieldUpdater2.compareAndSet(this, obj, con0Var2)) {
                        if (atomicReferenceFieldUpdater2.get(this) != obj) {
                            break;
                        }
                    }
                }
                if (obj != null) {
                    ttp0.d(1, obj);
                    ((izs) obj).invoke(r());
                    return z2;
                }
            }
            return z2;
        }
        nm8Var = this;
        con0Var = tm8.s;
        while (true) {
            atomicReferenceFieldUpdater = l;
            if (!atomicReferenceFieldUpdater.compareAndSet(this, con0Var, th)) {
            }
        }
        if (z) {
        }
        d();
        if (z2) {
        }
        return z2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:0x008d, code lost:
    
        r1 = (xsna.qbb) ((xsna.swi) xsna.swi.c.get(r1));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final qbb<E> n(long j2) {
        Object obj;
        long j3;
        Object obj2 = k.get(this);
        qbb qbbVar = (qbb) i.get(this);
        if (qbbVar.d > ((qbb) obj2).d) {
            obj2 = qbbVar;
        }
        qbb qbbVar2 = (qbb) j.get(this);
        if (qbbVar2.d > ((qbb) obj2).d) {
            obj2 = qbbVar2;
        }
        swi swiVar = (swi) obj2;
        loop0: while (true) {
            swiVar.getClass();
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = swi.b;
            Object obj3 = atomicReferenceFieldUpdater.get(swiVar);
            con0 con0Var = rwi.a;
            obj = null;
            if (obj3 == con0Var) {
                break;
            }
            swi swiVar2 = (swi) obj3;
            if (swiVar2 == null) {
                while (!atomicReferenceFieldUpdater.compareAndSet(swiVar, null, con0Var)) {
                    if (atomicReferenceFieldUpdater.get(swiVar) != null) {
                        break;
                    }
                }
                break loop0;
            }
            swiVar = swiVar2;
        }
        qbb<E> qbbVar3 = (qbb) swiVar;
        if (C()) {
            qbb<E> qbbVar4 = qbbVar3;
            loop2: do {
                int i2 = tm8.b - 1;
                while (true) {
                    if (-1 >= i2) {
                        break;
                    }
                    j3 = (qbbVar4.d * tm8.b) + i2;
                    if (j3 < f.get(this)) {
                        break loop2;
                    }
                    while (true) {
                        Object l2 = qbbVar4.l(i2);
                        if (l2 != null && l2 != tm8.e) {
                            if (l2 == tm8.d) {
                                break loop2;
                            }
                        } else {
                            if (qbbVar4.k(i2, l2, tm8.l)) {
                                qbbVar4.i();
                                break;
                            }
                        }
                    }
                    i2--;
                }
            } while (qbbVar4 != null);
            j3 = -1;
            if (j3 != -1) {
                o(j3);
            }
        }
        loop5: for (qbb<E> qbbVar5 = qbbVar3; qbbVar5 != null; qbbVar5 = (qbb) ((swi) swi.c.get(qbbVar5))) {
            for (int i3 = tm8.b - 1; -1 < i3; i3--) {
                if ((qbbVar5.d * tm8.b) + i3 < j2) {
                    break loop5;
                }
                while (true) {
                    Object l3 = qbbVar5.l(i3);
                    if (l3 != null && l3 != tm8.e) {
                        if (!(l3 instanceof b8x0)) {
                            if (!(l3 instanceof a8x0)) {
                                break;
                            }
                            if (qbbVar5.k(i3, l3, tm8.l)) {
                                obj = k0x.g(obj, l3);
                                qbbVar5.m(i3, true);
                                break;
                            }
                        } else {
                            if (qbbVar5.k(i3, l3, tm8.l)) {
                                obj = k0x.g(obj, ((b8x0) l3).a);
                                qbbVar5.m(i3, true);
                                break;
                            }
                        }
                    } else {
                        if (qbbVar5.k(i3, l3, tm8.l)) {
                            qbbVar5.i();
                            break;
                        }
                    }
                }
            }
        }
        if (obj != null) {
            if (!(obj instanceof ArrayList)) {
                I((a8x0) obj, true);
                return qbbVar3;
            }
            ArrayList arrayList = (ArrayList) obj;
            for (int size = arrayList.size() - 1; -1 < size; size--) {
                I((a8x0) arrayList.get(size), true);
            }
        }
        return qbbVar3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0060, code lost:
    
        r0 = xsna.fvr.i(r1, r0, null);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void o(long j2) {
        UndeliveredElementException i2;
        qbb<E> qbbVar = (qbb) j.get(this);
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f;
            long j3 = atomicLongFieldUpdater.get(this);
            if (j2 < Math.max(this.b + j3, g.get(this))) {
                return;
            }
            if (atomicLongFieldUpdater.compareAndSet(this, j3, 1 + j3)) {
                long j4 = tm8.b;
                long j5 = j3 / j4;
                int i3 = (int) (j3 % j4);
                if (qbbVar.d != j5) {
                    qbb<E> q = q(j5, qbbVar);
                    if (q == null) {
                        continue;
                    } else {
                        qbbVar = q;
                    }
                }
                qbb<E> qbbVar2 = qbbVar;
                Object L = L(qbbVar2, i3, j3, null);
                if (L != tm8.o) {
                    qbbVar2.b();
                    izs<E, s3q0> izsVar = this.c;
                    if (izsVar != null && i2 != null) {
                        throw i2;
                    }
                } else if (j3 < x()) {
                    qbbVar2.b();
                }
                qbbVar = qbbVar2;
            }
        }
    }

    public final void p() {
        Object c2;
        if (D()) {
            return;
        }
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = k;
        qbb<E> qbbVar = (qbb) atomicReferenceFieldUpdater.get(this);
        loop0: while (true) {
            long andIncrement = g.getAndIncrement(this);
            long j2 = andIncrement / tm8.b;
            if (x() <= andIncrement) {
                if (qbbVar.d < j2 && qbbVar.c() != 0) {
                    E(j2, qbbVar);
                }
                y(this);
                return;
            }
            if (qbbVar.d != j2) {
                sm8 sm8Var = sm8.b;
                while (true) {
                    c2 = rwi.c(qbbVar, j2, sm8Var);
                    if (!h5i0.c(c2)) {
                        n4i0 b2 = h5i0.b(c2);
                        while (true) {
                            n4i0 n4i0Var = (n4i0) atomicReferenceFieldUpdater.get(this);
                            if (n4i0Var.d >= b2.d) {
                                break;
                            }
                            if (!b2.j()) {
                                break;
                            }
                            if (ao.b(atomicReferenceFieldUpdater, this, n4i0Var, b2)) {
                                if (n4i0Var.f()) {
                                    n4i0Var.e();
                                }
                            } else if (b2.f()) {
                                b2.e();
                            }
                        }
                    } else {
                        break;
                    }
                }
                qbb<E> qbbVar2 = null;
                if (h5i0.c(c2)) {
                    d();
                    E(j2, qbbVar);
                    y(this);
                } else {
                    qbb<E> qbbVar3 = (qbb) h5i0.b(c2);
                    long j3 = qbbVar3.d;
                    if (j3 > j2) {
                        long j4 = tm8.b;
                        if (g.compareAndSet(this, 1 + andIncrement, j3 * j4)) {
                            AtomicLongFieldUpdater atomicLongFieldUpdater = h;
                            if ((atomicLongFieldUpdater.addAndGet(this, (j3 * j4) - andIncrement) & 4611686018427387904L) != 0) {
                                while ((atomicLongFieldUpdater.get(this) & 4611686018427387904L) != 0) {
                                }
                            }
                        } else {
                            y(this);
                        }
                    } else {
                        qbbVar2 = qbbVar3;
                    }
                }
                if (qbbVar2 == null) {
                    continue;
                } else {
                    qbbVar = qbbVar2;
                }
            }
            int i2 = (int) (andIncrement % tm8.b);
            Object l2 = qbbVar.l(i2);
            boolean z = l2 instanceof a8x0;
            AtomicLongFieldUpdater atomicLongFieldUpdater2 = f;
            if (!z || andIncrement < atomicLongFieldUpdater2.get(this) || !qbbVar.k(i2, l2, tm8.g)) {
                while (true) {
                    Object l3 = qbbVar.l(i2);
                    if (!(l3 instanceof a8x0)) {
                        if (l3 != tm8.j) {
                            if (l3 != null) {
                                if (l3 == tm8.d || l3 == tm8.h || l3 == tm8.i || l3 == tm8.k || l3 == tm8.l) {
                                    break loop0;
                                } else if (l3 != tm8.f) {
                                    throw new IllegalStateException(rqi.c(l3, "Unexpected cell state: "));
                                }
                            } else if (qbbVar.k(i2, l3, tm8.e)) {
                                break loop0;
                            }
                        } else {
                            break;
                        }
                    } else if (andIncrement < atomicLongFieldUpdater2.get(this)) {
                        if (qbbVar.k(i2, l3, new b8x0((a8x0) l3))) {
                            break loop0;
                        }
                    } else if (qbbVar.k(i2, l3, tm8.g)) {
                        if (K(l3, qbbVar, i2)) {
                            qbbVar.o(i2, tm8.d);
                            break;
                        } else {
                            qbbVar.o(i2, tm8.j);
                            qbbVar.i();
                        }
                    }
                }
            } else if (K(l2, qbbVar, i2)) {
                qbbVar.o(i2, tm8.d);
                break;
            } else {
                qbbVar.o(i2, tm8.j);
                qbbVar.i();
                y(this);
            }
        }
        y(this);
    }

    public final qbb<E> q(long j2, qbb<E> qbbVar) {
        Object c2;
        long j3;
        qbb<Object> qbbVar2 = tm8.a;
        sm8 sm8Var = sm8.b;
        loop0: while (true) {
            c2 = rwi.c(qbbVar, j2, sm8Var);
            if (!h5i0.c(c2)) {
                n4i0 b2 = h5i0.b(c2);
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = j;
                    n4i0 n4i0Var = (n4i0) atomicReferenceFieldUpdater.get(this);
                    if (n4i0Var.d >= b2.d) {
                        break loop0;
                    }
                    if (!b2.j()) {
                        break;
                    }
                    if (ao.b(atomicReferenceFieldUpdater, this, n4i0Var, b2)) {
                        if (n4i0Var.f()) {
                            n4i0Var.e();
                        }
                    } else if (b2.f()) {
                        b2.e();
                    }
                }
            } else {
                break;
            }
        }
        if (h5i0.c(c2)) {
            d();
            if (qbbVar.d * tm8.b < x()) {
                qbbVar.b();
                return null;
            }
        } else {
            qbb<E> qbbVar3 = (qbb) h5i0.b(c2);
            long j4 = qbbVar3.d;
            if (!D() && j2 <= g.get(this) / tm8.b) {
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = k;
                    n4i0 n4i0Var2 = (n4i0) atomicReferenceFieldUpdater2.get(this);
                    if (n4i0Var2.d >= j4 || !qbbVar3.j()) {
                        break;
                    }
                    if (zn.d(atomicReferenceFieldUpdater2, this, n4i0Var2, qbbVar3)) {
                        if (n4i0Var2.f()) {
                            n4i0Var2.e();
                        }
                    } else if (qbbVar3.f()) {
                        qbbVar3.e();
                    }
                }
            }
            if (j4 <= j2) {
                return qbbVar3;
            }
            long j5 = j4 * tm8.b;
            do {
                j3 = f.get(this);
                if (j3 >= j5) {
                    break;
                }
            } while (!f.compareAndSet(this, j3, j5));
            if (j4 * tm8.b < x()) {
                qbbVar3.b();
            }
        }
        return null;
    }

    public final Throwable r() {
        return (Throwable) l.get(this);
    }

    @Override // xsna.ohi0
    public final void s(izs<? super Throwable, s3q0> izsVar) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = m;
            if (atomicReferenceFieldUpdater.compareAndSet(this, null, izsVar)) {
                return;
            }
        } while (atomicReferenceFieldUpdater.get(this) == null);
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            con0 con0Var = tm8.q;
            if (obj != con0Var) {
                if (obj != tm8.r) {
                    throw new IllegalStateException(rqi.c(obj, "Another handler is already registered: "));
                }
                throw new IllegalStateException("Another handler was already registered and successfully invoked");
            }
            con0 con0Var2 = tm8.r;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, con0Var, con0Var2)) {
                if (atomicReferenceFieldUpdater.get(this) != con0Var) {
                    break;
                }
            }
            izsVar.invoke(r());
            return;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x018d, code lost:
    
        return xsna.s3q0.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x00c1, code lost:
    
        h(r1, r4, r7);
     */
    /* JADX WARN: Removed duplicated region for block: B:76:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0171 A[RETURN] */
    @Override // xsna.ohi0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object t(E e2, spj<? super s3q0> spjVar) {
        int j2;
        s3q0 s3q0Var;
        Object n;
        CoroutineSingletons coroutineSingletons;
        E e3;
        nm8<E> nm8Var;
        qbb qbbVar;
        int i2;
        int i3;
        boolean z;
        nm8<E> nm8Var2 = this;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = i;
        qbb qbbVar2 = (qbb) atomicReferenceFieldUpdater.get(nm8Var2);
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = e;
            long andIncrement = atomicLongFieldUpdater.getAndIncrement(nm8Var2);
            long j3 = andIncrement & 1152921504606846975L;
            boolean z2 = nm8Var2.z(andIncrement, false);
            int i4 = tm8.b;
            long j4 = i4;
            long j5 = j3 / j4;
            int i5 = (int) (j3 % j4);
            if (qbbVar2.d != j5) {
                qbb c2 = c(nm8Var2, j5, qbbVar2);
                if (c2 != null) {
                    qbbVar2 = c2;
                } else if (z2) {
                    Object F = F(e2, spjVar);
                    if (F == CoroutineSingletons.COROUTINE_SUSPENDED) {
                        return F;
                    }
                }
            }
            int j6 = j(nm8Var2, qbbVar2, i5, e2, j3, null, z2);
            if (j6 == 0) {
                qbbVar2.b();
                break;
            }
            if (j6 == 1) {
                break;
            }
            if (j6 != 2) {
                AtomicLongFieldUpdater atomicLongFieldUpdater2 = f;
                if (j6 == 3) {
                    lq9 d2 = v801.d(s7s0.c(spjVar));
                    E e4 = e2;
                    try {
                        j2 = j(nm8Var2, qbbVar2, i5, e4, j3, d2, false);
                    } catch (Throwable th) {
                        th = th;
                    }
                    try {
                        if (j2 == 0) {
                            qbbVar2.b();
                            s3q0Var = s3q0.a;
                        } else if (j2 != 1) {
                            if (j2 != 2) {
                                if (j2 != 4) {
                                    String str = "unexpected";
                                    if (j2 != 5) {
                                        throw new IllegalStateException("unexpected");
                                    }
                                    qbbVar2.b();
                                    qbb qbbVar3 = (qbb) atomicReferenceFieldUpdater.get(nm8Var2);
                                    while (true) {
                                        long andIncrement2 = atomicLongFieldUpdater.getAndIncrement(nm8Var2);
                                        long j7 = andIncrement2 & 1152921504606846975L;
                                        boolean z3 = nm8Var2.z(andIncrement2, false);
                                        int i6 = tm8.b;
                                        AtomicLongFieldUpdater atomicLongFieldUpdater3 = atomicLongFieldUpdater;
                                        long j8 = i6;
                                        String str2 = str;
                                        long j9 = j7 / j8;
                                        int i7 = (int) (j7 % j8);
                                        if (qbbVar3.d != j9) {
                                            qbb c3 = c(nm8Var2, j9, qbbVar3);
                                            if (c3 != null) {
                                                i2 = i6;
                                                i3 = i7;
                                                z = z3;
                                                qbbVar = c3;
                                            } else {
                                                if (z3) {
                                                    break;
                                                }
                                                atomicLongFieldUpdater = atomicLongFieldUpdater3;
                                                str = str2;
                                            }
                                        } else {
                                            qbbVar = qbbVar3;
                                            i2 = i6;
                                            i3 = i7;
                                            z = z3;
                                        }
                                        int j10 = j(nm8Var2, qbbVar, i3, e4, j7, d2, z);
                                        E e5 = e4;
                                        nm8Var = nm8Var2;
                                        qbb qbbVar4 = qbbVar;
                                        int i8 = i3;
                                        e3 = e5;
                                        if (j10 == 0) {
                                            qbbVar4.b();
                                            s3q0Var = s3q0.a;
                                            break;
                                        }
                                        if (j10 == 1) {
                                            s3q0Var = s3q0.a;
                                            break;
                                        }
                                        if (j10 != 2) {
                                            if (j10 == 3) {
                                                throw new IllegalStateException(str2);
                                            }
                                            if (j10 != 4) {
                                                if (j10 == 5) {
                                                    qbbVar4.b();
                                                }
                                                qbbVar3 = qbbVar4;
                                                nm8Var2 = nm8Var;
                                                atomicLongFieldUpdater = atomicLongFieldUpdater3;
                                                str = str2;
                                                e4 = e3;
                                            } else if (j7 < atomicLongFieldUpdater2.get(nm8Var)) {
                                                qbbVar4.b();
                                            }
                                        } else if (z) {
                                            qbbVar4.i();
                                        } else {
                                            d2.d(qbbVar4, i8 + i2);
                                        }
                                    }
                                } else {
                                    e3 = e4;
                                    nm8Var = nm8Var2;
                                    if (j3 < atomicLongFieldUpdater2.get(nm8Var)) {
                                        qbbVar2.b();
                                    }
                                }
                                h(nm8Var, e3, d2);
                            } else {
                                d2.d(qbbVar2, i5 + i4);
                            }
                            n = d2.n();
                            coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                            if (n != coroutineSingletons) {
                                n = s3q0.a;
                            }
                            if (n == coroutineSingletons) {
                                return n;
                            }
                        } else {
                            s3q0Var = s3q0.a;
                        }
                        d2.resumeWith(s3q0Var);
                        n = d2.n();
                        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                        if (n != coroutineSingletons) {
                        }
                        if (n == coroutineSingletons) {
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        d2.x();
                        throw th;
                    }
                } else if (j6 == 4) {
                    if (j3 < atomicLongFieldUpdater2.get(nm8Var2)) {
                        qbbVar2.b();
                    }
                    Object F2 = F(e2, spjVar);
                    if (F2 == CoroutineSingletons.COROUTINE_SUSPENDED) {
                        return F2;
                    }
                } else if (j6 == 5) {
                    qbbVar2.b();
                }
            } else if (z2) {
                qbbVar2.i();
                Object F3 = F(e2, spjVar);
                if (F3 == CoroutineSingletons.COROUTINE_SUSPENDED) {
                    return F3;
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:105:0x01c1, code lost:
    
        r16 = r7;
        r3 = (xsna.qbb) r3.c();
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x01ca, code lost:
    
        if (r3 != null) goto L95;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String toString() {
        boolean z;
        String str;
        StringBuilder sb = new StringBuilder();
        int i2 = (int) (e.get(this) >> 60);
        if (i2 == 2) {
            sb.append("closed,");
        } else if (i2 == 3) {
            sb.append("cancelled,");
        }
        sb.append("capacity=" + this.b + ',');
        sb.append("data=[");
        int i3 = 0;
        boolean z2 = true;
        List l2 = e43.l(j.get(this), i.get(this), k.get(this));
        ArrayList arrayList = new ArrayList();
        for (Object obj : l2) {
            if (((qbb) obj) != tm8.a) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        Object next = it.next();
        if (it.hasNext()) {
            long j2 = ((qbb) next).d;
            do {
                Object next2 = it.next();
                long j3 = ((qbb) next2).d;
                if (j2 > j3) {
                    next = next2;
                    j2 = j3;
                }
            } while (it.hasNext());
        }
        qbb qbbVar = (qbb) next;
        long j4 = f.get(this);
        long x = x();
        loop2: while (true) {
            int i4 = tm8.b;
            int i5 = i3;
            while (true) {
                if (i5 >= i4) {
                    break;
                }
                long j5 = (qbbVar.d * tm8.b) + i5;
                if (j5 >= x && j5 >= j4) {
                    break loop2;
                }
                Object l3 = qbbVar.l(i5);
                boolean z3 = z2;
                Object obj2 = qbbVar.g.get(i5 * 2);
                if (l3 instanceof kq9) {
                    str = (j5 >= j4 || j5 < x) ? (j5 >= x || j5 < j4) ? "cont" : "send" : "receive";
                } else if (l3 instanceof x8i0) {
                    str = (j5 >= j4 || j5 < x) ? (j5 >= x || j5 < j4) ? "select" : "onSend" : "onReceive";
                } else if (l3 instanceof a9f0) {
                    str = "receiveCatching";
                } else if (l3 instanceof b) {
                    str = "sendBroadcast";
                } else if (l3 instanceof b8x0) {
                    str = "EB(" + l3 + ')';
                } else if (epx.f(l3, tm8.f) || epx.f(l3, tm8.g)) {
                    str = "resuming_sender";
                } else {
                    if (l3 != null && !l3.equals(tm8.e) && !l3.equals(tm8.i) && !l3.equals(tm8.h) && !l3.equals(tm8.k) && !l3.equals(tm8.j) && !l3.equals(tm8.l)) {
                        str = l3.toString();
                    }
                    i5++;
                    z2 = z3;
                }
                if (obj2 != null) {
                    sb.append("(" + str + ',' + obj2 + "),");
                } else {
                    sb.append(str + ',');
                }
                i5++;
                z2 = z3;
            }
            z2 = z;
            i3 = 0;
        }
        if (erm0.A0(sb) == ',') {
            sb.deleteCharAt(sb.length() - 1);
        }
        sb.append(X3.j.e);
        return sb.toString();
    }

    @Override // xsna.b9f0
    public final Object u(SuspendLambda suspendLambda) {
        return G(this, suspendLambda);
    }

    public final Throwable v() {
        Throwable r = r();
        return r == null ? new ClosedReceiveChannelException() : r;
    }

    public final Throwable w() {
        Throwable r = r();
        return r == null ? new ClosedSendChannelException("Channel was closed") : r;
    }

    public final long x() {
        return e.get(this) & 1152921504606846975L;
    }

    /* JADX WARN: Code restructure failed: missing block: B:132:0x01a5, code lost:
    
        xsna.nm8.f.compareAndSet(r1, r3, 1 + r3);
        r1 = r18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00cf, code lost:
    
        r9 = r9 - 1;
        r7 = r16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0063, code lost:
    
        r16 = r7;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r16v0 */
    /* JADX WARN: Type inference failed for: r16v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r16v2 */
    /* JADX WARN: Type inference failed for: r16v3 */
    /* JADX WARN: Type inference failed for: r16v4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean z(long j2, boolean z) {
        ?? r16;
        int i2;
        nm8<E> nm8Var = this;
        int i3 = (int) (j2 >> 60);
        if (i3 != 0) {
            int i4 = 1;
            if (i3 != 1) {
                AtomicLongFieldUpdater atomicLongFieldUpdater = f;
                if (i3 == 2) {
                    r16 = 1;
                    nm8Var.n(j2 & 1152921504606846975L);
                    if (z) {
                        while (true) {
                            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = j;
                            qbb<E> qbbVar = (qbb) atomicReferenceFieldUpdater.get(nm8Var);
                            long j3 = atomicLongFieldUpdater.get(nm8Var);
                            if (nm8Var.x() <= j3) {
                                break;
                            }
                            long j4 = tm8.b;
                            long j5 = j3 / j4;
                            if (qbbVar.d != j5 && (qbbVar = nm8Var.q(j5, qbbVar)) == null) {
                                if (((qbb) atomicReferenceFieldUpdater.get(nm8Var)).d < j5) {
                                    break;
                                }
                            } else {
                                qbbVar.b();
                                int i5 = (int) (j3 % j4);
                                while (true) {
                                    Object l2 = qbbVar.l(i5);
                                    if (l2 == null || l2 == tm8.e) {
                                        if (qbbVar.k(i5, l2, tm8.h)) {
                                            nm8Var.p();
                                            break;
                                        }
                                        nm8Var = this;
                                    } else {
                                        if (l2 == tm8.d) {
                                            break;
                                        }
                                        if (l2 != tm8.j) {
                                            if (l2 != tm8.l) {
                                                if (l2 != tm8.i) {
                                                    if (l2 != tm8.h) {
                                                        if (l2 == tm8.g) {
                                                            break;
                                                        }
                                                        if (l2 != tm8.f && j3 == atomicLongFieldUpdater.get(nm8Var)) {
                                                            break;
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                } else {
                    if (i3 != 3) {
                        throw new IllegalStateException(lhg.a(i3, "unexpected close status: ").toString());
                    }
                    qbb<E> n = nm8Var.n(j2 & 1152921504606846975L);
                    UndeliveredElementException undeliveredElementException = null;
                    Object obj = null;
                    loop0: while (true) {
                        AtomicReferenceArray atomicReferenceArray = n.g;
                        int i6 = tm8.b - i4;
                        while (-1 < i6) {
                            long j6 = (n.d * tm8.b) + i6;
                            while (true) {
                                Object l3 = n.l(i6);
                                if (l3 == tm8.i) {
                                    break loop0;
                                }
                                con0 con0Var = tm8.d;
                                izs<E, s3q0> izsVar = nm8Var.c;
                                if (l3 == con0Var) {
                                    if (j6 < atomicLongFieldUpdater.get(nm8Var)) {
                                        break loop0;
                                    }
                                    if (n.k(i6, l3, tm8.l)) {
                                        if (izsVar != null) {
                                            undeliveredElementException = fvr.i(izsVar, atomicReferenceArray.get(i6 * 2), undeliveredElementException);
                                        }
                                        n.n(i6, null);
                                        n.i();
                                    }
                                } else if (l3 == tm8.e || l3 == null) {
                                    i2 = i4;
                                    if (n.k(i6, l3, tm8.l)) {
                                        n.i();
                                        break;
                                    }
                                    i4 = i2;
                                } else if (!(l3 instanceof a8x0) && !(l3 instanceof b8x0)) {
                                    con0 con0Var2 = tm8.g;
                                    if (l3 == con0Var2 || l3 == tm8.f) {
                                        break loop0;
                                    }
                                    if (l3 != con0Var2) {
                                        break;
                                    }
                                } else {
                                    if (j6 < atomicLongFieldUpdater.get(nm8Var)) {
                                        break loop0;
                                    }
                                    a8x0 a8x0Var = l3 instanceof b8x0 ? ((b8x0) l3).a : (a8x0) l3;
                                    i2 = i4;
                                    if (n.k(i6, l3, tm8.l)) {
                                        if (izsVar != null) {
                                            undeliveredElementException = fvr.i(izsVar, atomicReferenceArray.get(i6 * 2), undeliveredElementException);
                                        }
                                        obj = k0x.g(obj, a8x0Var);
                                        n.n(i6, null);
                                        n.i();
                                    }
                                    i4 = i2;
                                }
                            }
                        }
                        r16 = i4;
                        n = (qbb) ((swi) swi.c.get(n));
                        if (n == null) {
                            break;
                        }
                        i4 = r16 == true ? 1 : 0;
                    }
                    r16 = i4;
                    if (obj != null) {
                        if (obj instanceof ArrayList) {
                            ArrayList arrayList = (ArrayList) obj;
                            for (int size = arrayList.size() - 1; -1 < size; size--) {
                                nm8Var.I((a8x0) arrayList.get(size), false);
                            }
                        } else {
                            nm8Var.I((a8x0) obj, false);
                        }
                    }
                    if (undeliveredElementException != null) {
                        throw undeliveredElementException;
                    }
                }
                return r16;
            }
        }
        return false;
    }
}
