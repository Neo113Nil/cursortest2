package com.yandex.go.shortcuts.impl.repository;

import com.yandex.go.shortcuts.impl.notifications.TaxiOnTheWayStateNotification;
import com.yandex.go.taxi.order.models.api.objects.Driver;
import defpackage.alb1;
import defpackage.b980;
import defpackage.evu0;
import defpackage.hbp0;
import defpackage.hjz0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.o2y0;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.shortcuts.impl.repository.FeedOrderStatusNotificationRepositoryImpl$showTaxiOnTheWayNotification$2", f = "FeedOrderStatusNotificationRepositoryImpl.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class FeedOrderStatusNotificationRepositoryImpl$showTaxiOnTheWayNotification$2 extends SuspendLambda implements wls {
    final /* synthetic */ o2y0 $orderHolder;
    int label;
    final /* synthetic */ i this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FeedOrderStatusNotificationRepositoryImpl$showTaxiOnTheWayNotification$2(i iVar, o2y0 o2y0Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = iVar;
        this.$orderHolder = o2y0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new FeedOrderStatusNotificationRepositoryImpl$showTaxiOnTheWayNotification$2(this.this$0, this.$orderHolder, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        FeedOrderStatusNotificationRepositoryImpl$showTaxiOnTheWayNotification$2 feedOrderStatusNotificationRepositoryImpl$showTaxiOnTheWayNotification$2 = (FeedOrderStatusNotificationRepositoryImpl$showTaxiOnTheWayNotification$2) create((tse) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        feedOrderStatusNotificationRepositoryImpl$showTaxiOnTheWayNotification$2.invokeSuspend(zy11Var);
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
        final i iVar = this.this$0;
        com.yandex.go.taxi.order.titles.f fVar = iVar.i;
        final o2y0 o2y0Var = this.$orderHolder;
        fVar.c(o2y0Var, true, true, false, new hjz0() { // from class: com.yandex.go.shortcuts.impl.repository.a
            @Override // defpackage.hjz0
            public final void a(b980 b980Var) {
                if (evu0.J(b980Var.a)) {
                    return;
                }
                o2y0 o2y0Var2 = o2y0.this;
                Driver driver = o2y0Var2.b().V().g;
                String c = alb1.c(driver.c, driver.b, driver.d);
                i iVar2 = iVar;
                TaxiOnTheWayStateNotification taxiOnTheWayStateNotification = new TaxiOnTheWayStateNotification(iVar2.b, o2y0Var2.b().a, b980Var.a, c, o2y0Var2.c(), null, null, null, 0, 480, null);
                hbp0.e(iVar2.j, null, null, new FeedOrderStatusNotificationRepositoryImpl$showTaxiOnTheWayNotification$2$1$1(iVar2, taxiOnTheWayStateNotification.getNotificationId(), taxiOnTheWayStateNotification, null), 3);
            }
        });
        return zy11.a;
    }
}
