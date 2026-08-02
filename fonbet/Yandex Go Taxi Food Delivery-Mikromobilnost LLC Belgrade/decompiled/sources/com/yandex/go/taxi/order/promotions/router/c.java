package com.yandex.go.taxi.order.promotions.router;

import defpackage.a4y0;
import defpackage.d4y0;
import defpackage.e4y0;
import defpackage.f480;
import defpackage.h55;
import defpackage.k580;
import defpackage.m480;
import defpackage.m950;
import defpackage.n20;
import defpackage.n8e0;
import defpackage.ny61;
import defpackage.qu;
import defpackage.s2y0;
import defpackage.sjh;
import defpackage.tje;
import defpackage.tt2;
import defpackage.u2y0;
import defpackage.usc;
import defpackage.uyj;
import defpackage.wc80;
import defpackage.y10;
import defpackage.ye;
import defpackage.yvf0;
import defpackage.zy11;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.internal.g;
import ru.yandex.taxi.communications.modal.analytics.CommunicationModalAnalyticsData$ModalType;
import ru.yandex.taxi.communications.modal.analytics.CommunicationModalAnalyticsData$RideOpenReason;

/* loaded from: classes14.dex */
public final class c extends h55 {
    public final y10 D;
    public final yvf0 E;
    public final yvf0 F;
    public final yvf0 G;
    public final u2y0 H;
    public final wc80 I;
    public final n20 J;
    public final com.yandex.go.taxi.order.popup.b K;
    public final tt2 L;

    public c(y10 y10Var, yvf0 yvf0Var, yvf0 yvf0Var2, yvf0 yvf0Var3, u2y0 u2y0Var, wc80 wc80Var, n20 n20Var, com.yandex.go.taxi.order.popup.b bVar, tt2 tt2Var) {
        super(null);
        this.D = y10Var;
        this.E = yvf0Var;
        this.F = yvf0Var2;
        this.G = yvf0Var3;
        this.H = u2y0Var;
        this.I = wc80Var;
        this.J = n20Var;
        this.K = bVar;
        this.L = tt2Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object P(c cVar, d4y0 d4y0Var, a4y0 a4y0Var, ContinuationImpl continuationImpl) {
        OrderRideAutoPromotionRouter$handlePromotionDefault$1 orderRideAutoPromotionRouter$handlePromotionDefault$1;
        int i;
        n8e0 n8e0Var;
        cVar.getClass();
        if (continuationImpl instanceof OrderRideAutoPromotionRouter$handlePromotionDefault$1) {
            orderRideAutoPromotionRouter$handlePromotionDefault$1 = (OrderRideAutoPromotionRouter$handlePromotionDefault$1) continuationImpl;
            int i2 = orderRideAutoPromotionRouter$handlePromotionDefault$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                orderRideAutoPromotionRouter$handlePromotionDefault$1.label = i2 - Integer.MIN_VALUE;
                Object obj = orderRideAutoPromotionRouter$handlePromotionDefault$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = orderRideAutoPromotionRouter$handlePromotionDefault$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    cVar.L.getClass();
                    sjh sjhVar = uyj.a;
                    OrderRideAutoPromotionRouter$handlePromotionDefault$uiState$1 orderRideAutoPromotionRouter$handlePromotionDefault$uiState$1 = new OrderRideAutoPromotionRouter$handlePromotionDefault$uiState$1(d4y0Var, cVar, null);
                    orderRideAutoPromotionRouter$handlePromotionDefault$1.L$0 = null;
                    orderRideAutoPromotionRouter$handlePromotionDefault$1.L$1 = a4y0Var;
                    orderRideAutoPromotionRouter$handlePromotionDefault$1.label = 1;
                    obj = tje.k0(sjhVar, orderRideAutoPromotionRouter$handlePromotionDefault$uiState$1, orderRideAutoPromotionRouter$handlePromotionDefault$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    a4y0Var = (a4y0) orderRideAutoPromotionRouter$handlePromotionDefault$1.L$1;
                    kotlin.b.b(obj);
                }
                n8e0Var = (n8e0) obj;
                zy11 zy11Var = zy11.a;
                if (n8e0Var != null) {
                    cVar.R();
                    return zy11Var;
                }
                cVar.A((m950) cVar.E.get(), new m480(n8e0Var, new usc(n8e0Var.a, CommunicationModalAnalyticsData$ModalType.DEFAULT, a4y0Var.a, CommunicationModalAnalyticsData$RideOpenReason.AUTOMATIC)), new k580(cVar, 0));
                return zy11Var;
            }
        }
        orderRideAutoPromotionRouter$handlePromotionDefault$1 = new OrderRideAutoPromotionRouter$handlePromotionDefault$1(cVar, continuationImpl);
        Object obj2 = orderRideAutoPromotionRouter$handlePromotionDefault$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = orderRideAutoPromotionRouter$handlePromotionDefault$1.label;
        if (i != 0) {
        }
        n8e0Var = (n8e0) obj2;
        zy11 zy11Var2 = zy11.a;
        if (n8e0Var != null) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x005e, code lost:
    
        if (r9 == r1) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object Q(c cVar, e4y0 e4y0Var, a4y0 a4y0Var, ContinuationImpl continuationImpl) {
        OrderRideAutoPromotionRouter$handlePromotionModalShareOrder$1 orderRideAutoPromotionRouter$handlePromotionModalShareOrder$1;
        int i;
        s2y0 s2y0Var;
        cVar.getClass();
        if (continuationImpl instanceof OrderRideAutoPromotionRouter$handlePromotionModalShareOrder$1) {
            orderRideAutoPromotionRouter$handlePromotionModalShareOrder$1 = (OrderRideAutoPromotionRouter$handlePromotionModalShareOrder$1) continuationImpl;
            int i2 = orderRideAutoPromotionRouter$handlePromotionModalShareOrder$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                orderRideAutoPromotionRouter$handlePromotionModalShareOrder$1.label = i2 - Integer.MIN_VALUE;
                Object obj = orderRideAutoPromotionRouter$handlePromotionModalShareOrder$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = orderRideAutoPromotionRouter$handlePromotionModalShareOrder$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    com.yandex.go.taxi.order.popup.b bVar = cVar.K;
                    f480 f480Var = e4y0Var.e;
                    orderRideAutoPromotionRouter$handlePromotionModalShareOrder$1.L$0 = null;
                    orderRideAutoPromotionRouter$handlePromotionModalShareOrder$1.L$1 = a4y0Var;
                    orderRideAutoPromotionRouter$handlePromotionModalShareOrder$1.label = 1;
                    obj = bVar.d(f480Var, orderRideAutoPromotionRouter$handlePromotionModalShareOrder$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj);
                        return obj;
                    }
                    a4y0Var = (a4y0) orderRideAutoPromotionRouter$handlePromotionModalShareOrder$1.L$1;
                    kotlin.b.b(obj);
                }
                s2y0Var = (s2y0) obj;
                if (s2y0Var != null) {
                    cVar.R();
                    return zy11.a;
                }
                g a = ((com.yandex.go.taxi.order.provider.a) cVar.J).a();
                ye yeVar = new ye(17, cVar, s2y0Var, a4y0Var);
                orderRideAutoPromotionRouter$handlePromotionModalShareOrder$1.L$0 = null;
                orderRideAutoPromotionRouter$handlePromotionModalShareOrder$1.L$1 = null;
                orderRideAutoPromotionRouter$handlePromotionModalShareOrder$1.L$2 = null;
                orderRideAutoPromotionRouter$handlePromotionModalShareOrder$1.label = 2;
                Object collect = a.collect(yeVar, orderRideAutoPromotionRouter$handlePromotionModalShareOrder$1);
                return collect == coroutineSingletons ? coroutineSingletons : collect;
            }
        }
        orderRideAutoPromotionRouter$handlePromotionModalShareOrder$1 = new OrderRideAutoPromotionRouter$handlePromotionModalShareOrder$1(cVar, continuationImpl);
        Object obj2 = orderRideAutoPromotionRouter$handlePromotionModalShareOrder$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = orderRideAutoPromotionRouter$handlePromotionModalShareOrder$1.label;
        if (i != 0) {
        }
        s2y0Var = (s2y0) obj2;
        if (s2y0Var != null) {
        }
    }

    @Override // defpackage.h55
    public final void J(Object obj) {
        this.D.a();
        tje.N(o(), null, null, new OrderRideAutoPromotionRouter$onLaunch$1(this, (a4y0) obj, null), 3);
    }

    public final void R() {
        this.D.e();
        r(new qu(9));
    }
}
