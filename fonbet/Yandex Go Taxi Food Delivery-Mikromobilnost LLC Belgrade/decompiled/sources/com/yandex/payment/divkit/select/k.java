package com.yandex.payment.divkit.select;

import defpackage.a8a0;
import defpackage.cvf;
import defpackage.eeq0;
import defpackage.hyj0;
import defpackage.kyj0;
import defpackage.ny61;
import defpackage.qyj0;
import defpackage.uv90;
import defpackage.vpr;
import defpackage.w511;
import defpackage.wga0;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.flow.n0;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes2.dex */
public final class k implements vpr {
    public final /* synthetic */ n a;

    public k(n nVar) {
        this.a = nVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0071, code lost:
    
        if (r2.emit(r9, r0) == r1) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x009f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00a0 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    @Override // defpackage.vpr
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(qyj0 qyj0Var, Continuation continuation) {
        DKSelectViewModelRefactor$loadPaymentDetails$1$1$emit$1 dKSelectViewModelRefactor$loadPaymentDetails$1$1$emit$1;
        int i;
        if (continuation instanceof DKSelectViewModelRefactor$loadPaymentDetails$1$1$emit$1) {
            dKSelectViewModelRefactor$loadPaymentDetails$1$1$emit$1 = (DKSelectViewModelRefactor$loadPaymentDetails$1$1$emit$1) continuation;
            int i2 = dKSelectViewModelRefactor$loadPaymentDetails$1$1$emit$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                dKSelectViewModelRefactor$loadPaymentDetails$1$1$emit$1.label = i2 - Integer.MIN_VALUE;
                Object obj = dKSelectViewModelRefactor$loadPaymentDetails$1$1$emit$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = dKSelectViewModelRefactor$loadPaymentDetails$1$1$emit$1.label;
                zy11 zy11Var = zy11.a;
                n nVar = this.a;
                if (i != 0) {
                    kotlin.b.b(obj);
                    if (qyj0Var instanceof hyj0) {
                        r0 r0Var = nVar.J;
                        eeq0 eeq0Var = new eeq0(((hyj0) qyj0Var).a);
                        r0Var.getClass();
                        r0Var.m(null, eeq0Var);
                        return zy11Var;
                    }
                    if (!(qyj0Var instanceof kyj0)) {
                        w511.b();
                        return null;
                    }
                    uv90 uv90Var = (uv90) ((kyj0) qyj0Var).a;
                    nVar.c0 = uv90Var;
                    n0 n0Var = nVar.U;
                    dKSelectViewModelRefactor$loadPaymentDetails$1$1$emit$1.L$0 = qyj0Var;
                    dKSelectViewModelRefactor$loadPaymentDetails$1$1$emit$1.label = 1;
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj);
                        return zy11Var;
                    }
                    qyj0Var = (qyj0) dKSelectViewModelRefactor$loadPaymentDetails$1$1$emit$1.L$0;
                    kotlin.b.b(obj);
                }
                n0 n0Var2 = nVar.W;
                kyj0 kyj0Var = (kyj0) qyj0Var;
                cvf cvfVar = new cvf(a8a0.a(((wga0) ((uv90) kyj0Var.a)).e()), ((wga0) ((uv90) kyj0Var.a)).g());
                dKSelectViewModelRefactor$loadPaymentDetails$1$1$emit$1.L$0 = null;
                dKSelectViewModelRefactor$loadPaymentDetails$1$1$emit$1.label = 2;
                return n0Var2.emit(cvfVar, dKSelectViewModelRefactor$loadPaymentDetails$1$1$emit$1) != coroutineSingletons ? coroutineSingletons : zy11Var;
            }
        }
        dKSelectViewModelRefactor$loadPaymentDetails$1$1$emit$1 = new DKSelectViewModelRefactor$loadPaymentDetails$1$1$emit$1(this, continuation);
        Object obj2 = dKSelectViewModelRefactor$loadPaymentDetails$1$1$emit$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = dKSelectViewModelRefactor$loadPaymentDetails$1$1$emit$1.label;
        zy11 zy11Var2 = zy11.a;
        n nVar2 = this.a;
        if (i != 0) {
        }
        n0 n0Var22 = nVar2.W;
        kyj0 kyj0Var2 = (kyj0) qyj0Var;
        cvf cvfVar2 = new cvf(a8a0.a(((wga0) ((uv90) kyj0Var2.a)).e()), ((wga0) ((uv90) kyj0Var2.a)).g());
        dKSelectViewModelRefactor$loadPaymentDetails$1$1$emit$1.L$0 = null;
        dKSelectViewModelRefactor$loadPaymentDetails$1$1$emit$1.label = 2;
        if (n0Var22.emit(cvfVar2, dKSelectViewModelRefactor$loadPaymentDetails$1$1$emit$1) != coroutineSingletons2) {
        }
    }
}
