package com.yandex.go.superapp.orders.card.experiments;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "com.yandex.go.superapp.orders.card.experiments.SuperappTrackingCardRepository", f = "SuperappTrackingCardRepository.kt", l = {25}, m = "isEnabled", v = 2)
/* loaded from: classes14.dex */
final class SuperappTrackingCardRepository$isEnabled$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ y this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SuperappTrackingCardRepository$isEnabled$1(y yVar, Continuation continuation) {
        super(continuation);
        this.this$0 = yVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.f(this);
    }
}
