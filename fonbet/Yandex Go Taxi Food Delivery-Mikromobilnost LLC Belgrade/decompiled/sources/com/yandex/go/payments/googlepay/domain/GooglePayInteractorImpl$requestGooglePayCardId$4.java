package com.yandex.go.payments.googlepay.domain;

import com.yandex.go.payments.data.model.BindGooglePayResponse;
import defpackage.ac20;
import defpackage.g8e;
import defpackage.hst;
import defpackage.jst;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.qv10;
import defpackage.wls;
import defpackage.zy11;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.analytics.q;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/yandex/go/payments/data/model/BindGooglePayResponse;", "it", "Lzy11;", "<anonymous>", "(Lcom/yandex/go/payments/data/model/BindGooglePayResponse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.payments.googlepay.domain.GooglePayInteractorImpl$requestGooglePayCardId$4", f = "GooglePayInteractorImpl.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class GooglePayInteractorImpl$requestGooglePayCardId$4 extends SuspendLambda implements wls {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ e this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GooglePayInteractorImpl$requestGooglePayCardId$4(e eVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = eVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        GooglePayInteractorImpl$requestGooglePayCardId$4 googlePayInteractorImpl$requestGooglePayCardId$4 = new GooglePayInteractorImpl$requestGooglePayCardId$4(this.this$0, continuation);
        googlePayInteractorImpl$requestGooglePayCardId$4.L$0 = obj;
        return googlePayInteractorImpl$requestGooglePayCardId$4;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        GooglePayInteractorImpl$requestGooglePayCardId$4 googlePayInteractorImpl$requestGooglePayCardId$4 = (GooglePayInteractorImpl$requestGooglePayCardId$4) create((BindGooglePayResponse) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        googlePayInteractorImpl$requestGooglePayCardId$4.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        BindGooglePayResponse bindGooglePayResponse = (BindGooglePayResponse) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        e eVar = this.this$0;
        List list = e.x;
        eVar.getClass();
        hst hstVar = jst.e;
        String str = bindGooglePayResponse.a;
        String str2 = bindGooglePayResponse.b;
        Boolean valueOf = Boolean.valueOf(!(str2 == null || str2.length() == 0));
        String str3 = bindGooglePayResponse.c;
        qv10.C(new Object[]{str, valueOf, Boolean.valueOf(!(str3 == null || str3.length() == 0))}, 3, "Google Pay: reportBindGooglePayTokenResponse: response: status=%s, payment_method is not empty=%s, trust_payment_id is not empty=%s", hstVar);
        ((q) ((ac20) eVar.p.get())).h("GooglePay.Bind.Succeeded", g8e.z("identifier", eVar.u));
        return zy11.a;
    }
}
