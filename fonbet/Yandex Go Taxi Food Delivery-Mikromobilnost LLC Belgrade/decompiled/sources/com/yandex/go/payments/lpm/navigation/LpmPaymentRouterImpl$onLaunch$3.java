package com.yandex.go.payments.lpm.navigation;

import com.yandex.go.payments.lpm.domain.e;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.payments.lpm.navigation.LpmPaymentRouterImpl$onLaunch$3", f = "LpmPaymentRouterImpl.kt", l = {80}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class LpmPaymentRouterImpl$onLaunch$3 extends SuspendLambda implements wls {
    final /* synthetic */ e $paymentSourceInteractor;
    int label;
    final /* synthetic */ d this$0;

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lzy11;", "<anonymous>", "(Ljava/lang/String;)V"}, k = 3, mv = {2, 4, 0})
    @mvg(c = "com.yandex.go.payments.lpm.navigation.LpmPaymentRouterImpl$onLaunch$3$2", f = "LpmPaymentRouterImpl.kt", l = {80}, m = "invokeSuspend", v = 2)
    /* renamed from: com.yandex.go.payments.lpm.navigation.LpmPaymentRouterImpl$onLaunch$3$2, reason: invalid class name */
    final class AnonymousClass2 extends SuspendLambda implements wls {
        final /* synthetic */ e $paymentSourceInteractor;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(e eVar, Continuation continuation) {
            super(2, continuation);
            this.$paymentSourceInteractor = eVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new AnonymousClass2(this.$paymentSourceInteractor, continuation);
        }

        @Override // defpackage.wls
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass2) create((String) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
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
    public LpmPaymentRouterImpl$onLaunch$3(d dVar, e eVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = dVar;
        this.$paymentSourceInteractor = eVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new LpmPaymentRouterImpl$onLaunch$3(this.this$0, this.$paymentSourceInteractor, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((LpmPaymentRouterImpl$onLaunch$3) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            d dVar = this.this$0;
            c cVar = new c(dVar.F.a, dVar);
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$paymentSourceInteractor, null);
            this.label = 1;
            if (kotlinx.coroutines.flow.e.k(cVar, anonymousClass2, this) == coroutineSingletons) {
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
