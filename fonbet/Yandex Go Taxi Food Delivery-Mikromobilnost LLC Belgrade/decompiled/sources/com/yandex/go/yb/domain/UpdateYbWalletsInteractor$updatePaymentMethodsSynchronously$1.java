package com.yandex.go.yb.domain;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "com.yandex.go.yb.domain.UpdateYbWalletsInteractor", f = "UpdateYbWalletsInteractor.kt", l = {37, 40, 40}, m = "updatePaymentMethodsSynchronously", v = 2)
/* loaded from: classes15.dex */
final class UpdateYbWalletsInteractor$updatePaymentMethodsSynchronously$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ o this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UpdateYbWalletsInteractor$updatePaymentMethodsSynchronously$1(o oVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = oVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.c(this);
    }
}
