package kotlinx.coroutines.scheduling;

import io.reactivex.rxjava3.internal.operators.mixed.k;
import java.io.Closeable;
import java.lang.Thread;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Ref$ObjectRef;
import xsna.asp;
import xsna.b5o0;
import xsna.cgn;
import xsna.con0;
import xsna.d6o0;
import xsna.efz;
import xsna.epx;
import xsna.i5s;
import xsna.k7o0;
import xsna.n9g0;
import xsna.p1u;
import xsna.qjk0;
import xsna.qlb0;
import xsna.rzz;
import xsna.s3q0;
import xsna.szz;
import xsna.tgw;
import xsna.uwx0;
import xsna.y6l;
import xsna.zrp;

/* compiled from: CoroutineScheduler.kt */
/* loaded from: classes11.dex */
public final class CoroutineScheduler implements Executor, Closeable {
    public static final /* synthetic */ AtomicLongFieldUpdater i = AtomicLongFieldUpdater.newUpdater(CoroutineScheduler.class, "parkedWorkersStack$volatile");
    public static final /* synthetic */ AtomicLongFieldUpdater j = AtomicLongFieldUpdater.newUpdater(CoroutineScheduler.class, "controlState$volatile");
    public static final /* synthetic */ AtomicIntegerFieldUpdater k = AtomicIntegerFieldUpdater.newUpdater(CoroutineScheduler.class, "_isTerminated$volatile");
    public static final con0 l = new con0("NOT_IN_STACK");
    private volatile /* synthetic */ int _isTerminated$volatile;
    public final int b;
    public final int c;
    private volatile /* synthetic */ long controlState$volatile;
    public final long d;
    public final String e;
    public final p1u f;
    public final p1u g;
    public final n9g0<b> h;
    private volatile /* synthetic */ long parkedWorkersStack$volatile;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: CoroutineScheduler.kt */
    public static final class WorkerState {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ WorkerState[] $VALUES;
        public static final WorkerState BLOCKING;
        public static final WorkerState CPU_ACQUIRED;
        public static final WorkerState DORMANT;
        public static final WorkerState PARKING;
        public static final WorkerState TERMINATED;

        static {
            WorkerState workerState = new WorkerState("CPU_ACQUIRED", 0);
            CPU_ACQUIRED = workerState;
            WorkerState workerState2 = new WorkerState("BLOCKING", 1);
            BLOCKING = workerState2;
            WorkerState workerState3 = new WorkerState("PARKING", 2);
            PARKING = workerState3;
            WorkerState workerState4 = new WorkerState("DORMANT", 3);
            DORMANT = workerState4;
            WorkerState workerState5 = new WorkerState("TERMINATED", 4);
            TERMINATED = workerState5;
            WorkerState[] workerStateArr = {workerState, workerState2, workerState3, workerState4, workerState5};
            $VALUES = workerStateArr;
            $ENTRIES = new asp(workerStateArr);
        }

        public WorkerState() {
            throw null;
        }

        public static WorkerState valueOf(String str) {
            return (WorkerState) Enum.valueOf(WorkerState.class, str);
        }

        public static WorkerState[] values() {
            return (WorkerState[]) $VALUES.clone();
        }
    }

    /* compiled from: CoroutineScheduler.kt */
    /* loaded from: classes8.dex */
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[WorkerState.values().length];
            try {
                iArr[WorkerState.PARKING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[WorkerState.BLOCKING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[WorkerState.CPU_ACQUIRED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[WorkerState.DORMANT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[WorkerState.TERMINATED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* compiled from: CoroutineScheduler.kt */
    public final class b extends Thread {
        public static final /* synthetic */ AtomicIntegerFieldUpdater j = AtomicIntegerFieldUpdater.newUpdater(b.class, "workerCtl$volatile");
        public final uwx0 b;
        public final Ref$ObjectRef<b5o0> c;
        public WorkerState d;
        public long e;
        public long f;
        public int g;
        public boolean h;
        private volatile int indexInArray;
        private volatile Object nextParkedWorker;
        private volatile /* synthetic */ int workerCtl$volatile;

        public b() {
            throw null;
        }

        public b(int i) {
            setDaemon(true);
            setContextClassLoader(CoroutineScheduler.class.getClassLoader());
            this.b = new uwx0();
            this.c = new Ref$ObjectRef<>();
            this.d = WorkerState.DORMANT;
            this.nextParkedWorker = CoroutineScheduler.l;
            int nanoTime = (int) System.nanoTime();
            this.g = nanoTime == 0 ? 42 : nanoTime;
            f(i);
        }

        /* JADX WARN: Removed duplicated region for block: B:22:0x005c  */
        /* JADX WARN: Removed duplicated region for block: B:28:0x006b A[RETURN] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final b5o0 a(boolean z) {
            b5o0 e;
            b5o0 e2;
            long j2;
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
            b5o0 b5o0Var;
            WorkerState workerState = this.d;
            WorkerState workerState2 = WorkerState.CPU_ACQUIRED;
            CoroutineScheduler coroutineScheduler = CoroutineScheduler.this;
            b5o0 b5o0Var2 = null;
            uwx0 uwx0Var = this.b;
            if (workerState != workerState2) {
                AtomicLongFieldUpdater atomicLongFieldUpdater = CoroutineScheduler.j;
                do {
                    j2 = atomicLongFieldUpdater.get(coroutineScheduler);
                    if (((int) ((9223367638808264704L & j2) >> 42)) == 0) {
                        uwx0Var.getClass();
                        do {
                            atomicReferenceFieldUpdater = uwx0.b;
                            b5o0Var = (b5o0) atomicReferenceFieldUpdater.get(uwx0Var);
                            if (b5o0Var == null || !b5o0Var.c) {
                                int i = uwx0.d.get(uwx0Var);
                                int i2 = uwx0.c.get(uwx0Var);
                                while (true) {
                                    if (i == i2 || uwx0.e.get(uwx0Var) == 0) {
                                        break;
                                    }
                                    i2--;
                                    b5o0 c = uwx0Var.c(i2, true);
                                    if (c != null) {
                                        b5o0Var2 = c;
                                        break;
                                    }
                                }
                            }
                            if (b5o0Var2 == null) {
                                return b5o0Var2;
                            }
                            b5o0 c2 = coroutineScheduler.g.c();
                            return c2 == null ? i(1) : c2;
                        } while (!qjk0.b(atomicReferenceFieldUpdater, uwx0Var, b5o0Var));
                        b5o0Var2 = b5o0Var;
                        if (b5o0Var2 == null) {
                        }
                    }
                } while (!CoroutineScheduler.j.compareAndSet(coroutineScheduler, j2, j2 - 4398046511104L));
                this.d = WorkerState.CPU_ACQUIRED;
            }
            if (z) {
                boolean z2 = d(coroutineScheduler.b * 2) == 0;
                if (z2 && (e2 = e()) != null) {
                    return e2;
                }
                uwx0Var.getClass();
                b5o0 b5o0Var3 = (b5o0) uwx0.b.getAndSet(uwx0Var, null);
                if (b5o0Var3 == null) {
                    b5o0Var3 = uwx0Var.b();
                }
                if (b5o0Var3 != null) {
                    return b5o0Var3;
                }
                if (!z2 && (e = e()) != null) {
                    return e;
                }
            } else {
                b5o0 e3 = e();
                if (e3 != null) {
                    return e3;
                }
            }
            return i(3);
        }

        public final int b() {
            return this.indexInArray;
        }

        public final Object c() {
            return this.nextParkedWorker;
        }

        public final int d(int i) {
            int i2 = this.g;
            int i3 = i2 ^ (i2 << 13);
            int i4 = i3 ^ (i3 >> 17);
            int i5 = i4 ^ (i4 << 5);
            this.g = i5;
            int i6 = i - 1;
            return (i6 & i) == 0 ? i5 & i6 : (i5 & Integer.MAX_VALUE) % i;
        }

        public final b5o0 e() {
            int d = d(2);
            CoroutineScheduler coroutineScheduler = CoroutineScheduler.this;
            if (d == 0) {
                b5o0 c = coroutineScheduler.f.c();
                return c != null ? c : coroutineScheduler.g.c();
            }
            b5o0 c2 = coroutineScheduler.g.c();
            return c2 != null ? c2 : coroutineScheduler.f.c();
        }

        public final void f(int i) {
            StringBuilder sb = new StringBuilder();
            sb.append(CoroutineScheduler.this.e);
            sb.append("-worker-");
            sb.append(i == 0 ? "TERMINATED" : String.valueOf(i));
            setName(sb.toString());
            this.indexInArray = i;
        }

        public final void g(Object obj) {
            this.nextParkedWorker = obj;
        }

        public final boolean h(WorkerState workerState) {
            WorkerState workerState2 = this.d;
            boolean z = workerState2 == WorkerState.CPU_ACQUIRED;
            if (z) {
                CoroutineScheduler.j.addAndGet(CoroutineScheduler.this, 4398046511104L);
            }
            if (workerState2 != workerState) {
                this.d = workerState;
            }
            return z;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r14v1, types: [T, java.lang.Object, xsna.b5o0] */
        /* JADX WARN: Type inference failed for: r7v14, types: [xsna.b5o0] */
        /* JADX WARN: Type inference failed for: r7v4 */
        /* JADX WARN: Type inference failed for: r7v5, types: [xsna.b5o0] */
        public final b5o0 i(int i) {
            long j2;
            T t;
            long j3;
            long j4;
            T t2;
            AtomicLongFieldUpdater atomicLongFieldUpdater = CoroutineScheduler.j;
            CoroutineScheduler coroutineScheduler = CoroutineScheduler.this;
            int i2 = (int) (atomicLongFieldUpdater.get(coroutineScheduler) & 2097151);
            Object obj = null;
            if (i2 < 2) {
                return null;
            }
            int d = d(i2);
            int i3 = 0;
            long j5 = Long.MAX_VALUE;
            while (i3 < i2) {
                d++;
                if (d > i2) {
                    d = 1;
                }
                b b = coroutineScheduler.h.b(d);
                if (b != null && b != this) {
                    uwx0 uwx0Var = b.b;
                    if (i == 3) {
                        t = uwx0Var.b();
                        j2 = 0;
                    } else {
                        uwx0Var.getClass();
                        int i4 = uwx0.d.get(uwx0Var);
                        int i5 = uwx0.c.get(uwx0Var);
                        boolean z = i == 1;
                        while (true) {
                            if (i4 == i5) {
                                j2 = 0;
                                break;
                            }
                            j2 = 0;
                            if (!z || uwx0.e.get(uwx0Var) != 0) {
                                int i6 = i4 + 1;
                                t = uwx0Var.c(i4, z);
                                if (t != 0) {
                                    break;
                                }
                                i4 = i6;
                            } else {
                                break;
                            }
                        }
                        t = obj;
                    }
                    Ref$ObjectRef<b5o0> ref$ObjectRef = this.c;
                    if (t != 0) {
                        ref$ObjectRef.element = t;
                        t2 = obj;
                        j4 = -1;
                        j3 = -1;
                    } else {
                        while (true) {
                            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = uwx0.b;
                            ?? r14 = (b5o0) atomicReferenceFieldUpdater.get(uwx0Var);
                            if (r14 == 0) {
                                j3 = -1;
                                break;
                            }
                            j3 = -1;
                            if (((r14.c ? 1 : 2) & i) == 0) {
                                break;
                            }
                            k7o0.f.getClass();
                            uwx0 uwx0Var2 = uwx0Var;
                            long nanoTime = System.nanoTime() - r14.b;
                            long j6 = k7o0.b;
                            if (nanoTime < j6) {
                                j4 = j6 - nanoTime;
                                t2 = 0;
                                break;
                            }
                            do {
                                t2 = 0;
                                if (atomicReferenceFieldUpdater.compareAndSet(uwx0Var2, r14, null)) {
                                    ref$ObjectRef.element = r14;
                                    j4 = -1;
                                    break;
                                }
                            } while (atomicReferenceFieldUpdater.get(uwx0Var2) == r14);
                            uwx0Var = uwx0Var2;
                            obj = null;
                        }
                        j4 = -2;
                        t2 = obj;
                    }
                    if (j4 == j3) {
                        b5o0 b5o0Var = ref$ObjectRef.element;
                        ref$ObjectRef.element = t2;
                        return b5o0Var;
                    }
                    if (j4 > j2) {
                        j5 = Math.min(j5, j4);
                    }
                }
                i3++;
                obj = null;
            }
            if (j5 == Long.MAX_VALUE) {
                j5 = 0;
            }
            this.f = j5;
            return null;
        }

        /* JADX WARN: Code restructure failed: missing block: B:80:0x0004, code lost:
        
            continue;
         */
        /* JADX WARN: Code restructure failed: missing block: B:81:0x0004, code lost:
        
            continue;
         */
        /* JADX WARN: Code restructure failed: missing block: B:82:0x0004, code lost:
        
            continue;
         */
        @Override // java.lang.Thread, java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void run() {
            long j2;
            loop0: while (true) {
                boolean z = false;
                while (true) {
                    CoroutineScheduler coroutineScheduler = CoroutineScheduler.this;
                    coroutineScheduler.getClass();
                    if (CoroutineScheduler.k.get(coroutineScheduler) != 1) {
                        WorkerState workerState = this.d;
                        WorkerState workerState2 = WorkerState.TERMINATED;
                        if (workerState == workerState2) {
                            break loop0;
                        }
                        b5o0 a = a(this.h);
                        if (a != null) {
                            this.f = 0L;
                            CoroutineScheduler coroutineScheduler2 = CoroutineScheduler.this;
                            this.e = 0L;
                            if (this.d == WorkerState.PARKING) {
                                this.d = WorkerState.BLOCKING;
                            }
                            if (a.c) {
                                if (h(WorkerState.BLOCKING) && !coroutineScheduler2.r() && !coroutineScheduler2.q(CoroutineScheduler.j.get(coroutineScheduler2))) {
                                    coroutineScheduler2.r();
                                }
                                coroutineScheduler2.getClass();
                                try {
                                    a.run();
                                } catch (Throwable th) {
                                    Thread currentThread = Thread.currentThread();
                                    currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, th);
                                }
                                CoroutineScheduler.j.addAndGet(coroutineScheduler2, -2097152L);
                                if (this.d != workerState2) {
                                    this.d = WorkerState.DORMANT;
                                }
                            } else {
                                coroutineScheduler2.getClass();
                                try {
                                    a.run();
                                } catch (Throwable th2) {
                                    Thread currentThread2 = Thread.currentThread();
                                    currentThread2.getUncaughtExceptionHandler().uncaughtException(currentThread2, th2);
                                }
                            }
                        } else {
                            this.h = false;
                            if (this.f == 0) {
                                Object obj = this.nextParkedWorker;
                                con0 con0Var = CoroutineScheduler.l;
                                if (obj != con0Var) {
                                    j.set(this, -1);
                                    while (this.nextParkedWorker != CoroutineScheduler.l) {
                                        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = j;
                                        if (atomicIntegerFieldUpdater.get(this) == -1) {
                                            CoroutineScheduler coroutineScheduler3 = CoroutineScheduler.this;
                                            coroutineScheduler3.getClass();
                                            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater2 = CoroutineScheduler.k;
                                            if (atomicIntegerFieldUpdater2.get(coroutineScheduler3) == 1) {
                                                break;
                                            }
                                            WorkerState workerState3 = this.d;
                                            WorkerState workerState4 = WorkerState.TERMINATED;
                                            if (workerState3 == workerState4) {
                                                break;
                                            }
                                            h(WorkerState.PARKING);
                                            Thread.interrupted();
                                            if (this.e == 0) {
                                                j2 = 2097151;
                                                this.e = System.nanoTime() + CoroutineScheduler.this.d;
                                            } else {
                                                j2 = 2097151;
                                            }
                                            LockSupport.parkNanos(CoroutineScheduler.this.d);
                                            if (System.nanoTime() - this.e >= 0) {
                                                this.e = 0L;
                                                CoroutineScheduler coroutineScheduler4 = CoroutineScheduler.this;
                                                synchronized (coroutineScheduler4.h) {
                                                    try {
                                                        if (!(atomicIntegerFieldUpdater2.get(coroutineScheduler4) == 1)) {
                                                            AtomicLongFieldUpdater atomicLongFieldUpdater = CoroutineScheduler.j;
                                                            if (((int) (atomicLongFieldUpdater.get(coroutineScheduler4) & j2)) > coroutineScheduler4.b) {
                                                                if (atomicIntegerFieldUpdater.compareAndSet(this, -1, 1)) {
                                                                    int i = this.indexInArray;
                                                                    f(0);
                                                                    coroutineScheduler4.p(this, i, 0);
                                                                    int andDecrement = (int) (atomicLongFieldUpdater.getAndDecrement(coroutineScheduler4) & j2);
                                                                    if (andDecrement != i) {
                                                                        b b = coroutineScheduler4.h.b(andDecrement);
                                                                        coroutineScheduler4.h.c(i, b);
                                                                        b.f(i);
                                                                        coroutineScheduler4.p(b, andDecrement, i);
                                                                    }
                                                                    coroutineScheduler4.h.c(andDecrement, null);
                                                                    s3q0 s3q0Var = s3q0.a;
                                                                    this.d = workerState4;
                                                                }
                                                            }
                                                        }
                                                    } catch (Throwable th3) {
                                                        throw th3;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                } else {
                                    CoroutineScheduler coroutineScheduler5 = CoroutineScheduler.this;
                                    coroutineScheduler5.getClass();
                                    if (this.nextParkedWorker == con0Var) {
                                        AtomicLongFieldUpdater atomicLongFieldUpdater2 = CoroutineScheduler.i;
                                        while (true) {
                                            long j3 = atomicLongFieldUpdater2.get(coroutineScheduler5);
                                            int i2 = this.indexInArray;
                                            this.nextParkedWorker = coroutineScheduler5.h.b((int) (j3 & 2097151));
                                            CoroutineScheduler coroutineScheduler6 = coroutineScheduler5;
                                            if (CoroutineScheduler.i.compareAndSet(coroutineScheduler6, j3, ((j3 + 2097152) & (-2097152)) | i2)) {
                                                break;
                                            } else {
                                                coroutineScheduler5 = coroutineScheduler6;
                                            }
                                        }
                                    }
                                }
                            } else {
                                if (z) {
                                    h(WorkerState.PARKING);
                                    Thread.interrupted();
                                    LockSupport.parkNanos(this.f);
                                    this.f = 0L;
                                    break;
                                }
                                z = true;
                            }
                        }
                    } else {
                        break loop0;
                    }
                }
            }
            h(WorkerState.TERMINATED);
        }
    }

    public CoroutineScheduler(int i2, long j2, int i3, String str) {
        this.b = i2;
        this.c = i3;
        this.d = j2;
        this.e = str;
        if (i2 < 1) {
            throw new IllegalArgumentException(tgw.b(i2, "Core pool size ", " should be at least 1").toString());
        }
        if (i3 < i2) {
            throw new IllegalArgumentException(efz.a(i3, i2, "Max pool size ", " should be greater than or equals to core pool size ").toString());
        }
        if (i3 > 2097150) {
            throw new IllegalArgumentException(tgw.b(i3, "Max pool size ", " should not exceed maximal supported number of threads 2097150").toString());
        }
        if (j2 <= 0) {
            throw new IllegalArgumentException(qlb0.a(j2, "Idle worker keep alive time ", " must be positive").toString());
        }
        this.f = new p1u();
        this.g = new p1u();
        this.h = new n9g0<>((i2 + 1) * 2);
        this.controlState$volatile = i2 << 42;
    }

    public static /* synthetic */ void o(CoroutineScheduler coroutineScheduler, Runnable runnable, int i2) {
        coroutineScheduler.n(runnable, false, (i2 & 4) == 0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x00a1, code lost:
    
        if (r1 == null) goto L44;
     */
    @Override // java.io.Closeable, java.lang.AutoCloseable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void close() {
        int i2;
        b5o0 c;
        if (k.compareAndSet(this, 0, 1)) {
            Thread currentThread = Thread.currentThread();
            b bVar = currentThread instanceof b ? (b) currentThread : null;
            if (bVar == null || !epx.f(CoroutineScheduler.this, this)) {
                bVar = null;
            }
            synchronized (this.h) {
                i2 = (int) (j.get(this) & 2097151);
            }
            if (1 <= i2) {
                int i3 = 1;
                while (true) {
                    b b2 = this.h.b(i3);
                    if (b2 != bVar) {
                        while (b2.getState() != Thread.State.TERMINATED) {
                            LockSupport.unpark(b2);
                            b2.join(10000L);
                        }
                        uwx0 uwx0Var = b2.b;
                        p1u p1uVar = this.g;
                        uwx0Var.getClass();
                        b5o0 b5o0Var = (b5o0) uwx0.b.getAndSet(uwx0Var, null);
                        if (b5o0Var != null) {
                            p1uVar.a(b5o0Var);
                        }
                        while (true) {
                            b5o0 b3 = uwx0Var.b();
                            if (b3 == null) {
                                break;
                            } else {
                                p1uVar.a(b3);
                            }
                        }
                    }
                    if (i3 == i2) {
                        break;
                    } else {
                        i3++;
                    }
                }
            }
            p1u p1uVar2 = this.g;
            p1uVar2.getClass();
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = rzz.a;
            while (true) {
                szz szzVar = (szz) atomicReferenceFieldUpdater.get(p1uVar2);
                if (szzVar.b()) {
                    break;
                } else {
                    k.f(atomicReferenceFieldUpdater, p1uVar2, szzVar, szzVar.c());
                }
            }
            p1u p1uVar3 = this.f;
            p1uVar3.getClass();
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = rzz.a;
            while (true) {
                szz szzVar2 = (szz) atomicReferenceFieldUpdater2.get(p1uVar3);
                if (szzVar2.b()) {
                    break;
                } else {
                    k.f(atomicReferenceFieldUpdater2, p1uVar3, szzVar2, szzVar2.c());
                }
            }
            while (true) {
                if (bVar != null) {
                    c = bVar.a(true);
                }
                c = this.f.c();
                if (c == null && (c = this.g.c()) == null) {
                    break;
                }
                try {
                    c.run();
                } catch (Throwable th) {
                    Thread currentThread2 = Thread.currentThread();
                    currentThread2.getUncaughtExceptionHandler().uncaughtException(currentThread2, th);
                }
            }
            if (bVar != null) {
                bVar.h(WorkerState.TERMINATED);
            }
            i.set(this, 0L);
            j.set(this, 0L);
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        o(this, runnable, 6);
    }

    public final int m() {
        synchronized (this.h) {
            try {
                if (k.get(this) == 1) {
                    return -1;
                }
                AtomicLongFieldUpdater atomicLongFieldUpdater = j;
                long j2 = atomicLongFieldUpdater.get(this);
                int i2 = (int) (j2 & 2097151);
                int i3 = i2 - ((int) ((j2 & 4398044413952L) >> 21));
                if (i3 < 0) {
                    i3 = 0;
                }
                if (i3 >= this.b) {
                    return 0;
                }
                if (i2 >= this.c) {
                    return 0;
                }
                int i4 = ((int) (atomicLongFieldUpdater.get(this) & 2097151)) + 1;
                if (i4 <= 0 || this.h.b(i4) != null) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                b bVar = new b(i4);
                this.h.c(i4, bVar);
                if (i4 != ((int) (2097151 & atomicLongFieldUpdater.incrementAndGet(this)))) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                int i5 = i3 + 1;
                bVar.start();
                return i5;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void n(Runnable runnable, boolean z, boolean z2) {
        b5o0 d6o0Var;
        WorkerState workerState;
        k7o0.f.getClass();
        long nanoTime = System.nanoTime();
        if (runnable instanceof b5o0) {
            d6o0Var = (b5o0) runnable;
            d6o0Var.b = nanoTime;
            d6o0Var.c = z;
        } else {
            d6o0Var = new d6o0(nanoTime, runnable, z);
        }
        boolean z3 = d6o0Var.c;
        AtomicLongFieldUpdater atomicLongFieldUpdater = j;
        long addAndGet = z3 ? atomicLongFieldUpdater.addAndGet(this, 2097152L) : 0L;
        Thread currentThread = Thread.currentThread();
        b bVar = currentThread instanceof b ? (b) currentThread : null;
        if (bVar == null || !epx.f(CoroutineScheduler.this, this)) {
            bVar = null;
        }
        if (bVar != null && (workerState = bVar.d) != WorkerState.TERMINATED && (d6o0Var.c || workerState != WorkerState.BLOCKING)) {
            bVar.h = true;
            uwx0 uwx0Var = bVar.b;
            if (z2) {
                d6o0Var = uwx0Var.a(d6o0Var);
            } else {
                uwx0Var.getClass();
                b5o0 b5o0Var = (b5o0) uwx0.b.getAndSet(uwx0Var, d6o0Var);
                d6o0Var = b5o0Var == null ? null : uwx0Var.a(b5o0Var);
            }
        }
        if (d6o0Var != null) {
            if (!(d6o0Var.c ? this.g.a(d6o0Var) : this.f.a(d6o0Var))) {
                throw new RejectedExecutionException(i5s.a(new StringBuilder(), this.e, " was terminated"));
            }
        }
        if (z3) {
            if (r() || q(addAndGet)) {
                return;
            }
            r();
            return;
        }
        if (r() || q(atomicLongFieldUpdater.get(this))) {
            return;
        }
        r();
    }

    public final void p(b bVar, int i2, int i3) {
        while (true) {
            long j2 = i.get(this);
            int i4 = (int) (2097151 & j2);
            long j3 = (2097152 + j2) & (-2097152);
            if (i4 == i2) {
                if (i3 == 0) {
                    Object c = bVar.c();
                    while (true) {
                        if (c == l) {
                            i4 = -1;
                            break;
                        }
                        if (c == null) {
                            i4 = 0;
                            break;
                        }
                        b bVar2 = (b) c;
                        int b2 = bVar2.b();
                        if (b2 != 0) {
                            i4 = b2;
                            break;
                        }
                        c = bVar2.c();
                    }
                } else {
                    i4 = i3;
                }
            }
            if (i4 >= 0) {
                if (i.compareAndSet(this, j2, i4 | j3)) {
                    return;
                }
            }
        }
    }

    public final boolean q(long j2) {
        int i2 = ((int) (2097151 & j2)) - ((int) ((j2 & 4398044413952L) >> 21));
        if (i2 < 0) {
            i2 = 0;
        }
        int i3 = this.b;
        if (i2 < i3) {
            int m = m();
            if (m == 1 && i3 > 1) {
                m();
            }
            if (m > 0) {
                return true;
            }
        }
        return false;
    }

    public final boolean r() {
        con0 con0Var;
        int i2;
        while (true) {
            long j2 = i.get(this);
            b b2 = this.h.b((int) (2097151 & j2));
            if (b2 == null) {
                b2 = null;
            } else {
                long j3 = (2097152 + j2) & (-2097152);
                Object c = b2.c();
                while (true) {
                    con0Var = l;
                    if (c == con0Var) {
                        i2 = -1;
                        break;
                    }
                    if (c == null) {
                        i2 = 0;
                        break;
                    }
                    b bVar = (b) c;
                    i2 = bVar.b();
                    if (i2 != 0) {
                        break;
                    }
                    c = bVar.c();
                }
                if (i2 >= 0) {
                    if (i.compareAndSet(this, j2, i2 | j3)) {
                        b2.g(con0Var);
                    } else {
                        continue;
                    }
                } else {
                    continue;
                }
            }
            if (b2 == null) {
                return false;
            }
            if (b.j.compareAndSet(b2, -1, 0)) {
                LockSupport.unpark(b2);
                return true;
            }
        }
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        n9g0<b> n9g0Var = this.h;
        int a2 = n9g0Var.a();
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        for (int i7 = 1; i7 < a2; i7++) {
            b b2 = n9g0Var.b(i7);
            if (b2 != null) {
                uwx0 uwx0Var = b2.b;
                uwx0Var.getClass();
                int i8 = uwx0.b.get(uwx0Var) != null ? (uwx0.c.get(uwx0Var) - uwx0.d.get(uwx0Var)) + 1 : uwx0.c.get(uwx0Var) - uwx0.d.get(uwx0Var);
                int i9 = a.$EnumSwitchMapping$0[b2.d.ordinal()];
                if (i9 == 1) {
                    i4++;
                } else if (i9 == 2) {
                    i3++;
                    StringBuilder sb = new StringBuilder();
                    sb.append(i8);
                    sb.append('b');
                    arrayList.add(sb.toString());
                } else if (i9 == 3) {
                    i2++;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(i8);
                    sb2.append('c');
                    arrayList.add(sb2.toString());
                } else if (i9 == 4) {
                    i5++;
                    if (i8 > 0) {
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(i8);
                        sb3.append('d');
                        arrayList.add(sb3.toString());
                    }
                } else {
                    if (i9 != 5) {
                        throw new NoWhenBranchMatchedException();
                    }
                    i6++;
                }
            }
        }
        long j2 = j.get(this);
        StringBuilder sb4 = new StringBuilder();
        sb4.append(this.e);
        sb4.append('@');
        sb4.append(y6l.a(this));
        sb4.append("[Pool Size {core = ");
        int i10 = this.b;
        sb4.append(i10);
        sb4.append(", max = ");
        cgn.a(this.c, i2, "}, Worker States {CPU = ", ", blocking = ", sb4);
        cgn.a(i3, i4, ", parked = ", ", dormant = ", sb4);
        cgn.a(i5, i6, ", terminated = ", "}, running workers queues = ", sb4);
        sb4.append(arrayList);
        sb4.append(", global CPU queue size = ");
        sb4.append(this.f.b());
        sb4.append(", global blocking queue size = ");
        sb4.append(this.g.b());
        sb4.append(", Control State {created workers= ");
        sb4.append((int) (2097151 & j2));
        sb4.append(", blocking tasks = ");
        sb4.append((int) ((4398044413952L & j2) >> 21));
        sb4.append(", CPUs acquired = ");
        sb4.append(i10 - ((int) ((j2 & 9223367638808264704L) >> 42)));
        sb4.append("}]");
        return sb4.toString();
    }
}
