package com.yandex.payment.divkit.select;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
@mvg(c = "com.yandex.payment.divkit.select.DKSelectViewModelRefactor", f = "DKSelectViewModelRefactor.kt", l = {369, 370, 371, 374}, m = "startPlusCardTopUpSyncing", v = 1)
/* loaded from: classes2.dex */
final class DKSelectViewModelRefactor$startPlusCardTopUpSyncing$1 extends ContinuationImpl {
    boolean Z$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ n this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DKSelectViewModelRefactor$startPlusCardTopUpSyncing$1(n nVar, Continuation continuation) {
        super(continuation);
        this.this$0 = nVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return n.a0(this.this$0, this);
    }
}
