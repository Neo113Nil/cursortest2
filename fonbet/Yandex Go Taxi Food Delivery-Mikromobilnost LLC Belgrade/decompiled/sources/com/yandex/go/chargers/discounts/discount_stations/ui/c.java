package com.yandex.go.chargers.discounts.discount_stations.ui;

import defpackage.at9;
import defpackage.bt9;
import defpackage.cy9;
import defpackage.ir9;
import defpackage.jl40;
import defpackage.ks9;
import defpackage.ly9;
import defpackage.m950;
import defpackage.ms9;
import defpackage.ns9;
import defpackage.ny61;
import defpackage.os9;
import defpackage.ps9;
import defpackage.qs9;
import defpackage.qu;
import defpackage.rs9;
import defpackage.ss9;
import defpackage.txf;
import defpackage.w511;
import defpackage.xs9;
import defpackage.ys9;
import defpackage.zs9;
import defpackage.zy11;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes12.dex */
public final class c {
    public final com.yandex.go.chargers.discounts.discount_stations.data.b a;
    public final com.yandex.go.chargers.discounts.discount_stations.data.a b;

    public c(com.yandex.go.chargers.discounts.discount_stations.data.b bVar, com.yandex.go.chargers.discounts.discount_stations.data.a aVar) {
        this.a = bVar;
        this.b = aVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:55:0x00d9, code lost:
    
        if (r15 == r1) goto L47;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ir9 ir9Var, bt9 bt9Var, rs9 rs9Var, ContinuationImpl continuationImpl) {
        ChargersDiscountStationsUiActionInteractor$handleAction$1 chargersDiscountStationsUiActionInteractor$handleAction$1;
        int i;
        Object value;
        ks9 ks9Var;
        os9 os9Var;
        Object value2;
        if (continuationImpl instanceof ChargersDiscountStationsUiActionInteractor$handleAction$1) {
            chargersDiscountStationsUiActionInteractor$handleAction$1 = (ChargersDiscountStationsUiActionInteractor$handleAction$1) continuationImpl;
            int i2 = chargersDiscountStationsUiActionInteractor$handleAction$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                chargersDiscountStationsUiActionInteractor$handleAction$1.label = i2 - Integer.MIN_VALUE;
                Object obj = chargersDiscountStationsUiActionInteractor$handleAction$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = chargersDiscountStationsUiActionInteractor$handleAction$1.label;
                int i3 = 0;
                zy11 zy11Var = zy11.a;
                com.yandex.go.chargers.discounts.discount_stations.data.a aVar = this.b;
                if (i != 0) {
                    kotlin.b.b(obj);
                    if (bt9Var instanceof xs9) {
                        rs9Var.a.r(new ps9(((xs9) bt9Var).a, i3));
                        return zy11Var;
                    }
                    if (bt9Var instanceof at9) {
                        cy9 cy9Var = ((at9) bt9Var).a;
                        ss9 ss9Var = rs9Var.a;
                        ss9Var.A((m950) ((txf) ss9Var.I).get(), new ly9(cy9Var), new qs9(ss9Var, i3));
                        return zy11Var;
                    }
                    if (jl40.l(bt9Var, ys9.a)) {
                        rs9Var.a.r(new qu(9));
                        return zy11Var;
                    }
                    if (!(bt9Var instanceof zs9)) {
                        w511.b();
                        return null;
                    }
                    r0 r0Var = aVar.b;
                    boolean z = false;
                    do {
                        value = r0Var.getValue();
                        ks9Var = (ks9) value;
                        if (!ks9Var.c) {
                            ks9Var = ks9.a(ks9Var, true, 11);
                            z = true;
                        }
                    } while (!r0Var.k(value, ks9Var));
                    if (z) {
                        int i4 = ((zs9) bt9Var).a;
                        chargersDiscountStationsUiActionInteractor$handleAction$1.L$0 = null;
                        chargersDiscountStationsUiActionInteractor$handleAction$1.L$1 = null;
                        chargersDiscountStationsUiActionInteractor$handleAction$1.L$2 = null;
                        chargersDiscountStationsUiActionInteractor$handleAction$1.label = 1;
                        obj = this.a.b(ir9Var, i4, chargersDiscountStationsUiActionInteractor$handleAction$1);
                    }
                    return zy11Var;
                }
                if (i != 1) {
                    if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                    return obj;
                }
                kotlin.b.b(obj);
                os9Var = (os9) obj;
                if (os9Var instanceof ns9) {
                    if (!(os9Var instanceof ms9)) {
                        w511.b();
                        return null;
                    }
                    r0 r0Var2 = aVar.b;
                    do {
                        value2 = r0Var2.getValue();
                    } while (!r0Var2.k(value2, ks9.a((ks9) value2, false, 3)));
                    return zy11Var;
                }
                chargersDiscountStationsUiActionInteractor$handleAction$1.L$0 = null;
                chargersDiscountStationsUiActionInteractor$handleAction$1.L$1 = null;
                chargersDiscountStationsUiActionInteractor$handleAction$1.L$2 = null;
                chargersDiscountStationsUiActionInteractor$handleAction$1.L$3 = null;
                chargersDiscountStationsUiActionInteractor$handleAction$1.label = 2;
                Object b = aVar.b((ns9) os9Var, chargersDiscountStationsUiActionInteractor$handleAction$1);
                return b == coroutineSingletons ? coroutineSingletons : b;
            }
        }
        chargersDiscountStationsUiActionInteractor$handleAction$1 = new ChargersDiscountStationsUiActionInteractor$handleAction$1(this, continuationImpl);
        Object obj2 = chargersDiscountStationsUiActionInteractor$handleAction$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = chargersDiscountStationsUiActionInteractor$handleAction$1.label;
        int i32 = 0;
        zy11 zy11Var2 = zy11.a;
        com.yandex.go.chargers.discounts.discount_stations.data.a aVar2 = this.b;
        if (i != 0) {
        }
        os9Var = (os9) obj2;
        if (os9Var instanceof ns9) {
        }
    }
}
