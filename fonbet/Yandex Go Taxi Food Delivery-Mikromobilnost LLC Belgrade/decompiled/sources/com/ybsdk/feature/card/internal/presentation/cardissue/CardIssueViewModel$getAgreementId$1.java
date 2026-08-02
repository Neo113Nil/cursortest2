package com.ybsdk.feature.card.internal.presentation.cardissue;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@mvg(c = "com.ybsdk.feature.card.internal.presentation.cardissue.CardIssueViewModel", f = "CardIssueViewModel.kt", l = {99}, m = "getAgreementId-IoAF18A")
/* loaded from: classes3.dex */
final class CardIssueViewModel$getAgreementId$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CardIssueViewModel$getAgreementId$1(a aVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object d0 = this.this$0.d0(this);
        return d0 == CoroutineSingletons.COROUTINE_SUSPENDED ? d0 : new Result(d0);
    }
}
