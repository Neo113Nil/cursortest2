package com.yandex.go.taxi.order.details.v2.state.elements.payment;

import com.yandex.go.slot.dto.SlotItemDto;
import com.yandex.go.slot.dto.b2;
import com.yandex.go.slot.dto.k2;
import com.yandex.go.taxi.order.models.api.ChangeOrderState$Source;
import com.yandex.go.taxi.order.models.api.TaxiOrder;
import com.yandex.go.taxi.order.models.api.e;
import com.yandex.go.taxi.order.models.api.response.RideCardItemDto$Payment;
import defpackage.avu0;
import defpackage.bdc;
import defpackage.cda0;
import defpackage.css0;
import defpackage.evu0;
import defpackage.fef;
import defpackage.g92;
import defpackage.hlk0;
import defpackage.ibk0;
import defpackage.ief;
import defpackage.ijk0;
import defpackage.irs0;
import defpackage.jgv;
import defpackage.kdc;
import defpackage.klk0;
import defpackage.lbk0;
import defpackage.lv90;
import defpackage.ny61;
import defpackage.o2y0;
import defpackage.o8a0;
import defpackage.pdc;
import defpackage.rss0;
import defpackage.tpr;
import defpackage.tss0;
import defpackage.ufu;
import defpackage.v8a0;
import defpackage.wh70;
import defpackage.xjk0;
import defpackage.xng0;
import defpackage.yjk0;
import java.math.BigDecimal;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.m0;
import ru.yandex.taxi.gopayments.model.PaymentMethod$Type;

/* loaded from: classes14.dex */
public final class c {
    public final o8a0 a;
    public final xjk0 b;
    public final irs0 c;
    public final jgv d;
    public final pdc e;
    public final lbk0 f;
    public final o2y0 g;
    public final cda0 h;

    public c(o8a0 o8a0Var, xjk0 xjk0Var, irs0 irs0Var, jgv jgvVar, pdc pdcVar, lbk0 lbk0Var, o2y0 o2y0Var, cda0 cda0Var) {
        this.a = o8a0Var;
        this.b = xjk0Var;
        this.c = irs0Var;
        this.d = jgvVar;
        this.e = pdcVar;
        this.f = lbk0Var;
        this.g = o2y0Var;
        this.h = cda0Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:0x017a, code lost:
    
        if (r2 == r12) goto L60;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0241  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x024a  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0035  */
    /* JADX WARN: Type inference failed for: r25v0, types: [com.yandex.go.taxi.order.details.v2.state.elements.payment.c] */
    /* JADX WARN: Type inference failed for: r2v18, types: [tss0] */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r2v7 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(c cVar, RideCardItemDto$Payment rideCardItemDto$Payment, SlotItemDto slotItemDto, List list, fef fefVar, ContinuationImpl continuationImpl) {
        RideCardPaymentItemDataSource$paymentItemStateFlow$1 rideCardPaymentItemDataSource$paymentItemStateFlow$1;
        int i;
        k2 k2Var;
        ?? r2;
        kdc kdcVar;
        boolean z;
        boolean z2;
        int i2;
        RideCardItemDto$Payment rideCardItemDto$Payment2;
        Object k;
        v8a0 v8a0Var;
        SlotItemDto slotItemDto2;
        RideCardItemDto$Payment rideCardItemDto$Payment3;
        kdc kdcVar2;
        css0 css0Var;
        rss0 rss0Var;
        kdc kdcVar3;
        RideCardItemDto$Payment rideCardItemDto$Payment4;
        RideCardItemDto$Payment rideCardItemDto$Payment5;
        int i3;
        SlotItemDto slotItemDto3;
        css0 css0Var2;
        kdc kdcVar4;
        SlotItemDto slotItemDto4 = slotItemDto;
        fef fefVar2 = fefVar;
        o2y0 o2y0Var = cVar.g;
        irs0 irs0Var = cVar.c;
        if (continuationImpl instanceof RideCardPaymentItemDataSource$paymentItemStateFlow$1) {
            rideCardPaymentItemDataSource$paymentItemStateFlow$1 = (RideCardPaymentItemDataSource$paymentItemStateFlow$1) continuationImpl;
            int i4 = rideCardPaymentItemDataSource$paymentItemStateFlow$1.label;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                rideCardPaymentItemDataSource$paymentItemStateFlow$1.label = i4 - Integer.MIN_VALUE;
                RideCardPaymentItemDataSource$paymentItemStateFlow$1 rideCardPaymentItemDataSource$paymentItemStateFlow$12 = rideCardPaymentItemDataSource$paymentItemStateFlow$1;
                Object obj = rideCardPaymentItemDataSource$paymentItemStateFlow$12.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = rideCardPaymentItemDataSource$paymentItemStateFlow$12.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    k2 k2Var2 = slotItemDto4.c;
                    String a = cVar.d.a(k2Var2 != null ? k2Var2.a() : null);
                    List list2 = list;
                    if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                        Iterator it = list2.iterator();
                        while (it.hasNext()) {
                            if (((e) it.next()).getA() == ChangeOrderState$Source.PAYMENT) {
                                k2Var = k2Var2;
                                r2 = 1;
                                break;
                            }
                        }
                    }
                    k2Var = k2Var2;
                    r2 = 0;
                    kdc a2 = ((ufu) cVar.e).a(new bdc(xng0.bgTransparent), rideCardItemDto$Payment.d);
                    boolean a3 = new wh70(o2y0Var.b()).a();
                    if (k2Var == null || a == null || evu0.J(a)) {
                        kdcVar = a2;
                        z = true;
                        z2 = a3;
                        TaxiOrder b = o2y0Var.b();
                        rideCardPaymentItemDataSource$paymentItemStateFlow$12.L$0 = rideCardItemDto$Payment;
                        rideCardPaymentItemDataSource$paymentItemStateFlow$12.L$1 = slotItemDto4;
                        rideCardPaymentItemDataSource$paymentItemStateFlow$12.L$2 = null;
                        rideCardPaymentItemDataSource$paymentItemStateFlow$12.L$3 = fefVar2;
                        rideCardPaymentItemDataSource$paymentItemStateFlow$12.L$4 = null;
                        rideCardPaymentItemDataSource$paymentItemStateFlow$12.L$5 = null;
                        rideCardPaymentItemDataSource$paymentItemStateFlow$12.L$6 = kdcVar;
                        rideCardPaymentItemDataSource$paymentItemStateFlow$12.I$0 = r2;
                        rideCardPaymentItemDataSource$paymentItemStateFlow$12.Z$0 = z2;
                        rideCardPaymentItemDataSource$paymentItemStateFlow$12.label = 2;
                        Object b2 = cVar.b(b, rideCardPaymentItemDataSource$paymentItemStateFlow$12);
                        if (b2 != coroutineSingletons) {
                            i2 = r2;
                            obj = b2;
                            rideCardItemDto$Payment2 = rideCardItemDto$Payment;
                            v8a0 v8a0Var2 = (v8a0) obj;
                            List list3 = slotItemDto4.d;
                            rideCardPaymentItemDataSource$paymentItemStateFlow$12.L$0 = rideCardItemDto$Payment2;
                            rideCardPaymentItemDataSource$paymentItemStateFlow$12.L$1 = slotItemDto4;
                            rideCardPaymentItemDataSource$paymentItemStateFlow$12.L$2 = null;
                            rideCardPaymentItemDataSource$paymentItemStateFlow$12.L$3 = null;
                            rideCardPaymentItemDataSource$paymentItemStateFlow$12.L$4 = null;
                            rideCardPaymentItemDataSource$paymentItemStateFlow$12.L$5 = null;
                            rideCardPaymentItemDataSource$paymentItemStateFlow$12.L$6 = kdcVar;
                            rideCardPaymentItemDataSource$paymentItemStateFlow$12.L$7 = v8a0Var2;
                            rideCardPaymentItemDataSource$paymentItemStateFlow$12.I$0 = i2;
                            rideCardPaymentItemDataSource$paymentItemStateFlow$12.Z$0 = z2;
                            rideCardPaymentItemDataSource$paymentItemStateFlow$12.label = 3;
                            k = ((com.yandex.go.slot.mapper.a) irs0Var).k(list3, fefVar2, rideCardPaymentItemDataSource$paymentItemStateFlow$12);
                            if (k != coroutineSingletons) {
                            }
                        }
                    } else {
                        xjk0 xjk0Var = cVar.b;
                        RideCardPaymentItemDataSource$paymentItemStateFlow$2 rideCardPaymentItemDataSource$paymentItemStateFlow$2 = new RideCardPaymentItemDataSource$paymentItemStateFlow$2(rideCardItemDto$Payment, r2, a2, a3, null);
                        rideCardPaymentItemDataSource$paymentItemStateFlow$12.L$0 = null;
                        rideCardPaymentItemDataSource$paymentItemStateFlow$12.L$1 = null;
                        rideCardPaymentItemDataSource$paymentItemStateFlow$12.L$2 = null;
                        rideCardPaymentItemDataSource$paymentItemStateFlow$12.L$3 = null;
                        rideCardPaymentItemDataSource$paymentItemStateFlow$12.L$4 = null;
                        rideCardPaymentItemDataSource$paymentItemStateFlow$12.L$5 = null;
                        rideCardPaymentItemDataSource$paymentItemStateFlow$12.L$6 = null;
                        rideCardPaymentItemDataSource$paymentItemStateFlow$12.I$0 = r2;
                        rideCardPaymentItemDataSource$paymentItemStateFlow$12.Z$0 = a3;
                        rideCardPaymentItemDataSource$paymentItemStateFlow$12.label = 1;
                        obj = xjk0Var.c(slotItemDto4, fefVar2, rideCardPaymentItemDataSource$paymentItemStateFlow$2, rideCardPaymentItemDataSource$paymentItemStateFlow$12);
                    }
                    return coroutineSingletons;
                }
                if (i == 1) {
                    kotlin.b.b(obj);
                    return (tpr) obj;
                }
                if (i == 2) {
                    z2 = rideCardPaymentItemDataSource$paymentItemStateFlow$12.Z$0;
                    i2 = rideCardPaymentItemDataSource$paymentItemStateFlow$12.I$0;
                    kdc kdcVar5 = (kdc) rideCardPaymentItemDataSource$paymentItemStateFlow$12.L$6;
                    fef fefVar3 = (fef) rideCardPaymentItemDataSource$paymentItemStateFlow$12.L$3;
                    SlotItemDto slotItemDto5 = (SlotItemDto) rideCardPaymentItemDataSource$paymentItemStateFlow$12.L$1;
                    rideCardItemDto$Payment2 = (RideCardItemDto$Payment) rideCardPaymentItemDataSource$paymentItemStateFlow$12.L$0;
                    kotlin.b.b(obj);
                    fefVar2 = fefVar3;
                    slotItemDto4 = slotItemDto5;
                    kdcVar = kdcVar5;
                    z = true;
                    v8a0 v8a0Var22 = (v8a0) obj;
                    List list32 = slotItemDto4.d;
                    rideCardPaymentItemDataSource$paymentItemStateFlow$12.L$0 = rideCardItemDto$Payment2;
                    rideCardPaymentItemDataSource$paymentItemStateFlow$12.L$1 = slotItemDto4;
                    rideCardPaymentItemDataSource$paymentItemStateFlow$12.L$2 = null;
                    rideCardPaymentItemDataSource$paymentItemStateFlow$12.L$3 = null;
                    rideCardPaymentItemDataSource$paymentItemStateFlow$12.L$4 = null;
                    rideCardPaymentItemDataSource$paymentItemStateFlow$12.L$5 = null;
                    rideCardPaymentItemDataSource$paymentItemStateFlow$12.L$6 = kdcVar;
                    rideCardPaymentItemDataSource$paymentItemStateFlow$12.L$7 = v8a0Var22;
                    rideCardPaymentItemDataSource$paymentItemStateFlow$12.I$0 = i2;
                    rideCardPaymentItemDataSource$paymentItemStateFlow$12.Z$0 = z2;
                    rideCardPaymentItemDataSource$paymentItemStateFlow$12.label = 3;
                    k = ((com.yandex.go.slot.mapper.a) irs0Var).k(list32, fefVar2, rideCardPaymentItemDataSource$paymentItemStateFlow$12);
                    if (k != coroutineSingletons) {
                        v8a0Var = v8a0Var22;
                        slotItemDto2 = slotItemDto4;
                        obj = k;
                        rideCardItemDto$Payment3 = rideCardItemDto$Payment2;
                        kdcVar2 = kdcVar;
                        css0 css0Var3 = (css0) obj;
                        if (z2) {
                        }
                    }
                    return coroutineSingletons;
                }
                if (i != 3) {
                    if (i != 4) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    i3 = rideCardPaymentItemDataSource$paymentItemStateFlow$12.I$0;
                    css0Var2 = (css0) rideCardPaymentItemDataSource$paymentItemStateFlow$12.L$8;
                    v8a0 v8a0Var3 = (v8a0) rideCardPaymentItemDataSource$paymentItemStateFlow$12.L$7;
                    kdcVar4 = (kdc) rideCardPaymentItemDataSource$paymentItemStateFlow$12.L$6;
                    slotItemDto3 = (SlotItemDto) rideCardPaymentItemDataSource$paymentItemStateFlow$12.L$1;
                    rideCardItemDto$Payment5 = (RideCardItemDto$Payment) rideCardPaymentItemDataSource$paymentItemStateFlow$12.L$0;
                    kotlin.b.b(obj);
                    v8a0Var = v8a0Var3;
                    z = true;
                    rss0Var = (tss0) obj;
                    css0Var = css0Var2;
                    kdcVar3 = kdcVar4;
                    slotItemDto2 = slotItemDto3;
                    rideCardItemDto$Payment4 = rideCardItemDto$Payment5;
                    i2 = i3;
                    lbk0 lbk0Var = cVar.f;
                    b2 b2Var = slotItemDto2.a;
                    irs0Var.getClass();
                    lbk0Var.getClass();
                    ibk0 b3 = lbk0.b(b2Var);
                    String str = rideCardItemDto$Payment4.a;
                    String str2 = rideCardItemDto$Payment4.b;
                    ((com.yandex.go.slot.mapper.a) irs0Var).f();
                    return new g92(2, new klk0(str, str2, new hlk0(v8a0Var), css0Var, rss0Var, b3, i2 != 0 ? z : false, kdcVar3));
                }
                z2 = rideCardPaymentItemDataSource$paymentItemStateFlow$12.Z$0;
                i2 = rideCardPaymentItemDataSource$paymentItemStateFlow$12.I$0;
                v8a0 v8a0Var4 = (v8a0) rideCardPaymentItemDataSource$paymentItemStateFlow$12.L$7;
                kdc kdcVar6 = (kdc) rideCardPaymentItemDataSource$paymentItemStateFlow$12.L$6;
                SlotItemDto slotItemDto6 = (SlotItemDto) rideCardPaymentItemDataSource$paymentItemStateFlow$12.L$1;
                RideCardItemDto$Payment rideCardItemDto$Payment6 = (RideCardItemDto$Payment) rideCardPaymentItemDataSource$paymentItemStateFlow$12.L$0;
                kotlin.b.b(obj);
                v8a0Var = v8a0Var4;
                kdcVar2 = kdcVar6;
                rideCardItemDto$Payment3 = rideCardItemDto$Payment6;
                z = true;
                slotItemDto2 = slotItemDto6;
                css0 css0Var32 = (css0) obj;
                if (z2) {
                    css0Var = css0Var32;
                    rss0Var = rss0.a;
                    kdcVar3 = kdcVar2;
                    rideCardItemDto$Payment4 = rideCardItemDto$Payment3;
                    lbk0 lbk0Var2 = cVar.f;
                    b2 b2Var2 = slotItemDto2.a;
                    irs0Var.getClass();
                    lbk0Var2.getClass();
                    ibk0 b32 = lbk0.b(b2Var2);
                    String str3 = rideCardItemDto$Payment4.a;
                    String str22 = rideCardItemDto$Payment4.b;
                    ((com.yandex.go.slot.mapper.a) irs0Var).f();
                    return new g92(2, new klk0(str3, str22, new hlk0(v8a0Var), css0Var, rss0Var, b32, i2 != 0 ? z : false, kdcVar3));
                }
                irs0 irs0Var2 = cVar.c;
                List list4 = slotItemDto2.e;
                lbk0 lbk0Var3 = cVar.f;
                rideCardPaymentItemDataSource$paymentItemStateFlow$12.L$0 = rideCardItemDto$Payment3;
                rideCardPaymentItemDataSource$paymentItemStateFlow$12.L$1 = slotItemDto2;
                rideCardPaymentItemDataSource$paymentItemStateFlow$12.L$2 = null;
                rideCardPaymentItemDataSource$paymentItemStateFlow$12.L$3 = null;
                rideCardPaymentItemDataSource$paymentItemStateFlow$12.L$4 = null;
                rideCardPaymentItemDataSource$paymentItemStateFlow$12.L$5 = null;
                rideCardPaymentItemDataSource$paymentItemStateFlow$12.L$6 = kdcVar2;
                rideCardPaymentItemDataSource$paymentItemStateFlow$12.L$7 = v8a0Var;
                rideCardPaymentItemDataSource$paymentItemStateFlow$12.L$8 = css0Var32;
                rideCardPaymentItemDataSource$paymentItemStateFlow$12.I$0 = i2;
                rideCardPaymentItemDataSource$paymentItemStateFlow$12.Z$0 = z2;
                rideCardPaymentItemDataSource$paymentItemStateFlow$12.label = 4;
                RideCardItemDto$Payment rideCardItemDto$Payment7 = rideCardItemDto$Payment3;
                Object b4 = irs0.b(irs0Var2, list4, lbk0Var3, false, rideCardPaymentItemDataSource$paymentItemStateFlow$12, 12);
                if (b4 != coroutineSingletons) {
                    rideCardItemDto$Payment5 = rideCardItemDto$Payment7;
                    i3 = i2;
                    slotItemDto3 = slotItemDto2;
                    css0Var2 = css0Var32;
                    obj = b4;
                    kdcVar4 = kdcVar2;
                    rss0Var = (tss0) obj;
                    css0Var = css0Var2;
                    kdcVar3 = kdcVar4;
                    slotItemDto2 = slotItemDto3;
                    rideCardItemDto$Payment4 = rideCardItemDto$Payment5;
                    i2 = i3;
                    lbk0 lbk0Var22 = cVar.f;
                    b2 b2Var22 = slotItemDto2.a;
                    irs0Var.getClass();
                    lbk0Var22.getClass();
                    ibk0 b322 = lbk0.b(b2Var22);
                    String str32 = rideCardItemDto$Payment4.a;
                    String str222 = rideCardItemDto$Payment4.b;
                    ((com.yandex.go.slot.mapper.a) irs0Var).f();
                    return new g92(2, new klk0(str32, str222, new hlk0(v8a0Var), css0Var, rss0Var, b322, i2 != 0 ? z : false, kdcVar3));
                }
                return coroutineSingletons;
            }
        }
        rideCardPaymentItemDataSource$paymentItemStateFlow$1 = new RideCardPaymentItemDataSource$paymentItemStateFlow$1(cVar, continuationImpl);
        RideCardPaymentItemDataSource$paymentItemStateFlow$1 rideCardPaymentItemDataSource$paymentItemStateFlow$122 = rideCardPaymentItemDataSource$paymentItemStateFlow$1;
        Object obj2 = rideCardPaymentItemDataSource$paymentItemStateFlow$122.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = rideCardPaymentItemDataSource$paymentItemStateFlow$122.label;
        if (i != 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(TaxiOrder taxiOrder, ContinuationImpl continuationImpl) {
        RideCardPaymentItemDataSource$getPaymentOption$1 rideCardPaymentItemDataSource$getPaymentOption$1;
        int i;
        if (continuationImpl instanceof RideCardPaymentItemDataSource$getPaymentOption$1) {
            rideCardPaymentItemDataSource$getPaymentOption$1 = (RideCardPaymentItemDataSource$getPaymentOption$1) continuationImpl;
            int i2 = rideCardPaymentItemDataSource$getPaymentOption$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                rideCardPaymentItemDataSource$getPaymentOption$1.label = i2 - Integer.MIN_VALUE;
                RideCardPaymentItemDataSource$getPaymentOption$1 rideCardPaymentItemDataSource$getPaymentOption$12 = rideCardPaymentItemDataSource$getPaymentOption$1;
                Object obj = rideCardPaymentItemDataSource$getPaymentOption$12.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = rideCardPaymentItemDataSource$getPaymentOption$12.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    lv90 lv90Var = taxiOrder.V().I;
                    PaymentMethod$Type paymentMethod$Type = lv90Var.a;
                    String str = lv90Var.b;
                    String str2 = taxiOrder.V().v;
                    BigDecimal h = str2 != null ? avu0.h(str2) : null;
                    ief iefVar = taxiOrder.V().K;
                    String str3 = iefVar != null ? iefVar.b : null;
                    rideCardPaymentItemDataSource$getPaymentOption$12.L$0 = null;
                    rideCardPaymentItemDataSource$getPaymentOption$12.L$1 = null;
                    rideCardPaymentItemDataSource$getPaymentOption$12.label = 1;
                    obj = ((ru.yandex.taxi.order.view.b) this.a).d(paymentMethod$Type, str, h, str3, rideCardPaymentItemDataSource$getPaymentOption$12);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                return (v8a0) obj;
            }
        }
        rideCardPaymentItemDataSource$getPaymentOption$1 = new RideCardPaymentItemDataSource$getPaymentOption$1(this, continuationImpl);
        RideCardPaymentItemDataSource$getPaymentOption$1 rideCardPaymentItemDataSource$getPaymentOption$122 = rideCardPaymentItemDataSource$getPaymentOption$1;
        Object obj2 = rideCardPaymentItemDataSource$getPaymentOption$122.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = rideCardPaymentItemDataSource$getPaymentOption$122.label;
        if (i != 0) {
        }
        return (v8a0) obj2;
    }

    public final tpr c(RideCardItemDto$Payment rideCardItemDto$Payment, tpr tprVar, fef fefVar) {
        SlotItemDto slotItemDto;
        boolean b = ijk0.b(rideCardItemDto$Payment);
        String str = rideCardItemDto$Payment.a;
        if (b && (slotItemDto = rideCardItemDto$Payment.c) != null) {
            return kotlinx.coroutines.flow.e.X(kotlinx.coroutines.flow.e.t(new m0(tprVar, kotlinx.coroutines.flow.e.t(new b(((com.yandex.go.payments.paymentlist.data.c) this.h).u)), new RideCardPaymentItemDataSource$stateFlow$2(3, null))), new RideCardPaymentItemDataSource$stateFlow$$inlined$flatMapLatest$1(null, this, rideCardItemDto$Payment, slotItemDto, fefVar));
        }
        return new g92(2, new yjk0(str));
    }
}
