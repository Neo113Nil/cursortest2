package com.yandex.go.address.address_map_picker.domain;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "com.yandex.go.address.address_map_picker.domain.AddressMapPickerDomainActionsInteractor", f = "AddressMapPickerDomainActionsInteractor.kt", l = {404, 406}, m = "getFavoriteButtonState", v = 2)
/* loaded from: classes12.dex */
final class AddressMapPickerDomainActionsInteractor$getFavoriteButtonState$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AddressMapPickerDomainActionsInteractor$getFavoriteButtonState$1(c cVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.c(null, this);
    }
}
