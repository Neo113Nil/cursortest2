package io.appmetrica.analytics.impl;

/* loaded from: classes8.dex */
public final class Qj implements InterfaceC4753cb {
    public final /* synthetic */ String a;
    public final /* synthetic */ byte[] b;

    public Qj(String str, byte[] bArr) {
        this.a = str;
        this.b = bArr;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC4753cb
    public final void a(InterfaceC4779db interfaceC4779db) {
        interfaceC4779db.setSessionExtra(this.a, this.b);
    }
}
