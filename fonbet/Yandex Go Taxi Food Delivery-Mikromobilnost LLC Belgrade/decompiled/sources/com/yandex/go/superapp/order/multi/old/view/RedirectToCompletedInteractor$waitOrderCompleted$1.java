package com.yandex.go.superapp.order.multi.old.view;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "com.yandex.go.superapp.order.multi.old.view.RedirectToCompletedInteractor", f = "RedirectToCompletedInteractor.kt", l = {59}, m = "waitOrderCompleted", v = 2)
/* loaded from: classes14.dex */
final class RedirectToCompletedInteractor$waitOrderCompleted$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ l this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RedirectToCompletedInteractor$waitOrderCompleted$1(l lVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = lVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return l.b(this.this$0, null, this);
    }
}
