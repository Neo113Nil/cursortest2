package com.yandex.go.delivery.rental_duration_selector;

import defpackage.ati;
import defpackage.fmi;
import defpackage.fnx0;
import defpackage.izi0;
import defpackage.kzi0;
import defpackage.lze;
import defpackage.ny61;
import defpackage.tcc;
import defpackage.vpr;
import defpackage.x0f;
import defpackage.zy11;
import java.util.ArrayList;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes12.dex */
public final class c implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ e b;

    public c(vpr vprVar, e eVar) {
        this.a = vprVar;
        this.b = eVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v3, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r5v4, types: [java.util.ArrayList] */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        DeliveryRentalDurationPresenter$special$$inlined$map$2$2$1 deliveryRentalDurationPresenter$special$$inlined$map$2$2$1;
        int i;
        ?? r5;
        if (continuation instanceof DeliveryRentalDurationPresenter$special$$inlined$map$2$2$1) {
            deliveryRentalDurationPresenter$special$$inlined$map$2$2$1 = (DeliveryRentalDurationPresenter$special$$inlined$map$2$2$1) continuation;
            int i2 = deliveryRentalDurationPresenter$special$$inlined$map$2$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                deliveryRentalDurationPresenter$special$$inlined$map$2$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = deliveryRentalDurationPresenter$special$$inlined$map$2$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = deliveryRentalDurationPresenter$special$$inlined$map$2$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    ati atiVar = ((fnx0) obj).c.Z;
                    fmi fmiVar = atiVar != null ? atiVar.i : null;
                    String str = ((izi0) this.b.B.getValue()).b.a;
                    String str2 = fmiVar != null ? fmiVar.c : null;
                    if (fmiVar != null) {
                        ArrayList<x0f> arrayList = fmiVar.b;
                        r5 = new ArrayList(tcc.n(arrayList, 10));
                        for (x0f x0fVar : arrayList) {
                            r5.add(new kzi0(x0fVar.a, x0fVar.b));
                        }
                    } else {
                        r5 = 0;
                    }
                    if (r5 == 0) {
                        r5 = EmptyList.a;
                    }
                    lze lzeVar = new lze(str, str2, r5);
                    deliveryRentalDurationPresenter$special$$inlined$map$2$2$1.L$0 = null;
                    deliveryRentalDurationPresenter$special$$inlined$map$2$2$1.L$1 = null;
                    deliveryRentalDurationPresenter$special$$inlined$map$2$2$1.L$2 = null;
                    deliveryRentalDurationPresenter$special$$inlined$map$2$2$1.L$3 = null;
                    deliveryRentalDurationPresenter$special$$inlined$map$2$2$1.label = 1;
                    if (this.a.emit(lzeVar, deliveryRentalDurationPresenter$special$$inlined$map$2$2$1) == coroutineSingletons) {
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
        deliveryRentalDurationPresenter$special$$inlined$map$2$2$1 = new DeliveryRentalDurationPresenter$special$$inlined$map$2$2$1(this, continuation);
        Object obj22 = deliveryRentalDurationPresenter$special$$inlined$map$2$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = deliveryRentalDurationPresenter$special$$inlined$map$2$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
