package com.yandex.plus.pay.inapp.google.internal.operation;

import defpackage.cma1;
import defpackage.es5;
import defpackage.fcd0;
import defpackage.fs5;
import defpackage.fyc;
import defpackage.gcd0;
import defpackage.gwk0;
import defpackage.mf1;
import defpackage.ns5;
import defpackage.ny61;
import defpackage.unr0;
import defpackage.zy11;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes2.dex */
public final class b implements fcd0 {
    public final String a;
    public final String b;

    public b(String str) {
        this.a = str;
        this.b = unr0.l(')', "consume(", str);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.fcd0
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(es5 es5Var, ContinuationImpl continuationImpl) {
        ConsumePurchaseOperation$execute$1 consumePurchaseOperation$execute$1;
        int i;
        if (continuationImpl instanceof ConsumePurchaseOperation$execute$1) {
            consumePurchaseOperation$execute$1 = (ConsumePurchaseOperation$execute$1) continuationImpl;
            int i2 = consumePurchaseOperation$execute$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                consumePurchaseOperation$execute$1.label = i2 - Integer.MIN_VALUE;
                Object obj = consumePurchaseOperation$execute$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = consumePurchaseOperation$execute$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    String str = this.a;
                    if (str == null) {
                        ny61.g("Purchase token must be set");
                        return null;
                    }
                    mf1 mf1Var = new mf1(7);
                    mf1Var.b = str;
                    consumePurchaseOperation$execute$1.L$0 = null;
                    consumePurchaseOperation$execute$1.label = 1;
                    fyc b = gwk0.b();
                    es5Var.b(mf1Var, new fs5(b));
                    obj = b.s(consumePurchaseOperation$execute$1);
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
                return new gcd0(zy11.a, cma1.C0((ns5) obj));
            }
        }
        consumePurchaseOperation$execute$1 = new ConsumePurchaseOperation$execute$1(this, continuationImpl);
        Object obj2 = consumePurchaseOperation$execute$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = consumePurchaseOperation$execute$1.label;
        if (i != 0) {
        }
        return new gcd0(zy11.a, cma1.C0((ns5) obj2));
    }

    @Override // defpackage.fcd0
    public final String getName() {
        return this.b;
    }
}
