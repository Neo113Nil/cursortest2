package androidx.media3.exoplayer.scheduler;

import android.app.job.JobParameters;
import android.app.job.JobService;
import android.content.Intent;
import android.os.PersistableBundle;
import androidx.media3.exoplayer.offline.DownloadService;
import defpackage.lk91;
import defpackage.tw21;

/* loaded from: classes10.dex */
public final class PlatformScheduler$PlatformSchedulerService extends JobService {
    @Override // android.app.job.JobService
    public boolean onStartJob(JobParameters jobParameters) {
        PersistableBundle extras = jobParameters.getExtras();
        int notMetRequirements = new Requirements(extras.getInt(DownloadService.KEY_REQUIREMENTS)).getNotMetRequirements(this);
        if (notMetRequirements != 0) {
            lk91.j("Requirements not met: " + notMetRequirements);
            jobFinished(jobParameters, true);
            return false;
        }
        String string = extras.getString("service_action");
        string.getClass();
        String string2 = extras.getString("service_package");
        string2.getClass();
        tw21.i0(this, new Intent(string).setPackage(string2));
        return false;
    }

    @Override // android.app.job.JobService
    public boolean onStopJob(JobParameters jobParameters) {
        return false;
    }
}
