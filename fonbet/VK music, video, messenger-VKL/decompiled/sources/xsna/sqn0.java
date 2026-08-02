package xsna;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.net.NetworkRequest;
import android.os.Build;
import android.os.PersistableBundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.work.BackoffPolicy;
import androidx.work.NetworkType;
import androidx.work.OutOfQuotaPolicy;
import androidx.work.WorkInfo;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemjob.SystemJobService;
import io.jsonwebtoken.JwtParser;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.Callable;
import xsna.p6j;
import xsna.qqn0;

/* compiled from: SystemJobScheduler.java */
/* loaded from: classes.dex */
public final class sqn0 implements z7h0 {
    public static final String g = m100.d("SystemJobScheduler");
    public final Context b;
    public final JobScheduler c;
    public final qqn0 d;
    public final WorkDatabase e;
    public final androidx.work.a f;

    public sqn0(@NonNull Context context, @NonNull WorkDatabase workDatabase, @NonNull androidx.work.a aVar) {
        JobScheduler a = nyx.a(context);
        qqn0 qqn0Var = new qqn0(context, aVar.d, aVar.l);
        this.b = context;
        this.c = a;
        this.d = qqn0Var;
        this.e = workDatabase;
        this.f = aVar;
    }

    public static void a(@NonNull JobScheduler jobScheduler, int i) {
        try {
            jobScheduler.cancel(i);
        } catch (Throwable th) {
            m100.c().b(g, String.format(Locale.getDefault(), "Exception while trying to cancel job (%d)", Integer.valueOf(i)), th);
        }
    }

    @Nullable
    public static ArrayList b(@NonNull Context context, @NonNull JobScheduler jobScheduler) {
        List<JobInfo> list;
        String str = nyx.a;
        try {
            list = jobScheduler.getAllPendingJobs();
        } catch (Throwable th) {
            m100.c().b(nyx.a, "getAllPendingJobs() is not reliable on this device.", th);
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

    @Nullable
    public static svx0 f(@NonNull JobInfo jobInfo) {
        PersistableBundle extras = jobInfo.getExtras();
        if (extras == null) {
            return null;
        }
        try {
            if (!extras.containsKey("EXTRA_WORK_SPEC_ID")) {
                return null;
            }
            return new svx0(extras.getString("EXTRA_WORK_SPEC_ID"), extras.getInt("EXTRA_WORK_SPEC_GENERATION", 0));
        } catch (NullPointerException unused) {
            return null;
        }
    }

    @Override // xsna.z7h0
    public final boolean c() {
        return true;
    }

    @Override // xsna.z7h0
    public final void d(@NonNull String str) {
        ArrayList arrayList;
        Context context = this.b;
        JobScheduler jobScheduler = this.c;
        ArrayList b = b(context, jobScheduler);
        if (b == null) {
            arrayList = null;
        } else {
            ArrayList arrayList2 = new ArrayList(2);
            Iterator it = b.iterator();
            while (it.hasNext()) {
                JobInfo jobInfo = (JobInfo) it.next();
                svx0 f = f(jobInfo);
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
            a(jobScheduler, ((Integer) it2.next()).intValue());
        }
        this.e.A().g(str);
    }

    @Override // xsna.z7h0
    public final void e(@NonNull fxx0... fxx0VarArr) {
        int intValue;
        androidx.work.a aVar = this.f;
        WorkDatabase workDatabase = this.e;
        final iv3 iv3Var = new iv3(workDatabase);
        for (fxx0 fxx0Var : fxx0VarArr) {
            workDatabase.c();
            try {
                fxx0 j = workDatabase.D().j(fxx0Var.a);
                if (j == null) {
                    m100.c().getClass();
                    workDatabase.w();
                } else if (j.b != WorkInfo.State.ENQUEUED) {
                    m100.c().getClass();
                    workDatabase.w();
                } else {
                    svx0 c = bdl.c(fxx0Var);
                    gqn0 c2 = workDatabase.A().c(c);
                    if (c2 != null) {
                        intValue = c2.c;
                    } else {
                        aVar.getClass();
                        final int i = aVar.i;
                        intValue = ((Number) ((WorkDatabase) iv3Var.a).t(new Callable() { // from class: xsna.gsv
                            @Override // java.util.concurrent.Callable
                            public final Object call() {
                                WorkDatabase workDatabase2 = (WorkDatabase) iv3.this.a;
                                Long b = workDatabase2.z().b("next_job_scheduler_id");
                                int i2 = 0;
                                int longValue = b != null ? (int) b.longValue() : 0;
                                workDatabase2.z().a(new txc0("next_job_scheduler_id", Long.valueOf(longValue == Integer.MAX_VALUE ? 0 : longValue + 1)));
                                if (longValue < 0 || longValue > i) {
                                    workDatabase2.z().a(new txc0("next_job_scheduler_id", Long.valueOf(1)));
                                } else {
                                    i2 = longValue;
                                }
                                return Integer.valueOf(i2);
                            }
                        })).intValue();
                    }
                    if (c2 == null) {
                        workDatabase.A().e(new gqn0(c.a, c.b, intValue));
                    }
                    g(fxx0Var, intValue);
                    workDatabase.w();
                }
            } finally {
                workDatabase.q();
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void g(@NonNull fxx0 fxx0Var, int i) {
        int i2;
        List<JobInfo> list;
        String str;
        String str2 = g;
        qqn0 qqn0Var = this.d;
        qqn0Var.getClass();
        p6j p6jVar = fxx0Var.j;
        PersistableBundle persistableBundle = new PersistableBundle();
        persistableBundle.putString("EXTRA_WORK_SPEC_ID", fxx0Var.a);
        persistableBundle.putInt("EXTRA_WORK_SPEC_GENERATION", fxx0Var.t);
        persistableBundle.putBoolean("EXTRA_IS_PERIODIC", fxx0Var.d());
        JobInfo.Builder requiresCharging = new JobInfo.Builder(i, qqn0Var.a).setRequiresCharging(p6jVar.c);
        boolean z = p6jVar.d;
        JobInfo.Builder extras = requiresCharging.setRequiresDeviceIdle(z).setExtras(persistableBundle);
        NetworkRequest a = p6jVar.a();
        int i3 = Build.VERSION.SDK_INT;
        if (a != null) {
            rqn0.a(extras, a);
        } else {
            NetworkType networkType = p6jVar.a;
            if (i3 < 30 || networkType != NetworkType.TEMPORARILY_UNMETERED) {
                int i4 = qqn0.a.a[networkType.ordinal()];
                if (i4 != 1) {
                    i2 = 2;
                    if (i4 != 2) {
                        if (i4 != 3) {
                            i2 = 4;
                            if (i4 == 4) {
                                i2 = 3;
                            } else if (i4 != 5) {
                                m100 c = m100.c();
                                networkType.toString();
                                c.getClass();
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
        if (!z) {
            extras.setBackoffCriteria(fxx0Var.m, fxx0Var.l == BackoffPolicy.LINEAR ? 0 : 1);
        }
        long max = Math.max(fxx0Var.a() - qqn0Var.b.d(), 0L);
        if (i3 <= 28) {
            extras.setMinimumLatency(max);
        } else if (max > 0) {
            extras.setMinimumLatency(max);
        } else if (!fxx0Var.q && qqn0Var.c) {
            extras.setImportantWhileForeground(true);
        }
        if (p6jVar.b()) {
            for (p6j.a aVar : p6jVar.i) {
                extras.addTriggerContentUri(new JobInfo.TriggerContentUri(aVar.a(), aVar.b() ? 1 : 0));
            }
            extras.setTriggerContentUpdateDelay(p6jVar.g);
            extras.setTriggerContentMaxDelay(p6jVar.h);
        }
        extras.setPersisted(false);
        int i5 = Build.VERSION.SDK_INT;
        extras.setRequiresBatteryNotLow(p6jVar.e);
        extras.setRequiresStorageNotLow(p6jVar.f);
        Object[] objArr = fxx0Var.k > 0;
        boolean z2 = max > 0;
        if (i5 >= 31 && fxx0Var.q && objArr == false && !z2) {
            extras.setExpedited(true);
        }
        if (i5 >= 35 && (str = fxx0Var.x) != null) {
            extras.setTraceTag(str);
        }
        JobInfo build = extras.build();
        m100.c().getClass();
        try {
            if (this.c.schedule(build) == 0) {
                m100.c().getClass();
                if (fxx0Var.q && fxx0Var.r == OutOfQuotaPolicy.RUN_AS_NON_EXPEDITED_WORK_REQUEST) {
                    fxx0Var.q = false;
                    m100.c().getClass();
                    g(fxx0Var, i);
                }
            }
        } catch (IllegalStateException e) {
            String str3 = nyx.a;
            int i6 = Build.VERSION.SDK_INT;
            int i7 = i6 >= 31 ? 150 : 100;
            int size = this.e.D().x().size();
            Context context = this.b;
            String str4 = "<faulty JobScheduler failed to getPendingJobs>";
            if (i6 >= 34) {
                JobScheduler a2 = nyx.a(context);
                try {
                    list = a2.getAllPendingJobs();
                } catch (Throwable th) {
                    m100.c().b(nyx.a, "getAllPendingJobs() is not reliable on this device.", th);
                    list = null;
                }
                if (list != null) {
                    ArrayList b = b(context, a2);
                    int size2 = b != null ? list.size() - b.size() : 0;
                    String a3 = size2 == 0 ? null : l6g.a(size2, " of which are not owned by WorkManager");
                    ArrayList b2 = b(context, (JobScheduler) context.getSystemService("jobscheduler"));
                    int size3 = b2 != null ? b2.size() : 0;
                    str4 = j5g.g0(rl3.I(new String[]{list.size() + " jobs in \"androidx.work.systemjobscheduler\" namespace", a3, size3 != 0 ? l6g.a(size3, " from WorkManager in the default namespace") : null}), ",\n", null, null, 0, null, 62);
                }
            } else {
                ArrayList b3 = b(context, nyx.a(context));
                if (b3 != null) {
                    str4 = b3.size() + " jobs from WorkManager";
                }
            }
            StringBuilder a4 = kh10.a(i7, "JobScheduler ", " job limit exceeded.\nIn JobScheduler there are ", str4, ".\nThere are ");
            a4.append(size);
            a4.append(" jobs tracked by WorkManager's database;\nthe Configuration limit is ");
            String b4 = vu5.b(a4, this.f.k, JwtParser.SEPARATOR_CHAR);
            m100.c().a(str2, b4);
            throw new IllegalStateException(b4, e);
        } catch (Throwable th2) {
            m100.c().b(str2, "Unable to schedule " + fxx0Var, th2);
        }
    }
}
