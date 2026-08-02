package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.zj, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C5351zj implements InterfaceC4753cb {
    public final /* synthetic */ String a;
    public final /* synthetic */ Throwable b;

    public C5351zj(String str, Throwable th) {
        this.a = str;
        this.b = th;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC4753cb
    public final void a(InterfaceC4779db interfaceC4779db) {
        interfaceC4779db.reportError(this.a, this.b);
    }
}
