package com.ybsdk.feature.card.internal.presentation.cardissue;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@mvg(c = "com.ybsdk.feature.card.internal.presentation.cardissue.CardIssueViewModel", f = "CardIssueViewModel.kt", l = {HProv.PP_SET_PIN, 108, 110}, m = "submitCard-gIAlu-s")
/* loaded from: classes3.dex */
final class CardIssueViewModel$submitCard$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CardIssueViewModel$submitCard$1(a aVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object c0 = a.c0(this.this$0, null, this);
        return c0 == CoroutineSingletons.COROUTINE_SUSPENDED ? c0 : new Result(c0);
    }
}
