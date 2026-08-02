package com.yandex.plus.home.feature.webviews.internal;

import defpackage.mth;
import defpackage.rol0;
import kotlinx.coroutines.flow.e;

/* loaded from: classes2.dex */
public final class c {
    public final d a;
    public final com.yandex.plus.home.feature.webviews.internalapi.bridge.a b;

    public c(d dVar, com.yandex.plus.home.feature.webviews.internalapi.bridge.a aVar) {
        this.a = dVar;
        this.b = aVar;
    }

    public final mth a(String str) {
        return new mth(new rol0(new SubscribeOnWebViewMessageUseCase$mapMessageAndSendToReceiver$1(e.c(this.a.b), str, this, null)), 6);
    }

    public final mth b(String str) {
        return new mth(new rol0(new SubscribeOnWebViewMessageUseCase$mapMessageAndSendToReceiverContracts$1(e.c(this.a.b), str, null)), 6);
    }
}
