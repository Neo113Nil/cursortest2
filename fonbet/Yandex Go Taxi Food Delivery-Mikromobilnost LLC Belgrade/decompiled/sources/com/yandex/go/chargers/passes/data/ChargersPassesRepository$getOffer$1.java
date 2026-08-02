package com.yandex.go.chargers.passes.data;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "com.yandex.go.chargers.passes.data.ChargersPassesRepository", f = "ChargersPassesRepository.kt", l = {69, 85}, m = "getOffer", v = 2)
/* loaded from: classes12.dex */
final class ChargersPassesRepository$getOffer$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ r0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChargersPassesRepository$getOffer$1(r0 r0Var, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = r0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.c(null, this);
    }
}
