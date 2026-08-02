package xsna;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.util.SparseIntArray;
import androidx.annotation.NonNull;
import androidx.fragment.app.FragmentActivity;
import com.google.firebase.perf.metrics.Trace;
import com.google.firebase.perf.session.SessionManager;
import com.google.firebase.perf.util.Constants$CounterNames;
import com.google.firebase.perf.util.Constants$TraceNames;
import com.google.firebase.perf.util.Timer;
import com.google.firebase.perf.v1.ApplicationProcessState;
import com.google.firebase.perf.v1.i;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import xsna.nfs;

/* compiled from: AppStateMonitor.java */
/* loaded from: classes13.dex */
public final class u93 implements Application.ActivityLifecycleCallbacks {
    public static final ra2 s = ra2.d();
    public static volatile u93 t;
    public final WeakHashMap<Activity, Boolean> b;
    public final WeakHashMap<Activity, pfs> c;
    public final WeakHashMap<Activity, zcs> d;
    public final WeakHashMap<Activity, Trace> e;
    public final HashMap f;
    public final HashSet g;
    public final HashSet h;
    public final AtomicInteger i;
    public final xop0 j;
    public final txi k;
    public final bvf l;
    public final boolean m;
    public Timer n;
    public Timer o;
    public ApplicationProcessState p;
    public boolean q;
    public boolean r;

    /* compiled from: AppStateMonitor.java */
    public interface a {
        void a();
    }

    /* compiled from: AppStateMonitor.java */
    public interface b {
        void onUpdateAppState(ApplicationProcessState applicationProcessState);
    }

    public u93(xop0 xop0Var, bvf bvfVar) {
        txi e = txi.e();
        ra2 ra2Var = pfs.e;
        this.b = new WeakHashMap<>();
        this.c = new WeakHashMap<>();
        this.d = new WeakHashMap<>();
        this.e = new WeakHashMap<>();
        this.f = new HashMap();
        this.g = new HashSet();
        this.h = new HashSet();
        this.i = new AtomicInteger(0);
        this.p = ApplicationProcessState.BACKGROUND;
        this.q = false;
        this.r = true;
        this.j = xop0Var;
        this.l = bvfVar;
        this.k = e;
        this.m = true;
    }

    public static u93 a() {
        if (t == null) {
            synchronized (u93.class) {
                try {
                    if (t == null) {
                        t = new u93(xop0.t, new bvf());
                    }
                } finally {
                }
            }
        }
        return t;
    }

    public final void b(@NonNull String str) {
        synchronized (this.f) {
            try {
                Long l = (Long) this.f.get(str);
                if (l == null) {
                    this.f.put(str, 1L);
                } else {
                    this.f.put(str, Long.valueOf(l.longValue() + 1));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final synchronized void c(Context context) {
        if (this.q) {
            return;
        }
        Context applicationContext = context.getApplicationContext();
        if (applicationContext instanceof Application) {
            ((Application) applicationContext).registerActivityLifecycleCallbacks(this);
            this.q = true;
        }
    }

    public final void d(ljr ljrVar) {
        synchronized (this.h) {
            this.h.add(ljrVar);
        }
    }

    public final void e(Activity activity) {
        kt80<ofs> kt80Var;
        WeakHashMap<Activity, Trace> weakHashMap = this.e;
        Trace trace = weakHashMap.get(activity);
        if (trace == null) {
            return;
        }
        weakHashMap.remove(activity);
        pfs pfsVar = this.c.get(activity);
        nfs nfsVar = pfsVar.b;
        HashMap hashMap = pfsVar.c;
        ra2 ra2Var = pfs.e;
        if (pfsVar.d) {
            if (!hashMap.isEmpty()) {
                ra2Var.a();
                hashMap.clear();
            }
            kt80<ofs> a2 = pfsVar.a();
            try {
                nfsVar.a(pfsVar.a);
            } catch (IllegalArgumentException | NullPointerException e) {
                if ((e instanceof NullPointerException) && Build.VERSION.SDK_INT > 28) {
                    throw e;
                }
                ra2Var.i("View not hardware accelerated. Unable to collect FrameMetrics. %s", e.toString());
                a2 = new kt80<>();
            }
            nfs.a aVar = nfsVar.a;
            SparseIntArray[] sparseIntArrayArr = aVar.b;
            aVar.b = new SparseIntArray[9];
            pfsVar.d = false;
            kt80Var = a2;
        } else {
            ra2Var.a();
            kt80Var = new kt80<>();
        }
        if (kt80Var.b()) {
            edh0.a(trace, kt80Var.a());
            trace.stop();
        } else {
            s.i("Failed to record frame data for %s.", activity.getClass().getSimpleName());
        }
    }

    public final void f(String str, Timer timer, Timer timer2) {
        if (this.k.o()) {
            i.b z = com.google.firebase.perf.v1.i.z();
            z.p(str);
            z.n(timer.b);
            z.o(timer.e(timer2));
            z.d(SessionManager.getInstance().perfSession().d());
            int andSet = this.i.getAndSet(0);
            synchronized (this.f) {
                try {
                    z.g(this.f);
                    if (andSet != 0) {
                        z.m(andSet, Constants$CounterNames.TRACE_STARTED_NOT_STOPPED.toString());
                    }
                    this.f.clear();
                } catch (Throwable th) {
                    throw th;
                }
            }
            this.j.e(z.build(), ApplicationProcessState.FOREGROUND_BACKGROUND);
        }
    }

    public final void g(Activity activity) {
        if (this.m && this.k.o()) {
            pfs pfsVar = new pfs(activity);
            this.c.put(activity, pfsVar);
            if (activity instanceof FragmentActivity) {
                zcs zcsVar = new zcs(this.l, this.j, this, pfsVar);
                this.d.put(activity, zcsVar);
                ((FragmentActivity) activity).getSupportFragmentManager().c0(zcsVar, true);
            }
        }
    }

    public final void h(ApplicationProcessState applicationProcessState) {
        this.p = applicationProcessState;
        synchronized (this.g) {
            try {
                Iterator it = this.g.iterator();
                while (it.hasNext()) {
                    b bVar = (b) ((WeakReference) it.next()).get();
                    if (bVar != null) {
                        bVar.onUpdateAppState(this.p);
                    } else {
                        it.remove();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        g(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        this.c.remove(activity);
        WeakHashMap<Activity, zcs> weakHashMap = this.d;
        if (weakHashMap.containsKey(activity)) {
            ((FragmentActivity) activity).getSupportFragmentManager().r0(weakHashMap.remove(activity));
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final synchronized void onActivityResumed(Activity activity) {
        if (this.b.isEmpty()) {
            this.l.getClass();
            this.n = new Timer();
            this.b.put(activity, Boolean.TRUE);
            if (this.r) {
                h(ApplicationProcessState.FOREGROUND);
                synchronized (this.h) {
                    try {
                        Iterator it = this.h.iterator();
                        while (it.hasNext()) {
                            a aVar = (a) it.next();
                            if (aVar != null) {
                                aVar.a();
                            }
                        }
                    } finally {
                    }
                }
                this.r = false;
            } else {
                f(Constants$TraceNames.BACKGROUND_TRACE_NAME.toString(), this.o, this.n);
                h(ApplicationProcessState.FOREGROUND);
            }
        } else {
            this.b.put(activity, Boolean.TRUE);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final synchronized void onActivityStarted(Activity activity) {
        try {
            if (this.m && this.k.o()) {
                if (!this.c.containsKey(activity)) {
                    g(activity);
                }
                this.c.get(activity).b();
                Trace trace = new Trace("_st_".concat(activity.getClass().getSimpleName()), this.j, this.l, this);
                trace.start();
                this.e.put(activity, trace);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final synchronized void onActivityStopped(Activity activity) {
        try {
            if (this.m) {
                e(activity);
            }
            if (this.b.containsKey(activity)) {
                this.b.remove(activity);
                if (this.b.isEmpty()) {
                    this.l.getClass();
                    this.o = new Timer();
                    f(Constants$TraceNames.FOREGROUND_TRACE_NAME.toString(), this.n, this.o);
                    h(ApplicationProcessState.BACKGROUND);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }
}
