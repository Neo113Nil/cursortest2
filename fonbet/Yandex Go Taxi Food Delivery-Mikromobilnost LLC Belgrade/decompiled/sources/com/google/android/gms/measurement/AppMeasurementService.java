package com.google.android.gms.measurement;

import android.app.Service;
import android.app.job.JobParameters;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;
import androidx.legacy.content.WakefulBroadcastReceiver;
import com.google.android.gms.measurement.internal.g;
import com.google.android.gms.measurement.internal.n;
import com.google.android.gms.measurement.internal.zzjd;
import defpackage.a6b1;
import defpackage.do91;
import defpackage.t6b1;
import defpackage.wz;
import defpackage.y1a1;

/* loaded from: classes.dex */
public final class AppMeasurementService extends Service implements a6b1 {
    private t6b1 zza;

    private final t6b1 zzd() {
        if (this.zza == null) {
            this.zza = new t6b1(this);
        }
        return this.zza;
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        t6b1 zzd = zzd();
        zzd.getClass();
        if (intent == null) {
            Log.e("FA", "onBind called with null intent");
            return null;
        }
        if ("com.google.android.gms.measurement.START".equals(intent.getAction())) {
            return new zzjd(n.x(zzd.a), null);
        }
        return null;
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

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i, int i2) {
        t6b1 zzd = zzd();
        if (intent == null) {
            zzd.getClass();
            return 2;
        }
        Service service = zzd.a;
        y1a1 y1a1Var = g.m(service, null, null).y;
        g.g(y1a1Var);
        String action = intent.getAction();
        y1a1Var.H.c("Local AppMeasurementService called. startId, action", Integer.valueOf(i2), action);
        if (!"com.google.android.gms.measurement.UPLOAD".equals(action)) {
            return 2;
        }
        wz wzVar = new wz(zzd, i2, y1a1Var, intent, 3);
        n x = n.x(service);
        x.M1().Pg(new do91(29, zzd, x, wzVar));
        return 2;
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
        return stopSelfResult(i);
    }

    @Override // defpackage.a6b1
    public final void zzb(JobParameters jobParameters, boolean z) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.a6b1
    public final void zzc(Intent intent) {
        WakefulBroadcastReceiver.completeWakefulIntent(intent);
    }
}
