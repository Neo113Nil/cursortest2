package com.yandex.go.summary.interactor.core;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "com.yandex.go.summary.interactor.core.ComposeSummaryScrollToRequirementInteractor", f = "ComposeSummaryScrollToRequirementInteractor.kt", l = {21, 22}, m = "scrollToRequirement", v = 2)
/* loaded from: classes14.dex */
final class ComposeSummaryScrollToRequirementInteractor$scrollToRequirement$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ComposeSummaryScrollToRequirementInteractor$scrollToRequirement$1(b bVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.b(null, null, this);
    }
}
