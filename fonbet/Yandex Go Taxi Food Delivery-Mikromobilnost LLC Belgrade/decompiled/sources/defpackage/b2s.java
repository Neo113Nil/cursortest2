package defpackage;

import android.app.ActivityManager;
import android.app.AlarmManager;
import android.app.Application;
import android.app.ApplicationExitInfo;
import android.app.PendingIntent;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.database.sqlite.SQLiteAccessPermException;
import android.database.sqlite.SQLiteCantOpenDatabaseException;
import android.database.sqlite.SQLiteConstraintException;
import android.database.sqlite.SQLiteDatabaseCorruptException;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteDiskIOException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteFullException;
import android.database.sqlite.SQLiteTableLockedException;
import android.os.Build;
import android.text.TextUtils;
import androidx.room.util.a;
import androidx.work.WorkInfo$State;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.b;
import androidx.work.impl.utils.ForceStopRunnable$BroadcastReceiver;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import ru.CryptoPro.JCP.tools.SelfTester_JCP;
import ru.yandex.taxi.TaxiApplication;

/* loaded from: classes.dex */
public final class b2s implements Runnable {
    public static final String x = hgz.o("ForceStopRunnable");
    public static final long y = 315360000000L;
    public final Context a;
    public final b b;
    public final va90 c;
    public int w = 0;

    public b2s(Context context, b bVar) {
        this.a = context.getApplicationContext();
        this.b = bVar;
        this.c = bVar.g;
    }

    public static void b(Context context) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        int i = Build.VERSION.SDK_INT >= 31 ? 167772160 : SelfTester_JCP.DECRYPT_CNT;
        Intent intent = new Intent();
        intent.setComponent(new ComponentName(context, (Class<?>) ForceStopRunnable$BroadcastReceiver.class));
        intent.setAction("ACTION_FORCE_STOP_RESCHEDULE");
        PendingIntent broadcast = PendingIntent.getBroadcast(context, -1, intent, i);
        long currentTimeMillis = System.currentTimeMillis() + y;
        if (alarmManager != null) {
            alarmManager.setExact(0, currentTimeMillis, broadcast);
        }
    }

    /* JADX WARN: Finally extract failed */
    public final void a() {
        boolean z;
        int i;
        PendingIntent broadcast;
        List historicalProcessExitReasons;
        int reason;
        long timestamp;
        va90 va90Var = this.c;
        b bVar = this.b;
        WorkDatabase workDatabase = bVar.c;
        u0e u0eVar = bVar.b;
        va90 va90Var2 = bVar.g;
        workDatabase = bVar.c;
        String str = k3x0.y;
        Context context = this.a;
        JobScheduler a = v8x.a(context);
        ArrayList e = k3x0.e(context, a);
        List list = (List) a.b(workDatabase.U0().a, true, false, new ceu0(9));
        HashSet hashSet = new HashSet(e != null ? e.size() : 0);
        if (e != null && !e.isEmpty()) {
            Iterator it = e.iterator();
            while (it.hasNext()) {
                JobInfo jobInfo = (JobInfo) it.next();
                n951 f = k3x0.f(jobInfo);
                if (f != null) {
                    hashSet.add(f.a);
                } else {
                    k3x0.d(a, jobInfo.getId());
                }
            }
        }
        Iterator it2 = list.iterator();
        while (true) {
            if (it2.hasNext()) {
                if (!hashSet.contains((String) it2.next())) {
                    hgz.g().getClass();
                    z = true;
                    break;
                }
            } else {
                z = false;
                break;
            }
        }
        if (z) {
            workDatabase.v0();
            try {
                ia51 X0 = workDatabase.X0();
                Iterator it3 = list.iterator();
                while (it3.hasNext()) {
                    X0.f(-1L, (String) it3.next());
                }
                workDatabase.Q0();
                workDatabase.B0();
            } catch (Throwable th) {
                throw th;
            }
        }
        ia51 X02 = workDatabase.X0();
        x951 W0 = workDatabase.W0();
        workDatabase.v0();
        try {
            List<fa51> list2 = (List) a.b(X02.a, true, false, new u431(14));
            boolean z2 = (list2 == null || list2.isEmpty()) ? false : true;
            if (z2) {
                for (fa51 fa51Var : list2) {
                    WorkInfo$State workInfo$State = WorkInfo$State.ENQUEUED;
                    String str2 = fa51Var.a;
                    X02.g(workInfo$State, str2);
                    X02.h(str2, -512);
                    X02.f(-1L, str2);
                }
            }
            a.b(W0.a, false, true, new u431(13));
            workDatabase.Q0();
            workDatabase.B0();
            boolean z3 = z2 || z;
            Long a2 = ((WorkDatabase) va90Var2.a).T0().a("reschedule_needed");
            if (a2 != null && a2.longValue() == 1) {
                hgz.g().getClass();
                bVar.l();
                va90Var2.getClass();
                ((WorkDatabase) va90Var2.a).T0().b(new nle0("reschedule_needed", 0L));
                return;
            }
            try {
                i = Build.VERSION.SDK_INT;
                int i2 = i >= 31 ? 570425344 : 536870912;
                Intent intent = new Intent();
                intent.setComponent(new ComponentName(context, (Class<?>) ForceStopRunnable$BroadcastReceiver.class));
                intent.setAction("ACTION_FORCE_STOP_RESCHEDULE");
                broadcast = PendingIntent.getBroadcast(context, -1, intent, i2);
            } catch (IllegalArgumentException | SecurityException unused) {
                hgz.g().getClass();
            }
            if (i >= 30) {
                if (broadcast != null) {
                    broadcast.cancel();
                }
                historicalProcessExitReasons = ((ActivityManager) context.getSystemService("activity")).getHistoricalProcessExitReasons(null, 0, 0);
                if (historicalProcessExitReasons != null && !historicalProcessExitReasons.isEmpty()) {
                    Long a3 = ((WorkDatabase) va90Var.a).T0().a("last_force_stop_ms");
                    long longValue = a3 != null ? a3.longValue() : 0L;
                    for (int i3 = 0; i3 < historicalProcessExitReasons.size(); i3++) {
                        ApplicationExitInfo g = mh.g(historicalProcessExitReasons.get(i3));
                        reason = g.getReason();
                        if (reason == 10) {
                            timestamp = g.getTimestamp();
                            if (timestamp >= longValue) {
                                hgz.g().getClass();
                                bVar.l();
                                u0eVar.d.getClass();
                                long currentTimeMillis = System.currentTimeMillis();
                                va90Var.getClass();
                                ((WorkDatabase) va90Var.a).T0().b(new nle0("last_force_stop_ms", Long.valueOf(currentTimeMillis)));
                                return;
                            }
                        }
                    }
                }
            } else if (broadcast == null) {
                b(context);
                hgz.g().getClass();
                bVar.l();
                u0eVar.d.getClass();
                long currentTimeMillis2 = System.currentTimeMillis();
                va90Var.getClass();
                ((WorkDatabase) va90Var.a).T0().b(new nle0("last_force_stop_ms", Long.valueOf(currentTimeMillis2)));
                return;
            }
            if (z3) {
                hgz.g().getClass();
                pom0.b(u0eVar, workDatabase, bVar.e);
            }
        } finally {
            workDatabase.B0();
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean equals;
        String str = x;
        b bVar = this.b;
        try {
            bVar.b.getClass();
            boolean isEmpty = TextUtils.isEmpty(null);
            Context context = this.a;
            if (isEmpty) {
                hgz.g().getClass();
                equals = true;
            } else {
                int i = e6f0.a;
                equals = Application.getProcessName().equals(context.getApplicationInfo().processName);
                hgz.g().getClass();
            }
            if (equals) {
                while (true) {
                    try {
                        dai0.B(context);
                        hgz.g().getClass();
                        try {
                            a();
                            break;
                        } catch (SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteFullException | SQLiteTableLockedException e) {
                            int i2 = this.w + 1;
                            this.w = i2;
                            if (i2 >= 3) {
                                String str2 = wwg.w(context) ? "The file system on the device is in a bad state. WorkManager cannot access the app's internal data store." : "WorkManager can't be accessed from direct boot, because credential encrypted storage isn't accessible.\nDon't access or initialise WorkManager from directAware components. See https://developer.android.com/training/articles/direct-boot";
                                hgz.g().f(str, str2, e);
                                IllegalStateException illegalStateException = new IllegalStateException(str2, e);
                                if (bVar.b.h == null) {
                                    throw illegalStateException;
                                }
                                hgz.g().getClass();
                                TaxiApplication._get_workManagerConfiguration_$lambda$0(illegalStateException);
                            } else {
                                hgz.g().getClass();
                                try {
                                    Thread.sleep(this.w * 300);
                                } catch (InterruptedException unused) {
                                }
                            }
                        }
                    } catch (SQLiteException e2) {
                        hgz.g().e(str, "Unexpected SQLite exception during migrations");
                        IllegalStateException illegalStateException2 = new IllegalStateException("Unexpected SQLite exception during migrations", e2);
                        if (bVar.b.h == null) {
                            throw illegalStateException2;
                        }
                        TaxiApplication._get_workManagerConfiguration_$lambda$0(illegalStateException2);
                    }
                }
            }
        } finally {
            bVar.k();
        }
    }
}
