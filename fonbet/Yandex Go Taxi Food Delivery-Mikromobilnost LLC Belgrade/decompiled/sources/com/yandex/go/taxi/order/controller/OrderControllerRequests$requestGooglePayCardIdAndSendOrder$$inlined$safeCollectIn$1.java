package com.yandex.go.taxi.order.controller;

import defpackage.a3y0;
import defpackage.epq0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tpr;
import defpackage.tse;
import defpackage.wls;
import defpackage.xur;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.o;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.order.controller.OrderControllerRequests$requestGooglePayCardIdAndSendOrder$$inlined$safeCollectIn$1", f = "OrderControllerRequests.kt", l = {HProv.PP_SIGNATUREOID}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
public final class OrderControllerRequests$requestGooglePayCardIdAndSendOrder$$inlined$safeCollectIn$1 extends SuspendLambda implements wls {
    final /* synthetic */ epq0 $callback$inlined;
    final /* synthetic */ epq0 $callback$inlined$1;
    final /* synthetic */ tpr $this_safeCollectIn;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ a this$0;

    @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "Lvpr;", "", "cause", "Lzy11;", "<anonymous>", "(Lvpr;Ljava/lang/Throwable;)V"}, k = 3, mv = {2, 4, 0})
    @mvg(c = "com.yandex.go.taxi.order.controller.OrderControllerRequests$requestGooglePayCardIdAndSendOrder$$inlined$safeCollectIn$1$1", f = "OrderControllerRequests.kt", l = {}, m = "invokeSuspend", v = 2)
    /* renamed from: com.yandex.go.taxi.order.controller.OrderControllerRequests$requestGooglePayCardIdAndSendOrder$$inlined$safeCollectIn$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends SuspendLambda implements zls {
        final /* synthetic */ epq0 $callback$inlined;
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ a this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Continuation continuation, a aVar, epq0 epq0Var) {
            super(3, continuation);
            this.this$0 = aVar;
            this.$callback$inlined = epq0Var;
        }

        @Override // defpackage.zls
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1((Continuation) obj3, this.this$0, this.$callback$inlined);
            anonymousClass1.L$0 = (Throwable) obj2;
            zy11 zy11Var = zy11.a;
            anonymousClass1.invokeSuspend(zy11Var);
            return zy11Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Throwable th = (Throwable) this.L$0;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            b.b(obj);
            a3y0.d(this.this$0.G, "requestGooglePayCardIdAndSendOrder", th, null, 4);
            this.$callback$inlined.Uc();
            return zy11.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OrderControllerRequests$requestGooglePayCardIdAndSendOrder$$inlined$safeCollectIn$1(tpr tprVar, Continuation continuation, a aVar, epq0 epq0Var, epq0 epq0Var2) {
        super(2, continuation);
        this.$this_safeCollectIn = tprVar;
        this.this$0 = aVar;
        this.$callback$inlined = epq0Var;
        this.$callback$inlined$1 = epq0Var2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new OrderControllerRequests$requestGooglePayCardIdAndSendOrder$$inlined$safeCollectIn$1(this.$this_safeCollectIn, continuation, this.this$0, this.$callback$inlined, this.$callback$inlined$1);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((OrderControllerRequests$requestGooglePayCardIdAndSendOrder$$inlined$safeCollectIn$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            o oVar = new o(this.$this_safeCollectIn, new AnonymousClass1(null, this.this$0, this.$callback$inlined$1));
            xur xurVar = new xur(22, this.this$0, this.$callback$inlined);
            this.L$0 = null;
            this.label = 1;
            if (oVar.collect(xurVar, this) == coroutineSingletons) {
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
