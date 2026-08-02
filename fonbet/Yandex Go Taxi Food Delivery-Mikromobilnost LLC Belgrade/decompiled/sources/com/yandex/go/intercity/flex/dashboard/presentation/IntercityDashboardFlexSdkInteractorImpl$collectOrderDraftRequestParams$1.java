package com.yandex.go.intercity.flex.dashboard.presentation;

import com.yandex.messaging.domain.poll.PollMessageDraft;
import defpackage.hu70;
import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "com.yandex.go.intercity.flex.dashboard.presentation.IntercityDashboardFlexSdkInteractorImpl", f = "IntercityDashboardFlexSdkInteractorImpl.kt", l = {130, PollMessageDraft.MAX_ANSWER_LENGTH}, m = "collectOrderDraftRequestParams-xgoinDg", v = 2)
/* loaded from: classes12.dex */
final class IntercityDashboardFlexSdkInteractorImpl$collectOrderDraftRequestParams$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ g this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IntercityDashboardFlexSdkInteractorImpl$collectOrderDraftRequestParams$1(g gVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = gVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object b = this.this$0.b(this);
        return b == CoroutineSingletons.COROUTINE_SUSPENDED ? b : new hu70((String) b);
    }
}
