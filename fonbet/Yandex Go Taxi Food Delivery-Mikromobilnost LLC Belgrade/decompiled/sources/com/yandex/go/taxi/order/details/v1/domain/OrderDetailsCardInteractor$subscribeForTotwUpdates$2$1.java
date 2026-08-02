package com.yandex.go.taxi.order.details.v1.domain;

import com.yandex.go.taxi.order.models.api.TaxiOrder;
import defpackage.a2k;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.q8j;
import defpackage.tse;
import defpackage.vng;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.internal.g;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.order.details.v1.domain.OrderDetailsCardInteractor$subscribeForTotwUpdates$2$1", f = "OrderDetailsCardInteractor.kt", l = {192}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class OrderDetailsCardInteractor$subscribeForTotwUpdates$2$1 extends SuspendLambda implements wls {
    final /* synthetic */ q8j $interactor;
    Object L$0;
    int label;
    final /* synthetic */ a this$0;

    @Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
    /* renamed from: com.yandex.go.taxi.order.details.v1.domain.OrderDetailsCardInteractor$subscribeForTotwUpdates$2$1$2, reason: invalid class name */
    final /* synthetic */ class AnonymousClass2 extends FunctionReferenceImpl implements wls {
        @Override // defpackage.wls
        public final Object invoke(Object obj, Object obj2) {
            return ((q8j) this.receiver).a((TaxiOrder) obj, (Continuation) obj2);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OrderDetailsCardInteractor$subscribeForTotwUpdates$2$1(q8j q8jVar, a aVar, Continuation continuation) {
        super(2, continuation);
        this.$interactor = q8jVar;
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new OrderDetailsCardInteractor$subscribeForTotwUpdates$2$1(this.$interactor, this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((OrderDetailsCardInteractor$subscribeForTotwUpdates$2$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            boolean z = this.$interactor instanceof a2k;
            a aVar = this.this$0;
            g X = e.X(this.this$0.f.a(), new OrderDetailsCardInteractor$subscribeForTotwUpdates$2$1$invokeSuspend$$inlined$flatMapLatest$1(z ? vng.l(aVar.a.a(), new OrderDetailsCardInteractor$subscribeForTotwUpdates$2$1$orderFlow$1(1, this.$interactor, a2k.class, "takeDependencies", "takeDependencies(Lcom/yandex/go/taxi/order/models/api/TaxiOrder;)Ljava/lang/Object;", 0), vng.c) : aVar.a.a(), null));
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(2, this.$interactor, q8j.class, "onOrderUpdated", "onOrderUpdated(Lcom/yandex/go/taxi/order/models/api/TaxiOrder;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
            this.L$0 = null;
            this.label = 1;
            if (e.k(X, anonymousClass2, this) == coroutineSingletons) {
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
