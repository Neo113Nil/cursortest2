package com.google.android.gms.common.internal;

import android.content.Context;
import android.content.ServiceConnection;
import android.os.Looper;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.internal.common.zzg;
import com.yandex.fintechsdk.adapters.flex.sdk.impl.network.mapi.MapiClientImpl;
import defpackage.cvw;
import defpackage.e3b1;
import defpackage.vkt;
import defpackage.yvi0;
import java.util.HashMap;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class b extends vkt {
    public final HashMap d = new HashMap();
    public final Context e;
    public volatile zzg f;
    public final yvi0 g;
    public final long h;
    public final long i;

    public b(Context context, Looper looper) {
        zzp zzpVar = new zzp(this, null);
        this.e = context.getApplicationContext();
        this.f = new zzg(looper, zzpVar);
        this.g = yvi0.s();
        this.h = 5000L;
        this.i = MapiClientImpl.RETRIES_TIME_MILLIS;
    }

    @Override // defpackage.vkt
    public final ConnectionResult b(e3b1 e3b1Var, zze zzeVar, String str, Executor executor) {
        HashMap hashMap = this.d;
        synchronized (hashMap) {
            try {
                zzo zzoVar = (zzo) hashMap.get(e3b1Var);
                ConnectionResult connectionResult = null;
                if (executor == null) {
                    executor = null;
                }
                if (zzoVar == null) {
                    zzoVar = new zzo(this, e3b1Var);
                    zzoVar.zzb(zzeVar, zzeVar, str);
                    connectionResult = zzoVar.zzj(str, executor);
                    hashMap.put(e3b1Var, zzoVar);
                } else {
                    this.f.removeMessages(0, e3b1Var);
                    if (zzoVar.zzf(zzeVar)) {
                        String e3b1Var2 = e3b1Var.toString();
                        StringBuilder sb = new StringBuilder(e3b1Var2.length() + 81);
                        sb.append("Trying to bind a GmsServiceConnection that was already connected before.  config=");
                        sb.append(e3b1Var2);
                        throw new IllegalStateException(sb.toString());
                    }
                    zzoVar.zzb(zzeVar, zzeVar, str);
                    int zze = zzoVar.zze();
                    if (zze == 1) {
                        zzeVar.onServiceConnected(zzoVar.zzi(), zzoVar.zzh());
                    } else if (zze == 2) {
                        connectionResult = zzoVar.zzj(str, executor);
                    }
                }
                if (zzoVar.zzd()) {
                    return ConnectionResult.RESULT_SUCCESS;
                }
                if (connectionResult == null) {
                    connectionResult = new ConnectionResult(-1);
                }
                return connectionResult;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.vkt
    public final void c(e3b1 e3b1Var, ServiceConnection serviceConnection, String str) {
        cvw.m(serviceConnection, "ServiceConnection must not be null");
        HashMap hashMap = this.d;
        synchronized (hashMap) {
            try {
                zzo zzoVar = (zzo) hashMap.get(e3b1Var);
                if (zzoVar == null) {
                    String e3b1Var2 = e3b1Var.toString();
                    StringBuilder sb = new StringBuilder(e3b1Var2.length() + 50);
                    sb.append("Nonexistent connection status for service config: ");
                    sb.append(e3b1Var2);
                    throw new IllegalStateException(sb.toString());
                }
                if (!zzoVar.zzf(serviceConnection)) {
                    String e3b1Var3 = e3b1Var.toString();
                    StringBuilder sb2 = new StringBuilder(e3b1Var3.length() + 76);
                    sb2.append("Trying to unbind a GmsServiceConnection  that was not bound before.  config=");
                    sb2.append(e3b1Var3);
                    throw new IllegalStateException(sb2.toString());
                }
                zzoVar.zzc(serviceConnection, str);
                if (zzoVar.zzg()) {
                    this.f.sendMessageDelayed(this.f.obtainMessage(0, e3b1Var), this.h);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
