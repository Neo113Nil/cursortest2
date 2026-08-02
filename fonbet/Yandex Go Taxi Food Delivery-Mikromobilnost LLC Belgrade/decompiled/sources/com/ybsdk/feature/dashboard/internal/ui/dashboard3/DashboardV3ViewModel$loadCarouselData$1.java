package com.ybsdk.feature.dashboard.internal.ui.dashboard3;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@mvg(c = "com.ybsdk.feature.dashboard.internal.ui.dashboard3.DashboardV3ViewModel", f = "DashboardV3ViewModel.kt", l = {390, 391}, m = "loadCarouselData-0E7RQCE")
/* loaded from: classes3.dex */
final class DashboardV3ViewModel$loadCarouselData$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ d this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DashboardV3ViewModel$loadCarouselData$1(d dVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = dVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object c0 = d.c0(this.this$0, null, this);
        return c0 == CoroutineSingletons.COROUTINE_SUSPENDED ? c0 : new Result(c0);
    }
}
