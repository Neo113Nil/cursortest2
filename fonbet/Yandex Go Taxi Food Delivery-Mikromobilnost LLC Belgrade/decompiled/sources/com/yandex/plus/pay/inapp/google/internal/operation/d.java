package com.yandex.plus.pay.inapp.google.internal.operation;

import defpackage.aye0;
import defpackage.cma1;
import defpackage.es5;
import defpackage.fcd0;
import defpackage.fs5;
import defpackage.fyc;
import defpackage.ga0;
import defpackage.gcd0;
import defpackage.gwk0;
import defpackage.ny61;
import defpackage.tcc;
import defpackage.v5c0;
import defpackage.v7f0;
import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes2.dex */
public final class d implements fcd0 {
    public final List a;
    public final String b;
    public final String c;

    public d(List list, String str) {
        this.a = list;
        this.b = str;
        this.c = "getProducts(" + list + Extension.FIX_SPACE + str + ')';
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.fcd0
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(es5 es5Var, ContinuationImpl continuationImpl) {
        GetProductsOperation$execute$1 getProductsOperation$execute$1;
        int i;
        if (continuationImpl instanceof GetProductsOperation$execute$1) {
            getProductsOperation$execute$1 = (GetProductsOperation$execute$1) continuationImpl;
            int i2 = getProductsOperation$execute$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                getProductsOperation$execute$1.label = i2 - Integer.MIN_VALUE;
                Object obj = getProductsOperation$execute$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = getProductsOperation$execute$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    aye0 aye0Var = new aye0(7);
                    List<String> list = this.a;
                    ArrayList arrayList = new ArrayList(tcc.n(list, 10));
                    for (String str : list) {
                        ga0 ga0Var = new ga0();
                        ga0Var.a = str;
                        ga0Var.b = this.b;
                        arrayList.add(ga0Var.a());
                    }
                    aye0Var.m(arrayList);
                    v5c0 g = aye0Var.g();
                    getProductsOperation$execute$1.L$0 = null;
                    getProductsOperation$execute$1.label = 1;
                    fyc b = gwk0.b();
                    es5Var.g(g, new fs5(b));
                    obj = b.s(getProductsOperation$execute$1);
                    CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
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
                v7f0 v7f0Var = (v7f0) obj;
                return new gcd0(v7f0Var.b, cma1.C0(v7f0Var.a));
            }
        }
        getProductsOperation$execute$1 = new GetProductsOperation$execute$1(this, continuationImpl);
        Object obj2 = getProductsOperation$execute$1.result;
        CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = getProductsOperation$execute$1.label;
        if (i != 0) {
        }
        v7f0 v7f0Var2 = (v7f0) obj2;
        return new gcd0(v7f0Var2.b, cma1.C0(v7f0Var2.a));
    }

    @Override // defpackage.fcd0
    public final String getName() {
        return this.c;
    }
}
