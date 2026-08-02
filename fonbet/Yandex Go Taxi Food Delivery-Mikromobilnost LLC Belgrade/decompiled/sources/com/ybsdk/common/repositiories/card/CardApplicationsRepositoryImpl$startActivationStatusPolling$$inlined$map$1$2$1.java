package com.ybsdk.common.repositiories.card;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@mvg(c = "com.ybsdk.common.repositiories.card.CardApplicationsRepositoryImpl$startActivationStatusPolling$$inlined$map$1$2", f = "CardApplicationsRepositoryImpl.kt", l = {50}, m = "emit")
/* loaded from: classes2.dex */
public final class CardApplicationsRepositoryImpl$startActivationStatusPolling$$inlined$map$1$2$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CardApplicationsRepositoryImpl$startActivationStatusPolling$$inlined$map$1$2$1(a aVar, Continuation continuation) {
        super(continuation);
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.emit(null, this);
    }
}
