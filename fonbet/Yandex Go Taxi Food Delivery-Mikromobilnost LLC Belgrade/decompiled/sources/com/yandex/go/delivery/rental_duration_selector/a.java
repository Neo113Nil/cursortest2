package com.yandex.go.delivery.rental_duration_selector;

import defpackage.ati;
import defpackage.c6z0;
import defpackage.e6z0;
import defpackage.emi;
import defpackage.fmi;
import defpackage.fnx0;
import defpackage.ny61;
import defpackage.tcc;
import defpackage.vpr;
import defpackage.zy11;
import java.util.ArrayList;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes12.dex */
public final class a implements vpr {
    public final /* synthetic */ vpr a;

    public a(vpr vprVar) {
        this.a = vprVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        DeliveryRentalDurationPresenter$special$$inlined$map$1$2$1 deliveryRentalDurationPresenter$special$$inlined$map$1$2$1;
        int i;
        e6z0 e6z0Var;
        fmi fmiVar;
        if (continuation instanceof DeliveryRentalDurationPresenter$special$$inlined$map$1$2$1) {
            deliveryRentalDurationPresenter$special$$inlined$map$1$2$1 = (DeliveryRentalDurationPresenter$special$$inlined$map$1$2$1) continuation;
            int i2 = deliveryRentalDurationPresenter$special$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                deliveryRentalDurationPresenter$special$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = deliveryRentalDurationPresenter$special$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = deliveryRentalDurationPresenter$special$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    Pair pair = (Pair) obj;
                    fnx0 fnx0Var = (fnx0) pair.getFirst();
                    boolean booleanValue = ((Boolean) pair.getSecond()).booleanValue();
                    ati atiVar = fnx0Var.c.Z;
                    if (atiVar == null || (fmiVar = atiVar.i) == null) {
                        e6z0Var = null;
                    } else {
                        ArrayList<emi> arrayList = fmiVar.a;
                        ArrayList arrayList2 = new ArrayList(tcc.n(arrayList, 10));
                        for (emi emiVar : arrayList) {
                            arrayList2.add(new c6z0(emiVar.a, emiVar.b));
                        }
                        e6z0Var = new e6z0(arrayList2, booleanValue);
                    }
                    deliveryRentalDurationPresenter$special$$inlined$map$1$2$1.L$0 = null;
                    deliveryRentalDurationPresenter$special$$inlined$map$1$2$1.L$1 = null;
                    deliveryRentalDurationPresenter$special$$inlined$map$1$2$1.L$2 = null;
                    deliveryRentalDurationPresenter$special$$inlined$map$1$2$1.L$3 = null;
                    deliveryRentalDurationPresenter$special$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(e6z0Var, deliveryRentalDurationPresenter$special$$inlined$map$1$2$1) == coroutineSingletons) {
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
        deliveryRentalDurationPresenter$special$$inlined$map$1$2$1 = new DeliveryRentalDurationPresenter$special$$inlined$map$1$2$1(this, continuation);
        Object obj22 = deliveryRentalDurationPresenter$special$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = deliveryRentalDurationPresenter$special$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
