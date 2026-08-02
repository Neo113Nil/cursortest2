package com.yandex.go.payments.paymentlist.navigation;

import defpackage.ahs;
import defpackage.bhs;
import defpackage.chs;
import defpackage.dhs;
import defpackage.ehs;
import defpackage.evz;
import defpackage.fhs;
import defpackage.ghs;
import defpackage.lea0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tls;
import defpackage.w511;
import defpackage.wxc;
import defpackage.zgs;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lzy11;", "<anonymous>", "()V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.payments.paymentlist.navigation.PaymentMethodsListRouter$DeletePaymentAlertExitListenerImpl$deletePayment$1", f = "PaymentMethodsListRouter.kt", l = {739, 745}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class PaymentMethodsListRouter$DeletePaymentAlertExitListenerImpl$deletePayment$1 extends SuspendLambda implements tls {
    int label;
    final /* synthetic */ a this$0;
    final /* synthetic */ f this$1;

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lzy11;", "<anonymous>", "()V"}, k = 3, mv = {2, 4, 0})
    @mvg(c = "com.yandex.go.payments.paymentlist.navigation.PaymentMethodsListRouter$DeletePaymentAlertExitListenerImpl$deletePayment$1$1", f = "PaymentMethodsListRouter.kt", l = {740}, m = "invokeSuspend", v = 2)
    /* renamed from: com.yandex.go.payments.paymentlist.navigation.PaymentMethodsListRouter$DeletePaymentAlertExitListenerImpl$deletePayment$1$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements tls {
        int label;
        final /* synthetic */ f this$0;
        final /* synthetic */ a this$1;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(a aVar, f fVar, Continuation continuation) {
            super(1, continuation);
            this.this$0 = fVar;
            this.this$1 = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Continuation continuation) {
            return new AnonymousClass1(this.this$1, this.this$0, continuation);
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
                lea0 lea0Var = this.this$1.a.a;
                this.label = 1;
                if (f.T(fVar, lea0Var, this) == coroutineSingletons) {
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

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lzy11;", "<anonymous>", "()V"}, k = 3, mv = {2, 4, 0})
    @mvg(c = "com.yandex.go.payments.paymentlist.navigation.PaymentMethodsListRouter$DeletePaymentAlertExitListenerImpl$deletePayment$1$2", f = "PaymentMethodsListRouter.kt", l = {746}, m = "invokeSuspend", v = 2)
    /* renamed from: com.yandex.go.payments.paymentlist.navigation.PaymentMethodsListRouter$DeletePaymentAlertExitListenerImpl$deletePayment$1$2, reason: invalid class name */
    final class AnonymousClass2 extends SuspendLambda implements tls {
        int label;
        final /* synthetic */ f this$0;
        final /* synthetic */ a this$1;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(a aVar, f fVar, Continuation continuation) {
            super(1, continuation);
            this.this$0 = fVar;
            this.this$1 = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Continuation continuation) {
            return new AnonymousClass2(this.this$1, this.this$0, continuation);
        }

        @Override // defpackage.tls
        public final Object invoke(Object obj) {
            return ((AnonymousClass2) create((Continuation) obj)).invokeSuspend(zy11.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                kotlin.b.b(obj);
                f fVar = this.this$0;
                wxc wxcVar = ((zgs) this.this$1.a).c;
                this.label = 1;
                if (f.T(fVar, wxcVar, this) == coroutineSingletons) {
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
    public PaymentMethodsListRouter$DeletePaymentAlertExitListenerImpl$deletePayment$1(a aVar, f fVar, Continuation continuation) {
        super(1, continuation);
        this.this$0 = aVar;
        this.this$1 = fVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new PaymentMethodsListRouter$DeletePaymentAlertExitListenerImpl$deletePayment$1(this.this$0, this.this$1, continuation);
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        return ((PaymentMethodsListRouter$DeletePaymentAlertExitListenerImpl$deletePayment$1) create((Continuation) obj)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x005b, code lost:
    
        if (r9.c(r4, r5, r8) == r0) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0083, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0081, code lost:
    
        if (r9.a(r5, r3, r6, r8) == r0) goto L31;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            ghs ghsVar = this.this$0.a;
            if ((ghsVar instanceof ahs) || (ghsVar instanceof bhs) || (ghsVar instanceof dhs) || (ghsVar instanceof fhs) || (ghsVar instanceof chs) || (ghsVar instanceof ehs)) {
                com.yandex.go.payments.paymentlist.domain.c cVar = (com.yandex.go.payments.paymentlist.domain.c) this.this$1.P.get();
                a aVar = this.this$0;
                ghs ghsVar2 = aVar.a;
                lea0 lea0Var = ghsVar2.a;
                String str = ghsVar2.b;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(aVar, this.this$1, null);
                this.label = 1;
            } else {
                if (!(ghsVar instanceof zgs)) {
                    w511.b();
                    return null;
                }
                com.yandex.go.payments.paymentlist.domain.c cVar2 = (com.yandex.go.payments.paymentlist.domain.c) this.this$1.P.get();
                a aVar2 = this.this$0;
                evz evzVar = ((zgs) aVar2.a).d;
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(aVar2, this.this$1, null);
                this.label = 2;
            }
        } else {
            if (i != 1 && i != 2) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        return zy11.a;
    }
}
