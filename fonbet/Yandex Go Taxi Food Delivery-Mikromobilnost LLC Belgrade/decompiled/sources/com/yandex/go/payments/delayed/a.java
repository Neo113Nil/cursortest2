package com.yandex.go.payments.delayed;

import com.yandex.go.payments.domain.i0;
import com.yandex.go.payments.domain.k0;
import defpackage.edi0;
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
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes13.dex */
public final class a {
    public final k0 a;
    public final com.yandex.go.payments.summary.domain.a b;
    public final i0 c;
    public final lw90 d;

    public a(k0 k0Var, com.yandex.go.payments.summary.domain.a aVar, i0 i0Var, lw90 lw90Var) {
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
    public static final Object a(a aVar, jfa0 jfa0Var, ContinuationImpl continuationImpl) {
        ApplyOnConfirmPaymentListInteractorImpl$filteredPaymentOptions$1 applyOnConfirmPaymentListInteractorImpl$filteredPaymentOptions$1;
        int i;
        Iterator it;
        Collection collection;
        jfa0 jfa0Var2;
        aVar.getClass();
        if (continuationImpl instanceof ApplyOnConfirmPaymentListInteractorImpl$filteredPaymentOptions$1) {
            applyOnConfirmPaymentListInteractorImpl$filteredPaymentOptions$1 = (ApplyOnConfirmPaymentListInteractorImpl$filteredPaymentOptions$1) continuationImpl;
            int i2 = applyOnConfirmPaymentListInteractorImpl$filteredPaymentOptions$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                applyOnConfirmPaymentListInteractorImpl$filteredPaymentOptions$1.label = i2 - Integer.MIN_VALUE;
                Object obj = applyOnConfirmPaymentListInteractorImpl$filteredPaymentOptions$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = applyOnConfirmPaymentListInteractorImpl$filteredPaymentOptions$1.label;
                if (i != 0) {
                    b.b(obj);
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
                    jfa0Var = (jfa0) applyOnConfirmPaymentListInteractorImpl$filteredPaymentOptions$1.L$8;
                    Object next = applyOnConfirmPaymentListInteractorImpl$filteredPaymentOptions$1.L$5;
                    it = (Iterator) applyOnConfirmPaymentListInteractorImpl$filteredPaymentOptions$1.L$4;
                    collection = (Collection) applyOnConfirmPaymentListInteractorImpl$filteredPaymentOptions$1.L$3;
                    jfa0 jfa0Var3 = (jfa0) applyOnConfirmPaymentListInteractorImpl$filteredPaymentOptions$1.L$0;
                    b.b(obj);
                    if (((Boolean) obj).booleanValue()) {
                        collection.add(next);
                    }
                    jfa0Var2 = jfa0Var3;
                    if (it.hasNext()) {
                        next = it.next();
                        nea0 nea0Var = (nea0) next;
                        u0k u0kVar = nea0Var.a;
                        com.yandex.go.payments.summary.domain.a aVar2 = aVar.b;
                        rhq0 rhq0Var = jfa0Var2.b;
                        boolean O = (rhq0Var != null && (u0kVar instanceof lea0)) ? vez0.O(rhq0Var.a.a, (lea0) u0kVar) : false;
                        boolean l = jl40.l(nea0Var.b, xw91.C);
                        applyOnConfirmPaymentListInteractorImpl$filteredPaymentOptions$1.L$0 = jfa0Var2;
                        applyOnConfirmPaymentListInteractorImpl$filteredPaymentOptions$1.L$1 = null;
                        applyOnConfirmPaymentListInteractorImpl$filteredPaymentOptions$1.L$2 = null;
                        applyOnConfirmPaymentListInteractorImpl$filteredPaymentOptions$1.L$3 = collection;
                        applyOnConfirmPaymentListInteractorImpl$filteredPaymentOptions$1.L$4 = it;
                        applyOnConfirmPaymentListInteractorImpl$filteredPaymentOptions$1.L$5 = next;
                        applyOnConfirmPaymentListInteractorImpl$filteredPaymentOptions$1.L$6 = null;
                        applyOnConfirmPaymentListInteractorImpl$filteredPaymentOptions$1.L$7 = null;
                        applyOnConfirmPaymentListInteractorImpl$filteredPaymentOptions$1.L$8 = jfa0Var;
                        applyOnConfirmPaymentListInteractorImpl$filteredPaymentOptions$1.label = 1;
                        Object a = aVar2.a(u0kVar, O, l, applyOnConfirmPaymentListInteractorImpl$filteredPaymentOptions$1);
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
        applyOnConfirmPaymentListInteractorImpl$filteredPaymentOptions$1 = new ApplyOnConfirmPaymentListInteractorImpl$filteredPaymentOptions$1(aVar, continuationImpl);
        Object obj2 = applyOnConfirmPaymentListInteractorImpl$filteredPaymentOptions$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = applyOnConfirmPaymentListInteractorImpl$filteredPaymentOptions$1.label;
        if (i != 0) {
        }
    }

    public static edi0 b(jfa0 jfa0Var, lea0 lea0Var) {
        Object obj;
        if (lea0Var != null) {
            Iterator it = jfa0Var.a.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (jl40.l(((nea0) obj).a, lea0Var)) {
                    break;
                }
            }
            nea0 nea0Var = (nea0) obj;
            u0k u0kVar = nea0Var != null ? nea0Var.a : null;
            lea0 lea0Var2 = u0kVar instanceof lea0 ? (lea0) u0kVar : null;
            if (lea0Var2 != null) {
                return new edi0(lea0Var2, nea0Var.b);
            }
        }
        return null;
    }
}
