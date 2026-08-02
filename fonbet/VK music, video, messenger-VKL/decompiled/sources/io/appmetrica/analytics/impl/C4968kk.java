package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.servicecomponents.ServiceComponentModuleReporter;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.ServiceModuleCounterReport;
import xsna.zcl;

/* renamed from: io.appmetrica.analytics.impl.kk, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C4968kk implements ServiceComponentModuleReporter {
    public final C4927j5 a;
    public final Dk b;

    public C4968kk(C4927j5 c4927j5, Dk dk) {
        this.a = c4927j5;
        this.b = dk;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.servicecomponents.ServiceComponentModuleReporter
    public final void handleReport(ServiceModuleCounterReport serviceModuleCounterReport) {
        this.b.getClass();
        this.a.a(Dk.a(serviceModuleCounterReport));
    }

    public /* synthetic */ C4968kk(C4927j5 c4927j5, Dk dk, int i, zcl zclVar) {
        this(c4927j5, (i & 2) != 0 ? new Dk() : dk);
    }
}
