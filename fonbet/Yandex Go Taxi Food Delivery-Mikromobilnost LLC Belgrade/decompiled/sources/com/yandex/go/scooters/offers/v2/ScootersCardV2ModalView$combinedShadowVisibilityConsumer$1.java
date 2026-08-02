package com.yandex.go.scooters.offers.v2;

import defpackage.wls;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* synthetic */ class ScootersCardV2ModalView$combinedShadowVisibilityConsumer$1 extends FunctionReferenceImpl implements wls {
    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        boolean isResultShadowVisible;
        isResultShadowVisible = ((ScootersCardV2ModalView) this.receiver).isResultShadowVisible(((Boolean) obj).booleanValue(), ((Boolean) obj2).booleanValue());
        return Boolean.valueOf(isResultShadowVisible);
    }
}
