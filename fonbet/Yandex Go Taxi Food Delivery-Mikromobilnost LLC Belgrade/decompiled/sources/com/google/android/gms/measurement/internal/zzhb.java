package com.google.android.gms.measurement.internal;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import defpackage.cvw;
import defpackage.f3a1;
import ru.yandex.yx_platform_api.InternetConnectionStreamHandler;

/* loaded from: classes.dex */
final class zzhb extends BroadcastReceiver {
    private final n zza;
    private boolean zzb;
    private boolean zzc;

    public zzhb(n nVar) {
        cvw.l(nVar);
        this.zza = nVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        n nVar = this.zza;
        nVar.f0();
        String action = intent.getAction();
        nVar.B0().H.b(action, "NetworkBroadcastReceiver received action");
        if (!InternetConnectionStreamHandler.CONNECTIVITY_ACTION.equals(action)) {
            nVar.B0().C.b(action, "NetworkBroadcastReceiver received unknown action");
            return;
        }
        f3a1 f3a1Var = nVar.b;
        n.O(f3a1Var);
        boolean ah = f3a1Var.ah();
        if (this.zzc != ah) {
            this.zzc = ah;
            nVar.M1().Pg(new d(this, ah));
        }
    }

    public final void zza() {
        n nVar = this.zza;
        nVar.f0();
        nVar.M1().Gg();
        if (this.zzb) {
            return;
        }
        nVar.E.a.registerReceiver(this, new IntentFilter(InternetConnectionStreamHandler.CONNECTIVITY_ACTION));
        f3a1 f3a1Var = nVar.b;
        n.O(f3a1Var);
        this.zzc = f3a1Var.ah();
        nVar.B0().H.b(Boolean.valueOf(this.zzc), "Registering connectivity change receiver. Network connected");
        this.zzb = true;
    }

    public final void zzb() {
        n nVar = this.zza;
        nVar.f0();
        nVar.M1().Gg();
        nVar.M1().Gg();
        if (this.zzb) {
            nVar.B0().H.a("Unregistering connectivity change receiver");
            this.zzb = false;
            this.zzc = false;
            try {
                nVar.E.a.unregisterReceiver(this);
            } catch (IllegalArgumentException e) {
                this.zza.B0().z.b(e, "Failed to unregister the network broadcast receiver");
            }
        }
    }

    public final /* synthetic */ n zzc() {
        return this.zza;
    }
}
