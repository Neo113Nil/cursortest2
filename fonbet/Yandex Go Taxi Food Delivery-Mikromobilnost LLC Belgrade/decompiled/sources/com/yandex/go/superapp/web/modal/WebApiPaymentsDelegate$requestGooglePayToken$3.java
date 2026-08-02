package com.yandex.go.superapp.web.modal;

import defpackage.ck7;
import defpackage.gcn;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lck7;", "Lsvt;", "it", "Lzy11;", "<anonymous>", "(Lck7;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.superapp.web.modal.WebApiPaymentsDelegate$requestGooglePayToken$3", f = "WebApiPaymentsDelegate.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class WebApiPaymentsDelegate$requestGooglePayToken$3 extends SuspendLambda implements wls {
    final /* synthetic */ gcn $callback;
    /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WebApiPaymentsDelegate$requestGooglePayToken$3(gcn gcnVar, Continuation continuation) {
        super(2, continuation);
        this.$callback = gcnVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        WebApiPaymentsDelegate$requestGooglePayToken$3 webApiPaymentsDelegate$requestGooglePayToken$3 = new WebApiPaymentsDelegate$requestGooglePayToken$3(this.$callback, continuation);
        webApiPaymentsDelegate$requestGooglePayToken$3.L$0 = obj;
        return webApiPaymentsDelegate$requestGooglePayToken$3;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        WebApiPaymentsDelegate$requestGooglePayToken$3 webApiPaymentsDelegate$requestGooglePayToken$3 = (WebApiPaymentsDelegate$requestGooglePayToken$3) create((ck7) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        webApiPaymentsDelegate$requestGooglePayToken$3.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        ck7 ck7Var = (ck7) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        this.$callback.a(ck7Var);
        return zy11.a;
    }
}
