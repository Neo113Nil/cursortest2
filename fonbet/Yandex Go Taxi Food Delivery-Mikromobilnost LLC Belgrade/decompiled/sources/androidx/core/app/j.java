package androidx.core.app;

import android.app.job.JobParameters;
import android.app.job.JobWorkItem;
import android.content.Intent;
import androidx.core.app.JobIntentService;

/* loaded from: classes.dex */
public final class j implements i {
    public final JobWorkItem a;
    public final /* synthetic */ JobIntentService.JobServiceEngineImpl b;

    public j(JobIntentService.JobServiceEngineImpl jobServiceEngineImpl, JobWorkItem jobWorkItem) {
        this.b = jobServiceEngineImpl;
        this.a = jobWorkItem;
    }

    @Override // androidx.core.app.i
    public final void e() {
        synchronized (this.b.mLock) {
            try {
                JobParameters jobParameters = this.b.mParams;
                if (jobParameters != null) {
                    jobParameters.completeWork(this.a);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.core.app.i
    public final Intent getIntent() {
        return this.a.getIntent();
    }
}
