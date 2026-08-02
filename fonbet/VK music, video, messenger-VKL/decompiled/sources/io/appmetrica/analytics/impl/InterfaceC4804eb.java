package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.AppMetricaConfig;
import io.appmetrica.analytics.ReporterConfig;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;

/* renamed from: io.appmetrica.analytics.impl.eb, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public interface InterfaceC4804eb extends InterfaceC4830fb {
    @NonNull
    Ua a(@NonNull AppMetricaConfig appMetricaConfig, @NonNull PublicLogger publicLogger, @NonNull C4974l0 c4974l0);

    @Override // io.appmetrica.analytics.impl.InterfaceC4830fb
    @NonNull
    /* synthetic */ InterfaceC4804eb a();

    @NonNull
    InterfaceC4856gb a(@NonNull AppMetricaConfig appMetricaConfig);

    void a(@NonNull ReporterConfig reporterConfig);

    @NonNull
    Ua b(@NonNull AppMetricaConfig appMetricaConfig, @NonNull PublicLogger publicLogger, @NonNull C4974l0 c4974l0);

    @NonNull
    InterfaceC4779db b(@NonNull ReporterConfig reporterConfig);
}
