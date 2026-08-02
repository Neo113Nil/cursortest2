package com.google.ar.core;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.util.Log;
import java.util.Iterator;

/* loaded from: classes11.dex */
final class y implements ServiceConnection {
    final /* synthetic */ d0 a;

    public y(d0 d0Var) {
        this.a = d0Var;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        d0 d0Var = this.a;
        synchronized (d0Var) {
            com.google.ar.core.dependencies.h b = com.google.ar.core.dependencies.g.b(iBinder);
            Log.i("ARCore-InstallService", "Install service connected");
            d0Var.c = b;
            d0Var.i = 3;
            Iterator it = d0Var.a.iterator();
            while (it.hasNext()) {
                ((Runnable) it.next()).run();
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        d0 d0Var = this.a;
        synchronized (d0Var) {
            Log.i("ARCore-InstallService", "Install service disconnected");
            d0Var.i = 1;
            d0Var.c = null;
        }
    }
}
