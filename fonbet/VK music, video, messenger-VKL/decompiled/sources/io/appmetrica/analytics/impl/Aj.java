package io.appmetrica.analytics.impl;

/* loaded from: classes8.dex */
public final class Aj implements InterfaceC4753cb {
    public final /* synthetic */ String a;
    public final /* synthetic */ String b;
    public final /* synthetic */ Throwable c;

    public Aj(String str, String str2, Throwable th) {
        this.a = str;
        this.b = str2;
        this.c = th;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC4753cb
    public final void a(InterfaceC4779db interfaceC4779db) {
        interfaceC4779db.reportError(this.a, this.b, this.c);
    }
}
