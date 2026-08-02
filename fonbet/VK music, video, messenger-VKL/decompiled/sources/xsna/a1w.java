package xsna;

import android.content.Context;
import android.os.Process;
import android.os.Trace;
import androidx.annotation.CheckResult;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.Peer;
import com.vk.im.engine.ImEnvironmentRunner;
import com.vk.im.engine.exceptions.ImEngineInstantClearCacheException;
import com.vk.im.engine.exceptions.ImEngineTestException;
import com.vk.im.engine.exceptions.ImEngineUnrecoverableException;
import com.vk.im.engine.models.EngineInvalidateSource;
import com.vk.im.engine.models.EngineWatchdogConfig;
import com.vk.im.engine.models.ImBgSyncLaunchState;
import com.vk.im.engine.models.credentials.UserCredentials;
import com.vk.im.engine.models.sync.ImBgSyncMode;
import com.vk.metrics.eventtracking.Event;
import com.vk.stat.model.DevNullEventKey;
import com.vk.stat.scheme.SchemeStat$TypeDevNullItem;
import java.util.Collections;
import java.util.Iterator;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Result;
import kotlin.random.Random;
import org.chromium.net.NetError;
import ru.ok.tracer.profiler.systrace.SystraceProfiler;
import xsna.g8i;
import xsna.i2w;
import xsna.ihl0;
import xsna.pdg0;
import xsna.plp;
import xsna.q2w;
import xsna.whc;

/* compiled from: ImEngine.kt */
/* loaded from: classes.dex */
public final class a1w implements llp {
    public final pzv a;
    public final f9w b;
    public final Object c;
    public boolean d;
    public boolean e;
    public boolean f;
    public boolean g;
    public q2w h;
    public final ExecutorService i;
    public volatile ImEnvironmentRunner j;
    public final b k;
    public final zxp l;
    public volatile pzv m;

    /* compiled from: ImEngine.kt */
    /* loaded from: classes2.dex */
    public final class a implements Callable<s3q0> {
        public final pzv b;

        public a(pzv pzvVar) {
            this.b = pzvVar;
        }

        @Override // java.util.concurrent.Callable
        public final s3q0 call() {
            Object failure;
            Peer peer;
            pzv pzvVar = this.b;
            a1w a1wVar = a1w.this;
            try {
                a1wVar.b.debug(new w9(17));
                UserCredentials m = pzvVar.m();
                i2w.b bVar = i2w.f;
                Context context = pzvVar.a.a;
                if (m == null || (peer = m.d()) == null) {
                    Serializer.c<Peer> cVar = Peer.CREATOR;
                    peer = Peer.Unknown.e;
                }
                y6x y6xVar = (y6x) bVar.a(context, peer);
                y6xVar.n();
                y6xVar.m("doClearJobs");
                pzvVar.j.a();
                a1w.b(a1wVar, pzvVar);
                vdw.a.d();
                a1wVar.b.debug(new sk4(19));
                failure = s3q0.a;
            } catch (Throwable th) {
                failure = new Result.Failure(th);
            }
            Throwable a = Result.a(failure);
            if (a != null) {
                com.vk.metrics.eventtracking.b.a.a(a);
            }
            kotlin.a.a(failure);
            return s3q0.a;
        }
    }

    /* compiled from: ImEngine.kt */
    public final class b implements agx {
        public b() {
        }

        @Override // xsna.agx
        public final void a(whc whcVar) {
            a1w.this.g(whcVar);
        }
    }

    /* compiled from: ImEngine.kt */
    /* loaded from: classes2.dex */
    public final class c implements Callable<s3q0> {
        public final ImEnvironmentRunner b;
        public final ImBgSyncMode c;
        public final String d;

        public c(ImEnvironmentRunner imEnvironmentRunner, ImBgSyncMode imBgSyncMode, String str) {
            this.b = imEnvironmentRunner;
            this.c = imBgSyncMode;
            this.d = str;
        }

        @Override // java.util.concurrent.Callable
        public final s3q0 call() {
            Object failure;
            boolean z;
            a1w a1wVar = a1w.this;
            try {
            } catch (Throwable th) {
                failure = new Result.Failure(th);
            }
            if (this.b.d() == this.c) {
                a1wVar.b.debug(new odm(this, 18));
            } else if (this.b.g()) {
                ImEnvironmentRunner imEnvironmentRunner = this.b;
                synchronized (imEnvironmentRunner.c) {
                    ImEnvironmentRunner.State state = imEnvironmentRunner.g;
                    if (state != ImEnvironmentRunner.State.STARTING) {
                        z = state == ImEnvironmentRunner.State.STARTED;
                    }
                }
                if (z) {
                    a1wVar.b.debug(new d2(17));
                    this.b.i(this.c, this.d);
                    a1wVar.b.debug(new com.vk.movika.sdk.base.ui.v(19));
                    failure = s3q0.a;
                    Throwable a = Result.a(failure);
                    if (a != null) {
                        com.vk.metrics.eventtracking.b.a.a(a);
                    }
                } else {
                    a1wVar.b.f(new d14(13));
                }
            } else {
                a1wVar.b.f(new xs6(12));
            }
            return s3q0.a;
        }
    }

    /* compiled from: ImEngine.kt */
    public final class d implements Callable<s3q0> {
        public final ImEnvironmentRunner b;
        public final plp c;

        public d(ImEnvironmentRunner imEnvironmentRunner, plp plpVar) {
            this.b = imEnvironmentRunner;
            this.c = plpVar;
        }

        @Override // java.util.concurrent.Callable
        public final s3q0 call() {
            ImEnvironmentRunner imEnvironmentRunner = this.b;
            String str = imEnvironmentRunner.a.a.k.get();
            a1w a1wVar = a1w.this;
            pzv r = a1wVar.r();
            f9w f9wVar = a1wVar.b;
            boolean booleanValue = r.M.invoke().booleanValue();
            try {
                try {
                    f9wVar.debug(new oxv(str, 1));
                    imEnvironmentRunner.f();
                } catch (Exception e) {
                    ImEngineUnrecoverableException imEngineUnrecoverableException = new ImEngineUnrecoverableException(e);
                    a1wVar.h = new q2w.a(imEngineUnrecoverableException, true);
                    com.vk.metrics.eventtracking.b.a.a(imEngineUnrecoverableException);
                }
                if (booleanValue) {
                    throw new ImEngineTestException(0);
                }
                f9wVar.debug(new pxv(str, 1));
                a1wVar.h = q2w.c.a;
                a1wVar.w(this.c, imEnvironmentRunner.g());
                a1wVar.d = false;
                a1wVar.e = str == null;
                return s3q0.a;
            } finally {
                a1wVar.f = false;
            }
        }
    }

    /* compiled from: ImEngine.kt */
    /* loaded from: classes2.dex */
    public final class e implements Callable<s3q0> {
        public final ImEnvironmentRunner b;
        public final gxv c;
        public final /* synthetic */ a1w d;

        public e(a1w a1wVar, pzv pzvVar, ImEnvironmentRunner imEnvironmentRunner) {
            gxv p = pzvVar.O.p();
            this.d = a1wVar;
            this.b = imEnvironmentRunner;
            this.c = p;
        }

        @Override // java.util.concurrent.Callable
        public final s3q0 call() {
            Object failure;
            ImBgSyncLaunchState c;
            ImBgSyncLaunchState imBgSyncLaunchState;
            a1w a1wVar;
            String str;
            ImEnvironmentRunner imEnvironmentRunner = this.b;
            try {
                c = imEnvironmentRunner.c();
                imBgSyncLaunchState = ImBgSyncLaunchState.ACTIVE;
                a1wVar = this.d;
            } catch (Throwable th) {
                failure = new Result.Failure(th);
            }
            if (c != imBgSyncLaunchState) {
                a1wVar.b.debug(new hy2(14));
                return s3q0.a;
            }
            f9w f9wVar = a1wVar.b;
            f9wVar.debug(new com.vk.movika.sdk.base.logic.interactor.g(20));
            g8i j = imEnvironmentRunner.j();
            g8i.a a = j.a(5L, TimeUnit.SECONDS);
            g8i g8iVar = a.d;
            boolean z = g8iVar == null;
            gxv gxvVar = this.c;
            if (!z) {
                if (g8iVar == null || (str = g8iVar.id()) == null) {
                    str = "null";
                }
                gxvVar.b(str);
            }
            gxvVar.a(a.c);
            f9wVar.debug(new ecm(a, 15));
            f9wVar.debug(new m1i(j, 19));
            f9wVar.debug(new l9h(a, 23));
            f9wVar.debug(new fgm(a, 14));
            f9wVar.debug(new maj(a, 23));
            f9wVar.debug(new foi(a, 12));
            f9wVar.debug(new n1i(a, 18));
            f9wVar.debug(new com.vk.movika.sdk.base.ui.g0(23));
            Iterator<g8i> it = a.e.keySet().iterator();
            while (it.hasNext()) {
                f9wVar.debug(new com.vk.catalog2.common.ui.holders.b(15, it.next(), a));
            }
            failure = s3q0.a;
            Throwable a2 = Result.a(failure);
            if (a2 != null) {
                com.vk.metrics.eventtracking.b.a.a(a2);
            }
            return s3q0.a;
        }
    }

    /* compiled from: ImEngine.kt */
    /* loaded from: classes2.dex */
    public final class f implements Callable<s3q0> {
        public final ImEnvironmentRunner b;

        public f(ImEnvironmentRunner imEnvironmentRunner) {
            this.b = imEnvironmentRunner;
        }

        /* JADX WARN: Code restructure failed: missing block: B:38:0x00b9, code lost:
        
            if (kotlin.random.Random.c.n(100) > r6) goto L16;
         */
        /* JADX WARN: Code restructure failed: missing block: B:46:0x0098, code lost:
        
            if (kotlin.random.Random.c.n(100) > r6) goto L16;
         */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.concurrent.Callable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final s3q0 call() {
            a1w a1wVar = a1w.this;
            com.vk.im.engine.models.f a = a1wVar.r().h.n.a();
            if (a == null) {
                a = com.vk.im.engine.models.f.e;
            }
            long currentTimeMillis = System.currentTimeMillis();
            boolean z = a.a;
            long j = a.b;
            long j2 = a.d;
            if (z) {
                SystraceProfiler.start("IM.EnvStopTask", a.c);
            }
            try {
                try {
                    a1wVar.b.debug(new f84(12));
                    this.b.h();
                    a1w.c(a1wVar);
                } catch (InterruptedException unused) {
                    a1w.c(a1wVar);
                    a1wVar.w(null, false);
                    if (z) {
                        if (System.currentTimeMillis() - currentTimeMillis > j2) {
                            Random.b.getClass();
                        }
                    }
                } catch (Exception e) {
                    ImEngineUnrecoverableException imEngineUnrecoverableException = new ImEngineUnrecoverableException("#doStopEnvironment failed", e);
                    com.vk.metrics.eventtracking.b.a.a(e);
                    a1wVar.h = new q2w.a(imEngineUnrecoverableException, false);
                    a1wVar.w(null, false);
                    if (z) {
                        if (System.currentTimeMillis() - currentTimeMillis > j2) {
                            Random.b.getClass();
                        }
                    }
                }
                return s3q0.a;
            } finally {
                a1wVar.w(null, false);
                if (z) {
                    if (System.currentTimeMillis() - currentTimeMillis > j2) {
                        Random.b.getClass();
                        if (Random.c.n(100L) > j) {
                            SystraceProfiler.commit$default(null, 1, null);
                        }
                    }
                    SystraceProfiler.abort();
                }
            }
        }
    }

    /* compiled from: ImEngine.kt */
    public static final class g implements Runnable {
        public final Runnable b;

        public g(Runnable runnable) {
            this.b = runnable;
        }

        @Override // java.lang.Runnable
        public final void run() {
            try {
                Process.setThreadPriority(-15);
            } catch (Exception e) {
                com.vk.metrics.eventtracking.b.a.a(e);
            }
            this.b.run();
        }
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, java.util.Map] */
    public a1w(pzv pzvVar, String str) {
        this.a = pzvVar;
        f9w b2 = e9w.b(str);
        this.b = b2;
        this.c = new Object();
        this.g = true;
        this.h = q2w.e.a;
        this.j = new ImEnvironmentRunner(new n3w(pzvVar), b2);
        this.k = new b();
        this.l = new zxp();
        this.m = pzvVar;
        EngineWatchdogConfig.a aVar = (EngineWatchdogConfig.a) pzvVar.h.B().a.get(EngineWatchdogConfig.WatchdogName.INTERNAL_QUEUE_EXECUTOR);
        boolean z = aVar != null;
        long j = aVar != null ? aVar.a : 0L;
        long j2 = aVar != null ? aVar.b : 0L;
        pep0 pep0Var = new pep0(Executors.newSingleThreadExecutor(new lek(1)));
        this.i = z ? q3q.a(pep0Var, j2, j, null, true, new xdj(1), new ziv(1)) : pep0Var;
    }

    public static final void b(a1w a1wVar, pzv pzvVar) {
        a1wVar.getClass();
        String str = pzvVar.k.get();
        if (str == null || drm0.N(str)) {
            return;
        }
        try {
            boolean deleteDatabase = pzvVar.a.a.deleteDatabase(str);
            com.vk.metrics.eventtracking.b bVar = com.vk.metrics.eventtracking.b.a;
            el3 el3Var = Event.b;
            Event.a aVar = new Event.a();
            aVar.g("ImEngine.doClearSqliteCache");
            aVar.c("dbFileName", str);
            aVar.a(Boolean.valueOf(deleteDatabase), "deletedSuccessfully");
            bVar.k(aVar.e());
            a1wVar.b.debug(new kzd(str, deleteDatabase, 1));
            s3q0 s3q0Var = s3q0.a;
        } catch (Throwable unused) {
        }
    }

    public static final void c(a1w a1wVar) {
        synchronized (a1wVar.c) {
            try {
                if (!epx.f(a1wVar.h, q2w.b.a)) {
                    a1wVar.h = q2w.e.a;
                }
                s3q0 s3q0Var = s3q0.a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @ozl
    public final void A(String str) {
        try {
            Trace.beginSection("ImEngine.stopBgSync");
            this.b.debug(new m2g(str, 26));
            synchronized (this.c) {
                this.b.debug(new kbe(str, 29));
                this.i.submit(new e(this, r(), this.j));
                s3q0 s3q0Var = s3q0.a;
            }
        } finally {
            Trace.endSection();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @CheckResult
    public final <V> io.reactivex.rxjava3.disposables.c B(Object obj, e1w<V> e1wVar, long j, io.reactivex.rxjava3.functions.f<V> fVar, io.reactivex.rxjava3.functions.f<Throwable> fVar2) {
        io.reactivex.rxjava3.core.x<V> j2;
        if (!i0q0.b()) {
            throw new IllegalStateException("this method should be called only from ui thread");
        }
        CountDownLatch countDownLatch = new CountDownLatch(1);
        AtomicReference atomicReference = new AtomicReference(null);
        e1wVar.getClass();
        e1wVar.a = pla.g(5, obj);
        synchronized (this.c) {
            j2 = j(e1wVar);
        }
        asu0 asu0Var = asu0.a;
        io.reactivex.rxjava3.disposables.c subscribe = new io.reactivex.rxjava3.internal.operators.single.o(j2.q(asu0Var.c()), new x8(new fo6(13, atomicReference, countDownLatch), 26)).m(asu0Var.d()).subscribe(fVar, fVar2);
        try {
            countDownLatch.await(j, TimeUnit.MILLISECONDS);
        } catch (InterruptedException unused) {
        }
        Object obj2 = atomicReference.get();
        if (obj2 != null) {
            try {
                fVar.accept(obj2);
            } finally {
                try {
                } finally {
                    try {
                    } finally {
                    }
                }
            }
        }
        return subscribe;
    }

    public final io.reactivex.rxjava3.internal.operators.single.c C(Object obj, e1w e1wVar) {
        io.reactivex.rxjava3.internal.operators.single.c cVar;
        e1wVar.d(obj);
        synchronized (this.c) {
            cVar = new io.reactivex.rxjava3.internal.operators.single.c(new z0w(0, this, e1wVar));
        }
        return cVar;
    }

    public final io.reactivex.rxjava3.disposables.c D(Object obj, le6 le6Var) {
        io.reactivex.rxjava3.disposables.c n;
        le6Var.d(obj);
        synchronized (this.c) {
            n = itg0.n(j(le6Var));
        }
        return n;
    }

    @ozl
    public final io.reactivex.rxjava3.internal.operators.single.b0 E(Object obj, e1w e1wVar) {
        io.reactivex.rxjava3.core.x j;
        e1wVar.d(obj);
        synchronized (this.c) {
            j = j(e1wVar);
        }
        return j.q(asu0.a.c()).m(io.reactivex.rxjava3.android.schedulers.a.b());
    }

    @CheckResult
    @ozl
    public final io.reactivex.rxjava3.internal.operators.single.b0 F(Object obj, le6 le6Var) {
        io.reactivex.rxjava3.core.x j;
        le6Var.d(obj);
        synchronized (this.c) {
            j = j(le6Var);
        }
        return j.q(asu0.a.c()).m(io.reactivex.rxjava3.android.schedulers.a.b());
    }

    @ozl
    public final void G(boolean z, boolean z2, whc.a aVar) {
        com.vk.metrics.eventtracking.b bVar = com.vk.metrics.eventtracking.b.a;
        el3 el3Var = Event.b;
        Event.a b2 = h5s.b("ImEngine.tryToRecover");
        b2.a(Boolean.valueOf(z), "clearCache");
        b2.a(Boolean.valueOf(z2), "createInMemoryDb");
        b2.c("reason", aVar.b());
        v2w.a(b2);
        bVar.k(b2.e());
        try {
            Trace.beginSection("ImEngine.tryToRecover");
            synchronized (this.c) {
                if (this.f) {
                    this.b.debug(new i9(28));
                    Trace.endSection();
                    return;
                }
                pzv r = r();
                if (z && !this.d) {
                    this.d = true;
                    this.f = true;
                    this.b.debug(new d1(18));
                    g(aVar);
                }
                if (z2 && !this.e) {
                    this.e = true;
                    this.f = true;
                    this.b.debug(new pd4(14));
                    r.getClass();
                    e(pzv.a(r, null, new ihl0.b(), 0L, null, null, -16385, -1, -1), EngineInvalidateSource.RECOVERING);
                }
                if (!this.f) {
                    this.b.debug(new ge0(9, this, r));
                }
                s3q0 s3q0Var = s3q0.a;
                Trace.endSection();
            }
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    @Override // xsna.llp
    public final io.reactivex.rxjava3.internal.operators.observable.m1 a() {
        return this.l.a();
    }

    public final void d() {
        boolean z;
        try {
            Trace.beginSection("ImEngine.isEnvironmentAlive");
            synchronized (this.c) {
                ImEnvironmentRunner imEnvironmentRunner = this.j;
                synchronized (imEnvironmentRunner.c) {
                    z = imEnvironmentRunner.g != ImEnvironmentRunner.State.SHUTDOWN;
                }
            }
            if (!z) {
                throw new IllegalStateException("ImEnvironment is not alive");
            }
        } finally {
            Trace.endSection();
        }
    }

    @ozl
    public final void e(zwi zwiVar, EngineInvalidateSource engineInvalidateSource) {
        pbw pbwVar;
        n2w g2;
        com.vk.metrics.eventtracking.b bVar = com.vk.metrics.eventtracking.b.a;
        el3 el3Var = Event.b;
        Event.a aVar = new Event.a();
        aVar.g("ImEngine.changeConfig");
        v2w.a(aVar);
        bVar.k(aVar.e());
        try {
            Trace.beginSection("ImEngine.changeConfig");
            pzv pzvVar = zwiVar instanceof pzv ? (pzv) zwiVar : null;
            int i = 3;
            this.b.debug(new sx2(pzvVar, i));
            if (pzvVar != null && (pbwVar = pzvVar.O) != null && (g2 = pbwVar.g()) != null) {
                g2.e(engineInvalidateSource, true);
            }
            synchronized (this.c) {
                if (!this.g) {
                    Trace.endSection();
                    return;
                }
                if (pzvVar == null) {
                    if (s()) {
                        m();
                    }
                    Trace.endSection();
                } else {
                    if (pzvVar.equals(r())) {
                        this.b.debug(new via(i));
                        if (!s()) {
                            l(pzvVar, plp.a.a);
                        }
                        Trace.endSection();
                        return;
                    }
                    if (s()) {
                        i(pzvVar, null, plp.a.a);
                    } else {
                        l(pzvVar, plp.a.a);
                        s3q0 s3q0Var = s3q0.a;
                    }
                    Trace.endSection();
                }
            }
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    @ozl
    public final void f(qdk qdkVar, EngineInvalidateSource engineInvalidateSource) {
        if (qdkVar != null && !(qdkVar instanceof UserCredentials)) {
            throw new IllegalArgumentException("credentials is of unsupported type. Got: " + qdkVar.getClass().getCanonicalName() + ". Expected: com.vk.im.engine.models.credentials.UserCredentials");
        }
        synchronized (this.c) {
            try {
                this.g = true;
                pzv r = r();
                UserCredentials m = r.m();
                int i = 2;
                if (qdkVar != null && m != null && s()) {
                    if (((UserCredentials) qdkVar).g() != m.g()) {
                        this.b.debug(new os0("user id", i));
                        e(r.b((UserCredentials) qdkVar, r.a.c), engineInvalidateSource);
                    } else if (!qdkVar.equals(m)) {
                        this.b.debug(new os0("[mutable provider] token change", i));
                        r.a.b.a = (UserCredentials) qdkVar;
                        r.O.g().e(engineInvalidateSource, false);
                    }
                    s3q0 s3q0Var = s3q0.a;
                    return;
                }
                this.b.debug(new os0("user id", i));
                e(r.b((UserCredentials) qdkVar, r.a.c), engineInvalidateSource);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @ozl
    public final void g(whc whcVar) {
        Throwable cause;
        this.b.debug(new qzg(whcVar, 25));
        com.vk.metrics.eventtracking.b bVar = com.vk.metrics.eventtracking.b.a;
        el3 el3Var = Event.b;
        Event.a b2 = h5s.b("ImEngine.clearCache");
        b2.c("reason", whcVar.b());
        v2w.a(b2);
        bVar.k(b2.e());
        String str = null;
        l5m l5mVar = new l5m(null, null, 3);
        String h = DevNullEventKey.CLEAR_CACHE.h();
        String b3 = whcVar.b();
        Throwable a2 = whcVar.a();
        String message = a2 != null ? a2.getMessage() : null;
        Throwable a3 = whcVar.a();
        String a4 = a3 != null ? qjg.a(a3) : null;
        Throwable a5 = whcVar.a();
        if (a5 != null && (cause = a5.getCause()) != null) {
            str = cause.getMessage();
        }
        l5mVar.g = new SchemeStat$TypeDevNullItem(h, null, b3, null, message, null, a4, null, str, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, NetError.ERR_UNEXPECTED_SECURITY_LIBRARY_STATUS, 3, null);
        l5mVar.q();
        try {
            Trace.beginSection("ImEngine.clearCache");
            synchronized (this.c) {
                h(whcVar);
                s3q0 s3q0Var = s3q0.a;
            }
        } finally {
            Trace.endSection();
        }
    }

    public final void h(whc whcVar) {
        Object failure;
        if (!r().h.J()) {
            i(r(), new a(r()), whcVar);
            return;
        }
        try {
            this.b.debug(new gc(12));
            n3w n3wVar = this.j.a;
            n3wVar.e();
            n3wVar.o.i("Clear cache#Reason: " + whcVar.b(), new kz0(23));
            ((bhl0) this.j.a.I0()).A();
            r().j.a();
            w(whcVar, true);
            this.b.debug(new x0(18));
            failure = s3q0.a;
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        Throwable a2 = Result.a(failure);
        if (a2 == null) {
            return;
        }
        this.b.debug(new flu(a2, 5));
        com.vk.metrics.eventtracking.b.a.a(new ImEngineInstantClearCacheException("ImEngine instant clear cache finished with error. Clear cache reason: " + whcVar, a2));
        i(r(), new a(r()), whcVar);
    }

    public final Future i(pzv pzvVar, a aVar, plp plpVar) {
        ImBgSyncMode d2;
        String b2;
        boolean z = s() || t();
        try {
            Trace.beginSection("ImEngine.getBgSyncMode");
            synchronized (this.c) {
                d2 = this.j.d();
            }
            Trace.endSection();
            try {
                Trace.beginSection("ImEngine.getBgSyncCause");
                synchronized (this.c) {
                    b2 = this.j.b();
                }
                if (b2 == null) {
                    b2 = "";
                }
                if (z) {
                    pzvVar.getClass();
                    m();
                }
                Future submit = aVar != null ? this.i.submit(aVar) : null;
                if (z) {
                    l(pzvVar, plpVar);
                    if (d2 != null) {
                        this.b.debug(new n0(17, d2, b2));
                        this.i.submit(new c(this.j, d2, b2));
                    }
                    this.h = q2w.b.a;
                }
                return submit;
            } finally {
            }
        } finally {
        }
    }

    public final <V> io.reactivex.rxjava3.core.x<V> j(e1w<V> e1wVar) {
        try {
            Trace.beginSection("ImEngine.dispatchSubmitCommandAsyncRx");
            synchronized (this.c) {
                q2w q2wVar = this.h;
                if (!(q2wVar instanceof q2w.a)) {
                    return this.j.k(e1wVar);
                }
                q2w.a aVar = (q2w.a) q2wVar;
                mla mlaVar = e1wVar.a;
                if (mlaVar == null) {
                    mlaVar = null;
                }
                ImEngineUnrecoverableException imEngineUnrecoverableException = aVar.a;
                nr2.L(imEngineUnrecoverableException, mlaVar.b());
                com.vk.metrics.eventtracking.b.a.a(imEngineUnrecoverableException);
                return this.j.k(new ejq(((q2w.a) q2wVar).a, e1wVar));
            }
        } finally {
            Trace.endSection();
        }
    }

    public final <V> pdg0<V> k(e1w<V> e1wVar, long j) {
        io.reactivex.rxjava3.core.x<V> j2;
        synchronized (this.c) {
            try {
                mla mlaVar = e1wVar.a;
                if (mlaVar == null) {
                    mlaVar = null;
                }
                hz3.a(mlaVar, sv1.o(e1wVar), Collections.singletonList(Thread.currentThread().getName()));
                mla mlaVar2 = e1wVar.a;
                if (mlaVar2 == null) {
                    mlaVar2 = null;
                }
                hz3.b(mlaVar2);
                if (j > 0) {
                    j2 = j(e1wVar).r(j, TimeUnit.MILLISECONDS);
                } else {
                    if (i0q0.b()) {
                        com.vk.metrics.eventtracking.b.a.q(new IllegalStateException("Blocking call on UI thread. Should be called with timeout"));
                    }
                    j2 = j(e1wVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return (pdg0) new io.reactivex.rxjava3.internal.operators.single.d0(j2.l(new fr(new f1s(3), 21)), new m40(e1wVar, 19), null).c();
    }

    public final void l(pzv pzvVar, plp plpVar) {
        this.b.debug(new r12(7));
        n3w n3wVar = new n3w(pzvVar);
        n3wVar.w = this.k;
        n3wVar.v = this.l;
        this.h = q2w.d.a;
        this.m = pzvVar;
        this.j = new ImEnvironmentRunner(n3wVar, this.b);
        this.i.submit(new d(this.j, plpVar));
    }

    public final Future m() {
        this.b.debug(new ee4(18));
        this.h = q2w.e.a;
        return this.i.submit(new f(this.j));
    }

    @CheckResult
    public final pdg0 n(Object obj, le6 le6Var) {
        Object failure;
        try {
            le6Var.d(obj);
            failure = k(le6Var, i0q0.b() ? r().H : 0L);
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        Throwable a2 = Result.a(failure);
        if (a2 != null) {
            failure = new pdg0.a(new pdg0.a.C3506a(obj.toString(), a2));
        }
        return (pdg0) failure;
    }

    @CheckResult
    public final <V> pdg0<V> o(Object obj, e1w<V> e1wVar, long j) {
        Object failure;
        try {
            e1wVar.getClass();
            e1wVar.a = pla.g(5, obj);
            failure = k(e1wVar, j);
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        Throwable a2 = Result.a(failure);
        if (a2 != null) {
            failure = new pdg0.a(new pdg0.a.C3506a(obj.toString(), a2));
        }
        return (pdg0) failure;
    }

    public final ixv p() {
        ixv e2;
        try {
            Trace.beginSection("ImEngine.getBgSyncState");
            synchronized (this.c) {
                e2 = this.j.e();
            }
            return e2;
        } finally {
            Trace.endSection();
        }
    }

    public final Peer q() {
        Peer user;
        try {
            Trace.beginSection("ImEngine.currentMember");
            synchronized (this.c) {
                pzv r = r();
                UserCredentials m = r.m();
                if (m == null) {
                    return Peer.Unknown.e;
                }
                Peer peer = r.a.c;
                peer.getClass();
                if (peer.Ab(Peer.Type.GROUP)) {
                    Serializer.c<Peer> cVar = Peer.CREATOR;
                    user = Peer.a.c(peer.d);
                } else {
                    Serializer.c<Peer> cVar2 = Peer.CREATOR;
                    user = new Peer.User(m.g());
                }
                return user;
            }
        } finally {
            Trace.endSection();
        }
    }

    public final pzv r() {
        pzv pzvVar;
        try {
            Trace.beginSection("ImEngine.getLatestConfig");
            synchronized (this.c) {
                pzvVar = this.m;
            }
            return pzvVar;
        } finally {
            Trace.endSection();
        }
    }

    public final boolean s() {
        boolean z;
        try {
            Trace.beginSection("ImEngine.isEnvironmentStartingOrStarted");
            q2w q2wVar = this.h;
            if (q2wVar != q2w.d.a && q2wVar != q2w.c.a) {
                if (q2wVar != q2w.b.a) {
                    z = false;
                    return z;
                }
            }
            z = true;
            return z;
        } finally {
            Trace.endSection();
        }
    }

    public final boolean t() {
        boolean z;
        try {
            Trace.beginSection("ImEngine.isFailedOnStart");
            synchronized (this.c) {
                q2w q2wVar = this.h;
                if (q2wVar instanceof q2w.a) {
                    z = ((q2w.a) q2wVar).b;
                }
            }
            return z;
        } finally {
            Trace.endSection();
        }
    }

    public final boolean u() {
        boolean g2;
        try {
            Trace.beginSection("ImEngine.isHasCredentials");
            synchronized (this.c) {
                g2 = this.j.g();
            }
            return g2;
        } finally {
            Trace.endSection();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0053 A[Catch: all -> 0x0047, TRY_LEAVE, TryCatch #0 {all -> 0x0047, blocks: (B:6:0x0031, B:8:0x003e, B:12:0x004d, B:14:0x0053, B:20:0x0049), top: B:5:0x0031, outer: #1 }] */
    @ozl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Future<?> v(boolean z) {
        Future<?> m;
        com.vk.metrics.eventtracking.b bVar = com.vk.metrics.eventtracking.b.a;
        el3 el3Var = Event.b;
        Event.a b2 = h5s.b("ImEngine.logout");
        b2.a(Boolean.valueOf(z), "fullCleanup");
        v2w.a(b2);
        bVar.k(b2.e());
        this.b.debug(new te0(21));
        try {
            Trace.beginSection("ImEngine.logout");
            synchronized (this.c) {
                try {
                    cau0 cau0Var = r().h;
                    if (!s() && !t()) {
                        m = null;
                        w(null, false);
                        if (z) {
                            m = this.i.submit(new a(r()));
                        }
                    }
                    m = m();
                    w(null, false);
                    if (z) {
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return m;
        } finally {
            Trace.endSection();
        }
    }

    public final void w(plp plpVar, final boolean z) {
        this.b.debug(new gzs() { // from class: xsna.y0w
            @Override // xsna.gzs
            public final Object invoke() {
                return zhy0.a("#notifyEngineInvalidate - hasCredentials: ", z);
            }
        });
        x(new p680(plpVar, z));
    }

    public final void x(sxp sxpVar) {
        zxp zxpVar = this.l;
        zxpVar.getClass();
        sxpVar.getClass();
        sxpVar.a = pla.g(4, this);
        ((io.reactivex.rxjava3.subjects.h) zxpVar.a).onNext(sxpVar);
    }

    @ozl
    public final void y() {
        com.vk.metrics.eventtracking.b bVar = com.vk.metrics.eventtracking.b.a;
        el3 el3Var = Event.b;
        Event.a aVar = new Event.a();
        aVar.g("ImEngine.restart");
        v2w.a(aVar);
        bVar.k(aVar.e());
        try {
            Trace.beginSection("ImEngine.restart");
            synchronized (this.c) {
                try {
                    if (this.g) {
                        this.b.debug(new p5h(this, 25));
                        if (s()) {
                            i(r(), null, plp.b.a);
                        } else {
                            l(r(), plp.b.a);
                            s3q0 s3q0Var = s3q0.a;
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } finally {
            Trace.endSection();
        }
    }

    @ozl
    public final void z(ImBgSyncMode imBgSyncMode, String str) {
        this.b.debug(new fbh(str, 27));
        try {
            Trace.beginSection("ImEngine.startBgSync");
            synchronized (this.c) {
                d();
                this.b.debug(new n0(17, imBgSyncMode, str));
                this.i.submit(new c(this.j, imBgSyncMode, str));
                s3q0 s3q0Var = s3q0.a;
            }
        } finally {
            Trace.endSection();
        }
    }
}
