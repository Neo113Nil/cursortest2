package com.yandex.go.payments.delivery.domain;

import com.yandex.go.payments.domain.i0;
import com.yandex.go.payments.domain.k0;
import defpackage.bo5;
import defpackage.edi0;
import defpackage.jfa0;
import defpackage.jl40;
import defpackage.lea0;
import defpackage.lw90;
import defpackage.mii;
import defpackage.nea0;
import defpackage.ny61;
import defpackage.rhq0;
import defpackage.u0k;
import defpackage.vez0;
import defpackage.xw91;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes13.dex */
public final class d {
    public final i0 a;
    public final lw90 b;
    public final k0 c;
    public final bo5 d;

    public d(i0 i0Var, lw90 lw90Var, k0 k0Var, bo5 bo5Var) {
        this.a = i0Var;
        this.b = lw90Var;
        this.c = k0Var;
        this.d = bo5Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x00c0 -> B:10:0x00c5). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(d dVar, jfa0 jfa0Var, mii miiVar, ContinuationImpl continuationImpl) {
        DeliveryPaymentsListInteractor$filterOptions$1 deliveryPaymentsListInteractor$filterOptions$1;
        int i;
        lea0 lea0Var;
        mii miiVar2;
        Iterator it;
        Collection collection;
        edi0 edi0Var;
        dVar.getClass();
        if (continuationImpl instanceof DeliveryPaymentsListInteractor$filterOptions$1) {
            deliveryPaymentsListInteractor$filterOptions$1 = (DeliveryPaymentsListInteractor$filterOptions$1) continuationImpl;
            int i2 = deliveryPaymentsListInteractor$filterOptions$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                deliveryPaymentsListInteractor$filterOptions$1.label = i2 - Integer.MIN_VALUE;
                Object obj = deliveryPaymentsListInteractor$filterOptions$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = deliveryPaymentsListInteractor$filterOptions$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    rhq0 rhq0Var = jfa0Var.b;
                    lea0 lea0Var2 = (rhq0Var == null || (edi0Var = rhq0Var.a) == null) ? null : edi0Var.a;
                    List list = jfa0Var.a;
                    ArrayList arrayList = new ArrayList();
                    lea0Var = lea0Var2;
                    miiVar2 = miiVar;
                    it = list.iterator();
                    collection = arrayList;
                    if (it.hasNext()) {
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    Object obj2 = deliveryPaymentsListInteractor$filterOptions$1.L$7;
                    it = (Iterator) deliveryPaymentsListInteractor$filterOptions$1.L$6;
                    collection = (Collection) deliveryPaymentsListInteractor$filterOptions$1.L$5;
                    lea0Var = (lea0) deliveryPaymentsListInteractor$filterOptions$1.L$2;
                    mii miiVar3 = (mii) deliveryPaymentsListInteractor$filterOptions$1.L$1;
                    jfa0 jfa0Var2 = (jfa0) deliveryPaymentsListInteractor$filterOptions$1.L$0;
                    kotlin.b.b(obj);
                    if (((Boolean) obj).booleanValue()) {
                        collection.add(obj2);
                    }
                    miiVar2 = miiVar3;
                    jfa0Var = jfa0Var2;
                    if (it.hasNext()) {
                        Object next = it.next();
                        nea0 nea0Var = (nea0) next;
                        u0k u0kVar = nea0Var.a;
                        ?? r7 = ((u0kVar instanceof lea0) && vez0.O((lea0) u0kVar, lea0Var)) ? 1 : 0;
                        u0k u0kVar2 = nea0Var.a;
                        boolean l = jl40.l(nea0Var.b, xw91.C);
                        deliveryPaymentsListInteractor$filterOptions$1.L$0 = jfa0Var;
                        deliveryPaymentsListInteractor$filterOptions$1.L$1 = miiVar2;
                        deliveryPaymentsListInteractor$filterOptions$1.L$2 = lea0Var;
                        deliveryPaymentsListInteractor$filterOptions$1.L$3 = null;
                        deliveryPaymentsListInteractor$filterOptions$1.L$4 = null;
                        deliveryPaymentsListInteractor$filterOptions$1.L$5 = collection;
                        deliveryPaymentsListInteractor$filterOptions$1.L$6 = it;
                        deliveryPaymentsListInteractor$filterOptions$1.L$7 = next;
                        deliveryPaymentsListInteractor$filterOptions$1.L$8 = null;
                        deliveryPaymentsListInteractor$filterOptions$1.L$9 = null;
                        deliveryPaymentsListInteractor$filterOptions$1.I$0 = r7;
                        deliveryPaymentsListInteractor$filterOptions$1.label = 1;
                        Object a = miiVar2.a(u0kVar2, l, r7, deliveryPaymentsListInteractor$filterOptions$1);
                        if (a == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        miiVar3 = miiVar2;
                        obj = a;
                        jfa0Var2 = jfa0Var;
                        obj2 = next;
                        if (((Boolean) obj).booleanValue()) {
                        }
                        miiVar2 = miiVar3;
                        jfa0Var = jfa0Var2;
                        if (it.hasNext()) {
                            return jfa0.a(jfa0Var, (List) collection, null, 6);
                        }
                    }
                }
            }
        }
        deliveryPaymentsListInteractor$filterOptions$1 = new DeliveryPaymentsListInteractor$filterOptions$1(dVar, continuationImpl);
        Object obj3 = deliveryPaymentsListInteractor$filterOptions$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = deliveryPaymentsListInteractor$filterOptions$1.label;
        if (i != 0) {
        }
    }
}
