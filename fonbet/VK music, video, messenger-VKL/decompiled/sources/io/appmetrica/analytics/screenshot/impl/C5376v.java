package io.appmetrica.analytics.screenshot.impl;

import io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityEvent;
import io.appmetrica.analytics.modulesapi.internal.client.ClientContext;

/* renamed from: io.appmetrica.analytics.screenshot.impl.v, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C5376v implements T {
    public final ClientContext a;
    public final U b;
    public volatile C5366k c;
    public final Z d;

    public C5376v(ClientContext clientContext, U u) {
        this.a = clientContext;
        this.b = u;
        this.d = new Z(clientContext, new C5373s(this));
    }

    @Override // io.appmetrica.analytics.screenshot.impl.T
    public final void a(C5368m c5368m) {
        this.c = c5368m != null ? c5368m.c : null;
        this.d.c = this.c;
    }

    public final String b() {
        return "ContentObserverScreenshotCaptor";
    }

    @Override // io.appmetrica.analytics.screenshot.impl.T
    public final void a() {
        this.a.getActivityLifecycleRegistry().registerListener(new C5375u(this), ActivityEvent.RESUMED, ActivityEvent.PAUSED);
    }
}
