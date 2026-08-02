package ru.mail.verify.core.utils;

import android.app.job.JobInfo;
import android.app.job.JobParameters;
import android.app.job.JobScheduler;
import android.app.job.JobService;
import android.content.ComponentName;
import android.content.Context;
import androidx.annotation.NonNull;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicReference;
import ru.mail.libverify.R;
import ru.ok.android.webrtc.utils.retry.ExponentialAlgorithm;
import xsna.qo4;

/* loaded from: classes9.dex */
public class VerificationJobService extends JobService {
    private static final ConcurrentHashMap<Object, Object> b = new ConcurrentHashMap<>();
    private static final ExecutorService c = Executors.newCachedThreadPool();
    private static final AtomicReference<JobParameters> d = new AtomicReference<>();
    private final long a = System.currentTimeMillis();

    public static boolean b(@NonNull Context context, @NonNull Object obj) {
        ConcurrentHashMap<Object, Object> concurrentHashMap = b;
        if (concurrentHashMap.remove(obj) == null) {
            FileLog.e("VerificationJobService", "no actions to release for owner %s", obj);
            return true;
        }
        FileLog.v("VerificationJobService", "release owner %s", obj);
        if (concurrentHashMap.isEmpty()) {
            return a(context);
        }
        return true;
    }

    @Override // android.app.Service
    public final void onDestroy() {
        FileLog.v("VerificationJobService", "service destroyed with count: %d", Integer.valueOf(b.size()));
        a((Context) this);
        super.onDestroy();
    }

    @Override // android.app.job.JobService
    public final boolean onStartJob(JobParameters jobParameters) {
        AtomicReference<JobParameters> atomicReference = d;
        while (!atomicReference.compareAndSet(null, jobParameters)) {
            if (atomicReference.get() != null) {
                return true;
            }
        }
        c.submit(new qo4(this, 14));
        return true;
    }

    @Override // android.app.job.JobService
    public final boolean onStopJob(JobParameters jobParameters) {
        return d.get() != null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a() {
        long currentTimeMillis;
        FileLog.v("VerificationJobService", "wait task started");
        do {
            ConcurrentHashMap<Object, Object> concurrentHashMap = b;
            if (concurrentHashMap.isEmpty()) {
                break;
            }
            FileLog.v("VerificationJobService", "wait task loop " + concurrentHashMap.size());
            try {
                synchronized (concurrentHashMap) {
                    concurrentHashMap.wait(ExponentialAlgorithm.DEFAULT_MAX_INTERVAL_MS);
                }
                currentTimeMillis = System.currentTimeMillis() - this.a;
                if (currentTimeMillis < 0) {
                    break;
                }
            } catch (InterruptedException e) {
                FileLog.e("VerificationJobService", "wait task failed", e);
            }
        } while (currentTimeMillis <= 300000);
        FileLog.v("VerificationJobService", "wait task for keep alive operation expired");
        FileLog.v("VerificationJobService", "wait task completed");
        d.set(null);
    }

    public static boolean a(@NonNull Context context, @NonNull Object obj) {
        FileLog.v("VerificationJobService", "acquire " + obj);
        ConcurrentHashMap<Object, Object> concurrentHashMap = b;
        if (concurrentHashMap.containsKey(obj)) {
            return true;
        }
        concurrentHashMap.put(obj, obj);
        try {
            JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
            if (jobScheduler != null) {
                if (jobScheduler.schedule(new JobInfo.Builder(context.getResources().getInteger(R.integer.libverify_verification_job_id), new ComponentName(context, (Class<?>) VerificationJobService.class)).setRequiredNetworkType(3).build()) == 1) {
                    return true;
                }
            }
            return false;
        } catch (Throwable th) {
            FileLog.e("VerificationJobService", "failed to start a service", th);
            return false;
        }
    }

    public static boolean a(@NonNull Context context) {
        FileLog.v("VerificationJobService", "releaseAll");
        d.set(null);
        ConcurrentHashMap<Object, Object> concurrentHashMap = b;
        concurrentHashMap.clear();
        synchronized (concurrentHashMap) {
            concurrentHashMap.notify();
        }
        try {
            JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
            if (jobScheduler == null) {
                return false;
            }
            jobScheduler.cancel(context.getResources().getInteger(R.integer.libverify_verification_job_id));
            return true;
        } catch (Throwable th) {
            FileLog.e("VerificationJobService", "failed to stop service", th);
            return false;
        }
    }
}
