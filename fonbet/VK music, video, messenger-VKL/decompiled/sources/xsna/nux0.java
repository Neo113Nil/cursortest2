package xsna;

import android.annotation.SuppressLint;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.util.Log;
import androidx.annotation.Nullable;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.ArrayDeque;
import java.util.Objects;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: WithinAppServiceConnection.java */
/* loaded from: classes13.dex */
public final class nux0 implements ServiceConnection {
    public final Context b;
    public final Intent c;
    public final ScheduledThreadPoolExecutor d;
    public final ArrayDeque e;

    @Nullable
    public lux0 f;
    public boolean g;

    /* compiled from: WithinAppServiceConnection.java */
    public static class a {
        public final Intent a;
        public final TaskCompletionSource<Void> b = new TaskCompletionSource<>();

        public a(Intent intent) {
            this.a = intent;
        }
    }

    @SuppressLint({"ThreadPoolCreation"})
    public nux0(Context context) {
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(0, new zt50("Firebase-FirebaseInstanceIdServiceConnection"));
        this.e = new ArrayDeque();
        this.g = false;
        Context applicationContext = context.getApplicationContext();
        this.b = applicationContext;
        this.c = new Intent("com.google.firebase.MESSAGING_EVENT").setPackage(applicationContext.getPackageName());
        this.d = scheduledThreadPoolExecutor;
    }

    public final synchronized void l() {
        while (!this.e.isEmpty()) {
            try {
                lux0 lux0Var = this.f;
                if (lux0Var == null || !lux0Var.isBinderAlive()) {
                    if (!this.g) {
                        this.g = true;
                        try {
                        } catch (SecurityException e) {
                            Log.e("FirebaseMessaging", "Exception while binding the service", e);
                        }
                        if (!o4j.b().a(this.b, this.c, this, 65)) {
                            Log.e("FirebaseMessaging", "binding to the service failed");
                            this.g = false;
                            ArrayDeque arrayDeque = this.e;
                            while (!arrayDeque.isEmpty()) {
                                ((a) arrayDeque.poll()).b.trySetResult(null);
                            }
                        }
                    }
                    return;
                }
                this.f.a((a) this.e.poll());
            } finally {
            }
        }
    }

    public final synchronized Task<Void> m(Intent intent) {
        a aVar;
        aVar = new a(intent);
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = this.d;
        final ScheduledFuture<?> schedule = scheduledThreadPoolExecutor.schedule(new m52(aVar, 9), 20L, TimeUnit.SECONDS);
        aVar.b.getTask().addOnCompleteListener(scheduledThreadPoolExecutor, new OnCompleteListener() { // from class: xsna.mux0
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                schedule.cancel(false);
            }
        });
        this.e.add(aVar);
        l();
        return aVar.b.getTask();
    }

    @Override // android.content.ServiceConnection
    public final synchronized void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        try {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Objects.toString(componentName);
            }
            this.g = false;
            if (iBinder instanceof lux0) {
                this.f = (lux0) iBinder;
                l();
                return;
            }
            Log.e("FirebaseMessaging", "Invalid service connection: " + iBinder);
            ArrayDeque arrayDeque = this.e;
            while (!arrayDeque.isEmpty()) {
                ((a) arrayDeque.poll()).b.trySetResult(null);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Objects.toString(componentName);
        }
        l();
    }
}
