package com.google.firebase.messaging;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.PowerManager;
import android.util.Log;
import defpackage.cxq0;
import defpackage.v150;
import java.io.IOException;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import ru.yandex.yx_platform_api.InternetConnectionStreamHandler;

/* loaded from: classes.dex */
public final class b implements Runnable {
    public final long a;
    public final PowerManager.WakeLock b;
    public final FirebaseMessaging c;
    public final ThreadPoolExecutor w = new ThreadPoolExecutor(0, 1, 30, TimeUnit.SECONDS, new LinkedBlockingQueue(), new v150("firebase-iid-executor"));

    public b(FirebaseMessaging firebaseMessaging, long j) {
        this.c = firebaseMessaging;
        this.a = j;
        PowerManager.WakeLock newWakeLock = ((PowerManager) firebaseMessaging.b.getSystemService("power")).newWakeLock(1, "fiid-sync");
        this.b = newWakeLock;
        newWakeLock.setReferenceCounted(false);
    }

    public final boolean a() {
        ConnectivityManager connectivityManager = (ConnectivityManager) this.c.b.getSystemService("connectivity");
        NetworkInfo activeNetworkInfo = connectivityManager != null ? connectivityManager.getActiveNetworkInfo() : null;
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    public final boolean b() {
        try {
            if (this.c.a() == null) {
                Log.e("FirebaseMessaging", "Token retrieval failed: null");
                return false;
            }
            Log.isLoggable("FirebaseMessaging", 3);
            return true;
        } catch (IOException e) {
            String message = e.getMessage();
            if ("SERVICE_NOT_AVAILABLE".equals(message) || "INTERNAL_SERVER_ERROR".equals(message) || "InternalServerError".equals(message) || e.getMessage() == null) {
                return false;
            }
            throw e;
        } catch (SecurityException unused) {
            return false;
        }
    }

    /* JADX WARN: Type inference failed for: r4v10, types: [com.google.firebase.messaging.SyncTask$ConnectivityChangeReceiver] */
    @Override // java.lang.Runnable
    public final void run() {
        PowerManager.WakeLock wakeLock = this.b;
        cxq0 v = cxq0.v();
        FirebaseMessaging firebaseMessaging = this.c;
        if (v.y(firebaseMessaging.b)) {
            wakeLock.acquire();
        }
        try {
            try {
                synchronized (firebaseMessaging) {
                    firebaseMessaging.i = true;
                }
                if (!firebaseMessaging.h.c()) {
                    synchronized (firebaseMessaging) {
                        firebaseMessaging.i = false;
                    }
                    if (cxq0.v().y(firebaseMessaging.b)) {
                        wakeLock.release();
                        return;
                    }
                    return;
                }
                if (cxq0.v().x(firebaseMessaging.b) && !a()) {
                    new BroadcastReceiver(this) { // from class: com.google.firebase.messaging.SyncTask$ConnectivityChangeReceiver
                        private Context receiverContext;
                        private b task;

                        {
                            this.task = this;
                        }

                        @Override // android.content.BroadcastReceiver
                        public void onReceive(Context context, Intent intent) {
                            b bVar = this.task;
                            if (bVar != null && bVar.a()) {
                                Log.isLoggable("FirebaseMessaging", 3);
                                b bVar2 = this.task;
                                bVar2.c.getClass();
                                FirebaseMessaging.b(0L, bVar2);
                                Context context2 = this.receiverContext;
                                if (context2 != null) {
                                    context2.unregisterReceiver(this);
                                }
                                this.task = null;
                            }
                        }

                        public void registerReceiver() {
                            Log.isLoggable("FirebaseMessaging", 3);
                            IntentFilter intentFilter = new IntentFilter(InternetConnectionStreamHandler.CONNECTIVITY_ACTION);
                            b bVar = this.task;
                            if (bVar != null) {
                                Context context = bVar.c.b;
                                this.receiverContext = context;
                                context.registerReceiver(this, intentFilter);
                            }
                        }
                    }.registerReceiver();
                    if (cxq0.v().y(firebaseMessaging.b)) {
                        wakeLock.release();
                        return;
                    }
                    return;
                }
                if (b()) {
                    synchronized (firebaseMessaging) {
                        firebaseMessaging.i = false;
                    }
                } else {
                    firebaseMessaging.h(this.a);
                }
                if (cxq0.v().y(firebaseMessaging.b)) {
                    wakeLock.release();
                }
            } catch (IOException e) {
                Log.e("FirebaseMessaging", "Topic sync or token retrieval failed on hard failure exceptions: " + e.getMessage() + ". Won't retry the operation.");
                synchronized (firebaseMessaging) {
                    firebaseMessaging.i = false;
                    if (cxq0.v().y(firebaseMessaging.b)) {
                        wakeLock.release();
                    }
                }
            }
        } catch (Throwable th) {
            if (cxq0.v().y(firebaseMessaging.b)) {
                wakeLock.release();
            }
            throw th;
        }
    }
}
