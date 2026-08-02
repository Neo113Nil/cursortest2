package com.yandex.go.chargers.order.domain;

import defpackage.hbp0;
import defpackage.jey;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes12.dex */
public final class e extends jey {
    public final /* synthetic */ f a;

    public e(f fVar) {
        this.a = fVar;
    }

    @Override // defpackage.jey, defpackage.iey
    public final void onStart() {
        f fVar = this.a;
        hbp0 hbp0Var = fVar.h;
        hbp0Var.a();
        hbp0.e(hbp0Var, null, null, new ChargersActiveOrdersSessionPollingInteractor$startPolling$1(fVar, null), 3);
    }

    @Override // defpackage.jey, defpackage.iey
    public final void onStop() {
        Object value;
        f fVar = this.a;
        fVar.h.b();
        r0 r0Var = fVar.f.a;
        do {
            value = r0Var.getValue();
            ((Boolean) value).getClass();
        } while (!r0Var.k(value, Boolean.TRUE));
    }
}
