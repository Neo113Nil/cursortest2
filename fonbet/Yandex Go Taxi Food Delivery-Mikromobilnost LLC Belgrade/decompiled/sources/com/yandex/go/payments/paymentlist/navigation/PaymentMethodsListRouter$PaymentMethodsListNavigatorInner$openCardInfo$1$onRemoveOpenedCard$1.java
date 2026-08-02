package com.yandex.go.payments.paymentlist.navigation;

import defpackage.fl8;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lzy11;", "<anonymous>", "()V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.payments.paymentlist.navigation.PaymentMethodsListRouter$PaymentMethodsListNavigatorInner$openCardInfo$1$onRemoveOpenedCard$1", f = "PaymentMethodsListRouter.kt", l = {639}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class PaymentMethodsListRouter$PaymentMethodsListNavigatorInner$openCardInfo$1$onRemoveOpenedCard$1 extends SuspendLambda implements tls {
    final /* synthetic */ fl8 $card;
    int label;
    final /* synthetic */ f this$0;
    final /* synthetic */ e this$1;

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lzy11;", "<anonymous>", "()V"}, k = 3, mv = {2, 4, 0})
    @mvg(c = "com.yandex.go.payments.paymentlist.navigation.PaymentMethodsListRouter$PaymentMethodsListNavigatorInner$openCardInfo$1$onRemoveOpenedCard$1$1", f = "PaymentMethodsListRouter.kt", l = {640}, m = "invokeSuspend", v = 2)
    /* renamed from: com.yandex.go.payments.paymentlist.navigation.PaymentMethodsListRouter$PaymentMethodsListNavigatorInner$openCardInfo$1$onRemoveOpenedCard$1$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements tls {
        final /* synthetic */ fl8 $card;
        int label;
        final /* synthetic */ f this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(f fVar, fl8 fl8Var, Continuation continuation) {
            super(1, continuation);
            this.this$0 = fVar;
            this.$card = fl8Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Continuation continuation) {
            return new AnonymousClass1(this.this$0, this.$card, continuation);
        }

        @Override // defpackage.tls
        public final Object invoke(Object obj) {
            return ((AnonymousClass1) create((Continuation) obj)).invokeSuspend(zy11.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                kotlin.b.b(obj);
                f fVar = this.this$0;
                fl8 fl8Var = this.$card;
                this.label = 1;
                if (f.T(fVar, fl8Var, this) == coroutineSingletons) {
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaymentMethodsListRouter$PaymentMethodsListNavigatorInner$openCardInfo$1$onRemoveOpenedCard$1(f fVar, fl8 fl8Var, e eVar, Continuation continuation) {
        super(1, continuation);
        this.this$0 = fVar;
        this.$card = fl8Var;
        this.this$1 = eVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new PaymentMethodsListRouter$PaymentMethodsListNavigatorInner$openCardInfo$1$onRemoveOpenedCard$1(this.this$0, this.$card, this.this$1, continuation);
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        return ((PaymentMethodsListRouter$PaymentMethodsListNavigatorInner$openCardInfo$1$onRemoveOpenedCard$1) create((Continuation) obj)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            com.yandex.go.payments.paymentlist.domain.c cVar = (com.yandex.go.payments.paymentlist.domain.c) this.this$0.P.get();
            fl8 fl8Var = this.$card;
            String openReason = this.this$1.a.a.getOpenReason();
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$card, null);
            this.label = 1;
            if (cVar.b(fl8Var, openReason, anonymousClass1, this) == coroutineSingletons) {
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
