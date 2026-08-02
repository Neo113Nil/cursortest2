package io.appmetrica.analytics.impl;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor;
import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;

/* loaded from: classes8.dex */
public final class M1 implements B1 {
    public final ICommonExecutor a;
    public final B1 b;
    public boolean c;

    public M1(@NonNull B1 b1) {
        this(C5342za.k().w().b(), b1);
    }

    @Override // io.appmetrica.analytics.impl.B1
    public final void a(Intent intent, int i) {
        this.a.execute(new E1(this, intent, i));
    }

    @Override // io.appmetrica.analytics.impl.B1
    public final void b(Intent intent) {
        this.a.execute(new I1(this, intent));
    }

    @Override // io.appmetrica.analytics.impl.B1
    public final void c(Intent intent) {
        this.a.execute(new H1(this, intent));
    }

    @Override // io.appmetrica.analytics.impl.B1
    public final void onConfigurationChanged(@NonNull Configuration configuration) {
        this.a.execute(new C1(this, configuration));
    }

    @Override // io.appmetrica.analytics.impl.B1
    public final synchronized void onCreate() {
        this.c = true;
        this.a.execute(new D1(this));
    }

    @Override // io.appmetrica.analytics.impl.B1
    public final void onDestroy() {
        this.a.removeAll();
        synchronized (this) {
            this.c = false;
        }
        this.b.onDestroy();
    }

    @Override // io.appmetrica.analytics.impl.B1
    public final void pauseUserSession(@NonNull Bundle bundle) {
        this.a.execute(new L1(this, bundle));
    }

    @Override // io.appmetrica.analytics.impl.B1
    public final void reportData(int i, Bundle bundle) {
        this.a.execute(new J1(this, i, bundle));
    }

    @Override // io.appmetrica.analytics.impl.B1
    public final void resumeUserSession(@NonNull Bundle bundle) {
        this.a.execute(new K1(this, bundle));
    }

    @Override // io.appmetrica.analytics.impl.B1
    public final void a(Intent intent, int i, int i2) {
        this.a.execute(new F1(this, intent, i, i2));
    }

    public M1(IHandlerExecutor iHandlerExecutor, B1 b1) {
        this.c = false;
        this.a = iHandlerExecutor;
        this.b = b1;
    }

    @Override // io.appmetrica.analytics.impl.B1
    public final void a(Intent intent) {
        this.a.execute(new G1(this, intent));
    }
}
