package com.yandex.go.payments.domain;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "com.yandex.go.payments.domain.BanksIconsRepositoryImpl", f = "BanksIconsRepositoryImpl.kt", l = {61, 70}, m = "processNewBankModelFromUrl", v = 2)
/* loaded from: classes8.dex */
final class BanksIconsRepositoryImpl$processNewBankModelFromUrl$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ i this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BanksIconsRepositoryImpl$processNewBankModelFromUrl$1(i iVar, Continuation continuation) {
        super(continuation);
        this.this$0 = iVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return i.d(this.this$0, null, this);
    }
}
