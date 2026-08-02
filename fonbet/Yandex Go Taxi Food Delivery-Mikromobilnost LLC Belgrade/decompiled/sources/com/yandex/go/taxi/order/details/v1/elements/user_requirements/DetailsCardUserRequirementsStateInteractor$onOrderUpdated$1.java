package com.yandex.go.taxi.order.details.v1.elements.user_requirements;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "com.yandex.go.taxi.order.details.v1.elements.user_requirements.DetailsCardUserRequirementsStateInteractor", f = "DetailsCardUserRequirementsStateInteractor.kt", l = {15}, m = "onOrderUpdated", v = 2)
/* loaded from: classes14.dex */
final class DetailsCardUserRequirementsStateInteractor$onOrderUpdated$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DetailsCardUserRequirementsStateInteractor$onOrderUpdated$1(b bVar, Continuation continuation) {
        super(continuation);
        this.this$0 = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.a(null, this);
    }
}
