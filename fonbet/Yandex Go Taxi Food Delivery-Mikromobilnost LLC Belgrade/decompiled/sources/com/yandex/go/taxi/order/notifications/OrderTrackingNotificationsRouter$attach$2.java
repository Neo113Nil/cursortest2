package com.yandex.go.taxi.order.notifications;

import com.yandex.go.taxi.order.domain.repositories.e0;
import defpackage.gci0;
import defpackage.mth;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tje;
import defpackage.tse;
import defpackage.ur70;
import defpackage.vng;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.k;
import kotlinx.coroutines.flow.m0;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Ll8x;", "<anonymous>", "(Ltse;)Ll8x;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.order.notifications.OrderTrackingNotificationsRouter$attach$2", f = "OrderTrackingNotificationsRouter.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class OrderTrackingNotificationsRouter$attach$2 extends SuspendLambda implements wls {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ a this$0;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
    @mvg(c = "com.yandex.go.taxi.order.notifications.OrderTrackingNotificationsRouter$attach$2$1", f = "OrderTrackingNotificationsRouter.kt", l = {26}, m = "invokeSuspend", v = 2)
    /* renamed from: com.yandex.go.taxi.order.notifications.OrderTrackingNotificationsRouter$attach$2$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements wls {
        int label;
        final /* synthetic */ a this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(a aVar, Continuation continuation) {
            super(2, continuation);
            this.this$0 = aVar;
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
                a aVar = this.this$0;
                this.label = 1;
                if (e.k(new k(new m0(vng.l(e.X(new mth(((e0) aVar.a).g, 6), new OrderTrackingNotificationsRouter$getOrderFlow$$inlined$flatMapLatest$1(3, null)), new ur70(17), vng.c), aVar.c.e, OrderTrackingNotificationsRouter$subscribeMulticlassNotificationUpdates$3.a), new OrderTrackingNotificationsRouter$subscribeMulticlassNotificationUpdates$4(aVar, null)), new OrderTrackingNotificationsRouter$subscribeMulticlassNotificationUpdates$5(aVar, null), this) == coroutineSingletons) {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
    @mvg(c = "com.yandex.go.taxi.order.notifications.OrderTrackingNotificationsRouter$attach$2$2", f = "OrderTrackingNotificationsRouter.kt", l = {27}, m = "invokeSuspend", v = 2)
    /* renamed from: com.yandex.go.taxi.order.notifications.OrderTrackingNotificationsRouter$attach$2$2, reason: invalid class name */
    final class AnonymousClass2 extends SuspendLambda implements wls {
        int label;
        final /* synthetic */ a this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(a aVar, Continuation continuation) {
            super(2, continuation);
            this.this$0 = aVar;
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
                b.b(obj);
                a aVar = this.this$0;
                this.label = 1;
                if (e.k(new k(new m0(vng.l(e.X(new mth(((e0) aVar.a).g, 6), new OrderTrackingNotificationsRouter$getOrderFlow$$inlined$flatMapLatest$1(3, null)), new ur70(16), vng.c), (gci0) aVar.b.A, OrderTrackingNotificationsRouter$subscribeCashbackNotificationUpdates$3.a), new OrderTrackingNotificationsRouter$subscribeCashbackNotificationUpdates$4(aVar, null)), new OrderTrackingNotificationsRouter$subscribeCashbackNotificationUpdates$5(aVar, null), this) == coroutineSingletons) {
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
    public OrderTrackingNotificationsRouter$attach$2(a aVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        OrderTrackingNotificationsRouter$attach$2 orderTrackingNotificationsRouter$attach$2 = new OrderTrackingNotificationsRouter$attach$2(this.this$0, continuation);
        orderTrackingNotificationsRouter$attach$2.L$0 = obj;
        return orderTrackingNotificationsRouter$attach$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((OrderTrackingNotificationsRouter$attach$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        tse tseVar = (tse) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        b.b(obj);
        tje.N(tseVar, null, null, new AnonymousClass1(this.this$0, null), 3);
        return tje.N(tseVar, null, null, new AnonymousClass2(this.this$0, null), 3);
    }
}
