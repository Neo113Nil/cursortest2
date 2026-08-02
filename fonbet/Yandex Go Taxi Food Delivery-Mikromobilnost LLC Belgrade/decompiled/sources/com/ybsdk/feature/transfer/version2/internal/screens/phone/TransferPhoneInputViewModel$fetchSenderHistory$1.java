package com.ybsdk.feature.transfer.version2.internal.screens.phone;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@mvg(c = "com.ybsdk.feature.transfer.version2.internal.screens.phone.TransferPhoneInputViewModel", f = "TransferPhoneInputViewModel.kt", l = {665}, m = "fetchSenderHistory")
/* loaded from: classes3.dex */
final class TransferPhoneInputViewModel$fetchSenderHistory$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TransferPhoneInputViewModel$fetchSenderHistory$1(c cVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return c.c0(this.this$0, this);
    }
}
