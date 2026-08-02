package com.yandex.go.taxi.order.cancel.by_driver.domain;

import com.yandex.go.taxi.order.models.api.TaxiOrder;
import com.yandex.go.taxi.order.models.api.preorder.Preorder;
import defpackage.b5y0;
import defpackage.hh5;
import defpackage.jl40;
import defpackage.m950;
import defpackage.n20;
import defpackage.ny61;
import defpackage.o2y0;
import defpackage.pu7;
import defpackage.qu;
import defpackage.qu7;
import defpackage.ru7;
import defpackage.su7;
import defpackage.tu7;
import defpackage.uu7;
import defpackage.w511;
import defpackage.wk6;
import defpackage.zy11;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes14.dex */
public final class a {
    public final com.yandex.go.taxi.order.provider.a a;
    public final hh5 b;
    public final n20 c;

    public a(com.yandex.go.taxi.order.provider.a aVar, hh5 hh5Var, n20 n20Var) {
        this.a = aVar;
        this.b = hh5Var;
        this.c = n20Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:60:0x005f, code lost:
    
        if (r10 == r2) goto L35;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(uu7 uu7Var, o2y0 o2y0Var, ContinuationImpl continuationImpl) {
        CancelByDriverActionHandler$handleAction$1 cancelByDriverActionHandler$handleAction$1;
        CoroutineSingletons coroutineSingletons;
        int i;
        boolean l;
        boolean z;
        o2y0 o2y0Var2;
        TaxiOrder b;
        hh5 hh5Var = this.b;
        if (continuationImpl instanceof CancelByDriverActionHandler$handleAction$1) {
            cancelByDriverActionHandler$handleAction$1 = (CancelByDriverActionHandler$handleAction$1) continuationImpl;
            int i2 = cancelByDriverActionHandler$handleAction$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                cancelByDriverActionHandler$handleAction$1.label = i2 - Integer.MIN_VALUE;
                Object obj = cancelByDriverActionHandler$handleAction$1.result;
                coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = cancelByDriverActionHandler$handleAction$1.label;
                Preorder preorder = null;
                if (i != 0) {
                    kotlin.b.b(obj);
                    n20 n20Var = this.c;
                    cancelByDriverActionHandler$handleAction$1.L$0 = uu7Var;
                    cancelByDriverActionHandler$handleAction$1.L$1 = o2y0Var;
                    cancelByDriverActionHandler$handleAction$1.label = 1;
                    obj = ((com.yandex.go.taxi.order.provider.a) n20Var).t(cancelByDriverActionHandler$handleAction$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        z = cancelByDriverActionHandler$handleAction$1.Z$0;
                        uu7Var = (uu7) cancelByDriverActionHandler$handleAction$1.L$0;
                        kotlin.b.b(obj);
                        int i3 = 19;
                        if (!jl40.l(uu7Var, ru7.a)) {
                            ((qu7) hh5Var.b).r(new wk6(i3));
                        } else if (jl40.l(uu7Var, su7.a)) {
                            qu7 qu7Var = (qu7) hh5Var.b;
                            if (z) {
                                qu7Var.r(new wk6(i3));
                            } else {
                                qu7Var.r(new qu(9));
                            }
                        } else {
                            if (!jl40.l(uu7Var, tu7.a)) {
                                w511.b();
                                return null;
                            }
                            qu7 qu7Var2 = (qu7) hh5Var.b;
                            pu7 pu7Var = (pu7) qu7Var2.x;
                            if (pu7Var != null && (o2y0Var2 = pu7Var.a) != null && (b = o2y0Var2.b()) != null) {
                                preorder = b.W();
                            }
                            if (preorder == null) {
                                ((qu7) hh5Var.b).r(new wk6(i3));
                            } else {
                                qu7Var2.I.b((m950) qu7Var2.J.get(), new b5y0("recreate order", preorder));
                            }
                        }
                        return zy11.a;
                    }
                    o2y0Var = (o2y0) cancelByDriverActionHandler$handleAction$1.L$1;
                    uu7Var = (uu7) cancelByDriverActionHandler$handleAction$1.L$0;
                    kotlin.b.b(obj);
                }
                o2y0 o2y0Var3 = (o2y0) obj;
                l = jl40.l(o2y0Var3 == null ? o2y0Var3.b().a : null, o2y0Var.b().a);
                if (!l) {
                    TaxiOrder b2 = o2y0Var.b();
                    synchronized (b2) {
                        b2.l = b2.l.C();
                    }
                }
                cancelByDriverActionHandler$handleAction$1.L$0 = uu7Var;
                cancelByDriverActionHandler$handleAction$1.L$1 = null;
                cancelByDriverActionHandler$handleAction$1.L$2 = null;
                cancelByDriverActionHandler$handleAction$1.Z$0 = l;
                cancelByDriverActionHandler$handleAction$1.label = 2;
                if (this.a.i(o2y0Var, false, false, cancelByDriverActionHandler$handleAction$1) != coroutineSingletons) {
                    z = l;
                    int i32 = 19;
                    if (!jl40.l(uu7Var, ru7.a)) {
                    }
                    return zy11.a;
                }
                return coroutineSingletons;
            }
        }
        cancelByDriverActionHandler$handleAction$1 = new CancelByDriverActionHandler$handleAction$1(this, continuationImpl);
        Object obj2 = cancelByDriverActionHandler$handleAction$1.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = cancelByDriverActionHandler$handleAction$1.label;
        Preorder preorder2 = null;
        if (i != 0) {
        }
        o2y0 o2y0Var32 = (o2y0) obj2;
        l = jl40.l(o2y0Var32 == null ? o2y0Var32.b().a : null, o2y0Var.b().a);
        if (!l) {
        }
        cancelByDriverActionHandler$handleAction$1.L$0 = uu7Var;
        cancelByDriverActionHandler$handleAction$1.L$1 = null;
        cancelByDriverActionHandler$handleAction$1.L$2 = null;
        cancelByDriverActionHandler$handleAction$1.Z$0 = l;
        cancelByDriverActionHandler$handleAction$1.label = 2;
        if (this.a.i(o2y0Var, false, false, cancelByDriverActionHandler$handleAction$1) != coroutineSingletons) {
        }
        return coroutineSingletons;
    }
}
