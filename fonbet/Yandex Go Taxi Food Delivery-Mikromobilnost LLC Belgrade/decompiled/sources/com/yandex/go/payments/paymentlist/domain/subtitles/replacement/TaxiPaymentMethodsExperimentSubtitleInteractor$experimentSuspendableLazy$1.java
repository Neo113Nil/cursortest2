package com.yandex.go.payments.paymentlist.domain.subtitles.replacement;

import com.yandex.go.payments.paymentlist.experiments.PaymentMethodsCustomSubtitlesExperiment;
import defpackage.cvu0;
import defpackage.gia1;
import defpackage.jbh;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.rqo;
import defpackage.t1b0;
import defpackage.tls;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.tariffs.model.TariffOrderFlow;

@Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", "Lcom/yandex/go/payments/paymentlist/experiments/PaymentMethodsCustomSubtitlesExperiment;"}, k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "com.yandex.go.payments.paymentlist.domain.subtitles.replacement.TaxiPaymentMethodsExperimentSubtitleInteractor$experimentSuspendableLazy$1", f = "TaxiPaymentMethodsExperimentSubtitleInteractor.kt", l = {25}, m = "invokeSuspend", v = 2)
/* loaded from: classes8.dex */
final class TaxiPaymentMethodsExperimentSubtitleInteractor$experimentSuspendableLazy$1 extends SuspendLambda implements tls {
    final /* synthetic */ rqo $experimentProviderFactory;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TaxiPaymentMethodsExperimentSubtitleInteractor$experimentSuspendableLazy$1(rqo rqoVar, b bVar, Continuation continuation) {
        super(1, continuation);
        this.$experimentProviderFactory = rqoVar;
        this.this$0 = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new TaxiPaymentMethodsExperimentSubtitleInteractor$experimentSuspendableLazy$1(this.$experimentProviderFactory, this.this$0, continuation);
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        return ((TaxiPaymentMethodsExperimentSubtitleInteractor$experimentSuspendableLazy$1) create((Continuation) obj)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        PaymentMethodsCustomSubtitlesExperiment.PaymentMethodsDescription paymentMethodsDescription;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            rqo rqoVar = this.$experimentProviderFactory;
            PaymentMethodsCustomSubtitlesExperiment.Companion.getClass();
            t1b0 e = ((jbh) rqoVar).e(PaymentMethodsCustomSubtitlesExperiment.f);
            this.label = 1;
            obj = e.b(this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        PaymentMethodsCustomSubtitlesExperiment paymentMethodsCustomSubtitlesExperiment = (PaymentMethodsCustomSubtitlesExperiment) obj;
        b bVar = this.this$0;
        bVar.getClass();
        List<PaymentMethodsCustomSubtitlesExperiment.PaymentMethodsDescription> list = paymentMethodsCustomSubtitlesExperiment.d;
        ArrayList arrayList = new ArrayList();
        for (PaymentMethodsCustomSubtitlesExperiment.PaymentMethodsDescription paymentMethodsDescription2 : list) {
            if (gia1.c(TariffOrderFlow.ORDER_FLOW_TAXI_KEY, paymentMethodsDescription2.getC())) {
                List d = paymentMethodsDescription2.getD();
                ArrayList arrayList2 = new ArrayList();
                for (Object obj2 : d) {
                    if (cvu0.t(((PaymentMethodsCustomSubtitlesExperiment.PaymentMethodsSubtitlesTariffDescription) obj2).getD(), bVar.a, true)) {
                        arrayList2.add(obj2);
                    }
                }
                paymentMethodsDescription = PaymentMethodsCustomSubtitlesExperiment.PaymentMethodsDescription.a(paymentMethodsDescription2, arrayList2);
            } else {
                paymentMethodsDescription = null;
            }
            if (paymentMethodsDescription != null) {
                arrayList.add(paymentMethodsDescription);
            }
        }
        return new PaymentMethodsCustomSubtitlesExperiment(paymentMethodsCustomSubtitlesExperiment.c, arrayList, paymentMethodsCustomSubtitlesExperiment.b);
    }
}
