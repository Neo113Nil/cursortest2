package com.google.android.gms.iid;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.util.Log;
import defpackage.bx91;
import defpackage.v150;
import defpackage.yvi0;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;

/* loaded from: classes11.dex */
public final class zzk implements ServiceConnection {
    private final Intent zzbp;
    private final ScheduledExecutorService zzbq;
    private final Queue<bx91> zzbr;
    private zzi zzbs;
    private boolean zzbt;
    private final Context zzl;

    private zzk(Context context, String str, ScheduledExecutorService scheduledExecutorService) {
        this.zzbr = new ArrayDeque();
        this.zzbt = false;
        Context applicationContext = context.getApplicationContext();
        this.zzl = applicationContext;
        this.zzbp = new Intent(str).setPackage(applicationContext.getPackageName());
        this.zzbq = scheduledExecutorService;
    }

    private final synchronized void zzm() {
        try {
            Log.isLoggable("EnhancedIntentService", 3);
            while (!this.zzbr.isEmpty()) {
                Log.isLoggable("EnhancedIntentService", 3);
                zzi zziVar = this.zzbs;
                if (zziVar == null || !zziVar.isBinderAlive()) {
                    Log.isLoggable("EnhancedIntentService", 3);
                    if (!this.zzbt) {
                        this.zzbt = true;
                        try {
                        } catch (SecurityException e) {
                            Log.e("EnhancedIntentService", "Exception while binding the service", e);
                        }
                        if (yvi0.s().o(this.zzl, this.zzbp, this, 65)) {
                            return;
                        }
                        Log.e("EnhancedIntentService", "binding to the service failed");
                        this.zzbt = false;
                        zzn();
                    }
                    return;
                }
                Log.isLoggable("EnhancedIntentService", 3);
                this.zzbs.zzd(this.zzbr.poll());
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    private final void zzn() {
        while (!this.zzbr.isEmpty()) {
            this.zzbr.poll().a();
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        synchronized (this) {
            try {
                this.zzbt = false;
                this.zzbs = (zzi) iBinder;
                if (Log.isLoggable("EnhancedIntentService", 3)) {
                    new StringBuilder(String.valueOf(componentName).length() + 20);
                }
                if (iBinder == null) {
                    Log.e("EnhancedIntentService", "Null service connection");
                    zzn();
                } else {
                    zzm();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        if (Log.isLoggable("EnhancedIntentService", 3)) {
            new StringBuilder(String.valueOf(componentName).length() + 23);
        }
        zzm();
    }

    public final synchronized void zzd(Intent intent, BroadcastReceiver.PendingResult pendingResult) {
        Log.isLoggable("EnhancedIntentService", 3);
        this.zzbr.add(new bx91(intent, pendingResult, this.zzbq));
        zzm();
    }

    public zzk(Context context, String str) {
        this(context, str, new ScheduledThreadPoolExecutor(0, new v150("EnhancedIntentService")));
    }
}
