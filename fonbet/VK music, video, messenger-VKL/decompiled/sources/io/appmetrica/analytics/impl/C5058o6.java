package io.appmetrica.analytics.impl;

import android.content.Context;
import android.content.pm.ServiceInfo;
import io.appmetrica.analytics.coreutils.internal.services.PackageManagerUtils;
import io.appmetrica.analytics.internal.AppMetricaService;
import xsna.epx;
import xsna.s3q0;

/* renamed from: io.appmetrica.analytics.impl.o6, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C5058o6 extends Zg {
    public final Context f;
    public final Fh g;
    public final D6 h;
    public final W1 i;
    public final C5338z6 j;

    public C5058o6(Context context, C5078p0 c5078p0, InterfaceC4943jl interfaceC4943jl, Fh fh) {
        super(c5078p0, interfaceC4943jl, fh);
        this.f = context;
        this.g = fh;
        this.h = C5030n4.l().i();
        this.i = C5030n4.l().f();
        this.j = new C5338z6(context);
    }

    @Override // io.appmetrica.analytics.impl.Hh
    public final synchronized void a() {
        try {
            if (this.c) {
                return;
            }
            this.c = true;
            String a = this.h.a.a();
            W1 w1 = this.i;
            Context context = this.f;
            w1.getClass();
            ServiceInfo serviceInfo = PackageManagerUtils.getServiceInfo(context, AppMetricaService.class);
            if (epx.f(a, serviceInfo != null ? serviceInfo.processName : null)) {
                this.j.a(this.g);
            } else {
                this.a.c();
                this.c = false;
                super.a();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // io.appmetrica.analytics.impl.Hh
    public final boolean c() {
        this.j.a(this.g);
        return false;
    }

    @Override // io.appmetrica.analytics.impl.Hh, java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        a();
        return s3q0.a;
    }
}
