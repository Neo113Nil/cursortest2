package ru.mail.libverify.fetcher;

import android.app.job.JobInfo;
import android.app.job.JobParameters;
import android.app.job.JobScheduler;
import android.app.job.JobService;
import android.content.ComponentName;
import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import ru.mail.libverify.R;
import ru.mail.verify.core.utils.FileLog;

/* loaded from: classes9.dex */
public class FetcherJobService extends JobService {

    @Nullable
    private static volatile JobParameters a;

    public static boolean a(@NonNull Context context) {
        FileLog.d("FetcherJobService", "fetcher start requested");
        try {
            JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
            if (jobScheduler != null) {
                if (jobScheduler.schedule(new JobInfo.Builder(context.getResources().getInteger(R.integer.libverify_fetcher_job_id), new ComponentName(context, (Class<?>) FetcherJobService.class)).setRequiredNetworkType(3).build()) == 1) {
                    return true;
                }
            }
            return false;
        } catch (Throwable th) {
            FileLog.e("FetcherJobService", "failed to start service", th);
            return false;
        }
    }

    public static boolean b(@NonNull Context context) {
        FileLog.d("FetcherJobService", "fetcher stop requested");
        a = null;
        try {
            JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
            if (jobScheduler == null) {
                return false;
            }
            jobScheduler.cancel(context.getResources().getInteger(R.integer.libverify_fetcher_job_id));
            return true;
        } catch (Throwable th) {
            FileLog.e("FetcherJobService", "failed to stop service", th);
            return false;
        }
    }

    @Override // android.app.job.JobService
    public final boolean onStartJob(JobParameters jobParameters) {
        a = jobParameters;
        return true;
    }

    @Override // android.app.job.JobService
    public final boolean onStopJob(JobParameters jobParameters) {
        return a == null;
    }
}
