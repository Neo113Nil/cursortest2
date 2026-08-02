package xsna;

import android.database.sqlite.SQLiteFullException;
import android.os.SystemClock;
import android.os.Trace;
import com.huawei.hms.hihealth.data.DeviceInfo;
import com.vk.api.sdk.exceptions.InternalServerErrorOccurredException;
import com.vk.api.sdk.exceptions.VKApiException;
import com.vk.api.sdk.exceptions.VKApiExecutionException;
import com.vk.im.engine.exceptions.attach.AttachUploadException;
import com.vk.im.engine.internal.TaskExecutorTerminationInterrupted;
import com.vk.im.engine.internal.TaskExecutorTerminationOvertime;
import com.vk.im.engine.internal.TaskExecutorUnknownQueueRunnable;
import com.vk.im.engine.models.EngineWatchdogConfig;
import com.vk.im.engine.reporters.performance.events.LogType;
import com.vk.metrics.eventtracking.Event;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.random.Random;

/* compiled from: TaskExecutor.kt */
/* loaded from: classes.dex */
public final class q5o0 {
    public final w2w a;
    public final upj b;
    public final hre0 c;
    public final f9w d;
    public final Object e;
    public boolean f;
    public final bpn0 g;
    public final ConcurrentHashMap<String, c> h;
    public final bpn0 i;
    public final ConcurrentHashMap.KeySetView<Thread, Boolean> j;
    public final ConcurrentHashMap<String, b> k;

    /* JADX INFO: Add missing generic type declarations: [V] */
    /* compiled from: TaskExecutor.kt */
    @b6l(c = "com.vk.im.engine.internal.TaskExecutor$executeCommand$result$1", f = "TaskExecutor.kt", l = {Sdk.SDKError.Reason.STALE_CACHED_RESPONSE_VALUE}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class a<V> extends SuspendLambda implements wzs<yvj, spj<? super V>, Object> {
        final /* synthetic */ e1w<V> $cmd;
        final /* synthetic */ w2w $imEnv;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(e1w<V> e1wVar, w2w w2wVar, spj<? super a> spjVar) {
            super(2, spjVar);
            this.$cmd = e1wVar;
            this.$imEnv = w2wVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            return new a(this.$cmd, this.$imEnv, spjVar);
        }

        @Override // xsna.wzs
        public final Object invoke(yvj yvjVar, Object obj) {
            return ((a) create(yvjVar, (spj) obj)).invokeSuspend(s3q0.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.a.a(obj);
                return obj;
            }
            kotlin.a.a(obj);
            me6 me6Var = (me6) this.$cmd;
            w2w w2wVar = this.$imEnv;
            this.label = 1;
            Object e = me6Var.e(w2wVar, this);
            return e == coroutineSingletons ? coroutineSingletons : e;
        }
    }

    /* compiled from: TaskExecutor.kt */
    /* loaded from: classes2.dex */
    public static final class b {
        public final String a;
        public final long b;
        public final String c;
        public final String d;

        public b(long j, String str, String str2, String str3) {
            this.a = str;
            this.b = j;
            this.c = str2;
            this.d = str3;
        }

        public final String a() {
            return this.a;
        }

        public final String b() {
            return this.d;
        }

        public final long c() {
            return this.b;
        }

        public final String d() {
            return this.c;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return epx.f(this.a, bVar.a) && this.b == bVar.b && epx.f(this.c, bVar.c) && epx.f(this.d, bVar.d);
        }

        public final int hashCode() {
            int a = urd0.a(bh10.a(this.a.hashCode() * 31, 31, this.b), 31, this.c);
            String str = this.d;
            return a + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ActiveTaskInfo(cmdName=");
            sb.append(this.a);
            sb.append(", startTimeMs=");
            sb.append(this.b);
            sb.append(", threadName=");
            sb.append(this.c);
            sb.append(", queueName=");
            return ho8.a(sb, this.d, ')');
        }
    }

    /* compiled from: TaskExecutor.kt */
    /* loaded from: classes2.dex */
    public static final class c {
        public final ExecutorService a;
        public final io.reactivex.rxjava3.internal.schedulers.d b;

        public c(ExecutorService executorService, io.reactivex.rxjava3.internal.schedulers.d dVar) {
            this.a = executorService;
            this.b = dVar;
        }

        public final io.reactivex.rxjava3.core.w a() {
            return this.b;
        }

        public final ExecutorService b() {
            return this.a;
        }
    }

    public q5o0(w2w w2wVar) {
        upj upjVar = new upj();
        hre0 hre0Var = new hre0();
        p5o0 p5o0Var = new p5o0();
        f9w b2 = e9w.b("ImTaskExecutor[BG][" + mq9.a(w2wVar).b + ']');
        this.a = w2wVar;
        this.b = upjVar;
        this.c = hre0Var;
        this.d = b2;
        this.e = new Object();
        this.g = new bpn0(new v94(11));
        this.h = new ConcurrentHashMap<>();
        this.i = new bpn0(new gbl(this, p5o0Var));
        this.j = ConcurrentHashMap.newKeySet();
        this.k = new ConcurrentHashMap<>();
    }

    public static ThreadPoolExecutor c(ExecutorService executorService) {
        if (executorService instanceof pep0) {
            return c(((pep0) executorService).m());
        }
        if (executorService instanceof ThreadPoolExecutor) {
            return (ThreadPoolExecutor) executorService;
        }
        return null;
    }

    public static void f(String str) {
        com.vk.metrics.eventtracking.b bVar = com.vk.metrics.eventtracking.b.a;
        el3 el3Var = Event.b;
        Event.a aVar = new Event.a();
        aVar.f();
        aVar.g("TaskExecutor");
        aVar.c("log", str);
        bVar.k(aVar.e());
    }

    public static Throwable j(Throwable th) {
        Throwable cause;
        Throwable j;
        Throwable j2;
        if (th instanceof ExecutionException) {
            Throwable cause2 = th.getCause();
            if (cause2 != null && (j2 = j(cause2)) != null) {
                return j2;
            }
        } else if ((th instanceof AttachUploadException) && (cause = th.getCause()) != null && (j = j(cause)) != null) {
            return j;
        }
        return th;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(6:(8:5|(1:7)|8|9|10|(1:12)(8:16|(6:19|(1:21)(1:29)|22|(3:24|25|26)(1:28)|27|17)|30|31|(2:34|32)|35|36|(1:38))|13|14)|9|10|(0)(0)|13|14) */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0047, code lost:
    
        r12 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0111, code lost:
    
        r0 = new java.lang.StringBuilder();
        r0.append("Termination unexpected exception(size: ");
        r0.append(r14);
        r0.append("): ");
        r0.append(r13);
        r0.append(" - ");
        r4 = r12.getMessage();
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x012b, code lost:
    
        if (r4 == null) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x012d, code lost:
    
        r4 = r12.getCause();
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0131, code lost:
    
        if (r4 != null) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0133, code lost:
    
        r6 = r4.getMessage();
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0137, code lost:
    
        if (r6 == null) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0139, code lost:
    
        r4 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x013c, code lost:
    
        r4 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x013d, code lost:
    
        r0.append(r4);
        f(r0.toString());
        r2.getConfig().g.a(new com.vk.im.engine.internal.TaskExecutorTerminationInterrupted("Termination unexpected exception(size: " + r14 + "): " + r13, r12));
        r12 = xsna.s3q0.a;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0034 A[Catch: all -> 0x0047, InterruptedException -> 0x004a, TryCatch #1 {all -> 0x0047, blocks: (B:10:0x002a, B:12:0x0034, B:16:0x004d, B:17:0x0072, B:19:0x0078, B:21:0x0085, B:22:0x008b, B:25:0x0091, B:31:0x0095, B:32:0x00a4, B:34:0x00aa, B:36:0x00e5, B:38:0x00eb), top: B:9:0x002a, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x004d A[Catch: all -> 0x0047, InterruptedException -> 0x004a, TryCatch #1 {all -> 0x0047, blocks: (B:10:0x002a, B:12:0x0034, B:16:0x004d, B:17:0x0072, B:19:0x0078, B:21:0x0085, B:22:0x008b, B:25:0x0091, B:31:0x0095, B:32:0x00a4, B:34:0x00aa, B:36:0x00e5, B:38:0x00eb), top: B:9:0x002a, outer: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(ExecutorService executorService, String str, LinkedHashMap linkedHashMap) {
        String str2;
        w2w w2wVar = this.a;
        Trace.beginSection(ndp0.f("TaskExecutor.awaitTermination"));
        try {
            Integer num = (Integer) linkedHashMap.get(str);
            try {
                if (num != null) {
                    str2 = num.toString();
                    if (str2 == null) {
                    }
                    String str3 = null;
                    if (executorService.awaitTermination(10L, TimeUnit.SECONDS)) {
                        f("Termination overtime for executor(size: " + str2 + "): " + str);
                        e(str, this.k);
                        ConcurrentHashMap.KeySetView<Thread, Boolean> keySetView = this.j;
                        ArrayList arrayList = new ArrayList();
                        Iterator<Thread> it = keySetView.iterator();
                        while (it.hasNext()) {
                            Thread next = it.next();
                            ThreadGroup threadGroup = next.getThreadGroup();
                            if (epx.f(threadGroup != null ? threadGroup.getName() : null, str)) {
                                arrayList.add(next);
                            }
                        }
                        ArrayList arrayList2 = new ArrayList(c5g.u(arrayList, 10));
                        Iterator it2 = arrayList.iterator();
                        while (it2.hasNext()) {
                            Thread thread = (Thread) it2.next();
                            IllegalStateException illegalStateException = new IllegalStateException();
                            illegalStateException.setStackTrace(thread.getStackTrace());
                            w2wVar.getConfig().g.a(new TaskExecutorTerminationOvertime("Termination overtime for executor(size: " + str2 + "): " + str, illegalStateException));
                            arrayList2.add(s3q0.a);
                        }
                        if (arrayList2.isEmpty()) {
                            w2wVar.getConfig().g.a(new TaskExecutorTerminationOvertime("Termination overtime for executor(size: " + str2 + "): " + str));
                            s3q0 s3q0Var = s3q0.a;
                        }
                    } else {
                        f("Terminated executor " + str);
                        s3q0 s3q0Var2 = s3q0.a;
                    }
                    Trace.endSection();
                    return;
                }
                if (executorService.awaitTermination(10L, TimeUnit.SECONDS)) {
                }
                Trace.endSection();
                return;
            } catch (InterruptedException e) {
                f("Termination interrupted(size: " + str2 + "): " + str);
                w2wVar.getConfig().g.a(new TaskExecutorTerminationInterrupted("Termination interrupted(size: " + str2 + "): " + str));
                throw e;
            }
            str2 = "?";
            String str32 = null;
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    public final <V> V b(w2w w2wVar, e1w<V> e1wVar) {
        V v;
        this.b.getClass();
        long currentTimeMillis = System.currentTimeMillis();
        b bVar = new b(currentTimeMillis, e1wVar.c(), Thread.currentThread().getName(), sv1.o(e1wVar));
        String d = bVar.d();
        ConcurrentHashMap<String, b> concurrentHashMap = this.k;
        concurrentHashMap.put(d, bVar);
        if (e1wVar instanceof le6) {
            v = (V) ((le6) e1wVar).e(w2wVar);
        } else {
            if (!(e1wVar instanceof me6)) {
                throw new NoWhenBranchMatchedException();
            }
            v = (V) myc0.i(EmptyCoroutineContext.b, new a(e1wVar, w2wVar, null));
        }
        concurrentHashMap.remove(bVar.d());
        long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
        if (currentTimeMillis2 > 1000) {
            this.a.K().g().f(currentTimeMillis2, e1wVar.getClass().getName(), sv1.n(e1wVar));
        }
        return v;
    }

    public final void d() {
        if (((Boolean) this.a.getConfig().L.invoke()).booleanValue() && ((Random) this.g.getValue()).j() % 100 == 0) {
            throw new SQLiteFullException();
        }
    }

    public final void e(String str, ConcurrentHashMap<String, b> concurrentHashMap) {
        Collection<b> values = this.k.values();
        ArrayList arrayList = new ArrayList();
        for (Object obj : values) {
            if (epx.f(((b) obj).b(), str)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(c5g.u(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((b) it.next()).d());
        }
        if (arrayList2.isEmpty()) {
            return;
        }
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            b bVar = concurrentHashMap.get((String) it2.next());
            if (bVar != null) {
                n2w g = this.a.K().g();
                String a2 = bVar.a();
                String b2 = bVar.b();
                if (b2 == null) {
                    b2 = DeviceInfo.STR_TYPE_UNKNOWN;
                }
                this.b.getClass();
                g.g(System.currentTimeMillis() - bVar.c(), a2, b2);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x00ca  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void g(String str, Throwable th) {
        Integer num;
        Pair pair;
        if (th instanceof VKApiException) {
            VKApiException vKApiException = (VKApiException) th;
            if (vKApiException instanceof InternalServerErrorOccurredException) {
                InternalServerErrorOccurredException internalServerErrorOccurredException = (InternalServerErrorOccurredException) th;
                pair = new Pair(internalServerErrorOccurredException.g(), internalServerErrorOccurredException.d());
            } else if (vKApiException instanceof VKApiExecutionException) {
                StringBuilder sb = new StringBuilder();
                VKApiExecutionException vKApiExecutionException = (VKApiExecutionException) th;
                sb.append(vKApiExecutionException.g());
                sb.append(' ');
                sb.append(vKApiExecutionException.s());
                sb.append(':');
                sb.append(vKApiExecutionException.C());
                pair = new Pair(sb.toString(), vKApiExecutionException.t());
            } else {
                String message = th.getMessage();
                Throwable cause = th.getCause();
                pair = new Pair(message, cause != null ? cause.toString() : null);
            }
            new r3w0(LogType.TASK_EXECUTOR_API_ERROR, qjg.a(th), null, (String) pair.d(), (String) pair.g(), str, null, null, null, null, null, 16324).q();
            return;
        }
        ThreadPoolExecutor c2 = c(((c) this.i.getValue()).b());
        if (c2 != null) {
            int largestPoolSize = c2.getLargestPoolSize();
            Integer valueOf = Integer.valueOf(largestPoolSize);
            if (largestPoolSize >= 8) {
                num = valueOf;
                LogType logType = LogType.TASK_EXECUTOR_ERROR;
                String a2 = qjg.a(th);
                String message2 = th.getMessage();
                Throwable cause2 = th.getCause();
                new r3w0(logType, a2, null, message2, cause2 != null ? cause2.toString() : null, str, null, null, null, null, num, 12228).q();
            }
        }
        num = null;
        LogType logType2 = LogType.TASK_EXECUTOR_ERROR;
        String a22 = qjg.a(th);
        String message22 = th.getMessage();
        Throwable cause22 = th.getCause();
        new r3w0(logType2, a22, null, message22, cause22 != null ? cause22.toString() : null, str, null, null, null, null, num, 12228).q();
    }

    public final void h(ExecutorService executorService, String str, LinkedHashMap linkedHashMap) {
        Trace.beginSection(ndp0.f("TaskExecutor.shutDownNow"));
        try {
            List<Runnable> shutdownNow = executorService.shutdownNow();
            for (Runnable runnable : shutdownNow) {
                if (runnable instanceof Future) {
                    ((Future) runnable).cancel(true);
                } else {
                    com.vk.metrics.eventtracking.b.a.q(new TaskExecutorUnknownQueueRunnable("Cannot cancel runnable of type " + runnable.getClass().getCanonicalName()));
                }
            }
            if (this.a.getExperiments().u()) {
                ConcurrentHashMap.KeySetView<Thread, Boolean> keySetView = this.j;
                ArrayList arrayList = new ArrayList();
                Iterator<Thread> it = keySetView.iterator();
                while (it.hasNext()) {
                    Thread next = it.next();
                    ThreadGroup threadGroup = next.getThreadGroup();
                    if (epx.f(threadGroup != null ? threadGroup.getName() : null, str)) {
                        arrayList.add(next);
                    }
                }
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    Thread thread = (Thread) it2.next();
                    nx70 nx70Var = nx70.a;
                    nx70.c(thread);
                }
            }
            linkedHashMap.put(str, Integer.valueOf(shutdownNow.size()));
            s3q0 s3q0Var = s3q0.a;
            Trace.endSection();
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    public final io.reactivex.rxjava3.internal.operators.single.f0 i(e1w e1wVar) {
        c cVar;
        n2w g = this.a.K().g();
        String c2 = e1wVar.c();
        mla mlaVar = e1wVar.a;
        if (mlaVar == null) {
            mlaVar = null;
        }
        mlaVar.getClass();
        g.c(SystemClock.uptimeMillis() - mlaVar.f, c2, "executor");
        this.b.getClass();
        long currentTimeMillis = System.currentTimeMillis();
        mla mlaVar2 = e1wVar.a;
        io.reactivex.rxjava3.internal.operators.single.v vVar = new io.reactivex.rxjava3.internal.operators.single.v(new l5o0(this, new o5o0(this, e1wVar, currentTimeMillis), e1wVar, mlaVar2 != null ? mlaVar2 : null));
        String o = sv1.o(e1wVar);
        synchronized (this.e) {
            try {
                if (this.f) {
                    throw new InterruptedException("TaskExecutor is terminated");
                }
                if (o == null) {
                    cVar = (c) this.i.getValue();
                } else {
                    ConcurrentHashMap<String, c> concurrentHashMap = this.h;
                    c cVar2 = concurrentHashMap.get(o);
                    if (cVar2 == null) {
                        this.c.getClass();
                        ExecutorService k = k(new pep0(hre0.a(o)));
                        io.reactivex.rxjava3.core.w wVar = io.reactivex.rxjava3.schedulers.a.a;
                        c cVar3 = new c(k, new io.reactivex.rxjava3.internal.schedulers.d(k, true));
                        c putIfAbsent = concurrentHashMap.putIfAbsent(o, cVar3);
                        cVar2 = putIfAbsent == null ? cVar3 : putIfAbsent;
                    }
                    cVar = cVar2;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return vVar.q(cVar.a());
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, java.util.Map] */
    public final ExecutorService k(pep0 pep0Var) {
        EngineWatchdogConfig.a aVar = (EngineWatchdogConfig.a) this.a.getExperiments().B().a.get(EngineWatchdogConfig.WatchdogName.TASK_EXECUTOR);
        if (aVar == null) {
            return pep0Var;
        }
        return q3q.a(pep0Var, aVar.b, aVar.a, null, true, new wyn0(1), new jvl0(4));
    }
}
