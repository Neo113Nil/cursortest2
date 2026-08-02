package com.ybsdk.feature.transfer.version2.internal.screens.me2me.pull;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@mvg(c = "com.ybsdk.feature.transfer.version2.internal.screens.me2me.pull.TransferMe2MeConfirmPullViewModel", f = "TransferMe2MeConfirmPullViewModel.kt", l = {190}, m = "openTwoFactorScreen")
/* loaded from: classes3.dex */
final class TransferMe2MeConfirmPullViewModel$openTwoFactorScreen$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TransferMe2MeConfirmPullViewModel$openTwoFactorScreen$1(a aVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return a.b0(this.this$0, null, null, this);
    }
}
