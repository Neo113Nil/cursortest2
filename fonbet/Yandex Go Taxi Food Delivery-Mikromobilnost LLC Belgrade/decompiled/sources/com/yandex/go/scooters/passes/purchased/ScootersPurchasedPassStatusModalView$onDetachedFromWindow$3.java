package com.yandex.go.scooters.passes.purchased;

import defpackage.noh;
import kotlin.Metadata;
import kotlin.jvm.internal.MutablePropertyReference0Impl;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* synthetic */ class ScootersPurchasedPassStatusModalView$onDetachedFromWindow$3 extends MutablePropertyReference0Impl {
    @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, defpackage.hgx
    public final Object get() {
        noh nohVar;
        nohVar = ((ScootersPurchasedPassStatusModalView) this.receiver).animationDeferred;
        return nohVar;
    }

    public final void i(Object obj) {
        ((ScootersPurchasedPassStatusModalView) this.receiver).animationDeferred = null;
    }
}
