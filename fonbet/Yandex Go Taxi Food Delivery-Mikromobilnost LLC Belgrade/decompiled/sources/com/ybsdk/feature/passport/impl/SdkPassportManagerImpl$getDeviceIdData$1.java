package com.ybsdk.feature.passport.impl;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@mvg(c = "com.ybsdk.feature.passport.impl.SdkPassportManagerImpl", f = "SdkPassportManagerImpl.kt", l = {59}, m = "getDeviceIdData-gIAlu-s")
/* loaded from: classes3.dex */
final class SdkPassportManagerImpl$getDeviceIdData$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SdkPassportManagerImpl$getDeviceIdData$1(a aVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object e = this.this$0.e(0L, this);
        return e == CoroutineSingletons.COROUTINE_SUSPENDED ? e : new Result(e);
    }
}
