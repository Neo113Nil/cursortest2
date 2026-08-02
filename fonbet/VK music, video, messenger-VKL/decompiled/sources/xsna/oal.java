package xsna;

import android.content.Context;
import android.content.Intent;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.Looper;
import com.vk.instantjobs.components.appstate.AppState;
import com.vk.instantjobs.exceptions.JobCauseException;
import com.vk.instantjobs.services.JobsBackgroundService;
import com.vk.instantjobs.services.JobsForegroundService;
import com.vk.instantjobs.utils.BatteryLevelDetector;
import com.vk.instantjobs.utils.BgDataRestrictionDetector;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;
import xsna.r93;

/* compiled from: DefaultAppStateDetector.kt */
/* loaded from: classes.dex */
public final class oal implements r93 {
    public static final Handler j = new Handler(Looper.getMainLooper());
    public static final long k;
    public static final Object l;
    public static final long m;
    public static final Object n;
    public final Context a;
    public final pla b;
    public final u7s c;
    public final BatteryLevelDetector e;
    public final BgDataRestrictionDetector f;
    public final p7s d = new p7s(new fd9(this, 1));
    public final my6 g = new my6(new mal(this, 0));
    public AppState h = AppState.IDLE;
    public final CopyOnWriteArrayList<r93.a> i = new CopyOnWriteArrayList<>();

    static {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        k = timeUnit.toMillis(50L);
        l = new Object();
        m = timeUnit.toMillis(5L);
        n = new Object();
    }

    public oal(Context context, pla plaVar) {
        this.a = context;
        this.b = plaVar;
        this.c = new u7s(context, new jal(this, 0));
        int i = 0;
        this.e = new BatteryLevelDetector(context, new kal(this, i));
        this.f = new BgDataRestrictionDetector(context, new lal(this, i));
    }

    public static JobCauseException d(AppState appState, AppState appState2) {
        String str = "Migrate from state " + appState + " to " + appState2;
        if (prw.c) {
            return null;
        }
        return new JobCauseException(str);
    }

    public static void i() {
        j.removeCallbacksAndMessages(n);
    }

    public static void j() {
        j.removeCallbacksAndMessages(l);
    }

    @Override // xsna.r93
    public final void a(r93.a aVar) {
        this.i.remove(aVar);
    }

    @Override // xsna.r93
    public final void b(r93.a aVar) {
        this.i.add(aVar);
    }

    public final synchronized void c(AppState appState, wzs<? super AppState, ? super AppState, s3q0> wzsVar) {
        AppState appState2 = this.h;
        if (appState2 != appState) {
            this.h = appState;
            wzsVar.invoke(appState2, appState);
            j.post(new nal(this, appState));
        }
    }

    public final synchronized void e() {
        try {
            boolean isEmpty = this.c.b.isEmpty();
            this.d.getClass();
            Handler handler = com.vk.instantjobs.services.a.a;
            boolean z = JobsForegroundService.h;
            this.g.getClass();
            wyx wyxVar = wyx.a;
            boolean z2 = wyx.c;
            boolean z3 = this.e.b == BatteryLevelDetector.Level.NORMAL;
            boolean z4 = this.f.c;
            boolean z5 = this.h != AppState.IDLE;
            if (!isEmpty) {
                synchronized (this) {
                    AppState appState = AppState.FOREGROUND_UI;
                    synchronized (this) {
                        AppState appState2 = this.h;
                        if (appState2 != appState) {
                            this.h = appState;
                            j();
                            i();
                            g(appState, d(appState2, appState));
                            s3q0 s3q0Var = s3q0.a;
                            j.post(new nal(this, appState));
                        }
                    }
                }
            } else if (z) {
                synchronized (this) {
                    AppState appState3 = AppState.FOREGROUND_SERVICE;
                    synchronized (this) {
                        AppState appState4 = this.h;
                        if (appState4 != appState3) {
                            this.h = appState3;
                            j();
                            i();
                            g(appState3, d(appState4, appState3));
                            s3q0 s3q0Var2 = s3q0.a;
                            j.post(new nal(this, appState3));
                        }
                    }
                }
            } else if (z2) {
                if (!z3 || z4) {
                    f();
                } else {
                    synchronized (this) {
                        c(AppState.BACKGROUND, new com.vk.movika.tools.controls.seekbar.i(this, 8));
                    }
                }
            } else if (z5) {
                f();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void f() {
        c(AppState.SUSPENDING, new com.vk.movika.tools.controls.seekbar.h(this, 3));
    }

    public final void g(AppState appState, Throwable th) {
        try {
            wyx wyxVar = wyx.a;
            Context context = this.a;
            synchronized (wyxVar) {
                int i = JobsBackgroundService.b;
                context.startService(new Intent(context, (Class<?>) JobsBackgroundService.class));
            }
        } catch (Throwable th2) {
            m63.k(th2, th);
            this.b.b("unable to start background service (currentState=" + appState + "). Maybe app running in background?", th2);
        }
    }

    @Override // xsna.r93
    public final synchronized AppState getState() {
        return this.h;
    }

    public final void h(AppState appState, JobCauseException jobCauseException) {
        try {
            wyx wyxVar = wyx.a;
            Context context = this.a;
            synchronized (wyxVar) {
                int i = JobsBackgroundService.b;
                try {
                    context.stopService(new Intent(context, (Class<?>) JobsBackgroundService.class));
                } catch (DeadObjectException unused) {
                    wyx.a.a(false);
                }
            }
        } catch (Throwable th) {
            m63.k(th, jobCauseException);
            this.b.d("unable to stop background service (currentState=" + appState + ')', th);
        }
    }
}
