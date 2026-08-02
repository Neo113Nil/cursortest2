package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.backport.Provider;

/* loaded from: classes8.dex */
public final class L implements Provider {
    public final /* synthetic */ Context a;
    public final /* synthetic */ N b;

    public L(N n, Context context) {
        this.b = n;
        this.a = context;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.backport.Provider
    public final Object get() {
        return this.b.a.a(this.a);
    }
}
