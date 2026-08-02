package xsna;

import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.os.Trace;
import androidx.annotation.NonNull;
import androidx.work.ExistingPeriodicWorkPolicy;
import androidx.work.ExistingWorkPolicy;
import androidx.work.a;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.utils.ForceStopRunnable;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlinx.coroutines.flow.FlowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$1;
import kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1;
import xsna.m100;

/* compiled from: WorkManagerImpl.java */
/* loaded from: classes.dex */
public final class dwx0 extends awx0 {
    public static dwx0 k;
    public static dwx0 l;
    public static final Object m;
    public final Context a;
    public final androidx.work.a b;
    public final WorkDatabase c;
    public final hwx0 d;
    public final List<z7h0> e;
    public final ohd0 f;
    public final syc0 g;
    public boolean h = false;
    public BroadcastReceiver.PendingResult i;
    public final uhp0 j;

    static {
        m100.d("WorkManagerImpl");
        k = null;
        l = null;
        m = new Object();
    }

    public dwx0(@NonNull Context context, @NonNull final androidx.work.a aVar, @NonNull hwx0 hwx0Var, @NonNull final WorkDatabase workDatabase, @NonNull final List list, @NonNull ohd0 ohd0Var, @NonNull uhp0 uhp0Var) {
        Context applicationContext = context.getApplicationContext();
        if (applicationContext.isDeviceProtectedStorage()) {
            throw new IllegalStateException("Cannot initialize WorkManager in direct boot mode");
        }
        m100.a aVar2 = new m100.a(aVar.h);
        synchronized (m100.a) {
            try {
                if (m100.b == null) {
                    m100.b = aVar2;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.a = applicationContext;
        this.d = hwx0Var;
        this.c = workDatabase;
        this.f = ohd0Var;
        this.j = uhp0Var;
        this.b = aVar;
        this.e = list;
        hpj a = zvj.a(hwx0Var.b);
        this.g = new syc0(workDatabase);
        final emi0 emi0Var = hwx0Var.a;
        int i = i8h0.a;
        ohd0Var.a(new e3q() { // from class: xsna.g8h0
            @Override // xsna.e3q
            public final void b(final svx0 svx0Var, boolean z) {
                final List list2 = list;
                final androidx.work.a aVar3 = aVar;
                final WorkDatabase workDatabase2 = workDatabase;
                emi0Var.execute(new Runnable() { // from class: xsna.h8h0
                    @Override // java.lang.Runnable
                    public final void run() {
                        List list3 = list2;
                        Iterator it = list3.iterator();
                        while (it.hasNext()) {
                            ((z7h0) it.next()).d(svx0Var.a);
                        }
                        i8h0.b(aVar3, workDatabase2, list3);
                    }
                });
            }
        });
        hwx0Var.b(new ForceStopRunnable(applicationContext, this));
        String str = g3q0.a;
        int i2 = bhd0.a;
        if (Application.getProcessName().equals(applicationContext.getApplicationInfo().processName)) {
            rsr.s(new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(rsr.l(rsr.h(new FlowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$1(workDatabase.D().B(), new e3q0(4, null)), -1)), new f3q0(applicationContext, null)), a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NonNull
    public static dwx0 h(@NonNull Context context) {
        dwx0 dwx0Var;
        Object obj = m;
        synchronized (obj) {
            try {
                synchronized (obj) {
                    dwx0Var = k;
                    if (dwx0Var == null) {
                        dwx0Var = l;
                    }
                }
                return dwx0Var;
            } catch (Throwable th) {
                throw th;
            } finally {
            }
        }
        if (dwx0Var == null) {
            Context applicationContext = context.getApplicationContext();
            if (!(applicationContext instanceof a.b)) {
                throw new IllegalStateException("WorkManager is not initialized properly.  You have explicitly disabled WorkManagerInitializer in your manifest, have not manually called WorkManager#initialize at this point, and your Application does not implement Configuration.Provider.");
            }
            i(applicationContext, ((a.b) applicationContext).a());
            dwx0Var = h(applicationContext);
        }
        return dwx0Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0018, code lost:
    
        r3 = r3.getApplicationContext();
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x001e, code lost:
    
        if (xsna.dwx0.l != null) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0020, code lost:
    
        xsna.dwx0.l = xsna.fwx0.a(r3, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0026, code lost:
    
        xsna.dwx0.k = xsna.dwx0.l;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void i(@NonNull Context context, @NonNull androidx.work.a aVar) {
        synchronized (m) {
            try {
                dwx0 dwx0Var = k;
                if (dwx0Var != null && l != null) {
                    throw new IllegalStateException("WorkManager is already initialized.  Did you try to initialize it manually without disabling WorkManagerInitializer? See WorkManager#initialize(Context, Configuration) or the class level Javadoc for more information.");
                }
            } finally {
            }
        }
    }

    @Override // xsna.awx0
    @NonNull
    public final xux0 a(@NonNull String str, @NonNull ExistingWorkPolicy existingWorkPolicy, @NonNull List list) {
        if (list.isEmpty()) {
            throw new IllegalArgumentException("beginUniqueWork needs at least one OneTimeWorkRequest.");
        }
        return new xux0(this, str, existingWorkPolicy, list);
    }

    @Override // xsna.awx0
    @NonNull
    public final ws80 b() {
        return zs80.a(this.b.m, "CancelWorkByTag_".concat("com.vk.android.push_fallback_task"), this.d.a, new dq9(this));
    }

    @Override // xsna.awx0
    @NonNull
    public final ws80 c(@NonNull String str) {
        return zs80.a(this.b.m, "CancelWorkByName_".concat(str), this.d.a, new bq9(str, this));
    }

    @Override // xsna.awx0
    @NonNull
    public final ts80 d(@NonNull List<? extends androidx.work.e> list) {
        if (list.isEmpty()) {
            throw new IllegalArgumentException("enqueue needs at least one WorkRequest.");
        }
        return new xux0(this, null, ExistingWorkPolicy.KEEP, list).c();
    }

    @Override // xsna.awx0
    @NonNull
    public final ts80 e(@NonNull String str, @NonNull ExistingPeriodicWorkPolicy existingPeriodicWorkPolicy, @NonNull androidx.work.d dVar) {
        if (existingPeriodicWorkPolicy == ExistingPeriodicWorkPolicy.UPDATE) {
            return ryx0.a(this, str, dVar);
        }
        return new xux0(this, str, existingPeriodicWorkPolicy == ExistingPeriodicWorkPolicy.KEEP ? ExistingWorkPolicy.KEEP : ExistingWorkPolicy.REPLACE, Collections.singletonList(dVar)).c();
    }

    @Override // xsna.awx0
    @NonNull
    public final ts80 f(@NonNull String str, @NonNull ExistingWorkPolicy existingWorkPolicy, @NonNull List<androidx.work.c> list) {
        return new xux0(this, str, existingWorkPolicy, list).c();
    }

    @Override // xsna.awx0
    @NonNull
    public final s120 g(@NonNull UUID uuid) {
        ulg0 r = this.c.D().r(Collections.singletonList(uuid.toString()));
        cwx0 cwx0Var = new cwx0();
        Object obj = new Object();
        s120 s120Var = new s120();
        s120Var.l(r, new xiz(this.d, obj, cwx0Var, s120Var));
        return s120Var;
    }

    public final void j() {
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

    public final void k() {
        p7i p7iVar = this.b.m;
        gb8 gb8Var = new gb8(this, 10);
        p7iVar.getClass();
        boolean e = ndp0.e();
        if (e) {
            try {
                p7iVar.b("ReschedulingWork");
            } catch (Throwable th) {
                if (e) {
                    Trace.endSection();
                }
                throw th;
            }
        }
        gb8Var.invoke();
        if (e) {
            Trace.endSection();
        }
    }
}
