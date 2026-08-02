package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.AppMetricaConfig;
import io.appmetrica.analytics.ReporterConfig;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;

/* renamed from: io.appmetrica.analytics.impl.ui, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C5225ui implements InterfaceC4804eb {
    @Override // io.appmetrica.analytics.impl.InterfaceC4804eb, io.appmetrica.analytics.impl.InterfaceC4830fb
    @NonNull
    public final InterfaceC4804eb a() {
        return this;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC4804eb
    @NonNull
    public final Ua b(@NonNull AppMetricaConfig appMetricaConfig, @NonNull PublicLogger publicLogger, @NonNull C4974l0 c4974l0) {
        return new Jc();
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC4804eb
    public final void a(@NonNull ReporterConfig reporterConfig) {
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC4804eb
    @NonNull
    public final InterfaceC4779db b(@NonNull ReporterConfig reporterConfig) {
        return new C5147ri();
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC4804eb
    @NonNull
    public final Ua a(@NonNull AppMetricaConfig appMetricaConfig, @NonNull PublicLogger publicLogger, @NonNull C4974l0 c4974l0) {
        return new Jc();
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC4804eb
    @NonNull
    public final InterfaceC4856gb a(@NonNull AppMetricaConfig appMetricaConfig) {
        return new C5147ri();
    }
}
