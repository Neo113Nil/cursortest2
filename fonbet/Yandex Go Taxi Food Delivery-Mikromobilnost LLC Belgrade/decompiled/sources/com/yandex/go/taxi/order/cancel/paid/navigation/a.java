package com.yandex.go.taxi.order.cancel.paid.navigation;

import android.content.Intent;
import com.yandex.go.taxi.order.models.api.TaxiOrder;
import defpackage.hxx;
import defpackage.m5u;
import defpackage.m950;
import defpackage.mdh;
import defpackage.n5u;
import defpackage.ny61;
import defpackage.oep0;
import defpackage.p2y0;
import defpackage.pep0;
import defpackage.sjh;
import defpackage.tje;
import defpackage.tt2;
import defpackage.uyj;
import defpackage.x7w;
import defpackage.yvf0;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes8.dex */
public final class a implements x7w {
    public final tt2 a;
    public final yvf0 b;
    public final p2y0 c;

    public a(tt2 tt2Var, yvf0 yvf0Var, p2y0 p2y0Var) {
        this.a = tt2Var;
        this.b = yvf0Var;
        this.c = p2y0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // defpackage.x7w
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(oep0 oep0Var, Intent intent, Continuation continuation) {
        PaidCancelIntentHandler$processIntent$1 paidCancelIntentHandler$processIntent$1;
        int i;
        TaxiOrder taxiOrder;
        if (continuation instanceof PaidCancelIntentHandler$processIntent$1) {
            paidCancelIntentHandler$processIntent$1 = (PaidCancelIntentHandler$processIntent$1) continuation;
            int i2 = paidCancelIntentHandler$processIntent$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                paidCancelIntentHandler$processIntent$1.label = i2 - Integer.MIN_VALUE;
                Object obj = paidCancelIntentHandler$processIntent$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = paidCancelIntentHandler$processIntent$1.label;
                if (i != 0) {
                    b.b(obj);
                    if (!intent.hasExtra("ru.yandex.taxi.activity.MainActivity.CANCELLED_BY_PAID_ORDER")) {
                        return n5u.a;
                    }
                    String stringExtra = intent.getStringExtra("ru.yandex.taxi.activity.MainActivity.CANCELLED_BY_PAID_ORDER");
                    this.a.getClass();
                    sjh sjhVar = uyj.a;
                    mdh mdhVar = mdh.b;
                    PaidCancelIntentHandler$processIntent$cancelledOrder$1 paidCancelIntentHandler$processIntent$cancelledOrder$1 = new PaidCancelIntentHandler$processIntent$cancelledOrder$1(this, stringExtra, null);
                    paidCancelIntentHandler$processIntent$1.L$0 = oep0Var;
                    paidCancelIntentHandler$processIntent$1.L$1 = null;
                    paidCancelIntentHandler$processIntent$1.L$2 = null;
                    paidCancelIntentHandler$processIntent$1.label = 1;
                    obj = tje.k0(mdhVar, paidCancelIntentHandler$processIntent$cancelledOrder$1, paidCancelIntentHandler$processIntent$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    oep0Var = (oep0) paidCancelIntentHandler$processIntent$1.L$0;
                    b.b(obj);
                }
                taxiOrder = (TaxiOrder) obj;
                if (taxiOrder != null) {
                    ((pep0) oep0Var).f((m950) this.b.get(), taxiOrder, hxx.a);
                }
                return new m5u(true, false);
            }
        }
        paidCancelIntentHandler$processIntent$1 = new PaidCancelIntentHandler$processIntent$1(this, (ContinuationImpl) continuation);
        Object obj2 = paidCancelIntentHandler$processIntent$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = paidCancelIntentHandler$processIntent$1.label;
        if (i != 0) {
        }
        taxiOrder = (TaxiOrder) obj2;
        if (taxiOrder != null) {
        }
        return new m5u(true, false);
    }
}
