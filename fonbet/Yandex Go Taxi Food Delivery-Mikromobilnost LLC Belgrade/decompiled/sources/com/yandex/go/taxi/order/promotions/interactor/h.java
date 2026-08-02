package com.yandex.go.taxi.order.promotions.interactor;

import defpackage.a480;
import defpackage.g4y0;
import defpackage.hbp0;
import defpackage.hit;
import defpackage.n20;
import defpackage.ny61;
import defpackage.o8s0;
import defpackage.pzt0;
import defpackage.t9s0;
import defpackage.tje;
import defpackage.tt2;
import defpackage.uyj;
import defpackage.wc80;
import defpackage.wsc;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Set;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes14.dex */
public final class h {
    public final a480 a;
    public final ru.yandex.taxi.communications.data.a b;
    public final wc80 c;
    public final hit d;
    public final n20 e;
    public final wsc f;
    public final tt2 g;
    public pzt0 h;

    public h(a480 a480Var, ru.yandex.taxi.communications.data.a aVar, wc80 wc80Var, hit hitVar, n20 n20Var, wsc wscVar, tt2 tt2Var) {
        this.a = a480Var;
        this.b = aVar;
        this.c = wc80Var;
        this.d = hitVar;
        this.e = n20Var;
        this.f = wscVar;
        this.g = tt2Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00bc A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0078 -> B:10:0x007b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(h hVar, Set set, ContinuationImpl continuationImpl) {
        OrderPromotionsUpdateInteractor$findPromotionToShow$1 orderPromotionsUpdateInteractor$findPromotionToShow$1;
        int i;
        Iterator it;
        hVar.getClass();
        if (continuationImpl instanceof OrderPromotionsUpdateInteractor$findPromotionToShow$1) {
            orderPromotionsUpdateInteractor$findPromotionToShow$1 = (OrderPromotionsUpdateInteractor$findPromotionToShow$1) continuationImpl;
            int i2 = orderPromotionsUpdateInteractor$findPromotionToShow$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                orderPromotionsUpdateInteractor$findPromotionToShow$1.label = i2 - Integer.MIN_VALUE;
                Object obj = orderPromotionsUpdateInteractor$findPromotionToShow$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = orderPromotionsUpdateInteractor$findPromotionToShow$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    it = set.iterator();
                    if (it.hasNext()) {
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    String str = (String) orderPromotionsUpdateInteractor$findPromotionToShow$1.L$4;
                    g4y0 g4y0Var = (g4y0) orderPromotionsUpdateInteractor$findPromotionToShow$1.L$3;
                    Object next = orderPromotionsUpdateInteractor$findPromotionToShow$1.L$2;
                    it = (Iterator) orderPromotionsUpdateInteractor$findPromotionToShow$1.L$1;
                    kotlin.b.b(obj);
                    t9s0 t9s0Var = (t9s0) obj;
                    if (!hVar.c.a.a.g(String.format("shown_promo_%s_%s", Arrays.copyOf(new Object[]{g4y0Var.a(), str}, 2)), false)) {
                        o8s0 c = g4y0Var.c();
                        boolean z = t9s0Var.b < c.a;
                        boolean z2 = t9s0Var.c < c.c;
                        if (z && z2 && t9s0Var.d < c.b) {
                            return next;
                        }
                    }
                    if (it.hasNext()) {
                        next = it.next();
                        g4y0Var = (g4y0) next;
                        str = g4y0Var.c().d;
                        if (str == null) {
                            str = g4y0Var.b();
                        }
                        ru.yandex.taxi.communications.data.a aVar = hVar.b;
                        orderPromotionsUpdateInteractor$findPromotionToShow$1.L$0 = null;
                        orderPromotionsUpdateInteractor$findPromotionToShow$1.L$1 = it;
                        orderPromotionsUpdateInteractor$findPromotionToShow$1.L$2 = next;
                        orderPromotionsUpdateInteractor$findPromotionToShow$1.L$3 = g4y0Var;
                        orderPromotionsUpdateInteractor$findPromotionToShow$1.L$4 = str;
                        orderPromotionsUpdateInteractor$findPromotionToShow$1.label = 1;
                        obj = aVar.b(str, orderPromotionsUpdateInteractor$findPromotionToShow$1);
                        if (obj == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        t9s0 t9s0Var2 = (t9s0) obj;
                        if (!hVar.c.a.a.g(String.format("shown_promo_%s_%s", Arrays.copyOf(new Object[]{g4y0Var.a(), str}, 2)), false)) {
                        }
                        if (it.hasNext()) {
                            return null;
                        }
                    }
                }
            }
        }
        orderPromotionsUpdateInteractor$findPromotionToShow$1 = new OrderPromotionsUpdateInteractor$findPromotionToShow$1(hVar, continuationImpl);
        Object obj2 = orderPromotionsUpdateInteractor$findPromotionToShow$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = orderPromotionsUpdateInteractor$findPromotionToShow$1.label;
        if (i != 0) {
        }
    }

    public final void b() {
        pzt0 pzt0Var = this.h;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        hbp0 hbp0Var = this.d.a;
        this.g.getClass();
        this.h = tje.N(hbp0Var, uyj.a, null, new OrderPromotionsUpdateInteractor$startMonitoring$1(this, null), 2);
    }
}
