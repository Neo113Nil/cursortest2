package com.ybsdk.api;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@mvg(c = "com.ybsdk.api.YBSdk", f = "YBSdk.kt", l = {178}, m = "updateTransactions-IoAF18A")
/* loaded from: classes2.dex */
public final class YBSdk$updateTransactions$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ YBSdk this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public YBSdk$updateTransactions$1(YBSdk yBSdk, Continuation continuation) {
        super(continuation);
        this.this$0 = yBSdk;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object m352updateTransactionsIoAF18A = this.this$0.m352updateTransactionsIoAF18A(this);
        return m352updateTransactionsIoAF18A == CoroutineSingletons.COROUTINE_SUSPENDED ? m352updateTransactionsIoAF18A : new Result(m352updateTransactionsIoAF18A);
    }
}
