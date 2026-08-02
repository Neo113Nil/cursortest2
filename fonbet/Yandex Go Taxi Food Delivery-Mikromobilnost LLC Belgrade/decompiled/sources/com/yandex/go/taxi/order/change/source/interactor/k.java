package com.yandex.go.taxi.order.change.source.interactor;

import com.yandex.go.taxi.order.models.api.response.ModalItemDto$DefaultItem;
import com.yandex.go.taxi.order.models.api.response.ModalItemDto$StepsInstructionsItem;
import com.yandex.go.taxi.order.models.api.response.OrderStatusInfo;
import com.yandex.go.taxi.order.models.api.response.u0;
import com.yandex.go.taxi.order.promotions.analytics.OrderPickupPointAnalytics$OrderStatus;
import com.yandex.go.taxi.order.provider.c0;
import defpackage.f8k0;
import defpackage.g380;
import defpackage.g6u;
import defpackage.g8k0;
import defpackage.h380;
import defpackage.h670;
import defpackage.hxx0;
import defpackage.i380;
import defpackage.iqb0;
import defpackage.ixx0;
import defpackage.jl40;
import defpackage.jsq0;
import defpackage.l380;
import defpackage.m480;
import defpackage.n8e0;
import defpackage.ny61;
import defpackage.o2y0;
import defpackage.o400;
import defpackage.o8s0;
import defpackage.oep0;
import defpackage.ph70;
import defpackage.sjh;
import defpackage.tcc;
import defpackage.tje;
import defpackage.tt2;
import defpackage.usc;
import defpackage.uyj;
import defpackage.w511;
import defpackage.yvf0;
import defpackage.zau0;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.cprocsp.ACSP.tools.common.ACSPConstants;
import ru.yandex.taxi.communications.modal.analytics.CommunicationModalAnalyticsData$ModalType;
import ru.yandex.taxi.communications.modal.analytics.CommunicationModalAnalyticsData$RideOpenReason;
import ru.yandex.taxi.communications.model.CommunicationItem;
import ru.yandex.taxi.object.DriveState;

/* loaded from: classes14.dex */
public final class k {
    public final o2y0 a;
    public final com.yandex.go.taxi.order.popup.b b;
    public final ixx0 c;
    public final ph70 d;
    public final i380 e;
    public final yvf0 f;
    public final oep0 g;
    public final tt2 h;

    public k(o2y0 o2y0Var, com.yandex.go.taxi.order.popup.b bVar, ixx0 ixx0Var, ph70 ph70Var, i380 i380Var, yvf0 yvf0Var, oep0 oep0Var, tt2 tt2Var) {
        this.a = o2y0Var;
        this.b = bVar;
        this.c = ixx0Var;
        this.d = ph70Var;
        this.e = i380Var;
        this.f = yvf0Var;
        this.g = oep0Var;
        this.h = tt2Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x00ad, code lost:
    
        if (r10 == r1) goto L45;
     */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(l380 l380Var, ContinuationImpl continuationImpl) {
        OrderPickupPointClickInteractor$handlePickupPointClick$1 orderPickupPointClickInteractor$handlePickupPointClick$1;
        int i;
        hxx0 hxx0Var;
        iqb0 iqb0Var;
        if (continuationImpl instanceof OrderPickupPointClickInteractor$handlePickupPointClick$1) {
            orderPickupPointClickInteractor$handlePickupPointClick$1 = (OrderPickupPointClickInteractor$handlePickupPointClick$1) continuationImpl;
            int i2 = orderPickupPointClickInteractor$handlePickupPointClick$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                orderPickupPointClickInteractor$handlePickupPointClick$1.label = i2 - Integer.MIN_VALUE;
                Object obj = orderPickupPointClickInteractor$handlePickupPointClick$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = orderPickupPointClickInteractor$handlePickupPointClick$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    h380 h380Var = OrderPickupPointAnalytics$OrderStatus.Companion;
                    DriveState driveState = this.a.b().h.b;
                    h380Var.getClass();
                    int i3 = g380.a[driveState.ordinal()];
                    OrderPickupPointAnalytics$OrderStatus orderPickupPointAnalytics$OrderStatus = i3 != 1 ? i3 != 2 ? i3 != 3 ? null : OrderPickupPointAnalytics$OrderStatus.WAITING : OrderPickupPointAnalytics$OrderStatus.DRIVING : OrderPickupPointAnalytics$OrderStatus.SEARCH;
                    if (orderPickupPointAnalytics$OrderStatus != null) {
                        i380 i380Var = this.e;
                        String str = l380Var.a;
                        g8k0 g8k0Var = i380Var.a;
                        String value = orderPickupPointAnalytics$OrderStatus.getValue();
                        f8k0 f8k0Var = g8k0Var.a;
                        f8k0Var.getClass();
                        HashMap hashMap = new HashMap();
                        hashMap.put("type", str);
                        hashMap.put(ACSPConstants.STATUS, value);
                        f8k0Var.a.a("Ride.PickupPointPin.Notification.Tap", hashMap, 1, new HashMap());
                    }
                    c0 a = this.c.a(this.a);
                    orderPickupPointClickInteractor$handlePickupPointClick$1.L$0 = null;
                    orderPickupPointClickInteractor$handlePickupPointClick$1.label = 1;
                    obj = kotlinx.coroutines.flow.e.A(a, orderPickupPointClickInteractor$handlePickupPointClick$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj);
                        return obj;
                    }
                    kotlin.b.b(obj);
                }
                hxx0Var = (hxx0) obj;
                h670 h670Var = (hxx0Var != null || (iqb0Var = hxx0Var.e) == null) ? null : iqb0Var.e;
                if (hxx0Var != null || h670Var == null) {
                    return zy11.a;
                }
                if (!(h670Var instanceof h670)) {
                    w511.b();
                    return null;
                }
                String str2 = h670Var.a;
                orderPickupPointClickInteractor$handlePickupPointClick$1.L$0 = null;
                orderPickupPointClickInteractor$handlePickupPointClick$1.L$1 = null;
                orderPickupPointClickInteractor$handlePickupPointClick$1.L$2 = null;
                orderPickupPointClickInteractor$handlePickupPointClick$1.label = 2;
                Object b = b(hxx0Var, str2, orderPickupPointClickInteractor$handlePickupPointClick$1);
                return b == obj2 ? obj2 : b;
            }
        }
        orderPickupPointClickInteractor$handlePickupPointClick$1 = new OrderPickupPointClickInteractor$handlePickupPointClick$1(this, continuationImpl);
        Object obj3 = orderPickupPointClickInteractor$handlePickupPointClick$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = orderPickupPointClickInteractor$handlePickupPointClick$1.label;
        if (i != 0) {
        }
        hxx0Var = (hxx0) obj3;
        if (hxx0Var != null) {
        }
        if (hxx0Var != null) {
        }
        return zy11.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x0104, code lost:
    
        if (r13 == r1) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0165, code lost:
    
        if (r13 == r1) goto L60;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0188 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(hxx0 hxx0Var, String str, ContinuationImpl continuationImpl) {
        OrderPickupPointClickInteractor$openModal$1 orderPickupPointClickInteractor$openModal$1;
        int i;
        Object obj;
        u0 u0Var;
        if (continuationImpl instanceof OrderPickupPointClickInteractor$openModal$1) {
            orderPickupPointClickInteractor$openModal$1 = (OrderPickupPointClickInteractor$openModal$1) continuationImpl;
            int i2 = orderPickupPointClickInteractor$openModal$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                orderPickupPointClickInteractor$openModal$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = orderPickupPointClickInteractor$openModal$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = orderPickupPointClickInteractor$openModal$1.label;
                tt2 tt2Var = this.h;
                zy11 zy11Var = zy11.a;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    List list = hxx0Var.f;
                    ArrayList arrayList = new ArrayList(tcc.n(list, 10));
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        arrayList.add(((OrderStatusInfo.Modal) it.next()).a);
                    }
                    Iterator it2 = arrayList.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            obj = null;
                            break;
                        }
                        obj = it2.next();
                        if (jl40.l(((u0) obj).getA(), str)) {
                            break;
                        }
                    }
                    u0Var = (u0) obj;
                    if (u0Var != null) {
                        jsq0 c = u0Var.getC();
                        o8s0 d = (c == null || !c.contains(CommunicationItem.DisplayOnType.RIDE_CUSTOM)) ? u0Var.getD() : new o8s0(15);
                        if (u0Var instanceof ModalItemDto$DefaultItem) {
                            tt2Var.getClass();
                            sjh sjhVar = uyj.a;
                            OrderPickupPointClickInteractor$openModal$popupModalState$1 orderPickupPointClickInteractor$openModal$popupModalState$1 = new OrderPickupPointClickInteractor$openModal$popupModalState$1(this, u0Var, d, null);
                            orderPickupPointClickInteractor$openModal$1.L$0 = null;
                            orderPickupPointClickInteractor$openModal$1.L$1 = null;
                            orderPickupPointClickInteractor$openModal$1.L$2 = u0Var;
                            orderPickupPointClickInteractor$openModal$1.L$3 = null;
                            orderPickupPointClickInteractor$openModal$1.label = 1;
                            obj2 = tje.k0(sjhVar, orderPickupPointClickInteractor$openModal$popupModalState$1, orderPickupPointClickInteractor$openModal$1);
                        } else if (u0Var instanceof ModalItemDto$StepsInstructionsItem) {
                            tt2Var.getClass();
                            sjh sjhVar2 = uyj.a;
                            OrderPickupPointClickInteractor$openModal$payload$1 orderPickupPointClickInteractor$openModal$payload$1 = new OrderPickupPointClickInteractor$openModal$payload$1(this, u0Var, null);
                            orderPickupPointClickInteractor$openModal$1.L$0 = null;
                            orderPickupPointClickInteractor$openModal$1.L$1 = null;
                            orderPickupPointClickInteractor$openModal$1.L$2 = null;
                            orderPickupPointClickInteractor$openModal$1.L$3 = null;
                            orderPickupPointClickInteractor$openModal$1.label = 3;
                            obj2 = tje.k0(sjhVar2, orderPickupPointClickInteractor$openModal$payload$1, orderPickupPointClickInteractor$openModal$1);
                        }
                    }
                }
                if (i == 1) {
                    u0Var = (u0) orderPickupPointClickInteractor$openModal$1.L$2;
                    kotlin.b.b(obj2);
                    n8e0 n8e0Var = (n8e0) obj2;
                    if (n8e0Var != null) {
                        m480 m480Var = new m480(n8e0Var, new usc(((ModalItemDto$DefaultItem) u0Var).a, CommunicationModalAnalyticsData$ModalType.DEFAULT, this.a.b().a, CommunicationModalAnalyticsData$RideOpenReason.PIN_TAP));
                        tt2Var.getClass();
                        sjh sjhVar3 = uyj.a;
                        g6u g6uVar = o400.a;
                        OrderPickupPointClickInteractor$openModal$2 orderPickupPointClickInteractor$openModal$2 = new OrderPickupPointClickInteractor$openModal$2(this, m480Var, null);
                        orderPickupPointClickInteractor$openModal$1.L$0 = null;
                        orderPickupPointClickInteractor$openModal$1.L$1 = null;
                        orderPickupPointClickInteractor$openModal$1.L$2 = null;
                        orderPickupPointClickInteractor$openModal$1.L$3 = null;
                        orderPickupPointClickInteractor$openModal$1.L$4 = null;
                        orderPickupPointClickInteractor$openModal$1.L$5 = null;
                        orderPickupPointClickInteractor$openModal$1.label = 2;
                        if (tje.k0(g6uVar, orderPickupPointClickInteractor$openModal$2, orderPickupPointClickInteractor$openModal$1) == coroutineSingletons) {
                        }
                    }
                }
                if (i == 2) {
                } else {
                    if (i == 3) {
                        kotlin.b.b(obj2);
                        tt2Var.getClass();
                        sjh sjhVar4 = uyj.a;
                        g6u g6uVar2 = o400.a;
                        OrderPickupPointClickInteractor$openModal$3 orderPickupPointClickInteractor$openModal$3 = new OrderPickupPointClickInteractor$openModal$3(this, (zau0) obj2, null);
                        orderPickupPointClickInteractor$openModal$1.L$0 = null;
                        orderPickupPointClickInteractor$openModal$1.L$1 = null;
                        orderPickupPointClickInteractor$openModal$1.L$2 = null;
                        orderPickupPointClickInteractor$openModal$1.L$3 = null;
                        orderPickupPointClickInteractor$openModal$1.L$4 = null;
                        orderPickupPointClickInteractor$openModal$1.label = 4;
                        return tje.k0(g6uVar2, orderPickupPointClickInteractor$openModal$3, orderPickupPointClickInteractor$openModal$1) == coroutineSingletons ? coroutineSingletons : zy11Var;
                    }
                    if (i != 4) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                }
                kotlin.b.b(obj2);
                return zy11Var;
            }
        }
        orderPickupPointClickInteractor$openModal$1 = new OrderPickupPointClickInteractor$openModal$1(this, continuationImpl);
        Object obj22 = orderPickupPointClickInteractor$openModal$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = orderPickupPointClickInteractor$openModal$1.label;
        tt2 tt2Var2 = this.h;
        zy11 zy11Var2 = zy11.a;
        if (i != 0) {
        }
    }
}
