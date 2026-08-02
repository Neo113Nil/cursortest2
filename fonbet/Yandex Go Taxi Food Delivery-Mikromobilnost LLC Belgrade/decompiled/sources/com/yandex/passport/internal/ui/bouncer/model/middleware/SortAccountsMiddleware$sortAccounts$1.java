package com.yandex.passport.internal.ui.bouncer.model.middleware;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@mvg(c = "com.yandex.passport.internal.ui.bouncer.model.middleware.SortAccountsMiddleware", f = "SortAccountsMiddleware.kt", l = {30}, m = "sortAccounts")
/* loaded from: classes2.dex */
final class SortAccountsMiddleware$sortAccounts$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ l1 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SortAccountsMiddleware$sortAccounts$1(l1 l1Var, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = l1Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return l1.b(this.this$0, null, this);
    }
}
