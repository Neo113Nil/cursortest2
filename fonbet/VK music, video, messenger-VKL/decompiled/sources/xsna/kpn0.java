package xsna;

import android.content.Context;
import android.content.Intent;
import android.os.Looper;
import android.os.PowerManager;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.work.impl.background.systemalarm.SystemAlarmService;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;
import xsna.hwx0;

/* compiled from: SystemAlarmDispatcher.java */
/* loaded from: classes12.dex */
public final class kpn0 implements e3q {
    public static final String l = m100.d("SystemAlarmDispatcher");
    public final Context b;
    public final r5o0 c;
    public final gyx0 d;
    public final ohd0 e;
    public final dwx0 f;
    public final dag g;
    public final ArrayList h;
    public Intent i;

    @Nullable
    public SystemAlarmService j;
    public final xvx0 k;

    /* compiled from: SystemAlarmDispatcher.java */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            hwx0.a c;
            c cVar;
            synchronized (kpn0.this.h) {
                kpn0 kpn0Var = kpn0.this;
                kpn0Var.i = (Intent) kpn0Var.h.get(0);
            }
            Intent intent = kpn0.this.i;
            if (intent != null) {
                String action = intent.getAction();
                int intExtra = kpn0.this.i.getIntExtra("KEY_START_ID", 0);
                m100 c2 = m100.c();
                String str = kpn0.l;
                Objects.toString(kpn0.this.i);
                c2.getClass();
                PowerManager.WakeLock a = z8x0.a(kpn0.this.b, action + " (" + intExtra + ")");
                try {
                    m100 c3 = m100.c();
                    a.toString();
                    c3.getClass();
                    a.acquire();
                    kpn0 kpn0Var2 = kpn0.this;
                    kpn0Var2.g.a(intExtra, kpn0Var2.i, kpn0Var2);
                    m100 c4 = m100.c();
                    a.toString();
                    c4.getClass();
                    a.release();
                    c = kpn0.this.c.c();
                    cVar = new c(kpn0.this);
                } catch (Throwable th) {
                    try {
                        m100.c().b(kpn0.l, "Unexpected error in onHandleIntent", th);
                        m100 c5 = m100.c();
                        a.toString();
                        c5.getClass();
                        a.release();
                        c = kpn0.this.c.c();
                        cVar = new c(kpn0.this);
                    } catch (Throwable th2) {
                        m100 c6 = m100.c();
                        String str2 = kpn0.l;
                        a.toString();
                        c6.getClass();
                        a.release();
                        kpn0.this.c.c().execute(new c(kpn0.this));
                        throw th2;
                    }
                }
                c.execute(cVar);
            }
        }
    }

    /* compiled from: SystemAlarmDispatcher.java */
    public static class b implements Runnable {
        public final kpn0 b;
        public final Intent c;
        public final int d;

        public b(int i, @NonNull Intent intent, @NonNull kpn0 kpn0Var) {
            this.b = kpn0Var;
            this.c = intent;
            this.d = i;
        }

        @Override // java.lang.Runnable
        public final void run() {
            Intent intent = this.c;
            this.b.a(this.d, intent);
        }
    }

    /* compiled from: SystemAlarmDispatcher.java */
    public static class c implements Runnable {
        public final kpn0 b;

        public c(@NonNull kpn0 kpn0Var) {
            this.b = kpn0Var;
        }

        @Override // java.lang.Runnable
        public final void run() {
            boolean isEmpty;
            boolean isEmpty2;
            kpn0 kpn0Var = this.b;
            m100.c().getClass();
            kpn0.c();
            synchronized (kpn0Var.h) {
                try {
                    if (kpn0Var.i != null) {
                        m100 c = m100.c();
                        Objects.toString(kpn0Var.i);
                        c.getClass();
                        if (!((Intent) kpn0Var.h.remove(0)).equals(kpn0Var.i)) {
                            throw new IllegalStateException("Dequeue-d command is not the first.");
                        }
                        kpn0Var.i = null;
                    }
                    emi0 d = kpn0Var.c.d();
                    dag dagVar = kpn0Var.g;
                    synchronized (dagVar.d) {
                        isEmpty = dagVar.c.isEmpty();
                    }
                    if (isEmpty && kpn0Var.h.isEmpty()) {
                        synchronized (d.e) {
                            isEmpty2 = d.b.isEmpty();
                        }
                        if (isEmpty2) {
                            m100.c().getClass();
                            SystemAlarmService systemAlarmService = kpn0Var.j;
                            if (systemAlarmService != null) {
                                systemAlarmService.a();
                            }
                        }
                    }
                    if (!kpn0Var.h.isEmpty()) {
                        kpn0Var.d();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public kpn0(@NonNull SystemAlarmService systemAlarmService) {
        Context applicationContext = systemAlarmService.getApplicationContext();
        this.b = applicationContext;
        dpn0 dpn0Var = new dpn0(new uqk0());
        dwx0 h = dwx0.h(systemAlarmService);
        this.f = h;
        this.g = new dag(applicationContext, h.b.d, dpn0Var);
        this.d = new gyx0(h.b.g);
        ohd0 ohd0Var = h.f;
        this.e = ohd0Var;
        hwx0 hwx0Var = h.d;
        this.c = hwx0Var;
        this.k = new zvx0(ohd0Var, hwx0Var);
        ohd0Var.a(this);
        this.h = new ArrayList();
        this.i = null;
    }

    public static void c() {
        if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
            throw new IllegalStateException("Needs to be invoked on the main thread.");
        }
    }

    public final void a(int i, @NonNull Intent intent) {
        m100 c2 = m100.c();
        Objects.toString(intent);
        c2.getClass();
        c();
        String action = intent.getAction();
        if (TextUtils.isEmpty(action)) {
            m100.c().getClass();
            return;
        }
        if ("ACTION_CONSTRAINTS_CHANGED".equals(action)) {
            c();
            synchronized (this.h) {
                try {
                    Iterator it = this.h.iterator();
                    while (it.hasNext()) {
                        if ("ACTION_CONSTRAINTS_CHANGED".equals(((Intent) it.next()).getAction())) {
                            return;
                        }
                    }
                } finally {
                }
            }
        }
        intent.putExtra("KEY_START_ID", i);
        synchronized (this.h) {
            try {
                boolean isEmpty = this.h.isEmpty();
                this.h.add(intent);
                if (isEmpty) {
                    d();
                }
            } finally {
            }
        }
    }

    @Override // xsna.e3q
    public final void b(@NonNull svx0 svx0Var, boolean z) {
        hwx0.a c2 = this.c.c();
        String str = dag.g;
        Intent intent = new Intent(this.b, (Class<?>) SystemAlarmService.class);
        intent.setAction("ACTION_EXECUTION_COMPLETED");
        intent.putExtra("KEY_NEEDS_RESCHEDULE", z);
        dag.d(intent, svx0Var);
        c2.execute(new b(0, intent, this));
    }

    public final void d() {
        c();
        PowerManager.WakeLock a2 = z8x0.a(this.b, "ProcessCommand");
        try {
            a2.acquire();
            this.f.d.b(new a());
        } finally {
            a2.release();
        }
    }
}
