package com.yandex.go.payments.cards.nfc.navigation;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "com.yandex.go.payments.cards.nfc.navigation.GoCardScannerRouter", f = "GoCardScannerRouter.kt", l = {27}, m = "startCardScannerForResult-IoAF18A", v = 2)
/* loaded from: classes13.dex */
final class GoCardScannerRouter$startCardScannerForResult$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GoCardScannerRouter$startCardScannerForResult$1(a aVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object n = this.this$0.n(this);
        return n == CoroutineSingletons.COROUTINE_SUSPENDED ? n : new Result(n);
    }
}
