package com.ybsdk.feature.partnerselection.internal.screens.partners.presentation;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@mvg(c = "com.ybsdk.feature.partnerselection.internal.screens.partners.presentation.PartnersViewModel", f = "PartnersViewModel.kt", l = {187}, m = "getAllPartners-gIAlu-s")
/* loaded from: classes3.dex */
final class PartnersViewModel$getAllPartners$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PartnersViewModel$getAllPartners$1(c cVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object b0 = c.b0(this.this$0, null, this);
        return b0 == CoroutineSingletons.COROUTINE_SUSPENDED ? b0 : new Result(b0);
    }
}
