package com.yandex.go.payments.paymentlist.experiments;

import com.yandex.go.payments.data.model.response.PaymentMethods;
import defpackage.dms;
import defpackage.ha2;
import defpackage.mvg;
import defpackage.nm;
import defpackage.ny61;
import defpackage.tse;
import defpackage.vda0;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.payments.paymentlist.experiments.ForcedPaymentMethodChangeInteractor$onLargestContentfulPaint$1", f = "ForcedPaymentMethodChangeInteractor.kt", l = {52}, m = "invokeSuspend", v = 2)
/* loaded from: classes8.dex */
final class ForcedPaymentMethodChangeInteractor$onLargestContentfulPaint$1 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ g this$0;

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lvda0;", "it", "Lcom/yandex/go/payments/data/model/response/PaymentMethods;", "<anonymous>", "(Lvda0;)Lcom/yandex/go/payments/data/model/response/PaymentMethods;"}, k = 3, mv = {2, 4, 0})
    @mvg(c = "com.yandex.go.payments.paymentlist.experiments.ForcedPaymentMethodChangeInteractor$onLargestContentfulPaint$1$2", f = "ForcedPaymentMethodChangeInteractor.kt", l = {}, m = "invokeSuspend", v = 2)
    /* renamed from: com.yandex.go.payments.paymentlist.experiments.ForcedPaymentMethodChangeInteractor$onLargestContentfulPaint$1$2, reason: invalid class name */
    final class AnonymousClass2 extends SuspendLambda implements wls {
        /* synthetic */ Object L$0;
        int label;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(2, continuation);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        @Override // defpackage.wls
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass2) create((vda0) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            vda0 vda0Var = (vda0) this.L$0;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label == 0) {
                kotlin.b.b(obj);
                return vda0Var.a;
            }
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0004\b\b\u0010\t"}, d2 = {"Lcom/yandex/go/payments/paymentlist/experiments/ForcedPaymentMethodChangeExperiment;", "experiment", "Lcom/yandex/go/payments/data/model/response/PaymentMethods;", "paymentMethods", "Lcom/yandex/go/navigation/screen/api/Screen;", "<unused var>", "Lwl40;", "Lkotlin/Pair;", "<anonymous>", "(Lcom/yandex/go/payments/paymentlist/experiments/ForcedPaymentMethodChangeExperiment;Lcom/yandex/go/payments/data/model/response/PaymentMethods;Lcom/yandex/go/navigation/screen/api/Screen;Lwl40;)Lkotlin/Pair;"}, k = 3, mv = {2, 4, 0})
    @mvg(c = "com.yandex.go.payments.paymentlist.experiments.ForcedPaymentMethodChangeInteractor$onLargestContentfulPaint$1$4", f = "ForcedPaymentMethodChangeInteractor.kt", l = {}, m = "invokeSuspend", v = 2)
    /* renamed from: com.yandex.go.payments.paymentlist.experiments.ForcedPaymentMethodChangeInteractor$onLargestContentfulPaint$1$4, reason: invalid class name */
    /* loaded from: classes13.dex */
    final class AnonymousClass4 extends SuspendLambda implements dms {
        /* synthetic */ Object L$0;
        /* synthetic */ Object L$1;
        int label;

        @Override // defpackage.dms
        public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
            AnonymousClass4 anonymousClass4 = new AnonymousClass4(5, (Continuation) obj5);
            anonymousClass4.L$0 = (ForcedPaymentMethodChangeExperiment) obj;
            anonymousClass4.L$1 = (PaymentMethods) obj2;
            return anonymousClass4.invokeSuspend(zy11.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            ForcedPaymentMethodChangeExperiment forcedPaymentMethodChangeExperiment = (ForcedPaymentMethodChangeExperiment) this.L$0;
            PaymentMethods paymentMethods = (PaymentMethods) this.L$1;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label == 0) {
                kotlin.b.b(obj);
                return new Pair(forcedPaymentMethodChangeExperiment, paymentMethods);
            }
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ForcedPaymentMethodChangeInteractor$onLargestContentfulPaint$1(g gVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = gVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ForcedPaymentMethodChangeInteractor$onLargestContentfulPaint$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ForcedPaymentMethodChangeInteractor$onLargestContentfulPaint$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            ha2 m = kotlinx.coroutines.flow.e.m(new d(this.this$0.d.b.a()), new f(kotlinx.coroutines.flow.e.I(this.this$0.f.z(), new AnonymousClass2(2, null))), this.this$0.c.c(), this.this$0.e.h(), new AnonymousClass4(5, null));
            nm nmVar = new nm(20, this.this$0);
            this.label = 1;
            if (m.collect(nmVar, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        return zy11.a;
    }
}
