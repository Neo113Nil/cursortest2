package io.appmetrica.analytics.impl;

import java.util.Map;

/* loaded from: classes8.dex */
public final class Zj implements InterfaceC4753cb {
    public final /* synthetic */ String a;
    public final /* synthetic */ Map b;

    public Zj(String str, Map map) {
        this.a = str;
        this.b = map;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC4753cb
    public final void a(InterfaceC4779db interfaceC4779db) {
        interfaceC4779db.reportEvent(this.a, this.b);
    }
}
