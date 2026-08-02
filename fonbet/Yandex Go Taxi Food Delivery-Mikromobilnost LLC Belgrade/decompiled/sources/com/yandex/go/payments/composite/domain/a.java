package com.yandex.go.payments.composite.domain;

import defpackage.drd;
import defpackage.f731;
import defpackage.fl8;
import defpackage.jfa0;
import defpackage.jl40;
import defpackage.lea0;
import defpackage.mf0;
import defpackage.mj0;
import defpackage.na0;
import defpackage.nea0;
import defpackage.ny61;
import defpackage.paa0;
import defpackage.snr0;
import defpackage.u0k;
import defpackage.vpr;
import defpackage.xw91;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes13.dex */
public final class a implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ paa0 b;

    public a(vpr vprVar, paa0 paa0Var) {
        this.a = vprVar;
        this.b = paa0Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x009f, code lost:
    
        if (((defpackage.fl8) r8).h == false) goto L46;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00b0 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0049 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        PaymentMethodsForCompositeInteractor$optionsFlow$lambda$0$$inlined$map$1$2$1 paymentMethodsForCompositeInteractor$optionsFlow$lambda$0$$inlined$map$1$2$1;
        int i;
        boolean z;
        if (continuation instanceof PaymentMethodsForCompositeInteractor$optionsFlow$lambda$0$$inlined$map$1$2$1) {
            paymentMethodsForCompositeInteractor$optionsFlow$lambda$0$$inlined$map$1$2$1 = (PaymentMethodsForCompositeInteractor$optionsFlow$lambda$0$$inlined$map$1$2$1) continuation;
            int i2 = paymentMethodsForCompositeInteractor$optionsFlow$lambda$0$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                paymentMethodsForCompositeInteractor$optionsFlow$lambda$0$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = paymentMethodsForCompositeInteractor$optionsFlow$lambda$0$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = paymentMethodsForCompositeInteractor$optionsFlow$lambda$0$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    jfa0 jfa0Var = (jfa0) obj;
                    List list = jfa0Var.a;
                    ArrayList arrayList = new ArrayList();
                    for (Object obj3 : list) {
                        nea0 nea0Var = (nea0) obj3;
                        paa0 paa0Var = this.b;
                        paa0Var.getClass();
                        u0k u0kVar = nea0Var.a;
                        if (!(u0kVar instanceof na0) && !(u0kVar instanceof mj0) && !(u0kVar instanceof mf0)) {
                            if ((u0kVar instanceof lea0) && jl40.l(nea0Var.b, xw91.C)) {
                                drd drdVar = paa0Var.c;
                                lea0 lea0Var = (lea0) u0kVar;
                                if (drdVar.d(lea0Var.c()) && (!(u0kVar instanceof f731) || ((f731) u0kVar).a())) {
                                    if (!(lea0Var instanceof fl8)) {
                                        if (lea0Var instanceof snr0) {
                                            z = ((snr0) u0kVar).e;
                                            if (z) {
                                                arrayList.add(obj3);
                                            }
                                        }
                                    }
                                }
                            }
                            z = false;
                            if (z) {
                            }
                        }
                        z = true;
                        if (z) {
                        }
                    }
                    jfa0 a = jfa0.a(jfa0Var, arrayList, null, 6);
                    paymentMethodsForCompositeInteractor$optionsFlow$lambda$0$$inlined$map$1$2$1.L$0 = null;
                    paymentMethodsForCompositeInteractor$optionsFlow$lambda$0$$inlined$map$1$2$1.L$1 = null;
                    paymentMethodsForCompositeInteractor$optionsFlow$lambda$0$$inlined$map$1$2$1.L$2 = null;
                    paymentMethodsForCompositeInteractor$optionsFlow$lambda$0$$inlined$map$1$2$1.L$3 = null;
                    paymentMethodsForCompositeInteractor$optionsFlow$lambda$0$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(a, paymentMethodsForCompositeInteractor$optionsFlow$lambda$0$$inlined$map$1$2$1) == coroutineSingletons) {
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
        paymentMethodsForCompositeInteractor$optionsFlow$lambda$0$$inlined$map$1$2$1 = new PaymentMethodsForCompositeInteractor$optionsFlow$lambda$0$$inlined$map$1$2$1(this, continuation);
        Object obj22 = paymentMethodsForCompositeInteractor$optionsFlow$lambda$0$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = paymentMethodsForCompositeInteractor$optionsFlow$lambda$0$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
