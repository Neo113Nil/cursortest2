package defpackage;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.net.NetworkRequest;
import android.os.Build;
import android.os.PersistableBundle;
import androidx.room.RoomDatabase;
import androidx.room.util.a;
import androidx.work.BackoffPolicy;
import androidx.work.NetworkType;
import androidx.work.OutOfQuotaPolicy;
import androidx.work.WorkInfo$State;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemjob.SystemJobService;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import ru.yandex.taxi.TaxiApplication;

/* loaded from: classes.dex */
public final class k3x0 implements kom0 {
    public static final String y = hgz.o("SystemJobScheduler");
    public final Context a;
    public final JobScheduler b;
    public final j3x0 c;
    public final WorkDatabase w;
    public final u0e x;

    public k3x0(Context context, WorkDatabase workDatabase, u0e u0eVar) {
        JobScheduler a = v8x.a(context);
        j3x0 j3x0Var = new j3x0(context, u0eVar.d, u0eVar.n);
        this.a = context;
        this.b = a;
        this.c = j3x0Var;
        this.w = workDatabase;
        this.x = u0eVar;
    }

    public static void d(JobScheduler jobScheduler, int i) {
        try {
            jobScheduler.cancel(i);
        } catch (Throwable th) {
            hgz.g().f(y, String.format(Locale.getDefault(), "Exception while trying to cancel job (%d)", Integer.valueOf(i)), th);
        }
    }

    public static ArrayList e(Context context, JobScheduler jobScheduler) {
        List<JobInfo> list;
        String str = v8x.a;
        try {
            list = jobScheduler.getAllPendingJobs();
        } catch (Throwable th) {
            hgz.g().f(v8x.a, "getAllPendingJobs() is not reliable on this device.", th);
            list = null;
        }
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        ComponentName componentName = new ComponentName(context, (Class<?>) SystemJobService.class);
        for (JobInfo jobInfo : list) {
            if (componentName.equals(jobInfo.getService())) {
                arrayList.add(jobInfo);
            }
        }
        return arrayList;
    }

    public static n951 f(JobInfo jobInfo) {
        PersistableBundle extras = jobInfo.getExtras();
        if (extras == null) {
            return null;
        }
        try {
            if (!extras.containsKey("EXTRA_WORK_SPEC_ID")) {
                return null;
            }
            return new n951(extras.getString("EXTRA_WORK_SPEC_ID"), extras.getInt("EXTRA_WORK_SPEC_GENERATION", 0));
        } catch (NullPointerException unused) {
            return null;
        }
    }

    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r6v10 */
    @Override // defpackage.kom0
    public final void a(fa51... fa51VarArr) {
        int intValue;
        boolean z;
        boolean z2;
        u0e u0eVar = this.x;
        WorkDatabase workDatabase = this.w;
        cot cotVar = new cot(24, workDatabase);
        int length = fa51VarArr.length;
        ?? r6 = 0;
        int i = 0;
        while (i < length) {
            fa51 fa51Var = fa51VarArr[i];
            workDatabase.v0();
            try {
                fa51 d = workDatabase.X0().d(fa51Var.a);
                if (d == null) {
                    hgz.g().getClass();
                    workDatabase.Q0();
                    z2 = r6;
                } else if (d.b != WorkInfo$State.ENQUEUED) {
                    hgz.g().getClass();
                    workDatabase.Q0();
                    z2 = r6;
                } else {
                    n951 q = udq0.q(fa51Var);
                    int i2 = q.b;
                    String str = q.a;
                    int i3 = 1;
                    b3x0 b3x0Var = (b3x0) a.b(workDatabase.U0().a, true, r6, new c3x0(str, i2));
                    if (b3x0Var != null) {
                        intValue = b3x0Var.c;
                    } else {
                        u0eVar.getClass();
                        int i4 = u0eVar.k;
                        WorkDatabase workDatabase2 = (WorkDatabase) cotVar.b;
                        b6v b6vVar = new b6v(cotVar, i4, r6);
                        workDatabase2.getClass();
                        intValue = ((Number) workDatabase2.P0(new csf0(14, b6vVar))).intValue();
                    }
                    if (b3x0Var == null) {
                        b3x0 b3x0Var2 = new b3x0(str, i2, intValue);
                        d3x0 U0 = workDatabase.U0();
                        RoomDatabase roomDatabase = U0.a;
                        fgw0 fgw0Var = new fgw0(i3, U0, b3x0Var2);
                        z = false;
                        a.b(roomDatabase, false, true, fgw0Var);
                    } else {
                        z = false;
                    }
                    g(fa51Var, intValue);
                    workDatabase.Q0();
                    z2 = z;
                }
                i++;
                r6 = z2;
            } finally {
                workDatabase.B0();
            }
        }
    }

    @Override // defpackage.kom0
    public final boolean b() {
        return true;
    }

    @Override // defpackage.kom0
    public final void c(String str) {
        ArrayList arrayList;
        Context context = this.a;
        JobScheduler jobScheduler = this.b;
        ArrayList e = e(context, jobScheduler);
        if (e == null) {
            arrayList = null;
        } else {
            ArrayList arrayList2 = new ArrayList(2);
            Iterator it = e.iterator();
            while (it.hasNext()) {
                JobInfo jobInfo = (JobInfo) it.next();
                n951 f = f(jobInfo);
                if (f != null && str.equals(f.a)) {
                    arrayList2.add(Integer.valueOf(jobInfo.getId()));
                }
            }
            arrayList = arrayList2;
        }
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            d(jobScheduler, ((Integer) it2.next()).intValue());
        }
        a.b(this.w.U0().a, false, true, new brd(str, 14));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void g(fa51 fa51Var, int i) {
        int i2;
        List<JobInfo> list;
        String str;
        String str2 = y;
        j3x0 j3x0Var = this.c;
        j3x0Var.getClass();
        k8e k8eVar = fa51Var.j;
        PersistableBundle persistableBundle = new PersistableBundle();
        persistableBundle.putString("EXTRA_WORK_SPEC_ID", fa51Var.a);
        persistableBundle.putInt("EXTRA_WORK_SPEC_GENERATION", fa51Var.t);
        persistableBundle.putBoolean("EXTRA_IS_PERIODIC", fa51Var.c());
        JobInfo.Builder builder = new JobInfo.Builder(i, j3x0Var.a);
        boolean z = k8eVar.c;
        Set<j8e> set = k8eVar.i;
        JobInfo.Builder requiresCharging = builder.setRequiresCharging(z);
        boolean z2 = k8eVar.d;
        JobInfo.Builder extras = requiresCharging.setRequiresDeviceIdle(z2).setExtras(persistableBundle);
        NetworkRequest a = k8eVar.a();
        if (a != null) {
            yjb1.c(extras, a);
        } else {
            NetworkType networkType = k8eVar.a;
            if (Build.VERSION.SDK_INT < 30 || networkType != NetworkType.TEMPORARILY_UNMETERED) {
                int i3 = i3x0.a[networkType.ordinal()];
                if (i3 != 1) {
                    i2 = 2;
                    if (i3 != 2) {
                        if (i3 != 3) {
                            i2 = 4;
                            if (i3 == 4) {
                                i2 = 3;
                            } else if (i3 != 5) {
                                hgz g = hgz.g();
                                networkType.toString();
                                g.getClass();
                            }
                        }
                    }
                    i2 = 1;
                } else {
                    i2 = 0;
                }
                extras.setRequiredNetworkType(i2);
            } else {
                extras.setRequiredNetwork(new NetworkRequest.Builder().addCapability(25).build());
            }
        }
        if (!z2) {
            extras.setBackoffCriteria(fa51Var.m, fa51Var.l == BackoffPolicy.LINEAR ? 0 : 1);
        }
        long a2 = fa51Var.a();
        j3x0Var.b.getClass();
        long max = Math.max(a2 - System.currentTimeMillis(), 0L);
        if (max > 0) {
            extras.setMinimumLatency(max);
        } else if (!fa51Var.q && j3x0Var.c) {
            extras.setImportantWhileForeground(true);
        }
        if (!set.isEmpty()) {
            for (j8e j8eVar : set) {
                extras.addTriggerContentUri(new JobInfo.TriggerContentUri(j8eVar.a(), j8eVar.b() ? 1 : 0));
            }
            extras.setTriggerContentUpdateDelay(k8eVar.g);
            extras.setTriggerContentMaxDelay(k8eVar.h);
        }
        extras.setPersisted(false);
        extras.setRequiresBatteryNotLow(k8eVar.e);
        extras.setRequiresStorageNotLow(k8eVar.f);
        Object[] objArr = fa51Var.k > 0;
        Object[] objArr2 = max > 0;
        int i4 = Build.VERSION.SDK_INT;
        if (i4 >= 31 && fa51Var.q && objArr == false && objArr2 == false) {
            extras.setExpedited(true);
        }
        if (i4 >= 35 && (str = fa51Var.x) != null) {
            extras.setTraceTag(str);
        }
        JobInfo build = extras.build();
        hgz.g().getClass();
        try {
            if (this.b.schedule(build) == 0) {
                hgz.g().getClass();
                if (fa51Var.q && fa51Var.r == OutOfQuotaPolicy.RUN_AS_NON_EXPEDITED_WORK_REQUEST) {
                    fa51Var.q = false;
                    hgz.g().getClass();
                    g(fa51Var, i);
                }
            }
        } catch (IllegalStateException e) {
            String str3 = v8x.a;
            int i5 = Build.VERSION.SDK_INT;
            int i6 = i5 >= 31 ? 150 : 100;
            int size = ((List) a.b(this.w.X0().a, true, false, new js41(15))).size();
            Context context = this.a;
            String str4 = "<faulty JobScheduler failed to getPendingJobs>";
            if (i5 >= 34) {
                JobScheduler a3 = v8x.a(context);
                try {
                    list = a3.getAllPendingJobs();
                } catch (Throwable th) {
                    hgz.g().f(v8x.a, "getAllPendingJobs() is not reliable on this device.", th);
                    list = null;
                }
                if (list != null) {
                    ArrayList e2 = e(context, a3);
                    int size2 = e2 != null ? list.size() - e2.size() : 0;
                    String e3 = size2 == 0 ? null : b64.e(size2, " of which are not owned by WorkManager");
                    ArrayList e4 = e(context, (JobScheduler) context.getSystemService("jobscheduler"));
                    int size3 = e4 != null ? e4.size() : 0;
                    str4 = kotlin.collections.a.X(j73.A(new String[]{list.size() + " jobs in \"androidx.work.systemjobscheduler\" namespace", e3, size3 != 0 ? b64.e(size3, " from WorkManager in the default namespace") : null}), ",\n", null, null, null, 62);
                }
            } else {
                ArrayList e5 = e(context, v8x.a(context));
                if (e5 != null) {
                    str4 = e5.size() + " jobs from WorkManager";
                }
            }
            StringBuilder v = unr0.v(i6, "JobScheduler ", " job limit exceeded.\nIn JobScheduler there are ", str4, ".\nThere are ");
            v.append(size);
            v.append(" jobs tracked by WorkManager's database;\nthe Configuration limit is ");
            u0e u0eVar = this.x;
            String s = oyr.s(v, u0eVar.m, '.');
            hgz.g().e(str2, s);
            IllegalStateException illegalStateException = new IllegalStateException(s, e);
            if (u0eVar.i == null) {
                throw illegalStateException;
            }
            TaxiApplication._get_workManagerConfiguration_$lambda$1(illegalStateException);
        } catch (Throwable th2) {
            hgz.g().f(str2, "Unable to schedule " + fa51Var, th2);
        }
    }
}
