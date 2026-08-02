package io.appmetrica.analytics.impl;

import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import io.appmetrica.analytics.internal.AppMetricaService;
import io.appmetrica.analytics.modulesapi.internal.service.ServiceWakeLock;
import java.util.HashMap;
import xsna.go9;

/* loaded from: classes8.dex */
public final class Mk implements ServiceWakeLock {
    public final Context a;
    public final Lk b;
    public final HashMap c = new HashMap();

    public Mk(Context context, Lk lk) {
        this.a = context;
        this.b = lk;
    }

    public final String a(String str) {
        return go9.b("io.appmetrica.analytics.ACTION_SERVICE_WAKELOCK.", str);
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ServiceWakeLock
    public final synchronized boolean acquireWakeLock(String str) {
        try {
            if (this.c.get(str) == null) {
                HashMap hashMap = this.c;
                Lk lk = this.b;
                Context context = this.a;
                String a = a(str);
                lk.a.getClass();
                Intent intent = new Intent(context, (Class<?>) AppMetricaService.class);
                intent.setAction(a);
                Kk kk = new Kk();
                try {
                    context.bindService(intent, kk, 1);
                } catch (Throwable unused) {
                    kk = null;
                }
                hashMap.put(str, kk);
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.c.get(str) != null;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ServiceWakeLock
    public final synchronized void releaseWakeLock(String str) {
        ServiceConnection serviceConnection = (ServiceConnection) this.c.get(str);
        if (serviceConnection != null) {
            Lk lk = this.b;
            a(str);
            Context context = this.a;
            lk.getClass();
            try {
                context.unbindService(serviceConnection);
            } catch (Throwable unused) {
            }
        }
    }
}
