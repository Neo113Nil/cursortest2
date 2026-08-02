package com.ybsdk.feature.kyc.internal.network.dto;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@mvg(c = "com.ybsdk.feature.kyc.internal.network.dto.KycActionResponse", f = "KycActionResponse.kt", l = {18}, m = "extractEntityResult-gIAlu-s")
/* loaded from: classes3.dex */
public final class KycActionResponse$extractEntityResult$1<Entity> extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ KycActionResponse<T> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KycActionResponse$extractEntityResult$1(KycActionResponse kycActionResponse, Continuation continuation) {
        super(continuation);
        this.this$0 = kycActionResponse;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object m441extractEntityResultgIAlus = this.this$0.m441extractEntityResultgIAlus(null, this);
        return m441extractEntityResultgIAlus == CoroutineSingletons.COROUTINE_SUSPENDED ? m441extractEntityResultgIAlus : new Result(m441extractEntityResultgIAlus);
    }
}
