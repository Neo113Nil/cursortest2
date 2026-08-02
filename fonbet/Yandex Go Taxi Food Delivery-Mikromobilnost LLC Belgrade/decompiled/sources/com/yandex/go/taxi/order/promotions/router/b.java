package com.yandex.go.taxi.order.promotions.router;

import defpackage.a4y0;
import defpackage.f4y0;
import defpackage.g480;
import defpackage.gvk0;
import defpackage.jl40;
import defpackage.k580;
import defpackage.m950;
import defpackage.ny61;
import defpackage.o2y0;
import defpackage.qvk0;
import defpackage.usc;
import defpackage.vpr;
import defpackage.zy11;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import ru.yandex.taxi.communications.modal.analytics.CommunicationModalAnalyticsData$ModalType;
import ru.yandex.taxi.communications.modal.analytics.CommunicationModalAnalyticsData$RideOpenReason;

/* loaded from: classes14.dex */
public final class b implements vpr {
    public final /* synthetic */ c a;
    public final /* synthetic */ f4y0 b;
    public final /* synthetic */ a4y0 c;

    public b(c cVar, f4y0 f4y0Var, a4y0 a4y0Var) {
        this.a = cVar;
        this.b = f4y0Var;
        this.c = a4y0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    @Override // defpackage.vpr
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(List list, Continuation continuation) {
        OrderRideAutoPromotionRouter$handlePromotionRobotaxi$2$emit$1 orderRideAutoPromotionRouter$handlePromotionRobotaxi$2$emit$1;
        int i;
        Object obj;
        o2y0 o2y0Var;
        if (continuation instanceof OrderRideAutoPromotionRouter$handlePromotionRobotaxi$2$emit$1) {
            orderRideAutoPromotionRouter$handlePromotionRobotaxi$2$emit$1 = (OrderRideAutoPromotionRouter$handlePromotionRobotaxi$2$emit$1) continuation;
            int i2 = orderRideAutoPromotionRouter$handlePromotionRobotaxi$2$emit$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                orderRideAutoPromotionRouter$handlePromotionRobotaxi$2$emit$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = orderRideAutoPromotionRouter$handlePromotionRobotaxi$2$emit$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = orderRideAutoPromotionRouter$handlePromotionRobotaxi$2$emit$1.label;
                zy11 zy11Var = zy11.a;
                a4y0 a4y0Var = this.c;
                c cVar = this.a;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    Iterator it = list.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            obj = null;
                            break;
                        }
                        obj = it.next();
                        if (jl40.l(((o2y0) obj).b().a, a4y0Var.a)) {
                            break;
                        }
                    }
                    o2y0 o2y0Var2 = (o2y0) obj;
                    if (o2y0Var2 == null) {
                        cVar.R();
                        return zy11Var;
                    }
                    com.yandex.go.taxi.order.popup.b bVar = cVar.K;
                    g480 g480Var = this.b.e;
                    orderRideAutoPromotionRouter$handlePromotionRobotaxi$2$emit$1.L$0 = null;
                    orderRideAutoPromotionRouter$handlePromotionRobotaxi$2$emit$1.L$1 = o2y0Var2;
                    orderRideAutoPromotionRouter$handlePromotionRobotaxi$2$emit$1.label = 1;
                    obj2 = bVar.e(g480Var, orderRideAutoPromotionRouter$handlePromotionRobotaxi$2$emit$1);
                    if (obj2 == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    o2y0Var = o2y0Var2;
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    o2y0Var = (o2y0) orderRideAutoPromotionRouter$handlePromotionRobotaxi$2$emit$1.L$1;
                    kotlin.b.b(obj2);
                }
                qvk0 qvk0Var = (qvk0) obj2;
                cVar.A((m950) cVar.G.get(), new gvk0(qvk0Var, o2y0Var, new usc(qvk0Var.a, CommunicationModalAnalyticsData$ModalType.ROBOTAXI, a4y0Var.a, CommunicationModalAnalyticsData$RideOpenReason.AUTOMATIC)), new k580(cVar, 1));
                return zy11Var;
            }
        }
        orderRideAutoPromotionRouter$handlePromotionRobotaxi$2$emit$1 = new OrderRideAutoPromotionRouter$handlePromotionRobotaxi$2$emit$1(this, continuation);
        Object obj22 = orderRideAutoPromotionRouter$handlePromotionRobotaxi$2$emit$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = orderRideAutoPromotionRouter$handlePromotionRobotaxi$2$emit$1.label;
        zy11 zy11Var2 = zy11.a;
        a4y0 a4y0Var2 = this.c;
        c cVar2 = this.a;
        if (i != 0) {
        }
        qvk0 qvk0Var2 = (qvk0) obj22;
        cVar2.A((m950) cVar2.G.get(), new gvk0(qvk0Var2, o2y0Var, new usc(qvk0Var2.a, CommunicationModalAnalyticsData$ModalType.ROBOTAXI, a4y0Var2.a, CommunicationModalAnalyticsData$RideOpenReason.AUTOMATIC)), new k580(cVar2, 1));
        return zy11Var2;
    }
}
