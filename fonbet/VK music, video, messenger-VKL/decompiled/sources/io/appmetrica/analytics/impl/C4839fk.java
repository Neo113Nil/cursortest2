package io.appmetrica.analytics.impl;

import android.content.Context;
import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreutils.internal.services.PackageManagerUtils;
import io.appmetrica.analytics.coreutils.internal.time.TimePassedChecker;
import io.appmetrica.analytics.internal.CounterConfigurationReporterType;

/* renamed from: io.appmetrica.analytics.impl.fk, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C4839fk extends C4927j5 {
    public C4839fk(@NonNull Context context, @NonNull C5100pm c5100pm, @NonNull C4747c5 c4747c5, @NonNull A4 a4, @NonNull InterfaceC5146rh interfaceC5146rh, @NonNull AbstractC4876h5 abstractC4876h5, @NonNull C4721b5 c4721b5) {
        this(context, c4747c5, new C4948k0(), new TimePassedChecker(), new C5057o5(context, c4747c5, a4, abstractC4876h5, c5100pm, interfaceC5146rh, C5342za.k().w().d(), PackageManagerUtils.getAppVersionCodeInt(context), C5342za.k().l(), c4721b5), a4);
    }

    @Override // io.appmetrica.analytics.impl.C4927j5, io.appmetrica.analytics.impl.Qa
    @NonNull
    public final CounterConfigurationReporterType c() {
        return CounterConfigurationReporterType.SELF_SDK;
    }

    public C4839fk(Context context, C4747c5 c4747c5, C4948k0 c4948k0, TimePassedChecker timePassedChecker, C5057o5 c5057o5, A4 a4) {
        super(context, c4747c5, c4948k0, timePassedChecker, c5057o5, a4);
    }
}
