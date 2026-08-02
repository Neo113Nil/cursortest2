package com.yandex.go.rida.bids.interactor;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "com.yandex.go.rida.bids.interactor.RejectBidInteractor", f = "RejectBidInteractor.kt", l = {24}, m = "rejectBid", v = 2)
/* loaded from: classes13.dex */
final class RejectBidInteractor$rejectBid$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ u this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RejectBidInteractor$rejectBid$1(u uVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = uVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.a(null, this);
    }
}
