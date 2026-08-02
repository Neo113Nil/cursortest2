package io.appmetrica.analytics.impl;

import android.content.Context;
import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreutils.internal.services.PackageManagerUtils;
import io.appmetrica.analytics.coreutils.internal.time.TimePassedChecker;

/* loaded from: classes8.dex */
public final class Nh extends C4927j5 {
    public final String w;
    public final Q6 x;

    public Nh(@NonNull Context context, @NonNull C4747c5 c4747c5, @NonNull A4 a4, @NonNull Q6 q6, @NonNull C5100pm c5100pm, @NonNull AbstractC4876h5 abstractC4876h5, @NonNull E9 e9) {
        this(context, c4747c5, new C4948k0(), new TimePassedChecker(), new C5057o5(context, c4747c5, a4, abstractC4876h5, c5100pm, new Ih(q6), C5342za.k().w().d(), PackageManagerUtils.getAppVersionCodeInt(context), C5342za.k().l(), e9), q6, a4);
    }

    @Override // io.appmetrica.analytics.impl.C4927j5, io.appmetrica.analytics.impl.InterfaceC4727bb, io.appmetrica.analytics.impl.Qa
    public final synchronized void a(@NonNull A4 a4) {
        super.a(a4);
        this.x.a(this.w, a4.i);
    }

    public Nh(Context context, C4747c5 c4747c5, C4948k0 c4948k0, TimePassedChecker timePassedChecker, C5057o5 c5057o5, Q6 q6, A4 a4) {
        super(context, c4747c5, c4948k0, timePassedChecker, c5057o5, a4);
        this.w = c4747c5.b();
        this.x = q6;
    }
}
