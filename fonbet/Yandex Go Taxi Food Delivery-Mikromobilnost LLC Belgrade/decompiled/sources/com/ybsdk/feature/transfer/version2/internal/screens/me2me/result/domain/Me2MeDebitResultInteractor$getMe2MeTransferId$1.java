package com.ybsdk.feature.transfer.version2.internal.screens.me2me.result.domain;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@mvg(c = "com.ybsdk.feature.transfer.version2.internal.screens.me2me.result.domain.Me2MeDebitResultInteractor", f = "Me2MeDebitResultInteractor.kt", l = {40}, m = "getMe2MeTransferId-0E7RQCE")
/* loaded from: classes3.dex */
final class Me2MeDebitResultInteractor$getMe2MeTransferId$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Me2MeDebitResultInteractor$getMe2MeTransferId$1(a aVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object d = this.this$0.d(null, null, this);
        return d == CoroutineSingletons.COROUTINE_SUSPENDED ? d : new Result(d);
    }
}
