package io.appmetrica.analytics.impl;

/* loaded from: classes8.dex */
public final class Oj implements InterfaceC4753cb {
    public final /* synthetic */ InterfaceC4788dk a;

    public Oj(InterfaceC4788dk interfaceC4788dk) {
        this.a = interfaceC4788dk;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC4753cb
    public final void a(InterfaceC4779db interfaceC4779db) {
        C4762ck a = ((C5091pd) this.a).a();
        if (a != null) {
            interfaceC4779db.reportEvent(a.a, a.b);
        }
    }
}
