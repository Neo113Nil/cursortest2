package io.appmetrica.analytics.impl;

import java.util.Map;

/* loaded from: classes8.dex */
public final class Sj implements InterfaceC4753cb {
    public final /* synthetic */ Map a;

    public Sj(Map map) {
        this.a = map;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC4753cb
    public final void a(InterfaceC4779db interfaceC4779db) {
        interfaceC4779db.reportAnr(this.a);
    }
}
