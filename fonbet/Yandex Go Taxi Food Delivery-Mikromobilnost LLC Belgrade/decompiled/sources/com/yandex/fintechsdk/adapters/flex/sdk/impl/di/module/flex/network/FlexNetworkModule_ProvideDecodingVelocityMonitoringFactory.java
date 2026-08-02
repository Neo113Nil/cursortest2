package com.yandex.fintechsdk.adapters.flex.sdk.impl.di.module.flex.network;

import defpackage.q5z;
import defpackage.uyg;
import defpackage.uyi0;
import defpackage.v7p;
import defpackage.xvf0;

/* loaded from: classes10.dex */
public final class FlexNetworkModule_ProvideDecodingVelocityMonitoringFactory implements v7p {
    private final FlexNetworkModule module;
    private final xvf0 renderingEventsListenerProvider;

    private FlexNetworkModule_ProvideDecodingVelocityMonitoringFactory(FlexNetworkModule flexNetworkModule, xvf0 xvf0Var) {
        this.module = flexNetworkModule;
        this.renderingEventsListenerProvider = xvf0Var;
    }

    public static FlexNetworkModule_ProvideDecodingVelocityMonitoringFactory create(FlexNetworkModule flexNetworkModule, xvf0 xvf0Var) {
        return new FlexNetworkModule_ProvideDecodingVelocityMonitoringFactory(flexNetworkModule, xvf0Var);
    }

    public static uyg provideDecodingVelocityMonitoring(FlexNetworkModule flexNetworkModule, uyi0 uyi0Var) {
        uyg provideDecodingVelocityMonitoring = flexNetworkModule.provideDecodingVelocityMonitoring(uyi0Var);
        q5z.i(provideDecodingVelocityMonitoring);
        return provideDecodingVelocityMonitoring;
    }

    @Override // defpackage.yvf0
    public uyg get() {
        return provideDecodingVelocityMonitoring(this.module, (uyi0) this.renderingEventsListenerProvider.get());
    }
}
