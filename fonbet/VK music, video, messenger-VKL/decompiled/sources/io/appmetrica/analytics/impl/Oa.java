package io.appmetrica.analytics.impl;

import android.location.Location;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.appmetrica.analytics.AdvIdentifiersResult;
import io.appmetrica.analytics.AppMetricaConfig;
import io.appmetrica.analytics.AppMetricaLibraryAdapterConfig;
import io.appmetrica.analytics.DeferredDeeplinkListener;
import io.appmetrica.analytics.DeferredDeeplinkParametersListener;
import io.appmetrica.analytics.ReporterConfig;
import io.appmetrica.analytics.StartupParamsCallback;
import java.util.List;
import java.util.Map;

/* loaded from: classes8.dex */
public interface Oa extends Tc, M6, InterfaceC4830fb {
    @NonNull
    /* synthetic */ InterfaceC4804eb a();

    /* synthetic */ void a(int i, @NonNull Bundle bundle);

    @Override // io.appmetrica.analytics.impl.Tc
    /* synthetic */ void a(@Nullable Location location);

    void a(@NonNull AppMetricaLibraryAdapterConfig appMetricaLibraryAdapterConfig);

    void a(DeferredDeeplinkListener deferredDeeplinkListener);

    void a(DeferredDeeplinkParametersListener deferredDeeplinkParametersListener);

    void a(@NonNull ReporterConfig reporterConfig);

    void a(@NonNull StartupParamsCallback startupParamsCallback, @NonNull List<String> list);

    @Override // io.appmetrica.analytics.impl.Tc
    /* synthetic */ void a(@NonNull String str);

    @Override // io.appmetrica.analytics.impl.Tc
    /* synthetic */ void a(String str, String str2);

    @Override // io.appmetrica.analytics.impl.Tc
    /* synthetic */ void a(boolean z);

    @Override // io.appmetrica.analytics.impl.Tc
    /* synthetic */ void a(boolean z, boolean z2);

    void b(@NonNull AppMetricaConfig appMetricaConfig);

    @NonNull
    InterfaceC4779db c(@NonNull ReporterConfig reporterConfig);

    @Override // io.appmetrica.analytics.impl.Tc
    /* synthetic */ void clearAppEnvironment();

    @NonNull
    C4932ja d();

    @Nullable
    String e();

    @Nullable
    Map<String, String> g();

    @NonNull
    AdvIdentifiersResult h();

    @Nullable
    C5244vc i();

    @Override // io.appmetrica.analytics.impl.Tc
    /* synthetic */ void putAppEnvironmentValue(String str, String str2);

    @Override // io.appmetrica.analytics.impl.Tc
    /* synthetic */ void setDataSendingEnabled(boolean z);

    @Override // io.appmetrica.analytics.impl.Tc
    /* synthetic */ void setUserProfileID(@Nullable String str);
}
