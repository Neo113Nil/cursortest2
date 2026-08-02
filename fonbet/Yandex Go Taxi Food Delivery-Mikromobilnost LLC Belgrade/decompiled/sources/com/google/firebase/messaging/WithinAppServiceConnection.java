package com.google.firebase.messaging;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.util.Log;
import com.google.android.gms.tasks.Task;
import defpackage.el11;
import defpackage.jy31;
import defpackage.q851;
import defpackage.v150;
import defpackage.yvi0;
import java.util.ArrayDeque;
import java.util.Objects;
import java.util.Queue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes11.dex */
class WithinAppServiceConnection implements ServiceConnection {
    private WithinAppServiceBinder binder;
    private boolean connectionInProgress;
    private final Intent connectionIntent;
    private final Context context;
    private final Queue<q851> intentQueue;
    private final ScheduledExecutorService scheduledExecutorService;

    public WithinAppServiceConnection(Context context, String str, ScheduledExecutorService scheduledExecutorService) {
        this.intentQueue = new ArrayDeque();
        this.connectionInProgress = false;
        Context applicationContext = context.getApplicationContext();
        this.context = applicationContext;
        this.connectionIntent = new Intent(str).setPackage(applicationContext.getPackageName());
        this.scheduledExecutorService = scheduledExecutorService;
    }

    private static ScheduledThreadPoolExecutor createScheduledThreadPoolExecutor() {
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1, new v150("Firebase-FirebaseInstanceIdServiceConnection"));
        scheduledThreadPoolExecutor.setKeepAliveTime(40L, TimeUnit.SECONDS);
        scheduledThreadPoolExecutor.allowCoreThreadTimeOut(true);
        return scheduledThreadPoolExecutor;
    }

    private void finishAllInQueue() {
        while (!this.intentQueue.isEmpty()) {
            this.intentQueue.poll().b.c(null);
        }
    }

    private synchronized void flushQueue() {
        try {
            Log.isLoggable("FirebaseMessaging", 3);
            while (!this.intentQueue.isEmpty()) {
                Log.isLoggable("FirebaseMessaging", 3);
                WithinAppServiceBinder withinAppServiceBinder = this.binder;
                if (withinAppServiceBinder == null || !withinAppServiceBinder.isBinderAlive()) {
                    startConnectionIfNeeded();
                    return;
                } else {
                    Log.isLoggable("FirebaseMessaging", 3);
                    this.binder.send(this.intentQueue.poll());
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    private void startConnectionIfNeeded() {
        Log.isLoggable("FirebaseMessaging", 3);
        if (this.connectionInProgress) {
            return;
        }
        this.connectionInProgress = true;
        try {
        } catch (SecurityException e) {
            Log.e("FirebaseMessaging", "Exception while binding the service", e);
        }
        if (yvi0.s().o(this.context, this.connectionIntent, this, 65)) {
            return;
        }
        Log.e("FirebaseMessaging", "binding to the service failed");
        this.connectionInProgress = false;
        finishAllInQueue();
    }

    @Override // android.content.ServiceConnection
    public synchronized void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        try {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Objects.toString(componentName);
            }
            this.connectionInProgress = false;
            if (iBinder instanceof WithinAppServiceBinder) {
                this.binder = (WithinAppServiceBinder) iBinder;
                flushQueue();
            } else {
                Log.e("FirebaseMessaging", "Invalid service connection: " + iBinder);
                finishAllInQueue();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(ComponentName componentName) {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Objects.toString(componentName);
        }
        flushQueue();
    }

    public synchronized Task sendIntent(Intent intent) {
        q851 q851Var;
        Log.isLoggable("FirebaseMessaging", 3);
        q851Var = new q851(intent);
        ScheduledExecutorService scheduledExecutorService = this.scheduledExecutorService;
        q851Var.b.a.c(scheduledExecutorService, new el11(26, scheduledExecutorService.schedule(new jy31(8, q851Var), 20L, TimeUnit.SECONDS)));
        this.intentQueue.add(q851Var);
        flushQueue();
        return q851Var.b.a;
    }

    public WithinAppServiceConnection(Context context, String str) {
        this(context, str, createScheduledThreadPoolExecutor());
    }
}
