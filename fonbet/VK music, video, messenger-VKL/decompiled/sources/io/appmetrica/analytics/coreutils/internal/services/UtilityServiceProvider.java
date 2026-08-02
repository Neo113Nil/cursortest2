package io.appmetrica.analytics.coreutils.internal.services;

import io.appmetrica.analytics.coreutils.impl.l;
import kotlin.Lazy;
import xsna.bpn0;

/* loaded from: classes8.dex */
public final class UtilityServiceProvider {
    private final Lazy a = new bpn0(new l(this));
    private final WaitForActivationDelayBarrier b = new WaitForActivationDelayBarrier();

    public final WaitForActivationDelayBarrier getActivationBarrier() {
        return this.b;
    }

    public final FirstExecutionConditionServiceImpl getFirstExecutionService() {
        return (FirstExecutionConditionServiceImpl) this.a.getValue();
    }

    public final void initAsync() {
        this.b.activate();
    }

    public final void updateConfiguration(UtilityServiceConfiguration utilityServiceConfiguration) {
        getFirstExecutionService().updateConfig(utilityServiceConfiguration);
    }
}
