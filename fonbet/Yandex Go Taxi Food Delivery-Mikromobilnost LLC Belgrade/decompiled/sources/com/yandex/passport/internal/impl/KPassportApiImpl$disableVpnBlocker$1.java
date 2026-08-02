package com.yandex.passport.internal.impl;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@mvg(c = "com.yandex.passport.internal.impl.KPassportApiImpl", f = "KPassportApiImpl.kt", l = {970}, m = "disableVpnBlocker-IoAF18A")
/* loaded from: classes15.dex */
final class KPassportApiImpl$disableVpnBlocker$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ f this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KPassportApiImpl$disableVpnBlocker$1(f fVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = fVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object C = this.this$0.C(this);
        return C == CoroutineSingletons.COROUTINE_SUSPENDED ? C : new Result(C);
    }
}
