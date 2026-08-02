package io.appmetrica.analytics.impl;

import android.app.Service;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.IBinder;

/* renamed from: io.appmetrica.analytics.impl.t0, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractServiceC5181t0 extends Service {
    public X1 a;

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        X1 x1 = this.a;
        if (x1 == null) {
            x1 = null;
        }
        return x1.a(intent);
    }

    @Override // android.app.Service, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        X1 x1 = this.a;
        if (x1 == null) {
            x1 = null;
        }
        x1.a(configuration);
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        if (this.a == null) {
            this.a = new X1(this, new C5207u0(this));
        }
        X1 x1 = this.a;
        if (x1 == null) {
            x1 = null;
        }
        x1.b();
    }

    @Override // android.app.Service
    public void onDestroy() {
        super.onDestroy();
        X1 x1 = this.a;
        if (x1 == null) {
            x1 = null;
        }
        x1.c();
    }

    @Override // android.app.Service
    public void onRebind(Intent intent) {
        super.onRebind(intent);
        X1 x1 = this.a;
        if (x1 == null) {
            x1 = null;
        }
        x1.b(intent);
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i, int i2) {
        X1 x1 = this.a;
        if (x1 == null) {
            x1 = null;
        }
        return x1.a(intent, i, i2);
    }

    @Override // android.app.Service
    public boolean onUnbind(Intent intent) {
        X1 x1 = this.a;
        if (x1 == null) {
            x1 = null;
        }
        return x1.c(intent);
    }
}
