package com.yandex.go.scooters.passes.data.jason;

import com.yandex.go.scooters.passes.domain.g;
import defpackage.bb1;
import defpackage.d6x;
import defpackage.deo0;
import defpackage.hfa0;
import defpackage.iin0;
import defpackage.j5x;
import defpackage.jl40;
import defpackage.jx81;
import defpackage.k6x;
import defpackage.m6a0;
import defpackage.ny61;
import defpackage.s7a0;
import defpackage.tje;
import defpackage.tpr;
import defpackage.uyj;
import defpackage.vam0;
import defpackage.vez0;
import defpackage.xeo0;
import java.io.Serializable;
import java.util.Map;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.e;
import ru.yandex.taxi.scooters.domain.r;

/* loaded from: classes13.dex */
public final class a {
    public final deo0 a;
    public final r b;
    public final com.yandex.go.scooters.payments.domain.a c;
    public final xeo0 d;
    public final g e;

    public a(deo0 deo0Var, r rVar, com.yandex.go.scooters.payments.domain.a aVar, xeo0 xeo0Var, g gVar) {
        this.a = deo0Var;
        this.b = rVar;
        this.c = aVar;
        this.d = xeo0Var;
        this.e = gVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(Map map, ContinuationImpl continuationImpl) {
        ScootersPassesJsonStateRepository$initState$1 scootersPassesJsonStateRepository$initState$1;
        Object obj;
        CoroutineSingletons coroutineSingletons;
        int i;
        tpr d;
        Map map2;
        a aVar;
        Map map3;
        k6x k6xVar;
        if (continuationImpl instanceof ScootersPassesJsonStateRepository$initState$1) {
            scootersPassesJsonStateRepository$initState$1 = (ScootersPassesJsonStateRepository$initState$1) continuationImpl;
            int i2 = scootersPassesJsonStateRepository$initState$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                scootersPassesJsonStateRepository$initState$1.label = i2 - Integer.MIN_VALUE;
                obj = scootersPassesJsonStateRepository$initState$1.result;
                coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = scootersPassesJsonStateRepository$initState$1.label;
                if (i != 0) {
                    b.b(obj);
                    d = this.c.d(null, true);
                    scootersPassesJsonStateRepository$initState$1.L$0 = map;
                    scootersPassesJsonStateRepository$initState$1.L$1 = this;
                    scootersPassesJsonStateRepository$initState$1.label = 1;
                    obj = e.y(d, scootersPassesJsonStateRepository$initState$1);
                    if (obj != coroutineSingletons) {
                        map2 = map;
                        aVar = this;
                    }
                    return coroutineSingletons;
                }
                if (i != 1) {
                    if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    map3 = (Map) scootersPassesJsonStateRepository$initState$1.L$0;
                    b.b(obj);
                    g gVar = this.e;
                    c(!gVar.a.c("superpass") || gVar.a.c("package"));
                    boolean z = this.b.b.a().h != null;
                    deo0 deo0Var = this.a;
                    k6xVar = deo0Var.a;
                    k6x k6xVar2 = deo0Var.a;
                    if (k6xVar.a()) {
                        d6x d2 = jason.statham.tools.a.d(k6xVar.b(), deo0.a("has_grace_period"), jx81.M(Boolean.valueOf(z)), deo0.b);
                        if (!d2.equals(k6xVar.b())) {
                            k6xVar.e(d2);
                        }
                    }
                    if (map3 != null) {
                        k6xVar2.d(new vam0(24, map3, deo0Var));
                    }
                    return k6xVar2;
                }
                aVar = (a) scootersPassesJsonStateRepository$initState$1.L$1;
                map2 = (Map) scootersPassesJsonStateRepository$initState$1.L$0;
                b.b(obj);
                scootersPassesJsonStateRepository$initState$1.L$0 = map2;
                scootersPassesJsonStateRepository$initState$1.L$1 = null;
                scootersPassesJsonStateRepository$initState$1.label = 2;
                if (aVar.b((hfa0) obj, scootersPassesJsonStateRepository$initState$1) != coroutineSingletons) {
                    map3 = map2;
                    g gVar2 = this.e;
                    c(!gVar2.a.c("superpass") || gVar2.a.c("package"));
                    if (this.b.b.a().h != null) {
                    }
                    deo0 deo0Var2 = this.a;
                    k6xVar = deo0Var2.a;
                    k6x k6xVar22 = deo0Var2.a;
                    if (k6xVar.a()) {
                    }
                    if (map3 != null) {
                    }
                    return k6xVar22;
                }
                return coroutineSingletons;
            }
        }
        scootersPassesJsonStateRepository$initState$1 = new ScootersPassesJsonStateRepository$initState$1(this, continuationImpl);
        obj = scootersPassesJsonStateRepository$initState$1.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersPassesJsonStateRepository$initState$1.label;
        if (i != 0) {
        }
        scootersPassesJsonStateRepository$initState$1.L$0 = map2;
        scootersPassesJsonStateRepository$initState$1.L$1 = null;
        scootersPassesJsonStateRepository$initState$1.label = 2;
        if (aVar.b((hfa0) obj, scootersPassesJsonStateRepository$initState$1) != coroutineSingletons) {
        }
        return coroutineSingletons;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(hfa0 hfa0Var, ContinuationImpl continuationImpl) {
        ScootersPassesJsonStateRepository$updatePaymentMethod$1 scootersPassesJsonStateRepository$updatePaymentMethod$1;
        int i;
        deo0 deo0Var;
        if (continuationImpl instanceof ScootersPassesJsonStateRepository$updatePaymentMethod$1) {
            scootersPassesJsonStateRepository$updatePaymentMethod$1 = (ScootersPassesJsonStateRepository$updatePaymentMethod$1) continuationImpl;
            int i2 = scootersPassesJsonStateRepository$updatePaymentMethod$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                scootersPassesJsonStateRepository$updatePaymentMethod$1.label = i2 - Integer.MIN_VALUE;
                Object obj = scootersPassesJsonStateRepository$updatePaymentMethod$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = scootersPassesJsonStateRepository$updatePaymentMethod$1.label;
                if (i != 0) {
                    b.b(obj);
                    deo0 deo0Var2 = this.a;
                    d6x d6xVar = deo0Var2.a.b;
                    j5x J = bb1.J(d6xVar, deo0.a("payment_method_state", "id"));
                    Serializable t = J != null ? vez0.t(J) : null;
                    String str = t instanceof String ? (String) t : null;
                    j5x J2 = bb1.J(d6xVar, deo0.a("payment_method_state", "icon_base_64"));
                    Serializable t2 = J2 != null ? vez0.t(J2) : null;
                    String str2 = t2 instanceof String ? (String) t2 : null;
                    s7a0 s7a0Var = (str == null || str2 == null) ? null : new s7a0(str, str2);
                    String str3 = s7a0Var != null ? s7a0Var.a : null;
                    m6a0 d = hfa0Var.d();
                    if (jl40.l(d != null ? d.b : null, str3)) {
                        return Boolean.FALSE;
                    }
                    scootersPassesJsonStateRepository$updatePaymentMethod$1.L$0 = null;
                    scootersPassesJsonStateRepository$updatePaymentMethod$1.L$1 = null;
                    scootersPassesJsonStateRepository$updatePaymentMethod$1.L$2 = null;
                    scootersPassesJsonStateRepository$updatePaymentMethod$1.L$3 = deo0Var2;
                    scootersPassesJsonStateRepository$updatePaymentMethod$1.label = 1;
                    xeo0 xeo0Var = this.d;
                    xeo0Var.b.getClass();
                    Object k0 = tje.k0(uyj.a, new ScootersPassesPaymentMethodStateFactory$create$2(hfa0Var, xeo0Var, null), scootersPassesJsonStateRepository$updatePaymentMethod$1);
                    if (k0 == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    obj = k0;
                    deo0Var = deo0Var2;
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    deo0Var = (deo0) scootersPassesJsonStateRepository$updatePaymentMethod$1.L$3;
                    b.b(obj);
                }
                deo0Var.a.d(new iin0(deo0Var, (s7a0) obj));
                return Boolean.TRUE;
            }
        }
        scootersPassesJsonStateRepository$updatePaymentMethod$1 = new ScootersPassesJsonStateRepository$updatePaymentMethod$1(this, continuationImpl);
        Object obj2 = scootersPassesJsonStateRepository$updatePaymentMethod$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersPassesJsonStateRepository$updatePaymentMethod$1.label;
        if (i != 0) {
        }
        deo0Var.a.d(new iin0(deo0Var, (s7a0) obj2));
        return Boolean.TRUE;
    }

    public final void c(boolean z) {
        k6x k6xVar = this.a.a;
        if (k6xVar.a()) {
            d6x d = jason.statham.tools.a.d(k6xVar.b(), deo0.a("is_purchase_in_progress"), jx81.M(Boolean.valueOf(z)), deo0.b);
            if (d.equals(k6xVar.b())) {
                return;
            }
            k6xVar.e(d);
        }
    }

    public final void d(boolean z) {
        k6x k6xVar = this.a.a;
        if (k6xVar.a()) {
            d6x d = jason.statham.tools.a.d(k6xVar.b(), deo0.a("is_unfreeze_in_progress"), jx81.M(Boolean.valueOf(z)), deo0.b);
            if (d.equals(k6xVar.b())) {
                return;
            }
            k6xVar.e(d);
        }
    }
}
