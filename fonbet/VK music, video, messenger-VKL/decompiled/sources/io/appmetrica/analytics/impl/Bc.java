package io.appmetrica.analytics.impl;

import android.content.Context;
import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreutils.internal.services.PackageManagerUtils;
import io.appmetrica.analytics.coreutils.internal.time.TimePassedChecker;
import io.appmetrica.analytics.internal.CounterConfigurationReporterType;

/* loaded from: classes8.dex */
public final class Bc extends C4927j5 implements Ya, Xa {
    public final C5248vg w;
    public final C5348zg x;
    public final Q6 y;

    public Bc(@NonNull Context context, @NonNull C5100pm c5100pm, @NonNull C4747c5 c4747c5, @NonNull A4 a4, @NonNull C5248vg c5248vg, @NonNull Q6 q6, @NonNull AbstractC4876h5 abstractC4876h5) {
        this(context, c4747c5, a4, new C4948k0(), new TimePassedChecker(), new Dc(context, c4747c5, a4, abstractC4876h5, c5100pm, new C5269wc(q6), C5342za.k().w().d(), PackageManagerUtils.getAppVersionCodeInt(context), C5342za.k().w(), C5342za.k().l(), new C5116qc()), c5248vg, q6);
    }

    @Override // io.appmetrica.analytics.impl.C4927j5
    public final void C() {
        this.w.a(this.x);
    }

    public final boolean D() {
        boolean optBoolean;
        Ho ho = this.t;
        synchronized (ho) {
            optBoolean = ho.a.a().optBoolean("referrer_handled", false);
        }
        return optBoolean;
    }

    @Override // io.appmetrica.analytics.impl.C4927j5, io.appmetrica.analytics.impl.InterfaceC4727bb, io.appmetrica.analytics.impl.Qa
    public final synchronized void a(@NonNull A4 a4) {
        super.a(a4);
        this.y.a(a4.i);
    }

    @Override // io.appmetrica.analytics.impl.C4927j5, io.appmetrica.analytics.impl.Qa
    @NonNull
    public final CounterConfigurationReporterType c() {
        return CounterConfigurationReporterType.MAIN;
    }

    @Override // io.appmetrica.analytics.impl.Xa
    public final void a() {
        Ho ho = this.t;
        synchronized (ho) {
            Io io2 = ho.a;
            io2.a(io2.a().put("referrer_handled", true));
        }
    }

    public Bc(Context context, C4747c5 c4747c5, A4 a4, C4948k0 c4948k0, TimePassedChecker timePassedChecker, Dc dc, C5248vg c5248vg, Q6 q6) {
        super(context, c4747c5, c4948k0, timePassedChecker, dc, a4);
        this.w = c5248vg;
        C4931j9 k = k();
        k.a(EnumC5037nb.EVENT_TYPE_REGULAR, new Rg(k.b()));
        this.x = dc.a(this);
        this.y = q6;
        C5342za.k().x().onMainReporterCreated(new Fk(this, a4));
    }
}
