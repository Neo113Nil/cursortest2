package com.yandex.plus.adapter.auth.passport750;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
@mvg(c = "com.yandex.plus.adapter.auth.passport750.PlusKPassport750AuthAdapter", f = "PlusKPassport750AuthAdapter.kt", l = {62, 71}, m = "login-gIAlu-s")
/* loaded from: classes2.dex */
final class PlusKPassport750AuthAdapter$login$1 extends ContinuationImpl {
    int I$0;
    int I$1;
    long J$0;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    Object L$7;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlusKPassport750AuthAdapter$login$1(a aVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object e = this.this$0.e(null, this);
        return e == CoroutineSingletons.COROUTINE_SUSPENDED ? e : new Result(e);
    }
}
