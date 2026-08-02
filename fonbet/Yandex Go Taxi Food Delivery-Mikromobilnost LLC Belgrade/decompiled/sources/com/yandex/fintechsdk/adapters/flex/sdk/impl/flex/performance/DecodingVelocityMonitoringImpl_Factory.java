package com.yandex.fintechsdk.adapters.flex.sdk.impl.flex.performance;

import defpackage.uyi0;
import defpackage.v7p;
import defpackage.xvf0;

/* loaded from: classes10.dex */
public final class DecodingVelocityMonitoringImpl_Factory implements v7p {
    private final xvf0 renderingEventsListenerProvider;

    private DecodingVelocityMonitoringImpl_Factory(xvf0 xvf0Var) {
        this.renderingEventsListenerProvider = xvf0Var;
    }

    public static DecodingVelocityMonitoringImpl_Factory create(xvf0 xvf0Var) {
        return new DecodingVelocityMonitoringImpl_Factory(xvf0Var);
    }

    public static DecodingVelocityMonitoringImpl newInstance(uyi0 uyi0Var) {
        return new DecodingVelocityMonitoringImpl(uyi0Var);
    }

    @Override // defpackage.yvf0
    public DecodingVelocityMonitoringImpl get() {
        return newInstance((uyi0) this.renderingEventsListenerProvider.get());
    }
}
