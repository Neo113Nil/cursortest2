package com.yandex.go.summary.navigation;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "com.yandex.go.summary.navigation.ComposeSummaryRouter$InnerNavigator", f = "ComposeSummaryRouter.kt", l = {477, 484, 488}, m = "openCardAndScrollToRequirement", v = 2)
/* loaded from: classes14.dex */
final class ComposeSummaryRouter$InnerNavigator$openCardAndScrollToRequirement$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ComposeSummaryRouter$InnerNavigator$openCardAndScrollToRequirement$1(c cVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.x(null, null, this);
    }
}
