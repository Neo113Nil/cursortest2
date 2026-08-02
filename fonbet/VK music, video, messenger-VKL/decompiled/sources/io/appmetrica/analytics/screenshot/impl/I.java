package io.appmetrica.analytics.screenshot.impl;

import io.appmetrica.analytics.modulesapi.internal.client.ClientContext;
import java.util.List;
import xsna.e43;

/* loaded from: classes8.dex */
public final class I implements InterfaceC5364i {
    public final ClientContext a;
    public final U b;

    public I(ClientContext clientContext, U u) {
        this.a = clientContext;
        this.b = u;
    }

    @Override // io.appmetrica.analytics.screenshot.impl.InterfaceC5364i
    public final List<T> a() {
        return e43.l(new C5376v(this.a, this.b), new g0(this.a, this.b));
    }
}
