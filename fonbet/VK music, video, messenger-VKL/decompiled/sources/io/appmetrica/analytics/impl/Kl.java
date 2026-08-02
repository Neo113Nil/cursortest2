package io.appmetrica.analytics.impl;

import android.content.Context;
import javax.net.ssl.SSLSocketFactory;

/* loaded from: classes8.dex */
public final class Kl implements W2 {
    public final Context a;

    public Kl(Context context) {
        this.a = context;
    }

    public final Context b() {
        return this.a;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.io.SslSocketFactoryProvider
    public final SSLSocketFactory getSslSocketFactory() {
        return null;
    }

    @Override // io.appmetrica.analytics.impl.W2, io.appmetrica.analytics.impl.InterfaceC5229um
    public final void a(C5100pm c5100pm) {
    }
}
