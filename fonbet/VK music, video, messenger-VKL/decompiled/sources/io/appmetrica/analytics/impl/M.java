package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.backport.Provider;

/* loaded from: classes8.dex */
public final class M implements Provider {
    public final /* synthetic */ Context a;
    public final /* synthetic */ Qi b;
    public final /* synthetic */ N c;

    public M(N n, Context context, Qi qi) {
        this.c = n;
        this.a = context;
        this.b = qi;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.backport.Provider
    public final Object get() {
        return this.c.a.a(this.a, this.b);
    }
}
