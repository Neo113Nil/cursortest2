package defpackage;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.app.job.JobScheduler;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.measurement.internal.g;
import com.google.android.gms.measurement.internal.n;

/* loaded from: classes.dex */
public final class n9b1 extends sab1 {
    public final AlarmManager x;
    public s7b1 y;
    public Integer z;

    public n9b1(n nVar) {
        super(nVar);
        this.x = (AlarmManager) ((g) this.b).a.getSystemService("alarm");
    }

    @Override // defpackage.sab1
    public final void Jg() {
        AlarmManager alarmManager = this.x;
        if (alarmManager != null) {
            Context context = ((g) this.b).a;
            alarmManager.cancel(PendingIntent.getBroadcast(context, 0, new Intent().setClassName(context, "com.google.android.gms.measurement.AppMeasurementReceiver").setAction("com.google.android.gms.measurement.UPLOAD"), vd91.a));
        }
        Mg();
    }

    public final void Kg() {
        Hg();
        g gVar = (g) this.b;
        y1a1 y1a1Var = gVar.y;
        g.g(y1a1Var);
        y1a1Var.H.a("Unscheduling upload");
        AlarmManager alarmManager = this.x;
        if (alarmManager != null) {
            Context context = gVar.a;
            alarmManager.cancel(PendingIntent.getBroadcast(context, 0, new Intent().setClassName(context, "com.google.android.gms.measurement.AppMeasurementReceiver").setAction("com.google.android.gms.measurement.UPLOAD"), vd91.a));
        }
        Lg().c();
        Mg();
    }

    public final u791 Lg() {
        if (this.y == null) {
            this.y = new s7b1(this, this.c.E, 1);
        }
        return this.y;
    }

    public final void Mg() {
        JobScheduler jobScheduler = (JobScheduler) ((g) this.b).a.getSystemService("jobscheduler");
        if (jobScheduler != null) {
            jobScheduler.cancel(Ng());
        }
    }

    public final int Ng() {
        if (this.z == null) {
            this.z = Integer.valueOf("measurement".concat(String.valueOf(((g) this.b).a.getPackageName())).hashCode());
        }
        return this.z.intValue();
    }
}
