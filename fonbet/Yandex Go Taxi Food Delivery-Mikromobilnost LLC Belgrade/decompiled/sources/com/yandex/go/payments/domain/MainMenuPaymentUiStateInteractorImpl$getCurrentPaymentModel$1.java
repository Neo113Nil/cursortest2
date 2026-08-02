package com.yandex.go.payments.domain;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "com.yandex.go.payments.domain.MainMenuPaymentUiStateInteractorImpl", f = "MainMenuPaymentUiStateInteractorImpl.kt", l = {173}, m = "getCurrentPaymentModel", v = 2)
/* loaded from: classes13.dex */
final class MainMenuPaymentUiStateInteractorImpl$getCurrentPaymentModel$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ u this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MainMenuPaymentUiStateInteractorImpl$getCurrentPaymentModel$1(u uVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = uVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return u.a(this.this$0, null, this);
    }
}
