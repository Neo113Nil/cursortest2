package com.google.android.gms.measurement;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.legacy.content.WakefulBroadcastReceiver;
import com.google.android.gms.measurement.internal.g;
import defpackage.l1a1;
import defpackage.o6a1;
import defpackage.y1a1;

/* loaded from: classes11.dex */
public final class AppMeasurementReceiver extends WakefulBroadcastReceiver {
    private o6a1 zza;

    public BroadcastReceiver.PendingResult doGoAsync() {
        return goAsync();
    }

    public void doStartService(Context context, Intent intent) {
        WakefulBroadcastReceiver.startWakefulService(context, intent);
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        if (this.zza == null) {
            this.zza = new o6a1(this);
        }
        o6a1 o6a1Var = this.zza;
        o6a1Var.getClass();
        y1a1 y1a1Var = g.m(context, null, null).y;
        g.g(y1a1Var);
        l1a1 l1a1Var = y1a1Var.H;
        l1a1 l1a1Var2 = y1a1Var.C;
        if (intent == null) {
            l1a1Var2.a("Receiver called with null intent");
            return;
        }
        String action = intent.getAction();
        l1a1Var.b(action, "Local receiver got");
        if (!"com.google.android.gms.measurement.UPLOAD".equals(action)) {
            if ("com.android.vending.INSTALL_REFERRER".equals(action)) {
                l1a1Var2.a("Install Referrer Broadcasts are deprecated");
            }
        } else {
            Intent className = new Intent().setClassName(context, "com.google.android.gms.measurement.AppMeasurementService");
            className.setAction("com.google.android.gms.measurement.UPLOAD");
            l1a1Var.a("Starting wakeful intent.");
            o6a1Var.a.doStartService(context, className);
        }
    }
}
