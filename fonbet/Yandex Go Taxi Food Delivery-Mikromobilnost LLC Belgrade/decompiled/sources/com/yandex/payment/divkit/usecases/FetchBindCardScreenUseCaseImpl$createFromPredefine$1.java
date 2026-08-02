package com.yandex.payment.divkit.usecases;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
@mvg(c = "com.yandex.payment.divkit.usecases.FetchBindCardScreenUseCaseImpl", f = "FetchBindCardScreenUseCase.kt", l = {38}, m = "createFromPredefine", v = 1)
/* loaded from: classes2.dex */
final class FetchBindCardScreenUseCaseImpl$createFromPredefine$1 extends ContinuationImpl {
    boolean Z$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ d this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FetchBindCardScreenUseCaseImpl$createFromPredefine$1(d dVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = dVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return d.c(this.this$0, false, this);
    }
}
