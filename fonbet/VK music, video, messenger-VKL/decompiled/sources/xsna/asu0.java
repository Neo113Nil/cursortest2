package xsna;

import android.content.Context;
import com.ironsource.Z3;
import com.vk.log.L;
import com.vk.log.LoggerOutputTarget;
import com.vk.toggle.data.ThreadsSubstitutionConfig;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.LinkedTransferQueue;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyList;
import xsna.asu0;

/* compiled from: VkExecutors.kt */
/* loaded from: classes.dex */
public final class asu0 implements v3q {
    public static final gzs<a> A;
    public static final gzs<a> B;
    public static final gzs<a> C;
    public static final bpn0 D;
    public static final bpn0 E;
    public static final bpn0 F;
    public static final bpn0 G;
    public static final bpn0 H;
    public static final bpn0 I;
    public static final ArrayList J;
    public static final bpn0 K;
    public static final bpn0 L;
    public static final bpn0 M;
    public static final bpn0 N;
    public static final bpn0 O;
    public static final bpn0 P;
    public static final bpn0 Q;
    public static final bpn0 R;
    public static final bpn0 S;
    public static final bpn0 T;
    public static final bpn0 U;
    public static final bpn0 V;
    public static final bpn0 W;
    public static final bpn0 X;
    public static final bpn0 Y;
    public static final bpn0 Z;
    public static final bpn0 a0;
    public static final bpn0 b0;
    public static final bpn0 c0;
    public static final bpn0 d0;
    public static final bpn0 e0;
    public static final bpn0 f0;
    public static final a g;
    public static final bpn0 g0;
    public static final a h;
    public static final bpn0 h0;
    public static final a i;
    public static final bpn0 i0;
    public static final a j;
    public static final bpn0 j0;
    public static final a k;
    public static final bpn0 k0;
    public static final a l;
    public static final bpn0 l0;
    public static final bpn0 m0;
    public static final bpn0 n0;
    public static final bpn0 o0;
    public static final a p;
    public static final bpn0 p0;
    public static final a q;
    public static final bpn0 q0;
    public static final a r;
    public static final bpn0 r0;
    public static final qru0 s;
    public static final bpn0 s0;
    public static final bpn0 t;
    public static final bpn0 t0;
    public static final gzs<a> u;
    public static final gzs<a> v;
    public static final gzs<a> w;
    public static final gzs<a> x;
    public static final gzs<a> y;
    public static final gzs<a> z;
    public static final asu0 a = new asu0();
    public static final a b = new a(16, 32, 100, false, false, null, Z3.l);
    public static final a c = new a(4, 4, 100, false, false, null, Z3.l);
    public static final a d = new a(16, 32, 100, false, false, null, Z3.l);
    public static final a e = new a(16, 32, 100, false, false, null, Z3.l);
    public static final a f = new a(10, 20, 3000, false, false, null, Z3.l);
    public static final r63 m = new r63(18);
    public static final s63 n = new s63(19);
    public static final xu2 o = new xu2(15);

    /* compiled from: VkExecutors.kt */
    public static final class b extends LinkedTransferQueue<Runnable> {
        @Override // java.util.concurrent.LinkedTransferQueue, java.util.AbstractCollection, java.util.Collection, java.util.concurrent.BlockingQueue
        public final /* bridge */ boolean contains(Object obj) {
            if (obj == null ? true : obj instanceof Runnable) {
                return super.contains((Runnable) obj);
            }
            return false;
        }

        @Override // java.util.concurrent.LinkedTransferQueue, java.util.Queue, java.util.concurrent.BlockingQueue
        public final boolean offer(Object obj) {
            return tryTransfer((Runnable) obj);
        }

        @Override // java.util.concurrent.LinkedTransferQueue, java.util.AbstractCollection, java.util.Collection, java.util.concurrent.BlockingQueue
        public final /* bridge */ boolean remove(Object obj) {
            if (obj == null ? true : obj instanceof Runnable) {
                return super.remove((Runnable) obj);
            }
            return false;
        }
    }

    /* compiled from: VkExecutors.kt */
    /* loaded from: classes17.dex */
    public static final /* synthetic */ class c {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ThreadsSubstitutionConfig.Substitution.values().length];
            try {
                iArr[ThreadsSubstitutionConfig.Substitution.SINGLE_THREAD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ThreadsSubstitutionConfig.Substitution.IO.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ThreadsSubstitutionConfig.Substitution.COMPUTATION.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    static {
        boolean z2 = false;
        g = new a(0, 4, 100L, false, z2, null, Z3.l);
        int i2 = 4;
        boolean z3 = false;
        h = new a(0, i2, 3000L, z2, z3, null, Z3.l);
        boolean z4 = false;
        i = new a(i2, 4, 100L, z3, z4, null, Z3.l);
        int i3 = 1;
        j = new a(0, i3, 100L, z4, false, null, Z3.l);
        boolean z5 = false;
        k = new a(i3, 3, 250L, true, z5, null, 1008);
        l = new a(2, 16, 250L, z5, false, null, Z3.l);
        a a2 = a.C2569a.a(2);
        p = a2;
        a a3 = a.C2569a.a(Runtime.getRuntime().availableProcessors());
        q = a3;
        a a4 = a.C2569a.a(Runtime.getRuntime().availableProcessors());
        r = a4;
        s = new qru0();
        t = new bpn0(new l67(17));
        u = G(10, new m03(13));
        v = G(16, new q03(16));
        w = G(16, new d53(9));
        x = G(4, new t03(14));
        y = G(16, new e53(14));
        z = G(1, new mn8(17));
        A = G(a2.a, new xb3(15));
        B = G(a3.a, new zfl(14));
        C = G(a4.a, new pb8(13));
        D = new bpn0(new r03(16));
        E = new bpn0(new s12(16));
        F = new bpn0(new u94(18));
        G = new bpn0(new v94(20));
        H = new bpn0(new w94(24));
        I = new bpn0(new hu2(18));
        J = new ArrayList();
        K = new bpn0(new sw1(23));
        L = new bpn0(new lu2(18));
        M = new bpn0(new dr6(23));
        new bpn0(new er6(18));
        N = new bpn0(new fr6(22));
        O = new bpn0(new qo(13));
        P = new bpn0(new dw9(14));
        Q = new bpn0(new ib3(19));
        R = new bpn0(new kb3(15));
        S = new bpn0(new q57(16));
        T = new bpn0(new mb3(22));
        U = new bpn0(new ox4(14));
        V = new bpn0(new jvg(14));
        W = new bpn0(new s3a(14));
        new bpn0(new aq0(15));
        X = new bpn0(new aqi(13));
        Y = new bpn0(new wb3(10));
        Z = new bpn0(new xh6(19));
        a0 = new bpn0(new y56(14));
        b0 = new bpn0(new kb0(13));
        c0 = new bpn0(new exw(11));
        d0 = new bpn0(new ag7(15));
        e0 = new bpn0(new wfl(9));
        f0 = new bpn0(new rwe(16));
        g0 = new bpn0(new hb8(16));
        h0 = new bpn0(new y45(16));
        i0 = new bpn0(new m(18));
        j0 = new bpn0(new yp6(17));
        k0 = new bpn0(new s65(18));
        l0 = new bpn0(new c24(22));
        m0 = new bpn0(new jbw(17));
        n0 = new bpn0(new mb8(16));
        new bpn0(new nb8(25));
        o0 = new bpn0(new p5m(15));
        p0 = new bpn0(new b55(15));
        q0 = new bpn0(new qb8(14));
        new bpn0(new k03(20));
        new bpn0(new vv8(14));
        new bpn0(new wv8(15));
        new bpn0(new l03(17));
        r0 = new bpn0(new lq6(12));
        s0 = new bpn0(new g58(13));
        t0 = new bpn0(new p03(14));
    }

    public static final ExecutorService B(int i2, ThreadFactory threadFactory) {
        a.getClass();
        k0n0 D2 = D();
        return D2 == null ? Executors.newFixedThreadPool(i2, threadFactory) : D2;
    }

    public static final ExecutorService C() {
        a.getClass();
        k0n0 D2 = D();
        return D2 == null ? Executors.newSingleThreadExecutor() : D2;
    }

    public static k0n0 D() {
        k0n0 a2;
        Context context = e43.a;
        if (context == null) {
            context = null;
        }
        if (ThreadsSubstitutionConfig.b == null) {
            synchronized (fpf0.a(ThreadsSubstitutionConfig.class)) {
                try {
                    if (ThreadsSubstitutionConfig.b == null) {
                        File file = new File(context.getApplicationInfo().dataDir + "/threads_substitution");
                        ThreadsSubstitutionConfig.b = file.exists() ? ThreadsSubstitutionConfig.a.a(nbr.r(file, emb.b)) : new ThreadsSubstitutionConfig(EmptyList.b);
                    }
                    s3q0 s3q0Var = s3q0.a;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        ThreadsSubstitutionConfig threadsSubstitutionConfig = ThreadsSubstitutionConfig.b;
        if (threadsSubstitutionConfig == null) {
            threadsSubstitutionConfig = null;
        }
        if (!threadsSubstitutionConfig.a.isEmpty()) {
            String className = Thread.currentThread().getStackTrace()[4].getClassName();
            for (ThreadsSubstitutionConfig.Target target : threadsSubstitutionConfig.a) {
                if (target.j(className)) {
                    L l2 = L.a;
                    l2.getClass();
                    if (!L.m(LoggerOutputTarget.NONE)) {
                        L.LogType logType = L.LogType.d;
                        StringBuilder a3 = t33.a("substituting executor in ", className, " due to target ");
                        a3.append(target.name());
                        L.u(l2, logType, new Object[]{"VkExecutors", a3.toString()});
                    }
                    asu0 asu0Var = a;
                    ThreadsSubstitutionConfig.Substitution k2 = target.k();
                    asu0Var.getClass();
                    int i2 = c.$EnumSwitchMapping$0[k2.ordinal()];
                    if (i2 == 1) {
                        a2 = ((wmg0) t0.getValue()).a();
                    } else if (i2 == 2) {
                        a2 = new k0n0(n());
                    } else {
                        if (i2 != 3) {
                            throw new NoWhenBranchMatchedException();
                        }
                        a2 = new k0n0(h());
                    }
                    l0n0 l0n0Var = a2 instanceof l0n0 ? (l0n0) a2 : null;
                    if (l0n0Var != null) {
                        l0n0Var.e.a(target.i());
                    }
                    return a2;
                }
            }
        }
        return null;
    }

    public static ExecutorService E(final a aVar, final String str) {
        bhr bhrVar;
        final AtomicInteger atomicInteger = new AtomicInteger();
        ThreadFactory threadFactory = new ThreadFactory() { // from class: xsna.vru0
            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                StringBuilder e2 = fw3.e(str);
                e2.append(atomicInteger.getAndIncrement());
                String sb = e2.toString();
                asu0.a aVar2 = aVar;
                fhr0 fhr0Var = new fhr0(runnable, sb, aVar2.g);
                fhr0Var.setUncaughtExceptionHandler(asu0.s);
                int i2 = aVar2.f;
                if (i2 != 5) {
                    fhr0Var.setPriority(i2);
                }
                return fhr0Var;
            }
        };
        Boolean bool = aVar.h;
        BlockingQueue blockingQueue = aVar.i;
        if (bool != null) {
            int i2 = aVar.a;
            int i3 = aVar.b;
            long j2 = aVar.c;
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            if (blockingQueue == null) {
                blockingQueue = new PriorityBlockingQueue(i2, bool.booleanValue() ? ecd0.d : ecd0.e);
            }
            bhrVar = new bhr(i2, i3, j2, blockingQueue, aVar.d, threadFactory);
        } else {
            int i4 = aVar.a;
            int i5 = aVar.b;
            long j3 = aVar.c;
            TimeUnit timeUnit2 = TimeUnit.MILLISECONDS;
            if (blockingQueue == null) {
                blockingQueue = new b();
            }
            bhrVar = new bhr(i4, i5, j3, blockingQueue, aVar.d, threadFactory);
            bhrVar.setRejectedExecutionHandler(new yru0());
        }
        wzs<a, ThreadPoolExecutor, s3q0> wzsVar = aVar.j;
        if (wzsVar != null) {
            wzsVar.invoke(aVar, bhrVar);
        }
        if (aVar.e) {
            bhrVar.prestartAllCoreThreads();
        }
        s3q0 s3q0Var = s3q0.a;
        J.add(new WeakReference(bhrVar));
        return F(new pep0(bhrVar));
    }

    public static ExecutorService F(pep0 pep0Var) {
        n3q a2;
        dsu0 dsu0Var = (dsu0) D.getValue();
        if (dsu0Var == null) {
            return pep0Var;
        }
        long j2 = dsu0Var.a;
        a.getClass();
        a2 = q3q.a(pep0Var, j2, 5000L, (g7o0) F.getValue(), !dsu0Var.c, new mo1(29), new zru0());
        return a2;
    }

    public static gzs G(final int i2, final gzs gzsVar) {
        return ((Boolean) t.getValue()).booleanValue() ? new gzs() { // from class: xsna.wru0
            @Override // xsna.gzs
            public final Object invoke() {
                asu0.a aVar = (asu0.a) gzsVar.invoke();
                int i3 = i2;
                int i4 = i3 < 1 ? 1 : i3;
                return new asu0.a(i4, i4, 0L, false, true, aVar.f, aVar.g, aVar.h, aVar.i, aVar.j);
            }
        } : gzsVar;
    }

    public static ArrayList g() {
        ArrayList arrayList = new ArrayList();
        Iterator it = J.iterator();
        while (it.hasNext()) {
            ThreadPoolExecutor threadPoolExecutor = (ThreadPoolExecutor) ((WeakReference) it.next()).get();
            if (threadPoolExecutor != null) {
                arrayList.add(threadPoolExecutor);
            }
        }
        return arrayList;
    }

    public static ExecutorService h() {
        return (ExecutorService) U.getValue();
    }

    public static io.reactivex.rxjava3.core.w i() {
        return (io.reactivex.rxjava3.core.w) X.getValue();
    }

    public static ExecutorService j() {
        return (ExecutorService) d0.getValue();
    }

    public static io.reactivex.rxjava3.core.w k() {
        return (io.reactivex.rxjava3.core.w) h0.getValue();
    }

    public static ExecutorService l() {
        return (ExecutorService) f0.getValue();
    }

    public static io.reactivex.rxjava3.core.w m() {
        return (io.reactivex.rxjava3.core.w) p0.getValue();
    }

    public static ExecutorService n() {
        return (ExecutorService) K.getValue();
    }

    public static ScheduledExecutorService o() {
        return (ScheduledExecutorService) M.getValue();
    }

    public static io.reactivex.rxjava3.core.w p() {
        return (io.reactivex.rxjava3.core.w) N.getValue();
    }

    public static ExecutorService q() {
        return (ExecutorService) O.getValue();
    }

    public static io.reactivex.rxjava3.core.w r() {
        return (io.reactivex.rxjava3.core.w) R.getValue();
    }

    public static ExecutorService s() {
        return (ExecutorService) g0.getValue();
    }

    public static io.reactivex.rxjava3.core.w t() {
        return (io.reactivex.rxjava3.core.w) k0.getValue();
    }

    public static ScheduledExecutorService u() {
        return (ScheduledExecutorService) Y.getValue();
    }

    public static ScheduledExecutorService v() {
        return (ScheduledExecutorService) c0.getValue();
    }

    public static io.reactivex.rxjava3.core.w w() {
        return (io.reactivex.rxjava3.core.w) b0.getValue();
    }

    public static ExecutorService x() {
        return (ExecutorService) S.getValue();
    }

    public static boolean y() {
        return ((Boolean) G.getValue()).booleanValue();
    }

    public final v860 A(final int i2, final String str) {
        sep0 sep0Var = new sep0(new ahr(1, new ThreadFactory() { // from class: xsna.sru0
            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                fhr0 fhr0Var = new fhr0(runnable, str, null);
                fhr0Var.setUncaughtExceptionHandler(asu0.s);
                fhr0Var.setPriority(i2);
                return fhr0Var;
            }
        }));
        dsu0 dsu0Var = (dsu0) D.getValue();
        ScheduledExecutorService scheduledExecutorService = sep0Var;
        if (dsu0Var != null) {
            scheduledExecutorService = q3q.c(sep0Var, dsu0Var.a, new xru0());
        }
        return new v860(scheduledExecutorService);
    }

    @Override // xsna.v3q
    public final tru0 a(int i2, String str, boolean z2) {
        return new tru0(str, z2, i2);
    }

    @Override // xsna.v3q
    public final ExecutorService b(final int i2, long j2, final String str) {
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        bhr bhrVar = new bhr(1, 1, j2, new LinkedBlockingQueue(), true, new ThreadFactory() { // from class: xsna.uru0
            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                fhr0 fhr0Var = new fhr0(runnable, str, null);
                fhr0Var.setPriority(i2);
                fhr0Var.setUncaughtExceptionHandler(asu0.s);
                return fhr0Var;
            }
        });
        J.add(new WeakReference(bhrVar));
        return F(new pep0(bhrVar));
    }

    @Override // xsna.v3q
    public final io.reactivex.rxjava3.core.w c() {
        return (io.reactivex.rxjava3.core.w) L.getValue();
    }

    @Override // xsna.v3q
    public final io.reactivex.rxjava3.core.w d() {
        return (io.reactivex.rxjava3.core.w) q0.getValue();
    }

    public final ScheduledExecutorService z(final int i2, final String str) {
        ahr ahrVar = new ahr(1, new ThreadFactory() { // from class: xsna.rru0
            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                fhr0 fhr0Var = new fhr0(runnable, str, null);
                fhr0Var.setPriority(i2);
                fhr0Var.setUncaughtExceptionHandler(asu0.s);
                return fhr0Var;
            }
        });
        J.add(new WeakReference(ahrVar));
        sep0 sep0Var = new sep0(ahrVar);
        dsu0 dsu0Var = (dsu0) D.getValue();
        return dsu0Var != null ? q3q.c(sep0Var, dsu0Var.a, new xru0()) : sep0Var;
    }

    /* compiled from: VkExecutors.kt */
    public static final class a {
        public final int a;
        public final int b;
        public final long c;
        public final boolean d;
        public final boolean e;
        public final int f;
        public final Integer g;
        public final Boolean h;
        public final BlockingQueue<Runnable> i;
        public final wzs<a, ThreadPoolExecutor, s3q0> j;

        /* compiled from: VkExecutors.kt */
        /* renamed from: xsna.asu0$a$a, reason: collision with other inner class name */
        public static final class C2569a {
            public static a a(int i) {
                return new a(i, i, 0L, false, false, null, 992);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public a(int i, int i2, long j, boolean z, boolean z2, int i3, Integer num, Boolean bool, BlockingQueue<Runnable> blockingQueue, wzs<? super a, ? super ThreadPoolExecutor, s3q0> wzsVar) {
            this.a = i;
            this.b = i2;
            this.c = j;
            this.d = z;
            this.e = z2;
            this.f = i3;
            this.g = num;
            this.h = bool;
            this.i = blockingQueue;
            this.j = wzsVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a == aVar.a && this.b == aVar.b && this.c == aVar.c && this.d == aVar.d && this.e == aVar.e && this.f == aVar.f && epx.f(this.g, aVar.g) && epx.f(this.h, aVar.h) && epx.f(this.i, aVar.i) && epx.f(this.j, aVar.j);
        }

        public final int hashCode() {
            int a = shy.a(this.f, qoy.b(qoy.b(bh10.a(shy.a(this.b, Integer.hashCode(this.a) * 31, 31), 31, this.c), 31, this.d), 31, this.e), 31);
            Integer num = this.g;
            int hashCode = (a + (num == null ? 0 : num.hashCode())) * 31;
            Boolean bool = this.h;
            int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
            BlockingQueue<Runnable> blockingQueue = this.i;
            int hashCode3 = (hashCode2 + (blockingQueue == null ? 0 : blockingQueue.hashCode())) * 31;
            wzs<a, ThreadPoolExecutor, s3q0> wzsVar = this.j;
            return hashCode3 + (wzsVar != null ? wzsVar.hashCode() : 0);
        }

        public final String toString() {
            return "ExecutorConfig(corePoolSize=" + this.a + ", maxPoolSize=" + this.b + ", keepAliveTimeMs=" + this.c + ", allowCoreThreadTimeOut=" + this.d + ", prestartCoreThreads=" + this.e + ", threadPriority=" + this.f + ", osPriority=" + this.g + ", isMinPriorityQueue=" + this.h + ", workQueue=" + this.i + ", onExecutorCreated=" + this.j + ')';
        }

        public /* synthetic */ a(int i, int i2, long j, boolean z, boolean z2, Integer num, int i3) {
            this(i, i2, j, (i3 & 8) != 0 ? false : z, (i3 & 16) != 0 ? false : z2, (i3 & 32) != 0 ? 5 : 10, (i3 & 64) != 0 ? null : num, (i3 & 128) != 0 ? null : Boolean.FALSE, null, null);
        }
    }
}
