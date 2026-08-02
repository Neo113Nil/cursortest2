package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.StartupParamsCallback;
import java.util.List;

/* renamed from: io.appmetrica.analytics.impl.j1, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class RunnableC4923j1 implements Runnable {
    public final /* synthetic */ Context a;
    public final /* synthetic */ StartupParamsCallback b;
    public final /* synthetic */ List c;
    public final /* synthetic */ C5208u1 d;

    public RunnableC4923j1(C5208u1 c5208u1, Context context, StartupParamsCallback startupParamsCallback, List list) {
        this.d = c5208u1;
        this.a = context;
        this.b = startupParamsCallback;
        this.c = list;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C5332z0 c5332z0 = this.d.a;
        Context applicationContext = this.a.getApplicationContext();
        c5332z0.getClass();
        C5307y0 a = C5307y0.a(applicationContext);
        a.f().a(this.b, this.c);
    }
}
