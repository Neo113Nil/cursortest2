package io.appmetrica.analytics.impl;

import android.content.Context;
import android.content.Intent;
import android.os.RemoteException;
import io.appmetrica.analytics.internal.IAppMetricaService;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import xsna.s3q0;

/* loaded from: classes8.dex */
public abstract class Hh implements Callable {
    public static final Gh d = new Gh();
    public final C5078p0 a;
    public final InterfaceC4943jl b;
    public boolean c;

    public Hh(C5078p0 c5078p0, InterfaceC4943jl interfaceC4943jl) {
        this.a = c5078p0;
        this.b = interfaceC4943jl;
    }

    public abstract void a(IAppMetricaService iAppMetricaService);

    public void a(Throwable th) {
    }

    public final C5078p0 b() {
        return this.a;
    }

    public boolean c() {
        C5078p0 c5078p0 = this.a;
        synchronized (c5078p0) {
            try {
                if (c5078p0.d == null) {
                    c5078p0.e = new CountDownLatch(1);
                    S1 s1 = c5078p0.h;
                    Context context = c5078p0.a;
                    s1.getClass();
                    Intent a = S1.a(context);
                    try {
                        c5078p0.g.b(c5078p0.a);
                        c5078p0.a.bindService(a, c5078p0.j, 1);
                    } catch (Throwable unused) {
                    }
                }
            } finally {
            }
        }
        this.a.a(5000L);
        return true;
    }

    @Override // java.util.concurrent.Callable
    public /* bridge */ /* synthetic */ Object call() {
        a();
        return s3q0.a;
    }

    public final boolean d() {
        return this.c;
    }

    public final void a(boolean z) {
        this.c = z;
    }

    public void a() {
        IAppMetricaService iAppMetricaService;
        try {
            if (this.c) {
                return;
            }
            this.c = true;
            int i = 0;
            do {
                C5078p0 c5078p0 = this.a;
                synchronized (c5078p0) {
                    iAppMetricaService = c5078p0.d;
                }
                if (iAppMetricaService != null) {
                    try {
                        a(iAppMetricaService);
                        InterfaceC4943jl interfaceC4943jl = this.b;
                        if (interfaceC4943jl != null && !((C5173si) interfaceC4943jl).a()) {
                            return;
                        }
                        this.a.c();
                        return;
                    } catch (RemoteException unused) {
                    }
                }
                i++;
                if (!c() || C4692a2.e.get()) {
                    return;
                }
            } while (i < 3);
        } catch (Throwable th) {
            a(th);
        }
    }
}
