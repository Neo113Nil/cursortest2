package com.google.firebase.messaging;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.PowerManager;
import android.util.Log;
import defpackage.dxz0;
import defpackage.u820;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import ru.yandex.yx_platform_api.InternetConnectionStreamHandler;

/* loaded from: classes11.dex */
public final class c implements Runnable {
    public static Boolean A;
    public static final Object y = new Object();
    public static Boolean z;
    public final Context a;
    public final u820 b;
    public final PowerManager.WakeLock c;
    public final dxz0 w;
    public final long x;

    public c(dxz0 dxz0Var, Context context, u820 u820Var, long j) {
        this.w = dxz0Var;
        this.a = context;
        this.x = j;
        this.b = u820Var;
        this.c = ((PowerManager) context.getSystemService("power")).newWakeLock(1, "wake:com.google.firebase.messaging");
    }

    public static boolean a(Context context) {
        boolean booleanValue;
        synchronized (y) {
            try {
                Boolean bool = A;
                if (bool != null) {
                    booleanValue = bool.booleanValue();
                } else if (bool != null) {
                    booleanValue = bool.booleanValue();
                } else {
                    booleanValue = context.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") == 0;
                    if (!booleanValue) {
                        Log.isLoggable("FirebaseMessaging", 3);
                    }
                }
                A = Boolean.valueOf(booleanValue);
            } catch (Throwable th) {
                throw th;
            }
        }
        return booleanValue;
    }

    public static boolean b(Context context) {
        boolean booleanValue;
        synchronized (y) {
            try {
                Boolean bool = z;
                if (bool != null) {
                    booleanValue = bool.booleanValue();
                } else if (bool != null) {
                    booleanValue = bool.booleanValue();
                } else {
                    booleanValue = context.checkCallingOrSelfPermission("android.permission.WAKE_LOCK") == 0;
                    if (!booleanValue) {
                        Log.isLoggable("FirebaseMessaging", 3);
                    }
                }
                z = Boolean.valueOf(booleanValue);
            } catch (Throwable th) {
                throw th;
            }
        }
        return booleanValue;
    }

    public final synchronized boolean c() {
        boolean z2;
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) this.a.getSystemService("connectivity");
            NetworkInfo activeNetworkInfo = connectivityManager != null ? connectivityManager.getActiveNetworkInfo() : null;
            if (activeNetworkInfo != null) {
                z2 = activeNetworkInfo.isConnected();
            }
        } catch (Throwable th) {
            throw th;
        }
        return z2;
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Type inference failed for: r5v8, types: [com.google.firebase.messaging.TopicsSyncTask$ConnectivityChangeReceiver] */
    @Override // java.lang.Runnable
    public final void run() {
        dxz0 dxz0Var = this.w;
        Context context = this.a;
        boolean b = b(context);
        PowerManager.WakeLock wakeLock = this.c;
        if (b) {
            wakeLock.acquire(180000L);
        }
        try {
            try {
                try {
                    dxz0Var.d(true);
                    if (!this.b.c()) {
                        dxz0Var.d(false);
                        if (b(context)) {
                            try {
                                wakeLock.release();
                                return;
                            } catch (RuntimeException unused) {
                                Log.i("FirebaseMessaging", "TopicsSyncTask's wakelock was already released due to timeout.");
                                return;
                            }
                        }
                        return;
                    }
                    if (!a(context) || c()) {
                        if (dxz0Var.e()) {
                            dxz0Var.d(false);
                        } else {
                            dxz0Var.f(this.x);
                        }
                        if (b(context)) {
                            wakeLock.release();
                            return;
                        }
                        return;
                    }
                    new BroadcastReceiver(this) { // from class: com.google.firebase.messaging.TopicsSyncTask$ConnectivityChangeReceiver
                        private c task;

                        {
                            this.task = this;
                        }

                        @Override // android.content.BroadcastReceiver
                        public synchronized void onReceive(Context context2, Intent intent) {
                            c cVar = this.task;
                            if (cVar == null) {
                                return;
                            }
                            if (cVar.c()) {
                                Log.isLoggable("FirebaseMessaging", 3);
                                c cVar2 = this.task;
                                cVar2.w.f.schedule(cVar2, 0L, TimeUnit.SECONDS);
                                context2.unregisterReceiver(this);
                                this.task = null;
                            }
                        }

                        public void registerReceiver() {
                            Log.isLoggable("FirebaseMessaging", 3);
                            c.this.a.registerReceiver(this, new IntentFilter(InternetConnectionStreamHandler.CONNECTIVITY_ACTION));
                        }
                    }.registerReceiver();
                    if (b(context)) {
                        try {
                            wakeLock.release();
                        } catch (RuntimeException unused2) {
                            Log.i("FirebaseMessaging", "TopicsSyncTask's wakelock was already released due to timeout.");
                        }
                    }
                } catch (RuntimeException unused3) {
                    Log.i("FirebaseMessaging", "TopicsSyncTask's wakelock was already released due to timeout.");
                }
            } catch (IOException e) {
                Log.e("FirebaseMessaging", "Failed to sync topics. Won't retry sync. " + e.getMessage());
                dxz0Var.d(false);
                if (b(context)) {
                    wakeLock.release();
                }
            }
        } catch (Throwable th) {
            if (b(context)) {
                try {
                    wakeLock.release();
                } catch (RuntimeException unused4) {
                    Log.i("FirebaseMessaging", "TopicsSyncTask's wakelock was already released due to timeout.");
                }
            }
            throw th;
        }
    }
}
