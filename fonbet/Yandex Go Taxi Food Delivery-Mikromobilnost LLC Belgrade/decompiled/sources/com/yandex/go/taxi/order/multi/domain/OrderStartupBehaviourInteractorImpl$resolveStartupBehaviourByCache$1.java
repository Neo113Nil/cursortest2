package com.yandex.go.taxi.order.multi.domain;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "com.yandex.go.taxi.order.multi.domain.OrderStartupBehaviourInteractorImpl", f = "OrderStartupBehaviourInteractorImpl.kt", l = {36, 39, 40}, m = "resolveStartupBehaviourByCache", v = 2)
/* loaded from: classes8.dex */
final class OrderStartupBehaviourInteractorImpl$resolveStartupBehaviourByCache$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OrderStartupBehaviourInteractorImpl$resolveStartupBehaviourByCache$1(a aVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.a(this);
    }
}
