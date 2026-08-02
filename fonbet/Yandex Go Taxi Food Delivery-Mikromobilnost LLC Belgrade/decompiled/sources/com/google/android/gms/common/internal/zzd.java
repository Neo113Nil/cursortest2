package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.util.Log;
import defpackage.cvw;
import defpackage.fr91;
import defpackage.mwk0;

/* loaded from: classes11.dex */
public final class zzd extends zzz {
    private a zza;
    private final int zzb;

    public zzd(a aVar, int i) {
        this.zza = aVar;
        this.zzb = i;
    }

    @Override // com.google.android.gms.common.internal.zzz, com.google.android.gms.common.internal.IGmsCallbacks
    public final void onPostInitComplete(int i, IBinder iBinder, Bundle bundle) {
        cvw.m(this.zza, "onPostInitComplete can be called only once per call to getRemoteService");
        a aVar = this.zza;
        int i2 = this.zzb;
        aVar.getClass();
        fr91 fr91Var = new fr91(aVar, i, iBinder, bundle);
        Handler handler = aVar.D;
        handler.sendMessage(handler.obtainMessage(1, i2, -1, fr91Var));
        this.zza = null;
    }

    @Override // com.google.android.gms.common.internal.zzz, com.google.android.gms.common.internal.IGmsCallbacks
    public final void zzb(int i, Bundle bundle) {
        Log.wtf("GmsClient", "received deprecated onAccountValidationComplete callback, ignoring", new Exception());
    }

    @Override // com.google.android.gms.common.internal.zzz, com.google.android.gms.common.internal.IGmsCallbacks
    public final void zzc(int i, IBinder iBinder, zzj zzjVar) {
        a aVar = this.zza;
        cvw.m(aVar, "onPostInitCompleteWithConnectionInfo can be called only once per call togetRemoteService");
        cvw.l(zzjVar);
        aVar.T = zzjVar;
        if (aVar.p()) {
            ConnectionTelemetryConfiguration connectionTelemetryConfiguration = zzjVar.zzd;
            mwk0 b = mwk0.b();
            RootTelemetryConfiguration zza = connectionTelemetryConfiguration == null ? null : connectionTelemetryConfiguration.zza();
            synchronized (b) {
                if (zza == null) {
                    zza = mwk0.c;
                } else {
                    RootTelemetryConfiguration rootTelemetryConfiguration = b.a;
                    if (rootTelemetryConfiguration != null) {
                        if (rootTelemetryConfiguration.getVersion() < zza.getVersion()) {
                        }
                    }
                }
                b.a = zza;
            }
        }
        onPostInitComplete(i, iBinder, zzjVar.zza);
    }
}
