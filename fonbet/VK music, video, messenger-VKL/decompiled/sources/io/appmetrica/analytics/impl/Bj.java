package io.appmetrica.analytics.impl;

/* loaded from: classes8.dex */
public final class Bj implements InterfaceC4753cb {
    public final /* synthetic */ Throwable a;

    public Bj(Throwable th) {
        this.a = th;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC4753cb
    public final void a(InterfaceC4779db interfaceC4779db) {
        interfaceC4779db.reportUnhandledException(this.a);
    }
}
