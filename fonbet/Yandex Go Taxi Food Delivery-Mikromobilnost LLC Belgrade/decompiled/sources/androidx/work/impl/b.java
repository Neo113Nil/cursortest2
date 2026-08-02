package androidx.work.impl;

import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.os.Trace;
import androidx.work.ExistingPeriodicWorkPolicy;
import androidx.work.ExistingWorkPolicy;
import androidx.work.WorkManager;
import defpackage.a951;
import defpackage.b2s;
import defpackage.brd;
import defpackage.btx0;
import defpackage.bvf0;
import defpackage.by11;
import defpackage.dai0;
import defpackage.dsq0;
import defpackage.e6f0;
import defpackage.ec70;
import defpackage.ffx;
import defpackage.gl7;
import defpackage.hgz;
import defpackage.i3f;
import defpackage.ike;
import defpackage.jqr;
import defpackage.jx81;
import defpackage.jzz0;
import defpackage.kc70;
import defpackage.ny61;
import defpackage.o0e;
import defpackage.ou;
import defpackage.pa51;
import defpackage.pom0;
import defpackage.r6f0;
import defpackage.rxa0;
import defpackage.s8o;
import defpackage.t951;
import defpackage.u08;
import defpackage.u0e;
import defpackage.u431;
import defpackage.uko;
import defpackage.v201;
import defpackage.va90;
import defpackage.w08;
import defpackage.xw91;
import defpackage.z8u0;
import java.util.Collections;
import java.util.List;
import java.util.UUID;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.q;

/* loaded from: classes.dex */
public final class b extends WorkManager {
    public static b k;
    public static b l;
    public static final Object m;
    public final Context a;
    public final u0e b;
    public final WorkDatabase c;
    public final btx0 d;
    public final List e;
    public final r6f0 f;
    public final va90 g;
    public boolean h = false;
    public BroadcastReceiver.PendingResult i;
    public final v201 j;

    static {
        hgz.o("WorkManagerImpl");
        k = null;
        l = null;
        m = new Object();
    }

    public b(Context context, final u0e u0eVar, btx0 btx0Var, final WorkDatabase workDatabase, final List list, r6f0 r6f0Var, v201 v201Var) {
        Context applicationContext = context.getApplicationContext();
        if (applicationContext.isDeviceProtectedStorage()) {
            ny61.r("Cannot initialize WorkManager in direct boot mode");
            throw null;
        }
        hgz hgzVar = new hgz(u0eVar.j);
        synchronized (hgz.b) {
            try {
                if (hgz.c == null) {
                    hgz.c = hgzVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.a = applicationContext;
        this.d = btx0Var;
        this.c = workDatabase;
        this.f = r6f0Var;
        this.j = v201Var;
        this.b = u0eVar;
        this.e = list;
        t951 t951Var = (t951) btx0Var;
        ike a = bvf0.a(t951Var.b);
        this.g = new va90(workDatabase);
        final dsq0 dsq0Var = t951Var.a;
        int i = pom0.a;
        r6f0Var.a(new uko() { // from class: oom0
            @Override // defpackage.uko
            public final void onExecuted(n951 n951Var, boolean z) {
                dsq0Var.execute(new rjh(list, n951Var, u0eVar, workDatabase, 1));
            }
        });
        t951Var.a.execute(new b2s(applicationContext, this));
        String str = by11.a;
        int i2 = e6f0.a;
        if (Application.getProcessName().equals(applicationContext.getApplicationInfo().processName)) {
            e.H(a, new jqr(e.t(e.o(new q(dai0.j(workDatabase.X0().a, new String[]{"workspec"}, new u431(17)), new UnfinishedWorkListenerKt$maybeLaunchUnfinishedWorkListener$1(4, null)))), new UnfinishedWorkListenerKt$maybeLaunchUnfinishedWorkListener$2(applicationContext, null), 3));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static b i(Context context) {
        b bVar;
        Object obj = m;
        synchronized (obj) {
            try {
                synchronized (obj) {
                    bVar = k;
                    if (bVar == null) {
                        bVar = l;
                    }
                }
                return bVar;
            } catch (Throwable th) {
                throw th;
            } finally {
            }
        }
        if (bVar == null) {
            Context applicationContext = context.getApplicationContext();
            if (!(applicationContext instanceof o0e)) {
                throw new IllegalStateException("WorkManager is not initialized properly.  You have explicitly disabled WorkManagerInitializer in your manifest, have not manually called WorkManager#initialize at this point, and your Application does not implement Configuration.Provider.");
            }
            j(applicationContext, ((o0e) applicationContext).getWorkManagerConfiguration());
            bVar = i(applicationContext);
        }
        return bVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0018, code lost:
    
        r3 = r3.getApplicationContext();
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x001e, code lost:
    
        if (androidx.work.impl.b.l != null) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0020, code lost:
    
        androidx.work.impl.b.l = androidx.work.impl.c.a(r3, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0026, code lost:
    
        androidx.work.impl.b.k = androidx.work.impl.b.l;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void j(Context context, u0e u0eVar) {
        synchronized (m) {
            try {
                b bVar = k;
                if (bVar != null && l != null) {
                    throw new IllegalStateException("WorkManager is already initialized.  Did you try to initialize it manually without disabling WorkManagerInitializer? See WorkManager#initialize(Context, Configuration) or the class level Javadoc for more information.");
                }
            } finally {
            }
        }
    }

    @Override // androidx.work.WorkManager
    public final kc70 a() {
        return s8o.H(this.b.o, "CancelAllWork", ((t951) this.d).a, new w08(this, 0));
    }

    @Override // androidx.work.WorkManager
    public final kc70 b(String str) {
        return s8o.H(this.b.o, "CancelWorkByTag_".concat(str), ((t951) this.d).a, new ou(9, this, str));
    }

    @Override // androidx.work.WorkManager
    public final kc70 c(String str) {
        return s8o.H(this.b.o, "CancelWorkByName_".concat(str), ((t951) this.d).a, new u08(0, str, this));
    }

    @Override // androidx.work.WorkManager
    public final kc70 d(UUID uuid) {
        return s8o.H(this.b.o, "CancelWorkById", ((t951) this.d).a, new u08(this, uuid));
    }

    @Override // androidx.work.WorkManager
    public final ec70 e(List list) {
        if (!list.isEmpty()) {
            return new a951(this, null, ExistingWorkPolicy.KEEP, list, 0).a();
        }
        ny61.g("enqueue needs at least one WorkRequest.");
        return null;
    }

    @Override // androidx.work.WorkManager
    public final ec70 f(String str, ExistingPeriodicWorkPolicy existingPeriodicWorkPolicy, rxa0 rxa0Var) {
        if (existingPeriodicWorkPolicy == ExistingPeriodicWorkPolicy.UPDATE) {
            return pa51.a(this, str, rxa0Var);
        }
        return new a951(this, str, existingPeriodicWorkPolicy == ExistingPeriodicWorkPolicy.KEEP ? ExistingWorkPolicy.KEEP : ExistingWorkPolicy.REPLACE, Collections.singletonList(rxa0Var), 0).a();
    }

    @Override // androidx.work.WorkManager
    public final ec70 g(String str, ExistingWorkPolicy existingWorkPolicy, List list) {
        return new a951(this, str, existingWorkPolicy, list, 0).a();
    }

    @Override // androidx.work.WorkManager
    public final gl7 h(String str) {
        brd brdVar = new brd(str, 13);
        return jx81.r(new i3f(6, ((t951) this.d).a, "loadStatusFuture", new z8u0(0, brdVar, this.c)));
    }

    public final void k() {
        synchronized (m) {
            try {
                this.h = true;
                BroadcastReceiver.PendingResult pendingResult = this.i;
                if (pendingResult != null) {
                    pendingResult.finish();
                    this.i = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void l() {
        xw91 xw91Var = this.b.o;
        w08 w08Var = new w08(this, 1);
        boolean a = jzz0.a();
        if (a) {
            try {
                Trace.beginSection(ffx.f0("ReschedulingWork"));
            } finally {
                if (a) {
                    Trace.endSection();
                }
            }
        }
        w08Var.invoke();
    }
}
