package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.AppMetricaConfig;

/* renamed from: io.appmetrica.analytics.impl.rc, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C5141rc extends AbstractC4869go {
    public final AppMetricaConfig b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5141rc(@NonNull InterfaceC4830fb interfaceC4830fb, @NonNull AppMetricaConfig appMetricaConfig) {
        super(interfaceC4830fb);
        String str = appMetricaConfig.apiKey;
        this.b = appMetricaConfig;
    }

    @NonNull
    public final InterfaceC4856gb a() {
        return this.a.a().a(this.b);
    }
}
