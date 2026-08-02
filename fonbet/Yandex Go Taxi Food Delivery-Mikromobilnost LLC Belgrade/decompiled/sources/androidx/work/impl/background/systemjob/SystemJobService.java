package androidx.work.impl.background.systemjob;

import android.app.Application;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.os.Build;
import android.os.Looper;
import android.os.PersistableBundle;
import androidx.work.WorkerParameters;
import androidx.work.impl.a;
import androidx.work.impl.b;
import defpackage.btx0;
import defpackage.h2u0;
import defpackage.hgz;
import defpackage.i2u0;
import defpackage.j2u0;
import defpackage.n951;
import defpackage.ny61;
import defpackage.oyr;
import defpackage.q951;
import defpackage.r6f0;
import defpackage.r951;
import defpackage.t951;
import defpackage.uko;
import defpackage.vm2;
import defpackage.z52;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class SystemJobService extends JobService implements uko {
    private static final String TAG = hgz.o("SystemJobService");
    private final Map<n951, JobParameters> mJobParameters = new HashMap();
    private final i2u0 mStartStopTokens = new j2u0();
    private q951 mWorkLauncher;
    private b mWorkManagerImpl;

    private static void assertMainThread(String str) {
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            return;
        }
        ny61.r(oyr.p("Cannot invoke ", str, " on a background thread"));
    }

    public static int stopReason(int i) {
        switch (i) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                return i;
            default:
                return -512;
        }
    }

    private static n951 workGenerationalIdFromJobParameters(JobParameters jobParameters) {
        try {
            PersistableBundle extras = jobParameters.getExtras();
            if (extras == null || !extras.containsKey("EXTRA_WORK_SPEC_ID")) {
                return null;
            }
            return new n951(extras.getString("EXTRA_WORK_SPEC_ID"), extras.getInt("EXTRA_WORK_SPEC_GENERATION"));
        } catch (NullPointerException unused) {
            return null;
        }
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        try {
            b i = b.i(getApplicationContext());
            this.mWorkManagerImpl = i;
            r6f0 r6f0Var = i.f;
            this.mWorkLauncher = new r951(r6f0Var, i.d);
            r6f0Var.a(this);
        } catch (IllegalStateException e) {
            if (Application.class.equals(getApplication().getClass())) {
                hgz.g().getClass();
            } else {
                ny61.h("WorkManager needs to be initialized via a ContentProvider#onCreate() or an Application#onCreate().", e);
            }
        }
    }

    @Override // android.app.Service
    public void onDestroy() {
        super.onDestroy();
        b bVar = this.mWorkManagerImpl;
        if (bVar != null) {
            r6f0 r6f0Var = bVar.f;
            synchronized (r6f0Var.k) {
                r6f0Var.j.remove(this);
            }
        }
    }

    @Override // defpackage.uko
    public void onExecuted(n951 n951Var, boolean z) {
        assertMainThread("onExecuted");
        hgz g = hgz.g();
        String str = n951Var.a;
        g.getClass();
        JobParameters remove = this.mJobParameters.remove(n951Var);
        this.mStartStopTokens.a(n951Var);
        if (remove != null) {
            jobFinished(remove, z);
        }
    }

    @Override // android.app.job.JobService
    public boolean onStartJob(JobParameters jobParameters) {
        assertMainThread("onStartJob");
        if (this.mWorkManagerImpl == null) {
            hgz.g().getClass();
            jobFinished(jobParameters, true);
            return false;
        }
        n951 workGenerationalIdFromJobParameters = workGenerationalIdFromJobParameters(jobParameters);
        if (workGenerationalIdFromJobParameters == null) {
            hgz.g().e(TAG, "WorkSpec id not found!");
            return false;
        }
        if (this.mJobParameters.containsKey(workGenerationalIdFromJobParameters)) {
            hgz g = hgz.g();
            workGenerationalIdFromJobParameters.toString();
            g.getClass();
            return false;
        }
        hgz g2 = hgz.g();
        workGenerationalIdFromJobParameters.toString();
        g2.getClass();
        this.mJobParameters.put(workGenerationalIdFromJobParameters, jobParameters);
        WorkerParameters.a aVar = new WorkerParameters.a();
        if (jobParameters.getTriggeredContentUris() != null) {
            aVar.b = Arrays.asList(jobParameters.getTriggeredContentUris());
        }
        if (jobParameters.getTriggeredContentAuthorities() != null) {
            aVar.a = Arrays.asList(jobParameters.getTriggeredContentAuthorities());
        }
        aVar.c = jobParameters.getNetwork();
        q951 q951Var = this.mWorkLauncher;
        h2u0 b = this.mStartStopTokens.b(workGenerationalIdFromJobParameters);
        r951 r951Var = (r951) q951Var;
        btx0 btx0Var = r951Var.b;
        a aVar2 = new a(r951Var, b, aVar);
        btx0Var.getClass();
        ((t951) btx0Var).a.execute(aVar2);
        return true;
    }

    @Override // android.app.job.JobService
    public boolean onStopJob(JobParameters jobParameters) {
        boolean contains;
        assertMainThread("onStopJob");
        if (this.mWorkManagerImpl == null) {
            hgz.g().getClass();
            return true;
        }
        n951 workGenerationalIdFromJobParameters = workGenerationalIdFromJobParameters(jobParameters);
        if (workGenerationalIdFromJobParameters == null) {
            hgz.g().e(TAG, "WorkSpec id not found!");
            return false;
        }
        hgz g = hgz.g();
        workGenerationalIdFromJobParameters.toString();
        g.getClass();
        this.mJobParameters.remove(workGenerationalIdFromJobParameters);
        h2u0 a = this.mStartStopTokens.a(workGenerationalIdFromJobParameters);
        if (a != null) {
            int f = Build.VERSION.SDK_INT >= 31 ? vm2.f(jobParameters) : -512;
            q951 q951Var = this.mWorkLauncher;
            q951Var.getClass();
            r951 r951Var = (r951) q951Var;
            btx0 btx0Var = r951Var.b;
            z52 z52Var = new z52(r951Var.a, a, false, f);
            btx0Var.getClass();
            ((t951) btx0Var).a.execute(z52Var);
        }
        r6f0 r6f0Var = this.mWorkManagerImpl.f;
        String str = workGenerationalIdFromJobParameters.a;
        synchronized (r6f0Var.k) {
            contains = r6f0Var.i.contains(str);
        }
        return !contains;
    }
}
