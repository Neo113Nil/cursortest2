package com.yandex.go.superapp.impl.interactor;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "com.yandex.go.superapp.impl.interactor.SuperappCommonHeadersInteractorImpl", f = "SuperappCommonHeadersInteractorImpl.kt", l = {45}, m = "getEatskitContextAsEncodedString", v = 2)
/* loaded from: classes14.dex */
final class SuperappCommonHeadersInteractorImpl$getEatskitContextAsEncodedString$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ d this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SuperappCommonHeadersInteractorImpl$getEatskitContextAsEncodedString$1(d dVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = dVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.b(this);
    }
}
