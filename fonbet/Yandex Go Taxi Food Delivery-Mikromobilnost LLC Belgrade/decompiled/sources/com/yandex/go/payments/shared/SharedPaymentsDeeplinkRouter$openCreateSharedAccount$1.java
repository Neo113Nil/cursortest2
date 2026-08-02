package com.yandex.go.payments.shared;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "com.yandex.go.payments.shared.SharedPaymentsDeeplinkRouter", f = "SharedPaymentsDeeplinkRouter.kt", l = {105}, m = "openCreateSharedAccount", v = 2)
/* loaded from: classes13.dex */
final class SharedPaymentsDeeplinkRouter$openCreateSharedAccount$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ z this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SharedPaymentsDeeplinkRouter$openCreateSharedAccount$1(z zVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = zVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.b(null, null, this);
    }
}
