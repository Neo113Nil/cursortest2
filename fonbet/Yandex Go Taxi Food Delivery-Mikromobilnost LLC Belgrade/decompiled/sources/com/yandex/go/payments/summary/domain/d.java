package com.yandex.go.payments.summary.domain;

import com.yandex.go.payments.domain.i0;
import com.yandex.go.payments.domain.k0;
import defpackage.jfa0;
import defpackage.jl40;
import defpackage.lea0;
import defpackage.lw90;
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
    public final k0 a;
    public final a b;
    public final i0 c;
    public final lw90 d;

    public d(k0 k0Var, a aVar, i0 i0Var, lw90 lw90Var) {
        this.a = k0Var;
        this.b = aVar;
        this.c = i0Var;
        this.d = lw90Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x00b0 -> B:10:0x00b3). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(d dVar, jfa0 jfa0Var, ContinuationImpl continuationImpl) {
        SummaryPaymentsListInteractor$filteredPaymentOptions$1 summaryPaymentsListInteractor$filteredPaymentOptions$1;
        int i;
        Iterator it;
        Collection collection;
        jfa0 jfa0Var2;
        dVar.getClass();
        if (continuationImpl instanceof SummaryPaymentsListInteractor$filteredPaymentOptions$1) {
            summaryPaymentsListInteractor$filteredPaymentOptions$1 = (SummaryPaymentsListInteractor$filteredPaymentOptions$1) continuationImpl;
            int i2 = summaryPaymentsListInteractor$filteredPaymentOptions$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                summaryPaymentsListInteractor$filteredPaymentOptions$1.label = i2 - Integer.MIN_VALUE;
                Object obj = summaryPaymentsListInteractor$filteredPaymentOptions$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = summaryPaymentsListInteractor$filteredPaymentOptions$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    List list = jfa0Var.a;
                    ArrayList arrayList = new ArrayList();
                    it = list.iterator();
                    collection = arrayList;
                    jfa0Var2 = jfa0Var;
                    if (it.hasNext()) {
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    jfa0Var = (jfa0) summaryPaymentsListInteractor$filteredPaymentOptions$1.L$8;
                    Object next = summaryPaymentsListInteractor$filteredPaymentOptions$1.L$5;
                    it = (Iterator) summaryPaymentsListInteractor$filteredPaymentOptions$1.L$4;
                    collection = (Collection) summaryPaymentsListInteractor$filteredPaymentOptions$1.L$3;
                    jfa0 jfa0Var3 = (jfa0) summaryPaymentsListInteractor$filteredPaymentOptions$1.L$0;
                    kotlin.b.b(obj);
                    if (((Boolean) obj).booleanValue()) {
                        collection.add(next);
                    }
                    jfa0Var2 = jfa0Var3;
                    if (it.hasNext()) {
                        next = it.next();
                        nea0 nea0Var = (nea0) next;
                        u0k u0kVar = nea0Var.a;
                        a aVar = dVar.b;
                        rhq0 rhq0Var = jfa0Var2.b;
                        boolean O = (rhq0Var != null && (u0kVar instanceof lea0)) ? vez0.O(rhq0Var.a.a, (lea0) u0kVar) : false;
                        boolean l = jl40.l(nea0Var.b, xw91.C);
                        summaryPaymentsListInteractor$filteredPaymentOptions$1.L$0 = jfa0Var2;
                        summaryPaymentsListInteractor$filteredPaymentOptions$1.L$1 = null;
                        summaryPaymentsListInteractor$filteredPaymentOptions$1.L$2 = null;
                        summaryPaymentsListInteractor$filteredPaymentOptions$1.L$3 = collection;
                        summaryPaymentsListInteractor$filteredPaymentOptions$1.L$4 = it;
                        summaryPaymentsListInteractor$filteredPaymentOptions$1.L$5 = next;
                        summaryPaymentsListInteractor$filteredPaymentOptions$1.L$6 = null;
                        summaryPaymentsListInteractor$filteredPaymentOptions$1.L$7 = null;
                        summaryPaymentsListInteractor$filteredPaymentOptions$1.L$8 = jfa0Var;
                        summaryPaymentsListInteractor$filteredPaymentOptions$1.label = 1;
                        Object a = aVar.a(u0kVar, O, l, summaryPaymentsListInteractor$filteredPaymentOptions$1);
                        if (a == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        jfa0Var3 = jfa0Var2;
                        obj = a;
                        if (((Boolean) obj).booleanValue()) {
                        }
                        jfa0Var2 = jfa0Var3;
                        if (it.hasNext()) {
                            return jfa0.a(jfa0Var, (List) collection, null, 6);
                        }
                    }
                }
            }
        }
        summaryPaymentsListInteractor$filteredPaymentOptions$1 = new SummaryPaymentsListInteractor$filteredPaymentOptions$1(dVar, continuationImpl);
        Object obj2 = summaryPaymentsListInteractor$filteredPaymentOptions$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = summaryPaymentsListInteractor$filteredPaymentOptions$1.label;
        if (i != 0) {
        }
    }
}
