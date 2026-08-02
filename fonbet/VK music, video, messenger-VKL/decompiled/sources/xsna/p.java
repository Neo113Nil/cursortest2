package xsna;

import android.content.Context;
import android.os.ConditionVariable;
import android.os.Debug;
import android.os.Handler;
import android.os.Looper;
import com.vk.core.preference.Preference;
import com.vk.core.ui.tracking.UiTracker;
import com.vk.lifecycle.ProcessStateProvider;
import com.vk.log.L;
import com.vk.log.LoggerOutputTarget;
import com.vk.metrics.performance.anr.AnrException;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import java.lang.Thread;
import java.util.Iterator;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import xsna.p;

/* compiled from: ANR.kt */
/* loaded from: classes.dex */
public final class p {
    public volatile boolean a;
    public volatile long b;
    public volatile boolean c;
    public final Handler d;

    /* compiled from: ANR.kt */
    public class a extends aw90 implements Runnable {
        public final long b;
        public final boolean c;
        public final bpn0 d = new bpn0(new m(0));
        public final AtomicLong e = new AtomicLong(0);
        public final ConditionVariable f = new ConditionVariable();
        public Future<?> g;
        public boolean h;

        public a(long j, boolean z) {
            this.b = j;
            this.c = z;
        }

        @Override // xsna.aw90
        public final void a() {
            L l = L.a;
            l.getClass();
            LoggerOutputTarget loggerOutputTarget = LoggerOutputTarget.NONE;
            boolean m = L.m(loggerOutputTarget);
            long j = this.b;
            if (!m) {
                L.u(l, L.LogType.d, new Object[]{"AnrChecker", qlb0.a(j, "Try to start ANR checker (threshold ", "ms).")});
            }
            if (this.h) {
                l.getClass();
                if (L.m(loggerOutputTarget)) {
                    return;
                }
                L.u(l, L.LogType.d, new Object[]{"AnrChecker", qlb0.a(j, "ANR checker (threshold ", "ms) already started. Do nothing.")});
                return;
            }
            this.g = ((ExecutorService) this.d.getValue()).submit(new Runnable() { // from class: xsna.n
                @Override // java.lang.Runnable
                public final void run() {
                    final p.a aVar = p.a.this;
                    if (aVar.e.get() > 0) {
                        L l2 = L.a;
                        l2.getClass();
                        if (L.m(LoggerOutputTarget.NONE)) {
                            return;
                        }
                        L.u(l2, L.LogType.d, new Object[]{"AnrChecker", efz.b(aVar.b, "ms) counter <= 0. Do not start.", new StringBuilder("ANR checker (threshold "))});
                        return;
                    }
                    if (p.this.a) {
                        L l3 = L.a;
                        l3.getClass();
                        if (L.m(LoggerOutputTarget.NONE)) {
                            return;
                        }
                        L.u(l3, L.LogType.d, new Object[]{"AnrChecker", efz.b(aVar.b, "ms) is interrupted. Do not start.", new StringBuilder("ANR checker (threshold "))});
                        return;
                    }
                    aVar.f.close();
                    aVar.e.incrementAndGet();
                    ExecutorService executorService = (ExecutorService) aVar.d.getValue();
                    final p pVar = p.this;
                    executorService.execute(new Runnable() { // from class: xsna.o
                        @Override // java.lang.Runnable
                        public final void run() {
                            AnrException anrException;
                            String str;
                            ProcessStateProvider.ProcessState a;
                            String name;
                            MobileOfficialAppsCoreNavStat$EventScreen c;
                            p pVar2 = p.this;
                            p.a aVar2 = aVar;
                            while (!pVar2.a && !Debug.isDebuggerConnected()) {
                                long j2 = aVar2.e.get();
                                pVar2.d.postAtFrontOfQueue(aVar2);
                                long j3 = aVar2.b;
                                long j4 = aVar2.c ? pVar2.b : 0L;
                                boolean z = pVar2.c;
                                pVar2.b = 0L;
                                aVar2.f.block(j3 - j4);
                                if (!pVar2.a && j2 == aVar2.e.get()) {
                                    try {
                                        Thread thread = Looper.getMainLooper().getThread();
                                        anrException = new AnrException(o1q.a());
                                        try {
                                            anrException.setStackTrace(thread.getStackTrace());
                                        } catch (Exception unused) {
                                        }
                                    } catch (Exception unused2) {
                                        anrException = null;
                                    }
                                    if (anrException != null) {
                                        ow90 ow90Var = ow90.a;
                                        long j5 = aVar2.b;
                                        dx90 dx90Var = ow90.e;
                                        L.l(qlb0.a(j5, "ERROR: <<<==== ANR ====>>> on main thread with ", " ms"));
                                        if (j5 == 4000) {
                                            com.vk.metrics.eventtracking.b.a.a(anrException);
                                        } else if (j5 == 5000) {
                                            if (z) {
                                                dx90Var.getClass();
                                                Preference.I("performance", "__app_performance_early_anr_last_session__", true);
                                            } else {
                                                String d = anrException.d();
                                                String str2 = "";
                                                if (ow90.m == null || (c = UiTracker.c()) == null || (str = c.name()) == null) {
                                                    str = "";
                                                }
                                                ProcessStateProvider processStateProvider = ow90.o;
                                                if (processStateProvider != null && (a = processStateProvider.a()) != null && (name = a.name()) != null) {
                                                    str2 = name;
                                                }
                                                if (dx90Var.p()) {
                                                    Preference.a.getClass();
                                                    Context context = Preference.b;
                                                    dx90.z(context != null ? context : null, "performance_anr_info", new jl6(d, str, str2, 8));
                                                    dx90.s();
                                                } else {
                                                    Preference.I("performance", "__app_performance_has_anr__", true);
                                                    Preference.H("performance", "__app_performance_anr_id__", d);
                                                    Preference.H("performance", "__app_performance_anr_screnn__", str);
                                                    Preference.H("performance", "__app_performance_anr_importance__", str2);
                                                    dx90.s();
                                                }
                                                Iterator<T> it = ow90.i.iterator();
                                                while (it.hasNext()) {
                                                    ((wzs) it.next()).invoke(Long.valueOf(j5), anrException);
                                                }
                                                com.vk.metrics.eventtracking.b.a.a(anrException);
                                            }
                                        }
                                        pVar2.a = !pVar2.c;
                                    }
                                }
                            }
                        }
                    });
                    L.e(efz.b(aVar.b, "ms) started.", new StringBuilder("ANR checker (threshold ")));
                }
            });
            this.h = true;
            l.getClass();
            if (L.m(loggerOutputTarget)) {
                return;
            }
            L.u(l, L.LogType.d, new Object[]{"AnrChecker", qlb0.a(j, "ANR checker (threshold ", "ms) submitted for start.")});
        }

        @Override // xsna.aw90
        public final void b() {
            StringBuilder sb = new StringBuilder("Try to stop ANR checker (threshold ");
            long j = this.b;
            L.e(efz.b(j, "ms).", sb));
            Future<?> future = this.g;
            if (future != null) {
                future.cancel(true);
            }
            this.f.open();
            p.this.d.removeCallbacksAndMessages(this);
            this.e.set(0L);
            this.h = false;
            L.e(qlb0.a(j, "ANR checker (threshold ", "ms) stopped."));
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (!p.this.a) {
                this.e.set(this.e.incrementAndGet() % Long.MAX_VALUE);
                return;
            }
            L l = L.a;
            l.getClass();
            if (L.m(LoggerOutputTarget.NONE)) {
                return;
            }
            L.u(l, L.LogType.d, new Object[]{"AnrChecker", efz.b(this.b, "ms) is interrupted. Skip Runnable execution on main thread.", new StringBuilder("ANR checker (threshold "))});
        }
    }

    /* compiled from: ANR.kt */
    public final class b implements Thread.UncaughtExceptionHandler {
        public final y370 a;

        public b() {
            AtomicBoolean atomicBoolean = d4k.a;
            this.a = y370.a;
        }

        @Override // java.lang.Thread.UncaughtExceptionHandler
        public final void uncaughtException(Thread thread, Throwable th) {
            p.this.a = true;
            this.a.getClass();
        }
    }

    public p() {
        ow90 ow90Var = ow90.a;
        this.c = true;
        this.d = new Handler(Looper.getMainLooper());
    }
}
