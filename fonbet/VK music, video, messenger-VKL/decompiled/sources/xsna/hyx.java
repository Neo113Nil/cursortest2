package xsna;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.os.PersistableBundle;
import android.util.Base64;
import android.util.Log;
import com.google.android.datatransport.Priority;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.Set;
import java.util.zip.Adler32;

/* compiled from: JobInfoScheduler.java */
/* loaded from: classes.dex */
public final class hyx implements dxx0 {
    public final Context a;
    public final n0q b;
    public final SchedulerConfig c;

    public hyx(Context context, n0q n0qVar, SchedulerConfig schedulerConfig) {
        this.a = context;
        this.b = n0qVar;
        this.c = schedulerConfig;
    }

    @Override // xsna.dxx0
    public final void a(sop0 sop0Var, int i, boolean z) {
        Context context = this.a;
        ComponentName componentName = new ComponentName(context, (Class<?>) JobInfoSchedulerService.class);
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        Adler32 adler32 = new Adler32();
        adler32.update(context.getPackageName().getBytes(Charset.forName(C.UTF8_NAME)));
        adler32.update(sop0Var.b().getBytes(Charset.forName(C.UTF8_NAME)));
        adler32.update(ByteBuffer.allocate(4).putInt(acd0.a(sop0Var.d())).array());
        if (sop0Var.c() != null) {
            adler32.update(sop0Var.c());
        }
        int value = (int) adler32.getValue();
        if (!z) {
            Iterator<JobInfo> it = jobScheduler.getAllPendingJobs().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                JobInfo next = it.next();
                int i2 = next.getExtras().getInt("attemptNumber");
                if (next.getId() == value) {
                    if (i2 >= i) {
                        b200.a(sop0Var, "JobInfoScheduler", "Upload for context %s is already scheduled. Returning...");
                        return;
                    }
                }
            }
        }
        long e = this.b.e(sop0Var);
        JobInfo.Builder builder = new JobInfo.Builder(value, componentName);
        Priority d = sop0Var.d();
        SchedulerConfig schedulerConfig = this.c;
        builder.setMinimumLatency(schedulerConfig.b(d, e, i));
        Set<SchedulerConfig.Flag> b = schedulerConfig.c().get(d).b();
        if (b.contains(SchedulerConfig.Flag.NETWORK_UNMETERED)) {
            builder.setRequiredNetworkType(2);
        } else {
            builder.setRequiredNetworkType(1);
        }
        if (b.contains(SchedulerConfig.Flag.DEVICE_CHARGING)) {
            builder.setRequiresCharging(true);
        }
        if (b.contains(SchedulerConfig.Flag.DEVICE_IDLE)) {
            builder.setRequiresDeviceIdle(true);
        }
        PersistableBundle persistableBundle = new PersistableBundle();
        persistableBundle.putInt("attemptNumber", i);
        persistableBundle.putString("backendName", sop0Var.b());
        persistableBundle.putInt(HandleInvocationsFromAdViewer.KEY_DOWNLOAD_PRIORITY, acd0.a(sop0Var.d()));
        if (sop0Var.c() != null) {
            persistableBundle.putString(HandleInvocationsFromAdViewer.KEY_EXTRAS, Base64.encodeToString(sop0Var.c(), 0));
        }
        builder.setExtras(persistableBundle);
        Object[] objArr = {sop0Var, Integer.valueOf(value), Long.valueOf(schedulerConfig.b(sop0Var.d(), e, i)), Long.valueOf(e), Integer.valueOf(i)};
        if (Log.isLoggable("TRuntime.".concat("JobInfoScheduler"), 3)) {
            String.format("Scheduling upload for context %s with jobId=%d in %dms(Backend next call timestamp %d). Attempt %d", objArr);
        }
        jobScheduler.schedule(builder.build());
    }

    @Override // xsna.dxx0
    public final void b(sop0 sop0Var, int i) {
        a(sop0Var, i, false);
    }
}
