package com.yandex.go.superapp.order.multi.old.view;

import com.yandex.go.taxi.order.analytics.DetailsOpenReason;
import com.yandex.go.taxi.order.api.details.TaxiCardNavigationAction;
import defpackage.czo0;
import defpackage.hbp0;
import defpackage.ic00;
import defpackage.jc00;
import defpackage.kc00;
import defpackage.ny61;
import defpackage.o2y0;
import defpackage.zy11;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.m0;

/* loaded from: classes14.dex */
public final class l {
    public final g a;
    public final com.yandex.go.taxi.order.provider.a b;
    public final com.yandex.go.taxi.order.view.l c;
    public final jc00 d;
    public final hbp0 e = new hbp0(new czo0(14), "", null);

    public l(g gVar, com.yandex.go.taxi.order.provider.a aVar, com.yandex.go.taxi.order.view.l lVar, jc00 jc00Var) {
        this.a = gVar;
        this.b = aVar;
        this.c = lVar;
        this.d = jc00Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0064, code lost:
    
        if ((r7 instanceof defpackage.hc00) == false) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(l lVar, o2y0 o2y0Var, Continuation continuation) {
        RedirectToCompletedInteractor$onOrderCompleted$1 redirectToCompletedInteractor$onOrderCompleted$1;
        Object obj;
        int i;
        lVar.getClass();
        zy11 zy11Var = zy11.a;
        if (continuation instanceof RedirectToCompletedInteractor$onOrderCompleted$1) {
            redirectToCompletedInteractor$onOrderCompleted$1 = (RedirectToCompletedInteractor$onOrderCompleted$1) continuation;
            int i2 = redirectToCompletedInteractor$onOrderCompleted$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                redirectToCompletedInteractor$onOrderCompleted$1.label = i2 - Integer.MIN_VALUE;
                obj = redirectToCompletedInteractor$onOrderCompleted$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = redirectToCompletedInteractor$onOrderCompleted$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    if (!o2y0Var.b().l.y) {
                        com.yandex.go.taxi.order.provider.a aVar = lVar.b;
                        redirectToCompletedInteractor$onOrderCompleted$1.L$0 = o2y0Var;
                        redirectToCompletedInteractor$onOrderCompleted$1.label = 1;
                        obj = aVar.k(redirectToCompletedInteractor$onOrderCompleted$1);
                        if (obj == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    }
                    return zy11Var;
                }
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o2y0Var = (o2y0) redirectToCompletedInteractor$onOrderCompleted$1.L$0;
                kotlin.b.b(obj);
                if (((List) obj).size() > 1) {
                    ic00 ic00Var = ((kc00) lVar.d).a;
                    ic00Var.getClass();
                }
                if (!o2y0Var.b().l.z) {
                    lVar.a.d(o2y0Var.b().a, !o2y0Var.b().l.A, DetailsOpenReason.AUTO, TaxiCardNavigationAction.EMPTY);
                }
                return zy11Var;
            }
        }
        redirectToCompletedInteractor$onOrderCompleted$1 = new RedirectToCompletedInteractor$onOrderCompleted$1(lVar, continuation);
        obj = redirectToCompletedInteractor$onOrderCompleted$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = redirectToCompletedInteractor$onOrderCompleted$1.label;
        if (i != 0) {
        }
        if (((List) obj).size() > 1) {
        }
        if (!o2y0Var.b().l.z) {
        }
        return zy11Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object b(l lVar, o2y0 o2y0Var, ContinuationImpl continuationImpl) {
        RedirectToCompletedInteractor$waitOrderCompleted$1 redirectToCompletedInteractor$waitOrderCompleted$1;
        int i;
        lVar.getClass();
        if (continuationImpl instanceof RedirectToCompletedInteractor$waitOrderCompleted$1) {
            redirectToCompletedInteractor$waitOrderCompleted$1 = (RedirectToCompletedInteractor$waitOrderCompleted$1) continuationImpl;
            int i2 = redirectToCompletedInteractor$waitOrderCompleted$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                redirectToCompletedInteractor$waitOrderCompleted$1.label = i2 - Integer.MIN_VALUE;
                Object obj = redirectToCompletedInteractor$waitOrderCompleted$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = redirectToCompletedInteractor$waitOrderCompleted$1.label;
                if (i == 0) {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    o2y0 o2y0Var2 = (o2y0) redirectToCompletedInteractor$waitOrderCompleted$1.L$0;
                    kotlin.b.b(obj);
                    return o2y0Var2;
                }
                kotlin.b.b(obj);
                m0 m0Var = new m0(kotlinx.coroutines.flow.e.t(new k(o2y0Var.a())), kotlinx.coroutines.flow.e.p(lVar.c.j, 300L), new RedirectToCompletedInteractor$waitOrderCompleted$3(lVar, null));
                RedirectToCompletedInteractor$waitOrderCompleted$4 redirectToCompletedInteractor$waitOrderCompleted$4 = new RedirectToCompletedInteractor$waitOrderCompleted$4(2, null);
                redirectToCompletedInteractor$waitOrderCompleted$1.L$0 = o2y0Var;
                redirectToCompletedInteractor$waitOrderCompleted$1.label = 1;
                return kotlinx.coroutines.flow.e.x(m0Var, redirectToCompletedInteractor$waitOrderCompleted$4, redirectToCompletedInteractor$waitOrderCompleted$1) == coroutineSingletons ? coroutineSingletons : o2y0Var;
            }
        }
        redirectToCompletedInteractor$waitOrderCompleted$1 = new RedirectToCompletedInteractor$waitOrderCompleted$1(lVar, continuationImpl);
        Object obj2 = redirectToCompletedInteractor$waitOrderCompleted$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = redirectToCompletedInteractor$waitOrderCompleted$1.label;
        if (i == 0) {
        }
    }
}
