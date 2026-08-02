package com.ybsdk.feature.passport.impl;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@mvg(c = "com.ybsdk.feature.passport.impl.SdkPassportManagerImpl", f = "SdkPassportManagerImpl.kt", l = {99}, m = "getUserInfo-gIAlu-s")
/* loaded from: classes8.dex */
final class SdkPassportManagerImpl$getUserInfo$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SdkPassportManagerImpl$getUserInfo$1(a aVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object g = this.this$0.g(0L, this);
        return g == CoroutineSingletons.COROUTINE_SUSPENDED ? g : new Result(g);
    }
}
