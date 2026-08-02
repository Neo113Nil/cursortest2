package com.yandex.passport.internal.impl;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@mvg(c = "com.yandex.passport.internal.impl.KPassportLimitedApiImpl", f = "KPassportLimitedApiImpl.kt", l = {337}, m = "isAutoLoginFromSmartlockDisabled-IoAF18A")
/* loaded from: classes15.dex */
final class KPassportLimitedApiImpl$isAutoLoginFromSmartlockDisabled$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ i this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KPassportLimitedApiImpl$isAutoLoginFromSmartlockDisabled$1(i iVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = iVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object x = this.this$0.x(this);
        return x == CoroutineSingletons.COROUTINE_SUSPENDED ? x : new Result(x);
    }
}
