package com.yandex.go.address.address_map_picker.domain;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "com.yandex.go.address.address_map_picker.domain.AddressMapPickerDomainActionsInteractor", f = "AddressMapPickerDomainActionsInteractor.kt", l = {395}, m = "onAddressInfoReceived", v = 2)
/* loaded from: classes12.dex */
final class AddressMapPickerDomainActionsInteractor$onAddressInfoReceived$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AddressMapPickerDomainActionsInteractor$onAddressInfoReceived$1(c cVar, Continuation continuation) {
        super(continuation);
        this.this$0 = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return c.a(this.this$0, null, this);
    }
}
