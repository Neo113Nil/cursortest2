package com.ybsdk.feature.card.internal.presentation.cardissue;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@mvg(c = "com.ybsdk.feature.card.internal.presentation.cardissue.CardIssueViewModel", f = "CardIssueViewModel.kt", l = {HProv.PP_NK_SYNC}, m = "pollApplication-gIAlu-s")
/* loaded from: classes3.dex */
final class CardIssueViewModel$pollApplication$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CardIssueViewModel$pollApplication$1(a aVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object g0 = this.this$0.g0(null, this);
        return g0 == CoroutineSingletons.COROUTINE_SUSPENDED ? g0 : new Result(g0);
    }
}
