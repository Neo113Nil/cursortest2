package com.yandex.go.address_confirmation.modal;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "com.yandex.go.address_confirmation.modal.SourceAddressConfirmationModalViewPresenter", f = "SourceAddressConfirmationModalViewPresenter.kt", l = {220}, m = "isSaveAddressEnabled", v = 2)
/* loaded from: classes12.dex */
final class SourceAddressConfirmationModalViewPresenter$isSaveAddressEnabled$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ d this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SourceAddressConfirmationModalViewPresenter$isSaveAddressEnabled$1(d dVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = dVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return d.Kg(this.this$0, null, this);
    }
}
