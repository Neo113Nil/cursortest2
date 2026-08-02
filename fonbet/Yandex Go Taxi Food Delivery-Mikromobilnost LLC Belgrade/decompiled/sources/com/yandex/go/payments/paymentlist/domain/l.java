package com.yandex.go.payments.paymentlist.domain;

import com.yandex.go.payments.api.composite.CompositePaymentState;
import defpackage.brh;
import defpackage.drd;
import defpackage.fl8;
import defpackage.h3y;
import defpackage.kv90;
import defpackage.lea0;
import defpackage.lv90;
import defpackage.m6a0;
import defpackage.mrd;
import defpackage.ny61;
import defpackage.ryz;
import defpackage.tpr;
import defpackage.u0k;
import defpackage.ycq0;
import defpackage.zba0;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.gopayments.model.PaymentMethod$Type;

/* loaded from: classes8.dex */
public final class l implements zba0 {
    public final tpr a;
    public final ycq0 b;
    public final ryz c;
    public final h3y d;
    public final h3y e;
    public final com.yandex.go.loyalty.impl.common.domain.a f;
    public final h3y g;

    public l(tpr tprVar, ycq0 ycq0Var, ryz ryzVar, h3y h3yVar, h3y h3yVar2, com.yandex.go.loyalty.impl.common.domain.a aVar, h3y h3yVar3) {
        this.a = tprVar;
        this.b = ycq0Var;
        this.c = ryzVar;
        this.d = h3yVar;
        this.e = h3yVar2;
        this.f = aVar;
        this.g = h3yVar3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x004a, code lost:
    
        if (h(true, r0) == r1) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @Override // defpackage.zba0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(lea0 lea0Var, Continuation continuation) {
        PaymentMethodsListSourceInteractorImpl$invalidatePaymentMethodsAfterDeletion$1 paymentMethodsListSourceInteractorImpl$invalidatePaymentMethodsAfterDeletion$1;
        int i;
        if (continuation instanceof PaymentMethodsListSourceInteractorImpl$invalidatePaymentMethodsAfterDeletion$1) {
            paymentMethodsListSourceInteractorImpl$invalidatePaymentMethodsAfterDeletion$1 = (PaymentMethodsListSourceInteractorImpl$invalidatePaymentMethodsAfterDeletion$1) continuation;
            int i2 = paymentMethodsListSourceInteractorImpl$invalidatePaymentMethodsAfterDeletion$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                paymentMethodsListSourceInteractorImpl$invalidatePaymentMethodsAfterDeletion$1.label = i2 - Integer.MIN_VALUE;
                Object obj = paymentMethodsListSourceInteractorImpl$invalidatePaymentMethodsAfterDeletion$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = paymentMethodsListSourceInteractorImpl$invalidatePaymentMethodsAfterDeletion$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    paymentMethodsListSourceInteractorImpl$invalidatePaymentMethodsAfterDeletion$1.L$0 = lea0Var;
                    paymentMethodsListSourceInteractorImpl$invalidatePaymentMethodsAfterDeletion$1.label = 1;
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj);
                        return obj;
                    }
                    lea0Var = (lea0) paymentMethodsListSourceInteractorImpl$invalidatePaymentMethodsAfterDeletion$1.L$0;
                    kotlin.b.b(obj);
                }
                if (lea0Var instanceof fl8) {
                    return zy11.a;
                }
                paymentMethodsListSourceInteractorImpl$invalidatePaymentMethodsAfterDeletion$1.L$0 = null;
                paymentMethodsListSourceInteractorImpl$invalidatePaymentMethodsAfterDeletion$1.label = 2;
                Object h = h(true, paymentMethodsListSourceInteractorImpl$invalidatePaymentMethodsAfterDeletion$1);
                return h == obj2 ? obj2 : h;
            }
        }
        paymentMethodsListSourceInteractorImpl$invalidatePaymentMethodsAfterDeletion$1 = new PaymentMethodsListSourceInteractorImpl$invalidatePaymentMethodsAfterDeletion$1(this, (ContinuationImpl) continuation);
        Object obj3 = paymentMethodsListSourceInteractorImpl$invalidatePaymentMethodsAfterDeletion$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = paymentMethodsListSourceInteractorImpl$invalidatePaymentMethodsAfterDeletion$1.label;
        if (i != 0) {
        }
        if (lea0Var instanceof fl8) {
        }
    }

    @Override // defpackage.zba0
    public final tpr b() {
        return this.a;
    }

    @Override // defpackage.zba0
    public final void c(String str, PaymentMethod$Type paymentMethod$Type) {
        this.c.a();
        lv90.Companion.getClass();
        this.b.b(kv90.b(str, paymentMethod$Type));
    }

    @Override // defpackage.zba0
    public final m6a0 d() {
        lea0 e = ((i) this.d.get()).e();
        m6a0 m6a0Var = null;
        if (e == null) {
            return null;
        }
        PaymentMethod$Type c = e.c();
        String id = e.getId();
        mrd mrdVar = (mrd) ((drd) this.e.get()).b.b.getValue();
        if (mrdVar.a == CompositePaymentState.ENABLED_CHECKED) {
            PaymentMethod$Type paymentMethod$Type = PaymentMethod$Type.PERSONAL_WALLET;
            lv90 lv90Var = mrdVar.d;
            m6a0Var = new m6a0(paymentMethod$Type, lv90Var != null ? lv90Var.b : null, null);
        }
        return new m6a0(c, id, m6a0Var);
    }

    @Override // defpackage.zba0
    public final boolean e(ArrayList arrayList) {
        brh brhVar = (brh) this.g.get();
        if (arrayList.isEmpty()) {
            return false;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (brhVar.a((u0k) it.next())) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.zba0
    public final void f() {
        ((com.yandex.go.payments.paymentlist.data.c) ((i) this.d.get()).j).e();
    }

    @Override // defpackage.zba0
    public final void g() {
        com.yandex.go.loyalty.impl.common.domain.a aVar = this.f;
        if (aVar.c.a() == null) {
            aVar.d.a.g(zy11.a);
        }
    }

    @Override // defpackage.zba0
    public final String getCurrency() {
        return ((i) this.d.get()).d();
    }

    @Override // defpackage.zba0
    public final Object h(boolean z, ContinuationImpl continuationImpl) {
        return ((com.yandex.go.payments.paymentlist.data.c) ((i) this.d.get()).j).q(continuationImpl);
    }

    @Override // defpackage.zba0
    public final boolean i() {
        return ((drd) this.e.get()).b.b();
    }
}
