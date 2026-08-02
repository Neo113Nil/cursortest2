package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.servicecomponents.ServiceComponentModuleConfig;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.ServiceComponentModuleReporter;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.ServiceModuleReporterComponentContext;

/* loaded from: classes8.dex */
public final class Fk implements ServiceModuleReporterComponentContext {
    public final C4968kk a;
    public final C4942jk b;

    /* JADX WARN: Multi-variable type inference failed */
    public Fk(C4927j5 c4927j5, A4 a4) {
        this.a = new C4968kk(c4927j5, null, 2, 0 == true ? 1 : 0);
        this.b = new C4942jk(a4);
    }

    public final C4942jk a() {
        return this.b;
    }

    public final C4968kk b() {
        return this.a;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.servicecomponents.ServiceModuleReporterComponentContext
    public final ServiceComponentModuleConfig getConfig() {
        return this.b;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.servicecomponents.ServiceModuleReporterComponentContext
    public final ServiceComponentModuleReporter getReporter() {
        return this.a;
    }
}
