package com.yandex.go.taxi.summary.mobilityhub.interactor;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "com.yandex.go.taxi.summary.mobilityhub.interactor.TransportRoutesLoadingInteractor$startLoading$$inlined$mapNotNull$1", f = "TransportRoutesLoadingInteractor.kt", l = {112}, m = "collect", v = 2)
/* loaded from: classes14.dex */
public final class TransportRoutesLoadingInteractor$startLoading$$inlined$mapNotNull$1$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ u this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TransportRoutesLoadingInteractor$startLoading$$inlined$mapNotNull$1$1(u uVar, Continuation continuation) {
        super(continuation);
        this.this$0 = uVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.collect(null, this);
    }
}
