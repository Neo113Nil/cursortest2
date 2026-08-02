package xsna;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.app.job.JobScheduler;
import android.content.Context;
import android.content.Intent;
import androidx.core.app.NotificationCompat;
import com.google.android.gms.internal.measurement.zzbs;

/* compiled from: com.google.android.gms:play-services-measurement@@21.2.0 */
/* loaded from: classes13.dex */
public final class ij01 extends kj01 {
    public final AlarmManager g;
    public hj01 h;
    public Integer i;

    public ij01(qj01 qj01Var) {
        super(qj01Var);
        this.g = (AlarmManager) ((mb01) this.b).b.getSystemService(NotificationCompat.CATEGORY_ALARM);
    }

    @Override // xsna.kj01
    public final void n() {
        mb01 mb01Var = (mb01) this.b;
        AlarmManager alarmManager = this.g;
        if (alarmManager != null) {
            Context context = mb01Var.b;
            alarmManager.cancel(PendingIntent.getBroadcast(context, 0, new Intent().setClassName(context, "com.google.android.gms.measurement.AppMeasurementReceiver").setAction("com.google.android.gms.measurement.UPLOAD"), zzbs.zza));
        }
        JobScheduler jobScheduler = (JobScheduler) mb01Var.b.getSystemService("jobscheduler");
        if (jobScheduler != null) {
            jobScheduler.cancel(p());
        }
    }

    public final void o() {
        l();
        mb01 mb01Var = (mb01) this.b;
        k901 k901Var = mb01Var.j;
        mb01.k(k901Var);
        k901Var.q.a("Unscheduling upload");
        AlarmManager alarmManager = this.g;
        if (alarmManager != null) {
            Context context = mb01Var.b;
            alarmManager.cancel(PendingIntent.getBroadcast(context, 0, new Intent().setClassName(context, "com.google.android.gms.measurement.AppMeasurementReceiver").setAction("com.google.android.gms.measurement.UPLOAD"), zzbs.zza));
        }
        q().a();
        JobScheduler jobScheduler = (JobScheduler) mb01Var.b.getSystemService("jobscheduler");
        if (jobScheduler != null) {
            jobScheduler.cancel(p());
        }
    }

    public final int p() {
        if (this.i == null) {
            this.i = Integer.valueOf("measurement".concat(String.valueOf(((mb01) this.b).b.getPackageName())).hashCode());
        }
        return this.i.intValue();
    }

    public final oyz0 q() {
        if (this.h == null) {
            this.h = new hj01(this, this.e.m);
        }
        return this.h;
    }
}
