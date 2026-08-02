package com.yandex.payment.divkit.select;

import com.yandex.payment.divkit.StringMethod;
import com.yandex.payment.sdk.core.data.PaymentMethod;
import com.yandex.xplat.payment.sdk.PaymentOptionNameForAnalytics;
import defpackage.abe;
import defpackage.ctf;
import defpackage.dtf;
import defpackage.dvw;
import defpackage.ftf;
import defpackage.jl40;
import defpackage.kcq0;
import defpackage.kol0;
import defpackage.kq4;
import defpackage.n891;
import defpackage.ny61;
import defpackage.qtf;
import defpackage.qv90;
import defpackage.rwo;
import defpackage.sv90;
import defpackage.uv90;
import defpackage.vpr;
import defpackage.wga0;
import defpackage.y22;
import defpackage.yuf;
import defpackage.yv90;
import defpackage.zuf;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.Ref$ObjectRef;

/* loaded from: classes2.dex */
public final class g implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ h b;

    public g(vpr vprVar, h hVar) {
        this.a = vprVar;
        this.b = hVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x021d, code lost:
    
        if (r6.emit(r5, r2) != r3) goto L84;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:24:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /* JADX WARN: Type inference failed for: r1v24, types: [T, kq4] */
    /* JADX WARN: Type inference failed for: r4v2, types: [T, kq4] */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        DKSelectViewModel$observePaymentMethodsInner$1$invokeSuspend$$inlined$map$1$2$1 dKSelectViewModel$observePaymentMethodsInner$1$invokeSuspend$$inlined$map$1$2$1;
        Object obj2;
        CoroutineSingletons coroutineSingletons;
        int i;
        h hVar;
        yuf yufVar;
        int i2;
        Ref$ObjectRef ref$ObjectRef;
        vpr vprVar;
        int i3;
        int i4;
        Ref$ObjectRef ref$ObjectRef2;
        int i5;
        yuf yufVar2;
        List list;
        Iterator it;
        vpr vprVar2;
        Result result;
        if (continuation instanceof DKSelectViewModel$observePaymentMethodsInner$1$invokeSuspend$$inlined$map$1$2$1) {
            dKSelectViewModel$observePaymentMethodsInner$1$invokeSuspend$$inlined$map$1$2$1 = (DKSelectViewModel$observePaymentMethodsInner$1$invokeSuspend$$inlined$map$1$2$1) continuation;
            int i6 = dKSelectViewModel$observePaymentMethodsInner$1$invokeSuspend$$inlined$map$1$2$1.label;
            if ((i6 & Integer.MIN_VALUE) != 0) {
                dKSelectViewModel$observePaymentMethodsInner$1$invokeSuspend$$inlined$map$1$2$1.label = i6 - Integer.MIN_VALUE;
                obj2 = dKSelectViewModel$observePaymentMethodsInner$1$invokeSuspend$$inlined$map$1$2$1.result;
                coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = dKSelectViewModel$observePaymentMethodsInner$1$invokeSuspend$$inlined$map$1$2$1.label;
                hVar = this.b;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    yufVar = (yuf) obj;
                    List list2 = yufVar.a;
                    ArrayList arrayList = new ArrayList();
                    for (Object obj3 : list2) {
                        if (!(((PaymentMethod) obj3) instanceof PaymentMethod.NewCard)) {
                            arrayList.add(obj3);
                        }
                    }
                    i2 = 0;
                    if (!arrayList.isEmpty()) {
                        kcq0 kcq0Var = hVar.H;
                        if (kcq0Var != null) {
                            kcq0Var.e(arrayList);
                        }
                        if (yufVar.e) {
                            rwo rwoVar = hVar.c;
                            sv90 sv90Var = qv90.a;
                            PaymentOptionNameForAnalytics paymentOptionNameForAnalytics = PaymentOptionNameForAnalytics.YB;
                            sv90Var.getClass();
                            ((y22) rwoVar).a(sv90.t0(paymentOptionNameForAnalytics, false));
                            kcq0 kcq0Var2 = hVar.H;
                            if (kcq0Var2 != null) {
                                kcq0Var2.onSelectPaymentMethod(0);
                            }
                        }
                    }
                    ref$ObjectRef = new Ref$ObjectRef();
                    ?? r4 = yufVar.c;
                    ref$ObjectRef.element = r4;
                    boolean z = hVar.E;
                    vpr vprVar3 = this.a;
                    if (z && r4 == 0) {
                        com.yandex.payment.sdk.core.utils.a aVar = com.yandex.payment.sdk.core.utils.a.a;
                        dKSelectViewModel$observePaymentMethodsInner$1$invokeSuspend$$inlined$map$1$2$1.L$0 = null;
                        dKSelectViewModel$observePaymentMethodsInner$1$invokeSuspend$$inlined$map$1$2$1.L$1 = null;
                        dKSelectViewModel$observePaymentMethodsInner$1$invokeSuspend$$inlined$map$1$2$1.L$2 = null;
                        dKSelectViewModel$observePaymentMethodsInner$1$invokeSuspend$$inlined$map$1$2$1.L$3 = null;
                        dKSelectViewModel$observePaymentMethodsInner$1$invokeSuspend$$inlined$map$1$2$1.L$4 = vprVar3;
                        dKSelectViewModel$observePaymentMethodsInner$1$invokeSuspend$$inlined$map$1$2$1.L$5 = null;
                        dKSelectViewModel$observePaymentMethodsInner$1$invokeSuspend$$inlined$map$1$2$1.L$6 = yufVar;
                        dKSelectViewModel$observePaymentMethodsInner$1$invokeSuspend$$inlined$map$1$2$1.L$7 = ref$ObjectRef;
                        dKSelectViewModel$observePaymentMethodsInner$1$invokeSuspend$$inlined$map$1$2$1.L$8 = null;
                        dKSelectViewModel$observePaymentMethodsInner$1$invokeSuspend$$inlined$map$1$2$1.I$0 = 0;
                        dKSelectViewModel$observePaymentMethodsInner$1$invokeSuspend$$inlined$map$1$2$1.I$1 = 0;
                        dKSelectViewModel$observePaymentMethodsInner$1$invokeSuspend$$inlined$map$1$2$1.label = 1;
                        Result b = aVar.b(dKSelectViewModel$observePaymentMethodsInner$1$invokeSuspend$$inlined$map$1$2$1);
                        if (b != coroutineSingletons) {
                            vprVar = vprVar3;
                            i4 = 0;
                            ref$ObjectRef2 = ref$ObjectRef;
                            obj2 = b;
                            i5 = 0;
                        }
                        return coroutineSingletons;
                    }
                    vprVar = vprVar3;
                    i3 = 0;
                    yufVar2 = yufVar;
                    List list3 = yufVar2.a;
                    abe abeVar = hVar.w;
                    kcq0 kcq0Var3 = hVar.H;
                    int q = n891.q(kcq0Var3 != null ? kcq0Var3.c() : null);
                    boolean z2 = yufVar2.b;
                    uv90 uv90Var = hVar.G;
                    String total = uv90Var != null ? ((wga0) uv90Var).g().getTotal() : null;
                    uv90 uv90Var2 = hVar.G;
                    String currency = uv90Var2 != null ? ((wga0) uv90Var2).g().getCurrency() : null;
                    Object obj4 = ref$ObjectRef.element;
                    Object obj5 = obj4;
                    if (!hVar.E) {
                        obj5 = null;
                    }
                    dtf c = ftf.c(list3, abeVar, q, z2, total, currency, (kq4) obj5, hVar.M, hVar.N, hVar.c, null, 512);
                    dKSelectViewModel$observePaymentMethodsInner$1$invokeSuspend$$inlined$map$1$2$1.L$0 = null;
                    dKSelectViewModel$observePaymentMethodsInner$1$invokeSuspend$$inlined$map$1$2$1.L$1 = null;
                    dKSelectViewModel$observePaymentMethodsInner$1$invokeSuspend$$inlined$map$1$2$1.L$2 = null;
                    dKSelectViewModel$observePaymentMethodsInner$1$invokeSuspend$$inlined$map$1$2$1.L$3 = null;
                    dKSelectViewModel$observePaymentMethodsInner$1$invokeSuspend$$inlined$map$1$2$1.L$4 = vprVar;
                    dKSelectViewModel$observePaymentMethodsInner$1$invokeSuspend$$inlined$map$1$2$1.L$5 = null;
                    dKSelectViewModel$observePaymentMethodsInner$1$invokeSuspend$$inlined$map$1$2$1.L$6 = yufVar2;
                    dKSelectViewModel$observePaymentMethodsInner$1$invokeSuspend$$inlined$map$1$2$1.L$7 = null;
                    dKSelectViewModel$observePaymentMethodsInner$1$invokeSuspend$$inlined$map$1$2$1.L$8 = null;
                    dKSelectViewModel$observePaymentMethodsInner$1$invokeSuspend$$inlined$map$1$2$1.I$0 = i3;
                    dKSelectViewModel$observePaymentMethodsInner$1$invokeSuspend$$inlined$map$1$2$1.I$1 = i2;
                    dKSelectViewModel$observePaymentMethodsInner$1$invokeSuspend$$inlined$map$1$2$1.label = 2;
                    kol0 kol0Var = new kol0(dvw.b(dKSelectViewModel$observePaymentMethodsInner$1$invokeSuspend$$inlined$map$1$2$1));
                    List list4 = c.a;
                    list = list4;
                    if ((list instanceof Collection) || !list.isEmpty()) {
                        it = list.iterator();
                        while (it.hasNext()) {
                            if (jl40.l(((ctf) it.next()).a, StringMethod.SBP_TOKEN.getValue())) {
                                ((yv90) hVar.y).b(new qtf(list4, kol0Var, c, 1));
                                break;
                            }
                        }
                    }
                    kol0Var.resumeWith(c);
                    obj2 = kol0Var.a();
                    CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    if (obj2 != coroutineSingletons) {
                        vprVar2 = vprVar;
                        zuf zufVar = new zuf((dtf) obj2, yufVar2);
                        dKSelectViewModel$observePaymentMethodsInner$1$invokeSuspend$$inlined$map$1$2$1.L$0 = null;
                        dKSelectViewModel$observePaymentMethodsInner$1$invokeSuspend$$inlined$map$1$2$1.L$1 = null;
                        dKSelectViewModel$observePaymentMethodsInner$1$invokeSuspend$$inlined$map$1$2$1.L$2 = null;
                        dKSelectViewModel$observePaymentMethodsInner$1$invokeSuspend$$inlined$map$1$2$1.L$3 = null;
                        dKSelectViewModel$observePaymentMethodsInner$1$invokeSuspend$$inlined$map$1$2$1.L$4 = null;
                        dKSelectViewModel$observePaymentMethodsInner$1$invokeSuspend$$inlined$map$1$2$1.L$5 = null;
                        dKSelectViewModel$observePaymentMethodsInner$1$invokeSuspend$$inlined$map$1$2$1.L$6 = null;
                        dKSelectViewModel$observePaymentMethodsInner$1$invokeSuspend$$inlined$map$1$2$1.L$7 = null;
                        dKSelectViewModel$observePaymentMethodsInner$1$invokeSuspend$$inlined$map$1$2$1.L$8 = null;
                        dKSelectViewModel$observePaymentMethodsInner$1$invokeSuspend$$inlined$map$1$2$1.I$0 = i3;
                        dKSelectViewModel$observePaymentMethodsInner$1$invokeSuspend$$inlined$map$1$2$1.label = 3;
                    }
                    return coroutineSingletons;
                }
                if (i == 1) {
                    i4 = dKSelectViewModel$observePaymentMethodsInner$1$invokeSuspend$$inlined$map$1$2$1.I$1;
                    i5 = dKSelectViewModel$observePaymentMethodsInner$1$invokeSuspend$$inlined$map$1$2$1.I$0;
                    ref$ObjectRef2 = (Ref$ObjectRef) dKSelectViewModel$observePaymentMethodsInner$1$invokeSuspend$$inlined$map$1$2$1.L$7;
                    yufVar = (yuf) dKSelectViewModel$observePaymentMethodsInner$1$invokeSuspend$$inlined$map$1$2$1.L$6;
                    vprVar = (vpr) dKSelectViewModel$observePaymentMethodsInner$1$invokeSuspend$$inlined$map$1$2$1.L$4;
                    kotlin.b.b(obj2);
                } else {
                    if (i != 2) {
                        if (i != 3) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj2);
                        return zy11.a;
                    }
                    i3 = dKSelectViewModel$observePaymentMethodsInner$1$invokeSuspend$$inlined$map$1$2$1.I$0;
                    yufVar2 = (yuf) dKSelectViewModel$observePaymentMethodsInner$1$invokeSuspend$$inlined$map$1$2$1.L$6;
                    vprVar2 = (vpr) dKSelectViewModel$observePaymentMethodsInner$1$invokeSuspend$$inlined$map$1$2$1.L$4;
                    kotlin.b.b(obj2);
                    zuf zufVar2 = new zuf((dtf) obj2, yufVar2);
                    dKSelectViewModel$observePaymentMethodsInner$1$invokeSuspend$$inlined$map$1$2$1.L$0 = null;
                    dKSelectViewModel$observePaymentMethodsInner$1$invokeSuspend$$inlined$map$1$2$1.L$1 = null;
                    dKSelectViewModel$observePaymentMethodsInner$1$invokeSuspend$$inlined$map$1$2$1.L$2 = null;
                    dKSelectViewModel$observePaymentMethodsInner$1$invokeSuspend$$inlined$map$1$2$1.L$3 = null;
                    dKSelectViewModel$observePaymentMethodsInner$1$invokeSuspend$$inlined$map$1$2$1.L$4 = null;
                    dKSelectViewModel$observePaymentMethodsInner$1$invokeSuspend$$inlined$map$1$2$1.L$5 = null;
                    dKSelectViewModel$observePaymentMethodsInner$1$invokeSuspend$$inlined$map$1$2$1.L$6 = null;
                    dKSelectViewModel$observePaymentMethodsInner$1$invokeSuspend$$inlined$map$1$2$1.L$7 = null;
                    dKSelectViewModel$observePaymentMethodsInner$1$invokeSuspend$$inlined$map$1$2$1.L$8 = null;
                    dKSelectViewModel$observePaymentMethodsInner$1$invokeSuspend$$inlined$map$1$2$1.I$0 = i3;
                    dKSelectViewModel$observePaymentMethodsInner$1$invokeSuspend$$inlined$map$1$2$1.label = 3;
                }
                result = (Result) obj2;
                if (result != null) {
                    Object value = result.getValue();
                    if (!(value instanceof Result.Failure)) {
                        ref$ObjectRef2.element = (kq4) value;
                    }
                }
                ref$ObjectRef = ref$ObjectRef2;
                i2 = i4;
                i3 = i5;
                yufVar2 = yufVar;
                List list32 = yufVar2.a;
                abe abeVar2 = hVar.w;
                kcq0 kcq0Var32 = hVar.H;
                int q2 = n891.q(kcq0Var32 != null ? kcq0Var32.c() : null);
                boolean z22 = yufVar2.b;
                uv90 uv90Var3 = hVar.G;
                if (uv90Var3 != null) {
                }
                uv90 uv90Var22 = hVar.G;
                if (uv90Var22 != null) {
                }
                Object obj42 = ref$ObjectRef.element;
                Object obj52 = obj42;
                if (!hVar.E) {
                }
                dtf c2 = ftf.c(list32, abeVar2, q2, z22, total, currency, (kq4) obj52, hVar.M, hVar.N, hVar.c, null, 512);
                dKSelectViewModel$observePaymentMethodsInner$1$invokeSuspend$$inlined$map$1$2$1.L$0 = null;
                dKSelectViewModel$observePaymentMethodsInner$1$invokeSuspend$$inlined$map$1$2$1.L$1 = null;
                dKSelectViewModel$observePaymentMethodsInner$1$invokeSuspend$$inlined$map$1$2$1.L$2 = null;
                dKSelectViewModel$observePaymentMethodsInner$1$invokeSuspend$$inlined$map$1$2$1.L$3 = null;
                dKSelectViewModel$observePaymentMethodsInner$1$invokeSuspend$$inlined$map$1$2$1.L$4 = vprVar;
                dKSelectViewModel$observePaymentMethodsInner$1$invokeSuspend$$inlined$map$1$2$1.L$5 = null;
                dKSelectViewModel$observePaymentMethodsInner$1$invokeSuspend$$inlined$map$1$2$1.L$6 = yufVar2;
                dKSelectViewModel$observePaymentMethodsInner$1$invokeSuspend$$inlined$map$1$2$1.L$7 = null;
                dKSelectViewModel$observePaymentMethodsInner$1$invokeSuspend$$inlined$map$1$2$1.L$8 = null;
                dKSelectViewModel$observePaymentMethodsInner$1$invokeSuspend$$inlined$map$1$2$1.I$0 = i3;
                dKSelectViewModel$observePaymentMethodsInner$1$invokeSuspend$$inlined$map$1$2$1.I$1 = i2;
                dKSelectViewModel$observePaymentMethodsInner$1$invokeSuspend$$inlined$map$1$2$1.label = 2;
                kol0 kol0Var2 = new kol0(dvw.b(dKSelectViewModel$observePaymentMethodsInner$1$invokeSuspend$$inlined$map$1$2$1));
                List list42 = c2.a;
                list = list42;
                if (list instanceof Collection) {
                }
                it = list.iterator();
                while (it.hasNext()) {
                }
                kol0Var2.resumeWith(c2);
                obj2 = kol0Var2.a();
                CoroutineSingletons coroutineSingletons22 = CoroutineSingletons.COROUTINE_SUSPENDED;
                if (obj2 != coroutineSingletons) {
                }
                return coroutineSingletons;
            }
        }
        dKSelectViewModel$observePaymentMethodsInner$1$invokeSuspend$$inlined$map$1$2$1 = new DKSelectViewModel$observePaymentMethodsInner$1$invokeSuspend$$inlined$map$1$2$1(this, continuation);
        obj2 = dKSelectViewModel$observePaymentMethodsInner$1$invokeSuspend$$inlined$map$1$2$1.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = dKSelectViewModel$observePaymentMethodsInner$1$invokeSuspend$$inlined$map$1$2$1.label;
        hVar = this.b;
        if (i != 0) {
        }
        result = (Result) obj2;
        if (result != null) {
        }
        ref$ObjectRef = ref$ObjectRef2;
        i2 = i4;
        i3 = i5;
        yufVar2 = yufVar;
        List list322 = yufVar2.a;
        abe abeVar22 = hVar.w;
        kcq0 kcq0Var322 = hVar.H;
        int q22 = n891.q(kcq0Var322 != null ? kcq0Var322.c() : null);
        boolean z222 = yufVar2.b;
        uv90 uv90Var32 = hVar.G;
        if (uv90Var32 != null) {
        }
        uv90 uv90Var222 = hVar.G;
        if (uv90Var222 != null) {
        }
        Object obj422 = ref$ObjectRef.element;
        Object obj522 = obj422;
        if (!hVar.E) {
        }
        dtf c22 = ftf.c(list322, abeVar22, q22, z222, total, currency, (kq4) obj522, hVar.M, hVar.N, hVar.c, null, 512);
        dKSelectViewModel$observePaymentMethodsInner$1$invokeSuspend$$inlined$map$1$2$1.L$0 = null;
        dKSelectViewModel$observePaymentMethodsInner$1$invokeSuspend$$inlined$map$1$2$1.L$1 = null;
        dKSelectViewModel$observePaymentMethodsInner$1$invokeSuspend$$inlined$map$1$2$1.L$2 = null;
        dKSelectViewModel$observePaymentMethodsInner$1$invokeSuspend$$inlined$map$1$2$1.L$3 = null;
        dKSelectViewModel$observePaymentMethodsInner$1$invokeSuspend$$inlined$map$1$2$1.L$4 = vprVar;
        dKSelectViewModel$observePaymentMethodsInner$1$invokeSuspend$$inlined$map$1$2$1.L$5 = null;
        dKSelectViewModel$observePaymentMethodsInner$1$invokeSuspend$$inlined$map$1$2$1.L$6 = yufVar2;
        dKSelectViewModel$observePaymentMethodsInner$1$invokeSuspend$$inlined$map$1$2$1.L$7 = null;
        dKSelectViewModel$observePaymentMethodsInner$1$invokeSuspend$$inlined$map$1$2$1.L$8 = null;
        dKSelectViewModel$observePaymentMethodsInner$1$invokeSuspend$$inlined$map$1$2$1.I$0 = i3;
        dKSelectViewModel$observePaymentMethodsInner$1$invokeSuspend$$inlined$map$1$2$1.I$1 = i2;
        dKSelectViewModel$observePaymentMethodsInner$1$invokeSuspend$$inlined$map$1$2$1.label = 2;
        kol0 kol0Var22 = new kol0(dvw.b(dKSelectViewModel$observePaymentMethodsInner$1$invokeSuspend$$inlined$map$1$2$1));
        List list422 = c22.a;
        list = list422;
        if (list instanceof Collection) {
        }
        it = list.iterator();
        while (it.hasNext()) {
        }
        kol0Var22.resumeWith(c22);
        obj2 = kol0Var22.a();
        CoroutineSingletons coroutineSingletons222 = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (obj2 != coroutineSingletons) {
        }
        return coroutineSingletons;
    }
}
