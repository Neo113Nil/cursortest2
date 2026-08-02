package com.yandex.go.payments.paymentlist.domain.subtitles.replacement;

import com.yandex.go.payments.paymentlist.experiments.PaymentMethodsCustomSubtitlesExperiment;
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

@Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", "Lcom/yandex/go/payments/paymentlist/experiments/PaymentMethodsCustomSubtitlesExperiment;"}, k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "com.yandex.go.payments.paymentlist.domain.subtitles.replacement.LpmPaymentMethodsExperimentSubtitleInteractor$experimentSuspendableLazy$1", f = "LpmPaymentMethodsExperimentSubtitleInteractor.kt", l = {21}, m = "invokeSuspend", v = 2)
/* loaded from: classes8.dex */
final class LpmPaymentMethodsExperimentSubtitleInteractor$experimentSuspendableLazy$1 extends SuspendLambda implements tls {
    final /* synthetic */ rqo $experimentProviderFactory;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LpmPaymentMethodsExperimentSubtitleInteractor$experimentSuspendableLazy$1(rqo rqoVar, a aVar, Continuation continuation) {
        super(1, continuation);
        this.$experimentProviderFactory = rqoVar;
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new LpmPaymentMethodsExperimentSubtitleInteractor$experimentSuspendableLazy$1(this.$experimentProviderFactory, this.this$0, continuation);
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        return ((LpmPaymentMethodsExperimentSubtitleInteractor$experimentSuspendableLazy$1) create((Continuation) obj)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
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
        a aVar = this.this$0;
        aVar.getClass();
        List list = paymentMethodsCustomSubtitlesExperiment.d;
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : list) {
            if (gia1.c(aVar.a, ((PaymentMethodsCustomSubtitlesExperiment.PaymentMethodsDescription) obj2).getC())) {
                arrayList.add(obj2);
            }
        }
        return new PaymentMethodsCustomSubtitlesExperiment(paymentMethodsCustomSubtitlesExperiment.c, arrayList, paymentMethodsCustomSubtitlesExperiment.b);
    }
}
