package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.app.job.JobParameters;
import android.app.job.JobService;
import android.util.Base64;
import defpackage.a94;
import defpackage.i3f0;
import defpackage.iy2;
import defpackage.ny61;
import defpackage.td21;
import defpackage.v111;
import defpackage.wd21;
import defpackage.z811;

/* loaded from: classes.dex */
public class JobInfoSchedulerService extends JobService {
    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onStartJob$0(JobParameters jobParameters) {
        jobFinished(jobParameters, false);
    }

    @Override // android.app.job.JobService
    public boolean onStartJob(JobParameters jobParameters) {
        String string = jobParameters.getExtras().getString("backendName");
        String string2 = jobParameters.getExtras().getString("extras");
        int i = jobParameters.getExtras().getInt("priority");
        int i2 = jobParameters.getExtras().getInt("attemptNumber");
        z811.b(getApplicationContext());
        a94 a = v111.a();
        if (string == null) {
            ny61.t("Null backendName");
            return false;
        }
        a.a = string;
        a.c = i3f0.b(i);
        if (string2 != null) {
            a.b = Base64.decode(string2, 0);
        }
        wd21 wd21Var = z811.a().d;
        wd21Var.e.execute(new td21(wd21Var, a.a(), i2, new iy2(19, this, jobParameters)));
        return true;
    }

    @Override // android.app.job.JobService
    public boolean onStopJob(JobParameters jobParameters) {
        return true;
    }
}
