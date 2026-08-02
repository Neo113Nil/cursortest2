package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Build;
import android.os.IBinder;
import android.os.StrictMode;
import com.google.android.gms.common.ConnectionResult;
import defpackage.e3b1;
import defpackage.m591;
import defpackage.rjb1;
import defpackage.sc91;
import defpackage.yvi0;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;

/* loaded from: classes11.dex */
final class zzo implements ServiceConnection, rjb1 {
    final /* synthetic */ b zza;
    private final Map zzb;
    private int zzc;
    private boolean zzd;
    private IBinder zze;
    private final e3b1 zzf;
    private ComponentName zzg;

    public zzo(b bVar, e3b1 e3b1Var) {
        Objects.requireNonNull(bVar);
        this.zza = bVar;
        this.zzf = e3b1Var;
        this.zzb = new HashMap();
        this.zzc = 2;
    }

    @Override // android.content.ServiceConnection
    public final void onBindingDied(ComponentName componentName) {
        onServiceDisconnected(componentName);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        b bVar = this.zza;
        synchronized (bVar.d) {
            try {
                bVar.f.removeMessages(1, this.zzf);
                this.zze = iBinder;
                this.zzg = componentName;
                Iterator it = this.zzb.values().iterator();
                while (it.hasNext()) {
                    ((ServiceConnection) it.next()).onServiceConnected(componentName, iBinder);
                }
                this.zzc = 1;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        b bVar = this.zza;
        synchronized (bVar.d) {
            try {
                bVar.f.removeMessages(1, this.zzf);
                this.zze = null;
                this.zzg = componentName;
                Iterator it = this.zzb.values().iterator();
                while (it.hasNext()) {
                    ((ServiceConnection) it.next()).onServiceDisconnected(componentName);
                }
                this.zzc = 2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void zza(String str) {
        e3b1 e3b1Var = this.zzf;
        b bVar = this.zza;
        bVar.f.removeMessages(1, e3b1Var);
        bVar.g.w(bVar.e, this);
        this.zzd = false;
        this.zzc = 2;
    }

    public final void zzb(ServiceConnection serviceConnection, ServiceConnection serviceConnection2, String str) {
        this.zzb.put(serviceConnection, serviceConnection2);
    }

    public final void zzc(ServiceConnection serviceConnection, String str) {
        this.zzb.remove(serviceConnection);
    }

    public final boolean zzd() {
        return this.zzd;
    }

    public final int zze() {
        return this.zzc;
    }

    public final boolean zzf(ServiceConnection serviceConnection) {
        return this.zzb.containsKey(serviceConnection);
    }

    public final boolean zzg() {
        return this.zzb.isEmpty();
    }

    public final IBinder zzh() {
        return this.zze;
    }

    public final ComponentName zzi() {
        return this.zzg;
    }

    public final ConnectionResult zzj(String str, Executor executor) {
        try {
            Intent a = m591.a(this.zza.e, this.zzf);
            this.zzc = 3;
            StrictMode.VmPolicy vmPolicy = StrictMode.getVmPolicy();
            if (Build.VERSION.SDK_INT >= 31) {
                StrictMode.setVmPolicy(sc91.a(new StrictMode.VmPolicy.Builder(vmPolicy)).build());
            }
            try {
                b bVar = this.zza;
                yvi0 yvi0Var = bVar.g;
                Context context = bVar.e;
                e3b1 e3b1Var = this.zzf;
                boolean x = yvi0Var.x(context, str, a, this, 4225, executor);
                this.zzd = x;
                if (x) {
                    bVar.f.sendMessageDelayed(bVar.f.obtainMessage(1, e3b1Var), bVar.i);
                    ConnectionResult connectionResult = ConnectionResult.RESULT_SUCCESS;
                    StrictMode.setVmPolicy(vmPolicy);
                    return connectionResult;
                }
                this.zzc = 2;
                try {
                    bVar.g.w(bVar.e, this);
                } catch (IllegalArgumentException unused) {
                }
                ConnectionResult connectionResult2 = new ConnectionResult(16);
                StrictMode.setVmPolicy(vmPolicy);
                return connectionResult2;
            } catch (Throwable th) {
                StrictMode.setVmPolicy(vmPolicy);
                throw th;
            }
        } catch (zzaf e) {
            return e.zza;
        }
    }
}
