package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.ModuleEvent;

/* loaded from: classes8.dex */
public final class Pj implements InterfaceC4753cb {
    public final /* synthetic */ ModuleEvent a;

    public Pj(ModuleEvent moduleEvent) {
        this.a = moduleEvent;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC4753cb
    public final void a(InterfaceC4779db interfaceC4779db) {
        interfaceC4779db.reportEvent(this.a);
    }
}
