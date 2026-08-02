package xsna;

import android.app.job.JobScheduler;
import android.content.Context;
import android.os.Build;

/* compiled from: JobSchedulerExt.kt */
/* loaded from: classes.dex */
public final class nyx {
    public static final String a = m100.d("SystemJobScheduler");

    public static final JobScheduler a(Context context) {
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        return Build.VERSION.SDK_INT >= 34 ? w65.g(jobScheduler) : jobScheduler;
    }
}
