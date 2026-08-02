package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.servicecomponents.ActivationBarrierCallback;
import java.util.concurrent.TimeUnit;

/* loaded from: classes8.dex */
public final class Ve implements Gc, ActivationBarrierCallback {
    public final D9 a;
    public final Fc b;
    public final Fc c;

    public Ve(D9 d9, C4707ah c4707ah, A4 a4, C4860gf c4860gf) {
        this.a = d9;
        Fc fc = new Fc(c4707ah, a4, c4860gf);
        this.b = fc;
        this.c = fc;
        if (fc.b()) {
            return;
        }
        C5342za.k().a().subscribe(TimeUnit.SECONDS.toMillis(U7.a.longValue()), C5342za.k().w().e(), this);
    }

    @Override // io.appmetrica.analytics.impl.Gc
    public final R8 a() {
        return this.c;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.servicecomponents.ActivationBarrierCallback
    public final void onWaitFinished() {
        this.b.a();
        ((C5262w5) this.a.a()).e();
    }
}
