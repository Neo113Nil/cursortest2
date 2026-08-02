package com.yandex.go.taxi.order.details.v1.domain;

import com.yandex.go.taxi.order.change.source.data.e;
import com.yandex.go.taxi.order.details.v1.elements.buttons.j;
import com.yandex.go.taxi.order.details.v1.elements.user_requirements.b;
import defpackage.bvf0;
import defpackage.gci0;
import defpackage.ht70;
import defpackage.ike;
import defpackage.jl40;
import defpackage.jqr;
import defpackage.mdh;
import defpackage.ny61;
import defpackage.o2y0;
import defpackage.p7j;
import defpackage.pwy0;
import defpackage.q8j;
import defpackage.scc;
import defpackage.sjh;
import defpackage.tje;
import defpackage.tkw0;
import defpackage.tpr;
import defpackage.tt2;
import defpackage.uyj;
import defpackage.wh70;
import defpackage.xpf0;
import defpackage.y4j;
import defpackage.zy11;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.m0;
import ru.yandex.taxi.styling.c;
import ru.yandex.taxi.styling.f;

/* loaded from: classes14.dex */
public final class a {
    public final gci0 A;
    public final gci0 B;
    public final gci0 C;
    public final gci0 D;
    public final gci0 E;
    public final o2y0 a;
    public final c b;
    public final com.yandex.go.taxi.order.details.v1.elements.source.c c;
    public final com.yandex.go.taxi.order.details.v1.elements.route_point.c d;
    public final com.yandex.go.taxi.order.details.v1.elements.destination.c e;
    public final pwy0 f;
    public final f g;
    public final e h;
    public final com.yandex.go.taxi.order.details.v1.elements.complete_button.a i;
    public final ike j;
    public final List k;
    public final gci0 l;
    public final gci0 m;
    public final gci0 n;
    public final m0 o;
    public final m0 p;
    public final m0 q;
    public final tpr r;
    public final gci0 s;
    public final gci0 t;
    public final gci0 u;
    public final tpr v;
    public final tpr w;
    public final gci0 x;
    public final gci0 y;
    public final gci0 z;

    public a(o2y0 o2y0Var, c cVar, com.yandex.go.taxi.order.details.v1.elements.source.c cVar2, com.yandex.go.taxi.order.details.v1.elements.route_point.c cVar3, com.yandex.go.taxi.order.details.v1.elements.destination.c cVar4, pwy0 pwy0Var, f fVar, e eVar, com.yandex.go.taxi.order.details.v1.elements.buttons.a aVar, com.yandex.go.taxi.order.details.v1.elements.payment.a aVar2, y4j y4jVar, xpf0 xpf0Var, j jVar, com.yandex.go.taxi.order.details.v1.elements.info.a aVar3, com.yandex.go.taxi.order.details.v1.elements.driver.c cVar5, com.yandex.go.taxi.order.details.v1.elements.upsell.a aVar4, com.yandex.go.taxi.order.details.v1.elements.section_detail.a aVar5, tkw0 tkw0Var, com.yandex.go.taxi.order.details.v1.elements.ride_support.a aVar6, p7j p7jVar, ht70 ht70Var, b bVar, com.yandex.go.taxi.order.details.v1.elements.complete_button.a aVar7, com.yandex.go.taxi.order.details.v1.elements.driver_phone.a aVar8, tt2 tt2Var) {
        this.a = o2y0Var;
        this.b = cVar;
        this.c = cVar2;
        this.d = cVar3;
        this.e = cVar4;
        this.f = pwy0Var;
        this.g = fVar;
        this.h = eVar;
        this.i = aVar7;
        tt2Var.getClass();
        sjh sjhVar = uyj.a;
        this.j = bvf0.a(mdh.b.plus(jl40.a()));
        this.k = scc.g(p7jVar, jVar, aVar, cVar2, cVar3, cVar4, aVar2, aVar3, y4jVar, cVar5, tkw0Var, aVar6, xpf0Var, aVar5, ht70Var, aVar4, bVar, aVar7, aVar8);
        this.l = p7jVar.a.b;
        this.m = cVar5.c;
        this.n = jVar.b.c;
        this.o = cVar2.c;
        this.p = cVar3.h;
        this.q = cVar4.h;
        this.r = aVar2.b;
        this.s = aVar3.c;
        this.t = y4jVar.b;
        this.u = aVar.b.d;
        this.v = xpf0Var.d;
        this.w = xpf0Var.e;
        this.x = aVar5.c;
        this.y = tkw0Var.c;
        this.z = aVar6.c;
        this.A = ht70Var.d;
        this.B = aVar4.c;
        this.C = bVar.c;
        this.D = aVar7.c;
        this.E = aVar8.c;
    }

    public final void a() {
        jqr jqrVar = new jqr(this.b.e(this.a), new OrderDetailsCardInteractor$subscribeForTotwUpdates$1(this, null), 3);
        ike ikeVar = this.j;
        kotlinx.coroutines.flow.e.H(ikeVar, jqrVar);
        Iterator it = this.k.iterator();
        while (it.hasNext()) {
            tje.N(ikeVar, null, null, new OrderDetailsCardInteractor$subscribeForTotwUpdates$2$1((q8j) it.next(), this, null), 3);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(wh70 wh70Var, ContinuationImpl continuationImpl) {
        OrderDetailsCardInteractor$updateAllowedOrderChanges$1 orderDetailsCardInteractor$updateAllowedOrderChanges$1;
        int i;
        com.yandex.go.taxi.order.details.v1.elements.source.c cVar;
        if (continuationImpl instanceof OrderDetailsCardInteractor$updateAllowedOrderChanges$1) {
            orderDetailsCardInteractor$updateAllowedOrderChanges$1 = (OrderDetailsCardInteractor$updateAllowedOrderChanges$1) continuationImpl;
            int i2 = orderDetailsCardInteractor$updateAllowedOrderChanges$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                orderDetailsCardInteractor$updateAllowedOrderChanges$1.label = i2 - Integer.MIN_VALUE;
                Object obj = orderDetailsCardInteractor$updateAllowedOrderChanges$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = orderDetailsCardInteractor$updateAllowedOrderChanges$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    orderDetailsCardInteractor$updateAllowedOrderChanges$1.L$0 = wh70Var;
                    com.yandex.go.taxi.order.details.v1.elements.source.c cVar2 = this.c;
                    orderDetailsCardInteractor$updateAllowedOrderChanges$1.L$1 = cVar2;
                    orderDetailsCardInteractor$updateAllowedOrderChanges$1.label = 1;
                    Object b = this.h.b(orderDetailsCardInteractor$updateAllowedOrderChanges$1);
                    if (b == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    obj = b;
                    cVar = cVar2;
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    cVar = (com.yandex.go.taxi.order.details.v1.elements.source.c) orderDetailsCardInteractor$updateAllowedOrderChanges$1.L$1;
                    wh70Var = (wh70) orderDetailsCardInteractor$updateAllowedOrderChanges$1.L$0;
                    kotlin.b.b(obj);
                }
                cVar.g(!((Boolean) obj).booleanValue() && wh70Var.b(), wh70Var.a.get("porchnumber") != null);
                return zy11.a;
            }
        }
        orderDetailsCardInteractor$updateAllowedOrderChanges$1 = new OrderDetailsCardInteractor$updateAllowedOrderChanges$1(this, continuationImpl);
        Object obj2 = orderDetailsCardInteractor$updateAllowedOrderChanges$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = orderDetailsCardInteractor$updateAllowedOrderChanges$1.label;
        if (i != 0) {
        }
        cVar.g(!((Boolean) obj2).booleanValue() && wh70Var.b(), wh70Var.a.get("porchnumber") != null);
        return zy11.a;
    }
}
