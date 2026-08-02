package com.ybsdk.feature.transfer.version2.internal.screens.result;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@mvg(c = "com.ybsdk.feature.transfer.version2.internal.screens.result.TransferMainResultViewModel", f = "TransferMainResultViewModel.kt", l = {254}, m = "twoFactorScreenNavigate")
/* loaded from: classes3.dex */
final class TransferMainResultViewModel$twoFactorScreenNavigate$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TransferMainResultViewModel$twoFactorScreenNavigate$1(a aVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return a.d0(this.this$0, null, this);
    }
}
