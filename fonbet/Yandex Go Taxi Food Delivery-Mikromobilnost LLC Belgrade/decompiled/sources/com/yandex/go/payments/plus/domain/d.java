package com.yandex.go.payments.plus.domain;

import defpackage.ajd0;
import defpackage.fl8;
import defpackage.lea0;
import defpackage.na0;
import defpackage.ny61;
import defpackage.oea0;
import defpackage.vi0;
import defpackage.vpr;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes13.dex */
public final class d implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ ajd0 b;

    public d(vpr vprVar, ajd0 ajd0Var) {
        this.a = vprVar;
        this.b = ajd0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        PlusPurchasePaymentsInteractor$optionsFlow$lambda$0$$inlined$map$1$2$1 plusPurchasePaymentsInteractor$optionsFlow$lambda$0$$inlined$map$1$2$1;
        int i;
        if (continuation instanceof PlusPurchasePaymentsInteractor$optionsFlow$lambda$0$$inlined$map$1$2$1) {
            plusPurchasePaymentsInteractor$optionsFlow$lambda$0$$inlined$map$1$2$1 = (PlusPurchasePaymentsInteractor$optionsFlow$lambda$0$$inlined$map$1$2$1) continuation;
            int i2 = plusPurchasePaymentsInteractor$optionsFlow$lambda$0$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                plusPurchasePaymentsInteractor$optionsFlow$lambda$0$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = plusPurchasePaymentsInteractor$optionsFlow$lambda$0$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = plusPurchasePaymentsInteractor$optionsFlow$lambda$0$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    oea0 oea0Var = (oea0) obj;
                    this.b.getClass();
                    List list = oea0Var.a;
                    ArrayList arrayList = new ArrayList();
                    for (Object obj3 : list) {
                        lea0 lea0Var = (lea0) obj3;
                        if ((lea0Var instanceof fl8) && ((fl8) lea0Var).c) {
                            arrayList.add(obj3);
                        }
                    }
                    List list2 = oea0Var.b;
                    ArrayList arrayList2 = new ArrayList();
                    for (Object obj4 : list2) {
                        if (((vi0) obj4) instanceof na0) {
                            arrayList2.add(obj4);
                        }
                    }
                    oea0 oea0Var2 = new oea0(arrayList, arrayList2, oea0Var.c, oea0Var.d);
                    plusPurchasePaymentsInteractor$optionsFlow$lambda$0$$inlined$map$1$2$1.L$0 = null;
                    plusPurchasePaymentsInteractor$optionsFlow$lambda$0$$inlined$map$1$2$1.L$1 = null;
                    plusPurchasePaymentsInteractor$optionsFlow$lambda$0$$inlined$map$1$2$1.L$2 = null;
                    plusPurchasePaymentsInteractor$optionsFlow$lambda$0$$inlined$map$1$2$1.L$3 = null;
                    plusPurchasePaymentsInteractor$optionsFlow$lambda$0$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(oea0Var2, plusPurchasePaymentsInteractor$optionsFlow$lambda$0$$inlined$map$1$2$1) == coroutineSingletons) {
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
        plusPurchasePaymentsInteractor$optionsFlow$lambda$0$$inlined$map$1$2$1 = new PlusPurchasePaymentsInteractor$optionsFlow$lambda$0$$inlined$map$1$2$1(this, continuation);
        Object obj22 = plusPurchasePaymentsInteractor$optionsFlow$lambda$0$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = plusPurchasePaymentsInteractor$optionsFlow$lambda$0$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
