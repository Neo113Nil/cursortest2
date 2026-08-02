package com.google.android.gms.iid;

import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import android.util.Log;
import androidx.legacy.content.WakefulBroadcastReceiver;
import defpackage.ju61;
import defpackage.v150;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes11.dex */
public abstract class zze extends Service {
    private final Object lock;
    final ExecutorService zzbb;
    private Binder zzbc;
    private int zzbd;
    private int zzbe;

    public zze() {
        v150 v150Var = new v150("EnhancedIntentService");
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), v150Var);
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        this.zzbb = Executors.unconfigurableExecutorService(threadPoolExecutor);
        this.lock = new Object();
        this.zzbe = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzf(Intent intent) {
        if (intent != null) {
            WakefulBroadcastReceiver.completeWakefulIntent(intent);
        }
        synchronized (this.lock) {
            try {
                int i = this.zzbe - 1;
                this.zzbe = i;
                if (i == 0) {
                    stopSelfResult(this.zzbd);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public abstract void handleIntent(Intent intent);

    @Override // android.app.Service
    public final synchronized IBinder onBind(Intent intent) {
        try {
            Log.isLoggable("EnhancedIntentService", 3);
            if (this.zzbc == null) {
                this.zzbc = new zzi(this);
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.zzbc;
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        synchronized (this.lock) {
            this.zzbd = i2;
            this.zzbe++;
        }
        if (intent == null) {
            zzf(intent);
            return 2;
        }
        this.zzbb.execute(new ju61(this, intent, intent, false, 7));
        return 3;
    }
}
