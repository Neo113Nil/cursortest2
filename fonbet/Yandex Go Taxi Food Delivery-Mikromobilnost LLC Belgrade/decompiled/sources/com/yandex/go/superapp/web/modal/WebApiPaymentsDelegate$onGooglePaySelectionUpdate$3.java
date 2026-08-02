package com.yandex.go.superapp.web.modal;

import defpackage.mvg;
import defpackage.vpr;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lvpr;", "Lck7;", "Lsvt;", "Lzy11;", "<anonymous>", "(Lvpr;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.superapp.web.modal.WebApiPaymentsDelegate$onGooglePaySelectionUpdate$3", f = "WebApiPaymentsDelegate.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class WebApiPaymentsDelegate$onGooglePaySelectionUpdate$3 extends SuspendLambda implements wls {
    int label;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new WebApiPaymentsDelegate$onGooglePaySelectionUpdate$3(2, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        ((WebApiPaymentsDelegate$onGooglePaySelectionUpdate$3) create((vpr) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
        throw null;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.b.b(obj);
        throw new IllegalArgumentException("Unsupported merchantId or gateway");
    }
}
