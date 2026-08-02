package com.ybsdk.feature.pfm.internal.ui;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@mvg(c = "com.ybsdk.feature.pfm.internal.ui.PfmViewModel", f = "PfmViewModel.kt", l = {691}, m = "getPfmFeedAndUpdateCommonData-gIAlu-s")
/* loaded from: classes3.dex */
final class PfmViewModel$getPfmFeedAndUpdateCommonData$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PfmViewModel$getPfmFeedAndUpdateCommonData$1(b bVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object e0 = this.this$0.e0(null, this);
        return e0 == CoroutineSingletons.COROUTINE_SUSPENDED ? e0 : new Result(e0);
    }
}
