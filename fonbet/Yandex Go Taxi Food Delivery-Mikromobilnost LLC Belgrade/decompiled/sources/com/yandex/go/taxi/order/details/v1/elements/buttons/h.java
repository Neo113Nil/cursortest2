package com.yandex.go.taxi.order.details.v1.elements.buttons;

import com.yandex.go.safety.center.experiment.SafetyCenterExperiment;
import com.yandex.go.taxi.order.experiments.orderdetails.OrderDetailsDriverExperiment;
import com.yandex.go.taxi.order.models.api.TaxiOrder;
import com.yandex.go.taxi.order.models.api.response.OrderDetailsCardResponse;
import com.yandex.go.taxi.order.models.api.response.OrderDetailsCardResponse$CardElement$Type;
import com.yandex.go.taxi.order.models.api.response.OrderStatusInfo;
import com.yandex.go.taxi.order.models.api.response.c2;
import defpackage.avj0;
import defpackage.ba80;
import defpackage.bmh;
import defpackage.f1h0;
import defpackage.g92;
import defpackage.gs70;
import defpackage.jqr;
import defpackage.kyh0;
import defpackage.n3h;
import defpackage.n4h0;
import defpackage.n4j;
import defpackage.ny61;
import defpackage.o2y0;
import defpackage.p4j;
import defpackage.qje;
import defpackage.scc;
import defpackage.spl0;
import defpackage.t4j;
import defpackage.tpr;
import defpackage.u4j;
import defpackage.v2y0;
import defpackage.vd00;
import defpackage.vng;
import defpackage.vpl0;
import defpackage.w4j;
import defpackage.x980;
import defpackage.xng0;
import defpackage.zuj0;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.m0;
import ru.yandex.taxi.object.DriveState;

/* loaded from: classes14.dex */
public final class h {
    public final com.yandex.go.taxi.order.state.h a;
    public final spl0 b;
    public final vd00 c;
    public final p4j d;
    public final x980 e;
    public final x980 f;
    public final v2y0 g;
    public final ba80 h;
    public final zuj0 i;
    public final o2y0 j;
    public final n3h k;

    public h(com.yandex.go.taxi.order.state.h hVar, spl0 spl0Var, gs70 gs70Var, vd00 vd00Var, p4j p4jVar, x980 x980Var, x980 x980Var2, v2y0 v2y0Var, ba80 ba80Var, zuj0 zuj0Var, o2y0 o2y0Var, n3h n3hVar) {
        this.a = hVar;
        this.b = spl0Var;
        this.c = vd00Var;
        this.d = p4jVar;
        this.e = x980Var;
        this.f = x980Var2;
        this.g = v2y0Var;
        this.h = ba80Var;
        this.i = zuj0Var;
        this.j = o2y0Var;
        this.k = n3hVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(TaxiOrder taxiOrder, ContinuationImpl continuationImpl) {
        DetailsCardBottomButtonsStateMapper$createShareButton$1 detailsCardBottomButtonsStateMapper$createShareButton$1;
        int i;
        int i2;
        Object y;
        String str;
        TaxiOrder taxiOrder2 = taxiOrder;
        if (continuationImpl instanceof DetailsCardBottomButtonsStateMapper$createShareButton$1) {
            detailsCardBottomButtonsStateMapper$createShareButton$1 = (DetailsCardBottomButtonsStateMapper$createShareButton$1) continuationImpl;
            int i3 = detailsCardBottomButtonsStateMapper$createShareButton$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                detailsCardBottomButtonsStateMapper$createShareButton$1.label = i3 - Integer.MIN_VALUE;
                Object obj = detailsCardBottomButtonsStateMapper$createShareButton$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = detailsCardBottomButtonsStateMapper$createShareButton$1.label;
                int i4 = 0;
                if (i != 0) {
                    kotlin.b.b(obj);
                    i2 = (taxiOrder2.h.b == DriveState.WAITING || taxiOrder2.h.b == DriveState.DRIVING) ? 1 : 0;
                    tpr a = this.h.a(this.j);
                    detailsCardBottomButtonsStateMapper$createShareButton$1.L$0 = taxiOrder2;
                    detailsCardBottomButtonsStateMapper$createShareButton$1.I$0 = i2;
                    detailsCardBottomButtonsStateMapper$createShareButton$1.label = 1;
                    y = kotlinx.coroutines.flow.e.y(a, detailsCardBottomButtonsStateMapper$createShareButton$1);
                    if (y == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    int i5 = detailsCardBottomButtonsStateMapper$createShareButton$1.I$0;
                    TaxiOrder taxiOrder3 = (TaxiOrder) detailsCardBottomButtonsStateMapper$createShareButton$1.L$0;
                    kotlin.b.b(obj);
                    i2 = i5;
                    taxiOrder2 = taxiOrder3;
                    y = obj;
                }
                if (((Boolean) y).booleanValue() || (str = taxiOrder2.V().B) == null || str.length() == 0 || i2 == 0) {
                    return null;
                }
                return new t4j(vng.t(n4h0.ic_share_ride, ((avj0) this.i).a), ((avj0) this.i).h(kyh0.order_options_share_route_v2), qje.t(xng0.textOnControlMinor, ((avj0) this.i).a), qje.t(xng0.controlMinor, ((avj0) this.i).a), ((avj0) this.i).h(kyh0.order_options_share_route), "ShareRoute", new n4j(this, i4), 144);
            }
        }
        detailsCardBottomButtonsStateMapper$createShareButton$1 = new DetailsCardBottomButtonsStateMapper$createShareButton$1(this, continuationImpl);
        Object obj2 = detailsCardBottomButtonsStateMapper$createShareButton$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = detailsCardBottomButtonsStateMapper$createShareButton$1.label;
        int i42 = 0;
        if (i != 0) {
        }
        if (((Boolean) y).booleanValue()) {
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(TaxiOrder taxiOrder, ContinuationImpl continuationImpl) {
        DetailsCardBottomButtonsStateMapper$map$1 detailsCardBottomButtonsStateMapper$map$1;
        int i;
        c2 c2Var;
        Object obj;
        Object a;
        Object[] objArr;
        int i2;
        List list;
        Object obj2;
        Object[] objArr2;
        TaxiOrder taxiOrder2 = taxiOrder;
        if (continuationImpl instanceof DetailsCardBottomButtonsStateMapper$map$1) {
            detailsCardBottomButtonsStateMapper$map$1 = (DetailsCardBottomButtonsStateMapper$map$1) continuationImpl;
            int i3 = detailsCardBottomButtonsStateMapper$map$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                detailsCardBottomButtonsStateMapper$map$1.label = i3 - Integer.MIN_VALUE;
                Object obj3 = detailsCardBottomButtonsStateMapper$map$1.result;
                Object obj4 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = detailsCardBottomButtonsStateMapper$map$1.label;
                int i4 = 1;
                if (i != 0) {
                    kotlin.b.b(obj3);
                    OrderDetailsDriverExperiment a2 = gs70.a(taxiOrder2);
                    DriveState driveState = taxiOrder2.h.b;
                    DriveState driveState2 = DriveState.COMPLETE;
                    int i5 = driveState == driveState2 ? 1 : 0;
                    boolean z = a2.b;
                    if (z && i5 != 0) {
                        return new g92(2, new w4j(EmptyList.a, false));
                    }
                    if (!z) {
                        return new g92(2, u4j.a);
                    }
                    Object[] objArr3 = new t4j[4];
                    OrderStatusInfo.TransportInfo transportInfo = taxiOrder2.V().t0;
                    DriveState driveState3 = taxiOrder2.h.b;
                    DriveState driveState4 = DriveState.SCHEDULING;
                    objArr3[0] = ((driveState3 == driveState4 || taxiOrder2.h.b == DriveState.SCHEDULED) && transportInfo != null) ? new t4j(vng.t(f1h0.ic_route_info, ((avj0) this.i).a), ((avj0) this.i).h(kyh0.transport_info_button_text), qje.t(xng0.textOnControl, ((avj0) this.i).a), qje.t(xng0.controlMain, ((avj0) this.i).a), ((avj0) this.i).h(kyh0.transport_info_button_text), "TransportInfo", new bmh(16, this, transportInfo), 144) : null;
                    spl0 spl0Var = this.b;
                    OrderStatusInfo V = taxiOrder2.V();
                    com.yandex.go.safety.center.b bVar = (com.yandex.go.safety.center.b) spl0Var;
                    SafetyCenterExperiment safetyCenterExperiment = (SafetyCenterExperiment) bVar.d.c();
                    bVar.c.getClass();
                    vpl0 a3 = bVar.a(V, safetyCenterExperiment, false);
                    objArr3[1] = (a3.a && (taxiOrder2.h.b == DriveState.DRIVING || taxiOrder2.h.b == DriveState.WAITING || taxiOrder2.h.b == driveState4 || taxiOrder2.h.b == DriveState.SCHEDULED || taxiOrder2.h.b == driveState2)) ? new t4j(vng.t(f1h0.ic_safety_center_24, ((avj0) this.i).a), a3.a(), qje.t(xng0.textOnControlMinor, ((avj0) this.i).a), qje.t(xng0.controlMinor, ((avj0) this.i).a), a3.a(), "SafetyCenter", new bmh(15, this, taxiOrder2), 144) : null;
                    zuj0 zuj0Var = this.i;
                    OrderDetailsCardResponse orderDetailsCardResponse = taxiOrder2.V().n0;
                    if (orderDetailsCardResponse == null || (list = orderDetailsCardResponse.a) == null) {
                        c2Var = null;
                    } else {
                        Iterator it = list.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                obj2 = null;
                                break;
                            }
                            obj2 = it.next();
                            if (((c2) obj2).a() == OrderDetailsCardResponse$CardElement$Type.CANCEL) {
                                break;
                            }
                        }
                        c2Var = (c2) obj2;
                    }
                    if (taxiOrder2.D() || c2Var != null) {
                        obj = null;
                    } else {
                        avj0 avj0Var = (avj0) zuj0Var;
                        obj = new t4j(vng.t(n4h0.ic_cancel_order, avj0Var.a), avj0Var.h(kyh0.order_cancel), qje.t(xng0.textOnControlMinor, avj0Var.a), qje.t(xng0.controlMinor, avj0Var.a), avj0Var.h(kyh0.order_cancel), "Cancel", new n4j(this, i4), 144);
                    }
                    objArr3[2] = obj;
                    detailsCardBottomButtonsStateMapper$map$1.L$0 = taxiOrder2;
                    detailsCardBottomButtonsStateMapper$map$1.L$1 = null;
                    detailsCardBottomButtonsStateMapper$map$1.L$2 = objArr3;
                    detailsCardBottomButtonsStateMapper$map$1.L$3 = objArr3;
                    detailsCardBottomButtonsStateMapper$map$1.I$0 = i5;
                    detailsCardBottomButtonsStateMapper$map$1.I$1 = 3;
                    detailsCardBottomButtonsStateMapper$map$1.label = 1;
                    a = a(taxiOrder2, detailsCardBottomButtonsStateMapper$map$1);
                    if (a == obj4) {
                        return obj4;
                    }
                    Object[] objArr4 = objArr3;
                    objArr = objArr4;
                    i2 = 3;
                    objArr2 = objArr4;
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    int i6 = detailsCardBottomButtonsStateMapper$map$1.I$1;
                    Object[] objArr5 = (t4j[]) detailsCardBottomButtonsStateMapper$map$1.L$3;
                    objArr = (t4j[]) detailsCardBottomButtonsStateMapper$map$1.L$2;
                    TaxiOrder taxiOrder3 = (TaxiOrder) detailsCardBottomButtonsStateMapper$map$1.L$0;
                    kotlin.b.b(obj3);
                    i2 = i6;
                    taxiOrder2 = taxiOrder3;
                    a = obj3;
                    objArr2 = objArr5;
                }
                objArr2[i2] = a;
                List g = scc.g(objArr);
                com.yandex.go.taxi.order.state.h hVar = this.a;
                return new g(new jqr(new e(new c(new m0(hVar.a(), hVar.e.a.a(), new DetailsCardBottomButtonsStateMapper$createMakeAnotherOrderButton$1(this, taxiOrder2, null)), g)), new DetailsCardBottomButtonsStateMapper$map$4(this, null), 3));
            }
        }
        detailsCardBottomButtonsStateMapper$map$1 = new DetailsCardBottomButtonsStateMapper$map$1(this, continuationImpl);
        Object obj32 = detailsCardBottomButtonsStateMapper$map$1.result;
        Object obj42 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = detailsCardBottomButtonsStateMapper$map$1.label;
        int i42 = 1;
        if (i != 0) {
        }
        objArr2[i2] = a;
        List g2 = scc.g(objArr);
        com.yandex.go.taxi.order.state.h hVar2 = this.a;
        return new g(new jqr(new e(new c(new m0(hVar2.a(), hVar2.e.a.a(), new DetailsCardBottomButtonsStateMapper$createMakeAnotherOrderButton$1(this, taxiOrder2, null)), g2)), new DetailsCardBottomButtonsStateMapper$map$4(this, null), 3));
    }
}
