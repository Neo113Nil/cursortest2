package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.identifiers.PlatformIdentifiers;
import io.appmetrica.analytics.coreapi.internal.identifiers.SdkIdentifiers;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.SdkEnvironmentProvider;
import io.appmetrica.analytics.networktasks.internal.BaseRequestConfig;

/* loaded from: classes8.dex */
public final class X5 extends BaseRequestConfig.DataSource {

    @NonNull
    public final C5100pm a;

    @NonNull
    public final SdkEnvironmentProvider b;

    public X5(@NonNull C5100pm c5100pm, @NonNull SdkEnvironmentProvider sdkEnvironmentProvider, @NonNull PlatformIdentifiers platformIdentifiers, Object obj) {
        super(new SdkIdentifiers(c5100pm.c(), c5100pm.a(), c5100pm.b()), sdkEnvironmentProvider, platformIdentifiers, obj);
        this.a = c5100pm;
        this.b = sdkEnvironmentProvider;
    }
}
