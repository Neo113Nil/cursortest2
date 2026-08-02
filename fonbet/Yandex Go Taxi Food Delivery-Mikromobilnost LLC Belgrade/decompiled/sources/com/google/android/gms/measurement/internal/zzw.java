package com.google.android.gms.measurement.internal;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import defpackage.aaa1;
import defpackage.eib1;
import defpackage.h7b1;
import defpackage.nw91;
import defpackage.y1a1;

/* loaded from: classes11.dex */
public final class zzw extends BroadcastReceiver {
    private final g zza;

    public zzw(g gVar) {
        this.zza = gVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (intent == null) {
            y1a1 y1a1Var = this.zza.y;
            g.g(y1a1Var);
            y1a1Var.C.a("App receiver called with null intent");
            return;
        }
        String action = intent.getAction();
        if (action == null) {
            y1a1 y1a1Var2 = this.zza.y;
            g.g(y1a1Var2);
            y1a1Var2.C.a("App receiver called with null action");
            return;
        }
        int hashCode = action.hashCode();
        if (hashCode != -1928239649) {
            if (hashCode == 1279883384 && action.equals("com.google.android.gms.measurement.BATCHES_AVAILABLE")) {
                g gVar = this.zza;
                y1a1 y1a1Var3 = gVar.y;
                g.g(y1a1Var3);
                y1a1Var3.H.a("[sgtm] App Receiver notified batches are available");
                aaa1 aaa1Var = gVar.z;
                g.g(aaa1Var);
                aaa1Var.Pg(new h7b1(1, this));
                return;
            }
        } else if (action.equals("com.google.android.gms.measurement.TRIGGERS_AVAILABLE")) {
            g gVar2 = this.zza;
            eib1.a();
            if (gVar2.w.Qg(null, nw91.Q0)) {
                y1a1 y1a1Var4 = gVar2.y;
                g.g(y1a1Var4);
                y1a1Var4.H.a("App receiver notified triggers are available");
                aaa1 aaa1Var2 = gVar2.z;
                g.g(aaa1Var2);
                aaa1Var2.Pg(new h7b1(2, gVar2));
                return;
            }
            return;
        }
        y1a1 y1a1Var5 = this.zza.y;
        g.g(y1a1Var5);
        y1a1Var5.C.a("App receiver called with unknown action");
    }

    public final void zza() {
        g gVar = this.zza;
        g.d(gVar.N);
        gVar.N.Kg(((Long) nw91.D.a(null)).longValue());
    }
}
