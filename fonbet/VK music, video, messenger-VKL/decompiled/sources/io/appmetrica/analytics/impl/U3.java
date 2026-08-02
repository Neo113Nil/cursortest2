package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.modulesapi.internal.client.ModuleClientActivator;

/* loaded from: classes8.dex */
public final class U3 implements ModuleClientActivator {
    @Override // io.appmetrica.analytics.modulesapi.internal.client.ModuleClientActivator
    public final void activate(Context context) {
        C4716b0 b = C5030n4.l().b();
        b.c.a().executeDelayed(new C4690a0(b, context), b.d);
    }
}
