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
public final class E0 implements Oa {
    @Override // io.appmetrica.analytics.impl.Oa, io.appmetrica.analytics.impl.M6
    public final void a(int i, @NonNull Bundle bundle) {
    }

    @Override // io.appmetrica.analytics.impl.Oa
    @NonNull
    public final InterfaceC4779db c(@NonNull ReporterConfig reporterConfig) {
        return new C5147ri();
    }

    @Override // io.appmetrica.analytics.impl.Oa
    @NonNull
    public final C4932ja d() {
        return new C4932ja();
    }

    @Override // io.appmetrica.analytics.impl.Oa
    @Nullable
    public final String e() {
        return null;
    }

    @Override // io.appmetrica.analytics.impl.Oa
    @Nullable
    public final Map<String, String> g() {
        return null;
    }

    @Override // io.appmetrica.analytics.impl.Oa
    @NonNull
    public final AdvIdentifiersResult h() {
        AdvIdentifiersResult.Details details = AdvIdentifiersResult.Details.INTERNAL_ERROR;
        return new AdvIdentifiersResult(new AdvIdentifiersResult.AdvId(null, details, "Device user is in locked state"), new AdvIdentifiersResult.AdvId(null, details, "Device user is in locked state"), new AdvIdentifiersResult.AdvId(null, details, "Device user is in locked state"));
    }

    @Override // io.appmetrica.analytics.impl.Oa
    @Nullable
    public final C5244vc i() {
        Jc jc = new Jc();
        return new C5244vc(jc, new K7(jc));
    }

    @Override // io.appmetrica.analytics.impl.Oa, io.appmetrica.analytics.impl.Tc
    public final void a(@Nullable Location location) {
    }

    @Override // io.appmetrica.analytics.impl.Oa
    public final void a(@NonNull AppMetricaLibraryAdapterConfig appMetricaLibraryAdapterConfig) {
    }

    @Override // io.appmetrica.analytics.impl.Oa
    public final void a(DeferredDeeplinkListener deferredDeeplinkListener) {
    }

    @Override // io.appmetrica.analytics.impl.Oa
    public final void a(DeferredDeeplinkParametersListener deferredDeeplinkParametersListener) {
    }

    @Override // io.appmetrica.analytics.impl.Oa
    public final void a(@NonNull ReporterConfig reporterConfig) {
    }

    @Override // io.appmetrica.analytics.impl.Oa, io.appmetrica.analytics.impl.Tc
    public final void a(@NonNull String str) {
    }

    @Override // io.appmetrica.analytics.impl.Oa, io.appmetrica.analytics.impl.Tc
    public final void a(String str, String str2) {
    }

    @Override // io.appmetrica.analytics.impl.Oa, io.appmetrica.analytics.impl.Tc
    public final void a(boolean z) {
    }

    @Override // io.appmetrica.analytics.impl.Oa, io.appmetrica.analytics.impl.Tc
    public final void a(boolean z, boolean z2) {
    }

    @Override // io.appmetrica.analytics.impl.Oa
    public final void a(@NonNull StartupParamsCallback startupParamsCallback, @NonNull List<String> list) {
        startupParamsCallback.onRequestError(StartupParamsCallback.Reason.UNKNOWN, null);
    }

    @Override // io.appmetrica.analytics.impl.Oa, io.appmetrica.analytics.impl.InterfaceC4830fb
    @NonNull
    public final InterfaceC4804eb a() {
        return new C5225ui();
    }

    @Override // io.appmetrica.analytics.impl.Oa, io.appmetrica.analytics.impl.Tc
    public final void clearAppEnvironment() {
    }

    @Override // io.appmetrica.analytics.impl.Oa
    public final void b(@NonNull AppMetricaConfig appMetricaConfig) {
    }

    @Override // io.appmetrica.analytics.impl.Oa, io.appmetrica.analytics.impl.Tc
    public final void setDataSendingEnabled(boolean z) {
    }

    @Override // io.appmetrica.analytics.impl.Oa, io.appmetrica.analytics.impl.Tc
    public final void setUserProfileID(@Nullable String str) {
    }

    @Override // io.appmetrica.analytics.impl.Oa, io.appmetrica.analytics.impl.Tc
    public final void putAppEnvironmentValue(String str, String str2) {
    }
}
