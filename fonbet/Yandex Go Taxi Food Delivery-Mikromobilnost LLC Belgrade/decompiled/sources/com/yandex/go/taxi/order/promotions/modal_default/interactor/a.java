package com.yandex.go.taxi.order.promotions.modal_default.interactor;

import com.yandex.go.design.compose.colors.AppColor$Palette;
import com.yandex.go.taxi.order.domain.repositories.e0;
import com.yandex.go.taxi.order.models.api.TaxiOrder;
import defpackage.ar70;
import defpackage.bdc;
import defpackage.br70;
import defpackage.bvf0;
import defpackage.er70;
import defpackage.fef;
import defpackage.fr70;
import defpackage.gwk0;
import defpackage.ief;
import defpackage.j37;
import defpackage.lr70;
import defpackage.mr70;
import defpackage.ny61;
import defpackage.o2y0;
import defpackage.p2y0;
import defpackage.pr70;
import defpackage.rcc;
import defpackage.scc;
import defpackage.tcc;
import defpackage.vpr;
import defpackage.vr70;
import defpackage.xng0;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.builders.ListBuilder;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import ru.yandex.taxi.styling.ButtonType;
import ru.yandex.taxi.styling.g;

/* loaded from: classes14.dex */
public final class a implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ c b;
    public final /* synthetic */ pr70 c;

    public a(vpr vprVar, c cVar, pr70 pr70Var) {
        this.a = vprVar;
        this.b = cVar;
        this.c = pr70Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x01f0, code lost:
    
        if (r4.emit(r1, r2) != r3) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x00bf, code lost:
    
        if (r1 == r3) goto L62;
     */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002d  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        OrderDefaultModalInteractor$stateFlow$$inlined$map$1$2$1 orderDefaultModalInteractor$stateFlow$$inlined$map$1$2$1;
        CoroutineSingletons coroutineSingletons;
        int i;
        vpr vprVar;
        Object a;
        vpr vprVar2;
        fef fefVar;
        TaxiOrder b;
        ief iefVar;
        Object n;
        fr70 fr70Var;
        List list;
        Object br70Var;
        if (continuation instanceof OrderDefaultModalInteractor$stateFlow$$inlined$map$1$2$1) {
            orderDefaultModalInteractor$stateFlow$$inlined$map$1$2$1 = (OrderDefaultModalInteractor$stateFlow$$inlined$map$1$2$1) continuation;
            int i2 = orderDefaultModalInteractor$stateFlow$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                orderDefaultModalInteractor$stateFlow$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = orderDefaultModalInteractor$stateFlow$$inlined$map$1$2$1.result;
                coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = orderDefaultModalInteractor$stateFlow$$inlined$map$1$2$1.label;
                pr70 pr70Var = this.c;
                boolean z = true;
                c cVar = this.b;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    p2y0 p2y0Var = cVar.g;
                    orderDefaultModalInteractor$stateFlow$$inlined$map$1$2$1.L$0 = null;
                    orderDefaultModalInteractor$stateFlow$$inlined$map$1$2$1.L$1 = null;
                    orderDefaultModalInteractor$stateFlow$$inlined$map$1$2$1.L$2 = null;
                    orderDefaultModalInteractor$stateFlow$$inlined$map$1$2$1.L$3 = null;
                    vprVar = this.a;
                    orderDefaultModalInteractor$stateFlow$$inlined$map$1$2$1.L$4 = vprVar;
                    orderDefaultModalInteractor$stateFlow$$inlined$map$1$2$1.L$5 = null;
                    orderDefaultModalInteractor$stateFlow$$inlined$map$1$2$1.L$6 = null;
                    orderDefaultModalInteractor$stateFlow$$inlined$map$1$2$1.label = 1;
                    obj2 = ((e0) p2y0Var).y(orderDefaultModalInteractor$stateFlow$$inlined$map$1$2$1);
                } else if (i == 1) {
                    vprVar = (vpr) orderDefaultModalInteractor$stateFlow$$inlined$map$1$2$1.L$4;
                    kotlin.b.b(obj2);
                } else {
                    if (i == 2) {
                        fefVar = (fef) orderDefaultModalInteractor$stateFlow$$inlined$map$1$2$1.L$7;
                        vprVar2 = (vpr) orderDefaultModalInteractor$stateFlow$$inlined$map$1$2$1.L$4;
                        kotlin.b.b(obj2);
                        fr70 fr70Var2 = (fr70) obj2;
                        List list2 = pr70Var.e;
                        orderDefaultModalInteractor$stateFlow$$inlined$map$1$2$1.L$0 = null;
                        orderDefaultModalInteractor$stateFlow$$inlined$map$1$2$1.L$1 = null;
                        orderDefaultModalInteractor$stateFlow$$inlined$map$1$2$1.L$2 = null;
                        orderDefaultModalInteractor$stateFlow$$inlined$map$1$2$1.L$3 = null;
                        orderDefaultModalInteractor$stateFlow$$inlined$map$1$2$1.L$4 = vprVar2;
                        orderDefaultModalInteractor$stateFlow$$inlined$map$1$2$1.L$5 = null;
                        orderDefaultModalInteractor$stateFlow$$inlined$map$1$2$1.L$6 = null;
                        orderDefaultModalInteractor$stateFlow$$inlined$map$1$2$1.L$7 = fr70Var2;
                        orderDefaultModalInteractor$stateFlow$$inlined$map$1$2$1.L$8 = null;
                        orderDefaultModalInteractor$stateFlow$$inlined$map$1$2$1.label = 3;
                        cVar.getClass();
                        n = bvf0.n(new OrderDefaultModalInteractor$mapBullets$2(list2, cVar, fefVar, null), orderDefaultModalInteractor$stateFlow$$inlined$map$1$2$1);
                        if (n != coroutineSingletons) {
                            obj2 = n;
                            fr70Var = fr70Var2;
                            List list3 = (List) obj2;
                            cVar.getClass();
                            mr70 mr70Var = (mr70) kotlin.collections.a.R(pr70Var.g);
                            list = pr70Var.g;
                            if (list.size() == 1) {
                            }
                            List list4 = list;
                            ArrayList arrayList = new ArrayList(tcc.n(list4, 10));
                            int i3 = 0;
                            while (r6.hasNext()) {
                            }
                            br70Var = new br70(arrayList);
                            ListBuilder a2 = rcc.a();
                            a2.add(fr70Var);
                            a2.addAll(list3);
                            a2.add(br70Var);
                            vr70 vr70Var = new vr70(a2.j());
                            orderDefaultModalInteractor$stateFlow$$inlined$map$1$2$1.L$0 = null;
                            orderDefaultModalInteractor$stateFlow$$inlined$map$1$2$1.L$1 = null;
                            orderDefaultModalInteractor$stateFlow$$inlined$map$1$2$1.L$2 = null;
                            orderDefaultModalInteractor$stateFlow$$inlined$map$1$2$1.L$3 = null;
                            orderDefaultModalInteractor$stateFlow$$inlined$map$1$2$1.L$4 = null;
                            orderDefaultModalInteractor$stateFlow$$inlined$map$1$2$1.L$5 = null;
                            orderDefaultModalInteractor$stateFlow$$inlined$map$1$2$1.L$6 = null;
                            orderDefaultModalInteractor$stateFlow$$inlined$map$1$2$1.L$7 = null;
                            orderDefaultModalInteractor$stateFlow$$inlined$map$1$2$1.L$8 = null;
                            orderDefaultModalInteractor$stateFlow$$inlined$map$1$2$1.label = 4;
                        }
                        return coroutineSingletons;
                    }
                    if (i != 3) {
                        if (i != 4) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj2);
                        return zy11.a;
                    }
                    fr70Var = (fr70) orderDefaultModalInteractor$stateFlow$$inlined$map$1$2$1.L$7;
                    vprVar2 = (vpr) orderDefaultModalInteractor$stateFlow$$inlined$map$1$2$1.L$4;
                    kotlin.b.b(obj2);
                    List list32 = (List) obj2;
                    cVar.getClass();
                    mr70 mr70Var2 = (mr70) kotlin.collections.a.R(pr70Var.g);
                    list = pr70Var.g;
                    if (list.size() == 1 || !(mr70Var2 instanceof lr70)) {
                        List list42 = list;
                        ArrayList arrayList2 = new ArrayList(tcc.n(list42, 10));
                        int i32 = 0;
                        for (Object obj3 : list42) {
                            int i4 = i32 + 1;
                            if (i32 < 0) {
                                scc.m();
                                throw null;
                            }
                            mr70 mr70Var3 = (mr70) obj3;
                            arrayList2.add(new ar70(mr70Var3.getTitle(), i32 == scc.f(list) ? z : false, mr70Var3.getAction()));
                            i32 = i4;
                            z = true;
                        }
                        br70Var = new br70(arrayList2);
                    } else {
                        lr70 lr70Var = (lr70) mr70Var2;
                        String str = lr70Var.a;
                        String str2 = lr70Var.c;
                        j37 a3 = ((g) cVar.d).a().a.a(ButtonType.DEFAULT);
                        j37 j37Var = new j37(new bdc(xng0.controlMain), new bdc(xng0.textOnControl), AppColor$Palette.Control, AppColor$Palette.TextOnControl);
                        if (a3 == null) {
                            a3 = j37Var;
                        }
                        br70Var = new er70(str, str2, a3);
                    }
                    ListBuilder a22 = rcc.a();
                    a22.add(fr70Var);
                    a22.addAll(list32);
                    a22.add(br70Var);
                    vr70 vr70Var2 = new vr70(a22.j());
                    orderDefaultModalInteractor$stateFlow$$inlined$map$1$2$1.L$0 = null;
                    orderDefaultModalInteractor$stateFlow$$inlined$map$1$2$1.L$1 = null;
                    orderDefaultModalInteractor$stateFlow$$inlined$map$1$2$1.L$2 = null;
                    orderDefaultModalInteractor$stateFlow$$inlined$map$1$2$1.L$3 = null;
                    orderDefaultModalInteractor$stateFlow$$inlined$map$1$2$1.L$4 = null;
                    orderDefaultModalInteractor$stateFlow$$inlined$map$1$2$1.L$5 = null;
                    orderDefaultModalInteractor$stateFlow$$inlined$map$1$2$1.L$6 = null;
                    orderDefaultModalInteractor$stateFlow$$inlined$map$1$2$1.L$7 = null;
                    orderDefaultModalInteractor$stateFlow$$inlined$map$1$2$1.L$8 = null;
                    orderDefaultModalInteractor$stateFlow$$inlined$map$1$2$1.label = 4;
                }
                o2y0 o2y0Var = (o2y0) obj2;
                fef h = (o2y0Var != null || (b = o2y0Var.b()) == null || (iefVar = b.V().K) == null) ? null : gwk0.h(iefVar);
                orderDefaultModalInteractor$stateFlow$$inlined$map$1$2$1.L$0 = null;
                orderDefaultModalInteractor$stateFlow$$inlined$map$1$2$1.L$1 = null;
                orderDefaultModalInteractor$stateFlow$$inlined$map$1$2$1.L$2 = null;
                orderDefaultModalInteractor$stateFlow$$inlined$map$1$2$1.L$3 = null;
                orderDefaultModalInteractor$stateFlow$$inlined$map$1$2$1.L$4 = vprVar;
                orderDefaultModalInteractor$stateFlow$$inlined$map$1$2$1.L$5 = null;
                orderDefaultModalInteractor$stateFlow$$inlined$map$1$2$1.L$6 = null;
                orderDefaultModalInteractor$stateFlow$$inlined$map$1$2$1.L$7 = h;
                orderDefaultModalInteractor$stateFlow$$inlined$map$1$2$1.label = 2;
                a = c.a(cVar, pr70Var, orderDefaultModalInteractor$stateFlow$$inlined$map$1$2$1);
                if (a != coroutineSingletons) {
                    vprVar2 = vprVar;
                    fefVar = h;
                    obj2 = a;
                    fr70 fr70Var22 = (fr70) obj2;
                    List list22 = pr70Var.e;
                    orderDefaultModalInteractor$stateFlow$$inlined$map$1$2$1.L$0 = null;
                    orderDefaultModalInteractor$stateFlow$$inlined$map$1$2$1.L$1 = null;
                    orderDefaultModalInteractor$stateFlow$$inlined$map$1$2$1.L$2 = null;
                    orderDefaultModalInteractor$stateFlow$$inlined$map$1$2$1.L$3 = null;
                    orderDefaultModalInteractor$stateFlow$$inlined$map$1$2$1.L$4 = vprVar2;
                    orderDefaultModalInteractor$stateFlow$$inlined$map$1$2$1.L$5 = null;
                    orderDefaultModalInteractor$stateFlow$$inlined$map$1$2$1.L$6 = null;
                    orderDefaultModalInteractor$stateFlow$$inlined$map$1$2$1.L$7 = fr70Var22;
                    orderDefaultModalInteractor$stateFlow$$inlined$map$1$2$1.L$8 = null;
                    orderDefaultModalInteractor$stateFlow$$inlined$map$1$2$1.label = 3;
                    cVar.getClass();
                    n = bvf0.n(new OrderDefaultModalInteractor$mapBullets$2(list22, cVar, fefVar, null), orderDefaultModalInteractor$stateFlow$$inlined$map$1$2$1);
                    if (n != coroutineSingletons) {
                    }
                }
                return coroutineSingletons;
            }
        }
        orderDefaultModalInteractor$stateFlow$$inlined$map$1$2$1 = new OrderDefaultModalInteractor$stateFlow$$inlined$map$1$2$1(this, continuation);
        Object obj22 = orderDefaultModalInteractor$stateFlow$$inlined$map$1$2$1.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = orderDefaultModalInteractor$stateFlow$$inlined$map$1$2$1.label;
        pr70 pr70Var2 = this.c;
        boolean z2 = true;
        c cVar2 = this.b;
        if (i != 0) {
        }
        o2y0 o2y0Var2 = (o2y0) obj22;
        if (o2y0Var2 != null) {
        }
        orderDefaultModalInteractor$stateFlow$$inlined$map$1$2$1.L$0 = null;
        orderDefaultModalInteractor$stateFlow$$inlined$map$1$2$1.L$1 = null;
        orderDefaultModalInteractor$stateFlow$$inlined$map$1$2$1.L$2 = null;
        orderDefaultModalInteractor$stateFlow$$inlined$map$1$2$1.L$3 = null;
        orderDefaultModalInteractor$stateFlow$$inlined$map$1$2$1.L$4 = vprVar;
        orderDefaultModalInteractor$stateFlow$$inlined$map$1$2$1.L$5 = null;
        orderDefaultModalInteractor$stateFlow$$inlined$map$1$2$1.L$6 = null;
        orderDefaultModalInteractor$stateFlow$$inlined$map$1$2$1.L$7 = h;
        orderDefaultModalInteractor$stateFlow$$inlined$map$1$2$1.label = 2;
        a = c.a(cVar2, pr70Var2, orderDefaultModalInteractor$stateFlow$$inlined$map$1$2$1);
        if (a != coroutineSingletons) {
        }
        return coroutineSingletons;
    }
}
