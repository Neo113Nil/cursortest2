package xsna;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.IBinder;
import android.os.RemoteException;
import android.util.Log;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.concurrent.ConcurrentLinkedQueue;

/* compiled from: ServiceConnection.java */
/* loaded from: classes12.dex */
public final class soi0 implements ServiceConnection {
    public final Context b;
    public final y3j d;
    public final pel e;
    public final f4j g;
    public IBinder h;
    public volatile boolean i;
    public int j;
    public final roi0 k;
    public final ConcurrentLinkedQueue c = new ConcurrentLinkedQueue();
    public final HashMap f = new HashMap();

    /* JADX WARN: Type inference failed for: r2v1, types: [xsna.roi0] */
    public soi0(Context context, y3j y3jVar, pel pelVar, f4j f4jVar) {
        context.getClass();
        this.b = context;
        y3jVar.getClass();
        this.d = y3jVar;
        this.e = pelVar;
        this.g = f4jVar;
        this.k = new IBinder.DeathRecipient() { // from class: xsna.roi0
            @Override // android.os.IBinder.DeathRecipient
            public final void binderDied() {
                soi0 soi0Var = soi0.this;
                soi0Var.d.getClass();
                soi0Var.n(new RemoteException("Binder died"));
            }
        };
    }

    public final void l() {
        if (this.i) {
            return;
        }
        try {
            Context context = this.b;
            Intent intent = new Intent();
            this.g.getClass();
            Intent intent2 = intent.setPackage((String) this.d.a);
            this.d.getClass();
            this.i = context.bindService(intent2.setAction("androidx.health.ACTION_BIND_HEALTH_DATA_SERVICE"), this, 129);
            if (this.i) {
                return;
            }
            this.d.getClass();
            String str = "Connection to service is not available for package '" + ((String) this.d.a) + "' and action 'androidx.health.ACTION_BIND_HEALTH_DATA_SERVICE'.";
            if (Log.isLoggable("ServiceConnection", 6)) {
                Log.e("ServiceConnection", str);
            }
            RemoteException remoteException = new RemoteException("Binding to service failed");
            this.j = 10;
            n(remoteException);
        } catch (SecurityException e) {
            this.d.b();
            this.i = false;
            this.h = null;
            throw e;
        }
    }

    public final void m(ore0 ore0Var) {
        try {
            ore0Var.b(this.e);
            IBinder iBinder = this.h;
            iBinder.getClass();
            ore0Var.c(iBinder);
        } catch (DeadObjectException e) {
            n(e);
        } catch (RemoteException e2) {
            e = e2;
            ore0Var.d(e);
        } catch (RuntimeException e3) {
            e = e3;
            ore0Var.d(e);
        }
    }

    public final synchronized void n(RemoteException remoteException) {
        try {
            IBinder iBinder = this.h;
            if (iBinder != null && iBinder.isBinderAlive()) {
                return;
            }
            o();
            this.e.a(remoteException);
            ConcurrentLinkedQueue concurrentLinkedQueue = this.c;
            Iterator it = new ArrayList(concurrentLinkedQueue).iterator();
            while (it.hasNext()) {
                ore0 ore0Var = (ore0) it.next();
                if (concurrentLinkedQueue.remove(ore0Var)) {
                    ore0Var.d(remoteException);
                }
            }
            if (this.j < 10) {
                this.d.getClass();
                f4j f4jVar = this.g;
                long j = 200 << this.j;
                Handler handler = f4jVar.c;
                handler.sendMessageDelayed(handler.obtainMessage(2, this), j);
            } else if (Log.isLoggable("ServiceConnection", 6)) {
                Log.e("ServiceConnection", "Connection disconnected and maximum number of retries reached.", remoteException);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void o() {
        if (this.i) {
            try {
                this.b.unbindService(this);
            } catch (IllegalArgumentException e) {
                if (Log.isLoggable("ServiceConnection", 6)) {
                    Log.e("ServiceConnection", "Failed to unbind the service. Ignoring and continuing", e);
                }
            }
            this.i = false;
        }
        IBinder iBinder = this.h;
        if (iBinder != null) {
            try {
                iBinder.unlinkToDeath(this.k, 0);
            } catch (NoSuchElementException e2) {
                if (Log.isLoggable("ServiceConnection", 6)) {
                    Log.e("ServiceConnection", "mDeathRecipient not linked", e2);
                }
            }
            this.h = null;
        }
    }

    @Override // android.content.ServiceConnection
    public final void onBindingDied(ComponentName componentName) {
        this.d.getClass();
        if (Log.isLoggable("ServiceConnection", 6)) {
            Log.e("ServiceConnection", "Binding died for client 'HealthData'.");
        }
        n(new RemoteException("Binding died"));
    }

    @Override // android.content.ServiceConnection
    public final void onNullBinding(ComponentName componentName) {
        this.d.getClass();
        if (Log.isLoggable("ServiceConnection", 6)) {
            Log.e("ServiceConnection", "Cannot bind client 'HealthData', binder is null");
        }
        n(new RemoteException("Null binding"));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        Objects.toString(componentName);
        if (iBinder == null) {
            if (Log.isLoggable("ServiceConnection", 6)) {
                Log.e("ServiceConnection", "Service connected but binder is null.");
                return;
            }
            return;
        }
        this.j = 0;
        try {
            iBinder.linkToDeath(this.k, 0);
        } catch (RemoteException e) {
            n(e);
        }
        this.h = iBinder;
        Handler handler = this.g.c;
        handler.sendMessage(handler.obtainMessage(1, this));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        Objects.toString(componentName);
    }
}
