package com.yandex.payment.divkit.usecases;

import com.yandex.payment.divkit.StringMethod;
import com.yandex.payment.sdk.core.data.PaymentMethod;
import defpackage.abe;
import defpackage.aye0;
import defpackage.ctf;
import defpackage.dtf;
import defpackage.dvw;
import defpackage.ftf;
import defpackage.g92;
import defpackage.jl40;
import defpackage.k5c;
import defpackage.kol0;
import defpackage.kq4;
import defpackage.kq60;
import defpackage.l7;
import defpackage.lq60;
import defpackage.mq60;
import defpackage.n891;
import defpackage.ny61;
import defpackage.oq4;
import defpackage.qtf;
import defpackage.rwo;
import defpackage.sls;
import defpackage.tpr;
import defpackage.uv90;
import defpackage.vv90;
import defpackage.wga0;
import defpackage.yv90;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.flow.m0;
import kotlinx.coroutines.flow.n0;

/* loaded from: classes2.dex */
public final class p {
    public final aye0 a;
    public final abe b;
    public final rwo c;

    public p(aye0 aye0Var, abe abeVar, rwo rwoVar) {
        this.a = aye0Var;
        this.b = abeVar;
        this.c = rwoVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:69:0x00b4, code lost:
    
        if (r6 == r5) goto L62;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002e  */
    /* JADX WARN: Type inference failed for: r6v2, types: [T, kq4] */
    /* JADX WARN: Type inference failed for: r6v9, types: [T, kq4] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(p pVar, mq60 mq60Var, kq60 kq60Var, ContinuationImpl continuationImpl) {
        ObservePaymentMethodsUseCaseImpl$mapPaymentAndPlusCardState$1 observePaymentMethodsUseCaseImpl$mapPaymentAndPlusCardState$1;
        Object obj;
        CoroutineSingletons coroutineSingletons;
        int i;
        Ref$ObjectRef ref$ObjectRef;
        Object b;
        List list;
        Iterator it;
        mq60 mq60Var2;
        Result result;
        mq60 mq60Var3 = mq60Var;
        kq60 kq60Var2 = kq60Var;
        pVar.getClass();
        if (continuationImpl instanceof ObservePaymentMethodsUseCaseImpl$mapPaymentAndPlusCardState$1) {
            observePaymentMethodsUseCaseImpl$mapPaymentAndPlusCardState$1 = (ObservePaymentMethodsUseCaseImpl$mapPaymentAndPlusCardState$1) continuationImpl;
            int i2 = observePaymentMethodsUseCaseImpl$mapPaymentAndPlusCardState$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                observePaymentMethodsUseCaseImpl$mapPaymentAndPlusCardState$1.label = i2 - Integer.MIN_VALUE;
                obj = observePaymentMethodsUseCaseImpl$mapPaymentAndPlusCardState$1.result;
                coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = observePaymentMethodsUseCaseImpl$mapPaymentAndPlusCardState$1.label;
                int i3 = 2;
                if (i != 0) {
                    kotlin.b.b(obj);
                    ArrayList arrayList = mq60Var3.a;
                    ArrayList arrayList2 = new ArrayList();
                    for (Object obj2 : arrayList) {
                        if (!(((PaymentMethod) obj2) instanceof PaymentMethod.NewCard)) {
                            arrayList2.add(obj2);
                        }
                    }
                    if (!arrayList2.isEmpty()) {
                        kq60Var2.d.invoke(arrayList2);
                    }
                    ref$ObjectRef = new Ref$ObjectRef();
                    ?? r6 = mq60Var3.c;
                    ref$ObjectRef.element = r6;
                    if (kq60Var2.b && r6 == 0) {
                        com.yandex.payment.sdk.core.utils.a aVar = com.yandex.payment.sdk.core.utils.a.a;
                        observePaymentMethodsUseCaseImpl$mapPaymentAndPlusCardState$1.L$0 = mq60Var3;
                        observePaymentMethodsUseCaseImpl$mapPaymentAndPlusCardState$1.L$1 = kq60Var2;
                        observePaymentMethodsUseCaseImpl$mapPaymentAndPlusCardState$1.L$2 = null;
                        observePaymentMethodsUseCaseImpl$mapPaymentAndPlusCardState$1.L$3 = ref$ObjectRef;
                        observePaymentMethodsUseCaseImpl$mapPaymentAndPlusCardState$1.label = 1;
                        b = aVar.b(observePaymentMethodsUseCaseImpl$mapPaymentAndPlusCardState$1);
                    }
                    aye0 aye0Var = pVar.a;
                    ArrayList arrayList3 = mq60Var3.a;
                    abe abeVar = pVar.b;
                    sls slsVar = kq60Var2.f;
                    com.yandex.payment.divkit.select.n nVar = (com.yandex.payment.divkit.select.n) kq60Var2.h.b;
                    int q = n891.q((Integer) slsVar.invoke());
                    boolean z = mq60Var3.b;
                    uv90 uv90Var = nVar.c0;
                    String total = uv90Var != null ? ((wga0) uv90Var).g().getTotal() : null;
                    uv90 uv90Var2 = nVar.c0;
                    String currency = uv90Var2 != null ? ((wga0) uv90Var2).g().getCurrency() : null;
                    Object obj3 = ref$ObjectRef.element;
                    Object obj4 = obj3;
                    if (!kq60Var2.b) {
                        obj4 = null;
                    }
                    dtf c = ftf.c(arrayList3, abeVar, q, z, total, currency, (kq4) obj4, kq60Var2.c, kq60Var2.a, pVar.c, null, 512);
                    observePaymentMethodsUseCaseImpl$mapPaymentAndPlusCardState$1.L$0 = mq60Var3;
                    observePaymentMethodsUseCaseImpl$mapPaymentAndPlusCardState$1.L$1 = null;
                    observePaymentMethodsUseCaseImpl$mapPaymentAndPlusCardState$1.L$2 = null;
                    observePaymentMethodsUseCaseImpl$mapPaymentAndPlusCardState$1.L$3 = null;
                    observePaymentMethodsUseCaseImpl$mapPaymentAndPlusCardState$1.label = 2;
                    kol0 kol0Var = new kol0(dvw.b(observePaymentMethodsUseCaseImpl$mapPaymentAndPlusCardState$1));
                    List list2 = c.a;
                    list = list2;
                    if ((list instanceof Collection) || !list.isEmpty()) {
                        it = list.iterator();
                        while (it.hasNext()) {
                            if (jl40.l(((ctf) it.next()).a, StringMethod.SBP_TOKEN.getValue())) {
                                ((yv90) ((vv90) aye0Var.b)).b(new qtf(list2, kol0Var, c, i3));
                                break;
                            }
                        }
                    }
                    kol0Var.resumeWith(c);
                    obj = kol0Var.a();
                    CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    if (obj != coroutineSingletons) {
                        mq60Var2 = mq60Var3;
                        return new lq60((dtf) obj, mq60Var2.d, mq60Var2.a, mq60Var2.b, mq60Var2.c);
                    }
                    return coroutineSingletons;
                }
                if (i != 1) {
                    if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    mq60Var2 = (mq60) observePaymentMethodsUseCaseImpl$mapPaymentAndPlusCardState$1.L$0;
                    kotlin.b.b(obj);
                    return new lq60((dtf) obj, mq60Var2.d, mq60Var2.a, mq60Var2.b, mq60Var2.c);
                }
                Ref$ObjectRef ref$ObjectRef2 = (Ref$ObjectRef) observePaymentMethodsUseCaseImpl$mapPaymentAndPlusCardState$1.L$3;
                kq60Var2 = (kq60) observePaymentMethodsUseCaseImpl$mapPaymentAndPlusCardState$1.L$1;
                mq60 mq60Var4 = (mq60) observePaymentMethodsUseCaseImpl$mapPaymentAndPlusCardState$1.L$0;
                kotlin.b.b(obj);
                ref$ObjectRef = ref$ObjectRef2;
                mq60Var3 = mq60Var4;
                b = obj;
                result = (Result) b;
                if (result != null) {
                    Object value = result.getValue();
                    if (!(value instanceof Result.Failure)) {
                        ref$ObjectRef.element = (kq4) value;
                    }
                }
                aye0 aye0Var2 = pVar.a;
                ArrayList arrayList32 = mq60Var3.a;
                abe abeVar2 = pVar.b;
                sls slsVar2 = kq60Var2.f;
                com.yandex.payment.divkit.select.n nVar2 = (com.yandex.payment.divkit.select.n) kq60Var2.h.b;
                int q2 = n891.q((Integer) slsVar2.invoke());
                boolean z2 = mq60Var3.b;
                uv90 uv90Var3 = nVar2.c0;
                if (uv90Var3 != null) {
                }
                uv90 uv90Var22 = nVar2.c0;
                if (uv90Var22 != null) {
                }
                Object obj32 = ref$ObjectRef.element;
                Object obj42 = obj32;
                if (!kq60Var2.b) {
                }
                dtf c2 = ftf.c(arrayList32, abeVar2, q2, z2, total, currency, (kq4) obj42, kq60Var2.c, kq60Var2.a, pVar.c, null, 512);
                observePaymentMethodsUseCaseImpl$mapPaymentAndPlusCardState$1.L$0 = mq60Var3;
                observePaymentMethodsUseCaseImpl$mapPaymentAndPlusCardState$1.L$1 = null;
                observePaymentMethodsUseCaseImpl$mapPaymentAndPlusCardState$1.L$2 = null;
                observePaymentMethodsUseCaseImpl$mapPaymentAndPlusCardState$1.L$3 = null;
                observePaymentMethodsUseCaseImpl$mapPaymentAndPlusCardState$1.label = 2;
                kol0 kol0Var2 = new kol0(dvw.b(observePaymentMethodsUseCaseImpl$mapPaymentAndPlusCardState$1));
                List list22 = c2.a;
                list = list22;
                if (list instanceof Collection) {
                }
                it = list.iterator();
                while (it.hasNext()) {
                }
                kol0Var2.resumeWith(c2);
                obj = kol0Var2.a();
                CoroutineSingletons coroutineSingletons22 = CoroutineSingletons.COROUTINE_SUSPENDED;
                if (obj != coroutineSingletons) {
                }
                return coroutineSingletons;
            }
        }
        observePaymentMethodsUseCaseImpl$mapPaymentAndPlusCardState$1 = new ObservePaymentMethodsUseCaseImpl$mapPaymentAndPlusCardState$1(pVar, continuationImpl);
        obj = observePaymentMethodsUseCaseImpl$mapPaymentAndPlusCardState$1.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = observePaymentMethodsUseCaseImpl$mapPaymentAndPlusCardState$1.label;
        int i32 = 2;
        if (i != 0) {
        }
        result = (Result) b;
        if (result != null) {
        }
        aye0 aye0Var22 = pVar.a;
        ArrayList arrayList322 = mq60Var3.a;
        abe abeVar22 = pVar.b;
        sls slsVar22 = kq60Var2.f;
        com.yandex.payment.divkit.select.n nVar22 = (com.yandex.payment.divkit.select.n) kq60Var2.h.b;
        int q22 = n891.q((Integer) slsVar22.invoke());
        boolean z22 = mq60Var3.b;
        uv90 uv90Var32 = nVar22.c0;
        if (uv90Var32 != null) {
        }
        uv90 uv90Var222 = nVar22.c0;
        if (uv90Var222 != null) {
        }
        Object obj322 = ref$ObjectRef.element;
        Object obj422 = obj322;
        if (!kq60Var2.b) {
        }
        dtf c22 = ftf.c(arrayList322, abeVar22, q22, z22, total, currency, (kq4) obj422, kq60Var2.c, kq60Var2.a, pVar.c, null, 512);
        observePaymentMethodsUseCaseImpl$mapPaymentAndPlusCardState$1.L$0 = mq60Var3;
        observePaymentMethodsUseCaseImpl$mapPaymentAndPlusCardState$1.L$1 = null;
        observePaymentMethodsUseCaseImpl$mapPaymentAndPlusCardState$1.L$2 = null;
        observePaymentMethodsUseCaseImpl$mapPaymentAndPlusCardState$1.L$3 = null;
        observePaymentMethodsUseCaseImpl$mapPaymentAndPlusCardState$1.label = 2;
        kol0 kol0Var22 = new kol0(dvw.b(observePaymentMethodsUseCaseImpl$mapPaymentAndPlusCardState$1));
        List list222 = c22.a;
        list = list222;
        if (list instanceof Collection) {
        }
        it = list.iterator();
        while (it.hasNext()) {
        }
        kol0Var22.resumeWith(c22);
        obj = kol0Var22.a();
        CoroutineSingletons coroutineSingletons222 = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (obj != coroutineSingletons) {
        }
        return coroutineSingletons;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Type inference failed for: r6v4, types: [tpr] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(k5c k5cVar, n0 n0Var, kq60 kq60Var, ContinuationImpl continuationImpl) {
        ObservePaymentMethodsUseCaseImpl$getPaymentMethodsFlow$1 observePaymentMethodsUseCaseImpl$getPaymentMethodsFlow$1;
        int i;
        n0 n0Var2;
        if (continuationImpl instanceof ObservePaymentMethodsUseCaseImpl$getPaymentMethodsFlow$1) {
            observePaymentMethodsUseCaseImpl$getPaymentMethodsFlow$1 = (ObservePaymentMethodsUseCaseImpl$getPaymentMethodsFlow$1) continuationImpl;
            int i2 = observePaymentMethodsUseCaseImpl$getPaymentMethodsFlow$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                observePaymentMethodsUseCaseImpl$getPaymentMethodsFlow$1.label = i2 - Integer.MIN_VALUE;
                Object obj = observePaymentMethodsUseCaseImpl$getPaymentMethodsFlow$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = observePaymentMethodsUseCaseImpl$getPaymentMethodsFlow$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    com.yandex.payment.sdk.core.utils.a aVar = com.yandex.payment.sdk.core.utils.a.a;
                    observePaymentMethodsUseCaseImpl$getPaymentMethodsFlow$1.L$0 = null;
                    observePaymentMethodsUseCaseImpl$getPaymentMethodsFlow$1.L$1 = null;
                    observePaymentMethodsUseCaseImpl$getPaymentMethodsFlow$1.L$2 = kq60Var;
                    observePaymentMethodsUseCaseImpl$getPaymentMethodsFlow$1.L$3 = n0Var;
                    observePaymentMethodsUseCaseImpl$getPaymentMethodsFlow$1.label = 1;
                    com.yandex.payment.sdk.core.utils.a.c();
                    obj = new g92(2, new oq4());
                    n0Var2 = n0Var;
                    if (obj == obj2) {
                        return obj2;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ?? r6 = (tpr) observePaymentMethodsUseCaseImpl$getPaymentMethodsFlow$1.L$3;
                    kq60Var = (kq60) observePaymentMethodsUseCaseImpl$getPaymentMethodsFlow$1.L$2;
                    kotlin.b.b(obj);
                    n0Var2 = r6;
                }
                return new l7(16, new m0(n0Var2, (tpr) obj, new ObservePaymentMethodsUseCaseImpl$getPaymentMethodsFlow$2(this, kq60Var, null)), this, kq60Var);
            }
        }
        observePaymentMethodsUseCaseImpl$getPaymentMethodsFlow$1 = new ObservePaymentMethodsUseCaseImpl$getPaymentMethodsFlow$1(this, continuationImpl);
        Object obj3 = observePaymentMethodsUseCaseImpl$getPaymentMethodsFlow$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = observePaymentMethodsUseCaseImpl$getPaymentMethodsFlow$1.label;
        if (i != 0) {
        }
        return new l7(16, new m0(n0Var2, (tpr) obj3, new ObservePaymentMethodsUseCaseImpl$getPaymentMethodsFlow$2(this, kq60Var, null)), this, kq60Var);
    }
}
