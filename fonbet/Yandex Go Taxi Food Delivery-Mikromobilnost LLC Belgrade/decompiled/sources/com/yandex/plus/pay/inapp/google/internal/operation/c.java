package com.yandex.plus.pay.inapp.google.internal.operation;

import defpackage.cma1;
import defpackage.es5;
import defpackage.fcd0;
import defpackage.gcd0;
import defpackage.gly0;
import defpackage.js5;
import defpackage.ny61;
import defpackage.twa1;
import defpackage.x6b1;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes8.dex */
public final class c implements fcd0 {
    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.fcd0
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(es5 es5Var, ContinuationImpl continuationImpl) {
        GetConfigOperation$execute$1 getConfigOperation$execute$1;
        int i;
        if (continuationImpl instanceof GetConfigOperation$execute$1) {
            getConfigOperation$execute$1 = (GetConfigOperation$execute$1) continuationImpl;
            int i2 = getConfigOperation$execute$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                getConfigOperation$execute$1.label = i2 - Integer.MIN_VALUE;
                Object obj = getConfigOperation$execute$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = getConfigOperation$execute$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    gly0 g = twa1.g();
                    getConfigOperation$execute$1.L$0 = null;
                    getConfigOperation$execute$1.label = 1;
                    obj = x6b1.e(es5Var, g, getConfigOperation$execute$1);
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
                js5 js5Var = (js5) obj;
                return new gcd0(js5Var.a(), cma1.C0(js5Var.b()));
            }
        }
        getConfigOperation$execute$1 = new GetConfigOperation$execute$1(this, continuationImpl);
        Object obj2 = getConfigOperation$execute$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = getConfigOperation$execute$1.label;
        if (i != 0) {
        }
        js5 js5Var2 = (js5) obj2;
        return new gcd0(js5Var2.a(), cma1.C0(js5Var2.b()));
    }

    @Override // defpackage.fcd0
    public final String getName() {
        return "getConfig()";
    }
}
