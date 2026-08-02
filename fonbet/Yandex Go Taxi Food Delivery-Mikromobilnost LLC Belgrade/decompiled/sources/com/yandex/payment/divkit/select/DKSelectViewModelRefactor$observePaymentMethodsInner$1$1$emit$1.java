package com.yandex.payment.divkit.select;

import com.yandex.passport.internal.ui.social.gimap.SmtpServerPrefsFragment;
import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
@mvg(c = "com.yandex.payment.divkit.select.DKSelectViewModelRefactor$observePaymentMethodsInner$1$1", f = "DKSelectViewModelRefactor.kt", l = {SmtpServerPrefsFragment.DEFAULT_SMTP_PORT, 467, 470}, m = "emit", v = 1)
/* loaded from: classes2.dex */
final class DKSelectViewModelRefactor$observePaymentMethodsInner$1$1$emit$1 extends ContinuationImpl {
    int I$0;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ m this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DKSelectViewModelRefactor$observePaymentMethodsInner$1$1$emit$1(m mVar, Continuation continuation) {
        super(continuation);
        this.this$0 = mVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.emit(null, this);
    }
}
