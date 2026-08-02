package com.google.android.gms.measurement;

import android.app.Service;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.content.Intent;
import android.util.Log;
import com.google.android.gms.internal.measurement.a;
import com.google.android.gms.internal.measurement.e;
import com.google.android.gms.measurement.internal.n;
import defpackage.a6b1;
import defpackage.cvw;
import defpackage.do91;
import defpackage.j6b1;
import defpackage.ju61;
import defpackage.rms;
import defpackage.t6b1;
import defpackage.y1a1;
import java.util.Objects;

/* loaded from: classes.dex */
public final class AppMeasurementJobService extends JobService implements a6b1 {
    private t6b1 zza;

    private final t6b1 zzd() {
        if (this.zza == null) {
            this.zza = new t6b1(this);
        }
        return this.zza;
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        zzd().a.getClass();
    }

    @Override // android.app.Service
    public void onDestroy() {
        zzd().a.getClass();
        super.onDestroy();
    }

    @Override // android.app.Service
    public void onRebind(Intent intent) {
        zzd();
        if (intent == null) {
            Log.e("FA", "onRebind called with null intent");
        } else {
            intent.getAction();
        }
    }

    @Override // android.app.job.JobService
    public boolean onStartJob(JobParameters jobParameters) {
        t6b1 zzd = zzd();
        Service service = zzd.a;
        String string = jobParameters.getExtras().getString("action");
        if (Objects.equals(string, "com.google.android.gms.measurement.UPLOAD")) {
            cvw.l(string);
            n x = n.x(service);
            y1a1 B0 = x.B0();
            rms rmsVar = x.E.c;
            B0.H.b(string, "Local AppMeasurementJobService called. action");
            x.M1().Pg(new do91(29, zzd, x, new ju61(14, zzd, B0, jobParameters)));
        }
        if (!Objects.equals(string, "com.google.android.gms.measurement.SCION_UPLOAD")) {
            return true;
        }
        cvw.l(string);
        e c = e.c(service, null);
        j6b1 j6b1Var = new j6b1(0, zzd, jobParameters);
        c.getClass();
        c.a(new a(c, j6b1Var));
        return true;
    }

    @Override // android.app.job.JobService
    public boolean onStopJob(JobParameters jobParameters) {
        return false;
    }

    @Override // android.app.Service
    public boolean onUnbind(Intent intent) {
        zzd();
        if (intent == null) {
            Log.e("FA", "onUnbind called with null intent");
            return true;
        }
        intent.getAction();
        return true;
    }

    @Override // defpackage.a6b1
    public final boolean zza(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.a6b1
    public final void zzb(JobParameters jobParameters, boolean z) {
        jobFinished(jobParameters, false);
    }

    @Override // defpackage.a6b1
    public final void zzc(Intent intent) {
    }
}
