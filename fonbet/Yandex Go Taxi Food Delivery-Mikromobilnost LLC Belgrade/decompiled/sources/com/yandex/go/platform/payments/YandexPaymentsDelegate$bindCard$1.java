package com.yandex.go.platform.payments;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@mvg(c = "com.yandex.go.platform.payments.YandexPaymentsDelegate", f = "YandexPaymentsDelegate.kt", l = {19}, m = "bindCard-BWLJW6A")
/* loaded from: classes13.dex */
final class YandexPaymentsDelegate$bindCard$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public YandexPaymentsDelegate$bindCard$1(a aVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object a = this.this$0.a(null, null, null, this);
        return a == CoroutineSingletons.COROUTINE_SUSPENDED ? a : new Result(a);
    }
}
