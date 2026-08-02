package com.yandex.plus.pay.inapp.google.internal.operation;

import defpackage.bg1;
import defpackage.cma1;
import defpackage.es5;
import defpackage.fcd0;
import defpackage.fs5;
import defpackage.fyc;
import defpackage.gcd0;
import defpackage.gwk0;
import defpackage.k0g0;
import defpackage.mf1;
import defpackage.ny61;
import defpackage.unr0;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes2.dex */
public final class e implements fcd0 {
    public final String a;
    public final String b;

    public e(String str) {
        this.a = str;
        this.b = unr0.l(')', "getPurchases(", str);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.fcd0
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(es5 es5Var, ContinuationImpl continuationImpl) {
        GetPurchasesOperation$execute$1 getPurchasesOperation$execute$1;
        int i;
        if (continuationImpl instanceof GetPurchasesOperation$execute$1) {
            getPurchasesOperation$execute$1 = (GetPurchasesOperation$execute$1) continuationImpl;
            int i2 = getPurchasesOperation$execute$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                getPurchasesOperation$execute$1.label = i2 - Integer.MIN_VALUE;
                Object obj = getPurchasesOperation$execute$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = getPurchasesOperation$execute$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    bg1 bg1Var = new bg1();
                    bg1Var.b = this.a;
                    mf1 l = bg1Var.l();
                    getPurchasesOperation$execute$1.L$0 = null;
                    getPurchasesOperation$execute$1.label = 1;
                    fyc b = gwk0.b();
                    es5Var.i(l, new fs5(b));
                    obj = b.s(getPurchasesOperation$execute$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                k0g0 k0g0Var = (k0g0) obj;
                return new gcd0(k0g0Var.b, cma1.C0(k0g0Var.a));
            }
        }
        getPurchasesOperation$execute$1 = new GetPurchasesOperation$execute$1(this, continuationImpl);
        Object obj2 = getPurchasesOperation$execute$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = getPurchasesOperation$execute$1.label;
        if (i != 0) {
        }
        k0g0 k0g0Var2 = (k0g0) obj2;
        return new gcd0(k0g0Var2.b, cma1.C0(k0g0Var2.a));
    }

    @Override // defpackage.fcd0
    public final String getName() {
        return this.b;
    }
}
