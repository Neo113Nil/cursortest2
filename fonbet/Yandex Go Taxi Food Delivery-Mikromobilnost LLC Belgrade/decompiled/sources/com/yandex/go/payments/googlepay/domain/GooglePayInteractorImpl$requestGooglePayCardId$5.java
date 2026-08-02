package com.yandex.go.payments.googlepay.domain;

import defpackage.ac20;
import defpackage.jst;
import defpackage.mvg;
import defpackage.zls;
import defpackage.zy11;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.analytics.q;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lvpr;", "Lcom/yandex/go/payments/data/model/BindGooglePayResponse;", "", "it", "Lzy11;", "<anonymous>", "(Lvpr;Ljava/lang/Throwable;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.payments.googlepay.domain.GooglePayInteractorImpl$requestGooglePayCardId$5", f = "GooglePayInteractorImpl.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class GooglePayInteractorImpl$requestGooglePayCardId$5 extends SuspendLambda implements zls {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ e this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GooglePayInteractorImpl$requestGooglePayCardId$5(e eVar, Continuation continuation) {
        super(3, continuation);
        this.this$0 = eVar;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        GooglePayInteractorImpl$requestGooglePayCardId$5 googlePayInteractorImpl$requestGooglePayCardId$5 = new GooglePayInteractorImpl$requestGooglePayCardId$5(this.this$0, (Continuation) obj3);
        googlePayInteractorImpl$requestGooglePayCardId$5.L$0 = (Throwable) obj2;
        googlePayInteractorImpl$requestGooglePayCardId$5.invokeSuspend(zy11.a);
        throw null;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Throwable th = (Throwable) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.b.b(obj);
        e eVar = this.this$0;
        List list = e.x;
        eVar.getClass();
        jst.e.p("Google Pay: reportBindGooglePayTokenError", th);
        ((q) ((ac20) eVar.p.get())).h("GooglePay.Bind.Failed", kotlin.collections.b.i(new Pair("identifier", eVar.u), new Pair("error", th.getClass().getSimpleName())));
        throw th;
    }
}
