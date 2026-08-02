package com.yandex.go.taxi.order.promotions.interactor;

import defpackage.jqr;
import defpackage.mth;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tje;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.j0;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.order.promotions.interactor.OrderPromotionsUpdateInteractor$startMonitoring$1", f = "OrderPromotionsUpdateInteractor.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class OrderPromotionsUpdateInteractor$startMonitoring$1 extends SuspendLambda implements wls {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ h this$0;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
    @mvg(c = "com.yandex.go.taxi.order.promotions.interactor.OrderPromotionsUpdateInteractor$startMonitoring$1$1", f = "OrderPromotionsUpdateInteractor.kt", l = {60}, m = "invokeSuspend", v = 2)
    /* renamed from: com.yandex.go.taxi.order.promotions.interactor.OrderPromotionsUpdateInteractor$startMonitoring$1$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements wls {
        int label;
        final /* synthetic */ h this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(h hVar, Continuation continuation) {
            super(2, continuation);
            this.this$0 = hVar;
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
                kotlin.b.b(obj);
                h hVar = this.this$0;
                this.label = 1;
                if (kotlinx.coroutines.flow.e.k(kotlinx.coroutines.flow.e.X(((com.yandex.go.taxi.order.provider.a) hVar.e).a(), new OrderPromotionsUpdateInteractor$collectPromotions$$inlined$flatMapLatest$1(3, null)), new OrderPromotionsUpdateInteractor$collectPromotions$3(hVar, null), this) == coroutineSingletons) {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
    @mvg(c = "com.yandex.go.taxi.order.promotions.interactor.OrderPromotionsUpdateInteractor$startMonitoring$1$2", f = "OrderPromotionsUpdateInteractor.kt", l = {61}, m = "invokeSuspend", v = 2)
    /* renamed from: com.yandex.go.taxi.order.promotions.interactor.OrderPromotionsUpdateInteractor$startMonitoring$1$2, reason: invalid class name */
    final class AnonymousClass2 extends SuspendLambda implements wls {
        int label;
        final /* synthetic */ h this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(h hVar, Continuation continuation) {
            super(2, continuation);
            this.this$0 = hVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new AnonymousClass2(this.this$0, continuation);
        }

        @Override // defpackage.wls
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                kotlin.b.b(obj);
                h hVar = this.this$0;
                this.label = 1;
                if (kotlinx.coroutines.flow.e.k(new g(new jqr(kotlinx.coroutines.flow.e.X(kotlinx.coroutines.flow.e.p(kotlinx.coroutines.flow.e.d(hVar.a.a), 300L), new OrderPromotionsUpdateInteractor$updatePopupPromotion$$inlined$flatMapLatest$1(hVar, null)), new OrderPromotionsUpdateInteractor$updatePopupPromotion$3(hVar, null), 3)), new OrderPromotionsUpdateInteractor$updatePopupPromotion$5(hVar, null), this) == coroutineSingletons) {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
    @mvg(c = "com.yandex.go.taxi.order.promotions.interactor.OrderPromotionsUpdateInteractor$startMonitoring$1$3", f = "OrderPromotionsUpdateInteractor.kt", l = {62}, m = "invokeSuspend", v = 2)
    /* renamed from: com.yandex.go.taxi.order.promotions.interactor.OrderPromotionsUpdateInteractor$startMonitoring$1$3, reason: invalid class name */
    final class AnonymousClass3 extends SuspendLambda implements wls {
        int label;
        final /* synthetic */ h this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(h hVar, Continuation continuation) {
            super(2, continuation);
            this.this$0 = hVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new AnonymousClass3(this.this$0, continuation);
        }

        @Override // defpackage.wls
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass3) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                kotlin.b.b(obj);
                h hVar = this.this$0;
                this.label = 1;
                if (kotlinx.coroutines.flow.e.k(new mth(new j0(null, kotlinx.coroutines.flow.e.t(kotlinx.coroutines.flow.e.d(hVar.c.b)), new OrderPromotionsUpdateInteractor$hidePopupPromotionIfNeed$$inlined$withPreviousEmit$1(3, null)), 6), new OrderPromotionsUpdateInteractor$hidePopupPromotionIfNeed$2(hVar, null), this) == coroutineSingletons) {
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
    public OrderPromotionsUpdateInteractor$startMonitoring$1(h hVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = hVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        OrderPromotionsUpdateInteractor$startMonitoring$1 orderPromotionsUpdateInteractor$startMonitoring$1 = new OrderPromotionsUpdateInteractor$startMonitoring$1(this.this$0, continuation);
        orderPromotionsUpdateInteractor$startMonitoring$1.L$0 = obj;
        return orderPromotionsUpdateInteractor$startMonitoring$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        OrderPromotionsUpdateInteractor$startMonitoring$1 orderPromotionsUpdateInteractor$startMonitoring$1 = (OrderPromotionsUpdateInteractor$startMonitoring$1) create((tse) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        orderPromotionsUpdateInteractor$startMonitoring$1.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        tse tseVar = (tse) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        tje.N(tseVar, null, null, new AnonymousClass1(this.this$0, null), 3);
        tje.N(tseVar, null, null, new AnonymousClass2(this.this$0, null), 3);
        tje.N(tseVar, null, null, new AnonymousClass3(this.this$0, null), 3);
        return zy11.a;
    }
}
