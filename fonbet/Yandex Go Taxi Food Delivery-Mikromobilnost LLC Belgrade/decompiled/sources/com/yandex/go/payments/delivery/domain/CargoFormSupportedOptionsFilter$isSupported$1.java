package com.yandex.go.payments.delivery.domain;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "com.yandex.go.payments.delivery.domain.CargoFormSupportedOptionsFilter", f = "CargoFormSupportedOptionsFilter.kt", l = {33}, m = "isSupported", v = 2)
/* loaded from: classes13.dex */
final class CargoFormSupportedOptionsFilter$isSupported$1 extends ContinuationImpl {
    Object L$0;
    boolean Z$0;
    boolean Z$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CargoFormSupportedOptionsFilter$isSupported$1(a aVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.a(null, false, false, this);
    }
}
