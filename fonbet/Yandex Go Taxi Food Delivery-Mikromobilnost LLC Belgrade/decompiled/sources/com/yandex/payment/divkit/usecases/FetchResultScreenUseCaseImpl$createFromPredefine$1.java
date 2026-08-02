package com.yandex.payment.divkit.usecases;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
@mvg(c = "com.yandex.payment.divkit.usecases.FetchResultScreenUseCaseImpl", f = "FetchResultScreenUseCase.kt", l = {39}, m = "createFromPredefine", v = 1)
/* loaded from: classes2.dex */
final class FetchResultScreenUseCaseImpl$createFromPredefine$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ j this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FetchResultScreenUseCaseImpl$createFromPredefine$1(j jVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = jVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.a(this);
    }
}
