package com.yandex.payment.divkit.preselect;

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
import defpackage.otf;
import defpackage.ptf;
import defpackage.qtf;
import defpackage.qv90;
import defpackage.rwo;
import defpackage.sv90;
import defpackage.vpr;
import defpackage.y22;
import defpackage.yv90;
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
public final class e implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ f b;

    public e(vpr vprVar, f fVar) {
        this.a = vprVar;
        this.b = fVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0216, code lost:
    
        if (r6.emit(r5, r2) != r3) goto L83;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    /* JADX WARN: Type inference failed for: r1v25, types: [T, kq4] */
    /* JADX WARN: Type inference failed for: r4v2, types: [T, kq4] */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        DKPreselectViewModel$observePaymentMethods$1$invokeSuspend$$inlined$map$1$2$1 dKPreselectViewModel$observePaymentMethods$1$invokeSuspend$$inlined$map$1$2$1;
        Object obj2;
        CoroutineSingletons coroutineSingletons;
        int i;
        f fVar;
        otf otfVar;
        vpr vprVar;
        Ref$ObjectRef ref$ObjectRef;
        int i2;
        int i3;
        int i4;
        int i5;
        Integer Y;
        otf otfVar2;
        List list;
        Iterator it;
        vpr vprVar2;
        Result result;
        if (continuation instanceof DKPreselectViewModel$observePaymentMethods$1$invokeSuspend$$inlined$map$1$2$1) {
            dKPreselectViewModel$observePaymentMethods$1$invokeSuspend$$inlined$map$1$2$1 = (DKPreselectViewModel$observePaymentMethods$1$invokeSuspend$$inlined$map$1$2$1) continuation;
            int i6 = dKPreselectViewModel$observePaymentMethods$1$invokeSuspend$$inlined$map$1$2$1.label;
            if ((i6 & Integer.MIN_VALUE) != 0) {
                dKPreselectViewModel$observePaymentMethods$1$invokeSuspend$$inlined$map$1$2$1.label = i6 - Integer.MIN_VALUE;
                obj2 = dKPreselectViewModel$observePaymentMethods$1$invokeSuspend$$inlined$map$1$2$1.result;
                coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = dKPreselectViewModel$observePaymentMethods$1$invokeSuspend$$inlined$map$1$2$1.label;
                fVar = this.b;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    otfVar = (otf) obj;
                    List list2 = otfVar.a;
                    ArrayList arrayList = new ArrayList();
                    for (Object obj3 : list2) {
                        if (!(((PaymentMethod) obj3) instanceof PaymentMethod.NewCard)) {
                            arrayList.add(obj3);
                        }
                    }
                    if (!arrayList.isEmpty()) {
                        kcq0 kcq0Var = fVar.A;
                        if (kcq0Var != null) {
                            kcq0Var.e(arrayList);
                        }
                        if (otfVar.d) {
                            rwo rwoVar = fVar.c;
                            sv90 sv90Var = qv90.a;
                            PaymentOptionNameForAnalytics paymentOptionNameForAnalytics = PaymentOptionNameForAnalytics.YB;
                            sv90Var.getClass();
                            ((y22) rwoVar).a(sv90.t0(paymentOptionNameForAnalytics, false));
                            kcq0 kcq0Var2 = fVar.A;
                            if (kcq0Var2 != null) {
                                kcq0Var2.onSelectPaymentMethod(0);
                            }
                        } else if (fVar.C != null && (Y = fVar.Y(arrayList)) != null) {
                            int intValue = Y.intValue();
                            kcq0 kcq0Var3 = fVar.A;
                            if (kcq0Var3 != null) {
                                kcq0Var3.onSelectPaymentMethod(intValue);
                            }
                        }
                    }
                    Ref$ObjectRef ref$ObjectRef2 = new Ref$ObjectRef();
                    ?? r4 = otfVar.c;
                    ref$ObjectRef2.element = r4;
                    boolean z = fVar.y;
                    vpr vprVar3 = this.a;
                    if (z && r4 == 0) {
                        com.yandex.payment.sdk.core.utils.a aVar = com.yandex.payment.sdk.core.utils.a.a;
                        dKPreselectViewModel$observePaymentMethods$1$invokeSuspend$$inlined$map$1$2$1.L$0 = null;
                        dKPreselectViewModel$observePaymentMethods$1$invokeSuspend$$inlined$map$1$2$1.L$1 = null;
                        dKPreselectViewModel$observePaymentMethods$1$invokeSuspend$$inlined$map$1$2$1.L$2 = null;
                        dKPreselectViewModel$observePaymentMethods$1$invokeSuspend$$inlined$map$1$2$1.L$3 = null;
                        dKPreselectViewModel$observePaymentMethods$1$invokeSuspend$$inlined$map$1$2$1.L$4 = vprVar3;
                        dKPreselectViewModel$observePaymentMethods$1$invokeSuspend$$inlined$map$1$2$1.L$5 = null;
                        dKPreselectViewModel$observePaymentMethods$1$invokeSuspend$$inlined$map$1$2$1.L$6 = otfVar;
                        dKPreselectViewModel$observePaymentMethods$1$invokeSuspend$$inlined$map$1$2$1.L$7 = ref$ObjectRef2;
                        dKPreselectViewModel$observePaymentMethods$1$invokeSuspend$$inlined$map$1$2$1.L$8 = null;
                        dKPreselectViewModel$observePaymentMethods$1$invokeSuspend$$inlined$map$1$2$1.I$0 = 0;
                        dKPreselectViewModel$observePaymentMethods$1$invokeSuspend$$inlined$map$1$2$1.I$1 = 0;
                        dKPreselectViewModel$observePaymentMethods$1$invokeSuspend$$inlined$map$1$2$1.label = 1;
                        Result b = aVar.b(dKPreselectViewModel$observePaymentMethods$1$invokeSuspend$$inlined$map$1$2$1);
                        if (b != coroutineSingletons) {
                            vprVar = vprVar3;
                            ref$ObjectRef = ref$ObjectRef2;
                            obj2 = b;
                            i4 = 0;
                            i5 = 0;
                        }
                        return coroutineSingletons;
                    }
                    vprVar = vprVar3;
                    ref$ObjectRef = ref$ObjectRef2;
                    i2 = 0;
                    i3 = 0;
                    otfVar2 = otfVar;
                    List list3 = otfVar2.a;
                    abe abeVar = fVar.w;
                    kcq0 kcq0Var4 = fVar.A;
                    int q = n891.q(kcq0Var4 != null ? kcq0Var4.c() : null);
                    boolean z2 = otfVar2.b;
                    String str = fVar.M;
                    Object obj4 = ref$ObjectRef.element;
                    Object obj5 = obj4;
                    if (!fVar.y) {
                        obj5 = null;
                    }
                    dtf c = ftf.c(list3, abeVar, q, z2, str, null, (kq4) obj5, fVar.B, null, fVar.c, fVar.N, 128);
                    dKPreselectViewModel$observePaymentMethods$1$invokeSuspend$$inlined$map$1$2$1.L$0 = null;
                    dKPreselectViewModel$observePaymentMethods$1$invokeSuspend$$inlined$map$1$2$1.L$1 = null;
                    dKPreselectViewModel$observePaymentMethods$1$invokeSuspend$$inlined$map$1$2$1.L$2 = null;
                    dKPreselectViewModel$observePaymentMethods$1$invokeSuspend$$inlined$map$1$2$1.L$3 = null;
                    dKPreselectViewModel$observePaymentMethods$1$invokeSuspend$$inlined$map$1$2$1.L$4 = vprVar;
                    dKPreselectViewModel$observePaymentMethods$1$invokeSuspend$$inlined$map$1$2$1.L$5 = null;
                    dKPreselectViewModel$observePaymentMethods$1$invokeSuspend$$inlined$map$1$2$1.L$6 = otfVar2;
                    dKPreselectViewModel$observePaymentMethods$1$invokeSuspend$$inlined$map$1$2$1.L$7 = null;
                    dKPreselectViewModel$observePaymentMethods$1$invokeSuspend$$inlined$map$1$2$1.L$8 = null;
                    dKPreselectViewModel$observePaymentMethods$1$invokeSuspend$$inlined$map$1$2$1.I$0 = i2;
                    dKPreselectViewModel$observePaymentMethods$1$invokeSuspend$$inlined$map$1$2$1.I$1 = i3;
                    dKPreselectViewModel$observePaymentMethods$1$invokeSuspend$$inlined$map$1$2$1.label = 2;
                    kol0 kol0Var = new kol0(dvw.b(dKPreselectViewModel$observePaymentMethods$1$invokeSuspend$$inlined$map$1$2$1));
                    List list4 = c.a;
                    list = list4;
                    if ((list instanceof Collection) || !list.isEmpty()) {
                        it = list.iterator();
                        while (it.hasNext()) {
                            if (jl40.l(((ctf) it.next()).a, StringMethod.SBP_TOKEN.getValue())) {
                                ((yv90) fVar.x).b(new qtf(list4, kol0Var, c, 0));
                                break;
                            }
                        }
                    }
                    kol0Var.resumeWith(c);
                    obj2 = kol0Var.a();
                    CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    if (obj2 != coroutineSingletons) {
                        vprVar2 = vprVar;
                        ptf ptfVar = new ptf((dtf) obj2, otfVar2);
                        dKPreselectViewModel$observePaymentMethods$1$invokeSuspend$$inlined$map$1$2$1.L$0 = null;
                        dKPreselectViewModel$observePaymentMethods$1$invokeSuspend$$inlined$map$1$2$1.L$1 = null;
                        dKPreselectViewModel$observePaymentMethods$1$invokeSuspend$$inlined$map$1$2$1.L$2 = null;
                        dKPreselectViewModel$observePaymentMethods$1$invokeSuspend$$inlined$map$1$2$1.L$3 = null;
                        dKPreselectViewModel$observePaymentMethods$1$invokeSuspend$$inlined$map$1$2$1.L$4 = null;
                        dKPreselectViewModel$observePaymentMethods$1$invokeSuspend$$inlined$map$1$2$1.L$5 = null;
                        dKPreselectViewModel$observePaymentMethods$1$invokeSuspend$$inlined$map$1$2$1.L$6 = null;
                        dKPreselectViewModel$observePaymentMethods$1$invokeSuspend$$inlined$map$1$2$1.L$7 = null;
                        dKPreselectViewModel$observePaymentMethods$1$invokeSuspend$$inlined$map$1$2$1.L$8 = null;
                        dKPreselectViewModel$observePaymentMethods$1$invokeSuspend$$inlined$map$1$2$1.I$0 = i2;
                        dKPreselectViewModel$observePaymentMethods$1$invokeSuspend$$inlined$map$1$2$1.label = 3;
                    }
                    return coroutineSingletons;
                }
                if (i == 1) {
                    i4 = dKPreselectViewModel$observePaymentMethods$1$invokeSuspend$$inlined$map$1$2$1.I$1;
                    i5 = dKPreselectViewModel$observePaymentMethods$1$invokeSuspend$$inlined$map$1$2$1.I$0;
                    ref$ObjectRef = (Ref$ObjectRef) dKPreselectViewModel$observePaymentMethods$1$invokeSuspend$$inlined$map$1$2$1.L$7;
                    otfVar = (otf) dKPreselectViewModel$observePaymentMethods$1$invokeSuspend$$inlined$map$1$2$1.L$6;
                    vprVar = (vpr) dKPreselectViewModel$observePaymentMethods$1$invokeSuspend$$inlined$map$1$2$1.L$4;
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
                    i2 = dKPreselectViewModel$observePaymentMethods$1$invokeSuspend$$inlined$map$1$2$1.I$0;
                    otfVar2 = (otf) dKPreselectViewModel$observePaymentMethods$1$invokeSuspend$$inlined$map$1$2$1.L$6;
                    vprVar2 = (vpr) dKPreselectViewModel$observePaymentMethods$1$invokeSuspend$$inlined$map$1$2$1.L$4;
                    kotlin.b.b(obj2);
                    ptf ptfVar2 = new ptf((dtf) obj2, otfVar2);
                    dKPreselectViewModel$observePaymentMethods$1$invokeSuspend$$inlined$map$1$2$1.L$0 = null;
                    dKPreselectViewModel$observePaymentMethods$1$invokeSuspend$$inlined$map$1$2$1.L$1 = null;
                    dKPreselectViewModel$observePaymentMethods$1$invokeSuspend$$inlined$map$1$2$1.L$2 = null;
                    dKPreselectViewModel$observePaymentMethods$1$invokeSuspend$$inlined$map$1$2$1.L$3 = null;
                    dKPreselectViewModel$observePaymentMethods$1$invokeSuspend$$inlined$map$1$2$1.L$4 = null;
                    dKPreselectViewModel$observePaymentMethods$1$invokeSuspend$$inlined$map$1$2$1.L$5 = null;
                    dKPreselectViewModel$observePaymentMethods$1$invokeSuspend$$inlined$map$1$2$1.L$6 = null;
                    dKPreselectViewModel$observePaymentMethods$1$invokeSuspend$$inlined$map$1$2$1.L$7 = null;
                    dKPreselectViewModel$observePaymentMethods$1$invokeSuspend$$inlined$map$1$2$1.L$8 = null;
                    dKPreselectViewModel$observePaymentMethods$1$invokeSuspend$$inlined$map$1$2$1.I$0 = i2;
                    dKPreselectViewModel$observePaymentMethods$1$invokeSuspend$$inlined$map$1$2$1.label = 3;
                }
                result = (Result) obj2;
                if (result != null) {
                    Object value = result.getValue();
                    if (!(value instanceof Result.Failure)) {
                        ref$ObjectRef.element = (kq4) value;
                    }
                }
                i3 = i4;
                i2 = i5;
                otfVar2 = otfVar;
                List list32 = otfVar2.a;
                abe abeVar2 = fVar.w;
                kcq0 kcq0Var42 = fVar.A;
                int q2 = n891.q(kcq0Var42 != null ? kcq0Var42.c() : null);
                boolean z22 = otfVar2.b;
                String str2 = fVar.M;
                Object obj42 = ref$ObjectRef.element;
                Object obj52 = obj42;
                if (!fVar.y) {
                }
                dtf c2 = ftf.c(list32, abeVar2, q2, z22, str2, null, (kq4) obj52, fVar.B, null, fVar.c, fVar.N, 128);
                dKPreselectViewModel$observePaymentMethods$1$invokeSuspend$$inlined$map$1$2$1.L$0 = null;
                dKPreselectViewModel$observePaymentMethods$1$invokeSuspend$$inlined$map$1$2$1.L$1 = null;
                dKPreselectViewModel$observePaymentMethods$1$invokeSuspend$$inlined$map$1$2$1.L$2 = null;
                dKPreselectViewModel$observePaymentMethods$1$invokeSuspend$$inlined$map$1$2$1.L$3 = null;
                dKPreselectViewModel$observePaymentMethods$1$invokeSuspend$$inlined$map$1$2$1.L$4 = vprVar;
                dKPreselectViewModel$observePaymentMethods$1$invokeSuspend$$inlined$map$1$2$1.L$5 = null;
                dKPreselectViewModel$observePaymentMethods$1$invokeSuspend$$inlined$map$1$2$1.L$6 = otfVar2;
                dKPreselectViewModel$observePaymentMethods$1$invokeSuspend$$inlined$map$1$2$1.L$7 = null;
                dKPreselectViewModel$observePaymentMethods$1$invokeSuspend$$inlined$map$1$2$1.L$8 = null;
                dKPreselectViewModel$observePaymentMethods$1$invokeSuspend$$inlined$map$1$2$1.I$0 = i2;
                dKPreselectViewModel$observePaymentMethods$1$invokeSuspend$$inlined$map$1$2$1.I$1 = i3;
                dKPreselectViewModel$observePaymentMethods$1$invokeSuspend$$inlined$map$1$2$1.label = 2;
                kol0 kol0Var2 = new kol0(dvw.b(dKPreselectViewModel$observePaymentMethods$1$invokeSuspend$$inlined$map$1$2$1));
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
        dKPreselectViewModel$observePaymentMethods$1$invokeSuspend$$inlined$map$1$2$1 = new DKPreselectViewModel$observePaymentMethods$1$invokeSuspend$$inlined$map$1$2$1(this, continuation);
        obj2 = dKPreselectViewModel$observePaymentMethods$1$invokeSuspend$$inlined$map$1$2$1.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = dKPreselectViewModel$observePaymentMethods$1$invokeSuspend$$inlined$map$1$2$1.label;
        fVar = this.b;
        if (i != 0) {
        }
        result = (Result) obj2;
        if (result != null) {
        }
        i3 = i4;
        i2 = i5;
        otfVar2 = otfVar;
        List list322 = otfVar2.a;
        abe abeVar22 = fVar.w;
        kcq0 kcq0Var422 = fVar.A;
        int q22 = n891.q(kcq0Var422 != null ? kcq0Var422.c() : null);
        boolean z222 = otfVar2.b;
        String str22 = fVar.M;
        Object obj422 = ref$ObjectRef.element;
        Object obj522 = obj422;
        if (!fVar.y) {
        }
        dtf c22 = ftf.c(list322, abeVar22, q22, z222, str22, null, (kq4) obj522, fVar.B, null, fVar.c, fVar.N, 128);
        dKPreselectViewModel$observePaymentMethods$1$invokeSuspend$$inlined$map$1$2$1.L$0 = null;
        dKPreselectViewModel$observePaymentMethods$1$invokeSuspend$$inlined$map$1$2$1.L$1 = null;
        dKPreselectViewModel$observePaymentMethods$1$invokeSuspend$$inlined$map$1$2$1.L$2 = null;
        dKPreselectViewModel$observePaymentMethods$1$invokeSuspend$$inlined$map$1$2$1.L$3 = null;
        dKPreselectViewModel$observePaymentMethods$1$invokeSuspend$$inlined$map$1$2$1.L$4 = vprVar;
        dKPreselectViewModel$observePaymentMethods$1$invokeSuspend$$inlined$map$1$2$1.L$5 = null;
        dKPreselectViewModel$observePaymentMethods$1$invokeSuspend$$inlined$map$1$2$1.L$6 = otfVar2;
        dKPreselectViewModel$observePaymentMethods$1$invokeSuspend$$inlined$map$1$2$1.L$7 = null;
        dKPreselectViewModel$observePaymentMethods$1$invokeSuspend$$inlined$map$1$2$1.L$8 = null;
        dKPreselectViewModel$observePaymentMethods$1$invokeSuspend$$inlined$map$1$2$1.I$0 = i2;
        dKPreselectViewModel$observePaymentMethods$1$invokeSuspend$$inlined$map$1$2$1.I$1 = i3;
        dKPreselectViewModel$observePaymentMethods$1$invokeSuspend$$inlined$map$1$2$1.label = 2;
        kol0 kol0Var22 = new kol0(dvw.b(dKPreselectViewModel$observePaymentMethods$1$invokeSuspend$$inlined$map$1$2$1));
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
