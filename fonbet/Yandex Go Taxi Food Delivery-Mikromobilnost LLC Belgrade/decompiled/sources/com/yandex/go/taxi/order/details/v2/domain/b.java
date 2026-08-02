package com.yandex.go.taxi.order.details.v2.domain;

import com.yandex.go.taxi.order.details.v2.state.RideCardState$ProcessingStep;
import defpackage.e6v;
import defpackage.fss0;
import defpackage.gss0;
import defpackage.ny61;
import defpackage.o8g0;
import defpackage.ogk0;
import defpackage.qnk0;
import defpackage.tcc;
import defpackage.tlk0;
import defpackage.vpr;
import defpackage.wik0;
import defpackage.xss0;
import defpackage.ygk0;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes14.dex */
public final class b implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ o8g0 b;

    public b(vpr vprVar, o8g0 o8g0Var) {
        this.a = vprVar;
        this.b = o8g0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        RideCardSharingInteractor$uiStateFlow$$inlined$map$1$2$1 rideCardSharingInteractor$uiStateFlow$$inlined$map$1$2$1;
        int i;
        Object obj2;
        if (continuation instanceof RideCardSharingInteractor$uiStateFlow$$inlined$map$1$2$1) {
            rideCardSharingInteractor$uiStateFlow$$inlined$map$1$2$1 = (RideCardSharingInteractor$uiStateFlow$$inlined$map$1$2$1) continuation;
            int i2 = rideCardSharingInteractor$uiStateFlow$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                rideCardSharingInteractor$uiStateFlow$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj3 = rideCardSharingInteractor$uiStateFlow$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = rideCardSharingInteractor$uiStateFlow$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj3);
                    qnk0 qnk0Var = (qnk0) obj;
                    this.b.getClass();
                    List<e6v> list = qnk0Var.a;
                    ArrayList arrayList = new ArrayList(tcc.n(list, 10));
                    for (e6v e6vVar : list) {
                        if (e6vVar instanceof wik0) {
                            wik0 wik0Var = (wik0) e6vVar;
                            xss0 xss0Var = wik0Var.c;
                            gss0 gss0Var = xss0Var.a;
                            if (gss0Var instanceof fss0) {
                                xss0Var = xss0.a(xss0Var, new fss0(((fss0) gss0Var).a, false), null, null, null, null, 30);
                            }
                            e6vVar = wik0.c(wik0Var, xss0Var);
                        } else if (e6vVar instanceof ygk0) {
                            e6vVar = ygk0.c((ygk0) e6vVar, null, null, null, null, 1023);
                        } else if (e6vVar instanceof tlk0) {
                            tlk0 tlk0Var = (tlk0) e6vVar;
                            e6vVar = new tlk0(tlk0Var.a, tlk0Var.b, tlk0Var.c, tlk0Var.d, tlk0Var.e, tlk0Var.f, true);
                        }
                        arrayList.add(e6vVar);
                    }
                    List list2 = qnk0Var.a;
                    ArrayList arrayList2 = new ArrayList();
                    for (Object obj4 : list2) {
                        if (obj4 instanceof ygk0) {
                            arrayList2.add(obj4);
                        }
                    }
                    Iterator it = arrayList2.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            obj2 = null;
                            break;
                        }
                        obj2 = it.next();
                        if (((ygk0) obj2).f == ogk0.b) {
                            break;
                        }
                    }
                    ygk0 ygk0Var = (ygk0) obj2;
                    RideCardState$ProcessingStep rideCardState$ProcessingStep = qnk0Var.b;
                    if (rideCardState$ProcessingStep == RideCardState$ProcessingStep.READY && ygk0Var != null) {
                        rideCardState$ProcessingStep = RideCardState$ProcessingStep.PROCESSING;
                    }
                    qnk0 a = qnk0.a(qnk0Var, arrayList, rideCardState$ProcessingStep, 28);
                    rideCardSharingInteractor$uiStateFlow$$inlined$map$1$2$1.L$0 = null;
                    rideCardSharingInteractor$uiStateFlow$$inlined$map$1$2$1.L$1 = null;
                    rideCardSharingInteractor$uiStateFlow$$inlined$map$1$2$1.L$2 = null;
                    rideCardSharingInteractor$uiStateFlow$$inlined$map$1$2$1.L$3 = null;
                    rideCardSharingInteractor$uiStateFlow$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(a, rideCardSharingInteractor$uiStateFlow$$inlined$map$1$2$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj3);
                }
                return zy11.a;
            }
        }
        rideCardSharingInteractor$uiStateFlow$$inlined$map$1$2$1 = new RideCardSharingInteractor$uiStateFlow$$inlined$map$1$2$1(this, continuation);
        Object obj32 = rideCardSharingInteractor$uiStateFlow$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = rideCardSharingInteractor$uiStateFlow$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
