package com.yandex.go.taxi.order.superapp.orders;

import com.yandex.go.taxi.order.models.api.response.OrderStatusInfo;
import defpackage.a741;
import defpackage.e741;
import defpackage.g741;
import defpackage.h741;
import defpackage.i501;
import defpackage.ly6;
import defpackage.n3j;
import defpackage.ny61;
import defpackage.o2y0;
import defpackage.q6y0;
import defpackage.v7y0;
import defpackage.vpr;
import defpackage.y641;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes8.dex */
public final class t implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ v b;

    public t(vpr vprVar, v vVar) {
        this.a = vprVar;
        this.b = vVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /* JADX WARN: Type inference failed for: r15v0, types: [v7y0] */
    /* JADX WARN: Type inference failed for: r7v2, types: [q6y0] */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        TaxiOrderFlowTrackingSourceRepository$trackingsFlow$$inlined$map$2$2$1 taxiOrderFlowTrackingSourceRepository$trackingsFlow$$inlined$map$2$2$1;
        int i;
        ly6 a;
        if (continuation instanceof TaxiOrderFlowTrackingSourceRepository$trackingsFlow$$inlined$map$2$2$1) {
            taxiOrderFlowTrackingSourceRepository$trackingsFlow$$inlined$map$2$2$1 = (TaxiOrderFlowTrackingSourceRepository$trackingsFlow$$inlined$map$2$2$1) continuation;
            int i2 = taxiOrderFlowTrackingSourceRepository$trackingsFlow$$inlined$map$2$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                taxiOrderFlowTrackingSourceRepository$trackingsFlow$$inlined$map$2$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = taxiOrderFlowTrackingSourceRepository$trackingsFlow$$inlined$map$2$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = taxiOrderFlowTrackingSourceRepository$trackingsFlow$$inlined$map$2$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    vpr vprVar = this.a;
                    ru.yandex.taxi.altpins.order.p pVar = (ru.yandex.taxi.altpins.order.p) ((y641) this.b.h.get());
                    pVar.getClass();
                    ArrayList arrayList = new ArrayList();
                    Iterator it = ((List) obj).iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        ?? r7 = (q6y0) it.next();
                        OrderStatusInfo.AlternativeDestination alternativeDestination = r7.y().b().V().j0;
                        OrderStatusInfo.AlternativeDestination.InfoBlock f = alternativeDestination != null ? alternativeDestination.getF() : null;
                        boolean e = ru.yandex.taxi.altpins.order.p.e(r7.y().b());
                        if (f == null || !r7.y().b().l.getY()) {
                            r13 = r7;
                        } else if (e) {
                            i501 q = r7.q();
                            o2y0 y = r7.y();
                            long B = r7.B();
                            a741 a741Var = new a741(f.getA(), f.getB(), pVar.a(f.getC(), n3j.b), f.getD(), null);
                            String a2 = r7.a();
                            OrderStatusInfo.AlternativeDestination.InfoBlock f2 = alternativeDestination.getF();
                            OrderStatusInfo.AlternativeDestination.DetailScreen e2 = f2 != null ? f2.getE() : null;
                            r13 = new v7y0(q, y, B, a741Var, new h741(a2, f2 != null ? new g741(f2.getA(), f2.getB(), (e2 == null || (a = e2.getA()) == null) ? null : pVar.a(a, e741.a)) : null));
                        }
                        if (r13 != null) {
                            arrayList.add(r13);
                        }
                    }
                    taxiOrderFlowTrackingSourceRepository$trackingsFlow$$inlined$map$2$2$1.L$0 = null;
                    taxiOrderFlowTrackingSourceRepository$trackingsFlow$$inlined$map$2$2$1.L$1 = null;
                    taxiOrderFlowTrackingSourceRepository$trackingsFlow$$inlined$map$2$2$1.L$2 = null;
                    taxiOrderFlowTrackingSourceRepository$trackingsFlow$$inlined$map$2$2$1.L$3 = null;
                    taxiOrderFlowTrackingSourceRepository$trackingsFlow$$inlined$map$2$2$1.label = 1;
                    if (vprVar.emit(arrayList, taxiOrderFlowTrackingSourceRepository$trackingsFlow$$inlined$map$2$2$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj2);
                }
                return zy11.a;
            }
        }
        taxiOrderFlowTrackingSourceRepository$trackingsFlow$$inlined$map$2$2$1 = new TaxiOrderFlowTrackingSourceRepository$trackingsFlow$$inlined$map$2$2$1(this, continuation);
        Object obj22 = taxiOrderFlowTrackingSourceRepository$trackingsFlow$$inlined$map$2$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = taxiOrderFlowTrackingSourceRepository$trackingsFlow$$inlined$map$2$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
