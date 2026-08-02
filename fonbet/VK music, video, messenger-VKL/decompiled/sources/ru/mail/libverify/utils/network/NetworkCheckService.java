package ru.mail.libverify.utils.network;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import androidx.annotation.NonNull;
import androidx.core.app.JobIntentService;
import androidx.core.app.VerifySafeJobIntentService;
import ru.mail.libverify.R;
import ru.mail.verify.core.utils.FileLog;

/* loaded from: classes9.dex */
public class NetworkCheckService extends VerifySafeJobIntentService {
    private final Object b = new Object();
    private final long a = System.nanoTime();

    public static void a(@NonNull Context context) {
        try {
            JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
            if (jobScheduler != null) {
                if (jobScheduler.schedule(new JobInfo.Builder(context.getResources().getInteger(R.integer.libverify_network_check_job_id), new ComponentName(context, (Class<?>) NetworkCheckService.class)).setRequiredNetworkType(1).build()) == 1) {
                    return;
                }
            }
        } catch (Throwable th) {
            FileLog.e("NetworkCheckService", "failed to start network check", th);
        }
        try {
            JobIntentService.enqueueWork(context.getApplicationContext(), (Class<?>) NetworkCheckService.class, context.getResources().getInteger(R.integer.libverify_network_check_job_id), new Intent("check_default"));
        } catch (Throwable th2) {
            FileLog.e("NetworkCheckService", "failed to start a service", th2);
        }
    }

    @Override // androidx.core.app.JobIntentService, android.app.Service
    public final void onDestroy() {
        FileLog.v("NetworkCheckService", "service destroyed");
        super.onDestroy();
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0025, code lost:
    
        ru.mail.verify.core.utils.FileLog.v("NetworkCheckService", "onHandleIntent on iteration = %d remaining time = %d", java.lang.Integer.valueOf(r6), java.lang.Long.valueOf(r7));
        r1 = r13.b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x003a, code lost:
    
        if (r7 >= 0) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x003c, code lost:
    
        r7 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0048, code lost:
    
        r1.wait(r7);
        ru.mail.verify.core.utils.network.NetworkStateReceiver.h(r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0052, code lost:
    
        if (ru.mail.verify.core.utils.network.NetworkStateReceiver.a() == false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x005f, code lost:
    
        monitor-exit(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0060, code lost:
    
        r6 = r6 + 1;
        r0 = (java.lang.System.nanoTime() - r13.a) / 1000000;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x006c, code lost:
    
        if (r0 >= 0) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x006e, code lost:
    
        r7 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0054, code lost:
    
        ru.mail.verify.core.utils.FileLog.v("NetworkCheckService", "onHandleIntent internet connection detected");
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x005b, code lost:
    
        monitor-exit(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x003e, code lost:
    
        r7 = java.lang.Math.min((r6 * r6) * 200, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0070, code lost:
    
        ru.mail.verify.core.utils.FileLog.e("NetworkCheckService", "onHandleIntent wait loop interrupted");
     */
    /* JADX WARN: Code restructure failed: missing block: B:2:0x0017, code lost:
    
        if (r0 < 0) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x005d, code lost:
    
        r14 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x007a, code lost:
    
        throw r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x001e, code lost:
    
        r7 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:3:0x001a, code lost:
    
        r7 = 600000 - r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0020, code lost:
    
        if (r7 <= 0) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0022, code lost:
    
        r0 = r13.b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0024, code lost:
    
        monitor-enter(r0);
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x006c -> B:3:0x001a). Please report as a decompilation issue!!! */
    @Override // androidx.core.app.JobIntentService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onHandleWork(@NonNull Intent intent) {
        FileLog.v("NetworkCheckService", "onHandleIntent started");
        long nanoTime = (System.nanoTime() - this.a) / 1000000;
        int i = 1;
        FileLog.v("NetworkCheckService", "onHandleIntent completed");
    }

    @Override // androidx.core.app.JobIntentService, android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        FileLog.v("NetworkCheckService", "onStartCommand");
        return super.onStartCommand(intent, i, i2);
    }
}
