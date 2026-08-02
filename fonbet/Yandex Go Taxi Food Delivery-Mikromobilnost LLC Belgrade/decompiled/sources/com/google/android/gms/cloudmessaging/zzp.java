package com.google.android.gms.cloudmessaging;

import android.content.ComponentName;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.util.Log;
import android.util.SparseArray;
import com.google.android.gms.internal.cloudmessaging.zzf;
import defpackage.c8b1;
import defpackage.cvw;
import defpackage.gnb1;
import defpackage.xfb1;
import defpackage.yvi0;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Queue;
import java.util.concurrent.TimeUnit;

/* loaded from: classes11.dex */
final class zzp implements ServiceConnection {
    xfb1 zzc;
    final /* synthetic */ d zzf;
    int zza = 0;
    final Messenger zzb = new Messenger(new zzf(Looper.getMainLooper(), new Handler.Callback() { // from class: com.google.android.gms.cloudmessaging.zzm
        @Override // android.os.Handler.Callback
        public final boolean handleMessage(Message message) {
            int i = message.arg1;
            Log.isLoggable("MessengerIpcClient", 3);
            zzp zzpVar = zzp.this;
            synchronized (zzpVar) {
                try {
                    gnb1 gnb1Var = (gnb1) zzpVar.zze.get(i);
                    if (gnb1Var == null) {
                        return true;
                    }
                    zzpVar.zze.remove(i);
                    zzpVar.zzf();
                    Bundle data = message.getData();
                    if (data.getBoolean("unsupported", false)) {
                        gnb1Var.c(new zzt("Not supported by GmsCore", null));
                        return true;
                    }
                    gnb1Var.a(data);
                    return true;
                } finally {
                }
            }
        }
    }));
    final Queue zzd = new ArrayDeque();
    final SparseArray zze = new SparseArray();

    public /* synthetic */ zzp(d dVar, c8b1 c8b1Var) {
        this.zzf = dVar;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        Log.isLoggable("MessengerIpcClient", 2);
        this.zzf.b.execute(new b(this, iBinder, 0));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        Log.isLoggable("MessengerIpcClient", 2);
        this.zzf.b.execute(new c(this, 2));
    }

    public final synchronized void zza(int i, String str) {
        zzb(i, str, null);
    }

    public final synchronized void zzb(int i, String str, Throwable th) {
        Log.isLoggable("MessengerIpcClient", 3);
        int i2 = this.zza;
        if (i2 == 0) {
            throw new IllegalStateException();
        }
        if (i2 != 1 && i2 != 2) {
            if (i2 != 3) {
                return;
            }
            this.zza = 4;
            return;
        }
        Log.isLoggable("MessengerIpcClient", 2);
        this.zza = 4;
        yvi0.s().w(this.zzf.a, this);
        zzt zztVar = new zzt(str, th);
        Iterator it = this.zzd.iterator();
        while (it.hasNext()) {
            ((gnb1) it.next()).c(zztVar);
        }
        this.zzd.clear();
        int i3 = 0;
        while (true) {
            int size = this.zze.size();
            SparseArray sparseArray = this.zze;
            if (i3 >= size) {
                sparseArray.clear();
                return;
            } else {
                ((gnb1) sparseArray.valueAt(i3)).c(zztVar);
                i3++;
            }
        }
    }

    public final void zzc() {
        this.zzf.b.execute(new c(this, 0));
    }

    public final synchronized void zzd() {
        if (this.zza == 1) {
            zza(1, "Timed out while binding");
        }
    }

    public final synchronized void zze(int i) {
        gnb1 gnb1Var = (gnb1) this.zze.get(i);
        if (gnb1Var != null) {
            this.zze.remove(i);
            gnb1Var.c(new zzt("Timed out waiting for response", null));
            zzf();
        }
    }

    public final synchronized void zzf() {
        if (this.zza == 2 && this.zzd.isEmpty() && this.zze.size() == 0) {
            Log.isLoggable("MessengerIpcClient", 2);
            this.zza = 3;
            yvi0.s().w(this.zzf.a, this);
        }
    }

    public final synchronized boolean zzg(gnb1 gnb1Var) {
        int i = this.zza;
        int i2 = 1;
        if (i != 0) {
            if (i == 1) {
                this.zzd.add(gnb1Var);
                return true;
            }
            if (i != 2) {
                return false;
            }
            this.zzd.add(gnb1Var);
            zzc();
            return true;
        }
        this.zzd.add(gnb1Var);
        cvw.o(this.zza == 0);
        Log.isLoggable("MessengerIpcClient", 2);
        this.zza = 1;
        Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
        intent.setPackage("com.google.android.gms");
        try {
            if (yvi0.s().o(this.zzf.a, intent, this, 1)) {
                this.zzf.b.schedule(new c(this, i2), 30L, TimeUnit.SECONDS);
            } else {
                zza(0, "Unable to bind to service");
            }
        } catch (SecurityException e) {
            zzb(0, "Unable to bind to service", e);
        }
        return true;
    }
}
