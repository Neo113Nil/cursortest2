package com.yandex.go.payments.lpm.navigation;

import com.yandex.go.payments.lpm.domain.e;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tls;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.payments.lpm.navigation.LpmPaymentRouterImpl$onLaunch$1", f = "LpmPaymentRouterImpl.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class LpmPaymentRouterImpl$onLaunch$1 extends SuspendLambda implements wls {
    final /* synthetic */ e $paymentSourceInteractor;
    int label;
    final /* synthetic */ d this$0;

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lzy11;", "<anonymous>", "()V"}, k = 3, mv = {2, 4, 0})
    @mvg(c = "com.yandex.go.payments.lpm.navigation.LpmPaymentRouterImpl$onLaunch$1$1", f = "LpmPaymentRouterImpl.kt", l = {71}, m = "invokeSuspend", v = 2)
    /* renamed from: com.yandex.go.payments.lpm.navigation.LpmPaymentRouterImpl$onLaunch$1$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements tls {
        final /* synthetic */ e $paymentSourceInteractor;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(e eVar, Continuation continuation) {
            super(1, continuation);
            this.$paymentSourceInteractor = eVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Continuation continuation) {
            return new AnonymousClass1(this.$paymentSourceInteractor, continuation);
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
                e eVar = this.$paymentSourceInteractor;
                this.label = 1;
                if (eVar.h(true, this) == coroutineSingletons) {
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
    public LpmPaymentRouterImpl$onLaunch$1(d dVar, e eVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = dVar;
        this.$paymentSourceInteractor = eVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new LpmPaymentRouterImpl$onLaunch$1(this.this$0, this.$paymentSourceInteractor, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        LpmPaymentRouterImpl$onLaunch$1 lpmPaymentRouterImpl$onLaunch$1 = (LpmPaymentRouterImpl$onLaunch$1) create((tse) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        lpmPaymentRouterImpl$onLaunch$1.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        d dVar = this.this$0;
        com.yandex.go.payments.data.c cVar = dVar.F;
        String str = dVar.E;
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$paymentSourceInteractor, null);
        cVar.d = str;
        cVar.e = anonymousClass1;
        return zy11.a;
    }
}
