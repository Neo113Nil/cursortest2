package io.appmetrica.analytics.impl;

/* loaded from: classes8.dex */
public final class Uj implements InterfaceC4753cb {
    public final /* synthetic */ String a;
    public final /* synthetic */ String b;

    public Uj(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC4753cb
    public final void a(InterfaceC4779db interfaceC4779db) {
        interfaceC4779db.putAppEnvironmentValue(this.a, this.b);
    }
}
