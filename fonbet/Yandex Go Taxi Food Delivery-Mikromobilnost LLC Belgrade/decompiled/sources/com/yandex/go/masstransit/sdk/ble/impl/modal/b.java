package com.yandex.go.masstransit.sdk.ble.impl.modal;

import androidx.lifecycle.DefaultLifecycleObserver;
import defpackage.pey;
import defpackage.tje;
import defpackage.tse;

/* loaded from: classes12.dex */
public final class b implements DefaultLifecycleObserver {
    public final /* synthetic */ tse a;
    public final /* synthetic */ d b;

    public b(tse tseVar, d dVar) {
        this.a = tseVar;
        this.b = dVar;
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onPause(pey peyVar) {
        tje.N(this.a, null, null, new MtGeoPaymentLifecycleListener$registerUnregisterBleReceiver$1$onPause$1(this.b, null), 3);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onResume(pey peyVar) {
        tje.N(this.a, null, null, new MtGeoPaymentLifecycleListener$registerUnregisterBleReceiver$1$onResume$1(this.b, null), 3);
    }
}
