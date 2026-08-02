package com.yandex.fintechsdk.flows.payment.kit.internal.activity;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.b0;
import defpackage.f5g;
import defpackage.gci0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.o2a0;
import defpackage.r2a0;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.yandex.fintechsdk.flows.payment.kit.internal.activity.PaymentKitActivityDelegate$setupConfigObserver$1", f = "PaymentKitActivityDelegate.kt", l = {319}, m = "invokeSuspend")
/* loaded from: classes12.dex */
final class PaymentKitActivityDelegate$setupConfigObserver$1 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ r2a0 this$0;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 1, 0})
    @mvg(c = "com.yandex.fintechsdk.flows.payment.kit.internal.activity.PaymentKitActivityDelegate$setupConfigObserver$1$1", f = "PaymentKitActivityDelegate.kt", l = {320}, m = "invokeSuspend")
    /* renamed from: com.yandex.fintechsdk.flows.payment.kit.internal.activity.PaymentKitActivityDelegate$setupConfigObserver$1$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements wls {
        int label;
        final /* synthetic */ r2a0 this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(r2a0 r2a0Var, Continuation continuation) {
            super(2, continuation);
            this.this$0 = r2a0Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new AnonymousClass1(this.this$0, continuation);
        }

        @Override // defpackage.wls
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                b.b(obj);
                gci0 gci0Var = ((com.yandex.fintechsdk.data.config.impl.internal.a) ((f5g) this.this$0.a()).t0.get()).b.d;
                o2a0 o2a0Var = new o2a0(this.this$0, 0);
                this.label = 1;
                if (gci0Var.a.collect(o2a0Var, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                b.b(obj);
            }
            return zy11.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaymentKitActivityDelegate$setupConfigObserver$1(r2a0 r2a0Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = r2a0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new PaymentKitActivityDelegate$setupConfigObserver$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((PaymentKitActivityDelegate$setupConfigObserver$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            r2a0 r2a0Var = this.this$0;
            PaymentKitActivity paymentKitActivity = r2a0Var.a;
            Lifecycle.State state = Lifecycle.State.STARTED;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(r2a0Var, null);
            this.label = 1;
            if (b0.a(paymentKitActivity, state, anonymousClass1, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            b.b(obj);
        }
        return zy11.a;
    }
}
