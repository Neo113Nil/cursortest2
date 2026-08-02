package io.appmetrica.analytics.idsync.impl;

import io.appmetrica.analytics.coreapi.internal.servicecomponents.ActivationBarrierCallback;

/* renamed from: io.appmetrica.analytics.idsync.impl.g, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C4688g implements ActivationBarrierCallback {
    public final /* synthetic */ h a;

    public C4688g(h hVar) {
        this.a = hVar;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.servicecomponents.ActivationBarrierCallback
    public final void onWaitFinished() {
        C4687f c4687f = this.a.g;
        if (c4687f == null) {
            c4687f = null;
        }
        c4687f.run();
    }
}
