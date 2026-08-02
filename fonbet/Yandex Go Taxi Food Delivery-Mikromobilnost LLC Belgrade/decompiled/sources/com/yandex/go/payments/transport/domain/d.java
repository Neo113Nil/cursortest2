package com.yandex.go.payments.transport.domain;

import com.yandex.go.payments.domain.i0;
import com.yandex.go.payments.domain.k0;
import defpackage.jfa0;
import defpackage.lw90;
import defpackage.nea0;
import defpackage.ny61;
import defpackage.u0k;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes13.dex */
public final class d {
    public final e a;
    public final k0 b;
    public final i0 c;
    public final lw90 d;

    public d(e eVar, k0 k0Var, i0 i0Var, lw90 lw90Var) {
        this.a = eVar;
        this.b = k0Var;
        this.c = i0Var;
        this.d = lw90Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x0088 -> B:10:0x008b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(d dVar, jfa0 jfa0Var, ContinuationImpl continuationImpl) {
        TransportPaymentListInteractor$filteredPaymentOptions$1 transportPaymentListInteractor$filteredPaymentOptions$1;
        int i;
        Iterator it;
        Collection collection;
        dVar.getClass();
        if (continuationImpl instanceof TransportPaymentListInteractor$filteredPaymentOptions$1) {
            transportPaymentListInteractor$filteredPaymentOptions$1 = (TransportPaymentListInteractor$filteredPaymentOptions$1) continuationImpl;
            int i2 = transportPaymentListInteractor$filteredPaymentOptions$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                transportPaymentListInteractor$filteredPaymentOptions$1.label = i2 - Integer.MIN_VALUE;
                Object obj = transportPaymentListInteractor$filteredPaymentOptions$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = transportPaymentListInteractor$filteredPaymentOptions$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    List list = jfa0Var.a;
                    ArrayList arrayList = new ArrayList();
                    it = list.iterator();
                    collection = arrayList;
                    if (it.hasNext()) {
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    jfa0Var = (jfa0) transportPaymentListInteractor$filteredPaymentOptions$1.L$7;
                    Object next = transportPaymentListInteractor$filteredPaymentOptions$1.L$5;
                    it = (Iterator) transportPaymentListInteractor$filteredPaymentOptions$1.L$4;
                    collection = (Collection) transportPaymentListInteractor$filteredPaymentOptions$1.L$3;
                    kotlin.b.b(obj);
                    if (((Boolean) obj).booleanValue()) {
                        collection.add(next);
                    }
                    if (it.hasNext()) {
                        next = it.next();
                        e eVar = dVar.a;
                        u0k u0kVar = ((nea0) next).a;
                        transportPaymentListInteractor$filteredPaymentOptions$1.L$0 = null;
                        transportPaymentListInteractor$filteredPaymentOptions$1.L$1 = null;
                        transportPaymentListInteractor$filteredPaymentOptions$1.L$2 = null;
                        transportPaymentListInteractor$filteredPaymentOptions$1.L$3 = collection;
                        transportPaymentListInteractor$filteredPaymentOptions$1.L$4 = it;
                        transportPaymentListInteractor$filteredPaymentOptions$1.L$5 = next;
                        transportPaymentListInteractor$filteredPaymentOptions$1.L$6 = null;
                        transportPaymentListInteractor$filteredPaymentOptions$1.L$7 = jfa0Var;
                        transportPaymentListInteractor$filteredPaymentOptions$1.label = 1;
                        obj = eVar.a(u0kVar, transportPaymentListInteractor$filteredPaymentOptions$1);
                        if (obj == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        if (((Boolean) obj).booleanValue()) {
                        }
                        if (it.hasNext()) {
                            return jfa0.a(jfa0Var, (List) collection, null, 6);
                        }
                    }
                }
            }
        }
        transportPaymentListInteractor$filteredPaymentOptions$1 = new TransportPaymentListInteractor$filteredPaymentOptions$1(dVar, continuationImpl);
        Object obj2 = transportPaymentListInteractor$filteredPaymentOptions$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = transportPaymentListInteractor$filteredPaymentOptions$1.label;
        if (i != 0) {
        }
    }
}
