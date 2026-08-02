package com.ybsdk.feature.transfer.version2.internal.screens.phone;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@mvg(c = "com.ybsdk.feature.transfer.version2.internal.screens.phone.TransferPhoneInputViewModel", f = "TransferPhoneInputViewModel.kt", l = {570}, m = "getSuggestedPartners-0E7RQCE")
/* loaded from: classes3.dex */
final class TransferPhoneInputViewModel$getSuggestedPartners$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TransferPhoneInputViewModel$getSuggestedPartners$1(c cVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object d0 = c.d0(this.this$0, null, null, this);
        return d0 == CoroutineSingletons.COROUTINE_SUSPENDED ? d0 : new Result(d0);
    }
}
