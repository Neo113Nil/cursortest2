package com.ybsdk.feature.card.internal.repositories;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@mvg(c = "com.ybsdk.feature.card.internal.repositories.CardRepository", f = "CardRepository.kt", l = {HProv.PP_SET_PIN}, m = "getYbCardDetails-yxL6bBk")
/* loaded from: classes3.dex */
final class CardRepository$getYbCardDetails$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CardRepository$getYbCardDetails$1(b bVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object i = this.this$0.i(null, null, null, null, this);
        return i == CoroutineSingletons.COROUTINE_SUSPENDED ? i : new Result(i);
    }
}
