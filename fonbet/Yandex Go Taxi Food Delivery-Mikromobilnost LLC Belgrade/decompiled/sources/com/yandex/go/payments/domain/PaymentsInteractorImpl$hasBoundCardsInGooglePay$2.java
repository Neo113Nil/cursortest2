package com.yandex.go.payments.domain;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ltse;", "", "", "<anonymous>", "(Ltse;)Ljava/util/List;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.payments.domain.PaymentsInteractorImpl$hasBoundCardsInGooglePay$2", f = "PaymentsInteractorImpl.kt", l = {HProv.PP_PASSWD_TERM}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class PaymentsInteractorImpl$hasBoundCardsInGooglePay$2 extends SuspendLambda implements wls {
    final /* synthetic */ List<String> $supportedGooglePayNetworks;
    int label;
    final /* synthetic */ l0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaymentsInteractorImpl$hasBoundCardsInGooglePay$2(l0 l0Var, List list, Continuation continuation) {
        super(2, continuation);
        this.this$0 = l0Var;
        this.$supportedGooglePayNetworks = list;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new PaymentsInteractorImpl$hasBoundCardsInGooglePay$2(this.this$0, this.$supportedGooglePayNetworks, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((PaymentsInteractorImpl$hasBoundCardsInGooglePay$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                kotlin.b.b(obj);
                return obj;
            }
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        com.yandex.go.payments.superapp.payment.a aVar = this.this$0.b;
        List<String> list = this.$supportedGooglePayNetworks;
        this.label = 1;
        Object a = aVar.a(list, this);
        return a == coroutineSingletons ? coroutineSingletons : a;
    }
}
