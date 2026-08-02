package com.vungle.ads.internal.network;

/* loaded from: classes7.dex */
public final class x implements a {
    public final /* synthetic */ com.vungle.ads.internal.w a;

    public x(com.vungle.ads.internal.x xVar) {
        this.a = xVar;
    }

    @Override // com.vungle.ads.internal.network.a
    public final void a(o oVar) {
        this.a.onSuccess();
    }

    @Override // com.vungle.ads.internal.network.a
    public final void a(Throwable th) {
        this.a.a();
    }
}
